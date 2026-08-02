// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelRadicte<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "radicte"), "main");
	private final ModelPart bone;
	private final ModelPart pata1;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart pata4;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart pata6;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart pata5;
	private final ModelPart bone14;
	private final ModelPart bone15;
	private final ModelPart pata3;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart pata2;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone3;
	private final ModelPart WholeHead;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart bone4;
	private final ModelPart bone2;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart bone5;

	public ModelRadicte(ModelPart root) {
		this.bone = root.getChild("bone");
		this.pata1 = this.bone.getChild("pata1");
		this.bone6 = this.pata1.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.pata4 = this.bone.getChild("pata4");
		this.bone12 = this.pata4.getChild("bone12");
		this.bone13 = this.bone12.getChild("bone13");
		this.pata6 = this.bone.getChild("pata6");
		this.bone16 = this.pata6.getChild("bone16");
		this.bone17 = this.bone16.getChild("bone17");
		this.pata5 = this.bone.getChild("pata5");
		this.bone14 = this.pata5.getChild("bone14");
		this.bone15 = this.bone14.getChild("bone15");
		this.pata3 = this.bone.getChild("pata3");
		this.bone10 = this.pata3.getChild("bone10");
		this.bone11 = this.bone10.getChild("bone11");
		this.pata2 = this.bone.getChild("pata2");
		this.bone8 = this.pata2.getChild("bone8");
		this.bone9 = this.bone8.getChild("bone9");
		this.bone3 = this.bone.getChild("bone3");
		this.WholeHead = this.bone3.getChild("WholeHead");
		this.bone20 = this.WholeHead.getChild("bone20");
		this.bone21 = this.WholeHead.getChild("bone21");
		this.bone4 = this.WholeHead.getChild("bone4");
		this.bone2 = this.WholeHead.getChild("bone2");
		this.bone18 = this.bone3.getChild("bone18");
		this.bone19 = this.bone18.getChild("bone19");
		this.bone5 = this.bone3.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition pata1 = bone.addOrReplaceChild("pata1",
				CubeListBuilder.create().texOffs(0, 84).addBox(-2.0F, -3.0F, -2.5F, 12.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -5.0F, -5.0F, 0.0318F, 0.0286F, -0.6019F));

		PartDefinition bone6 = pata1.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(0, 72).addBox(-2.9289F, -2.6493F, -2.0F, 14.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7685F, -0.0675F, 0.5F, 0.0F, 0.0F, 1.3526F));

		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(-21.9289F, 5.3507F, 4.5F));

		PartDefinition cube_r1 = bone7.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 80).addBox(0.0F, -1.0F, -1.5F, 9.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.0F, -6.0F, -4.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition pata4 = bone.addOrReplaceChild("pata4",
				CubeListBuilder.create().texOffs(0, 84).addBox(-2.0F, -3.0F, -2.5F, 12.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -5.0F, -5.0F, -3.1039F, -0.0297F, -2.5815F));

		PartDefinition bone12 = pata4.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(0, 72).addBox(-2.9289F, -2.6493F, -2.0F, 14.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7685F, -0.0675F, 0.5F, 0.0F, 0.0F, 1.3526F));

		PartDefinition bone13 = bone12.addOrReplaceChild("bone13", CubeListBuilder.create(),
				PartPose.offset(-21.9289F, 5.3507F, 4.5F));

		PartDefinition cube_r2 = bone13.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 80).addBox(0.0F, -1.0F, -1.5F, 9.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.0F, -6.0F, -4.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition pata6 = bone.addOrReplaceChild("pata6",
				CubeListBuilder.create().texOffs(0, 84).addBox(-2.0F, -3.0F, -2.5F, 12.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -5.0F, 1.0F, 2.5476F, -0.5217F, -2.4607F));

		PartDefinition bone16 = pata6.addOrReplaceChild("bone16",
				CubeListBuilder.create().texOffs(0, 72).addBox(-2.9289F, -2.6493F, -2.0F, 14.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7685F, -0.0675F, 0.5F, 0.0F, 0.0F, 1.3526F));

		PartDefinition bone17 = bone16.addOrReplaceChild("bone17", CubeListBuilder.create(),
				PartPose.offset(-21.9289F, 5.3507F, 4.5F));

		PartDefinition cube_r3 = bone17.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 80).addBox(0.0F, -1.0F, -1.5F, 9.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.0F, -6.0F, -4.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition pata5 = bone.addOrReplaceChild("pata5",
				CubeListBuilder.create().texOffs(0, 84).addBox(-2.0F, -3.0F, -2.5F, 12.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -5.0F, -8.0F, -2.7722F, 0.483F, -2.4808F));

		PartDefinition bone14 = pata5.addOrReplaceChild("bone14",
				CubeListBuilder.create().texOffs(0, 72).addBox(-2.9289F, -2.6493F, -2.0F, 14.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7685F, -0.0675F, 0.5F, 0.0F, 0.0F, 1.3526F));

		PartDefinition bone15 = bone14.addOrReplaceChild("bone15", CubeListBuilder.create(),
				PartPose.offset(-21.9289F, 5.3507F, 4.5F));

		PartDefinition cube_r4 = bone15.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 80).addBox(0.0F, -1.0F, -1.5F, 9.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.0F, -6.0F, -4.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition pata3 = bone.addOrReplaceChild("pata3",
				CubeListBuilder.create().texOffs(0, 84).addBox(-2.0F, -3.0F, -2.5F, 12.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -5.0F, -9.0F, -0.5026F, 0.556F, -0.706F));

		PartDefinition bone10 = pata3.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(0, 72).addBox(-2.9289F, -2.6493F, -2.0F, 14.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7685F, -0.0675F, 0.5F, 0.0F, 0.0F, 1.3526F));

		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offset(-21.9289F, 5.3507F, 4.5F));

		PartDefinition cube_r5 = bone11.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 80).addBox(0.0F, -1.0F, -1.5F, 9.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.0F, -6.0F, -4.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition pata2 = bone.addOrReplaceChild("pata2",
				CubeListBuilder.create().texOffs(0, 84).addBox(-2.0F, -3.0F, -2.5F, 12.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -5.0F, 1.0F, 0.6432F, -0.4711F, -0.6462F));

		PartDefinition bone8 = pata2.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(0, 72).addBox(-2.9289F, -2.6493F, -2.0F, 14.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7685F, -0.0675F, 0.5F, 0.0F, 0.0F, 1.3526F));

		PartDefinition bone9 = bone8.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offset(-21.9289F, 5.3507F, 4.5F));

		PartDefinition cube_r6 = bone9.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 80).addBox(0.0F, -1.0F, -1.5F, 9.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.0F, -6.0F, -4.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 38).addBox(-15.0F, -3.0F, -7.0F, 16.0F, 12.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.0F, -12.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition WholeHead = bone3.addOrReplaceChild("WholeHead",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(0.0F, 0.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 12)
						.addBox(1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(0.0F, -4.0F, -5.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone20 = WholeHead.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(65, 39).addBox(
				0.0F, -2.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 5.0F, -3.0F));

		PartDefinition bone21 = WholeHead.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(46, 39).addBox(
				-1.0F, -2.0F, -1.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 5.0F, 2.0F));

		PartDefinition bone4 = WholeHead.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 64).mirror()
						.addBox(-1.0F, -3.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -2.0F, 3.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone2 = WholeHead.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(-41.0F, -5.0F, 0.0F));

		PartDefinition bone18 = bone3.addOrReplaceChild("bone18",
				CubeListBuilder.create().texOffs(0, 4).mirror()
						.addBox(-29.0F, -6.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(76, 0).addBox(-24.0F, -8.0F, -5.0F, 7.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-16.0F, 2.0F, 0.0F));

		PartDefinition bone19 = bone18.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(0, 0).addBox(-17.0F,
				-12.0F, -9.0F, 18.0F, 20.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(0.0F, 13.0F, 12.0F));

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