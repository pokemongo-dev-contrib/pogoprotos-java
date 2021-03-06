// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.SocialTelemetry}
 */
public final class SocialTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.SocialTelemetry)
    SocialTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SocialTelemetry.newBuilder() to construct.
  private SocialTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SocialTelemetry() {
    socialClickId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SocialTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SocialTelemetry(
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

            socialClickId_ = rawValue;
            break;
          }
          case 16: {

            pagesScrolledInFriendsList_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SocialTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SocialTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.SocialTelemetry.class, POGOProtos.Rpc.SocialTelemetry.Builder.class);
  }

  public static final int SOCIAL_CLICK_ID_FIELD_NUMBER = 1;
  private int socialClickId_;
  /**
   * <code>.POGOProtos.Rpc.SocialTelemetryIds social_click_id = 1;</code>
   * @return The enum numeric value on the wire for socialClickId.
   */
  @java.lang.Override public int getSocialClickIdValue() {
    return socialClickId_;
  }
  /**
   * <code>.POGOProtos.Rpc.SocialTelemetryIds social_click_id = 1;</code>
   * @return The socialClickId.
   */
  @java.lang.Override public POGOProtos.Rpc.SocialTelemetryIds getSocialClickId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.SocialTelemetryIds result = POGOProtos.Rpc.SocialTelemetryIds.valueOf(socialClickId_);
    return result == null ? POGOProtos.Rpc.SocialTelemetryIds.UNRECOGNIZED : result;
  }

  public static final int PAGES_SCROLLED_IN_FRIENDS_LIST_FIELD_NUMBER = 2;
  private int pagesScrolledInFriendsList_;
  /**
   * <code>int32 pages_scrolled_in_friends_list = 2;</code>
   * @return The pagesScrolledInFriendsList.
   */
  @java.lang.Override
  public int getPagesScrolledInFriendsList() {
    return pagesScrolledInFriendsList_;
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
    if (socialClickId_ != POGOProtos.Rpc.SocialTelemetryIds.SOCIAL_TELEMETRY_IDS_UNDEFINED_SOCIAL.getNumber()) {
      output.writeEnum(1, socialClickId_);
    }
    if (pagesScrolledInFriendsList_ != 0) {
      output.writeInt32(2, pagesScrolledInFriendsList_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (socialClickId_ != POGOProtos.Rpc.SocialTelemetryIds.SOCIAL_TELEMETRY_IDS_UNDEFINED_SOCIAL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, socialClickId_);
    }
    if (pagesScrolledInFriendsList_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pagesScrolledInFriendsList_);
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
    if (!(obj instanceof POGOProtos.Rpc.SocialTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.SocialTelemetry other = (POGOProtos.Rpc.SocialTelemetry) obj;

    if (socialClickId_ != other.socialClickId_) return false;
    if (getPagesScrolledInFriendsList()
        != other.getPagesScrolledInFriendsList()) return false;
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
    hash = (37 * hash) + SOCIAL_CLICK_ID_FIELD_NUMBER;
    hash = (53 * hash) + socialClickId_;
    hash = (37 * hash) + PAGES_SCROLLED_IN_FRIENDS_LIST_FIELD_NUMBER;
    hash = (53 * hash) + getPagesScrolledInFriendsList();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.SocialTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SocialTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SocialTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SocialTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SocialTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SocialTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SocialTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SocialTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SocialTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SocialTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SocialTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SocialTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.SocialTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.SocialTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.SocialTelemetry)
      POGOProtos.Rpc.SocialTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SocialTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SocialTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.SocialTelemetry.class, POGOProtos.Rpc.SocialTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.SocialTelemetry.newBuilder()
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
      socialClickId_ = 0;

      pagesScrolledInFriendsList_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SocialTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SocialTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.SocialTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.SocialTelemetry build() {
      POGOProtos.Rpc.SocialTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SocialTelemetry buildPartial() {
      POGOProtos.Rpc.SocialTelemetry result = new POGOProtos.Rpc.SocialTelemetry(this);
      result.socialClickId_ = socialClickId_;
      result.pagesScrolledInFriendsList_ = pagesScrolledInFriendsList_;
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
      if (other instanceof POGOProtos.Rpc.SocialTelemetry) {
        return mergeFrom((POGOProtos.Rpc.SocialTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.SocialTelemetry other) {
      if (other == POGOProtos.Rpc.SocialTelemetry.getDefaultInstance()) return this;
      if (other.socialClickId_ != 0) {
        setSocialClickIdValue(other.getSocialClickIdValue());
      }
      if (other.getPagesScrolledInFriendsList() != 0) {
        setPagesScrolledInFriendsList(other.getPagesScrolledInFriendsList());
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
      POGOProtos.Rpc.SocialTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.SocialTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int socialClickId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.SocialTelemetryIds social_click_id = 1;</code>
     * @return The enum numeric value on the wire for socialClickId.
     */
    @java.lang.Override public int getSocialClickIdValue() {
      return socialClickId_;
    }
    /**
     * <code>.POGOProtos.Rpc.SocialTelemetryIds social_click_id = 1;</code>
     * @param value The enum numeric value on the wire for socialClickId to set.
     * @return This builder for chaining.
     */
    public Builder setSocialClickIdValue(int value) {
      
      socialClickId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.SocialTelemetryIds social_click_id = 1;</code>
     * @return The socialClickId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.SocialTelemetryIds getSocialClickId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.SocialTelemetryIds result = POGOProtos.Rpc.SocialTelemetryIds.valueOf(socialClickId_);
      return result == null ? POGOProtos.Rpc.SocialTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.SocialTelemetryIds social_click_id = 1;</code>
     * @param value The socialClickId to set.
     * @return This builder for chaining.
     */
    public Builder setSocialClickId(POGOProtos.Rpc.SocialTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      socialClickId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.SocialTelemetryIds social_click_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSocialClickId() {
      
      socialClickId_ = 0;
      onChanged();
      return this;
    }

    private int pagesScrolledInFriendsList_ ;
    /**
     * <code>int32 pages_scrolled_in_friends_list = 2;</code>
     * @return The pagesScrolledInFriendsList.
     */
    @java.lang.Override
    public int getPagesScrolledInFriendsList() {
      return pagesScrolledInFriendsList_;
    }
    /**
     * <code>int32 pages_scrolled_in_friends_list = 2;</code>
     * @param value The pagesScrolledInFriendsList to set.
     * @return This builder for chaining.
     */
    public Builder setPagesScrolledInFriendsList(int value) {
      
      pagesScrolledInFriendsList_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pages_scrolled_in_friends_list = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPagesScrolledInFriendsList() {
      
      pagesScrolledInFriendsList_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.SocialTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.SocialTelemetry)
  private static final POGOProtos.Rpc.SocialTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.SocialTelemetry();
  }

  public static POGOProtos.Rpc.SocialTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SocialTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<SocialTelemetry>() {
    @java.lang.Override
    public SocialTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SocialTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SocialTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SocialTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.SocialTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

