// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldragonfly<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dragonfly"), "main");
	private final ModelPart bone;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart bone2;
	private final ModelPart bone3;

	public Modeldragonfly(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone8 = this.bone.getChild("bone8");
		this.bone9 = this.bone.getChild("bone9");
		this.bone10 = this.bone.getChild("bone10");
		this.bone11 = this.bone.getChild("bone11");
		this.bone4 = this.bone.getChild("bone4");
		this.bone5 = this.bone.getChild("bone5");
		this.bone6 = this.bone.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.bone2 = this.bone.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 17.0F, 8.0F));

		PartDefinition cube_r1 = bone
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 28).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 7.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 1.0F, -8.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bone8 = bone.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offset(-1.0F, -6.0F, -14.0F));

		PartDefinition cube_r2 = bone8.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(-2, 0).addBox(-20.4967F, 0.1493F, -3.6696F, 21.0F, 0.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.3348F, -0.4149F, -0.1393F));

		PartDefinition bone9 = bone.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offset(2.0F, -6.0F, -14.0F));

		PartDefinition cube_r3 = bone9.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(-2, 7).mirror()
						.addBox(0.0F, 0.45F, -2.3826F, 21.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.3348F, 0.4149F, 0.1393F));

		PartDefinition bone10 = bone.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offset(2.0F, -8.0F, -11.0F));

		PartDefinition cube_r4 = bone10.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(-2, 14).mirror()
						.addBox(0.0F, 0.45F, -2.3826F, 21.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.3155F, -0.2494F, -0.0804F));

		PartDefinition bone11 = bone.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offset(-2.0F, -7.0F, -10.0F));

		PartDefinition cube_r5 = bone11.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(-2, 21).addBox(-21.0F, 0.46F, -2.3826F, 21.0F, 0.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, -1.0F, 0.3155F, 0.2494F, 0.0804F));

		PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(3.0F, 0.0F, -9.0F));

		PartDefinition cube_r6 = bone4.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(36, 28).addBox(0.0F, 0.9F, -6.3926F, 7.0F, 6.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, 1.0F, 0.2752F, -0.0116F, 0.6991F));

		PartDefinition bone5 = bone.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 0.0F, -9.0F));

		PartDefinition cube_r7 = bone5.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 45).addBox(0.1942F, -0.5645F, -6.349F, 6.0F, 7.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.029F, -0.2515F, 0.8659F));

		PartDefinition bone6 = bone.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 1.0F, -14.0F));

		PartDefinition cube_r8 = bone6.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 63).addBox(0.5F, -1.6773F, -1.3729F, 3.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -4.0F, -4.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone6.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 63).mirror()
						.addBox(-3.5F, -1.6337F, -2.372F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -4.0F, -3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone6.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(34, 62)
						.addBox(0.0F, -5.0F, -5.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 21)
						.addBox(1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -5.0F, -5.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone7
				.addOrReplaceChild("cube_r11",
						CubeListBuilder.create().texOffs(52, 16).addBox(-1.0F, -5.0F, -10.0F, 6.0F, 0.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.0F, 5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(52, 0).addBox(-2.0F,
				-2.0F, -2.0F, 4.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, -4.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 2.0F, 8.0F));

		PartDefinition cube_r12 = bone3
				.addOrReplaceChild("cube_r12",
						CubeListBuilder.create().texOffs(34, 45).addBox(-1.5F, -5.5F, -5.0F, 3.0F, 4.0F, 13.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.0F, 4.0F, -0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}