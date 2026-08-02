
package net.mcreator.paleobugs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.paleobugs.entity.BabyMegarachneEntity;
import net.mcreator.paleobugs.client.model.animations.aranaAnimation;
import net.mcreator.paleobugs.client.model.Modelarana;

public class BabyMegarachneRenderer extends MobRenderer<BabyMegarachneEntity, Modelarana<BabyMegarachneEntity>> {
	public BabyMegarachneRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelarana.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BabyMegarachneEntity entity) {
		return new ResourceLocation("paleobugs:textures/entities/aranina2.png");
	}

	private static final class AnimatedModel extends Modelarana<BabyMegarachneEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BabyMegarachneEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BabyMegarachneEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, aranaAnimation.caminar, ageInTicks, 1f);
				this.animateWalk(aranaAnimation.caminar2, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BabyMegarachneEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
