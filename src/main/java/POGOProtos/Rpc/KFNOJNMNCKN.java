// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KFNOJNMNCKN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.KFNOJNMNCKN}
 */
public final class KFNOJNMNCKN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KFNOJNMNCKN)
    KFNOJNMNCKNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KFNOJNMNCKN.newBuilder() to construct.
  private KFNOJNMNCKN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KFNOJNMNCKN() {
    enhafcpkmml_ = java.util.Collections.emptyList();
    magjbjmclno_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KFNOJNMNCKN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KFNOJNMNCKN(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              enhafcpkmml_ = new java.util.ArrayList<POGOProtos.Rpc.GIJGLGKDNKD>();
              mutable_bitField0_ |= 0x00000001;
            }
            enhafcpkmml_.add(
                input.readMessage(POGOProtos.Rpc.GIJGLGKDNKD.parser(), extensionRegistry));
            break;
          }
          case 16: {

            aplkbhpgllh_ = input.readUInt64();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            magjbjmclno_ = rawValue;
            break;
          }
          case 32: {

            endgaihehda_ = input.readInt32();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        enhafcpkmml_ = java.util.Collections.unmodifiableList(enhafcpkmml_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KFNOJNMNCKN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KFNOJNMNCKN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KFNOJNMNCKN.class, POGOProtos.Rpc.KFNOJNMNCKN.Builder.class);
  }

  /**
   * <pre>
   * ref: KFNOJNMNCKN/OAAPINHCPFF/AOHMJGPDKAP
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP}
   */
  public enum AOHMJGPDKAP
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
     * <code>PAGE = 2;</code>
     */
    PAGE(2),
    /**
     * <code>RETRY = 3;</code>
     */
    RETRY(3),
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
     * <code>PAGE = 2;</code>
     */
    public static final int PAGE_VALUE = 2;
    /**
     * <code>RETRY = 3;</code>
     */
    public static final int RETRY_VALUE = 3;


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
    public static AOHMJGPDKAP valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AOHMJGPDKAP forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return PAGE;
        case 3: return RETRY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AOHMJGPDKAP>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AOHMJGPDKAP> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AOHMJGPDKAP>() {
            public AOHMJGPDKAP findValueByNumber(int number) {
              return AOHMJGPDKAP.forNumber(number);
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
      return POGOProtos.Rpc.KFNOJNMNCKN.getDescriptor().getEnumTypes().get(0);
    }

    private static final AOHMJGPDKAP[] VALUES = values();

    public static AOHMJGPDKAP valueOf(
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

    private AOHMJGPDKAP(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP)
  }

  public static final int ENHAFCPKMML_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.GIJGLGKDNKD> enhafcpkmml_;
  /**
   * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.GIJGLGKDNKD> getEnhafcpkmmlList() {
    return enhafcpkmml_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.GIJGLGKDNKDOrBuilder> 
      getEnhafcpkmmlOrBuilderList() {
    return enhafcpkmml_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
   */
  @java.lang.Override
  public int getEnhafcpkmmlCount() {
    return enhafcpkmml_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GIJGLGKDNKD getEnhafcpkmml(int index) {
    return enhafcpkmml_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GIJGLGKDNKDOrBuilder getEnhafcpkmmlOrBuilder(
      int index) {
    return enhafcpkmml_.get(index);
  }

  public static final int APLKBHPGLLH_FIELD_NUMBER = 2;
  private long aplkbhpgllh_;
  /**
   * <code>uint64 aplkbhpgllh = 2;</code>
   * @return The aplkbhpgllh.
   */
  @java.lang.Override
  public long getAplkbhpgllh() {
    return aplkbhpgllh_;
  }

  public static final int MAGJBJMCLNO_FIELD_NUMBER = 3;
  private int magjbjmclno_;
  /**
   * <code>.POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP magjbjmclno = 3;</code>
   * @return The enum numeric value on the wire for magjbjmclno.
   */
  @java.lang.Override public int getMagjbjmclnoValue() {
    return magjbjmclno_;
  }
  /**
   * <code>.POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP magjbjmclno = 3;</code>
   * @return The magjbjmclno.
   */
  @java.lang.Override public POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP getMagjbjmclno() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP result = POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP.valueOf(magjbjmclno_);
    return result == null ? POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP.UNRECOGNIZED : result;
  }

  public static final int ENDGAIHEHDA_FIELD_NUMBER = 4;
  private int endgaihehda_;
  /**
   * <code>int32 endgaihehda = 4;</code>
   * @return The endgaihehda.
   */
  @java.lang.Override
  public int getEndgaihehda() {
    return endgaihehda_;
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
    for (int i = 0; i < enhafcpkmml_.size(); i++) {
      output.writeMessage(1, enhafcpkmml_.get(i));
    }
    if (aplkbhpgllh_ != 0L) {
      output.writeUInt64(2, aplkbhpgllh_);
    }
    if (magjbjmclno_ != POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP.UNSET.getNumber()) {
      output.writeEnum(3, magjbjmclno_);
    }
    if (endgaihehda_ != 0) {
      output.writeInt32(4, endgaihehda_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < enhafcpkmml_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, enhafcpkmml_.get(i));
    }
    if (aplkbhpgllh_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, aplkbhpgllh_);
    }
    if (magjbjmclno_ != POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, magjbjmclno_);
    }
    if (endgaihehda_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, endgaihehda_);
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
    if (!(obj instanceof POGOProtos.Rpc.KFNOJNMNCKN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KFNOJNMNCKN other = (POGOProtos.Rpc.KFNOJNMNCKN) obj;

    if (!getEnhafcpkmmlList()
        .equals(other.getEnhafcpkmmlList())) return false;
    if (getAplkbhpgllh()
        != other.getAplkbhpgllh()) return false;
    if (magjbjmclno_ != other.magjbjmclno_) return false;
    if (getEndgaihehda()
        != other.getEndgaihehda()) return false;
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
    if (getEnhafcpkmmlCount() > 0) {
      hash = (37 * hash) + ENHAFCPKMML_FIELD_NUMBER;
      hash = (53 * hash) + getEnhafcpkmmlList().hashCode();
    }
    hash = (37 * hash) + APLKBHPGLLH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAplkbhpgllh());
    hash = (37 * hash) + MAGJBJMCLNO_FIELD_NUMBER;
    hash = (53 * hash) + magjbjmclno_;
    hash = (37 * hash) + ENDGAIHEHDA_FIELD_NUMBER;
    hash = (53 * hash) + getEndgaihehda();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KFNOJNMNCKN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KFNOJNMNCKN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KFNOJNMNCKN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KFNOJNMNCKN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KFNOJNMNCKN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KFNOJNMNCKN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KFNOJNMNCKN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KFNOJNMNCKN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KFNOJNMNCKN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KFNOJNMNCKN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KFNOJNMNCKN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KFNOJNMNCKN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KFNOJNMNCKN prototype) {
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
   * ref: KFNOJNMNCKN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.KFNOJNMNCKN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KFNOJNMNCKN)
      POGOProtos.Rpc.KFNOJNMNCKNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KFNOJNMNCKN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KFNOJNMNCKN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KFNOJNMNCKN.class, POGOProtos.Rpc.KFNOJNMNCKN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KFNOJNMNCKN.newBuilder()
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
        getEnhafcpkmmlFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (enhafcpkmmlBuilder_ == null) {
        enhafcpkmml_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        enhafcpkmmlBuilder_.clear();
      }
      aplkbhpgllh_ = 0L;

      magjbjmclno_ = 0;

      endgaihehda_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KFNOJNMNCKN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KFNOJNMNCKN getDefaultInstanceForType() {
      return POGOProtos.Rpc.KFNOJNMNCKN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KFNOJNMNCKN build() {
      POGOProtos.Rpc.KFNOJNMNCKN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KFNOJNMNCKN buildPartial() {
      POGOProtos.Rpc.KFNOJNMNCKN result = new POGOProtos.Rpc.KFNOJNMNCKN(this);
      int from_bitField0_ = bitField0_;
      if (enhafcpkmmlBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          enhafcpkmml_ = java.util.Collections.unmodifiableList(enhafcpkmml_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.enhafcpkmml_ = enhafcpkmml_;
      } else {
        result.enhafcpkmml_ = enhafcpkmmlBuilder_.build();
      }
      result.aplkbhpgllh_ = aplkbhpgllh_;
      result.magjbjmclno_ = magjbjmclno_;
      result.endgaihehda_ = endgaihehda_;
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
      if (other instanceof POGOProtos.Rpc.KFNOJNMNCKN) {
        return mergeFrom((POGOProtos.Rpc.KFNOJNMNCKN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KFNOJNMNCKN other) {
      if (other == POGOProtos.Rpc.KFNOJNMNCKN.getDefaultInstance()) return this;
      if (enhafcpkmmlBuilder_ == null) {
        if (!other.enhafcpkmml_.isEmpty()) {
          if (enhafcpkmml_.isEmpty()) {
            enhafcpkmml_ = other.enhafcpkmml_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEnhafcpkmmlIsMutable();
            enhafcpkmml_.addAll(other.enhafcpkmml_);
          }
          onChanged();
        }
      } else {
        if (!other.enhafcpkmml_.isEmpty()) {
          if (enhafcpkmmlBuilder_.isEmpty()) {
            enhafcpkmmlBuilder_.dispose();
            enhafcpkmmlBuilder_ = null;
            enhafcpkmml_ = other.enhafcpkmml_;
            bitField0_ = (bitField0_ & ~0x00000001);
            enhafcpkmmlBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEnhafcpkmmlFieldBuilder() : null;
          } else {
            enhafcpkmmlBuilder_.addAllMessages(other.enhafcpkmml_);
          }
        }
      }
      if (other.getAplkbhpgllh() != 0L) {
        setAplkbhpgllh(other.getAplkbhpgllh());
      }
      if (other.magjbjmclno_ != 0) {
        setMagjbjmclnoValue(other.getMagjbjmclnoValue());
      }
      if (other.getEndgaihehda() != 0) {
        setEndgaihehda(other.getEndgaihehda());
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
      POGOProtos.Rpc.KFNOJNMNCKN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KFNOJNMNCKN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.GIJGLGKDNKD> enhafcpkmml_ =
      java.util.Collections.emptyList();
    private void ensureEnhafcpkmmlIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        enhafcpkmml_ = new java.util.ArrayList<POGOProtos.Rpc.GIJGLGKDNKD>(enhafcpkmml_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.GIJGLGKDNKD, POGOProtos.Rpc.GIJGLGKDNKD.Builder, POGOProtos.Rpc.GIJGLGKDNKDOrBuilder> enhafcpkmmlBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.GIJGLGKDNKD> getEnhafcpkmmlList() {
      if (enhafcpkmmlBuilder_ == null) {
        return java.util.Collections.unmodifiableList(enhafcpkmml_);
      } else {
        return enhafcpkmmlBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public int getEnhafcpkmmlCount() {
      if (enhafcpkmmlBuilder_ == null) {
        return enhafcpkmml_.size();
      } else {
        return enhafcpkmmlBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public POGOProtos.Rpc.GIJGLGKDNKD getEnhafcpkmml(int index) {
      if (enhafcpkmmlBuilder_ == null) {
        return enhafcpkmml_.get(index);
      } else {
        return enhafcpkmmlBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public Builder setEnhafcpkmml(
        int index, POGOProtos.Rpc.GIJGLGKDNKD value) {
      if (enhafcpkmmlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnhafcpkmmlIsMutable();
        enhafcpkmml_.set(index, value);
        onChanged();
      } else {
        enhafcpkmmlBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public Builder setEnhafcpkmml(
        int index, POGOProtos.Rpc.GIJGLGKDNKD.Builder builderForValue) {
      if (enhafcpkmmlBuilder_ == null) {
        ensureEnhafcpkmmlIsMutable();
        enhafcpkmml_.set(index, builderForValue.build());
        onChanged();
      } else {
        enhafcpkmmlBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public Builder addEnhafcpkmml(POGOProtos.Rpc.GIJGLGKDNKD value) {
      if (enhafcpkmmlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnhafcpkmmlIsMutable();
        enhafcpkmml_.add(value);
        onChanged();
      } else {
        enhafcpkmmlBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public Builder addEnhafcpkmml(
        int index, POGOProtos.Rpc.GIJGLGKDNKD value) {
      if (enhafcpkmmlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnhafcpkmmlIsMutable();
        enhafcpkmml_.add(index, value);
        onChanged();
      } else {
        enhafcpkmmlBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public Builder addEnhafcpkmml(
        POGOProtos.Rpc.GIJGLGKDNKD.Builder builderForValue) {
      if (enhafcpkmmlBuilder_ == null) {
        ensureEnhafcpkmmlIsMutable();
        enhafcpkmml_.add(builderForValue.build());
        onChanged();
      } else {
        enhafcpkmmlBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public Builder addEnhafcpkmml(
        int index, POGOProtos.Rpc.GIJGLGKDNKD.Builder builderForValue) {
      if (enhafcpkmmlBuilder_ == null) {
        ensureEnhafcpkmmlIsMutable();
        enhafcpkmml_.add(index, builderForValue.build());
        onChanged();
      } else {
        enhafcpkmmlBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public Builder addAllEnhafcpkmml(
        java.lang.Iterable<? extends POGOProtos.Rpc.GIJGLGKDNKD> values) {
      if (enhafcpkmmlBuilder_ == null) {
        ensureEnhafcpkmmlIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, enhafcpkmml_);
        onChanged();
      } else {
        enhafcpkmmlBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public Builder clearEnhafcpkmml() {
      if (enhafcpkmmlBuilder_ == null) {
        enhafcpkmml_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        enhafcpkmmlBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public Builder removeEnhafcpkmml(int index) {
      if (enhafcpkmmlBuilder_ == null) {
        ensureEnhafcpkmmlIsMutable();
        enhafcpkmml_.remove(index);
        onChanged();
      } else {
        enhafcpkmmlBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public POGOProtos.Rpc.GIJGLGKDNKD.Builder getEnhafcpkmmlBuilder(
        int index) {
      return getEnhafcpkmmlFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public POGOProtos.Rpc.GIJGLGKDNKDOrBuilder getEnhafcpkmmlOrBuilder(
        int index) {
      if (enhafcpkmmlBuilder_ == null) {
        return enhafcpkmml_.get(index);  } else {
        return enhafcpkmmlBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.GIJGLGKDNKDOrBuilder> 
         getEnhafcpkmmlOrBuilderList() {
      if (enhafcpkmmlBuilder_ != null) {
        return enhafcpkmmlBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(enhafcpkmml_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public POGOProtos.Rpc.GIJGLGKDNKD.Builder addEnhafcpkmmlBuilder() {
      return getEnhafcpkmmlFieldBuilder().addBuilder(
          POGOProtos.Rpc.GIJGLGKDNKD.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public POGOProtos.Rpc.GIJGLGKDNKD.Builder addEnhafcpkmmlBuilder(
        int index) {
      return getEnhafcpkmmlFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.GIJGLGKDNKD.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GIJGLGKDNKD enhafcpkmml = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.GIJGLGKDNKD.Builder> 
         getEnhafcpkmmlBuilderList() {
      return getEnhafcpkmmlFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.GIJGLGKDNKD, POGOProtos.Rpc.GIJGLGKDNKD.Builder, POGOProtos.Rpc.GIJGLGKDNKDOrBuilder> 
        getEnhafcpkmmlFieldBuilder() {
      if (enhafcpkmmlBuilder_ == null) {
        enhafcpkmmlBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.GIJGLGKDNKD, POGOProtos.Rpc.GIJGLGKDNKD.Builder, POGOProtos.Rpc.GIJGLGKDNKDOrBuilder>(
                enhafcpkmml_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        enhafcpkmml_ = null;
      }
      return enhafcpkmmlBuilder_;
    }

    private long aplkbhpgllh_ ;
    /**
     * <code>uint64 aplkbhpgllh = 2;</code>
     * @return The aplkbhpgllh.
     */
    @java.lang.Override
    public long getAplkbhpgllh() {
      return aplkbhpgllh_;
    }
    /**
     * <code>uint64 aplkbhpgllh = 2;</code>
     * @param value The aplkbhpgllh to set.
     * @return This builder for chaining.
     */
    public Builder setAplkbhpgllh(long value) {
      
      aplkbhpgllh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 aplkbhpgllh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAplkbhpgllh() {
      
      aplkbhpgllh_ = 0L;
      onChanged();
      return this;
    }

    private int magjbjmclno_ = 0;
    /**
     * <code>.POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP magjbjmclno = 3;</code>
     * @return The enum numeric value on the wire for magjbjmclno.
     */
    @java.lang.Override public int getMagjbjmclnoValue() {
      return magjbjmclno_;
    }
    /**
     * <code>.POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP magjbjmclno = 3;</code>
     * @param value The enum numeric value on the wire for magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclnoValue(int value) {
      
      magjbjmclno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP magjbjmclno = 3;</code>
     * @return The magjbjmclno.
     */
    @java.lang.Override
    public POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP getMagjbjmclno() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP result = POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP.valueOf(magjbjmclno_);
      return result == null ? POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP magjbjmclno = 3;</code>
     * @param value The magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclno(POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      magjbjmclno_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KFNOJNMNCKN.AOHMJGPDKAP magjbjmclno = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMagjbjmclno() {
      
      magjbjmclno_ = 0;
      onChanged();
      return this;
    }

    private int endgaihehda_ ;
    /**
     * <code>int32 endgaihehda = 4;</code>
     * @return The endgaihehda.
     */
    @java.lang.Override
    public int getEndgaihehda() {
      return endgaihehda_;
    }
    /**
     * <code>int32 endgaihehda = 4;</code>
     * @param value The endgaihehda to set.
     * @return This builder for chaining.
     */
    public Builder setEndgaihehda(int value) {
      
      endgaihehda_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 endgaihehda = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndgaihehda() {
      
      endgaihehda_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KFNOJNMNCKN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KFNOJNMNCKN)
  private static final POGOProtos.Rpc.KFNOJNMNCKN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KFNOJNMNCKN();
  }

  public static POGOProtos.Rpc.KFNOJNMNCKN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KFNOJNMNCKN>
      PARSER = new com.google.protobuf.AbstractParser<KFNOJNMNCKN>() {
    @java.lang.Override
    public KFNOJNMNCKN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KFNOJNMNCKN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KFNOJNMNCKN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KFNOJNMNCKN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KFNOJNMNCKN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

