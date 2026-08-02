
package net.mcreator.paleobugs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.paleobugs.entity.BabyGrasshopperEntity;
import net.mcreator.paleobugs.client.model.animations.grillinnnAnimation;
import net.mcreator.paleobugs.client.model.Modelgrillitooo;

public class BabyGrasshopperRenderer extends MobRenderer<BabyGrasshopperEntity, Modelgrillitooo<BabyGrasshopperEntity>> {
	public BabyGrasshopperRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelgrillitooo.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(BabyGrasshopperEntity entity) {
		return new ResourceLocation("paleobugs:textures/entities/r.png");
	}

	private static final class AnimatedModel extends Modelgrillitooo<BabyGrasshopperEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BabyGrasshopperEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BabyGrasshopperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, grillinnnAnimation.caminar, ageInTicks, 1f);
				this.animateWalk(grillinnnAnimation.caminar2, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BabyGrasshopperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
