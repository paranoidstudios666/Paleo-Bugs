
package net.mcreator.paleobugs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.paleobugs.entity.BabyMeganeuraEntity;
import net.mcreator.paleobugs.client.model.animations.ningaAnimation;
import net.mcreator.paleobugs.client.model.animations.aranaAnimation;
import net.mcreator.paleobugs.client.model.Modelninga;

public class BabyMeganeuraRenderer extends MobRenderer<BabyMeganeuraEntity, Modelninga<BabyMeganeuraEntity>> {
	public BabyMeganeuraRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelninga.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(BabyMeganeuraEntity entity) {
		return new ResourceLocation("paleobugs:textures/entities/r.png");
	}

	private static final class AnimatedModel extends Modelninga<BabyMeganeuraEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BabyMeganeuraEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BabyMeganeuraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, ningaAnimation.caminar, ageInTicks, 1f);
				this.animateWalk(aranaAnimation.caminar2, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BabyMeganeuraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
