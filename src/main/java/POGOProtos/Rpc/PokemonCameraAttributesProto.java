// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PokemonCameraAttributesProto}
 */
public final class PokemonCameraAttributesProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PokemonCameraAttributesProto)
    PokemonCameraAttributesProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokemonCameraAttributesProto.newBuilder() to construct.
  private PokemonCameraAttributesProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokemonCameraAttributesProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokemonCameraAttributesProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokemonCameraAttributesProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 13: {

            diskRadiusM_ = input.readFloat();
            break;
          }
          case 21: {

            cylRadiusM_ = input.readFloat();
            break;
          }
          case 29: {

            cylHeightM_ = input.readFloat();
            break;
          }
          case 37: {

            cylGroundM_ = input.readFloat();
            break;
          }
          case 45: {

            shoulderModeScale_ = input.readFloat();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonCameraAttributesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonCameraAttributesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PokemonCameraAttributesProto.class, POGOProtos.Rpc.PokemonCameraAttributesProto.Builder.class);
  }

  public static final int DISK_RADIUS_M_FIELD_NUMBER = 1;
  private float diskRadiusM_;
  /**
   * <code>float disk_radius_m = 1;</code>
   * @return The diskRadiusM.
   */
  @java.lang.Override
  public float getDiskRadiusM() {
    return diskRadiusM_;
  }

  public static final int CYL_RADIUS_M_FIELD_NUMBER = 2;
  private float cylRadiusM_;
  /**
   * <code>float cyl_radius_m = 2;</code>
   * @return The cylRadiusM.
   */
  @java.lang.Override
  public float getCylRadiusM() {
    return cylRadiusM_;
  }

  public static final int CYL_HEIGHT_M_FIELD_NUMBER = 3;
  private float cylHeightM_;
  /**
   * <code>float cyl_height_m = 3;</code>
   * @return The cylHeightM.
   */
  @java.lang.Override
  public float getCylHeightM() {
    return cylHeightM_;
  }

  public static final int CYL_GROUND_M_FIELD_NUMBER = 4;
  private float cylGroundM_;
  /**
   * <code>float cyl_ground_m = 4;</code>
   * @return The cylGroundM.
   */
  @java.lang.Override
  public float getCylGroundM() {
    return cylGroundM_;
  }

  public static final int SHOULDER_MODE_SCALE_FIELD_NUMBER = 5;
  private float shoulderModeScale_;
  /**
   * <code>float shoulder_mode_scale = 5;</code>
   * @return The shoulderModeScale.
   */
  @java.lang.Override
  public float getShoulderModeScale() {
    return shoulderModeScale_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (diskRadiusM_ != 0F) {
      output.writeFloat(1, diskRadiusM_);
    }
    if (cylRadiusM_ != 0F) {
      output.writeFloat(2, cylRadiusM_);
    }
    if (cylHeightM_ != 0F) {
      output.writeFloat(3, cylHeightM_);
    }
    if (cylGroundM_ != 0F) {
      output.writeFloat(4, cylGroundM_);
    }
    if (shoulderModeScale_ != 0F) {
      output.writeFloat(5, shoulderModeScale_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (diskRadiusM_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, diskRadiusM_);
    }
    if (cylRadiusM_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, cylRadiusM_);
    }
    if (cylHeightM_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, cylHeightM_);
    }
    if (cylGroundM_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, cylGroundM_);
    }
    if (shoulderModeScale_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, shoulderModeScale_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof POGOProtos.Rpc.PokemonCameraAttributesProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PokemonCameraAttributesProto other = (POGOProtos.Rpc.PokemonCameraAttributesProto) obj;

    if (java.lang.Float.floatToIntBits(getDiskRadiusM())
        != java.lang.Float.floatToIntBits(
            other.getDiskRadiusM())) return false;
    if (java.lang.Float.floatToIntBits(getCylRadiusM())
        != java.lang.Float.floatToIntBits(
            other.getCylRadiusM())) return false;
    if (java.lang.Float.floatToIntBits(getCylHeightM())
        != java.lang.Float.floatToIntBits(
            other.getCylHeightM())) return false;
    if (java.lang.Float.floatToIntBits(getCylGroundM())
        != java.lang.Float.floatToIntBits(
            other.getCylGroundM())) return false;
    if (java.lang.Float.floatToIntBits(getShoulderModeScale())
        != java.lang.Float.floatToIntBits(
            other.getShoulderModeScale())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DISK_RADIUS_M_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDiskRadiusM());
    hash = (37 * hash) + CYL_RADIUS_M_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCylRadiusM());
    hash = (37 * hash) + CYL_HEIGHT_M_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCylHeightM());
    hash = (37 * hash) + CYL_GROUND_M_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCylGroundM());
    hash = (37 * hash) + SHOULDER_MODE_SCALE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getShoulderModeScale());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PokemonCameraAttributesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonCameraAttributesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonCameraAttributesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonCameraAttributesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonCameraAttributesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonCameraAttributesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonCameraAttributesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonCameraAttributesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonCameraAttributesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonCameraAttributesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonCameraAttributesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonCameraAttributesProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(POGOProtos.Rpc.PokemonCameraAttributesProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code POGOProtos.Rpc.PokemonCameraAttributesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PokemonCameraAttributesProto)
      POGOProtos.Rpc.PokemonCameraAttributesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonCameraAttributesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonCameraAttributesProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PokemonCameraAttributesProto.class, POGOProtos.Rpc.PokemonCameraAttributesProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PokemonCameraAttributesProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      diskRadiusM_ = 0F;

      cylRadiusM_ = 0F;

      cylHeightM_ = 0F;

      cylGroundM_ = 0F;

      shoulderModeScale_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonCameraAttributesProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonCameraAttributesProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PokemonCameraAttributesProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonCameraAttributesProto build() {
      POGOProtos.Rpc.PokemonCameraAttributesProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonCameraAttributesProto buildPartial() {
      POGOProtos.Rpc.PokemonCameraAttributesProto result = new POGOProtos.Rpc.PokemonCameraAttributesProto(this);
      result.diskRadiusM_ = diskRadiusM_;
      result.cylRadiusM_ = cylRadiusM_;
      result.cylHeightM_ = cylHeightM_;
      result.cylGroundM_ = cylGroundM_;
      result.shoulderModeScale_ = shoulderModeScale_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof POGOProtos.Rpc.PokemonCameraAttributesProto) {
        return mergeFrom((POGOProtos.Rpc.PokemonCameraAttributesProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PokemonCameraAttributesProto other) {
      if (other == POGOProtos.Rpc.PokemonCameraAttributesProto.getDefaultInstance()) return this;
      if (other.getDiskRadiusM() != 0F) {
        setDiskRadiusM(other.getDiskRadiusM());
      }
      if (other.getCylRadiusM() != 0F) {
        setCylRadiusM(other.getCylRadiusM());
      }
      if (other.getCylHeightM() != 0F) {
        setCylHeightM(other.getCylHeightM());
      }
      if (other.getCylGroundM() != 0F) {
        setCylGroundM(other.getCylGroundM());
      }
      if (other.getShoulderModeScale() != 0F) {
        setShoulderModeScale(other.getShoulderModeScale());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      POGOProtos.Rpc.PokemonCameraAttributesProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PokemonCameraAttributesProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float diskRadiusM_ ;
    /**
     * <code>float disk_radius_m = 1;</code>
     * @return The diskRadiusM.
     */
    @java.lang.Override
    public float getDiskRadiusM() {
      return diskRadiusM_;
    }
    /**
     * <code>float disk_radius_m = 1;</code>
     * @param value The diskRadiusM to set.
     * @return This builder for chaining.
     */
    public Builder setDiskRadiusM(float value) {
      
      diskRadiusM_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float disk_radius_m = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDiskRadiusM() {
      
      diskRadiusM_ = 0F;
      onChanged();
      return this;
    }

    private float cylRadiusM_ ;
    /**
     * <code>float cyl_radius_m = 2;</code>
     * @return The cylRadiusM.
     */
    @java.lang.Override
    public float getCylRadiusM() {
      return cylRadiusM_;
    }
    /**
     * <code>float cyl_radius_m = 2;</code>
     * @param value The cylRadiusM to set.
     * @return This builder for chaining.
     */
    public Builder setCylRadiusM(float value) {
      
      cylRadiusM_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cyl_radius_m = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCylRadiusM() {
      
      cylRadiusM_ = 0F;
      onChanged();
      return this;
    }

    private float cylHeightM_ ;
    /**
     * <code>float cyl_height_m = 3;</code>
     * @return The cylHeightM.
     */
    @java.lang.Override
    public float getCylHeightM() {
      return cylHeightM_;
    }
    /**
     * <code>float cyl_height_m = 3;</code>
     * @param value The cylHeightM to set.
     * @return This builder for chaining.
     */
    public Builder setCylHeightM(float value) {
      
      cylHeightM_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cyl_height_m = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCylHeightM() {
      
      cylHeightM_ = 0F;
      onChanged();
      return this;
    }

    private float cylGroundM_ ;
    /**
     * <code>float cyl_ground_m = 4;</code>
     * @return The cylGroundM.
     */
    @java.lang.Override
    public float getCylGroundM() {
      return cylGroundM_;
    }
    /**
     * <code>float cyl_ground_m = 4;</code>
     * @param value The cylGroundM to set.
     * @return This builder for chaining.
     */
    public Builder setCylGroundM(float value) {
      
      cylGroundM_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cyl_ground_m = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCylGroundM() {
      
      cylGroundM_ = 0F;
      onChanged();
      return this;
    }

    private float shoulderModeScale_ ;
    /**
     * <code>float shoulder_mode_scale = 5;</code>
     * @return The shoulderModeScale.
     */
    @java.lang.Override
    public float getShoulderModeScale() {
      return shoulderModeScale_;
    }
    /**
     * <code>float shoulder_mode_scale = 5;</code>
     * @param value The shoulderModeScale to set.
     * @return This builder for chaining.
     */
    public Builder setShoulderModeScale(float value) {
      
      shoulderModeScale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float shoulder_mode_scale = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearShoulderModeScale() {
      
      shoulderModeScale_ = 0F;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PokemonCameraAttributesProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PokemonCameraAttributesProto)
  private static final POGOProtos.Rpc.PokemonCameraAttributesProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PokemonCameraAttributesProto();
  }

  public static POGOProtos.Rpc.PokemonCameraAttributesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokemonCameraAttributesProto>
      PARSER = new com.google.protobuf.AbstractParser<PokemonCameraAttributesProto>() {
    @java.lang.Override
    public PokemonCameraAttributesProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokemonCameraAttributesProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokemonCameraAttributesProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokemonCameraAttributesProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PokemonCameraAttributesProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

