// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto}
 */
public final class UpdateBreadcrumbHistoryRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto)
    UpdateBreadcrumbHistoryRequestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateBreadcrumbHistoryRequestProto.newBuilder() to construct.
  private UpdateBreadcrumbHistoryRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateBreadcrumbHistoryRequestProto() {
    sessionContext_ = "";
    breadcrumbHistory_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateBreadcrumbHistoryRequestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateBreadcrumbHistoryRequestProto(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sessionContext_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              breadcrumbHistory_ = new java.util.ArrayList<POGOProtos.Rpc.BreadcrumbRecordProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            breadcrumbHistory_.add(
                input.readMessage(POGOProtos.Rpc.BreadcrumbRecordProto.parser(), extensionRegistry));
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
        breadcrumbHistory_ = java.util.Collections.unmodifiableList(breadcrumbHistory_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpdateBreadcrumbHistoryRequestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpdateBreadcrumbHistoryRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto.class, POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto.Builder.class);
  }

  public static final int SESSION_CONTEXT_FIELD_NUMBER = 1;
  private volatile java.lang.Object sessionContext_;
  /**
   * <code>string session_context = 1;</code>
   * @return The sessionContext.
   */
  @java.lang.Override
  public java.lang.String getSessionContext() {
    java.lang.Object ref = sessionContext_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionContext_ = s;
      return s;
    }
  }
  /**
   * <code>string session_context = 1;</code>
   * @return The bytes for sessionContext.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSessionContextBytes() {
    java.lang.Object ref = sessionContext_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionContext_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BREADCRUMB_HISTORY_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.BreadcrumbRecordProto> breadcrumbHistory_;
  /**
   * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.BreadcrumbRecordProto> getBreadcrumbHistoryList() {
    return breadcrumbHistory_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.BreadcrumbRecordProtoOrBuilder> 
      getBreadcrumbHistoryOrBuilderList() {
    return breadcrumbHistory_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
   */
  @java.lang.Override
  public int getBreadcrumbHistoryCount() {
    return breadcrumbHistory_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BreadcrumbRecordProto getBreadcrumbHistory(int index) {
    return breadcrumbHistory_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BreadcrumbRecordProtoOrBuilder getBreadcrumbHistoryOrBuilder(
      int index) {
    return breadcrumbHistory_.get(index);
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
    if (!getSessionContextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sessionContext_);
    }
    for (int i = 0; i < breadcrumbHistory_.size(); i++) {
      output.writeMessage(2, breadcrumbHistory_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSessionContextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sessionContext_);
    }
    for (int i = 0; i < breadcrumbHistory_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, breadcrumbHistory_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto other = (POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto) obj;

    if (!getSessionContext()
        .equals(other.getSessionContext())) return false;
    if (!getBreadcrumbHistoryList()
        .equals(other.getBreadcrumbHistoryList())) return false;
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
    hash = (37 * hash) + SESSION_CONTEXT_FIELD_NUMBER;
    hash = (53 * hash) + getSessionContext().hashCode();
    if (getBreadcrumbHistoryCount() > 0) {
      hash = (37 * hash) + BREADCRUMB_HISTORY_FIELD_NUMBER;
      hash = (53 * hash) + getBreadcrumbHistoryList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto)
      POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpdateBreadcrumbHistoryRequestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpdateBreadcrumbHistoryRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto.class, POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto.newBuilder()
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
        getBreadcrumbHistoryFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sessionContext_ = "";

      if (breadcrumbHistoryBuilder_ == null) {
        breadcrumbHistory_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        breadcrumbHistoryBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpdateBreadcrumbHistoryRequestProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto build() {
      POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto buildPartial() {
      POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto result = new POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto(this);
      int from_bitField0_ = bitField0_;
      result.sessionContext_ = sessionContext_;
      if (breadcrumbHistoryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          breadcrumbHistory_ = java.util.Collections.unmodifiableList(breadcrumbHistory_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.breadcrumbHistory_ = breadcrumbHistory_;
      } else {
        result.breadcrumbHistory_ = breadcrumbHistoryBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto) {
        return mergeFrom((POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto other) {
      if (other == POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto.getDefaultInstance()) return this;
      if (!other.getSessionContext().isEmpty()) {
        sessionContext_ = other.sessionContext_;
        onChanged();
      }
      if (breadcrumbHistoryBuilder_ == null) {
        if (!other.breadcrumbHistory_.isEmpty()) {
          if (breadcrumbHistory_.isEmpty()) {
            breadcrumbHistory_ = other.breadcrumbHistory_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBreadcrumbHistoryIsMutable();
            breadcrumbHistory_.addAll(other.breadcrumbHistory_);
          }
          onChanged();
        }
      } else {
        if (!other.breadcrumbHistory_.isEmpty()) {
          if (breadcrumbHistoryBuilder_.isEmpty()) {
            breadcrumbHistoryBuilder_.dispose();
            breadcrumbHistoryBuilder_ = null;
            breadcrumbHistory_ = other.breadcrumbHistory_;
            bitField0_ = (bitField0_ & ~0x00000001);
            breadcrumbHistoryBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBreadcrumbHistoryFieldBuilder() : null;
          } else {
            breadcrumbHistoryBuilder_.addAllMessages(other.breadcrumbHistory_);
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
      POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object sessionContext_ = "";
    /**
     * <code>string session_context = 1;</code>
     * @return The sessionContext.
     */
    public java.lang.String getSessionContext() {
      java.lang.Object ref = sessionContext_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionContext_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string session_context = 1;</code>
     * @return The bytes for sessionContext.
     */
    public com.google.protobuf.ByteString
        getSessionContextBytes() {
      java.lang.Object ref = sessionContext_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionContext_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string session_context = 1;</code>
     * @param value The sessionContext to set.
     * @return This builder for chaining.
     */
    public Builder setSessionContext(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionContext_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string session_context = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionContext() {
      
      sessionContext_ = getDefaultInstance().getSessionContext();
      onChanged();
      return this;
    }
    /**
     * <code>string session_context = 1;</code>
     * @param value The bytes for sessionContext to set.
     * @return This builder for chaining.
     */
    public Builder setSessionContextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionContext_ = value;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.BreadcrumbRecordProto> breadcrumbHistory_ =
      java.util.Collections.emptyList();
    private void ensureBreadcrumbHistoryIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        breadcrumbHistory_ = new java.util.ArrayList<POGOProtos.Rpc.BreadcrumbRecordProto>(breadcrumbHistory_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.BreadcrumbRecordProto, POGOProtos.Rpc.BreadcrumbRecordProto.Builder, POGOProtos.Rpc.BreadcrumbRecordProtoOrBuilder> breadcrumbHistoryBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.BreadcrumbRecordProto> getBreadcrumbHistoryList() {
      if (breadcrumbHistoryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(breadcrumbHistory_);
      } else {
        return breadcrumbHistoryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public int getBreadcrumbHistoryCount() {
      if (breadcrumbHistoryBuilder_ == null) {
        return breadcrumbHistory_.size();
      } else {
        return breadcrumbHistoryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public POGOProtos.Rpc.BreadcrumbRecordProto getBreadcrumbHistory(int index) {
      if (breadcrumbHistoryBuilder_ == null) {
        return breadcrumbHistory_.get(index);
      } else {
        return breadcrumbHistoryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public Builder setBreadcrumbHistory(
        int index, POGOProtos.Rpc.BreadcrumbRecordProto value) {
      if (breadcrumbHistoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBreadcrumbHistoryIsMutable();
        breadcrumbHistory_.set(index, value);
        onChanged();
      } else {
        breadcrumbHistoryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public Builder setBreadcrumbHistory(
        int index, POGOProtos.Rpc.BreadcrumbRecordProto.Builder builderForValue) {
      if (breadcrumbHistoryBuilder_ == null) {
        ensureBreadcrumbHistoryIsMutable();
        breadcrumbHistory_.set(index, builderForValue.build());
        onChanged();
      } else {
        breadcrumbHistoryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public Builder addBreadcrumbHistory(POGOProtos.Rpc.BreadcrumbRecordProto value) {
      if (breadcrumbHistoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBreadcrumbHistoryIsMutable();
        breadcrumbHistory_.add(value);
        onChanged();
      } else {
        breadcrumbHistoryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public Builder addBreadcrumbHistory(
        int index, POGOProtos.Rpc.BreadcrumbRecordProto value) {
      if (breadcrumbHistoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBreadcrumbHistoryIsMutable();
        breadcrumbHistory_.add(index, value);
        onChanged();
      } else {
        breadcrumbHistoryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public Builder addBreadcrumbHistory(
        POGOProtos.Rpc.BreadcrumbRecordProto.Builder builderForValue) {
      if (breadcrumbHistoryBuilder_ == null) {
        ensureBreadcrumbHistoryIsMutable();
        breadcrumbHistory_.add(builderForValue.build());
        onChanged();
      } else {
        breadcrumbHistoryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public Builder addBreadcrumbHistory(
        int index, POGOProtos.Rpc.BreadcrumbRecordProto.Builder builderForValue) {
      if (breadcrumbHistoryBuilder_ == null) {
        ensureBreadcrumbHistoryIsMutable();
        breadcrumbHistory_.add(index, builderForValue.build());
        onChanged();
      } else {
        breadcrumbHistoryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public Builder addAllBreadcrumbHistory(
        java.lang.Iterable<? extends POGOProtos.Rpc.BreadcrumbRecordProto> values) {
      if (breadcrumbHistoryBuilder_ == null) {
        ensureBreadcrumbHistoryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, breadcrumbHistory_);
        onChanged();
      } else {
        breadcrumbHistoryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public Builder clearBreadcrumbHistory() {
      if (breadcrumbHistoryBuilder_ == null) {
        breadcrumbHistory_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        breadcrumbHistoryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public Builder removeBreadcrumbHistory(int index) {
      if (breadcrumbHistoryBuilder_ == null) {
        ensureBreadcrumbHistoryIsMutable();
        breadcrumbHistory_.remove(index);
        onChanged();
      } else {
        breadcrumbHistoryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public POGOProtos.Rpc.BreadcrumbRecordProto.Builder getBreadcrumbHistoryBuilder(
        int index) {
      return getBreadcrumbHistoryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public POGOProtos.Rpc.BreadcrumbRecordProtoOrBuilder getBreadcrumbHistoryOrBuilder(
        int index) {
      if (breadcrumbHistoryBuilder_ == null) {
        return breadcrumbHistory_.get(index);  } else {
        return breadcrumbHistoryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.BreadcrumbRecordProtoOrBuilder> 
         getBreadcrumbHistoryOrBuilderList() {
      if (breadcrumbHistoryBuilder_ != null) {
        return breadcrumbHistoryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(breadcrumbHistory_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public POGOProtos.Rpc.BreadcrumbRecordProto.Builder addBreadcrumbHistoryBuilder() {
      return getBreadcrumbHistoryFieldBuilder().addBuilder(
          POGOProtos.Rpc.BreadcrumbRecordProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public POGOProtos.Rpc.BreadcrumbRecordProto.Builder addBreadcrumbHistoryBuilder(
        int index) {
      return getBreadcrumbHistoryFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.BreadcrumbRecordProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BreadcrumbRecordProto breadcrumb_history = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.BreadcrumbRecordProto.Builder> 
         getBreadcrumbHistoryBuilderList() {
      return getBreadcrumbHistoryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.BreadcrumbRecordProto, POGOProtos.Rpc.BreadcrumbRecordProto.Builder, POGOProtos.Rpc.BreadcrumbRecordProtoOrBuilder> 
        getBreadcrumbHistoryFieldBuilder() {
      if (breadcrumbHistoryBuilder_ == null) {
        breadcrumbHistoryBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.BreadcrumbRecordProto, POGOProtos.Rpc.BreadcrumbRecordProto.Builder, POGOProtos.Rpc.BreadcrumbRecordProtoOrBuilder>(
                breadcrumbHistory_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        breadcrumbHistory_ = null;
      }
      return breadcrumbHistoryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto)
  private static final POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto();
  }

  public static POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateBreadcrumbHistoryRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<UpdateBreadcrumbHistoryRequestProto>() {
    @java.lang.Override
    public UpdateBreadcrumbHistoryRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateBreadcrumbHistoryRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateBreadcrumbHistoryRequestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateBreadcrumbHistoryRequestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.UpdateBreadcrumbHistoryRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

