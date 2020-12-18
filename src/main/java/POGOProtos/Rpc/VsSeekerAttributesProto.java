// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.VsSeekerAttributesProto}
 */
public final class VsSeekerAttributesProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.VsSeekerAttributesProto)
    VsSeekerAttributesProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VsSeekerAttributesProto.newBuilder() to construct.
  private VsSeekerAttributesProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VsSeekerAttributesProto() {
    vsSeekerStatus_ = 0;
    rewardTrack_ = 0;
    battleNowSkuId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VsSeekerAttributesProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VsSeekerAttributesProto(
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
            int rawValue = input.readEnum();

            vsSeekerStatus_ = rawValue;
            break;
          }
          case 17: {

            startKmWalked_ = input.readDouble();
            break;
          }
          case 25: {

            targetKmWalked_ = input.readDouble();
            break;
          }
          case 32: {

            battleGrantedRemaining_ = input.readInt32();
            break;
          }
          case 48: {

            maxBattlesInSet_ = input.readInt32();
            break;
          }
          case 56: {
            int rawValue = input.readEnum();

            rewardTrack_ = rawValue;
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            battleNowSkuId_ = s;
            break;
          }
          case 72: {

            additionalBattlesGranted_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_VsSeekerAttributesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_VsSeekerAttributesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.VsSeekerAttributesProto.class, POGOProtos.Rpc.VsSeekerAttributesProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus}
   */
  public enum VsSeekerStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>STARTED_CHARGING = 1;</code>
     */
    STARTED_CHARGING(1),
    /**
     * <code>FULLY_CHARGED = 2;</code>
     */
    FULLY_CHARGED(2),
    /**
     * <code>ACTIVATED = 3;</code>
     */
    ACTIVATED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>STARTED_CHARGING = 1;</code>
     */
    public static final int STARTED_CHARGING_VALUE = 1;
    /**
     * <code>FULLY_CHARGED = 2;</code>
     */
    public static final int FULLY_CHARGED_VALUE = 2;
    /**
     * <code>ACTIVATED = 3;</code>
     */
    public static final int ACTIVATED_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static VsSeekerStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static VsSeekerStatus forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return STARTED_CHARGING;
        case 2: return FULLY_CHARGED;
        case 3: return ACTIVATED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VsSeekerStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        VsSeekerStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VsSeekerStatus>() {
            public VsSeekerStatus findValueByNumber(int number) {
              return VsSeekerStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.VsSeekerAttributesProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final VsSeekerStatus[] VALUES = values();

    public static VsSeekerStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private VsSeekerStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus)
  }

  public static final int VS_SEEKER_STATUS_FIELD_NUMBER = 1;
  private int vsSeekerStatus_;
  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus vs_seeker_status = 1;</code>
   * @return The enum numeric value on the wire for vsSeekerStatus.
   */
  @java.lang.Override public int getVsSeekerStatusValue() {
    return vsSeekerStatus_;
  }
  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus vs_seeker_status = 1;</code>
   * @return The vsSeekerStatus.
   */
  @java.lang.Override public POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus getVsSeekerStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus result = POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus.valueOf(vsSeekerStatus_);
    return result == null ? POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus.UNRECOGNIZED : result;
  }

  public static final int START_KM_WALKED_FIELD_NUMBER = 2;
  private double startKmWalked_;
  /**
   * <code>double start_km_walked = 2;</code>
   * @return The startKmWalked.
   */
  @java.lang.Override
  public double getStartKmWalked() {
    return startKmWalked_;
  }

  public static final int TARGET_KM_WALKED_FIELD_NUMBER = 3;
  private double targetKmWalked_;
  /**
   * <code>double target_km_walked = 3;</code>
   * @return The targetKmWalked.
   */
  @java.lang.Override
  public double getTargetKmWalked() {
    return targetKmWalked_;
  }

  public static final int BATTLE_GRANTED_REMAINING_FIELD_NUMBER = 4;
  private int battleGrantedRemaining_;
  /**
   * <code>int32 battle_granted_remaining = 4;</code>
   * @return The battleGrantedRemaining.
   */
  @java.lang.Override
  public int getBattleGrantedRemaining() {
    return battleGrantedRemaining_;
  }

  public static final int MAX_BATTLES_IN_SET_FIELD_NUMBER = 6;
  private int maxBattlesInSet_;
  /**
   * <code>int32 max_battles_in_set = 6;</code>
   * @return The maxBattlesInSet.
   */
  @java.lang.Override
  public int getMaxBattlesInSet() {
    return maxBattlesInSet_;
  }

  public static final int REWARD_TRACK_FIELD_NUMBER = 7;
  private int rewardTrack_;
  /**
   * <code>.POGOProtos.Rpc.VsSeekerRewardTrack reward_track = 7;</code>
   * @return The enum numeric value on the wire for rewardTrack.
   */
  @java.lang.Override public int getRewardTrackValue() {
    return rewardTrack_;
  }
  /**
   * <code>.POGOProtos.Rpc.VsSeekerRewardTrack reward_track = 7;</code>
   * @return The rewardTrack.
   */
  @java.lang.Override public POGOProtos.Rpc.VsSeekerRewardTrack getRewardTrack() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.VsSeekerRewardTrack result = POGOProtos.Rpc.VsSeekerRewardTrack.valueOf(rewardTrack_);
    return result == null ? POGOProtos.Rpc.VsSeekerRewardTrack.UNRECOGNIZED : result;
  }

  public static final int BATTLE_NOW_SKU_ID_FIELD_NUMBER = 8;
  private volatile java.lang.Object battleNowSkuId_;
  /**
   * <code>string battle_now_sku_id = 8;</code>
   * @return The battleNowSkuId.
   */
  @java.lang.Override
  public java.lang.String getBattleNowSkuId() {
    java.lang.Object ref = battleNowSkuId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      battleNowSkuId_ = s;
      return s;
    }
  }
  /**
   * <code>string battle_now_sku_id = 8;</code>
   * @return The bytes for battleNowSkuId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBattleNowSkuIdBytes() {
    java.lang.Object ref = battleNowSkuId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      battleNowSkuId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDITIONAL_BATTLES_GRANTED_FIELD_NUMBER = 9;
  private boolean additionalBattlesGranted_;
  /**
   * <code>bool additional_battles_granted = 9;</code>
   * @return The additionalBattlesGranted.
   */
  @java.lang.Override
  public boolean getAdditionalBattlesGranted() {
    return additionalBattlesGranted_;
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
    if (vsSeekerStatus_ != POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus.UNSET.getNumber()) {
      output.writeEnum(1, vsSeekerStatus_);
    }
    if (startKmWalked_ != 0D) {
      output.writeDouble(2, startKmWalked_);
    }
    if (targetKmWalked_ != 0D) {
      output.writeDouble(3, targetKmWalked_);
    }
    if (battleGrantedRemaining_ != 0) {
      output.writeInt32(4, battleGrantedRemaining_);
    }
    if (maxBattlesInSet_ != 0) {
      output.writeInt32(6, maxBattlesInSet_);
    }
    if (rewardTrack_ != POGOProtos.Rpc.VsSeekerRewardTrack.VS_SEEKER_REWARD_TRACK_FREE.getNumber()) {
      output.writeEnum(7, rewardTrack_);
    }
    if (!getBattleNowSkuIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, battleNowSkuId_);
    }
    if (additionalBattlesGranted_ != false) {
      output.writeBool(9, additionalBattlesGranted_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (vsSeekerStatus_ != POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, vsSeekerStatus_);
    }
    if (startKmWalked_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, startKmWalked_);
    }
    if (targetKmWalked_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, targetKmWalked_);
    }
    if (battleGrantedRemaining_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, battleGrantedRemaining_);
    }
    if (maxBattlesInSet_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, maxBattlesInSet_);
    }
    if (rewardTrack_ != POGOProtos.Rpc.VsSeekerRewardTrack.VS_SEEKER_REWARD_TRACK_FREE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, rewardTrack_);
    }
    if (!getBattleNowSkuIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, battleNowSkuId_);
    }
    if (additionalBattlesGranted_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, additionalBattlesGranted_);
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
    if (!(obj instanceof POGOProtos.Rpc.VsSeekerAttributesProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.VsSeekerAttributesProto other = (POGOProtos.Rpc.VsSeekerAttributesProto) obj;

    if (vsSeekerStatus_ != other.vsSeekerStatus_) return false;
    if (java.lang.Double.doubleToLongBits(getStartKmWalked())
        != java.lang.Double.doubleToLongBits(
            other.getStartKmWalked())) return false;
    if (java.lang.Double.doubleToLongBits(getTargetKmWalked())
        != java.lang.Double.doubleToLongBits(
            other.getTargetKmWalked())) return false;
    if (getBattleGrantedRemaining()
        != other.getBattleGrantedRemaining()) return false;
    if (getMaxBattlesInSet()
        != other.getMaxBattlesInSet()) return false;
    if (rewardTrack_ != other.rewardTrack_) return false;
    if (!getBattleNowSkuId()
        .equals(other.getBattleNowSkuId())) return false;
    if (getAdditionalBattlesGranted()
        != other.getAdditionalBattlesGranted()) return false;
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
    hash = (37 * hash) + VS_SEEKER_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + vsSeekerStatus_;
    hash = (37 * hash) + START_KM_WALKED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getStartKmWalked()));
    hash = (37 * hash) + TARGET_KM_WALKED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTargetKmWalked()));
    hash = (37 * hash) + BATTLE_GRANTED_REMAINING_FIELD_NUMBER;
    hash = (53 * hash) + getBattleGrantedRemaining();
    hash = (37 * hash) + MAX_BATTLES_IN_SET_FIELD_NUMBER;
    hash = (53 * hash) + getMaxBattlesInSet();
    hash = (37 * hash) + REWARD_TRACK_FIELD_NUMBER;
    hash = (53 * hash) + rewardTrack_;
    hash = (37 * hash) + BATTLE_NOW_SKU_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBattleNowSkuId().hashCode();
    hash = (37 * hash) + ADDITIONAL_BATTLES_GRANTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAdditionalBattlesGranted());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.VsSeekerAttributesProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.VsSeekerAttributesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.VsSeekerAttributesProto)
      POGOProtos.Rpc.VsSeekerAttributesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_VsSeekerAttributesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_VsSeekerAttributesProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.VsSeekerAttributesProto.class, POGOProtos.Rpc.VsSeekerAttributesProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.VsSeekerAttributesProto.newBuilder()
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
      vsSeekerStatus_ = 0;

      startKmWalked_ = 0D;

      targetKmWalked_ = 0D;

      battleGrantedRemaining_ = 0;

      maxBattlesInSet_ = 0;

      rewardTrack_ = 0;

      battleNowSkuId_ = "";

      additionalBattlesGranted_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_VsSeekerAttributesProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.VsSeekerAttributesProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.VsSeekerAttributesProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.VsSeekerAttributesProto build() {
      POGOProtos.Rpc.VsSeekerAttributesProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.VsSeekerAttributesProto buildPartial() {
      POGOProtos.Rpc.VsSeekerAttributesProto result = new POGOProtos.Rpc.VsSeekerAttributesProto(this);
      result.vsSeekerStatus_ = vsSeekerStatus_;
      result.startKmWalked_ = startKmWalked_;
      result.targetKmWalked_ = targetKmWalked_;
      result.battleGrantedRemaining_ = battleGrantedRemaining_;
      result.maxBattlesInSet_ = maxBattlesInSet_;
      result.rewardTrack_ = rewardTrack_;
      result.battleNowSkuId_ = battleNowSkuId_;
      result.additionalBattlesGranted_ = additionalBattlesGranted_;
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
      if (other instanceof POGOProtos.Rpc.VsSeekerAttributesProto) {
        return mergeFrom((POGOProtos.Rpc.VsSeekerAttributesProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.VsSeekerAttributesProto other) {
      if (other == POGOProtos.Rpc.VsSeekerAttributesProto.getDefaultInstance()) return this;
      if (other.vsSeekerStatus_ != 0) {
        setVsSeekerStatusValue(other.getVsSeekerStatusValue());
      }
      if (other.getStartKmWalked() != 0D) {
        setStartKmWalked(other.getStartKmWalked());
      }
      if (other.getTargetKmWalked() != 0D) {
        setTargetKmWalked(other.getTargetKmWalked());
      }
      if (other.getBattleGrantedRemaining() != 0) {
        setBattleGrantedRemaining(other.getBattleGrantedRemaining());
      }
      if (other.getMaxBattlesInSet() != 0) {
        setMaxBattlesInSet(other.getMaxBattlesInSet());
      }
      if (other.rewardTrack_ != 0) {
        setRewardTrackValue(other.getRewardTrackValue());
      }
      if (!other.getBattleNowSkuId().isEmpty()) {
        battleNowSkuId_ = other.battleNowSkuId_;
        onChanged();
      }
      if (other.getAdditionalBattlesGranted() != false) {
        setAdditionalBattlesGranted(other.getAdditionalBattlesGranted());
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
      POGOProtos.Rpc.VsSeekerAttributesProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.VsSeekerAttributesProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int vsSeekerStatus_ = 0;
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus vs_seeker_status = 1;</code>
     * @return The enum numeric value on the wire for vsSeekerStatus.
     */
    @java.lang.Override public int getVsSeekerStatusValue() {
      return vsSeekerStatus_;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus vs_seeker_status = 1;</code>
     * @param value The enum numeric value on the wire for vsSeekerStatus to set.
     * @return This builder for chaining.
     */
    public Builder setVsSeekerStatusValue(int value) {
      
      vsSeekerStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus vs_seeker_status = 1;</code>
     * @return The vsSeekerStatus.
     */
    @java.lang.Override
    public POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus getVsSeekerStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus result = POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus.valueOf(vsSeekerStatus_);
      return result == null ? POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus vs_seeker_status = 1;</code>
     * @param value The vsSeekerStatus to set.
     * @return This builder for chaining.
     */
    public Builder setVsSeekerStatus(POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      vsSeekerStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.VsSeekerStatus vs_seeker_status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVsSeekerStatus() {
      
      vsSeekerStatus_ = 0;
      onChanged();
      return this;
    }

    private double startKmWalked_ ;
    /**
     * <code>double start_km_walked = 2;</code>
     * @return The startKmWalked.
     */
    @java.lang.Override
    public double getStartKmWalked() {
      return startKmWalked_;
    }
    /**
     * <code>double start_km_walked = 2;</code>
     * @param value The startKmWalked to set.
     * @return This builder for chaining.
     */
    public Builder setStartKmWalked(double value) {
      
      startKmWalked_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double start_km_walked = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartKmWalked() {
      
      startKmWalked_ = 0D;
      onChanged();
      return this;
    }

    private double targetKmWalked_ ;
    /**
     * <code>double target_km_walked = 3;</code>
     * @return The targetKmWalked.
     */
    @java.lang.Override
    public double getTargetKmWalked() {
      return targetKmWalked_;
    }
    /**
     * <code>double target_km_walked = 3;</code>
     * @param value The targetKmWalked to set.
     * @return This builder for chaining.
     */
    public Builder setTargetKmWalked(double value) {
      
      targetKmWalked_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double target_km_walked = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetKmWalked() {
      
      targetKmWalked_ = 0D;
      onChanged();
      return this;
    }

    private int battleGrantedRemaining_ ;
    /**
     * <code>int32 battle_granted_remaining = 4;</code>
     * @return The battleGrantedRemaining.
     */
    @java.lang.Override
    public int getBattleGrantedRemaining() {
      return battleGrantedRemaining_;
    }
    /**
     * <code>int32 battle_granted_remaining = 4;</code>
     * @param value The battleGrantedRemaining to set.
     * @return This builder for chaining.
     */
    public Builder setBattleGrantedRemaining(int value) {
      
      battleGrantedRemaining_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 battle_granted_remaining = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBattleGrantedRemaining() {
      
      battleGrantedRemaining_ = 0;
      onChanged();
      return this;
    }

    private int maxBattlesInSet_ ;
    /**
     * <code>int32 max_battles_in_set = 6;</code>
     * @return The maxBattlesInSet.
     */
    @java.lang.Override
    public int getMaxBattlesInSet() {
      return maxBattlesInSet_;
    }
    /**
     * <code>int32 max_battles_in_set = 6;</code>
     * @param value The maxBattlesInSet to set.
     * @return This builder for chaining.
     */
    public Builder setMaxBattlesInSet(int value) {
      
      maxBattlesInSet_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_battles_in_set = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxBattlesInSet() {
      
      maxBattlesInSet_ = 0;
      onChanged();
      return this;
    }

    private int rewardTrack_ = 0;
    /**
     * <code>.POGOProtos.Rpc.VsSeekerRewardTrack reward_track = 7;</code>
     * @return The enum numeric value on the wire for rewardTrack.
     */
    @java.lang.Override public int getRewardTrackValue() {
      return rewardTrack_;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerRewardTrack reward_track = 7;</code>
     * @param value The enum numeric value on the wire for rewardTrack to set.
     * @return This builder for chaining.
     */
    public Builder setRewardTrackValue(int value) {
      
      rewardTrack_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerRewardTrack reward_track = 7;</code>
     * @return The rewardTrack.
     */
    @java.lang.Override
    public POGOProtos.Rpc.VsSeekerRewardTrack getRewardTrack() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.VsSeekerRewardTrack result = POGOProtos.Rpc.VsSeekerRewardTrack.valueOf(rewardTrack_);
      return result == null ? POGOProtos.Rpc.VsSeekerRewardTrack.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerRewardTrack reward_track = 7;</code>
     * @param value The rewardTrack to set.
     * @return This builder for chaining.
     */
    public Builder setRewardTrack(POGOProtos.Rpc.VsSeekerRewardTrack value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      rewardTrack_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerRewardTrack reward_track = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardTrack() {
      
      rewardTrack_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object battleNowSkuId_ = "";
    /**
     * <code>string battle_now_sku_id = 8;</code>
     * @return The battleNowSkuId.
     */
    public java.lang.String getBattleNowSkuId() {
      java.lang.Object ref = battleNowSkuId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        battleNowSkuId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string battle_now_sku_id = 8;</code>
     * @return The bytes for battleNowSkuId.
     */
    public com.google.protobuf.ByteString
        getBattleNowSkuIdBytes() {
      java.lang.Object ref = battleNowSkuId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        battleNowSkuId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string battle_now_sku_id = 8;</code>
     * @param value The battleNowSkuId to set.
     * @return This builder for chaining.
     */
    public Builder setBattleNowSkuId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      battleNowSkuId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string battle_now_sku_id = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearBattleNowSkuId() {
      
      battleNowSkuId_ = getDefaultInstance().getBattleNowSkuId();
      onChanged();
      return this;
    }
    /**
     * <code>string battle_now_sku_id = 8;</code>
     * @param value The bytes for battleNowSkuId to set.
     * @return This builder for chaining.
     */
    public Builder setBattleNowSkuIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      battleNowSkuId_ = value;
      onChanged();
      return this;
    }

    private boolean additionalBattlesGranted_ ;
    /**
     * <code>bool additional_battles_granted = 9;</code>
     * @return The additionalBattlesGranted.
     */
    @java.lang.Override
    public boolean getAdditionalBattlesGranted() {
      return additionalBattlesGranted_;
    }
    /**
     * <code>bool additional_battles_granted = 9;</code>
     * @param value The additionalBattlesGranted to set.
     * @return This builder for chaining.
     */
    public Builder setAdditionalBattlesGranted(boolean value) {
      
      additionalBattlesGranted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool additional_battles_granted = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdditionalBattlesGranted() {
      
      additionalBattlesGranted_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.VsSeekerAttributesProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.VsSeekerAttributesProto)
  private static final POGOProtos.Rpc.VsSeekerAttributesProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.VsSeekerAttributesProto();
  }

  public static POGOProtos.Rpc.VsSeekerAttributesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VsSeekerAttributesProto>
      PARSER = new com.google.protobuf.AbstractParser<VsSeekerAttributesProto>() {
    @java.lang.Override
    public VsSeekerAttributesProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VsSeekerAttributesProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VsSeekerAttributesProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VsSeekerAttributesProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.VsSeekerAttributesProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

