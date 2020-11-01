// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CAHMMGFIFPE}
 */
public  final class CAHMMGFIFPE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CAHMMGFIFPE)
    CAHMMGFIFPEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CAHMMGFIFPE.newBuilder() to construct.
  private CAHMMGFIFPE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CAHMMGFIFPE() {
    jbflkcdndlp_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CAHMMGFIFPE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CAHMMGFIFPE(
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
            POGOProtos.Rpc.KHNLPGENFBI.Builder subBuilder = null;
            if (capcapejedn_ != null) {
              subBuilder = capcapejedn_.toBuilder();
            }
            capcapejedn_ = input.readMessage(POGOProtos.Rpc.KHNLPGENFBI.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(capcapejedn_);
              capcapejedn_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAHMMGFIFPE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAHMMGFIFPE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CAHMMGFIFPE.class, POGOProtos.Rpc.CAHMMGFIFPE.Builder.class);
  }

  /**
   * <pre>
   * ref: CAHMMGFIFPE/DJIFHCFJBCN/CPCBLFAJBJJ
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ}
   */
  public enum CPCBLFAJBJJ
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
     * <code>NO_POKEMON = 2;</code>
     */
    NO_POKEMON(2),
    /**
     * <code>NO_OTHER_MOVES = 3;</code>
     */
    NO_OTHER_MOVES(3),
    /**
     * <code>NO_PLAYER = 4;</code>
     */
    NO_PLAYER(4),
    /**
     * <code>WRONG_ITEM_TYPE = 5;</code>
     */
    WRONG_ITEM_TYPE(5),
    /**
     * <code>ITEM_NOT_IN_INVENTORY = 6;</code>
     */
    ITEM_NOT_IN_INVENTORY(6),
    /**
     * <code>INVALID_POKEMON = 7;</code>
     */
    INVALID_POKEMON(7),
    /**
     * <code>MOVE_LOCKED = 8;</code>
     */
    MOVE_LOCKED(8),
    /**
     * <code>MOVE_CANNOT_BE_REROLLED = 9;</code>
     */
    MOVE_CANNOT_BE_REROLLED(9),
    /**
     * <code>INVALID_ELITE_MOVE = 10;</code>
     */
    INVALID_ELITE_MOVE(10),
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
     * <code>NO_POKEMON = 2;</code>
     */
    public static final int NO_POKEMON_VALUE = 2;
    /**
     * <code>NO_OTHER_MOVES = 3;</code>
     */
    public static final int NO_OTHER_MOVES_VALUE = 3;
    /**
     * <code>NO_PLAYER = 4;</code>
     */
    public static final int NO_PLAYER_VALUE = 4;
    /**
     * <code>WRONG_ITEM_TYPE = 5;</code>
     */
    public static final int WRONG_ITEM_TYPE_VALUE = 5;
    /**
     * <code>ITEM_NOT_IN_INVENTORY = 6;</code>
     */
    public static final int ITEM_NOT_IN_INVENTORY_VALUE = 6;
    /**
     * <code>INVALID_POKEMON = 7;</code>
     */
    public static final int INVALID_POKEMON_VALUE = 7;
    /**
     * <code>MOVE_LOCKED = 8;</code>
     */
    public static final int MOVE_LOCKED_VALUE = 8;
    /**
     * <code>MOVE_CANNOT_BE_REROLLED = 9;</code>
     */
    public static final int MOVE_CANNOT_BE_REROLLED_VALUE = 9;
    /**
     * <code>INVALID_ELITE_MOVE = 10;</code>
     */
    public static final int INVALID_ELITE_MOVE_VALUE = 10;


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
    public static CPCBLFAJBJJ valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CPCBLFAJBJJ forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return NO_POKEMON;
        case 3: return NO_OTHER_MOVES;
        case 4: return NO_PLAYER;
        case 5: return WRONG_ITEM_TYPE;
        case 6: return ITEM_NOT_IN_INVENTORY;
        case 7: return INVALID_POKEMON;
        case 8: return MOVE_LOCKED;
        case 9: return MOVE_CANNOT_BE_REROLLED;
        case 10: return INVALID_ELITE_MOVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CPCBLFAJBJJ>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CPCBLFAJBJJ> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CPCBLFAJBJJ>() {
            public CPCBLFAJBJJ findValueByNumber(int number) {
              return CPCBLFAJBJJ.forNumber(number);
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
      return POGOProtos.Rpc.CAHMMGFIFPE.getDescriptor().getEnumTypes().get(0);
    }

    private static final CPCBLFAJBJJ[] VALUES = values();

    public static CPCBLFAJBJJ valueOf(
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

    private CPCBLFAJBJJ(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ)
  }

  public static final int JBFLKCDNDLP_FIELD_NUMBER = 1;
  private int jbflkcdndlp_;
  /**
   * <code>.POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ jbflkcdndlp = 1;</code>
   * @return The enum numeric value on the wire for jbflkcdndlp.
   */
  public int getJbflkcdndlpValue() {
    return jbflkcdndlp_;
  }
  /**
   * <code>.POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ jbflkcdndlp = 1;</code>
   * @return The jbflkcdndlp.
   */
  public POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ getJbflkcdndlp() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ result = POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ.valueOf(jbflkcdndlp_);
    return result == null ? POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ.UNRECOGNIZED : result;
  }

  public static final int CAPCAPEJEDN_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.KHNLPGENFBI capcapejedn_;
  /**
   * <code>.POGOProtos.Rpc.KHNLPGENFBI capcapejedn = 2;</code>
   * @return Whether the capcapejedn field is set.
   */
  public boolean hasCapcapejedn() {
    return capcapejedn_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.KHNLPGENFBI capcapejedn = 2;</code>
   * @return The capcapejedn.
   */
  public POGOProtos.Rpc.KHNLPGENFBI getCapcapejedn() {
    return capcapejedn_ == null ? POGOProtos.Rpc.KHNLPGENFBI.getDefaultInstance() : capcapejedn_;
  }
  /**
   * <code>.POGOProtos.Rpc.KHNLPGENFBI capcapejedn = 2;</code>
   */
  public POGOProtos.Rpc.KHNLPGENFBIOrBuilder getCapcapejednOrBuilder() {
    return getCapcapejedn();
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
    if (jbflkcdndlp_ != POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ.UNSET.getNumber()) {
      output.writeEnum(1, jbflkcdndlp_);
    }
    if (capcapejedn_ != null) {
      output.writeMessage(2, getCapcapejedn());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jbflkcdndlp_ != POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, jbflkcdndlp_);
    }
    if (capcapejedn_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCapcapejedn());
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
    if (!(obj instanceof POGOProtos.Rpc.CAHMMGFIFPE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CAHMMGFIFPE other = (POGOProtos.Rpc.CAHMMGFIFPE) obj;

    if (jbflkcdndlp_ != other.jbflkcdndlp_) return false;
    if (hasCapcapejedn() != other.hasCapcapejedn()) return false;
    if (hasCapcapejedn()) {
      if (!getCapcapejedn()
          .equals(other.getCapcapejedn())) return false;
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
    if (hasCapcapejedn()) {
      hash = (37 * hash) + CAPCAPEJEDN_FIELD_NUMBER;
      hash = (53 * hash) + getCapcapejedn().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CAHMMGFIFPE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CAHMMGFIFPE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAHMMGFIFPE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CAHMMGFIFPE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAHMMGFIFPE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CAHMMGFIFPE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAHMMGFIFPE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CAHMMGFIFPE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAHMMGFIFPE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CAHMMGFIFPE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAHMMGFIFPE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CAHMMGFIFPE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CAHMMGFIFPE prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CAHMMGFIFPE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CAHMMGFIFPE)
      POGOProtos.Rpc.CAHMMGFIFPEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAHMMGFIFPE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAHMMGFIFPE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CAHMMGFIFPE.class, POGOProtos.Rpc.CAHMMGFIFPE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CAHMMGFIFPE.newBuilder()
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

      if (capcapejednBuilder_ == null) {
        capcapejedn_ = null;
      } else {
        capcapejedn_ = null;
        capcapejednBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAHMMGFIFPE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CAHMMGFIFPE getDefaultInstanceForType() {
      return POGOProtos.Rpc.CAHMMGFIFPE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CAHMMGFIFPE build() {
      POGOProtos.Rpc.CAHMMGFIFPE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CAHMMGFIFPE buildPartial() {
      POGOProtos.Rpc.CAHMMGFIFPE result = new POGOProtos.Rpc.CAHMMGFIFPE(this);
      result.jbflkcdndlp_ = jbflkcdndlp_;
      if (capcapejednBuilder_ == null) {
        result.capcapejedn_ = capcapejedn_;
      } else {
        result.capcapejedn_ = capcapejednBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.CAHMMGFIFPE) {
        return mergeFrom((POGOProtos.Rpc.CAHMMGFIFPE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CAHMMGFIFPE other) {
      if (other == POGOProtos.Rpc.CAHMMGFIFPE.getDefaultInstance()) return this;
      if (other.jbflkcdndlp_ != 0) {
        setJbflkcdndlpValue(other.getJbflkcdndlpValue());
      }
      if (other.hasCapcapejedn()) {
        mergeCapcapejedn(other.getCapcapejedn());
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
      POGOProtos.Rpc.CAHMMGFIFPE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CAHMMGFIFPE) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ jbflkcdndlp = 1;</code>
     * @return The enum numeric value on the wire for jbflkcdndlp.
     */
    public int getJbflkcdndlpValue() {
      return jbflkcdndlp_;
    }
    /**
     * <code>.POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ jbflkcdndlp = 1;</code>
     * @param value The enum numeric value on the wire for jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlpValue(int value) {
      jbflkcdndlp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ jbflkcdndlp = 1;</code>
     * @return The jbflkcdndlp.
     */
    public POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ getJbflkcdndlp() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ result = POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ.valueOf(jbflkcdndlp_);
      return result == null ? POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ jbflkcdndlp = 1;</code>
     * @param value The jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlp(POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jbflkcdndlp_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CAHMMGFIFPE.CPCBLFAJBJJ jbflkcdndlp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJbflkcdndlp() {
      
      jbflkcdndlp_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.KHNLPGENFBI capcapejedn_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.KHNLPGENFBI, POGOProtos.Rpc.KHNLPGENFBI.Builder, POGOProtos.Rpc.KHNLPGENFBIOrBuilder> capcapejednBuilder_;
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI capcapejedn = 2;</code>
     * @return Whether the capcapejedn field is set.
     */
    public boolean hasCapcapejedn() {
      return capcapejednBuilder_ != null || capcapejedn_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI capcapejedn = 2;</code>
     * @return The capcapejedn.
     */
    public POGOProtos.Rpc.KHNLPGENFBI getCapcapejedn() {
      if (capcapejednBuilder_ == null) {
        return capcapejedn_ == null ? POGOProtos.Rpc.KHNLPGENFBI.getDefaultInstance() : capcapejedn_;
      } else {
        return capcapejednBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI capcapejedn = 2;</code>
     */
    public Builder setCapcapejedn(POGOProtos.Rpc.KHNLPGENFBI value) {
      if (capcapejednBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        capcapejedn_ = value;
        onChanged();
      } else {
        capcapejednBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI capcapejedn = 2;</code>
     */
    public Builder setCapcapejedn(
        POGOProtos.Rpc.KHNLPGENFBI.Builder builderForValue) {
      if (capcapejednBuilder_ == null) {
        capcapejedn_ = builderForValue.build();
        onChanged();
      } else {
        capcapejednBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI capcapejedn = 2;</code>
     */
    public Builder mergeCapcapejedn(POGOProtos.Rpc.KHNLPGENFBI value) {
      if (capcapejednBuilder_ == null) {
        if (capcapejedn_ != null) {
          capcapejedn_ =
            POGOProtos.Rpc.KHNLPGENFBI.newBuilder(capcapejedn_).mergeFrom(value).buildPartial();
        } else {
          capcapejedn_ = value;
        }
        onChanged();
      } else {
        capcapejednBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI capcapejedn = 2;</code>
     */
    public Builder clearCapcapejedn() {
      if (capcapejednBuilder_ == null) {
        capcapejedn_ = null;
        onChanged();
      } else {
        capcapejedn_ = null;
        capcapejednBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI capcapejedn = 2;</code>
     */
    public POGOProtos.Rpc.KHNLPGENFBI.Builder getCapcapejednBuilder() {
      
      onChanged();
      return getCapcapejednFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI capcapejedn = 2;</code>
     */
    public POGOProtos.Rpc.KHNLPGENFBIOrBuilder getCapcapejednOrBuilder() {
      if (capcapejednBuilder_ != null) {
        return capcapejednBuilder_.getMessageOrBuilder();
      } else {
        return capcapejedn_ == null ?
            POGOProtos.Rpc.KHNLPGENFBI.getDefaultInstance() : capcapejedn_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI capcapejedn = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.KHNLPGENFBI, POGOProtos.Rpc.KHNLPGENFBI.Builder, POGOProtos.Rpc.KHNLPGENFBIOrBuilder> 
        getCapcapejednFieldBuilder() {
      if (capcapejednBuilder_ == null) {
        capcapejednBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.KHNLPGENFBI, POGOProtos.Rpc.KHNLPGENFBI.Builder, POGOProtos.Rpc.KHNLPGENFBIOrBuilder>(
                getCapcapejedn(),
                getParentForChildren(),
                isClean());
        capcapejedn_ = null;
      }
      return capcapejednBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CAHMMGFIFPE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CAHMMGFIFPE)
  private static final POGOProtos.Rpc.CAHMMGFIFPE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CAHMMGFIFPE();
  }

  public static POGOProtos.Rpc.CAHMMGFIFPE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CAHMMGFIFPE>
      PARSER = new com.google.protobuf.AbstractParser<CAHMMGFIFPE>() {
    @java.lang.Override
    public CAHMMGFIFPE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CAHMMGFIFPE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CAHMMGFIFPE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CAHMMGFIFPE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CAHMMGFIFPE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

