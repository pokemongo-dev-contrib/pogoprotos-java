// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ACILCGFCEPL}
 */
public  final class ACILCGFCEPL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ACILCGFCEPL)
    ACILCGFCEPLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ACILCGFCEPL.newBuilder() to construct.
  private ACILCGFCEPL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ACILCGFCEPL() {
    jbflkcdndlp_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ACILCGFCEPL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ACILCGFCEPL(
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

            jbflkcdndlp_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.GNEKCELDACL.Builder subBuilder = null;
            if (jkhebdnpedh_ != null) {
              subBuilder = jkhebdnpedh_.toBuilder();
            }
            jkhebdnpedh_ = input.readMessage(POGOProtos.Rpc.GNEKCELDACL.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jkhebdnpedh_);
              jkhebdnpedh_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ACILCGFCEPL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ACILCGFCEPL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ACILCGFCEPL.class, POGOProtos.Rpc.ACILCGFCEPL.Builder.class);
  }

  /**
   * <pre>
   * ref: ACILCGFCEPL/BOPMNHEKEAO/LPMODAOEPKF
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF}
   */
  public enum LPMODAOEPKF
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
    /**
     * <code>ERROR_INVALID_POKEMON = 7;</code>
     */
    ERROR_INVALID_POKEMON(7),
    /**
     * <code>ERROR_INSUFFICIENT_PAYMENT = 8;</code>
     */
    ERROR_INSUFFICIENT_PAYMENT(8),
    /**
     * <code>ERROR_TRADING_EXPIRED = 9;</code>
     */
    ERROR_TRADING_EXPIRED(9),
    /**
     * <code>ERROR_TRADING_FINISHED = 10;</code>
     */
    ERROR_TRADING_FINISHED(10),
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
    /**
     * <code>ERROR_INVALID_POKEMON = 7;</code>
     */
    public static final int ERROR_INVALID_POKEMON_VALUE = 7;
    /**
     * <code>ERROR_INSUFFICIENT_PAYMENT = 8;</code>
     */
    public static final int ERROR_INSUFFICIENT_PAYMENT_VALUE = 8;
    /**
     * <code>ERROR_TRADING_EXPIRED = 9;</code>
     */
    public static final int ERROR_TRADING_EXPIRED_VALUE = 9;
    /**
     * <code>ERROR_TRADING_FINISHED = 10;</code>
     */
    public static final int ERROR_TRADING_FINISHED_VALUE = 10;


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
    public static LPMODAOEPKF valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LPMODAOEPKF forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_UNKNOWN;
        case 3: return ERROR_FRIEND_NOT_FOUND;
        case 4: return ERROR_INVALID_PLAYER_ID;
        case 5: return ERROR_INVALID_STATE;
        case 6: return ERROR_STATE_HANDLER;
        case 7: return ERROR_INVALID_POKEMON;
        case 8: return ERROR_INSUFFICIENT_PAYMENT;
        case 9: return ERROR_TRADING_EXPIRED;
        case 10: return ERROR_TRADING_FINISHED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LPMODAOEPKF>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LPMODAOEPKF> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LPMODAOEPKF>() {
            public LPMODAOEPKF findValueByNumber(int number) {
              return LPMODAOEPKF.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.ACILCGFCEPL.getDescriptor().getEnumTypes().get(0);
    }

    private static final LPMODAOEPKF[] VALUES = values();

    public static LPMODAOEPKF valueOf(
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

    private LPMODAOEPKF(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF)
  }

  public static final int JBFLKCDNDLP_FIELD_NUMBER = 1;
  private int jbflkcdndlp_;
  /**
   * <code>.POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF jbflkcdndlp = 1;</code>
   * @return The enum numeric value on the wire for jbflkcdndlp.
   */
  public int getJbflkcdndlpValue() {
    return jbflkcdndlp_;
  }
  /**
   * <code>.POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF jbflkcdndlp = 1;</code>
   * @return The jbflkcdndlp.
   */
  public POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF getJbflkcdndlp() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF result = POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF.valueOf(jbflkcdndlp_);
    return result == null ? POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF.UNRECOGNIZED : result;
  }

  public static final int JKHEBDNPEDH_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh_;
  /**
   * <code>.POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh = 2;</code>
   * @return Whether the jkhebdnpedh field is set.
   */
  public boolean hasJkhebdnpedh() {
    return jkhebdnpedh_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh = 2;</code>
   * @return The jkhebdnpedh.
   */
  public POGOProtos.Rpc.GNEKCELDACL getJkhebdnpedh() {
    return jkhebdnpedh_ == null ? POGOProtos.Rpc.GNEKCELDACL.getDefaultInstance() : jkhebdnpedh_;
  }
  /**
   * <code>.POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh = 2;</code>
   */
  public POGOProtos.Rpc.GNEKCELDACLOrBuilder getJkhebdnpedhOrBuilder() {
    return getJkhebdnpedh();
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
    if (jbflkcdndlp_ != POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF.UNSET.getNumber()) {
      output.writeEnum(1, jbflkcdndlp_);
    }
    if (jkhebdnpedh_ != null) {
      output.writeMessage(2, getJkhebdnpedh());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jbflkcdndlp_ != POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, jbflkcdndlp_);
    }
    if (jkhebdnpedh_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJkhebdnpedh());
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
    if (!(obj instanceof POGOProtos.Rpc.ACILCGFCEPL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ACILCGFCEPL other = (POGOProtos.Rpc.ACILCGFCEPL) obj;

    if (jbflkcdndlp_ != other.jbflkcdndlp_) return false;
    if (hasJkhebdnpedh() != other.hasJkhebdnpedh()) return false;
    if (hasJkhebdnpedh()) {
      if (!getJkhebdnpedh()
          .equals(other.getJkhebdnpedh())) return false;
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
    hash = (37 * hash) + JBFLKCDNDLP_FIELD_NUMBER;
    hash = (53 * hash) + jbflkcdndlp_;
    if (hasJkhebdnpedh()) {
      hash = (37 * hash) + JKHEBDNPEDH_FIELD_NUMBER;
      hash = (53 * hash) + getJkhebdnpedh().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ACILCGFCEPL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ACILCGFCEPL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ACILCGFCEPL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ACILCGFCEPL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ACILCGFCEPL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ACILCGFCEPL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ACILCGFCEPL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ACILCGFCEPL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ACILCGFCEPL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ACILCGFCEPL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ACILCGFCEPL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ACILCGFCEPL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ACILCGFCEPL prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ACILCGFCEPL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ACILCGFCEPL)
      POGOProtos.Rpc.ACILCGFCEPLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ACILCGFCEPL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ACILCGFCEPL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ACILCGFCEPL.class, POGOProtos.Rpc.ACILCGFCEPL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ACILCGFCEPL.newBuilder()
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
      jbflkcdndlp_ = 0;

      if (jkhebdnpedhBuilder_ == null) {
        jkhebdnpedh_ = null;
      } else {
        jkhebdnpedh_ = null;
        jkhebdnpedhBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ACILCGFCEPL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ACILCGFCEPL getDefaultInstanceForType() {
      return POGOProtos.Rpc.ACILCGFCEPL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ACILCGFCEPL build() {
      POGOProtos.Rpc.ACILCGFCEPL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ACILCGFCEPL buildPartial() {
      POGOProtos.Rpc.ACILCGFCEPL result = new POGOProtos.Rpc.ACILCGFCEPL(this);
      result.jbflkcdndlp_ = jbflkcdndlp_;
      if (jkhebdnpedhBuilder_ == null) {
        result.jkhebdnpedh_ = jkhebdnpedh_;
      } else {
        result.jkhebdnpedh_ = jkhebdnpedhBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.ACILCGFCEPL) {
        return mergeFrom((POGOProtos.Rpc.ACILCGFCEPL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ACILCGFCEPL other) {
      if (other == POGOProtos.Rpc.ACILCGFCEPL.getDefaultInstance()) return this;
      if (other.jbflkcdndlp_ != 0) {
        setJbflkcdndlpValue(other.getJbflkcdndlpValue());
      }
      if (other.hasJkhebdnpedh()) {
        mergeJkhebdnpedh(other.getJkhebdnpedh());
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
      POGOProtos.Rpc.ACILCGFCEPL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ACILCGFCEPL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int jbflkcdndlp_ = 0;
    /**
     * <code>.POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF jbflkcdndlp = 1;</code>
     * @return The enum numeric value on the wire for jbflkcdndlp.
     */
    public int getJbflkcdndlpValue() {
      return jbflkcdndlp_;
    }
    /**
     * <code>.POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF jbflkcdndlp = 1;</code>
     * @param value The enum numeric value on the wire for jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlpValue(int value) {
      jbflkcdndlp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF jbflkcdndlp = 1;</code>
     * @return The jbflkcdndlp.
     */
    public POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF getJbflkcdndlp() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF result = POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF.valueOf(jbflkcdndlp_);
      return result == null ? POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF jbflkcdndlp = 1;</code>
     * @param value The jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlp(POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jbflkcdndlp_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ACILCGFCEPL.LPMODAOEPKF jbflkcdndlp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJbflkcdndlp() {
      
      jbflkcdndlp_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GNEKCELDACL, POGOProtos.Rpc.GNEKCELDACL.Builder, POGOProtos.Rpc.GNEKCELDACLOrBuilder> jkhebdnpedhBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh = 2;</code>
     * @return Whether the jkhebdnpedh field is set.
     */
    public boolean hasJkhebdnpedh() {
      return jkhebdnpedhBuilder_ != null || jkhebdnpedh_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh = 2;</code>
     * @return The jkhebdnpedh.
     */
    public POGOProtos.Rpc.GNEKCELDACL getJkhebdnpedh() {
      if (jkhebdnpedhBuilder_ == null) {
        return jkhebdnpedh_ == null ? POGOProtos.Rpc.GNEKCELDACL.getDefaultInstance() : jkhebdnpedh_;
      } else {
        return jkhebdnpedhBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh = 2;</code>
     */
    public Builder setJkhebdnpedh(POGOProtos.Rpc.GNEKCELDACL value) {
      if (jkhebdnpedhBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jkhebdnpedh_ = value;
        onChanged();
      } else {
        jkhebdnpedhBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh = 2;</code>
     */
    public Builder setJkhebdnpedh(
        POGOProtos.Rpc.GNEKCELDACL.Builder builderForValue) {
      if (jkhebdnpedhBuilder_ == null) {
        jkhebdnpedh_ = builderForValue.build();
        onChanged();
      } else {
        jkhebdnpedhBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh = 2;</code>
     */
    public Builder mergeJkhebdnpedh(POGOProtos.Rpc.GNEKCELDACL value) {
      if (jkhebdnpedhBuilder_ == null) {
        if (jkhebdnpedh_ != null) {
          jkhebdnpedh_ =
            POGOProtos.Rpc.GNEKCELDACL.newBuilder(jkhebdnpedh_).mergeFrom(value).buildPartial();
        } else {
          jkhebdnpedh_ = value;
        }
        onChanged();
      } else {
        jkhebdnpedhBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh = 2;</code>
     */
    public Builder clearJkhebdnpedh() {
      if (jkhebdnpedhBuilder_ == null) {
        jkhebdnpedh_ = null;
        onChanged();
      } else {
        jkhebdnpedh_ = null;
        jkhebdnpedhBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh = 2;</code>
     */
    public POGOProtos.Rpc.GNEKCELDACL.Builder getJkhebdnpedhBuilder() {
      
      onChanged();
      return getJkhebdnpedhFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh = 2;</code>
     */
    public POGOProtos.Rpc.GNEKCELDACLOrBuilder getJkhebdnpedhOrBuilder() {
      if (jkhebdnpedhBuilder_ != null) {
        return jkhebdnpedhBuilder_.getMessageOrBuilder();
      } else {
        return jkhebdnpedh_ == null ?
            POGOProtos.Rpc.GNEKCELDACL.getDefaultInstance() : jkhebdnpedh_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GNEKCELDACL jkhebdnpedh = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GNEKCELDACL, POGOProtos.Rpc.GNEKCELDACL.Builder, POGOProtos.Rpc.GNEKCELDACLOrBuilder> 
        getJkhebdnpedhFieldBuilder() {
      if (jkhebdnpedhBuilder_ == null) {
        jkhebdnpedhBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.GNEKCELDACL, POGOProtos.Rpc.GNEKCELDACL.Builder, POGOProtos.Rpc.GNEKCELDACLOrBuilder>(
                getJkhebdnpedh(),
                getParentForChildren(),
                isClean());
        jkhebdnpedh_ = null;
      }
      return jkhebdnpedhBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ACILCGFCEPL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ACILCGFCEPL)
  private static final POGOProtos.Rpc.ACILCGFCEPL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ACILCGFCEPL();
  }

  public static POGOProtos.Rpc.ACILCGFCEPL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ACILCGFCEPL>
      PARSER = new com.google.protobuf.AbstractParser<ACILCGFCEPL>() {
    @java.lang.Override
    public ACILCGFCEPL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ACILCGFCEPL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ACILCGFCEPL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ACILCGFCEPL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ACILCGFCEPL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

