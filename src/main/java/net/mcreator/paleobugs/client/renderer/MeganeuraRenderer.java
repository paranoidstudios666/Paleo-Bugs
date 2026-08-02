
package net.mcreator.paleobugs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.paleobugs.entity.MeganeuraEntity;
import net.mcreator.paleobugs.client.model.animations.dragonflyAnimation;
import net.mcreator.paleobugs.client.model.Modeldragonfly;

public class MeganeuraRenderer extends MobRenderer<MeganeuraEntity, Modeldragonfly<MeganeuraEntity>> {
	public MeganeuraRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeldragonfly.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(MeganeuraEntity entity) {
		return new ResourceLocation("paleobugs:textures/entities/dragnlti.png");
	}

	private static final class AnimatedModel extends Modeldragonfly<MeganeuraEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<MeganeuraEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(MeganeuraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, dragonflyAnimation.libelula2, ageInTicks, 1f);
				this.animateWalk(dragonflyAnimation.libelula, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState2, dragonflyAnimation.libelula, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(MeganeuraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
