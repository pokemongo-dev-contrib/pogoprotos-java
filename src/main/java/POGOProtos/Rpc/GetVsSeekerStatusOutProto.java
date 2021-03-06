// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetVsSeekerStatusOutProto}
 */
public final class GetVsSeekerStatusOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetVsSeekerStatusOutProto)
    GetVsSeekerStatusOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetVsSeekerStatusOutProto.newBuilder() to construct.
  private GetVsSeekerStatusOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetVsSeekerStatusOutProto() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetVsSeekerStatusOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetVsSeekerStatusOutProto(
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

            result_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.VsSeekerAttributesProto.Builder subBuilder = null;
            if (vsSeeker_ != null) {
              subBuilder = vsSeeker_.toBuilder();
            }
            vsSeeker_ = input.readMessage(POGOProtos.Rpc.VsSeekerAttributesProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(vsSeeker_);
              vsSeeker_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            seasonEnded_ = input.readBool();
            break;
          }
          case 34: {
            POGOProtos.Rpc.CombatLogProto.Builder subBuilder = null;
            if (combatLog_ != null) {
              subBuilder = combatLog_.toBuilder();
            }
            combatLog_ = input.readMessage(POGOProtos.Rpc.CombatLogProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(combatLog_);
              combatLog_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetVsSeekerStatusOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetVsSeekerStatusOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetVsSeekerStatusOutProto.class, POGOProtos.Rpc.GetVsSeekerStatusOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS_FULLY_CHARGED = 1;</code>
     */
    SUCCESS_FULLY_CHARGED(1),
    /**
     * <code>SUCCESS_NOT_FULLY_CHARGED_YET = 2;</code>
     */
    SUCCESS_NOT_FULLY_CHARGED_YET(2),
    /**
     * <code>ERROR_VS_SEEKER_NOT_FOUND = 3;</code>
     */
    ERROR_VS_SEEKER_NOT_FOUND(3),
    /**
     * <code>ERROR_VS_SEEKER_NEVER_STARTED_CHARGING = 4;</code>
     */
    ERROR_VS_SEEKER_NEVER_STARTED_CHARGING(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS_FULLY_CHARGED = 1;</code>
     */
    public static final int SUCCESS_FULLY_CHARGED_VALUE = 1;
    /**
     * <code>SUCCESS_NOT_FULLY_CHARGED_YET = 2;</code>
     */
    public static final int SUCCESS_NOT_FULLY_CHARGED_YET_VALUE = 2;
    /**
     * <code>ERROR_VS_SEEKER_NOT_FOUND = 3;</code>
     */
    public static final int ERROR_VS_SEEKER_NOT_FOUND_VALUE = 3;
    /**
     * <code>ERROR_VS_SEEKER_NEVER_STARTED_CHARGING = 4;</code>
     */
    public static final int ERROR_VS_SEEKER_NEVER_STARTED_CHARGING_VALUE = 4;


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
    public static Result valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Result forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS_FULLY_CHARGED;
        case 2: return SUCCESS_NOT_FULLY_CHARGED_YET;
        case 3: return ERROR_VS_SEEKER_NOT_FOUND;
        case 4: return ERROR_VS_SEEKER_NEVER_STARTED_CHARGING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Result> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.forNumber(number);
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
      return POGOProtos.Rpc.GetVsSeekerStatusOutProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
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

    private Result(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result result = POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int VS_SEEKER_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.VsSeekerAttributesProto vsSeeker_;
  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
   * @return Whether the vsSeeker field is set.
   */
  @java.lang.Override
  public boolean hasVsSeeker() {
    return vsSeeker_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
   * @return The vsSeeker.
   */
  @java.lang.Override
  public POGOProtos.Rpc.VsSeekerAttributesProto getVsSeeker() {
    return vsSeeker_ == null ? POGOProtos.Rpc.VsSeekerAttributesProto.getDefaultInstance() : vsSeeker_;
  }
  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.VsSeekerAttributesProtoOrBuilder getVsSeekerOrBuilder() {
    return getVsSeeker();
  }

  public static final int SEASON_ENDED_FIELD_NUMBER = 3;
  private boolean seasonEnded_;
  /**
   * <code>bool season_ended = 3;</code>
   * @return The seasonEnded.
   */
  @java.lang.Override
  public boolean getSeasonEnded() {
    return seasonEnded_;
  }

  public static final int COMBAT_LOG_FIELD_NUMBER = 4;
  private POGOProtos.Rpc.CombatLogProto combatLog_;
  /**
   * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
   * @return Whether the combatLog field is set.
   */
  @java.lang.Override
  public boolean hasCombatLog() {
    return combatLog_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
   * @return The combatLog.
   */
  @java.lang.Override
  public POGOProtos.Rpc.CombatLogProto getCombatLog() {
    return combatLog_ == null ? POGOProtos.Rpc.CombatLogProto.getDefaultInstance() : combatLog_;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CombatLogProtoOrBuilder getCombatLogOrBuilder() {
    return getCombatLog();
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
    if (result_ != POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (vsSeeker_ != null) {
      output.writeMessage(2, getVsSeeker());
    }
    if (seasonEnded_ != false) {
      output.writeBool(3, seasonEnded_);
    }
    if (combatLog_ != null) {
      output.writeMessage(4, getCombatLog());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (vsSeeker_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVsSeeker());
    }
    if (seasonEnded_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, seasonEnded_);
    }
    if (combatLog_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCombatLog());
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
    if (!(obj instanceof POGOProtos.Rpc.GetVsSeekerStatusOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetVsSeekerStatusOutProto other = (POGOProtos.Rpc.GetVsSeekerStatusOutProto) obj;

    if (result_ != other.result_) return false;
    if (hasVsSeeker() != other.hasVsSeeker()) return false;
    if (hasVsSeeker()) {
      if (!getVsSeeker()
          .equals(other.getVsSeeker())) return false;
    }
    if (getSeasonEnded()
        != other.getSeasonEnded()) return false;
    if (hasCombatLog() != other.hasCombatLog()) return false;
    if (hasCombatLog()) {
      if (!getCombatLog()
          .equals(other.getCombatLog())) return false;
    }
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    if (hasVsSeeker()) {
      hash = (37 * hash) + VS_SEEKER_FIELD_NUMBER;
      hash = (53 * hash) + getVsSeeker().hashCode();
    }
    hash = (37 * hash) + SEASON_ENDED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSeasonEnded());
    if (hasCombatLog()) {
      hash = (37 * hash) + COMBAT_LOG_FIELD_NUMBER;
      hash = (53 * hash) + getCombatLog().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetVsSeekerStatusOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetVsSeekerStatusOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetVsSeekerStatusOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetVsSeekerStatusOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetVsSeekerStatusOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetVsSeekerStatusOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetVsSeekerStatusOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetVsSeekerStatusOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetVsSeekerStatusOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetVsSeekerStatusOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetVsSeekerStatusOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetVsSeekerStatusOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetVsSeekerStatusOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetVsSeekerStatusOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetVsSeekerStatusOutProto)
      POGOProtos.Rpc.GetVsSeekerStatusOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetVsSeekerStatusOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetVsSeekerStatusOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetVsSeekerStatusOutProto.class, POGOProtos.Rpc.GetVsSeekerStatusOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetVsSeekerStatusOutProto.newBuilder()
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
      result_ = 0;

      if (vsSeekerBuilder_ == null) {
        vsSeeker_ = null;
      } else {
        vsSeeker_ = null;
        vsSeekerBuilder_ = null;
      }
      seasonEnded_ = false;

      if (combatLogBuilder_ == null) {
        combatLog_ = null;
      } else {
        combatLog_ = null;
        combatLogBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetVsSeekerStatusOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetVsSeekerStatusOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetVsSeekerStatusOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetVsSeekerStatusOutProto build() {
      POGOProtos.Rpc.GetVsSeekerStatusOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetVsSeekerStatusOutProto buildPartial() {
      POGOProtos.Rpc.GetVsSeekerStatusOutProto result = new POGOProtos.Rpc.GetVsSeekerStatusOutProto(this);
      result.result_ = result_;
      if (vsSeekerBuilder_ == null) {
        result.vsSeeker_ = vsSeeker_;
      } else {
        result.vsSeeker_ = vsSeekerBuilder_.build();
      }
      result.seasonEnded_ = seasonEnded_;
      if (combatLogBuilder_ == null) {
        result.combatLog_ = combatLog_;
      } else {
        result.combatLog_ = combatLogBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.GetVsSeekerStatusOutProto) {
        return mergeFrom((POGOProtos.Rpc.GetVsSeekerStatusOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetVsSeekerStatusOutProto other) {
      if (other == POGOProtos.Rpc.GetVsSeekerStatusOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasVsSeeker()) {
        mergeVsSeeker(other.getVsSeeker());
      }
      if (other.getSeasonEnded() != false) {
        setSeasonEnded(other.getSeasonEnded());
      }
      if (other.hasCombatLog()) {
        mergeCombatLog(other.getCombatLog());
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
      POGOProtos.Rpc.GetVsSeekerStatusOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetVsSeekerStatusOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int result_ = 0;
    /**
     * <code>.POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result result = POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetVsSeekerStatusOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.VsSeekerAttributesProto vsSeeker_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.VsSeekerAttributesProto, POGOProtos.Rpc.VsSeekerAttributesProto.Builder, POGOProtos.Rpc.VsSeekerAttributesProtoOrBuilder> vsSeekerBuilder_;
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
     * @return Whether the vsSeeker field is set.
     */
    public boolean hasVsSeeker() {
      return vsSeekerBuilder_ != null || vsSeeker_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
     * @return The vsSeeker.
     */
    public POGOProtos.Rpc.VsSeekerAttributesProto getVsSeeker() {
      if (vsSeekerBuilder_ == null) {
        return vsSeeker_ == null ? POGOProtos.Rpc.VsSeekerAttributesProto.getDefaultInstance() : vsSeeker_;
      } else {
        return vsSeekerBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
     */
    public Builder setVsSeeker(POGOProtos.Rpc.VsSeekerAttributesProto value) {
      if (vsSeekerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        vsSeeker_ = value;
        onChanged();
      } else {
        vsSeekerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
     */
    public Builder setVsSeeker(
        POGOProtos.Rpc.VsSeekerAttributesProto.Builder builderForValue) {
      if (vsSeekerBuilder_ == null) {
        vsSeeker_ = builderForValue.build();
        onChanged();
      } else {
        vsSeekerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
     */
    public Builder mergeVsSeeker(POGOProtos.Rpc.VsSeekerAttributesProto value) {
      if (vsSeekerBuilder_ == null) {
        if (vsSeeker_ != null) {
          vsSeeker_ =
            POGOProtos.Rpc.VsSeekerAttributesProto.newBuilder(vsSeeker_).mergeFrom(value).buildPartial();
        } else {
          vsSeeker_ = value;
        }
        onChanged();
      } else {
        vsSeekerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
     */
    public Builder clearVsSeeker() {
      if (vsSeekerBuilder_ == null) {
        vsSeeker_ = null;
        onChanged();
      } else {
        vsSeeker_ = null;
        vsSeekerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
     */
    public POGOProtos.Rpc.VsSeekerAttributesProto.Builder getVsSeekerBuilder() {
      
      onChanged();
      return getVsSeekerFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
     */
    public POGOProtos.Rpc.VsSeekerAttributesProtoOrBuilder getVsSeekerOrBuilder() {
      if (vsSeekerBuilder_ != null) {
        return vsSeekerBuilder_.getMessageOrBuilder();
      } else {
        return vsSeeker_ == null ?
            POGOProtos.Rpc.VsSeekerAttributesProto.getDefaultInstance() : vsSeeker_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.VsSeekerAttributesProto, POGOProtos.Rpc.VsSeekerAttributesProto.Builder, POGOProtos.Rpc.VsSeekerAttributesProtoOrBuilder> 
        getVsSeekerFieldBuilder() {
      if (vsSeekerBuilder_ == null) {
        vsSeekerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.VsSeekerAttributesProto, POGOProtos.Rpc.VsSeekerAttributesProto.Builder, POGOProtos.Rpc.VsSeekerAttributesProtoOrBuilder>(
                getVsSeeker(),
                getParentForChildren(),
                isClean());
        vsSeeker_ = null;
      }
      return vsSeekerBuilder_;
    }

    private boolean seasonEnded_ ;
    /**
     * <code>bool season_ended = 3;</code>
     * @return The seasonEnded.
     */
    @java.lang.Override
    public boolean getSeasonEnded() {
      return seasonEnded_;
    }
    /**
     * <code>bool season_ended = 3;</code>
     * @param value The seasonEnded to set.
     * @return This builder for chaining.
     */
    public Builder setSeasonEnded(boolean value) {
      
      seasonEnded_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool season_ended = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeasonEnded() {
      
      seasonEnded_ = false;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.CombatLogProto combatLog_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatLogProto, POGOProtos.Rpc.CombatLogProto.Builder, POGOProtos.Rpc.CombatLogProtoOrBuilder> combatLogBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
     * @return Whether the combatLog field is set.
     */
    public boolean hasCombatLog() {
      return combatLogBuilder_ != null || combatLog_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
     * @return The combatLog.
     */
    public POGOProtos.Rpc.CombatLogProto getCombatLog() {
      if (combatLogBuilder_ == null) {
        return combatLog_ == null ? POGOProtos.Rpc.CombatLogProto.getDefaultInstance() : combatLog_;
      } else {
        return combatLogBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
     */
    public Builder setCombatLog(POGOProtos.Rpc.CombatLogProto value) {
      if (combatLogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        combatLog_ = value;
        onChanged();
      } else {
        combatLogBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
     */
    public Builder setCombatLog(
        POGOProtos.Rpc.CombatLogProto.Builder builderForValue) {
      if (combatLogBuilder_ == null) {
        combatLog_ = builderForValue.build();
        onChanged();
      } else {
        combatLogBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
     */
    public Builder mergeCombatLog(POGOProtos.Rpc.CombatLogProto value) {
      if (combatLogBuilder_ == null) {
        if (combatLog_ != null) {
          combatLog_ =
            POGOProtos.Rpc.CombatLogProto.newBuilder(combatLog_).mergeFrom(value).buildPartial();
        } else {
          combatLog_ = value;
        }
        onChanged();
      } else {
        combatLogBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
     */
    public Builder clearCombatLog() {
      if (combatLogBuilder_ == null) {
        combatLog_ = null;
        onChanged();
      } else {
        combatLog_ = null;
        combatLogBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
     */
    public POGOProtos.Rpc.CombatLogProto.Builder getCombatLogBuilder() {
      
      onChanged();
      return getCombatLogFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
     */
    public POGOProtos.Rpc.CombatLogProtoOrBuilder getCombatLogOrBuilder() {
      if (combatLogBuilder_ != null) {
        return combatLogBuilder_.getMessageOrBuilder();
      } else {
        return combatLog_ == null ?
            POGOProtos.Rpc.CombatLogProto.getDefaultInstance() : combatLog_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatLogProto combat_log = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatLogProto, POGOProtos.Rpc.CombatLogProto.Builder, POGOProtos.Rpc.CombatLogProtoOrBuilder> 
        getCombatLogFieldBuilder() {
      if (combatLogBuilder_ == null) {
        combatLogBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CombatLogProto, POGOProtos.Rpc.CombatLogProto.Builder, POGOProtos.Rpc.CombatLogProtoOrBuilder>(
                getCombatLog(),
                getParentForChildren(),
                isClean());
        combatLog_ = null;
      }
      return combatLogBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetVsSeekerStatusOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetVsSeekerStatusOutProto)
  private static final POGOProtos.Rpc.GetVsSeekerStatusOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetVsSeekerStatusOutProto();
  }

  public static POGOProtos.Rpc.GetVsSeekerStatusOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetVsSeekerStatusOutProto>
      PARSER = new com.google.protobuf.AbstractParser<GetVsSeekerStatusOutProto>() {
    @java.lang.Override
    public GetVsSeekerStatusOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetVsSeekerStatusOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetVsSeekerStatusOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetVsSeekerStatusOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetVsSeekerStatusOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

