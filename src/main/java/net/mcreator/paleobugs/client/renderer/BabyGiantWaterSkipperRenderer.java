
package net.mcreator.paleobugs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.paleobugs.entity.BabyGiantWaterSkipperEntity;
import net.mcreator.paleobugs.client.model.animations.skiperAnimation;
import net.mcreator.paleobugs.client.model.Modelskiper;

public class BabyGiantWaterSkipperRenderer extends MobRenderer<BabyGiantWaterSkipperEntity, Modelskiper<BabyGiantWaterSkipperEntity>> {
	public BabyGiantWaterSkipperRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelskiper.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BabyGiantWaterSkipperEntity entity) {
		return new ResourceLocation("paleobugs:textures/entities/r.png");
	}

	private static final class AnimatedModel extends Modelskiper<BabyGiantWaterSkipperEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BabyGiantWaterSkipperEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BabyGiantWaterSkipperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, skiperAnimation.caminar, ageInTicks, 1f);
				this.animateWalk(skiperAnimation.caminar2, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BabyGiantWaterSkipperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
