// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgrillitooo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "grillitooo"), "main");
	private final ModelPart bone7;
	private final ModelPart bone5;
	private final ModelPart bone8;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;

	public Modelgrillitooo(ModelPart root) {
		this.bone7 = root.getChild("bone7");
		this.bone5 = this.bone7.getChild("bone5");
		this.bone8 = this.bone5.getChild("bone8");
		this.bone = this.bone7.getChild("bone");
		this.bone2 = this.bone7.getChild("bone2");
		this.bone3 = this.bone7.getChild("bone3");
		this.bone4 = this.bone7.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 35).addBox(
				-0.5F, -4.0F, 2.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.0F, -5.0F));

		PartDefinition bone5 = bone7.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F,
				-1.0F, -4.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 3.0F));

		PartDefinition bone8 = bone5.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, -1.0F));

		PartDefinition cube_r1 = bone8
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone = bone7
				.addOrReplaceChild("bone",
						CubeListBuilder.create().texOffs(8, 39).addBox(-0.5F, -3.0F, 0.0F, 0.0F, 4.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone2 = bone7.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, -1.0F, 6.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 39).addBox(-0.6522F, -3.0F, -0.5154F, 0.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1522F, 1.0F, -0.2346F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone3 = bone7.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.5F, -1.0F, 3.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 41).addBox(-0.6522F, -2.0F, 0.4846F, 0.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6522F, 1.0F, -3.2346F, -0.2746F, 0.31F, -0.7058F));

		PartDefinition bone4 = bone7.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.5F, -1.0F, 3.0F, 0.091F, -0.3663F, 1.3546F));

		PartDefinition cube_r4 = bone4.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 41).addBox(-0.6522F, -2.25F, 0.4846F, 0.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6522F, 1.0F, -3.2346F, -0.2746F, 0.31F, -0.7058F));

		return LayerDefinition.create(meshdefinition, 48, 48);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}