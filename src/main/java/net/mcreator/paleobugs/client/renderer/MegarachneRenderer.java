
package net.mcreator.paleobugs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.paleobugs.entity.MegarachneEntity;
import net.mcreator.paleobugs.client.model.animations.RadicteAnimation;
import net.mcreator.paleobugs.client.model.ModelRadicte;

public class MegarachneRenderer extends MobRenderer<MegarachneEntity, ModelRadicte<MegarachneEntity>> {
	public MegarachneRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelRadicte.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(MegarachneEntity entity) {
		return new ResourceLocation("paleobugs:textures/entities/aranaa2.png");
	}

	private static final class AnimatedModel extends ModelRadicte<MegarachneEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<MegarachneEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(MegarachneEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(RadicteAnimation.caminar, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState1, RadicteAnimation.stik, ageInTicks, 1f);
				this.animate(entity.animationState2, RadicteAnimation.escalar, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(MegarachneEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
