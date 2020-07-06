// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GameSocial/Requests/ProxySocialActionMessage.proto

package POGOProtos.Networking.Requests.Game.GameSocial.Requests;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage}
 */
public  final class ProxySocialActionMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage)
    ProxySocialActionMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProxySocialActionMessage.newBuilder() to construct.
  private ProxySocialActionMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProxySocialActionMessage() {
    host_ = "";
    payload_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProxySocialActionMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProxySocialActionMessage(
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

            action_ = input.readUInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            host_ = s;
            break;
          }
          case 26: {

            payload_ = input.readBytes();
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
    return POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GameSocial_Requests_ProxySocialActionMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GameSocial_Requests_ProxySocialActionMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage.class, POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage.Builder.class);
  }

  public static final int ACTION_FIELD_NUMBER = 1;
  private int action_;
  /**
   * <code>uint32 action = 1;</code>
   * @return The action.
   */
  public int getAction() {
    return action_;
  }

  public static final int HOST_FIELD_NUMBER = 2;
  private volatile java.lang.Object host_;
  /**
   * <code>string host = 2;</code>
   * @return The host.
   */
  public java.lang.String getHost() {
    java.lang.Object ref = host_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      host_ = s;
      return s;
    }
  }
  /**
   * <code>string host = 2;</code>
   * @return The bytes for host.
   */
  public com.google.protobuf.ByteString
      getHostBytes() {
    java.lang.Object ref = host_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      host_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString payload_;
  /**
   * <code>bytes payload = 3;</code>
   * @return The payload.
   */
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
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
    if (action_ != 0) {
      output.writeUInt32(1, action_);
    }
    if (!getHostBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, host_);
    }
    if (!payload_.isEmpty()) {
      output.writeBytes(3, payload_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (action_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, action_);
    }
    if (!getHostBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, host_);
    }
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, payload_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage other = (POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage) obj;

    if (getAction()
        != other.getAction()) return false;
    if (!getHost()
        .equals(other.getHost())) return false;
    if (!getPayload()
        .equals(other.getPayload())) return false;
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
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction();
    hash = (37 * hash) + HOST_FIELD_NUMBER;
    hash = (53 * hash) + getHost().hashCode();
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage)
      POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GameSocial_Requests_ProxySocialActionMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GameSocial_Requests_ProxySocialActionMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage.class, POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage.newBuilder()
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
      action_ = 0;

      host_ = "";

      payload_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GameSocial_Requests_ProxySocialActionMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage build() {
      POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage buildPartial() {
      POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage result = new POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage(this);
      result.action_ = action_;
      result.host_ = host_;
      result.payload_ = payload_;
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
      if (other instanceof POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage other) {
      if (other == POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage.getDefaultInstance()) return this;
      if (other.getAction() != 0) {
        setAction(other.getAction());
      }
      if (!other.getHost().isEmpty()) {
        host_ = other.host_;
        onChanged();
      }
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
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
      POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int action_ ;
    /**
     * <code>uint32 action = 1;</code>
     * @return The action.
     */
    public int getAction() {
      return action_;
    }
    /**
     * <code>uint32 action = 1;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(int value) {
      
      action_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 action = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      
      action_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object host_ = "";
    /**
     * <code>string host = 2;</code>
     * @return The host.
     */
    public java.lang.String getHost() {
      java.lang.Object ref = host_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        host_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string host = 2;</code>
     * @return The bytes for host.
     */
    public com.google.protobuf.ByteString
        getHostBytes() {
      java.lang.Object ref = host_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string host = 2;</code>
     * @param value The host to set.
     * @return This builder for chaining.
     */
    public Builder setHost(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      host_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string host = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHost() {
      
      host_ = getDefaultInstance().getHost();
      onChanged();
      return this;
    }
    /**
     * <code>string host = 2;</code>
     * @param value The bytes for host to set.
     * @return This builder for chaining.
     */
    public Builder setHostBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      host_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload = 3;</code>
     * @return The payload.
     */
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <code>bytes payload = 3;</code>
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes payload = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      
      payload_ = getDefaultInstance().getPayload();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage)
  private static final POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage();
  }

  public static POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProxySocialActionMessage>
      PARSER = new com.google.protobuf.AbstractParser<ProxySocialActionMessage>() {
    @java.lang.Override
    public ProxySocialActionMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProxySocialActionMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProxySocialActionMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProxySocialActionMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Game.GameSocial.Requests.ProxySocialActionMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
