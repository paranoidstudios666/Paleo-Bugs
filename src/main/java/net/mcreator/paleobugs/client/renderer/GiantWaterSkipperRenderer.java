
package net.mcreator.paleobugs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.paleobugs.procedures.Mega3Procedure;
import net.mcreator.paleobugs.procedures.Graskop3Procedure;
import net.mcreator.paleobugs.entity.GiantWaterSkipperEntity;
import net.mcreator.paleobugs.client.model.animations.acuaticoAnimation;
import net.mcreator.paleobugs.client.model.Modelacuatico;

public class GiantWaterSkipperRenderer extends MobRenderer<GiantWaterSkipperEntity, Modelacuatico<GiantWaterSkipperEntity>> {
	public GiantWaterSkipperRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelacuatico.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(GiantWaterSkipperEntity entity) {
		return new ResourceLocation("paleobugs:textures/entities/acuactico.png");
	}

	private static final class AnimatedModel extends Modelacuatico<GiantWaterSkipperEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<GiantWaterSkipperEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(GiantWaterSkipperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, acuaticoAnimation.bicho, ageInTicks, 1f);
				if (Mega3Procedure.execute(entity))
					this.animateWalk(acuaticoAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
				if (Graskop3Procedure.execute(entity))
					this.animateWalk(acuaticoAnimation.nadar, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(GiantWaterSkipperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
