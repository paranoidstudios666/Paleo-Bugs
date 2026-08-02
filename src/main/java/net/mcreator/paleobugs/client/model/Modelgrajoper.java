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

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgrajoper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("paleobugs", "modelgrajoper"), "main");
	public final ModelPart bone2;
	public final ModelPart bone;
	public final ModelPart piernatrasera;
	public final ModelPart bone3;
	public final ModelPart pelillos;
	public final ModelPart piernatrasera2;
	public final ModelPart bone6;
	public final ModelPart pelillos2;
	public final ModelPart bone5;
	public final ModelPart bone15;
	public final ModelPart bone4;
	public final ModelPart bone10;
	public final ModelPart bone7;
	public final ModelPart bone8;
	public final ModelPart bone11;
	public final ModelPart bone9;
	public final ModelPart bone12;
	public final ModelPart bone13;
	public final ModelPart bone14;
	public final ModelPart anteba;
	public final ModelPart anteba2;
	public final ModelPart labio3;
	public final ModelPart labio;
	public final ModelPart ala1;
	public final ModelPart ala2;

	public Modelgrajoper(ModelPart root) {
		this.bone2 = root.getChild("bone2");
		this.bone = this.bone2.getChild("bone");
		this.piernatrasera = this.bone.getChild("piernatrasera");
		this.bone3 = this.piernatrasera.getChild("bone3");
		this.pelillos = this.bone3.getChild("pelillos");
		this.piernatrasera2 = this.bone.getChild("piernatrasera2");
		this.bone6 = this.piernatrasera2.getChild("bone6");
		this.pelillos2 = this.bone6.getChild("pelillos2");
		this.bone5 = this.bone.getChild("bone5");
		this.bone15 = this.bone5.getChild("bone15");
		this.bone4 = this.bone.getChild("bone4");
		this.bone10 = this.bone4.getChild("bone10");
		this.bone7 = this.bone10.getChild("bone7");
		this.bone8 = this.bone.getChild("bone8");
		this.bone11 = this.bone8.getChild("bone11");
		this.bone9 = this.bone11.getChild("bone9");
		this.bone12 = this.bone.getChild("bone12");
		this.bone13 = this.bone12.getChild("bone13");
		this.bone14 = this.bone13.getChild("bone14");
		this.anteba = this.bone.getChild("anteba");
		this.anteba2 = this.bone.getChild("anteba2");
		this.labio3 = this.bone.getChild("labio3");
		this.labio = this.bone.getChild("labio");
		this.ala1 = this.bone.getChild("ala1");
		this.ala2 = this.bone.getChild("ala2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-6.0F, 20.0F, 0.0F));
		PartDefinition bone = bone2.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 99).addBox(11.0F, -8.0F, -4.5F, 14.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(66, 115).addBox(25.0F, -8.0F, -3.5F, 4.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, -9.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 59).addBox(16.0F, -5.0F, -7.0F, 4.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 12.0F, 1.0F, -0.8087F, 0.719F, -0.8296F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 121).addBox(-9.0F, -10.0F, -4.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(0, 121)
				.addBox(-9.0F, -10.0F, -10.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(44, 51).addBox(-9.0F, -11.0F, -10.0F, 5.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -1.0F, 6.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 22).addBox(-6.0F, -9.5F, -7.5F, 10.0F, 10.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-4.0F, -10.0F, -5.5F, 15.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition piernatrasera = bone.addOrReplaceChild("piernatrasera", CubeListBuilder.create(), PartPose.offset(9.0F, -1.0F, 4.0F));
		PartDefinition bone3 = piernatrasera.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, 12.0F, 5.0F, 0.0F, -0.7941F, 0.0F));
		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 30).addBox(12.0F, -9.0F, -9.0F, 13.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3126F, 0.3135F, -0.766F));
		PartDefinition pelillos = bone3.addOrReplaceChild("pelillos", CubeListBuilder.create(), PartPose.offset(9.0F, -21.0F, -12.0F));
		PartDefinition cube_r6 = pelillos.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 0).addBox(-1.3774F, -2.1363F, -0.1252F, 9.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.0285F, 0.4382F, -0.0245F));
		PartDefinition piernatrasera2 = bone.addOrReplaceChild("piernatrasera2", CubeListBuilder.create(), PartPose.offset(8.0F, -1.0F, -5.0F));
		PartDefinition bone6 = piernatrasera2.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 9.0F));
		PartDefinition cube_r7 = bone6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 30).addBox(12.0F, -9.0F, -9.0F, 13.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3126F, 0.3135F, -0.766F));
		PartDefinition pelillos2 = bone6.addOrReplaceChild("pelillos2", CubeListBuilder.create(), PartPose.offset(10.0F, -21.0F, -12.0F));
		PartDefinition cube_r8 = pelillos2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 0).addBox(22.0F, -3.5F, -7.0F, 9.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.0F, 2.0F, 17.0F, -0.0285F, 0.4382F, -0.0245F));
		PartDefinition bone5 = bone.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(8.0F, -1.0F, -6.0F));
		PartDefinition cube_r9 = bone5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(54, 16).addBox(12.0F, -9.0F, -8.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 10.0F, 2.0F, -2.9753F, 0.6805F, -2.8364F));
		PartDefinition bone15 = bone5.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offset(-5.0F, -3.0F, -5.0F));
		PartDefinition cube_r10 = bone15.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(39, 118).addBox(-0.1794F, -3.0502F, 0.4104F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 1.0F, 3.0921F, 0.7359F, -3.129F));
		PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(10.0F, -1.0F, -6.0F));
		PartDefinition bone10 = bone4.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.0F, -7.0F, 16.0F, 0.0F, 0.0873F, 0.0F));
		PartDefinition cube_r11 = bone10.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(54, 16).addBox(-0.6341F, -1.5538F, -0.8633F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 7.0F, -14.0F, -0.5963F, 0.9049F, -0.4821F));
		PartDefinition bone7 = bone10.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(14.0F, 5.0F, -20.0F));
		PartDefinition cube_r12 = bone7.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(39, 118).addBox(19.0F, -2.0F, -6.0F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -1.0F, 20.0F, -0.0443F, 1.0515F, 0.072F));
		PartDefinition bone8 = bone.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(9.0F, -1.0F, 6.0F));
		PartDefinition bone11 = bone8.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.0F, -8.0F, -17.0F, 2.8347F, -1.163F, -2.5809F));
		PartDefinition cube_r13 = bone11.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(54, 16).addBox(12.0F, -9.0F, -8.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 19.0F, -3.0F, -0.5963F, 0.9049F, -0.4821F));
		PartDefinition bone9 = bone11.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(14.5F, 5.0F, -20.0F));
		PartDefinition cube_r14 = bone9.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(39, 118).addBox(2.4331F, -4.4049F, 3.2062F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, 1.0F, 1.0F, -0.0443F, 1.0515F, 0.072F));
		PartDefinition bone12 = bone.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(8.0F, -1.0F, 6.0F, 0.0F, -1.4399F, 0.0F));
		PartDefinition bone13 = bone12.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.4287F, -8.0F, -15.9457F, 2.8347F, -1.163F, -2.5809F));
		PartDefinition cube_r15 = bone13.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(54, 16).addBox(12.0F, -9.0F, -8.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 19.0F, -3.0F, -0.5963F, 0.9049F, -0.4821F));
		PartDefinition bone14 = bone13.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offset(14.0F, 5.0F, -19.0F));
		PartDefinition cube_r16 = bone14.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(39, 118).addBox(19.0F, -2.0F, -6.0F, 5.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -1.0F, 19.0F, -0.0443F, 1.0515F, 0.072F));
		PartDefinition anteba = bone.addOrReplaceChild("anteba", CubeListBuilder.create(), PartPose.offset(-6.0F, -10.0F, -2.0F));
		PartDefinition cube_r17 = anteba.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(52, 118).mirror().addBox(-15.0F, -17.0F, -1.0F, 7.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 6.0F, 1.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition anteba2 = bone.addOrReplaceChild("anteba2", CubeListBuilder.create(), PartPose.offset(-7.0F, -11.0F, 2.0F));
		PartDefinition cube_r18 = anteba2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(52, 118).mirror().addBox(-15.0F, -17.0F, -1.0F, 7.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.0F, 7.0F, 1.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition labio3 = bone.addOrReplaceChild("labio3", CubeListBuilder.create(), PartPose.offset(-7.0F, -2.0F, 2.0F));
		PartDefinition cube_r19 = labio3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(24, 119).addBox(-10.0F, -4.0F, -3.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition labio = bone.addOrReplaceChild("labio", CubeListBuilder.create(), PartPose.offset(-7.0F, -2.0F, -2.0F));
		PartDefinition cube_r20 = labio.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(24, 119).addBox(-10.0F, -4.0F, -3.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition ala1 = bone.addOrReplaceChild("ala1", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, 3.0F));
		PartDefinition cube_r21 = ala1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 79).addBox(9.0F, -11.0F, -3.0F, 18.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0019F, 0.0437F, 0.0435F));
		PartDefinition ala2 = bone.addOrReplaceChild("ala2", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, 3.0F));
		PartDefinition cube_r22 = ala2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(44, 43).addBox(6.0F, -11.0F, -3.0F, 18.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, -6.0F, -0.0019F, -0.0436F, 0.0437F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
