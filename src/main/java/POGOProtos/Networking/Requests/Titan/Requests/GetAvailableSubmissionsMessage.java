// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Titan/Requests/GetAvailableSubmissionsMessage.proto

package POGOProtos.Networking.Requests.Titan.Requests;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage}
 */
public  final class GetAvailableSubmissionsMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage)
    GetAvailableSubmissionsMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAvailableSubmissionsMessage.newBuilder() to construct.
  private GetAvailableSubmissionsMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAvailableSubmissionsMessage() {
    submissionType_ = 0;
    submissionTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAvailableSubmissionsMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAvailableSubmissionsMessage(
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

            submissionType_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              submissionTypes_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            submissionTypes_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                submissionTypes_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              submissionTypes_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
        submissionTypes_ = java.util.Collections.unmodifiableList(submissionTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Titan_Requests_GetAvailableSubmissionsMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Titan_Requests_GetAvailableSubmissionsMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage.class, POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage.Builder.class);
  }

  public static final int SUBMISSION_TYPE_FIELD_NUMBER = 1;
  private int submissionType_;
  /**
   * <code>.POGOProtos.Enums.PlayerSubmissionType submission_type = 1;</code>
   * @return The enum numeric value on the wire for submissionType.
   */
  public int getSubmissionTypeValue() {
    return submissionType_;
  }
  /**
   * <code>.POGOProtos.Enums.PlayerSubmissionType submission_type = 1;</code>
   * @return The submissionType.
   */
  public POGOProtos.Enums.PlayerSubmissionType getSubmissionType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.PlayerSubmissionType result = POGOProtos.Enums.PlayerSubmissionType.valueOf(submissionType_);
    return result == null ? POGOProtos.Enums.PlayerSubmissionType.UNRECOGNIZED : result;
  }

  public static final int SUBMISSION_TYPES_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> submissionTypes_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Enums.PlayerSubmissionType> submissionTypes_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Enums.PlayerSubmissionType>() {
            public POGOProtos.Enums.PlayerSubmissionType convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Enums.PlayerSubmissionType result = POGOProtos.Enums.PlayerSubmissionType.valueOf(from);
              return result == null ? POGOProtos.Enums.PlayerSubmissionType.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
   * @return A list containing the submissionTypes.
   */
  public java.util.List<POGOProtos.Enums.PlayerSubmissionType> getSubmissionTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Enums.PlayerSubmissionType>(submissionTypes_, submissionTypes_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
   * @return The count of submissionTypes.
   */
  public int getSubmissionTypesCount() {
    return submissionTypes_.size();
  }
  /**
   * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
   * @param index The index of the element to return.
   * @return The submissionTypes at the given index.
   */
  public POGOProtos.Enums.PlayerSubmissionType getSubmissionTypes(int index) {
    return submissionTypes_converter_.convert(submissionTypes_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
   * @return A list containing the enum numeric values on the wire for submissionTypes.
   */
  public java.util.List<java.lang.Integer>
  getSubmissionTypesValueList() {
    return submissionTypes_;
  }
  /**
   * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of submissionTypes at the given index.
   */
  public int getSubmissionTypesValue(int index) {
    return submissionTypes_.get(index);
  }
  private int submissionTypesMemoizedSerializedSize;

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
    getSerializedSize();
    if (submissionType_ != POGOProtos.Enums.PlayerSubmissionType.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, submissionType_);
    }
    if (getSubmissionTypesList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(submissionTypesMemoizedSerializedSize);
    }
    for (int i = 0; i < submissionTypes_.size(); i++) {
      output.writeEnumNoTag(submissionTypes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (submissionType_ != POGOProtos.Enums.PlayerSubmissionType.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, submissionType_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < submissionTypes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(submissionTypes_.get(i));
      }
      size += dataSize;
      if (!getSubmissionTypesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }submissionTypesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage other = (POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage) obj;

    if (submissionType_ != other.submissionType_) return false;
    if (!submissionTypes_.equals(other.submissionTypes_)) return false;
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
    hash = (37 * hash) + SUBMISSION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + submissionType_;
    if (getSubmissionTypesCount() > 0) {
      hash = (37 * hash) + SUBMISSION_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + submissionTypes_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage)
      POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Titan_Requests_GetAvailableSubmissionsMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Titan_Requests_GetAvailableSubmissionsMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage.class, POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage.newBuilder()
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
      submissionType_ = 0;

      submissionTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Titan_Requests_GetAvailableSubmissionsMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage build() {
      POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage buildPartial() {
      POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage result = new POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage(this);
      int from_bitField0_ = bitField0_;
      result.submissionType_ = submissionType_;
      if (((bitField0_ & 0x00000001) != 0)) {
        submissionTypes_ = java.util.Collections.unmodifiableList(submissionTypes_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.submissionTypes_ = submissionTypes_;
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
      if (other instanceof POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage other) {
      if (other == POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage.getDefaultInstance()) return this;
      if (other.submissionType_ != 0) {
        setSubmissionTypeValue(other.getSubmissionTypeValue());
      }
      if (!other.submissionTypes_.isEmpty()) {
        if (submissionTypes_.isEmpty()) {
          submissionTypes_ = other.submissionTypes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSubmissionTypesIsMutable();
          submissionTypes_.addAll(other.submissionTypes_);
        }
        onChanged();
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
      POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int submissionType_ = 0;
    /**
     * <code>.POGOProtos.Enums.PlayerSubmissionType submission_type = 1;</code>
     * @return The enum numeric value on the wire for submissionType.
     */
    public int getSubmissionTypeValue() {
      return submissionType_;
    }
    /**
     * <code>.POGOProtos.Enums.PlayerSubmissionType submission_type = 1;</code>
     * @param value The enum numeric value on the wire for submissionType to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionTypeValue(int value) {
      submissionType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.PlayerSubmissionType submission_type = 1;</code>
     * @return The submissionType.
     */
    public POGOProtos.Enums.PlayerSubmissionType getSubmissionType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.PlayerSubmissionType result = POGOProtos.Enums.PlayerSubmissionType.valueOf(submissionType_);
      return result == null ? POGOProtos.Enums.PlayerSubmissionType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.PlayerSubmissionType submission_type = 1;</code>
     * @param value The submissionType to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionType(POGOProtos.Enums.PlayerSubmissionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      submissionType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.PlayerSubmissionType submission_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubmissionType() {
      
      submissionType_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> submissionTypes_ =
      java.util.Collections.emptyList();
    private void ensureSubmissionTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        submissionTypes_ = new java.util.ArrayList<java.lang.Integer>(submissionTypes_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
     * @return A list containing the submissionTypes.
     */
    public java.util.List<POGOProtos.Enums.PlayerSubmissionType> getSubmissionTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Enums.PlayerSubmissionType>(submissionTypes_, submissionTypes_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
     * @return The count of submissionTypes.
     */
    public int getSubmissionTypesCount() {
      return submissionTypes_.size();
    }
    /**
     * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
     * @param index The index of the element to return.
     * @return The submissionTypes at the given index.
     */
    public POGOProtos.Enums.PlayerSubmissionType getSubmissionTypes(int index) {
      return submissionTypes_converter_.convert(submissionTypes_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
     * @param index The index to set the value at.
     * @param value The submissionTypes to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionTypes(
        int index, POGOProtos.Enums.PlayerSubmissionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSubmissionTypesIsMutable();
      submissionTypes_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
     * @param value The submissionTypes to add.
     * @return This builder for chaining.
     */
    public Builder addSubmissionTypes(POGOProtos.Enums.PlayerSubmissionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSubmissionTypesIsMutable();
      submissionTypes_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
     * @param values The submissionTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllSubmissionTypes(
        java.lang.Iterable<? extends POGOProtos.Enums.PlayerSubmissionType> values) {
      ensureSubmissionTypesIsMutable();
      for (POGOProtos.Enums.PlayerSubmissionType value : values) {
        submissionTypes_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubmissionTypes() {
      submissionTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
     * @return A list containing the enum numeric values on the wire for submissionTypes.
     */
    public java.util.List<java.lang.Integer>
    getSubmissionTypesValueList() {
      return java.util.Collections.unmodifiableList(submissionTypes_);
    }
    /**
     * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of submissionTypes at the given index.
     */
    public int getSubmissionTypesValue(int index) {
      return submissionTypes_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of submissionTypes at the given index.
     * @return This builder for chaining.
     */
    public Builder setSubmissionTypesValue(
        int index, int value) {
      ensureSubmissionTypesIsMutable();
      submissionTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
     * @param value The enum numeric value on the wire for submissionTypes to add.
     * @return This builder for chaining.
     */
    public Builder addSubmissionTypesValue(int value) {
      ensureSubmissionTypesIsMutable();
      submissionTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Enums.PlayerSubmissionType submission_types = 2;</code>
     * @param values The enum numeric values on the wire for submissionTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllSubmissionTypesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureSubmissionTypesIsMutable();
      for (int value : values) {
        submissionTypes_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage)
  private static final POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage();
  }

  public static POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAvailableSubmissionsMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetAvailableSubmissionsMessage>() {
    @java.lang.Override
    public GetAvailableSubmissionsMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAvailableSubmissionsMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAvailableSubmissionsMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAvailableSubmissionsMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Titan.Requests.GetAvailableSubmissionsMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

