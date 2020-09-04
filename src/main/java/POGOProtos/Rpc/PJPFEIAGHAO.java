// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PJPFEIAGHAO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PJPFEIAGHAO}
 */
public final class PJPFEIAGHAO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PJPFEIAGHAO)
    PJPFEIAGHAOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PJPFEIAGHAO.newBuilder() to construct.
  private PJPFEIAGHAO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PJPFEIAGHAO() {
    lknpioglmib_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PJPFEIAGHAO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PJPFEIAGHAO(
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

            lknpioglmib_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.HDJJJBKOGHK.Builder subBuilder = null;
            if (mfcgefaehpn_ != null) {
              subBuilder = mfcgefaehpn_.toBuilder();
            }
            mfcgefaehpn_ = input.readMessage(POGOProtos.Rpc.HDJJJBKOGHK.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(mfcgefaehpn_);
              mfcgefaehpn_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PJPFEIAGHAO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PJPFEIAGHAO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PJPFEIAGHAO.class, POGOProtos.Rpc.PJPFEIAGHAO.Builder.class);
  }

  /**
   * <pre>
   * ref: PJPFEIAGHAO/APFOFKFAKAI/OICGHCIDMJP
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP}
   */
  public enum OICGHCIDMJP
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    ERROR_UNKNOWN(2),
    /**
     * <code>ERROR_FRIEND_NOT_FOUND = 3;</code>
     */
    ERROR_FRIEND_NOT_FOUND(3),
    /**
     * <code>ERROR_INVALID_PLAYER_ID = 4;</code>
     */
    ERROR_INVALID_PLAYER_ID(4),
    /**
     * <code>ERROR_INVALID_STATE = 5;</code>
     */
    ERROR_INVALID_STATE(5),
    /**
     * <code>ERROR_STATE_HANDLER = 6;</code>
     */
    ERROR_STATE_HANDLER(6),
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    public static final int ERROR_UNKNOWN_VALUE = 2;
    /**
     * <code>ERROR_FRIEND_NOT_FOUND = 3;</code>
     */
    public static final int ERROR_FRIEND_NOT_FOUND_VALUE = 3;
    /**
     * <code>ERROR_INVALID_PLAYER_ID = 4;</code>
     */
    public static final int ERROR_INVALID_PLAYER_ID_VALUE = 4;
    /**
     * <code>ERROR_INVALID_STATE = 5;</code>
     */
    public static final int ERROR_INVALID_STATE_VALUE = 5;
    /**
     * <code>ERROR_STATE_HANDLER = 6;</code>
     */
    public static final int ERROR_STATE_HANDLER_VALUE = 6;


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
    public static OICGHCIDMJP valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OICGHCIDMJP forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_UNKNOWN;
        case 3: return ERROR_FRIEND_NOT_FOUND;
        case 4: return ERROR_INVALID_PLAYER_ID;
        case 5: return ERROR_INVALID_STATE;
        case 6: return ERROR_STATE_HANDLER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OICGHCIDMJP>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OICGHCIDMJP> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OICGHCIDMJP>() {
            public OICGHCIDMJP findValueByNumber(int number) {
              return OICGHCIDMJP.forNumber(number);
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
      return POGOProtos.Rpc.PJPFEIAGHAO.getDescriptor().getEnumTypes().get(0);
    }

    private static final OICGHCIDMJP[] VALUES = values();

    public static OICGHCIDMJP valueOf(
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

    private OICGHCIDMJP(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP)
  }

  public static final int LKNPIOGLMIB_FIELD_NUMBER = 1;
  private int lknpioglmib_;
  /**
   * <code>.POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP lknpioglmib = 1;</code>
   * @return The enum numeric value on the wire for lknpioglmib.
   */
  @java.lang.Override public int getLknpioglmibValue() {
    return lknpioglmib_;
  }
  /**
   * <code>.POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP lknpioglmib = 1;</code>
   * @return The lknpioglmib.
   */
  @java.lang.Override public POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP getLknpioglmib() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP result = POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP.valueOf(lknpioglmib_);
    return result == null ? POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP.UNRECOGNIZED : result;
  }

  public static final int MFCGEFAEHPN_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn_;
  /**
   * <code>.POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn = 2;</code>
   * @return Whether the mfcgefaehpn field is set.
   */
  @java.lang.Override
  public boolean hasMfcgefaehpn() {
    return mfcgefaehpn_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn = 2;</code>
   * @return The mfcgefaehpn.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HDJJJBKOGHK getMfcgefaehpn() {
    return mfcgefaehpn_ == null ? POGOProtos.Rpc.HDJJJBKOGHK.getDefaultInstance() : mfcgefaehpn_;
  }
  /**
   * <code>.POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.HDJJJBKOGHKOrBuilder getMfcgefaehpnOrBuilder() {
    return getMfcgefaehpn();
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
    if (lknpioglmib_ != POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP.UNSET.getNumber()) {
      output.writeEnum(1, lknpioglmib_);
    }
    if (mfcgefaehpn_ != null) {
      output.writeMessage(2, getMfcgefaehpn());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lknpioglmib_ != POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lknpioglmib_);
    }
    if (mfcgefaehpn_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMfcgefaehpn());
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
    if (!(obj instanceof POGOProtos.Rpc.PJPFEIAGHAO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PJPFEIAGHAO other = (POGOProtos.Rpc.PJPFEIAGHAO) obj;

    if (lknpioglmib_ != other.lknpioglmib_) return false;
    if (hasMfcgefaehpn() != other.hasMfcgefaehpn()) return false;
    if (hasMfcgefaehpn()) {
      if (!getMfcgefaehpn()
          .equals(other.getMfcgefaehpn())) return false;
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
    hash = (37 * hash) + LKNPIOGLMIB_FIELD_NUMBER;
    hash = (53 * hash) + lknpioglmib_;
    if (hasMfcgefaehpn()) {
      hash = (37 * hash) + MFCGEFAEHPN_FIELD_NUMBER;
      hash = (53 * hash) + getMfcgefaehpn().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PJPFEIAGHAO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PJPFEIAGHAO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PJPFEIAGHAO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PJPFEIAGHAO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PJPFEIAGHAO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PJPFEIAGHAO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PJPFEIAGHAO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PJPFEIAGHAO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PJPFEIAGHAO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PJPFEIAGHAO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PJPFEIAGHAO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PJPFEIAGHAO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PJPFEIAGHAO prototype) {
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
   * <pre>
   * ref: PJPFEIAGHAO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PJPFEIAGHAO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PJPFEIAGHAO)
      POGOProtos.Rpc.PJPFEIAGHAOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PJPFEIAGHAO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PJPFEIAGHAO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PJPFEIAGHAO.class, POGOProtos.Rpc.PJPFEIAGHAO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PJPFEIAGHAO.newBuilder()
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
      lknpioglmib_ = 0;

      if (mfcgefaehpnBuilder_ == null) {
        mfcgefaehpn_ = null;
      } else {
        mfcgefaehpn_ = null;
        mfcgefaehpnBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PJPFEIAGHAO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PJPFEIAGHAO getDefaultInstanceForType() {
      return POGOProtos.Rpc.PJPFEIAGHAO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PJPFEIAGHAO build() {
      POGOProtos.Rpc.PJPFEIAGHAO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PJPFEIAGHAO buildPartial() {
      POGOProtos.Rpc.PJPFEIAGHAO result = new POGOProtos.Rpc.PJPFEIAGHAO(this);
      result.lknpioglmib_ = lknpioglmib_;
      if (mfcgefaehpnBuilder_ == null) {
        result.mfcgefaehpn_ = mfcgefaehpn_;
      } else {
        result.mfcgefaehpn_ = mfcgefaehpnBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PJPFEIAGHAO) {
        return mergeFrom((POGOProtos.Rpc.PJPFEIAGHAO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PJPFEIAGHAO other) {
      if (other == POGOProtos.Rpc.PJPFEIAGHAO.getDefaultInstance()) return this;
      if (other.lknpioglmib_ != 0) {
        setLknpioglmibValue(other.getLknpioglmibValue());
      }
      if (other.hasMfcgefaehpn()) {
        mergeMfcgefaehpn(other.getMfcgefaehpn());
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
      POGOProtos.Rpc.PJPFEIAGHAO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PJPFEIAGHAO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int lknpioglmib_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP lknpioglmib = 1;</code>
     * @return The enum numeric value on the wire for lknpioglmib.
     */
    @java.lang.Override public int getLknpioglmibValue() {
      return lknpioglmib_;
    }
    /**
     * <code>.POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP lknpioglmib = 1;</code>
     * @param value The enum numeric value on the wire for lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmibValue(int value) {
      
      lknpioglmib_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP lknpioglmib = 1;</code>
     * @return The lknpioglmib.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP getLknpioglmib() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP result = POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP.valueOf(lknpioglmib_);
      return result == null ? POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP lknpioglmib = 1;</code>
     * @param value The lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmib(POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lknpioglmib_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PJPFEIAGHAO.OICGHCIDMJP lknpioglmib = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLknpioglmib() {
      
      lknpioglmib_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HDJJJBKOGHK, POGOProtos.Rpc.HDJJJBKOGHK.Builder, POGOProtos.Rpc.HDJJJBKOGHKOrBuilder> mfcgefaehpnBuilder_;
    /**
     * <code>.POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn = 2;</code>
     * @return Whether the mfcgefaehpn field is set.
     */
    public boolean hasMfcgefaehpn() {
      return mfcgefaehpnBuilder_ != null || mfcgefaehpn_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn = 2;</code>
     * @return The mfcgefaehpn.
     */
    public POGOProtos.Rpc.HDJJJBKOGHK getMfcgefaehpn() {
      if (mfcgefaehpnBuilder_ == null) {
        return mfcgefaehpn_ == null ? POGOProtos.Rpc.HDJJJBKOGHK.getDefaultInstance() : mfcgefaehpn_;
      } else {
        return mfcgefaehpnBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn = 2;</code>
     */
    public Builder setMfcgefaehpn(POGOProtos.Rpc.HDJJJBKOGHK value) {
      if (mfcgefaehpnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mfcgefaehpn_ = value;
        onChanged();
      } else {
        mfcgefaehpnBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn = 2;</code>
     */
    public Builder setMfcgefaehpn(
        POGOProtos.Rpc.HDJJJBKOGHK.Builder builderForValue) {
      if (mfcgefaehpnBuilder_ == null) {
        mfcgefaehpn_ = builderForValue.build();
        onChanged();
      } else {
        mfcgefaehpnBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn = 2;</code>
     */
    public Builder mergeMfcgefaehpn(POGOProtos.Rpc.HDJJJBKOGHK value) {
      if (mfcgefaehpnBuilder_ == null) {
        if (mfcgefaehpn_ != null) {
          mfcgefaehpn_ =
            POGOProtos.Rpc.HDJJJBKOGHK.newBuilder(mfcgefaehpn_).mergeFrom(value).buildPartial();
        } else {
          mfcgefaehpn_ = value;
        }
        onChanged();
      } else {
        mfcgefaehpnBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn = 2;</code>
     */
    public Builder clearMfcgefaehpn() {
      if (mfcgefaehpnBuilder_ == null) {
        mfcgefaehpn_ = null;
        onChanged();
      } else {
        mfcgefaehpn_ = null;
        mfcgefaehpnBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn = 2;</code>
     */
    public POGOProtos.Rpc.HDJJJBKOGHK.Builder getMfcgefaehpnBuilder() {
      
      onChanged();
      return getMfcgefaehpnFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn = 2;</code>
     */
    public POGOProtos.Rpc.HDJJJBKOGHKOrBuilder getMfcgefaehpnOrBuilder() {
      if (mfcgefaehpnBuilder_ != null) {
        return mfcgefaehpnBuilder_.getMessageOrBuilder();
      } else {
        return mfcgefaehpn_ == null ?
            POGOProtos.Rpc.HDJJJBKOGHK.getDefaultInstance() : mfcgefaehpn_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HDJJJBKOGHK mfcgefaehpn = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HDJJJBKOGHK, POGOProtos.Rpc.HDJJJBKOGHK.Builder, POGOProtos.Rpc.HDJJJBKOGHKOrBuilder> 
        getMfcgefaehpnFieldBuilder() {
      if (mfcgefaehpnBuilder_ == null) {
        mfcgefaehpnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.HDJJJBKOGHK, POGOProtos.Rpc.HDJJJBKOGHK.Builder, POGOProtos.Rpc.HDJJJBKOGHKOrBuilder>(
                getMfcgefaehpn(),
                getParentForChildren(),
                isClean());
        mfcgefaehpn_ = null;
      }
      return mfcgefaehpnBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PJPFEIAGHAO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PJPFEIAGHAO)
  private static final POGOProtos.Rpc.PJPFEIAGHAO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PJPFEIAGHAO();
  }

  public static POGOProtos.Rpc.PJPFEIAGHAO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PJPFEIAGHAO>
      PARSER = new com.google.protobuf.AbstractParser<PJPFEIAGHAO>() {
    @java.lang.Override
    public PJPFEIAGHAO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PJPFEIAGHAO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PJPFEIAGHAO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PJPFEIAGHAO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PJPFEIAGHAO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

