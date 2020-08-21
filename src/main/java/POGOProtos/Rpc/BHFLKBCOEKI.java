// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BHFLKBCOEKI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BHFLKBCOEKI}
 */
public final class BHFLKBCOEKI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BHFLKBCOEKI)
    BHFLKBCOEKIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BHFLKBCOEKI.newBuilder() to construct.
  private BHFLKBCOEKI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BHFLKBCOEKI() {
    lcajjpmoafe_ = 0;
    lakhhbodied_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BHFLKBCOEKI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BHFLKBCOEKI(
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
          case 8: {
            int rawValue = input.readEnum();

            lcajjpmoafe_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              lakhhbodied_ = new java.util.ArrayList<POGOProtos.Rpc.DCLFMKONKBH>();
              mutable_bitField0_ |= 0x00000001;
            }
            lakhhbodied_.add(
                input.readMessage(POGOProtos.Rpc.DCLFMKONKBH.parser(), extensionRegistry));
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
        lakhhbodied_ = java.util.Collections.unmodifiableList(lakhhbodied_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BHFLKBCOEKI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BHFLKBCOEKI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BHFLKBCOEKI.class, POGOProtos.Rpc.BHFLKBCOEKI.Builder.class);
  }

  /**
   * <pre>
   * ref: BHFLKBCOEKI/GNIMDIKINPC/BGMMBLPHPLA
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA}
   */
  public enum BGMMBLPHPLA
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
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
    public static BGMMBLPHPLA valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BGMMBLPHPLA forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BGMMBLPHPLA>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BGMMBLPHPLA> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BGMMBLPHPLA>() {
            public BGMMBLPHPLA findValueByNumber(int number) {
              return BGMMBLPHPLA.forNumber(number);
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
      return POGOProtos.Rpc.BHFLKBCOEKI.getDescriptor().getEnumTypes().get(0);
    }

    private static final BGMMBLPHPLA[] VALUES = values();

    public static BGMMBLPHPLA valueOf(
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

    private BGMMBLPHPLA(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA)
  }

  public static final int LCAJJPMOAFE_FIELD_NUMBER = 1;
  private int lcajjpmoafe_;
  /**
   * <code>.POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA lcajjpmoafe = 1;</code>
   * @return The enum numeric value on the wire for lcajjpmoafe.
   */
  @java.lang.Override public int getLcajjpmoafeValue() {
    return lcajjpmoafe_;
  }
  /**
   * <code>.POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA lcajjpmoafe = 1;</code>
   * @return The lcajjpmoafe.
   */
  @java.lang.Override public POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA getLcajjpmoafe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA result = POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA.valueOf(lcajjpmoafe_);
    return result == null ? POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA.UNRECOGNIZED : result;
  }

  public static final int LAKHHBODIED_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.DCLFMKONKBH> lakhhbodied_;
  /**
   * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.DCLFMKONKBH> getLakhhbodiedList() {
    return lakhhbodied_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.DCLFMKONKBHOrBuilder> 
      getLakhhbodiedOrBuilderList() {
    return lakhhbodied_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
   */
  @java.lang.Override
  public int getLakhhbodiedCount() {
    return lakhhbodied_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.DCLFMKONKBH getLakhhbodied(int index) {
    return lakhhbodied_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.DCLFMKONKBHOrBuilder getLakhhbodiedOrBuilder(
      int index) {
    return lakhhbodied_.get(index);
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
    if (lcajjpmoafe_ != POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA.UNSET.getNumber()) {
      output.writeEnum(1, lcajjpmoafe_);
    }
    for (int i = 0; i < lakhhbodied_.size(); i++) {
      output.writeMessage(2, lakhhbodied_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lcajjpmoafe_ != POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lcajjpmoafe_);
    }
    for (int i = 0; i < lakhhbodied_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, lakhhbodied_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.BHFLKBCOEKI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BHFLKBCOEKI other = (POGOProtos.Rpc.BHFLKBCOEKI) obj;

    if (lcajjpmoafe_ != other.lcajjpmoafe_) return false;
    if (!getLakhhbodiedList()
        .equals(other.getLakhhbodiedList())) return false;
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
    if (getLakhhbodiedCount() > 0) {
      hash = (37 * hash) + LAKHHBODIED_FIELD_NUMBER;
      hash = (53 * hash) + getLakhhbodiedList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BHFLKBCOEKI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BHFLKBCOEKI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BHFLKBCOEKI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BHFLKBCOEKI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BHFLKBCOEKI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BHFLKBCOEKI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BHFLKBCOEKI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BHFLKBCOEKI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BHFLKBCOEKI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BHFLKBCOEKI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BHFLKBCOEKI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BHFLKBCOEKI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BHFLKBCOEKI prototype) {
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
   * ref: BHFLKBCOEKI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BHFLKBCOEKI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BHFLKBCOEKI)
      POGOProtos.Rpc.BHFLKBCOEKIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BHFLKBCOEKI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BHFLKBCOEKI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BHFLKBCOEKI.class, POGOProtos.Rpc.BHFLKBCOEKI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BHFLKBCOEKI.newBuilder()
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
        getLakhhbodiedFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      lcajjpmoafe_ = 0;

      if (lakhhbodiedBuilder_ == null) {
        lakhhbodied_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        lakhhbodiedBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BHFLKBCOEKI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BHFLKBCOEKI getDefaultInstanceForType() {
      return POGOProtos.Rpc.BHFLKBCOEKI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BHFLKBCOEKI build() {
      POGOProtos.Rpc.BHFLKBCOEKI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BHFLKBCOEKI buildPartial() {
      POGOProtos.Rpc.BHFLKBCOEKI result = new POGOProtos.Rpc.BHFLKBCOEKI(this);
      int from_bitField0_ = bitField0_;
      result.lcajjpmoafe_ = lcajjpmoafe_;
      if (lakhhbodiedBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          lakhhbodied_ = java.util.Collections.unmodifiableList(lakhhbodied_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lakhhbodied_ = lakhhbodied_;
      } else {
        result.lakhhbodied_ = lakhhbodiedBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.BHFLKBCOEKI) {
        return mergeFrom((POGOProtos.Rpc.BHFLKBCOEKI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BHFLKBCOEKI other) {
      if (other == POGOProtos.Rpc.BHFLKBCOEKI.getDefaultInstance()) return this;
      if (other.lcajjpmoafe_ != 0) {
        setLcajjpmoafeValue(other.getLcajjpmoafeValue());
      }
      if (lakhhbodiedBuilder_ == null) {
        if (!other.lakhhbodied_.isEmpty()) {
          if (lakhhbodied_.isEmpty()) {
            lakhhbodied_ = other.lakhhbodied_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLakhhbodiedIsMutable();
            lakhhbodied_.addAll(other.lakhhbodied_);
          }
          onChanged();
        }
      } else {
        if (!other.lakhhbodied_.isEmpty()) {
          if (lakhhbodiedBuilder_.isEmpty()) {
            lakhhbodiedBuilder_.dispose();
            lakhhbodiedBuilder_ = null;
            lakhhbodied_ = other.lakhhbodied_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lakhhbodiedBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLakhhbodiedFieldBuilder() : null;
          } else {
            lakhhbodiedBuilder_.addAllMessages(other.lakhhbodied_);
          }
        }
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
      POGOProtos.Rpc.BHFLKBCOEKI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BHFLKBCOEKI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int lcajjpmoafe_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA lcajjpmoafe = 1;</code>
     * @return The enum numeric value on the wire for lcajjpmoafe.
     */
    @java.lang.Override public int getLcajjpmoafeValue() {
      return lcajjpmoafe_;
    }
    /**
     * <code>.POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA lcajjpmoafe = 1;</code>
     * @param value The enum numeric value on the wire for lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafeValue(int value) {
      
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA lcajjpmoafe = 1;</code>
     * @return The lcajjpmoafe.
     */
    @java.lang.Override
    public POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA getLcajjpmoafe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA result = POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA.valueOf(lcajjpmoafe_);
      return result == null ? POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA lcajjpmoafe = 1;</code>
     * @param value The lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafe(POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lcajjpmoafe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BHFLKBCOEKI.BGMMBLPHPLA lcajjpmoafe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcajjpmoafe() {
      
      lcajjpmoafe_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.DCLFMKONKBH> lakhhbodied_ =
      java.util.Collections.emptyList();
    private void ensureLakhhbodiedIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lakhhbodied_ = new java.util.ArrayList<POGOProtos.Rpc.DCLFMKONKBH>(lakhhbodied_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.DCLFMKONKBH, POGOProtos.Rpc.DCLFMKONKBH.Builder, POGOProtos.Rpc.DCLFMKONKBHOrBuilder> lakhhbodiedBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.DCLFMKONKBH> getLakhhbodiedList() {
      if (lakhhbodiedBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lakhhbodied_);
      } else {
        return lakhhbodiedBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public int getLakhhbodiedCount() {
      if (lakhhbodiedBuilder_ == null) {
        return lakhhbodied_.size();
      } else {
        return lakhhbodiedBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public POGOProtos.Rpc.DCLFMKONKBH getLakhhbodied(int index) {
      if (lakhhbodiedBuilder_ == null) {
        return lakhhbodied_.get(index);
      } else {
        return lakhhbodiedBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public Builder setLakhhbodied(
        int index, POGOProtos.Rpc.DCLFMKONKBH value) {
      if (lakhhbodiedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLakhhbodiedIsMutable();
        lakhhbodied_.set(index, value);
        onChanged();
      } else {
        lakhhbodiedBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public Builder setLakhhbodied(
        int index, POGOProtos.Rpc.DCLFMKONKBH.Builder builderForValue) {
      if (lakhhbodiedBuilder_ == null) {
        ensureLakhhbodiedIsMutable();
        lakhhbodied_.set(index, builderForValue.build());
        onChanged();
      } else {
        lakhhbodiedBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public Builder addLakhhbodied(POGOProtos.Rpc.DCLFMKONKBH value) {
      if (lakhhbodiedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLakhhbodiedIsMutable();
        lakhhbodied_.add(value);
        onChanged();
      } else {
        lakhhbodiedBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public Builder addLakhhbodied(
        int index, POGOProtos.Rpc.DCLFMKONKBH value) {
      if (lakhhbodiedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLakhhbodiedIsMutable();
        lakhhbodied_.add(index, value);
        onChanged();
      } else {
        lakhhbodiedBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public Builder addLakhhbodied(
        POGOProtos.Rpc.DCLFMKONKBH.Builder builderForValue) {
      if (lakhhbodiedBuilder_ == null) {
        ensureLakhhbodiedIsMutable();
        lakhhbodied_.add(builderForValue.build());
        onChanged();
      } else {
        lakhhbodiedBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public Builder addLakhhbodied(
        int index, POGOProtos.Rpc.DCLFMKONKBH.Builder builderForValue) {
      if (lakhhbodiedBuilder_ == null) {
        ensureLakhhbodiedIsMutable();
        lakhhbodied_.add(index, builderForValue.build());
        onChanged();
      } else {
        lakhhbodiedBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public Builder addAllLakhhbodied(
        java.lang.Iterable<? extends POGOProtos.Rpc.DCLFMKONKBH> values) {
      if (lakhhbodiedBuilder_ == null) {
        ensureLakhhbodiedIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lakhhbodied_);
        onChanged();
      } else {
        lakhhbodiedBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public Builder clearLakhhbodied() {
      if (lakhhbodiedBuilder_ == null) {
        lakhhbodied_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lakhhbodiedBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public Builder removeLakhhbodied(int index) {
      if (lakhhbodiedBuilder_ == null) {
        ensureLakhhbodiedIsMutable();
        lakhhbodied_.remove(index);
        onChanged();
      } else {
        lakhhbodiedBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public POGOProtos.Rpc.DCLFMKONKBH.Builder getLakhhbodiedBuilder(
        int index) {
      return getLakhhbodiedFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public POGOProtos.Rpc.DCLFMKONKBHOrBuilder getLakhhbodiedOrBuilder(
        int index) {
      if (lakhhbodiedBuilder_ == null) {
        return lakhhbodied_.get(index);  } else {
        return lakhhbodiedBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.DCLFMKONKBHOrBuilder> 
         getLakhhbodiedOrBuilderList() {
      if (lakhhbodiedBuilder_ != null) {
        return lakhhbodiedBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lakhhbodied_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public POGOProtos.Rpc.DCLFMKONKBH.Builder addLakhhbodiedBuilder() {
      return getLakhhbodiedFieldBuilder().addBuilder(
          POGOProtos.Rpc.DCLFMKONKBH.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public POGOProtos.Rpc.DCLFMKONKBH.Builder addLakhhbodiedBuilder(
        int index) {
      return getLakhhbodiedFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.DCLFMKONKBH.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DCLFMKONKBH lakhhbodied = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.DCLFMKONKBH.Builder> 
         getLakhhbodiedBuilderList() {
      return getLakhhbodiedFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.DCLFMKONKBH, POGOProtos.Rpc.DCLFMKONKBH.Builder, POGOProtos.Rpc.DCLFMKONKBHOrBuilder> 
        getLakhhbodiedFieldBuilder() {
      if (lakhhbodiedBuilder_ == null) {
        lakhhbodiedBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.DCLFMKONKBH, POGOProtos.Rpc.DCLFMKONKBH.Builder, POGOProtos.Rpc.DCLFMKONKBHOrBuilder>(
                lakhhbodied_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        lakhhbodied_ = null;
      }
      return lakhhbodiedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BHFLKBCOEKI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BHFLKBCOEKI)
  private static final POGOProtos.Rpc.BHFLKBCOEKI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BHFLKBCOEKI();
  }

  public static POGOProtos.Rpc.BHFLKBCOEKI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BHFLKBCOEKI>
      PARSER = new com.google.protobuf.AbstractParser<BHFLKBCOEKI>() {
    @java.lang.Override
    public BHFLKBCOEKI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BHFLKBCOEKI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BHFLKBCOEKI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BHFLKBCOEKI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BHFLKBCOEKI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

