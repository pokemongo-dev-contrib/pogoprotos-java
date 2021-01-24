// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.AsyncFileUploadCompleteProto}
 */
public final class AsyncFileUploadCompleteProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AsyncFileUploadCompleteProto)
    AsyncFileUploadCompleteProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AsyncFileUploadCompleteProto.newBuilder() to construct.
  private AsyncFileUploadCompleteProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AsyncFileUploadCompleteProto() {
    submissionId_ = "";
    uploadStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AsyncFileUploadCompleteProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AsyncFileUploadCompleteProto(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            submissionId_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            uploadStatus_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AsyncFileUploadCompleteProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AsyncFileUploadCompleteProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AsyncFileUploadCompleteProto.class, POGOProtos.Rpc.AsyncFileUploadCompleteProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>UPLOAD_DONE = 1;</code>
     */
    UPLOAD_DONE(1),
    /**
     * <code>UPLOAD_FAILED = 2;</code>
     */
    UPLOAD_FAILED(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>UPLOAD_DONE = 1;</code>
     */
    public static final int UPLOAD_DONE_VALUE = 1;
    /**
     * <code>UPLOAD_FAILED = 2;</code>
     */
    public static final int UPLOAD_FAILED_VALUE = 2;


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
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return UPLOAD_DONE;
        case 2: return UPLOAD_FAILED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
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
      return POGOProtos.Rpc.AsyncFileUploadCompleteProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
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

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status)
  }

  public static final int SUBMISSION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object submissionId_;
  /**
   * <code>string submission_id = 1;</code>
   * @return The submissionId.
   */
  @java.lang.Override
  public java.lang.String getSubmissionId() {
    java.lang.Object ref = submissionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      submissionId_ = s;
      return s;
    }
  }
  /**
   * <code>string submission_id = 1;</code>
   * @return The bytes for submissionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubmissionIdBytes() {
    java.lang.Object ref = submissionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      submissionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPLOAD_STATUS_FIELD_NUMBER = 3;
  private int uploadStatus_;
  /**
   * <code>.POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status upload_status = 3;</code>
   * @return The enum numeric value on the wire for uploadStatus.
   */
  @java.lang.Override public int getUploadStatusValue() {
    return uploadStatus_;
  }
  /**
   * <code>.POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status upload_status = 3;</code>
   * @return The uploadStatus.
   */
  @java.lang.Override public POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status getUploadStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status result = POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status.valueOf(uploadStatus_);
    return result == null ? POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status.UNRECOGNIZED : result;
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
    if (!getSubmissionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, submissionId_);
    }
    if (uploadStatus_ != POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status.UNSET.getNumber()) {
      output.writeEnum(3, uploadStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSubmissionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, submissionId_);
    }
    if (uploadStatus_ != POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, uploadStatus_);
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
    if (!(obj instanceof POGOProtos.Rpc.AsyncFileUploadCompleteProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AsyncFileUploadCompleteProto other = (POGOProtos.Rpc.AsyncFileUploadCompleteProto) obj;

    if (!getSubmissionId()
        .equals(other.getSubmissionId())) return false;
    if (uploadStatus_ != other.uploadStatus_) return false;
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
    hash = (37 * hash) + SUBMISSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubmissionId().hashCode();
    hash = (37 * hash) + UPLOAD_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + uploadStatus_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AsyncFileUploadCompleteProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AsyncFileUploadCompleteProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AsyncFileUploadCompleteProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AsyncFileUploadCompleteProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AsyncFileUploadCompleteProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AsyncFileUploadCompleteProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AsyncFileUploadCompleteProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AsyncFileUploadCompleteProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AsyncFileUploadCompleteProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AsyncFileUploadCompleteProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AsyncFileUploadCompleteProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AsyncFileUploadCompleteProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AsyncFileUploadCompleteProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.AsyncFileUploadCompleteProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AsyncFileUploadCompleteProto)
      POGOProtos.Rpc.AsyncFileUploadCompleteProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AsyncFileUploadCompleteProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AsyncFileUploadCompleteProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AsyncFileUploadCompleteProto.class, POGOProtos.Rpc.AsyncFileUploadCompleteProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AsyncFileUploadCompleteProto.newBuilder()
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
      submissionId_ = "";

      uploadStatus_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AsyncFileUploadCompleteProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AsyncFileUploadCompleteProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.AsyncFileUploadCompleteProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AsyncFileUploadCompleteProto build() {
      POGOProtos.Rpc.AsyncFileUploadCompleteProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AsyncFileUploadCompleteProto buildPartial() {
      POGOProtos.Rpc.AsyncFileUploadCompleteProto result = new POGOProtos.Rpc.AsyncFileUploadCompleteProto(this);
      result.submissionId_ = submissionId_;
      result.uploadStatus_ = uploadStatus_;
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
      if (other instanceof POGOProtos.Rpc.AsyncFileUploadCompleteProto) {
        return mergeFrom((POGOProtos.Rpc.AsyncFileUploadCompleteProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AsyncFileUploadCompleteProto other) {
      if (other == POGOProtos.Rpc.AsyncFileUploadCompleteProto.getDefaultInstance()) return this;
      if (!other.getSubmissionId().isEmpty()) {
        submissionId_ = other.submissionId_;
        onChanged();
      }
      if (other.uploadStatus_ != 0) {
        setUploadStatusValue(other.getUploadStatusValue());
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
      POGOProtos.Rpc.AsyncFileUploadCompleteProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AsyncFileUploadCompleteProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object submissionId_ = "";
    /**
     * <code>string submission_id = 1;</code>
     * @return The submissionId.
     */
    public java.lang.String getSubmissionId() {
      java.lang.Object ref = submissionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        submissionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string submission_id = 1;</code>
     * @return The bytes for submissionId.
     */
    public com.google.protobuf.ByteString
        getSubmissionIdBytes() {
      java.lang.Object ref = submissionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        submissionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string submission_id = 1;</code>
     * @param value The submissionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      submissionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string submission_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubmissionId() {
      
      submissionId_ = getDefaultInstance().getSubmissionId();
      onChanged();
      return this;
    }
    /**
     * <code>string submission_id = 1;</code>
     * @param value The bytes for submissionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      submissionId_ = value;
      onChanged();
      return this;
    }

    private int uploadStatus_ = 0;
    /**
     * <code>.POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status upload_status = 3;</code>
     * @return The enum numeric value on the wire for uploadStatus.
     */
    @java.lang.Override public int getUploadStatusValue() {
      return uploadStatus_;
    }
    /**
     * <code>.POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status upload_status = 3;</code>
     * @param value The enum numeric value on the wire for uploadStatus to set.
     * @return This builder for chaining.
     */
    public Builder setUploadStatusValue(int value) {
      
      uploadStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status upload_status = 3;</code>
     * @return The uploadStatus.
     */
    @java.lang.Override
    public POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status getUploadStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status result = POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status.valueOf(uploadStatus_);
      return result == null ? POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status upload_status = 3;</code>
     * @param value The uploadStatus to set.
     * @return This builder for chaining.
     */
    public Builder setUploadStatus(POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      uploadStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status upload_status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUploadStatus() {
      
      uploadStatus_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AsyncFileUploadCompleteProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AsyncFileUploadCompleteProto)
  private static final POGOProtos.Rpc.AsyncFileUploadCompleteProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AsyncFileUploadCompleteProto();
  }

  public static POGOProtos.Rpc.AsyncFileUploadCompleteProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AsyncFileUploadCompleteProto>
      PARSER = new com.google.protobuf.AbstractParser<AsyncFileUploadCompleteProto>() {
    @java.lang.Override
    public AsyncFileUploadCompleteProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AsyncFileUploadCompleteProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AsyncFileUploadCompleteProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AsyncFileUploadCompleteProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AsyncFileUploadCompleteProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
