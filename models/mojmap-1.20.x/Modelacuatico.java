// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelacuatico<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "acuatico"), "main");
	private final ModelPart bone4;
	private final ModelPart bone2;
	private final ModelPart pata;
	private final ModelPart pata2;
	private final ModelPart bone3;
	private final ModelPart pata3;
	private final ModelPart pata4;
	private final ModelPart bone;
	private final ModelPart bone8;
	private final ModelPart bone7;
	private final ModelPart cavesa;
	private final ModelPart bone6;
	private final ModelPart bone5;

	public Modelacuatico(ModelPart root) {
		this.bone4 = root.getChild("bone4");
		this.bone2 = this.bone4.getChild("bone2");
		this.pata = this.bone2.getChild("pata");
		this.pata2 = this.bone2.getChild("pata2");
		this.bone3 = this.bone4.getChild("bone3");
		this.pata3 = this.bone3.getChild("pata3");
		this.pata4 = this.bone3.getChild("pata4");
		this.bone = this.bone4.getChild("bone");
		this.bone8 = this.bone.getChild("bone8");
		this.bone7 = this.bone.getChild("bone7");
		this.cavesa = this.bone.getChild("cavesa");
		this.bone6 = this.cavesa.getChild("bone6");
		this.bone5 = this.cavesa.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition bone2 = bone4.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition pata = bone2.addOrReplaceChild("pata", CubeListBuilder.create(),
				PartPose.offset(-5.0F, -1.0F, -1.0F));

		PartDefinition cube_r1 = pata.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 79).mirror()
				.addBox(-11.8172F, -1.6519F, -0.1715F, 12.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.0F, 2.0F, -9.0F, 0.0754F, -0.5174F, -0.1969F));

		PartDefinition cube_r2 = pata.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(68, 44).addBox(-14.1635F, -1.0148F, -0.9482F, 15.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.085F, -0.6914F, -0.2139F));

		PartDefinition pata2 = bone2.addOrReplaceChild("pata2", CubeListBuilder.create(),
				PartPose.offset(5.0F, -2.0F, -1.0F));

		PartDefinition cube_r3 = pata2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(80, 78).mirror()
						.addBox(-11.8171F, -2.0F, 6.6F, 12.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(14.0F, 3.0F, -3.0F, 2.9798F, -0.5103F, -2.872F));

		PartDefinition cube_r4 = pata2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(68, 48).addBox(-14.6359F, -1.1634F, -0.4931F, 15.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 1.0F, 3.0739F, -0.6956F, -2.959F));

		PartDefinition bone3 = bone4.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -4.0F, 1.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition pata3 = bone3.addOrReplaceChild("pata3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.0F, 3.0F, -5.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r5 = pata3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(80, 82).mirror()
				.addBox(-11.8171F, -1.6519F, -0.1715F, 12.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.8866F, -2.0F, -9.2696F, 0.2438F, -1.2963F, -0.3946F));

		PartDefinition cube_r6 = pata3.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(68, 52).addBox(-14.1635F, -1.0148F, -0.9482F, 15.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1134F, -4.0F, -0.2696F, 0.085F, -0.6914F, -0.2139F));

		PartDefinition pata4 = bone3.addOrReplaceChild("pata4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.0F, -1.0F, -5.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r7 = pata4.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(32, 83).mirror()
						.addBox(-11.8172F, -2.0F, -0.5F, 12.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.9658F, 2.0F, -9.4779F, 2.6516F, -1.2675F, -2.4808F));

		PartDefinition cube_r8 = pata4.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(56, 74).addBox(-13.9951F, -0.9044F, -1.1035F, 15.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0342F, 0.0F, -0.4779F, 3.0303F, -0.6956F, -2.959F));

		PartDefinition bone = bone4.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 29).addBox(-4.4589F, -9.6946F, -0.1832F, 6.0F, 1.0F, 28.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -12.0F, 0.0F, 0.0436F, -0.1745F));

		PartDefinition cube_r10 = bone
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(56, 58).addBox(-4.0F, -8.0F, 5.0F, 8.0F, 4.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone
				.addOrReplaceChild("cube_r11",
						CubeListBuilder.create().texOffs(0, 58).addBox(-5.5F, -8.0F, -12.0F, 11.0F, 4.0F, 17.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(-2.4282F, -8.4791F, 0.1174F, 6.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -1.0F, -12.0F, 0.0F, -0.0436F, 0.1745F));

		PartDefinition bone8 = bone.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offset(4.0F, -8.0F, -14.0F));

		PartDefinition cube_r13 = bone8
				.addOrReplaceChild("cube_r13",
						CubeListBuilder.create().texOffs(68, 0).addBox(0.5F, -4.4836F, -10.836F, 0.0F, 10.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition bone7 = bone.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(-5.0F, -8.0F, -14.0F));

		PartDefinition cube_r14 = bone7
				.addOrReplaceChild("cube_r14",
						CubeListBuilder.create().texOffs(68, 0).addBox(0.5F, -4.4836F, -10.836F, 0.0F, 10.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cavesa = bone.addOrReplaceChild("cavesa", CubeListBuilder.create(),
				PartPose.offset(-2.0F, -2.0F, 2.0F));

		PartDefinition cube_r15 = cavesa.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(56, 78).addBox(-2.5F, -3.3459F, -6.7639F, 5.0F, 5.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -5.0F, -13.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r16 = cavesa.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(32, 87).mirror()
						.addBox(-3.75F, -9.75F, -16.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(32, 87).addBox(-9.25F, -9.75F, -16.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone6 = cavesa.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(-1.0F, -7.0F, -18.0F));

		PartDefinition cube_r17 = bone6
				.addOrReplaceChild("cube_r17",
						CubeListBuilder.create().texOffs(0, 79).addBox(0.0F, -9.6202F, -8.5771F, 0.0F, 9.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 0.0F, 2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone5 = cavesa.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(3.0F, -8.0F, -16.0F));

		PartDefinition cube_r18 = bone5.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 79).addBox(-3.5F, -19.0F, -23.0F, 0.0F, 9.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 11.0F, 14.0F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}