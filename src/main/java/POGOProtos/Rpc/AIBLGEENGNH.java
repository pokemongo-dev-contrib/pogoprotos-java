// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: AIBLGEENGNH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.AIBLGEENGNH}
 */
public final class AIBLGEENGNH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AIBLGEENGNH)
    AIBLGEENGNHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AIBLGEENGNH.newBuilder() to construct.
  private AIBLGEENGNH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AIBLGEENGNH() {
    lcajjpmoafe_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AIBLGEENGNH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AIBLGEENGNH(
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

            lcajjpmoafe_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.AJNNNHJCCGD.Builder subBuilder = null;
            if (jelghdhedjb_ != null) {
              subBuilder = jelghdhedjb_.toBuilder();
            }
            jelghdhedjb_ = input.readMessage(POGOProtos.Rpc.AJNNNHJCCGD.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jelghdhedjb_);
              jelghdhedjb_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AIBLGEENGNH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AIBLGEENGNH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AIBLGEENGNH.class, POGOProtos.Rpc.AIBLGEENGNH.Builder.class);
  }

  /**
   * <pre>
   * ref: AIBLGEENGNH/DMCFOGKHDBA/GHPEHGJBNFH
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH}
   */
  public enum GHPEHGJBNFH
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
     * <code>ERROR_PLAYER_BAG_FULL = 3;</code>
     */
    ERROR_PLAYER_BAG_FULL(3),
    /**
     * <code>ERROR_GIFT_REDEEMED = 4;</code>
     */
    ERROR_GIFT_REDEEMED(4),
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
     * <code>ERROR_PLAYER_BAG_FULL = 3;</code>
     */
    public static final int ERROR_PLAYER_BAG_FULL_VALUE = 3;
    /**
     * <code>ERROR_GIFT_REDEEMED = 4;</code>
     */
    public static final int ERROR_GIFT_REDEEMED_VALUE = 4;


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
    public static GHPEHGJBNFH valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GHPEHGJBNFH forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_UNKNOWN;
        case 3: return ERROR_PLAYER_BAG_FULL;
        case 4: return ERROR_GIFT_REDEEMED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GHPEHGJBNFH>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GHPEHGJBNFH> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GHPEHGJBNFH>() {
            public GHPEHGJBNFH findValueByNumber(int number) {
              return GHPEHGJBNFH.forNumber(number);
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
      return POGOProtos.Rpc.AIBLGEENGNH.getDescriptor().getEnumTypes().get(0);
    }

    private static final GHPEHGJBNFH[] VALUES = values();

    public static GHPEHGJBNFH valueOf(
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

    private GHPEHGJBNFH(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH)
  }

  public static final int LCAJJPMOAFE_FIELD_NUMBER = 1;
  private int lcajjpmoafe_;
  /**
   * <code>.POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH lcajjpmoafe = 1;</code>
   * @return The enum numeric value on the wire for lcajjpmoafe.
   */
  @java.lang.Override public int getLcajjpmoafeValue() {
    return lcajjpmoafe_;
  }
  /**
   * <code>.POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH lcajjpmoafe = 1;</code>
   * @return The lcajjpmoafe.
   */
  @java.lang.Override public POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH getLcajjpmoafe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH result = POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH.valueOf(lcajjpmoafe_);
    return result == null ? POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH.UNRECOGNIZED : result;
  }

  public static final int JELGHDHEDJB_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb_;
  /**
   * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 2;</code>
   * @return Whether the jelghdhedjb field is set.
   */
  @java.lang.Override
  public boolean hasJelghdhedjb() {
    return jelghdhedjb_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 2;</code>
   * @return The jelghdhedjb.
   */
  @java.lang.Override
  public POGOProtos.Rpc.AJNNNHJCCGD getJelghdhedjb() {
    return jelghdhedjb_ == null ? POGOProtos.Rpc.AJNNNHJCCGD.getDefaultInstance() : jelghdhedjb_;
  }
  /**
   * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.AJNNNHJCCGDOrBuilder getJelghdhedjbOrBuilder() {
    return getJelghdhedjb();
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
    if (lcajjpmoafe_ != POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH.UNSET.getNumber()) {
      output.writeEnum(1, lcajjpmoafe_);
    }
    if (jelghdhedjb_ != null) {
      output.writeMessage(2, getJelghdhedjb());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lcajjpmoafe_ != POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lcajjpmoafe_);
    }
    if (jelghdhedjb_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJelghdhedjb());
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
    if (!(obj instanceof POGOProtos.Rpc.AIBLGEENGNH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AIBLGEENGNH other = (POGOProtos.Rpc.AIBLGEENGNH) obj;

    if (lcajjpmoafe_ != other.lcajjpmoafe_) return false;
    if (hasJelghdhedjb() != other.hasJelghdhedjb()) return false;
    if (hasJelghdhedjb()) {
      if (!getJelghdhedjb()
          .equals(other.getJelghdhedjb())) return false;
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
    hash = (37 * hash) + LCAJJPMOAFE_FIELD_NUMBER;
    hash = (53 * hash) + lcajjpmoafe_;
    if (hasJelghdhedjb()) {
      hash = (37 * hash) + JELGHDHEDJB_FIELD_NUMBER;
      hash = (53 * hash) + getJelghdhedjb().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AIBLGEENGNH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AIBLGEENGNH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AIBLGEENGNH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AIBLGEENGNH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AIBLGEENGNH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AIBLGEENGNH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AIBLGEENGNH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AIBLGEENGNH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AIBLGEENGNH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AIBLGEENGNH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AIBLGEENGNH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AIBLGEENGNH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AIBLGEENGNH prototype) {
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
   * ref: AIBLGEENGNH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.AIBLGEENGNH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AIBLGEENGNH)
      POGOProtos.Rpc.AIBLGEENGNHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AIBLGEENGNH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AIBLGEENGNH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AIBLGEENGNH.class, POGOProtos.Rpc.AIBLGEENGNH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AIBLGEENGNH.newBuilder()
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
      lcajjpmoafe_ = 0;

      if (jelghdhedjbBuilder_ == null) {
        jelghdhedjb_ = null;
      } else {
        jelghdhedjb_ = null;
        jelghdhedjbBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AIBLGEENGNH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AIBLGEENGNH getDefaultInstanceForType() {
      return POGOProtos.Rpc.AIBLGEENGNH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AIBLGEENGNH build() {
      POGOProtos.Rpc.AIBLGEENGNH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AIBLGEENGNH buildPartial() {
      POGOProtos.Rpc.AIBLGEENGNH result = new POGOProtos.Rpc.AIBLGEENGNH(this);
      result.lcajjpmoafe_ = lcajjpmoafe_;
      if (jelghdhedjbBuilder_ == null) {
        result.jelghdhedjb_ = jelghdhedjb_;
      } else {
        result.jelghdhedjb_ = jelghdhedjbBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.AIBLGEENGNH) {
        return mergeFrom((POGOProtos.Rpc.AIBLGEENGNH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AIBLGEENGNH other) {
      if (other == POGOProtos.Rpc.AIBLGEENGNH.getDefaultInstance()) return this;
      if (other.lcajjpmoafe_ != 0) {
        setLcajjpmoafeValue(other.getLcajjpmoafeValue());
      }
      if (other.hasJelghdhedjb()) {
        mergeJelghdhedjb(other.getJelghdhedjb());
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
      POGOProtos.Rpc.AIBLGEENGNH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AIBLGEENGNH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int lcajjpmoafe_ = 0;
    /**
     * <code>.POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH lcajjpmoafe = 1;</code>
     * @return The enum numeric value on the wire for lcajjpmoafe.
     */
    @java.lang.Override public int getLcajjpmoafeValue() {
      return lcajjpmoafe_;
    }
    /**
     * <code>.POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH lcajjpmoafe = 1;</code>
     * @param value The enum numeric value on the wire for lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafeValue(int value) {
      
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH lcajjpmoafe = 1;</code>
     * @return The lcajjpmoafe.
     */
    @java.lang.Override
    public POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH getLcajjpmoafe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH result = POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH.valueOf(lcajjpmoafe_);
      return result == null ? POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH lcajjpmoafe = 1;</code>
     * @param value The lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafe(POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lcajjpmoafe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AIBLGEENGNH.GHPEHGJBNFH lcajjpmoafe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcajjpmoafe() {
      
      lcajjpmoafe_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AJNNNHJCCGD, POGOProtos.Rpc.AJNNNHJCCGD.Builder, POGOProtos.Rpc.AJNNNHJCCGDOrBuilder> jelghdhedjbBuilder_;
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 2;</code>
     * @return Whether the jelghdhedjb field is set.
     */
    public boolean hasJelghdhedjb() {
      return jelghdhedjbBuilder_ != null || jelghdhedjb_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 2;</code>
     * @return The jelghdhedjb.
     */
    public POGOProtos.Rpc.AJNNNHJCCGD getJelghdhedjb() {
      if (jelghdhedjbBuilder_ == null) {
        return jelghdhedjb_ == null ? POGOProtos.Rpc.AJNNNHJCCGD.getDefaultInstance() : jelghdhedjb_;
      } else {
        return jelghdhedjbBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 2;</code>
     */
    public Builder setJelghdhedjb(POGOProtos.Rpc.AJNNNHJCCGD value) {
      if (jelghdhedjbBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jelghdhedjb_ = value;
        onChanged();
      } else {
        jelghdhedjbBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 2;</code>
     */
    public Builder setJelghdhedjb(
        POGOProtos.Rpc.AJNNNHJCCGD.Builder builderForValue) {
      if (jelghdhedjbBuilder_ == null) {
        jelghdhedjb_ = builderForValue.build();
        onChanged();
      } else {
        jelghdhedjbBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 2;</code>
     */
    public Builder mergeJelghdhedjb(POGOProtos.Rpc.AJNNNHJCCGD value) {
      if (jelghdhedjbBuilder_ == null) {
        if (jelghdhedjb_ != null) {
          jelghdhedjb_ =
            POGOProtos.Rpc.AJNNNHJCCGD.newBuilder(jelghdhedjb_).mergeFrom(value).buildPartial();
        } else {
          jelghdhedjb_ = value;
        }
        onChanged();
      } else {
        jelghdhedjbBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 2;</code>
     */
    public Builder clearJelghdhedjb() {
      if (jelghdhedjbBuilder_ == null) {
        jelghdhedjb_ = null;
        onChanged();
      } else {
        jelghdhedjb_ = null;
        jelghdhedjbBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 2;</code>
     */
    public POGOProtos.Rpc.AJNNNHJCCGD.Builder getJelghdhedjbBuilder() {
      
      onChanged();
      return getJelghdhedjbFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 2;</code>
     */
    public POGOProtos.Rpc.AJNNNHJCCGDOrBuilder getJelghdhedjbOrBuilder() {
      if (jelghdhedjbBuilder_ != null) {
        return jelghdhedjbBuilder_.getMessageOrBuilder();
      } else {
        return jelghdhedjb_ == null ?
            POGOProtos.Rpc.AJNNNHJCCGD.getDefaultInstance() : jelghdhedjb_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD jelghdhedjb = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AJNNNHJCCGD, POGOProtos.Rpc.AJNNNHJCCGD.Builder, POGOProtos.Rpc.AJNNNHJCCGDOrBuilder> 
        getJelghdhedjbFieldBuilder() {
      if (jelghdhedjbBuilder_ == null) {
        jelghdhedjbBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.AJNNNHJCCGD, POGOProtos.Rpc.AJNNNHJCCGD.Builder, POGOProtos.Rpc.AJNNNHJCCGDOrBuilder>(
                getJelghdhedjb(),
                getParentForChildren(),
                isClean());
        jelghdhedjb_ = null;
      }
      return jelghdhedjbBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AIBLGEENGNH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AIBLGEENGNH)
  private static final POGOProtos.Rpc.AIBLGEENGNH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AIBLGEENGNH();
  }

  public static POGOProtos.Rpc.AIBLGEENGNH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AIBLGEENGNH>
      PARSER = new com.google.protobuf.AbstractParser<AIBLGEENGNH>() {
    @java.lang.Override
    public AIBLGEENGNH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AIBLGEENGNH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AIBLGEENGNH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AIBLGEENGNH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AIBLGEENGNH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

