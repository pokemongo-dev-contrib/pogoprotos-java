// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.SfidaCaptureRequest}
 */
public final class SfidaCaptureRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.SfidaCaptureRequest)
    SfidaCaptureRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SfidaCaptureRequest.newBuilder() to construct.
  private SfidaCaptureRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SfidaCaptureRequest() {
    spawnpointId_ = "";
    encounterType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SfidaCaptureRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SfidaCaptureRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            spawnpointId_ = s;
            break;
          }
          case 16: {

            encounterId_ = input.readInt64();
            break;
          }
          case 25: {

            playerLat_ = input.readDouble();
            break;
          }
          case 33: {

            playerLng_ = input.readDouble();
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            encounterType_ = rawValue;
            break;
          }
          case 49: {

            gymLat_ = input.readDouble();
            break;
          }
          case 57: {

            gymLng_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SfidaCaptureRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SfidaCaptureRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.SfidaCaptureRequest.class, POGOProtos.Rpc.SfidaCaptureRequest.Builder.class);
  }

  public static final int SPAWNPOINT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object spawnpointId_;
  /**
   * <code>string spawnpoint_id = 1;</code>
   * @return The spawnpointId.
   */
  @java.lang.Override
  public java.lang.String getSpawnpointId() {
    java.lang.Object ref = spawnpointId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spawnpointId_ = s;
      return s;
    }
  }
  /**
   * <code>string spawnpoint_id = 1;</code>
   * @return The bytes for spawnpointId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpawnpointIdBytes() {
    java.lang.Object ref = spawnpointId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spawnpointId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENCOUNTER_ID_FIELD_NUMBER = 2;
  private long encounterId_;
  /**
   * <code>int64 encounter_id = 2;</code>
   * @return The encounterId.
   */
  @java.lang.Override
  public long getEncounterId() {
    return encounterId_;
  }

  public static final int PLAYER_LAT_FIELD_NUMBER = 3;
  private double playerLat_;
  /**
   * <code>double player_lat = 3;</code>
   * @return The playerLat.
   */
  @java.lang.Override
  public double getPlayerLat() {
    return playerLat_;
  }

  public static final int PLAYER_LNG_FIELD_NUMBER = 4;
  private double playerLng_;
  /**
   * <code>double player_lng = 4;</code>
   * @return The playerLng.
   */
  @java.lang.Override
  public double getPlayerLng() {
    return playerLng_;
  }

  public static final int ENCOUNTER_TYPE_FIELD_NUMBER = 5;
  private int encounterType_;
  /**
   * <code>.POGOProtos.Rpc.EncounterType encounter_type = 5;</code>
   * @return The enum numeric value on the wire for encounterType.
   */
  @java.lang.Override public int getEncounterTypeValue() {
    return encounterType_;
  }
  /**
   * <code>.POGOProtos.Rpc.EncounterType encounter_type = 5;</code>
   * @return The encounterType.
   */
  @java.lang.Override public POGOProtos.Rpc.EncounterType getEncounterType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EncounterType result = POGOProtos.Rpc.EncounterType.valueOf(encounterType_);
    return result == null ? POGOProtos.Rpc.EncounterType.UNRECOGNIZED : result;
  }

  public static final int GYM_LAT_FIELD_NUMBER = 6;
  private double gymLat_;
  /**
   * <code>double gym_lat = 6;</code>
   * @return The gymLat.
   */
  @java.lang.Override
  public double getGymLat() {
    return gymLat_;
  }

  public static final int GYM_LNG_FIELD_NUMBER = 7;
  private double gymLng_;
  /**
   * <code>double gym_lng = 7;</code>
   * @return The gymLng.
   */
  @java.lang.Override
  public double getGymLng() {
    return gymLng_;
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
    if (!getSpawnpointIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spawnpointId_);
    }
    if (encounterId_ != 0L) {
      output.writeInt64(2, encounterId_);
    }
    if (playerLat_ != 0D) {
      output.writeDouble(3, playerLat_);
    }
    if (playerLng_ != 0D) {
      output.writeDouble(4, playerLng_);
    }
    if (encounterType_ != POGOProtos.Rpc.EncounterType.ENCOUNTER_TYPE_SPAWN_POINT.getNumber()) {
      output.writeEnum(5, encounterType_);
    }
    if (gymLat_ != 0D) {
      output.writeDouble(6, gymLat_);
    }
    if (gymLng_ != 0D) {
      output.writeDouble(7, gymLng_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSpawnpointIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spawnpointId_);
    }
    if (encounterId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, encounterId_);
    }
    if (playerLat_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, playerLat_);
    }
    if (playerLng_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, playerLng_);
    }
    if (encounterType_ != POGOProtos.Rpc.EncounterType.ENCOUNTER_TYPE_SPAWN_POINT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, encounterType_);
    }
    if (gymLat_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, gymLat_);
    }
    if (gymLng_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, gymLng_);
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
    if (!(obj instanceof POGOProtos.Rpc.SfidaCaptureRequest)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.SfidaCaptureRequest other = (POGOProtos.Rpc.SfidaCaptureRequest) obj;

    if (!getSpawnpointId()
        .equals(other.getSpawnpointId())) return false;
    if (getEncounterId()
        != other.getEncounterId()) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLat())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLat())) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLng())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLng())) return false;
    if (encounterType_ != other.encounterType_) return false;
    if (java.lang.Double.doubleToLongBits(getGymLat())
        != java.lang.Double.doubleToLongBits(
            other.getGymLat())) return false;
    if (java.lang.Double.doubleToLongBits(getGymLng())
        != java.lang.Double.doubleToLongBits(
            other.getGymLng())) return false;
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
    hash = (37 * hash) + SPAWNPOINT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSpawnpointId().hashCode();
    hash = (37 * hash) + ENCOUNTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEncounterId());
    hash = (37 * hash) + PLAYER_LAT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLat()));
    hash = (37 * hash) + PLAYER_LNG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLng()));
    hash = (37 * hash) + ENCOUNTER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + encounterType_;
    hash = (37 * hash) + GYM_LAT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getGymLat()));
    hash = (37 * hash) + GYM_LNG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getGymLng()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.SfidaCaptureRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SfidaCaptureRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SfidaCaptureRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SfidaCaptureRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SfidaCaptureRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SfidaCaptureRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SfidaCaptureRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SfidaCaptureRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SfidaCaptureRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SfidaCaptureRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SfidaCaptureRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SfidaCaptureRequest parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.SfidaCaptureRequest prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.SfidaCaptureRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.SfidaCaptureRequest)
      POGOProtos.Rpc.SfidaCaptureRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SfidaCaptureRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SfidaCaptureRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.SfidaCaptureRequest.class, POGOProtos.Rpc.SfidaCaptureRequest.Builder.class);
    }

    // Construct using POGOProtos.Rpc.SfidaCaptureRequest.newBuilder()
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
      spawnpointId_ = "";

      encounterId_ = 0L;

      playerLat_ = 0D;

      playerLng_ = 0D;

      encounterType_ = 0;

      gymLat_ = 0D;

      gymLng_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SfidaCaptureRequest_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SfidaCaptureRequest getDefaultInstanceForType() {
      return POGOProtos.Rpc.SfidaCaptureRequest.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.SfidaCaptureRequest build() {
      POGOProtos.Rpc.SfidaCaptureRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SfidaCaptureRequest buildPartial() {
      POGOProtos.Rpc.SfidaCaptureRequest result = new POGOProtos.Rpc.SfidaCaptureRequest(this);
      result.spawnpointId_ = spawnpointId_;
      result.encounterId_ = encounterId_;
      result.playerLat_ = playerLat_;
      result.playerLng_ = playerLng_;
      result.encounterType_ = encounterType_;
      result.gymLat_ = gymLat_;
      result.gymLng_ = gymLng_;
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
      if (other instanceof POGOProtos.Rpc.SfidaCaptureRequest) {
        return mergeFrom((POGOProtos.Rpc.SfidaCaptureRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.SfidaCaptureRequest other) {
      if (other == POGOProtos.Rpc.SfidaCaptureRequest.getDefaultInstance()) return this;
      if (!other.getSpawnpointId().isEmpty()) {
        spawnpointId_ = other.spawnpointId_;
        onChanged();
      }
      if (other.getEncounterId() != 0L) {
        setEncounterId(other.getEncounterId());
      }
      if (other.getPlayerLat() != 0D) {
        setPlayerLat(other.getPlayerLat());
      }
      if (other.getPlayerLng() != 0D) {
        setPlayerLng(other.getPlayerLng());
      }
      if (other.encounterType_ != 0) {
        setEncounterTypeValue(other.getEncounterTypeValue());
      }
      if (other.getGymLat() != 0D) {
        setGymLat(other.getGymLat());
      }
      if (other.getGymLng() != 0D) {
        setGymLng(other.getGymLng());
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
      POGOProtos.Rpc.SfidaCaptureRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.SfidaCaptureRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object spawnpointId_ = "";
    /**
     * <code>string spawnpoint_id = 1;</code>
     * @return The spawnpointId.
     */
    public java.lang.String getSpawnpointId() {
      java.lang.Object ref = spawnpointId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spawnpointId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string spawnpoint_id = 1;</code>
     * @return The bytes for spawnpointId.
     */
    public com.google.protobuf.ByteString
        getSpawnpointIdBytes() {
      java.lang.Object ref = spawnpointId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spawnpointId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string spawnpoint_id = 1;</code>
     * @param value The spawnpointId to set.
     * @return This builder for chaining.
     */
    public Builder setSpawnpointId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spawnpointId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string spawnpoint_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpawnpointId() {
      
      spawnpointId_ = getDefaultInstance().getSpawnpointId();
      onChanged();
      return this;
    }
    /**
     * <code>string spawnpoint_id = 1;</code>
     * @param value The bytes for spawnpointId to set.
     * @return This builder for chaining.
     */
    public Builder setSpawnpointIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spawnpointId_ = value;
      onChanged();
      return this;
    }

    private long encounterId_ ;
    /**
     * <code>int64 encounter_id = 2;</code>
     * @return The encounterId.
     */
    @java.lang.Override
    public long getEncounterId() {
      return encounterId_;
    }
    /**
     * <code>int64 encounter_id = 2;</code>
     * @param value The encounterId to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterId(long value) {
      
      encounterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 encounter_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncounterId() {
      
      encounterId_ = 0L;
      onChanged();
      return this;
    }

    private double playerLat_ ;
    /**
     * <code>double player_lat = 3;</code>
     * @return The playerLat.
     */
    @java.lang.Override
    public double getPlayerLat() {
      return playerLat_;
    }
    /**
     * <code>double player_lat = 3;</code>
     * @param value The playerLat to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLat(double value) {
      
      playerLat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lat = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLat() {
      
      playerLat_ = 0D;
      onChanged();
      return this;
    }

    private double playerLng_ ;
    /**
     * <code>double player_lng = 4;</code>
     * @return The playerLng.
     */
    @java.lang.Override
    public double getPlayerLng() {
      return playerLng_;
    }
    /**
     * <code>double player_lng = 4;</code>
     * @param value The playerLng to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLng(double value) {
      
      playerLng_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lng = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLng() {
      
      playerLng_ = 0D;
      onChanged();
      return this;
    }

    private int encounterType_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EncounterType encounter_type = 5;</code>
     * @return The enum numeric value on the wire for encounterType.
     */
    @java.lang.Override public int getEncounterTypeValue() {
      return encounterType_;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterType encounter_type = 5;</code>
     * @param value The enum numeric value on the wire for encounterType to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterTypeValue(int value) {
      
      encounterType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterType encounter_type = 5;</code>
     * @return The encounterType.
     */
    @java.lang.Override
    public POGOProtos.Rpc.EncounterType getEncounterType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EncounterType result = POGOProtos.Rpc.EncounterType.valueOf(encounterType_);
      return result == null ? POGOProtos.Rpc.EncounterType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterType encounter_type = 5;</code>
     * @param value The encounterType to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterType(POGOProtos.Rpc.EncounterType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      encounterType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterType encounter_type = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncounterType() {
      
      encounterType_ = 0;
      onChanged();
      return this;
    }

    private double gymLat_ ;
    /**
     * <code>double gym_lat = 6;</code>
     * @return The gymLat.
     */
    @java.lang.Override
    public double getGymLat() {
      return gymLat_;
    }
    /**
     * <code>double gym_lat = 6;</code>
     * @param value The gymLat to set.
     * @return This builder for chaining.
     */
    public Builder setGymLat(double value) {
      
      gymLat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gym_lat = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymLat() {
      
      gymLat_ = 0D;
      onChanged();
      return this;
    }

    private double gymLng_ ;
    /**
     * <code>double gym_lng = 7;</code>
     * @return The gymLng.
     */
    @java.lang.Override
    public double getGymLng() {
      return gymLng_;
    }
    /**
     * <code>double gym_lng = 7;</code>
     * @param value The gymLng to set.
     * @return This builder for chaining.
     */
    public Builder setGymLng(double value) {
      
      gymLng_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gym_lng = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymLng() {
      
      gymLng_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.SfidaCaptureRequest)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.SfidaCaptureRequest)
  private static final POGOProtos.Rpc.SfidaCaptureRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.SfidaCaptureRequest();
  }

  public static POGOProtos.Rpc.SfidaCaptureRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SfidaCaptureRequest>
      PARSER = new com.google.protobuf.AbstractParser<SfidaCaptureRequest>() {
    @java.lang.Override
    public SfidaCaptureRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SfidaCaptureRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SfidaCaptureRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SfidaCaptureRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.SfidaCaptureRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

