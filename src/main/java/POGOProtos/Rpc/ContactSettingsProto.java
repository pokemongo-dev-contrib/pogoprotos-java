// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ContactSettingsProto}
 */
public final class ContactSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ContactSettingsProto)
    ContactSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContactSettingsProto.newBuilder() to construct.
  private ContactSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContactSettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContactSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ContactSettingsProto(
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

            sendMarketingEmails_ = input.readBool();
            break;
          }
          case 16: {

            sendPushNotifications_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ContactSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ContactSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ContactSettingsProto.class, POGOProtos.Rpc.ContactSettingsProto.Builder.class);
  }

  public static final int SEND_MARKETING_EMAILS_FIELD_NUMBER = 1;
  private boolean sendMarketingEmails_;
  /**
   * <code>bool send_marketing_emails = 1;</code>
   * @return The sendMarketingEmails.
   */
  @java.lang.Override
  public boolean getSendMarketingEmails() {
    return sendMarketingEmails_;
  }

  public static final int SEND_PUSH_NOTIFICATIONS_FIELD_NUMBER = 2;
  private boolean sendPushNotifications_;
  /**
   * <code>bool send_push_notifications = 2;</code>
   * @return The sendPushNotifications.
   */
  @java.lang.Override
  public boolean getSendPushNotifications() {
    return sendPushNotifications_;
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
    if (sendMarketingEmails_ != false) {
      output.writeBool(1, sendMarketingEmails_);
    }
    if (sendPushNotifications_ != false) {
      output.writeBool(2, sendPushNotifications_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sendMarketingEmails_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, sendMarketingEmails_);
    }
    if (sendPushNotifications_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, sendPushNotifications_);
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
    if (!(obj instanceof POGOProtos.Rpc.ContactSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ContactSettingsProto other = (POGOProtos.Rpc.ContactSettingsProto) obj;

    if (getSendMarketingEmails()
        != other.getSendMarketingEmails()) return false;
    if (getSendPushNotifications()
        != other.getSendPushNotifications()) return false;
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
    hash = (37 * hash) + SEND_MARKETING_EMAILS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSendMarketingEmails());
    hash = (37 * hash) + SEND_PUSH_NOTIFICATIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSendPushNotifications());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ContactSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ContactSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ContactSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ContactSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ContactSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ContactSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ContactSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ContactSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ContactSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ContactSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ContactSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ContactSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ContactSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ContactSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ContactSettingsProto)
      POGOProtos.Rpc.ContactSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ContactSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ContactSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ContactSettingsProto.class, POGOProtos.Rpc.ContactSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ContactSettingsProto.newBuilder()
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
      sendMarketingEmails_ = false;

      sendPushNotifications_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ContactSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ContactSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.ContactSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ContactSettingsProto build() {
      POGOProtos.Rpc.ContactSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ContactSettingsProto buildPartial() {
      POGOProtos.Rpc.ContactSettingsProto result = new POGOProtos.Rpc.ContactSettingsProto(this);
      result.sendMarketingEmails_ = sendMarketingEmails_;
      result.sendPushNotifications_ = sendPushNotifications_;
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
      if (other instanceof POGOProtos.Rpc.ContactSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.ContactSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ContactSettingsProto other) {
      if (other == POGOProtos.Rpc.ContactSettingsProto.getDefaultInstance()) return this;
      if (other.getSendMarketingEmails() != false) {
        setSendMarketingEmails(other.getSendMarketingEmails());
      }
      if (other.getSendPushNotifications() != false) {
        setSendPushNotifications(other.getSendPushNotifications());
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
      POGOProtos.Rpc.ContactSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ContactSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean sendMarketingEmails_ ;
    /**
     * <code>bool send_marketing_emails = 1;</code>
     * @return The sendMarketingEmails.
     */
    @java.lang.Override
    public boolean getSendMarketingEmails() {
      return sendMarketingEmails_;
    }
    /**
     * <code>bool send_marketing_emails = 1;</code>
     * @param value The sendMarketingEmails to set.
     * @return This builder for chaining.
     */
    public Builder setSendMarketingEmails(boolean value) {
      
      sendMarketingEmails_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool send_marketing_emails = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSendMarketingEmails() {
      
      sendMarketingEmails_ = false;
      onChanged();
      return this;
    }

    private boolean sendPushNotifications_ ;
    /**
     * <code>bool send_push_notifications = 2;</code>
     * @return The sendPushNotifications.
     */
    @java.lang.Override
    public boolean getSendPushNotifications() {
      return sendPushNotifications_;
    }
    /**
     * <code>bool send_push_notifications = 2;</code>
     * @param value The sendPushNotifications to set.
     * @return This builder for chaining.
     */
    public Builder setSendPushNotifications(boolean value) {
      
      sendPushNotifications_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool send_push_notifications = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSendPushNotifications() {
      
      sendPushNotifications_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ContactSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ContactSettingsProto)
  private static final POGOProtos.Rpc.ContactSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ContactSettingsProto();
  }

  public static POGOProtos.Rpc.ContactSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContactSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<ContactSettingsProto>() {
    @java.lang.Override
    public ContactSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ContactSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ContactSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContactSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ContactSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

