// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.DiskEncounterProto}
 */
public final class DiskEncounterProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DiskEncounterProto)
    DiskEncounterProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DiskEncounterProto.newBuilder() to construct.
  private DiskEncounterProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiskEncounterProto() {
    fortId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DiskEncounterProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DiskEncounterProto(
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
          case 8: {

            encounterId_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fortId_ = s;
            break;
          }
          case 25: {

            playerLatDegrees_ = input.readDouble();
            break;
          }
          case 33: {

            playerLngDegrees_ = input.readDouble();
            break;
          }
          case 41: {

            gymLatDegrees_ = input.readDouble();
            break;
          }
          case 49: {

            gymLngDegrees_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DiskEncounterProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DiskEncounterProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DiskEncounterProto.class, POGOProtos.Rpc.DiskEncounterProto.Builder.class);
  }

  public static final int ENCOUNTER_ID_FIELD_NUMBER = 1;
  private long encounterId_;
  /**
   * <code>int64 encounter_id = 1;</code>
   * @return The encounterId.
   */
  @java.lang.Override
  public long getEncounterId() {
    return encounterId_;
  }

  public static final int FORT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object fortId_;
  /**
   * <code>string fort_id = 2;</code>
   * @return The fortId.
   */
  @java.lang.Override
  public java.lang.String getFortId() {
    java.lang.Object ref = fortId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fortId_ = s;
      return s;
    }
  }
  /**
   * <code>string fort_id = 2;</code>
   * @return The bytes for fortId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFortIdBytes() {
    java.lang.Object ref = fortId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fortId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAYER_LAT_DEGREES_FIELD_NUMBER = 3;
  private double playerLatDegrees_;
  /**
   * <code>double player_lat_degrees = 3;</code>
   * @return The playerLatDegrees.
   */
  @java.lang.Override
  public double getPlayerLatDegrees() {
    return playerLatDegrees_;
  }

  public static final int PLAYER_LNG_DEGREES_FIELD_NUMBER = 4;
  private double playerLngDegrees_;
  /**
   * <code>double player_lng_degrees = 4;</code>
   * @return The playerLngDegrees.
   */
  @java.lang.Override
  public double getPlayerLngDegrees() {
    return playerLngDegrees_;
  }

  public static final int GYM_LAT_DEGREES_FIELD_NUMBER = 5;
  private double gymLatDegrees_;
  /**
   * <code>double gym_lat_degrees = 5;</code>
   * @return The gymLatDegrees.
   */
  @java.lang.Override
  public double getGymLatDegrees() {
    return gymLatDegrees_;
  }

  public static final int GYM_LNG_DEGREES_FIELD_NUMBER = 6;
  private double gymLngDegrees_;
  /**
   * <code>double gym_lng_degrees = 6;</code>
   * @return The gymLngDegrees.
   */
  @java.lang.Override
  public double getGymLngDegrees() {
    return gymLngDegrees_;
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
    if (encounterId_ != 0L) {
      output.writeInt64(1, encounterId_);
    }
    if (!getFortIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fortId_);
    }
    if (playerLatDegrees_ != 0D) {
      output.writeDouble(3, playerLatDegrees_);
    }
    if (playerLngDegrees_ != 0D) {
      output.writeDouble(4, playerLngDegrees_);
    }
    if (gymLatDegrees_ != 0D) {
      output.writeDouble(5, gymLatDegrees_);
    }
    if (gymLngDegrees_ != 0D) {
      output.writeDouble(6, gymLngDegrees_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (encounterId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, encounterId_);
    }
    if (!getFortIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fortId_);
    }
    if (playerLatDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, playerLatDegrees_);
    }
    if (playerLngDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, playerLngDegrees_);
    }
    if (gymLatDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, gymLatDegrees_);
    }
    if (gymLngDegrees_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, gymLngDegrees_);
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
    if (!(obj instanceof POGOProtos.Rpc.DiskEncounterProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DiskEncounterProto other = (POGOProtos.Rpc.DiskEncounterProto) obj;

    if (getEncounterId()
        != other.getEncounterId()) return false;
    if (!getFortId()
        .equals(other.getFortId())) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLatDegrees())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLatDegrees())) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLngDegrees())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLngDegrees())) return false;
    if (java.lang.Double.doubleToLongBits(getGymLatDegrees())
        != java.lang.Double.doubleToLongBits(
            other.getGymLatDegrees())) return false;
    if (java.lang.Double.doubleToLongBits(getGymLngDegrees())
        != java.lang.Double.doubleToLongBits(
            other.getGymLngDegrees())) return false;
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
    hash = (37 * hash) + ENCOUNTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEncounterId());
    hash = (37 * hash) + FORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFortId().hashCode();
    hash = (37 * hash) + PLAYER_LAT_DEGREES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLatDegrees()));
    hash = (37 * hash) + PLAYER_LNG_DEGREES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLngDegrees()));
    hash = (37 * hash) + GYM_LAT_DEGREES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getGymLatDegrees()));
    hash = (37 * hash) + GYM_LNG_DEGREES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getGymLngDegrees()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DiskEncounterProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DiskEncounterProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DiskEncounterProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DiskEncounterProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DiskEncounterProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DiskEncounterProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DiskEncounterProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DiskEncounterProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DiskEncounterProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DiskEncounterProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DiskEncounterProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DiskEncounterProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DiskEncounterProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.DiskEncounterProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DiskEncounterProto)
      POGOProtos.Rpc.DiskEncounterProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DiskEncounterProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DiskEncounterProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DiskEncounterProto.class, POGOProtos.Rpc.DiskEncounterProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DiskEncounterProto.newBuilder()
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
      encounterId_ = 0L;

      fortId_ = "";

      playerLatDegrees_ = 0D;

      playerLngDegrees_ = 0D;

      gymLatDegrees_ = 0D;

      gymLngDegrees_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DiskEncounterProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DiskEncounterProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.DiskEncounterProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DiskEncounterProto build() {
      POGOProtos.Rpc.DiskEncounterProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DiskEncounterProto buildPartial() {
      POGOProtos.Rpc.DiskEncounterProto result = new POGOProtos.Rpc.DiskEncounterProto(this);
      result.encounterId_ = encounterId_;
      result.fortId_ = fortId_;
      result.playerLatDegrees_ = playerLatDegrees_;
      result.playerLngDegrees_ = playerLngDegrees_;
      result.gymLatDegrees_ = gymLatDegrees_;
      result.gymLngDegrees_ = gymLngDegrees_;
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
      if (other instanceof POGOProtos.Rpc.DiskEncounterProto) {
        return mergeFrom((POGOProtos.Rpc.DiskEncounterProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DiskEncounterProto other) {
      if (other == POGOProtos.Rpc.DiskEncounterProto.getDefaultInstance()) return this;
      if (other.getEncounterId() != 0L) {
        setEncounterId(other.getEncounterId());
      }
      if (!other.getFortId().isEmpty()) {
        fortId_ = other.fortId_;
        onChanged();
      }
      if (other.getPlayerLatDegrees() != 0D) {
        setPlayerLatDegrees(other.getPlayerLatDegrees());
      }
      if (other.getPlayerLngDegrees() != 0D) {
        setPlayerLngDegrees(other.getPlayerLngDegrees());
      }
      if (other.getGymLatDegrees() != 0D) {
        setGymLatDegrees(other.getGymLatDegrees());
      }
      if (other.getGymLngDegrees() != 0D) {
        setGymLngDegrees(other.getGymLngDegrees());
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
      POGOProtos.Rpc.DiskEncounterProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DiskEncounterProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long encounterId_ ;
    /**
     * <code>int64 encounter_id = 1;</code>
     * @return The encounterId.
     */
    @java.lang.Override
    public long getEncounterId() {
      return encounterId_;
    }
    /**
     * <code>int64 encounter_id = 1;</code>
     * @param value The encounterId to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterId(long value) {
      
      encounterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 encounter_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncounterId() {
      
      encounterId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object fortId_ = "";
    /**
     * <code>string fort_id = 2;</code>
     * @return The fortId.
     */
    public java.lang.String getFortId() {
      java.lang.Object ref = fortId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fortId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fort_id = 2;</code>
     * @return The bytes for fortId.
     */
    public com.google.protobuf.ByteString
        getFortIdBytes() {
      java.lang.Object ref = fortId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fortId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fort_id = 2;</code>
     * @param value The fortId to set.
     * @return This builder for chaining.
     */
    public Builder setFortId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fortId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fort_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFortId() {
      
      fortId_ = getDefaultInstance().getFortId();
      onChanged();
      return this;
    }
    /**
     * <code>string fort_id = 2;</code>
     * @param value The bytes for fortId to set.
     * @return This builder for chaining.
     */
    public Builder setFortIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fortId_ = value;
      onChanged();
      return this;
    }

    private double playerLatDegrees_ ;
    /**
     * <code>double player_lat_degrees = 3;</code>
     * @return The playerLatDegrees.
     */
    @java.lang.Override
    public double getPlayerLatDegrees() {
      return playerLatDegrees_;
    }
    /**
     * <code>double player_lat_degrees = 3;</code>
     * @param value The playerLatDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLatDegrees(double value) {
      
      playerLatDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lat_degrees = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLatDegrees() {
      
      playerLatDegrees_ = 0D;
      onChanged();
      return this;
    }

    private double playerLngDegrees_ ;
    /**
     * <code>double player_lng_degrees = 4;</code>
     * @return The playerLngDegrees.
     */
    @java.lang.Override
    public double getPlayerLngDegrees() {
      return playerLngDegrees_;
    }
    /**
     * <code>double player_lng_degrees = 4;</code>
     * @param value The playerLngDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLngDegrees(double value) {
      
      playerLngDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lng_degrees = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLngDegrees() {
      
      playerLngDegrees_ = 0D;
      onChanged();
      return this;
    }

    private double gymLatDegrees_ ;
    /**
     * <code>double gym_lat_degrees = 5;</code>
     * @return The gymLatDegrees.
     */
    @java.lang.Override
    public double getGymLatDegrees() {
      return gymLatDegrees_;
    }
    /**
     * <code>double gym_lat_degrees = 5;</code>
     * @param value The gymLatDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setGymLatDegrees(double value) {
      
      gymLatDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gym_lat_degrees = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymLatDegrees() {
      
      gymLatDegrees_ = 0D;
      onChanged();
      return this;
    }

    private double gymLngDegrees_ ;
    /**
     * <code>double gym_lng_degrees = 6;</code>
     * @return The gymLngDegrees.
     */
    @java.lang.Override
    public double getGymLngDegrees() {
      return gymLngDegrees_;
    }
    /**
     * <code>double gym_lng_degrees = 6;</code>
     * @param value The gymLngDegrees to set.
     * @return This builder for chaining.
     */
    public Builder setGymLngDegrees(double value) {
      
      gymLngDegrees_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gym_lng_degrees = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymLngDegrees() {
      
      gymLngDegrees_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DiskEncounterProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DiskEncounterProto)
  private static final POGOProtos.Rpc.DiskEncounterProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DiskEncounterProto();
  }

  public static POGOProtos.Rpc.DiskEncounterProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiskEncounterProto>
      PARSER = new com.google.protobuf.AbstractParser<DiskEncounterProto>() {
    @java.lang.Override
    public DiskEncounterProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DiskEncounterProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DiskEncounterProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiskEncounterProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DiskEncounterProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

