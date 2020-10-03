// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PGBOLEFLDPI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PGBOLEFLDPI}
 */
public final class PGBOLEFLDPI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PGBOLEFLDPI)
    PGBOLEFLDPIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PGBOLEFLDPI.newBuilder() to construct.
  private PGBOLEFLDPI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PGBOLEFLDPI() {
    result_ = 0;
    ioghbpknjbd_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PGBOLEFLDPI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PGBOLEFLDPI(
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

            result_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ioghbpknjbd_ = new java.util.ArrayList<POGOProtos.Rpc.ActionLogEntry>();
              mutable_bitField0_ |= 0x00000001;
            }
            ioghbpknjbd_.add(
                input.readMessage(POGOProtos.Rpc.ActionLogEntry.parser(), extensionRegistry));
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
        ioghbpknjbd_ = java.util.Collections.unmodifiableList(ioghbpknjbd_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PGBOLEFLDPI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PGBOLEFLDPI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PGBOLEFLDPI.class, POGOProtos.Rpc.PGBOLEFLDPI.Builder.class);
  }

  /**
   * <pre>
   * ref: PGBOLEFLDPI/FPBMJLPOPHC/AGHOCBHJNBP
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.PGBOLEFLDPI.Result}
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
      return POGOProtos.Rpc.PGBOLEFLDPI.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PGBOLEFLDPI.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.PGBOLEFLDPI.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.PGBOLEFLDPI.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.PGBOLEFLDPI.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PGBOLEFLDPI.Result result = POGOProtos.Rpc.PGBOLEFLDPI.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.PGBOLEFLDPI.Result.UNRECOGNIZED : result;
  }

  public static final int IOGHBPKNJBD_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.ActionLogEntry> ioghbpknjbd_;
  /**
   * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.ActionLogEntry> getIoghbpknjbdList() {
    return ioghbpknjbd_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.ActionLogEntryOrBuilder> 
      getIoghbpknjbdOrBuilderList() {
    return ioghbpknjbd_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
   */
  @java.lang.Override
  public int getIoghbpknjbdCount() {
    return ioghbpknjbd_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ActionLogEntry getIoghbpknjbd(int index) {
    return ioghbpknjbd_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ActionLogEntryOrBuilder getIoghbpknjbdOrBuilder(
      int index) {
    return ioghbpknjbd_.get(index);
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
    if (result_ != POGOProtos.Rpc.PGBOLEFLDPI.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    for (int i = 0; i < ioghbpknjbd_.size(); i++) {
      output.writeMessage(2, ioghbpknjbd_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.PGBOLEFLDPI.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    for (int i = 0; i < ioghbpknjbd_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, ioghbpknjbd_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.PGBOLEFLDPI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PGBOLEFLDPI other = (POGOProtos.Rpc.PGBOLEFLDPI) obj;

    if (result_ != other.result_) return false;
    if (!getIoghbpknjbdList()
        .equals(other.getIoghbpknjbdList())) return false;
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
    if (getIoghbpknjbdCount() > 0) {
      hash = (37 * hash) + IOGHBPKNJBD_FIELD_NUMBER;
      hash = (53 * hash) + getIoghbpknjbdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PGBOLEFLDPI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PGBOLEFLDPI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PGBOLEFLDPI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PGBOLEFLDPI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PGBOLEFLDPI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PGBOLEFLDPI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PGBOLEFLDPI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PGBOLEFLDPI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PGBOLEFLDPI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PGBOLEFLDPI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PGBOLEFLDPI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PGBOLEFLDPI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PGBOLEFLDPI prototype) {
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
   * ref: PGBOLEFLDPI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PGBOLEFLDPI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PGBOLEFLDPI)
      POGOProtos.Rpc.PGBOLEFLDPIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PGBOLEFLDPI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PGBOLEFLDPI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PGBOLEFLDPI.class, POGOProtos.Rpc.PGBOLEFLDPI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PGBOLEFLDPI.newBuilder()
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
        getIoghbpknjbdFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      result_ = 0;

      if (ioghbpknjbdBuilder_ == null) {
        ioghbpknjbd_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ioghbpknjbdBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PGBOLEFLDPI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PGBOLEFLDPI getDefaultInstanceForType() {
      return POGOProtos.Rpc.PGBOLEFLDPI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PGBOLEFLDPI build() {
      POGOProtos.Rpc.PGBOLEFLDPI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PGBOLEFLDPI buildPartial() {
      POGOProtos.Rpc.PGBOLEFLDPI result = new POGOProtos.Rpc.PGBOLEFLDPI(this);
      int from_bitField0_ = bitField0_;
      result.result_ = result_;
      if (ioghbpknjbdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ioghbpknjbd_ = java.util.Collections.unmodifiableList(ioghbpknjbd_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ioghbpknjbd_ = ioghbpknjbd_;
      } else {
        result.ioghbpknjbd_ = ioghbpknjbdBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PGBOLEFLDPI) {
        return mergeFrom((POGOProtos.Rpc.PGBOLEFLDPI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PGBOLEFLDPI other) {
      if (other == POGOProtos.Rpc.PGBOLEFLDPI.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (ioghbpknjbdBuilder_ == null) {
        if (!other.ioghbpknjbd_.isEmpty()) {
          if (ioghbpknjbd_.isEmpty()) {
            ioghbpknjbd_ = other.ioghbpknjbd_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIoghbpknjbdIsMutable();
            ioghbpknjbd_.addAll(other.ioghbpknjbd_);
          }
          onChanged();
        }
      } else {
        if (!other.ioghbpknjbd_.isEmpty()) {
          if (ioghbpknjbdBuilder_.isEmpty()) {
            ioghbpknjbdBuilder_.dispose();
            ioghbpknjbdBuilder_ = null;
            ioghbpknjbd_ = other.ioghbpknjbd_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ioghbpknjbdBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIoghbpknjbdFieldBuilder() : null;
          } else {
            ioghbpknjbdBuilder_.addAllMessages(other.ioghbpknjbd_);
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
      POGOProtos.Rpc.PGBOLEFLDPI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PGBOLEFLDPI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int result_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PGBOLEFLDPI.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.PGBOLEFLDPI.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PGBOLEFLDPI.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PGBOLEFLDPI.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PGBOLEFLDPI.Result result = POGOProtos.Rpc.PGBOLEFLDPI.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.PGBOLEFLDPI.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PGBOLEFLDPI.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.PGBOLEFLDPI.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PGBOLEFLDPI.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.ActionLogEntry> ioghbpknjbd_ =
      java.util.Collections.emptyList();
    private void ensureIoghbpknjbdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ioghbpknjbd_ = new java.util.ArrayList<POGOProtos.Rpc.ActionLogEntry>(ioghbpknjbd_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.ActionLogEntry, POGOProtos.Rpc.ActionLogEntry.Builder, POGOProtos.Rpc.ActionLogEntryOrBuilder> ioghbpknjbdBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.ActionLogEntry> getIoghbpknjbdList() {
      if (ioghbpknjbdBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ioghbpknjbd_);
      } else {
        return ioghbpknjbdBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public int getIoghbpknjbdCount() {
      if (ioghbpknjbdBuilder_ == null) {
        return ioghbpknjbd_.size();
      } else {
        return ioghbpknjbdBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public POGOProtos.Rpc.ActionLogEntry getIoghbpknjbd(int index) {
      if (ioghbpknjbdBuilder_ == null) {
        return ioghbpknjbd_.get(index);
      } else {
        return ioghbpknjbdBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public Builder setIoghbpknjbd(
        int index, POGOProtos.Rpc.ActionLogEntry value) {
      if (ioghbpknjbdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIoghbpknjbdIsMutable();
        ioghbpknjbd_.set(index, value);
        onChanged();
      } else {
        ioghbpknjbdBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public Builder setIoghbpknjbd(
        int index, POGOProtos.Rpc.ActionLogEntry.Builder builderForValue) {
      if (ioghbpknjbdBuilder_ == null) {
        ensureIoghbpknjbdIsMutable();
        ioghbpknjbd_.set(index, builderForValue.build());
        onChanged();
      } else {
        ioghbpknjbdBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public Builder addIoghbpknjbd(POGOProtos.Rpc.ActionLogEntry value) {
      if (ioghbpknjbdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIoghbpknjbdIsMutable();
        ioghbpknjbd_.add(value);
        onChanged();
      } else {
        ioghbpknjbdBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public Builder addIoghbpknjbd(
        int index, POGOProtos.Rpc.ActionLogEntry value) {
      if (ioghbpknjbdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIoghbpknjbdIsMutable();
        ioghbpknjbd_.add(index, value);
        onChanged();
      } else {
        ioghbpknjbdBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public Builder addIoghbpknjbd(
        POGOProtos.Rpc.ActionLogEntry.Builder builderForValue) {
      if (ioghbpknjbdBuilder_ == null) {
        ensureIoghbpknjbdIsMutable();
        ioghbpknjbd_.add(builderForValue.build());
        onChanged();
      } else {
        ioghbpknjbdBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public Builder addIoghbpknjbd(
        int index, POGOProtos.Rpc.ActionLogEntry.Builder builderForValue) {
      if (ioghbpknjbdBuilder_ == null) {
        ensureIoghbpknjbdIsMutable();
        ioghbpknjbd_.add(index, builderForValue.build());
        onChanged();
      } else {
        ioghbpknjbdBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public Builder addAllIoghbpknjbd(
        java.lang.Iterable<? extends POGOProtos.Rpc.ActionLogEntry> values) {
      if (ioghbpknjbdBuilder_ == null) {
        ensureIoghbpknjbdIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ioghbpknjbd_);
        onChanged();
      } else {
        ioghbpknjbdBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public Builder clearIoghbpknjbd() {
      if (ioghbpknjbdBuilder_ == null) {
        ioghbpknjbd_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ioghbpknjbdBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public Builder removeIoghbpknjbd(int index) {
      if (ioghbpknjbdBuilder_ == null) {
        ensureIoghbpknjbdIsMutable();
        ioghbpknjbd_.remove(index);
        onChanged();
      } else {
        ioghbpknjbdBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public POGOProtos.Rpc.ActionLogEntry.Builder getIoghbpknjbdBuilder(
        int index) {
      return getIoghbpknjbdFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public POGOProtos.Rpc.ActionLogEntryOrBuilder getIoghbpknjbdOrBuilder(
        int index) {
      if (ioghbpknjbdBuilder_ == null) {
        return ioghbpknjbd_.get(index);  } else {
        return ioghbpknjbdBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.ActionLogEntryOrBuilder> 
         getIoghbpknjbdOrBuilderList() {
      if (ioghbpknjbdBuilder_ != null) {
        return ioghbpknjbdBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ioghbpknjbd_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public POGOProtos.Rpc.ActionLogEntry.Builder addIoghbpknjbdBuilder() {
      return getIoghbpknjbdFieldBuilder().addBuilder(
          POGOProtos.Rpc.ActionLogEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public POGOProtos.Rpc.ActionLogEntry.Builder addIoghbpknjbdBuilder(
        int index) {
      return getIoghbpknjbdFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.ActionLogEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ActionLogEntry ioghbpknjbd = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.ActionLogEntry.Builder> 
         getIoghbpknjbdBuilderList() {
      return getIoghbpknjbdFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.ActionLogEntry, POGOProtos.Rpc.ActionLogEntry.Builder, POGOProtos.Rpc.ActionLogEntryOrBuilder> 
        getIoghbpknjbdFieldBuilder() {
      if (ioghbpknjbdBuilder_ == null) {
        ioghbpknjbdBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.ActionLogEntry, POGOProtos.Rpc.ActionLogEntry.Builder, POGOProtos.Rpc.ActionLogEntryOrBuilder>(
                ioghbpknjbd_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ioghbpknjbd_ = null;
      }
      return ioghbpknjbdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PGBOLEFLDPI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PGBOLEFLDPI)
  private static final POGOProtos.Rpc.PGBOLEFLDPI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PGBOLEFLDPI();
  }

  public static POGOProtos.Rpc.PGBOLEFLDPI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PGBOLEFLDPI>
      PARSER = new com.google.protobuf.AbstractParser<PGBOLEFLDPI>() {
    @java.lang.Override
    public PGBOLEFLDPI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PGBOLEFLDPI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PGBOLEFLDPI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PGBOLEFLDPI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PGBOLEFLDPI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

