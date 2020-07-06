// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Social/SocialRequest.proto

package POGOProtos.Networking.Requests.Social;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Social.SocialRequest}
 */
public  final class SocialRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Social.SocialRequest)
    SocialRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SocialRequest.newBuilder() to construct.
  private SocialRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SocialRequest() {
    socialAction_ = 0;
    requestMessage_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SocialRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SocialRequest(
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

            socialAction_ = rawValue;
            break;
          }
          case 18: {

            requestMessage_ = input.readBytes();
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
    return POGOProtos.Networking.Requests.Social.SocialRequestOuterClass.internal_static_POGOProtos_Networking_Requests_Social_SocialRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Social.SocialRequestOuterClass.internal_static_POGOProtos_Networking_Requests_Social_SocialRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Social.SocialRequest.class, POGOProtos.Networking.Requests.Social.SocialRequest.Builder.class);
  }

  public static final int SOCIAL_ACTION_FIELD_NUMBER = 1;
  private int socialAction_;
  /**
   * <code>.POGOProtos.Networking.Requests.Social.SocialAction social_action = 1;</code>
   * @return The enum numeric value on the wire for socialAction.
   */
  public int getSocialActionValue() {
    return socialAction_;
  }
  /**
   * <code>.POGOProtos.Networking.Requests.Social.SocialAction social_action = 1;</code>
   * @return The socialAction.
   */
  public POGOProtos.Networking.Requests.Social.SocialAction getSocialAction() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Requests.Social.SocialAction result = POGOProtos.Networking.Requests.Social.SocialAction.valueOf(socialAction_);
    return result == null ? POGOProtos.Networking.Requests.Social.SocialAction.UNRECOGNIZED : result;
  }

  public static final int REQUEST_MESSAGE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString requestMessage_;
  /**
   * <code>bytes request_message = 2;</code>
   * @return The requestMessage.
   */
  public com.google.protobuf.ByteString getRequestMessage() {
    return requestMessage_;
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
    if (socialAction_ != POGOProtos.Networking.Requests.Social.SocialAction.UNKNOWN_SOCIAL_ACTION.getNumber()) {
      output.writeEnum(1, socialAction_);
    }
    if (!requestMessage_.isEmpty()) {
      output.writeBytes(2, requestMessage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (socialAction_ != POGOProtos.Networking.Requests.Social.SocialAction.UNKNOWN_SOCIAL_ACTION.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, socialAction_);
    }
    if (!requestMessage_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, requestMessage_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Social.SocialRequest)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Social.SocialRequest other = (POGOProtos.Networking.Requests.Social.SocialRequest) obj;

    if (socialAction_ != other.socialAction_) return false;
    if (!getRequestMessage()
        .equals(other.getRequestMessage())) return false;
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
    hash = (37 * hash) + SOCIAL_ACTION_FIELD_NUMBER;
    hash = (53 * hash) + socialAction_;
    hash = (37 * hash) + REQUEST_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getRequestMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Social.SocialRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Social.SocialRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.SocialRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Social.SocialRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.SocialRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Social.SocialRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.SocialRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Social.SocialRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.SocialRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Social.SocialRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Social.SocialRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Social.SocialRequest parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Social.SocialRequest prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Social.SocialRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Social.SocialRequest)
      POGOProtos.Networking.Requests.Social.SocialRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Social.SocialRequestOuterClass.internal_static_POGOProtos_Networking_Requests_Social_SocialRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Social.SocialRequestOuterClass.internal_static_POGOProtos_Networking_Requests_Social_SocialRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Social.SocialRequest.class, POGOProtos.Networking.Requests.Social.SocialRequest.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Social.SocialRequest.newBuilder()
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
      socialAction_ = 0;

      requestMessage_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Social.SocialRequestOuterClass.internal_static_POGOProtos_Networking_Requests_Social_SocialRequest_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Social.SocialRequest getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Social.SocialRequest.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Social.SocialRequest build() {
      POGOProtos.Networking.Requests.Social.SocialRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Social.SocialRequest buildPartial() {
      POGOProtos.Networking.Requests.Social.SocialRequest result = new POGOProtos.Networking.Requests.Social.SocialRequest(this);
      result.socialAction_ = socialAction_;
      result.requestMessage_ = requestMessage_;
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
      if (other instanceof POGOProtos.Networking.Requests.Social.SocialRequest) {
        return mergeFrom((POGOProtos.Networking.Requests.Social.SocialRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Social.SocialRequest other) {
      if (other == POGOProtos.Networking.Requests.Social.SocialRequest.getDefaultInstance()) return this;
      if (other.socialAction_ != 0) {
        setSocialActionValue(other.getSocialActionValue());
      }
      if (other.getRequestMessage() != com.google.protobuf.ByteString.EMPTY) {
        setRequestMessage(other.getRequestMessage());
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
      POGOProtos.Networking.Requests.Social.SocialRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Social.SocialRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int socialAction_ = 0;
    /**
     * <code>.POGOProtos.Networking.Requests.Social.SocialAction social_action = 1;</code>
     * @return The enum numeric value on the wire for socialAction.
     */
    public int getSocialActionValue() {
      return socialAction_;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Social.SocialAction social_action = 1;</code>
     * @param value The enum numeric value on the wire for socialAction to set.
     * @return This builder for chaining.
     */
    public Builder setSocialActionValue(int value) {
      socialAction_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Social.SocialAction social_action = 1;</code>
     * @return The socialAction.
     */
    public POGOProtos.Networking.Requests.Social.SocialAction getSocialAction() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Requests.Social.SocialAction result = POGOProtos.Networking.Requests.Social.SocialAction.valueOf(socialAction_);
      return result == null ? POGOProtos.Networking.Requests.Social.SocialAction.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Social.SocialAction social_action = 1;</code>
     * @param value The socialAction to set.
     * @return This builder for chaining.
     */
    public Builder setSocialAction(POGOProtos.Networking.Requests.Social.SocialAction value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      socialAction_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Social.SocialAction social_action = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSocialAction() {
      
      socialAction_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString requestMessage_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes request_message = 2;</code>
     * @return The requestMessage.
     */
    public com.google.protobuf.ByteString getRequestMessage() {
      return requestMessage_;
    }
    /**
     * <code>bytes request_message = 2;</code>
     * @param value The requestMessage to set.
     * @return This builder for chaining.
     */
    public Builder setRequestMessage(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      requestMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes request_message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestMessage() {
      
      requestMessage_ = getDefaultInstance().getRequestMessage();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Social.SocialRequest)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Social.SocialRequest)
  private static final POGOProtos.Networking.Requests.Social.SocialRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Social.SocialRequest();
  }

  public static POGOProtos.Networking.Requests.Social.SocialRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SocialRequest>
      PARSER = new com.google.protobuf.AbstractParser<SocialRequest>() {
    @java.lang.Override
    public SocialRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SocialRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SocialRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SocialRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Social.SocialRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
