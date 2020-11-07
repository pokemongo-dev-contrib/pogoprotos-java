// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.EquipBadgeOutProto}
 */
public final class EquipBadgeOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EquipBadgeOutProto)
    EquipBadgeOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EquipBadgeOutProto.newBuilder() to construct.
  private EquipBadgeOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EquipBadgeOutProto() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EquipBadgeOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EquipBadgeOutProto(
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
            POGOProtos.Rpc.EquippedBadgeProto.Builder subBuilder = null;
            if (equipped_ != null) {
              subBuilder = equipped_.toBuilder();
            }
            equipped_ = input.readMessage(POGOProtos.Rpc.EquippedBadgeProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(equipped_);
              equipped_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EquipBadgeOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EquipBadgeOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EquipBadgeOutProto.class, POGOProtos.Rpc.EquipBadgeOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.EquipBadgeOutProto.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>COOLDOWN_ACTIVE = 2;</code>
     */
    COOLDOWN_ACTIVE(2),
    /**
     * <code>NOT_QUALIFIED = 3;</code>
     */
    NOT_QUALIFIED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>COOLDOWN_ACTIVE = 2;</code>
     */
    public static final int COOLDOWN_ACTIVE_VALUE = 2;
    /**
     * <code>NOT_QUALIFIED = 3;</code>
     */
    public static final int NOT_QUALIFIED_VALUE = 3;


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
        case 1: return SUCCESS;
        case 2: return COOLDOWN_ACTIVE;
        case 3: return NOT_QUALIFIED;
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
      return POGOProtos.Rpc.EquipBadgeOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.EquipBadgeOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.EquipBadgeOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.EquipBadgeOutProto.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.EquipBadgeOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EquipBadgeOutProto.Result result = POGOProtos.Rpc.EquipBadgeOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.EquipBadgeOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int EQUIPPED_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.EquippedBadgeProto equipped_;
  /**
   * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped = 2;</code>
   * @return Whether the equipped field is set.
   */
  @java.lang.Override
  public boolean hasEquipped() {
    return equipped_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped = 2;</code>
   * @return The equipped.
   */
  @java.lang.Override
  public POGOProtos.Rpc.EquippedBadgeProto getEquipped() {
    return equipped_ == null ? POGOProtos.Rpc.EquippedBadgeProto.getDefaultInstance() : equipped_;
  }
  /**
   * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.EquippedBadgeProtoOrBuilder getEquippedOrBuilder() {
    return getEquipped();
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
    if (result_ != POGOProtos.Rpc.EquipBadgeOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (equipped_ != null) {
      output.writeMessage(2, getEquipped());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.EquipBadgeOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (equipped_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEquipped());
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
    if (!(obj instanceof POGOProtos.Rpc.EquipBadgeOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EquipBadgeOutProto other = (POGOProtos.Rpc.EquipBadgeOutProto) obj;

    if (result_ != other.result_) return false;
    if (hasEquipped() != other.hasEquipped()) return false;
    if (hasEquipped()) {
      if (!getEquipped()
          .equals(other.getEquipped())) return false;
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
    if (hasEquipped()) {
      hash = (37 * hash) + EQUIPPED_FIELD_NUMBER;
      hash = (53 * hash) + getEquipped().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EquipBadgeOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EquipBadgeOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EquipBadgeOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EquipBadgeOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EquipBadgeOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EquipBadgeOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EquipBadgeOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EquipBadgeOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EquipBadgeOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EquipBadgeOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EquipBadgeOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EquipBadgeOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EquipBadgeOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.EquipBadgeOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EquipBadgeOutProto)
      POGOProtos.Rpc.EquipBadgeOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EquipBadgeOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EquipBadgeOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EquipBadgeOutProto.class, POGOProtos.Rpc.EquipBadgeOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EquipBadgeOutProto.newBuilder()
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

      if (equippedBuilder_ == null) {
        equipped_ = null;
      } else {
        equipped_ = null;
        equippedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EquipBadgeOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EquipBadgeOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.EquipBadgeOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EquipBadgeOutProto build() {
      POGOProtos.Rpc.EquipBadgeOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EquipBadgeOutProto buildPartial() {
      POGOProtos.Rpc.EquipBadgeOutProto result = new POGOProtos.Rpc.EquipBadgeOutProto(this);
      result.result_ = result_;
      if (equippedBuilder_ == null) {
        result.equipped_ = equipped_;
      } else {
        result.equipped_ = equippedBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.EquipBadgeOutProto) {
        return mergeFrom((POGOProtos.Rpc.EquipBadgeOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EquipBadgeOutProto other) {
      if (other == POGOProtos.Rpc.EquipBadgeOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasEquipped()) {
        mergeEquipped(other.getEquipped());
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
      POGOProtos.Rpc.EquipBadgeOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EquipBadgeOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.EquipBadgeOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.EquipBadgeOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EquipBadgeOutProto.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.EquipBadgeOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EquipBadgeOutProto.Result result = POGOProtos.Rpc.EquipBadgeOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.EquipBadgeOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EquipBadgeOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.EquipBadgeOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EquipBadgeOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.EquippedBadgeProto equipped_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.EquippedBadgeProto, POGOProtos.Rpc.EquippedBadgeProto.Builder, POGOProtos.Rpc.EquippedBadgeProtoOrBuilder> equippedBuilder_;
    /**
     * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped = 2;</code>
     * @return Whether the equipped field is set.
     */
    public boolean hasEquipped() {
      return equippedBuilder_ != null || equipped_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped = 2;</code>
     * @return The equipped.
     */
    public POGOProtos.Rpc.EquippedBadgeProto getEquipped() {
      if (equippedBuilder_ == null) {
        return equipped_ == null ? POGOProtos.Rpc.EquippedBadgeProto.getDefaultInstance() : equipped_;
      } else {
        return equippedBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped = 2;</code>
     */
    public Builder setEquipped(POGOProtos.Rpc.EquippedBadgeProto value) {
      if (equippedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        equipped_ = value;
        onChanged();
      } else {
        equippedBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped = 2;</code>
     */
    public Builder setEquipped(
        POGOProtos.Rpc.EquippedBadgeProto.Builder builderForValue) {
      if (equippedBuilder_ == null) {
        equipped_ = builderForValue.build();
        onChanged();
      } else {
        equippedBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped = 2;</code>
     */
    public Builder mergeEquipped(POGOProtos.Rpc.EquippedBadgeProto value) {
      if (equippedBuilder_ == null) {
        if (equipped_ != null) {
          equipped_ =
            POGOProtos.Rpc.EquippedBadgeProto.newBuilder(equipped_).mergeFrom(value).buildPartial();
        } else {
          equipped_ = value;
        }
        onChanged();
      } else {
        equippedBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped = 2;</code>
     */
    public Builder clearEquipped() {
      if (equippedBuilder_ == null) {
        equipped_ = null;
        onChanged();
      } else {
        equipped_ = null;
        equippedBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped = 2;</code>
     */
    public POGOProtos.Rpc.EquippedBadgeProto.Builder getEquippedBuilder() {
      
      onChanged();
      return getEquippedFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped = 2;</code>
     */
    public POGOProtos.Rpc.EquippedBadgeProtoOrBuilder getEquippedOrBuilder() {
      if (equippedBuilder_ != null) {
        return equippedBuilder_.getMessageOrBuilder();
      } else {
        return equipped_ == null ?
            POGOProtos.Rpc.EquippedBadgeProto.getDefaultInstance() : equipped_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.EquippedBadgeProto equipped = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.EquippedBadgeProto, POGOProtos.Rpc.EquippedBadgeProto.Builder, POGOProtos.Rpc.EquippedBadgeProtoOrBuilder> 
        getEquippedFieldBuilder() {
      if (equippedBuilder_ == null) {
        equippedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.EquippedBadgeProto, POGOProtos.Rpc.EquippedBadgeProto.Builder, POGOProtos.Rpc.EquippedBadgeProtoOrBuilder>(
                getEquipped(),
                getParentForChildren(),
                isClean());
        equipped_ = null;
      }
      return equippedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EquipBadgeOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EquipBadgeOutProto)
  private static final POGOProtos.Rpc.EquipBadgeOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EquipBadgeOutProto();
  }

  public static POGOProtos.Rpc.EquipBadgeOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EquipBadgeOutProto>
      PARSER = new com.google.protobuf.AbstractParser<EquipBadgeOutProto>() {
    @java.lang.Override
    public EquipBadgeOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EquipBadgeOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EquipBadgeOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EquipBadgeOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EquipBadgeOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

