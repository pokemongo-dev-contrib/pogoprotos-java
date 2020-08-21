// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CDBJDJOAINC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CDBJDJOAINC}
 */
public final class CDBJDJOAINC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CDBJDJOAINC)
    CDBJDJOAINCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CDBJDJOAINC.newBuilder() to construct.
  private CDBJDJOAINC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CDBJDJOAINC() {
    lcajjpmoafe_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CDBJDJOAINC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CDBJDJOAINC(
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
            POGOProtos.Rpc.BGDKMBLDNOP.Builder subBuilder = null;
            if (plohpkdnmdi_ != null) {
              subBuilder = plohpkdnmdi_.toBuilder();
            }
            plohpkdnmdi_ = input.readMessage(POGOProtos.Rpc.BGDKMBLDNOP.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(plohpkdnmdi_);
              plohpkdnmdi_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CDBJDJOAINC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CDBJDJOAINC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CDBJDJOAINC.class, POGOProtos.Rpc.CDBJDJOAINC.Builder.class);
  }

  /**
   * <pre>
   * ref: CDBJDJOAINC/JMKDCKELAJA/BHLMLNAJOJC
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC}
   */
  public enum BHLMLNAJOJC
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
    public static BHLMLNAJOJC valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BHLMLNAJOJC forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return COOLDOWN_ACTIVE;
        case 3: return NOT_QUALIFIED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BHLMLNAJOJC>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BHLMLNAJOJC> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BHLMLNAJOJC>() {
            public BHLMLNAJOJC findValueByNumber(int number) {
              return BHLMLNAJOJC.forNumber(number);
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
      return POGOProtos.Rpc.CDBJDJOAINC.getDescriptor().getEnumTypes().get(0);
    }

    private static final BHLMLNAJOJC[] VALUES = values();

    public static BHLMLNAJOJC valueOf(
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

    private BHLMLNAJOJC(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC)
  }

  public static final int LCAJJPMOAFE_FIELD_NUMBER = 1;
  private int lcajjpmoafe_;
  /**
   * <code>.POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC lcajjpmoafe = 1;</code>
   * @return The enum numeric value on the wire for lcajjpmoafe.
   */
  @java.lang.Override public int getLcajjpmoafeValue() {
    return lcajjpmoafe_;
  }
  /**
   * <code>.POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC lcajjpmoafe = 1;</code>
   * @return The lcajjpmoafe.
   */
  @java.lang.Override public POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC getLcajjpmoafe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC result = POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC.valueOf(lcajjpmoafe_);
    return result == null ? POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC.UNRECOGNIZED : result;
  }

  public static final int PLOHPKDNMDI_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi_;
  /**
   * <code>.POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi = 2;</code>
   * @return Whether the plohpkdnmdi field is set.
   */
  @java.lang.Override
  public boolean hasPlohpkdnmdi() {
    return plohpkdnmdi_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi = 2;</code>
   * @return The plohpkdnmdi.
   */
  @java.lang.Override
  public POGOProtos.Rpc.BGDKMBLDNOP getPlohpkdnmdi() {
    return plohpkdnmdi_ == null ? POGOProtos.Rpc.BGDKMBLDNOP.getDefaultInstance() : plohpkdnmdi_;
  }
  /**
   * <code>.POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BGDKMBLDNOPOrBuilder getPlohpkdnmdiOrBuilder() {
    return getPlohpkdnmdi();
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
    if (lcajjpmoafe_ != POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC.UNSET.getNumber()) {
      output.writeEnum(1, lcajjpmoafe_);
    }
    if (plohpkdnmdi_ != null) {
      output.writeMessage(2, getPlohpkdnmdi());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lcajjpmoafe_ != POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lcajjpmoafe_);
    }
    if (plohpkdnmdi_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPlohpkdnmdi());
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
    if (!(obj instanceof POGOProtos.Rpc.CDBJDJOAINC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CDBJDJOAINC other = (POGOProtos.Rpc.CDBJDJOAINC) obj;

    if (lcajjpmoafe_ != other.lcajjpmoafe_) return false;
    if (hasPlohpkdnmdi() != other.hasPlohpkdnmdi()) return false;
    if (hasPlohpkdnmdi()) {
      if (!getPlohpkdnmdi()
          .equals(other.getPlohpkdnmdi())) return false;
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
    if (hasPlohpkdnmdi()) {
      hash = (37 * hash) + PLOHPKDNMDI_FIELD_NUMBER;
      hash = (53 * hash) + getPlohpkdnmdi().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CDBJDJOAINC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CDBJDJOAINC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CDBJDJOAINC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CDBJDJOAINC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CDBJDJOAINC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CDBJDJOAINC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CDBJDJOAINC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CDBJDJOAINC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CDBJDJOAINC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CDBJDJOAINC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CDBJDJOAINC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CDBJDJOAINC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CDBJDJOAINC prototype) {
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
   * ref: CDBJDJOAINC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CDBJDJOAINC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CDBJDJOAINC)
      POGOProtos.Rpc.CDBJDJOAINCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CDBJDJOAINC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CDBJDJOAINC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CDBJDJOAINC.class, POGOProtos.Rpc.CDBJDJOAINC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CDBJDJOAINC.newBuilder()
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

      if (plohpkdnmdiBuilder_ == null) {
        plohpkdnmdi_ = null;
      } else {
        plohpkdnmdi_ = null;
        plohpkdnmdiBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CDBJDJOAINC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CDBJDJOAINC getDefaultInstanceForType() {
      return POGOProtos.Rpc.CDBJDJOAINC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CDBJDJOAINC build() {
      POGOProtos.Rpc.CDBJDJOAINC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CDBJDJOAINC buildPartial() {
      POGOProtos.Rpc.CDBJDJOAINC result = new POGOProtos.Rpc.CDBJDJOAINC(this);
      result.lcajjpmoafe_ = lcajjpmoafe_;
      if (plohpkdnmdiBuilder_ == null) {
        result.plohpkdnmdi_ = plohpkdnmdi_;
      } else {
        result.plohpkdnmdi_ = plohpkdnmdiBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.CDBJDJOAINC) {
        return mergeFrom((POGOProtos.Rpc.CDBJDJOAINC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CDBJDJOAINC other) {
      if (other == POGOProtos.Rpc.CDBJDJOAINC.getDefaultInstance()) return this;
      if (other.lcajjpmoafe_ != 0) {
        setLcajjpmoafeValue(other.getLcajjpmoafeValue());
      }
      if (other.hasPlohpkdnmdi()) {
        mergePlohpkdnmdi(other.getPlohpkdnmdi());
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
      POGOProtos.Rpc.CDBJDJOAINC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CDBJDJOAINC) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC lcajjpmoafe = 1;</code>
     * @return The enum numeric value on the wire for lcajjpmoafe.
     */
    @java.lang.Override public int getLcajjpmoafeValue() {
      return lcajjpmoafe_;
    }
    /**
     * <code>.POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC lcajjpmoafe = 1;</code>
     * @param value The enum numeric value on the wire for lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafeValue(int value) {
      
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC lcajjpmoafe = 1;</code>
     * @return The lcajjpmoafe.
     */
    @java.lang.Override
    public POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC getLcajjpmoafe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC result = POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC.valueOf(lcajjpmoafe_);
      return result == null ? POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC lcajjpmoafe = 1;</code>
     * @param value The lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafe(POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lcajjpmoafe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CDBJDJOAINC.BHLMLNAJOJC lcajjpmoafe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcajjpmoafe() {
      
      lcajjpmoafe_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BGDKMBLDNOP, POGOProtos.Rpc.BGDKMBLDNOP.Builder, POGOProtos.Rpc.BGDKMBLDNOPOrBuilder> plohpkdnmdiBuilder_;
    /**
     * <code>.POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi = 2;</code>
     * @return Whether the plohpkdnmdi field is set.
     */
    public boolean hasPlohpkdnmdi() {
      return plohpkdnmdiBuilder_ != null || plohpkdnmdi_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi = 2;</code>
     * @return The plohpkdnmdi.
     */
    public POGOProtos.Rpc.BGDKMBLDNOP getPlohpkdnmdi() {
      if (plohpkdnmdiBuilder_ == null) {
        return plohpkdnmdi_ == null ? POGOProtos.Rpc.BGDKMBLDNOP.getDefaultInstance() : plohpkdnmdi_;
      } else {
        return plohpkdnmdiBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi = 2;</code>
     */
    public Builder setPlohpkdnmdi(POGOProtos.Rpc.BGDKMBLDNOP value) {
      if (plohpkdnmdiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        plohpkdnmdi_ = value;
        onChanged();
      } else {
        plohpkdnmdiBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi = 2;</code>
     */
    public Builder setPlohpkdnmdi(
        POGOProtos.Rpc.BGDKMBLDNOP.Builder builderForValue) {
      if (plohpkdnmdiBuilder_ == null) {
        plohpkdnmdi_ = builderForValue.build();
        onChanged();
      } else {
        plohpkdnmdiBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi = 2;</code>
     */
    public Builder mergePlohpkdnmdi(POGOProtos.Rpc.BGDKMBLDNOP value) {
      if (plohpkdnmdiBuilder_ == null) {
        if (plohpkdnmdi_ != null) {
          plohpkdnmdi_ =
            POGOProtos.Rpc.BGDKMBLDNOP.newBuilder(plohpkdnmdi_).mergeFrom(value).buildPartial();
        } else {
          plohpkdnmdi_ = value;
        }
        onChanged();
      } else {
        plohpkdnmdiBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi = 2;</code>
     */
    public Builder clearPlohpkdnmdi() {
      if (plohpkdnmdiBuilder_ == null) {
        plohpkdnmdi_ = null;
        onChanged();
      } else {
        plohpkdnmdi_ = null;
        plohpkdnmdiBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi = 2;</code>
     */
    public POGOProtos.Rpc.BGDKMBLDNOP.Builder getPlohpkdnmdiBuilder() {
      
      onChanged();
      return getPlohpkdnmdiFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi = 2;</code>
     */
    public POGOProtos.Rpc.BGDKMBLDNOPOrBuilder getPlohpkdnmdiOrBuilder() {
      if (plohpkdnmdiBuilder_ != null) {
        return plohpkdnmdiBuilder_.getMessageOrBuilder();
      } else {
        return plohpkdnmdi_ == null ?
            POGOProtos.Rpc.BGDKMBLDNOP.getDefaultInstance() : plohpkdnmdi_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BGDKMBLDNOP plohpkdnmdi = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BGDKMBLDNOP, POGOProtos.Rpc.BGDKMBLDNOP.Builder, POGOProtos.Rpc.BGDKMBLDNOPOrBuilder> 
        getPlohpkdnmdiFieldBuilder() {
      if (plohpkdnmdiBuilder_ == null) {
        plohpkdnmdiBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.BGDKMBLDNOP, POGOProtos.Rpc.BGDKMBLDNOP.Builder, POGOProtos.Rpc.BGDKMBLDNOPOrBuilder>(
                getPlohpkdnmdi(),
                getParentForChildren(),
                isClean());
        plohpkdnmdi_ = null;
      }
      return plohpkdnmdiBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CDBJDJOAINC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CDBJDJOAINC)
  private static final POGOProtos.Rpc.CDBJDJOAINC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CDBJDJOAINC();
  }

  public static POGOProtos.Rpc.CDBJDJOAINC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CDBJDJOAINC>
      PARSER = new com.google.protobuf.AbstractParser<CDBJDJOAINC>() {
    @java.lang.Override
    public CDBJDJOAINC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CDBJDJOAINC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CDBJDJOAINC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CDBJDJOAINC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CDBJDJOAINC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

