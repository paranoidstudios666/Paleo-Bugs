package net.mcreator.paleobugs.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelskiper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("paleobugs", "modelskiper"), "main");
	public final ModelPart bone7;
	public final ModelPart bone5;
	public final ModelPart bone3;
	public final ModelPart bone2;
	public final ModelPart bone4;
	public final ModelPart bone6;
	public final ModelPart bone;
	public final ModelPart bone8;

	public Modelskiper(ModelPart root) {
		this.bone7 = root.getChild("bone7");
		this.bone5 = this.bone7.getChild("bone5");
		this.bone3 = this.bone7.getChild("bone3");
		this.bone2 = this.bone7.getChild("bone2");
		this.bone4 = this.bone7.getChild("bone4");
		this.bone6 = this.bone7.getChild("bone6");
		this.bone = this.bone7.getChild("bone");
		this.bone8 = this.bone7.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(23, 38).addBox(-1.5F, -3.0F, -2.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(36, 41).mirror().addBox(-1.5F, -2.75F, -1.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offset(0.0F, 23.0F, -2.0F));
		PartDefinition bone5 = bone7.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 2.8611F, 0.836F, 2.7466F));
		PartDefinition cube_r1 = bone5.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(41, 37).mirror().addBox(-3.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8821F, -0.5285F, 1.1131F, 0.0F, -0.4363F, 0.0F));
		PartDefinition bone3 = bone7.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.0F, -1.0F, 0.0F, 0.0436F, 0.0F));
		PartDefinition cube_r2 = bone3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(26, 30).mirror().addBox(1.0F, 2.0F, -4.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8941F, -2.341F, 1.8319F, -0.0115F, -0.1304F, 0.088F));
		PartDefinition bone2 = bone7.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, 4.0F, 0.0F, -1.1345F, 0.0F));
		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 30).mirror().addBox(1.0F, 2.0F, -4.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0408F, -2.0F, 0.8682F, 0.0758F, -0.1304F, 0.088F));
		PartDefinition bone4 = bone7.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 4.0F, -0.0735F, -0.3599F, -0.1968F));
		PartDefinition cube_r4 = bone4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 33).addBox(3.6565F, 2.5F, -3.803F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.3565F, -3.0F, 2.803F, -0.0115F, -0.1304F, 0.088F));
		PartDefinition bone6 = bone7.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.0F, -0.1515F, -1.0979F, -0.0877F));
		PartDefinition cube_r5 = bone6.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 33).addBox(3.6565F, 2.5F, -3.803F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.3565F, -3.0F, 2.803F, -0.0115F, -0.1304F, 0.088F));
		PartDefinition bone = bone7.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.0F, -1.0F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(41, 37).addBox(-2.0765F, -1.774F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, -1.0F, 2.0184F, -1.0471F, -1.9648F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-1.0F, -3.0F, -2.0F));
		PartDefinition cube_r7 = bone8.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(42, 41).addBox(-0.5F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 48, 48);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
