// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BBIJCNBCEFO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BBIJCNBCEFO}
 */
public final class BBIJCNBCEFO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BBIJCNBCEFO)
    BBIJCNBCEFOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BBIJCNBCEFO.newBuilder() to construct.
  private BBIJCNBCEFO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BBIJCNBCEFO() {
    magjbjmclno_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BBIJCNBCEFO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BBIJCNBCEFO(
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

            magjbjmclno_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.FLFNEIECKNK.Builder subBuilder = null;
            if (niklklmcmgp_ != null) {
              subBuilder = niklklmcmgp_.toBuilder();
            }
            niklklmcmgp_ = input.readMessage(POGOProtos.Rpc.FLFNEIECKNK.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(niklklmcmgp_);
              niklklmcmgp_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BBIJCNBCEFO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BBIJCNBCEFO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BBIJCNBCEFO.class, POGOProtos.Rpc.BBIJCNBCEFO.Builder.class);
  }

  /**
   * <pre>
   * ref: BBIJCNBCEFO/CACLFIFEJHH/KFHEJKCGCLG
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG}
   */
  public enum KFHEJKCGCLG
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
     * <code>ERROR_NO_PLAYER_POKEMON = 9;</code>
     */
    ERROR_NO_PLAYER_POKEMON(9),
    /**
     * <code>ERROR_NO_FRIEND_POKEMON = 10;</code>
     */
    ERROR_NO_FRIEND_POKEMON(10),
    /**
     * <code>ERROR_PLAYER_ALREADY_CONFIRMED = 11;</code>
     */
    ERROR_PLAYER_ALREADY_CONFIRMED(11),
    /**
     * <code>ERROR_TRANSACTION_LOG_NOT_MATCH = 12;</code>
     */
    ERROR_TRANSACTION_LOG_NOT_MATCH(12),
    /**
     * <code>ERROR_TRADING_EXPIRED = 13;</code>
     */
    ERROR_TRADING_EXPIRED(13),
    /**
     * <code>ERROR_TRANSACTION = 14;</code>
     */
    ERROR_TRANSACTION(14),
    /**
     * <code>ERROR_DAILY_LIMIT_REACHED = 15;</code>
     */
    ERROR_DAILY_LIMIT_REACHED(15),
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
     * <code>ERROR_NO_PLAYER_POKEMON = 9;</code>
     */
    public static final int ERROR_NO_PLAYER_POKEMON_VALUE = 9;
    /**
     * <code>ERROR_NO_FRIEND_POKEMON = 10;</code>
     */
    public static final int ERROR_NO_FRIEND_POKEMON_VALUE = 10;
    /**
     * <code>ERROR_PLAYER_ALREADY_CONFIRMED = 11;</code>
     */
    public static final int ERROR_PLAYER_ALREADY_CONFIRMED_VALUE = 11;
    /**
     * <code>ERROR_TRANSACTION_LOG_NOT_MATCH = 12;</code>
     */
    public static final int ERROR_TRANSACTION_LOG_NOT_MATCH_VALUE = 12;
    /**
     * <code>ERROR_TRADING_EXPIRED = 13;</code>
     */
    public static final int ERROR_TRADING_EXPIRED_VALUE = 13;
    /**
     * <code>ERROR_TRANSACTION = 14;</code>
     */
    public static final int ERROR_TRANSACTION_VALUE = 14;
    /**
     * <code>ERROR_DAILY_LIMIT_REACHED = 15;</code>
     */
    public static final int ERROR_DAILY_LIMIT_REACHED_VALUE = 15;


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
    public static KFHEJKCGCLG valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static KFHEJKCGCLG forNumber(int value) {
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
        case 9: return ERROR_NO_PLAYER_POKEMON;
        case 10: return ERROR_NO_FRIEND_POKEMON;
        case 11: return ERROR_PLAYER_ALREADY_CONFIRMED;
        case 12: return ERROR_TRANSACTION_LOG_NOT_MATCH;
        case 13: return ERROR_TRADING_EXPIRED;
        case 14: return ERROR_TRANSACTION;
        case 15: return ERROR_DAILY_LIMIT_REACHED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<KFHEJKCGCLG>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        KFHEJKCGCLG> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<KFHEJKCGCLG>() {
            public KFHEJKCGCLG findValueByNumber(int number) {
              return KFHEJKCGCLG.forNumber(number);
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
      return POGOProtos.Rpc.BBIJCNBCEFO.getDescriptor().getEnumTypes().get(0);
    }

    private static final KFHEJKCGCLG[] VALUES = values();

    public static KFHEJKCGCLG valueOf(
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

    private KFHEJKCGCLG(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG)
  }

  public static final int MAGJBJMCLNO_FIELD_NUMBER = 1;
  private int magjbjmclno_;
  /**
   * <code>.POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG magjbjmclno = 1;</code>
   * @return The enum numeric value on the wire for magjbjmclno.
   */
  @java.lang.Override public int getMagjbjmclnoValue() {
    return magjbjmclno_;
  }
  /**
   * <code>.POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG magjbjmclno = 1;</code>
   * @return The magjbjmclno.
   */
  @java.lang.Override public POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG getMagjbjmclno() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG result = POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG.valueOf(magjbjmclno_);
    return result == null ? POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG.UNRECOGNIZED : result;
  }

  public static final int NIKLKLMCMGP_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp_;
  /**
   * <code>.POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp = 2;</code>
   * @return Whether the niklklmcmgp field is set.
   */
  @java.lang.Override
  public boolean hasNiklklmcmgp() {
    return niklklmcmgp_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp = 2;</code>
   * @return The niklklmcmgp.
   */
  @java.lang.Override
  public POGOProtos.Rpc.FLFNEIECKNK getNiklklmcmgp() {
    return niklklmcmgp_ == null ? POGOProtos.Rpc.FLFNEIECKNK.getDefaultInstance() : niklklmcmgp_;
  }
  /**
   * <code>.POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.FLFNEIECKNKOrBuilder getNiklklmcmgpOrBuilder() {
    return getNiklklmcmgp();
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
    if (magjbjmclno_ != POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG.UNSET.getNumber()) {
      output.writeEnum(1, magjbjmclno_);
    }
    if (niklklmcmgp_ != null) {
      output.writeMessage(2, getNiklklmcmgp());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (magjbjmclno_ != POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, magjbjmclno_);
    }
    if (niklklmcmgp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNiklklmcmgp());
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
    if (!(obj instanceof POGOProtos.Rpc.BBIJCNBCEFO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BBIJCNBCEFO other = (POGOProtos.Rpc.BBIJCNBCEFO) obj;

    if (magjbjmclno_ != other.magjbjmclno_) return false;
    if (hasNiklklmcmgp() != other.hasNiklklmcmgp()) return false;
    if (hasNiklklmcmgp()) {
      if (!getNiklklmcmgp()
          .equals(other.getNiklklmcmgp())) return false;
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
    hash = (37 * hash) + MAGJBJMCLNO_FIELD_NUMBER;
    hash = (53 * hash) + magjbjmclno_;
    if (hasNiklklmcmgp()) {
      hash = (37 * hash) + NIKLKLMCMGP_FIELD_NUMBER;
      hash = (53 * hash) + getNiklklmcmgp().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BBIJCNBCEFO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BBIJCNBCEFO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BBIJCNBCEFO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BBIJCNBCEFO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BBIJCNBCEFO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BBIJCNBCEFO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BBIJCNBCEFO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BBIJCNBCEFO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BBIJCNBCEFO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BBIJCNBCEFO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BBIJCNBCEFO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BBIJCNBCEFO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BBIJCNBCEFO prototype) {
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
   * ref: BBIJCNBCEFO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BBIJCNBCEFO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BBIJCNBCEFO)
      POGOProtos.Rpc.BBIJCNBCEFOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BBIJCNBCEFO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BBIJCNBCEFO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BBIJCNBCEFO.class, POGOProtos.Rpc.BBIJCNBCEFO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BBIJCNBCEFO.newBuilder()
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
      magjbjmclno_ = 0;

      if (niklklmcmgpBuilder_ == null) {
        niklklmcmgp_ = null;
      } else {
        niklklmcmgp_ = null;
        niklklmcmgpBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BBIJCNBCEFO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BBIJCNBCEFO getDefaultInstanceForType() {
      return POGOProtos.Rpc.BBIJCNBCEFO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BBIJCNBCEFO build() {
      POGOProtos.Rpc.BBIJCNBCEFO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BBIJCNBCEFO buildPartial() {
      POGOProtos.Rpc.BBIJCNBCEFO result = new POGOProtos.Rpc.BBIJCNBCEFO(this);
      result.magjbjmclno_ = magjbjmclno_;
      if (niklklmcmgpBuilder_ == null) {
        result.niklklmcmgp_ = niklklmcmgp_;
      } else {
        result.niklklmcmgp_ = niklklmcmgpBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.BBIJCNBCEFO) {
        return mergeFrom((POGOProtos.Rpc.BBIJCNBCEFO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BBIJCNBCEFO other) {
      if (other == POGOProtos.Rpc.BBIJCNBCEFO.getDefaultInstance()) return this;
      if (other.magjbjmclno_ != 0) {
        setMagjbjmclnoValue(other.getMagjbjmclnoValue());
      }
      if (other.hasNiklklmcmgp()) {
        mergeNiklklmcmgp(other.getNiklklmcmgp());
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
      POGOProtos.Rpc.BBIJCNBCEFO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BBIJCNBCEFO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int magjbjmclno_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG magjbjmclno = 1;</code>
     * @return The enum numeric value on the wire for magjbjmclno.
     */
    @java.lang.Override public int getMagjbjmclnoValue() {
      return magjbjmclno_;
    }
    /**
     * <code>.POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG magjbjmclno = 1;</code>
     * @param value The enum numeric value on the wire for magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclnoValue(int value) {
      
      magjbjmclno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG magjbjmclno = 1;</code>
     * @return The magjbjmclno.
     */
    @java.lang.Override
    public POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG getMagjbjmclno() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG result = POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG.valueOf(magjbjmclno_);
      return result == null ? POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG magjbjmclno = 1;</code>
     * @param value The magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclno(POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      magjbjmclno_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BBIJCNBCEFO.KFHEJKCGCLG magjbjmclno = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMagjbjmclno() {
      
      magjbjmclno_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FLFNEIECKNK, POGOProtos.Rpc.FLFNEIECKNK.Builder, POGOProtos.Rpc.FLFNEIECKNKOrBuilder> niklklmcmgpBuilder_;
    /**
     * <code>.POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp = 2;</code>
     * @return Whether the niklklmcmgp field is set.
     */
    public boolean hasNiklklmcmgp() {
      return niklklmcmgpBuilder_ != null || niklklmcmgp_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp = 2;</code>
     * @return The niklklmcmgp.
     */
    public POGOProtos.Rpc.FLFNEIECKNK getNiklklmcmgp() {
      if (niklklmcmgpBuilder_ == null) {
        return niklklmcmgp_ == null ? POGOProtos.Rpc.FLFNEIECKNK.getDefaultInstance() : niklklmcmgp_;
      } else {
        return niklklmcmgpBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp = 2;</code>
     */
    public Builder setNiklklmcmgp(POGOProtos.Rpc.FLFNEIECKNK value) {
      if (niklklmcmgpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        niklklmcmgp_ = value;
        onChanged();
      } else {
        niklklmcmgpBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp = 2;</code>
     */
    public Builder setNiklklmcmgp(
        POGOProtos.Rpc.FLFNEIECKNK.Builder builderForValue) {
      if (niklklmcmgpBuilder_ == null) {
        niklklmcmgp_ = builderForValue.build();
        onChanged();
      } else {
        niklklmcmgpBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp = 2;</code>
     */
    public Builder mergeNiklklmcmgp(POGOProtos.Rpc.FLFNEIECKNK value) {
      if (niklklmcmgpBuilder_ == null) {
        if (niklklmcmgp_ != null) {
          niklklmcmgp_ =
            POGOProtos.Rpc.FLFNEIECKNK.newBuilder(niklklmcmgp_).mergeFrom(value).buildPartial();
        } else {
          niklklmcmgp_ = value;
        }
        onChanged();
      } else {
        niklklmcmgpBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp = 2;</code>
     */
    public Builder clearNiklklmcmgp() {
      if (niklklmcmgpBuilder_ == null) {
        niklklmcmgp_ = null;
        onChanged();
      } else {
        niklklmcmgp_ = null;
        niklklmcmgpBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp = 2;</code>
     */
    public POGOProtos.Rpc.FLFNEIECKNK.Builder getNiklklmcmgpBuilder() {
      
      onChanged();
      return getNiklklmcmgpFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp = 2;</code>
     */
    public POGOProtos.Rpc.FLFNEIECKNKOrBuilder getNiklklmcmgpOrBuilder() {
      if (niklklmcmgpBuilder_ != null) {
        return niklklmcmgpBuilder_.getMessageOrBuilder();
      } else {
        return niklklmcmgp_ == null ?
            POGOProtos.Rpc.FLFNEIECKNK.getDefaultInstance() : niklklmcmgp_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FLFNEIECKNK niklklmcmgp = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FLFNEIECKNK, POGOProtos.Rpc.FLFNEIECKNK.Builder, POGOProtos.Rpc.FLFNEIECKNKOrBuilder> 
        getNiklklmcmgpFieldBuilder() {
      if (niklklmcmgpBuilder_ == null) {
        niklklmcmgpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.FLFNEIECKNK, POGOProtos.Rpc.FLFNEIECKNK.Builder, POGOProtos.Rpc.FLFNEIECKNKOrBuilder>(
                getNiklklmcmgp(),
                getParentForChildren(),
                isClean());
        niklklmcmgp_ = null;
      }
      return niklklmcmgpBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BBIJCNBCEFO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BBIJCNBCEFO)
  private static final POGOProtos.Rpc.BBIJCNBCEFO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BBIJCNBCEFO();
  }

  public static POGOProtos.Rpc.BBIJCNBCEFO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BBIJCNBCEFO>
      PARSER = new com.google.protobuf.AbstractParser<BBIJCNBCEFO>() {
    @java.lang.Override
    public BBIJCNBCEFO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BBIJCNBCEFO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BBIJCNBCEFO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BBIJCNBCEFO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BBIJCNBCEFO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

