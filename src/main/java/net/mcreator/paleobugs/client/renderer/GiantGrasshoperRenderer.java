
package net.mcreator.paleobugs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.paleobugs.entity.GiantGrasshoperEntity;
import net.mcreator.paleobugs.client.model.animations.grajoperAnimation;
import net.mcreator.paleobugs.client.model.Modelgrajoper;

public class GiantGrasshoperRenderer extends MobRenderer<GiantGrasshoperEntity, Modelgrajoper<GiantGrasshoperEntity>> {
	public GiantGrasshoperRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelgrajoper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GiantGrasshoperEntity entity) {
		return new ResourceLocation("paleobugs:textures/entities/textureeee.png");
	}

	private static final class AnimatedModel extends Modelgrajoper<GiantGrasshoperEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<GiantGrasshoperEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(GiantGrasshoperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(grajoperAnimation.caminar, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(GiantGrasshoperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
