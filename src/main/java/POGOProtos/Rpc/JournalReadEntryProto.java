// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.JournalReadEntryProto}
 */
public final class JournalReadEntryProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JournalReadEntryProto)
    JournalReadEntryProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JournalReadEntryProto.newBuilder() to construct.
  private JournalReadEntryProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JournalReadEntryProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JournalReadEntryProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JournalReadEntryProto(
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
            POGOProtos.Rpc.HashedKeyProto.Builder subBuilder = null;
            if (hashedKey_ != null) {
              subBuilder = hashedKey_.toBuilder();
            }
            hashedKey_ = input.readMessage(POGOProtos.Rpc.HashedKeyProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hashedKey_);
              hashedKey_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JournalReadEntryProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JournalReadEntryProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JournalReadEntryProto.class, POGOProtos.Rpc.JournalReadEntryProto.Builder.class);
  }

  public static final int HASHED_KEY_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.HashedKeyProto hashedKey_;
  /**
   * <code>.POGOProtos.Rpc.HashedKeyProto hashed_key = 1;</code>
   * @return Whether the hashedKey field is set.
   */
  @java.lang.Override
  public boolean hasHashedKey() {
    return hashedKey_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.HashedKeyProto hashed_key = 1;</code>
   * @return The hashedKey.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HashedKeyProto getHashedKey() {
    return hashedKey_ == null ? POGOProtos.Rpc.HashedKeyProto.getDefaultInstance() : hashedKey_;
  }
  /**
   * <code>.POGOProtos.Rpc.HashedKeyProto hashed_key = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.HashedKeyProtoOrBuilder getHashedKeyOrBuilder() {
    return getHashedKey();
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
    if (hashedKey_ != null) {
      output.writeMessage(1, getHashedKey());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hashedKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHashedKey());
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
    if (!(obj instanceof POGOProtos.Rpc.JournalReadEntryProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JournalReadEntryProto other = (POGOProtos.Rpc.JournalReadEntryProto) obj;

    if (hasHashedKey() != other.hasHashedKey()) return false;
    if (hasHashedKey()) {
      if (!getHashedKey()
          .equals(other.getHashedKey())) return false;
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
    if (hasHashedKey()) {
      hash = (37 * hash) + HASHED_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getHashedKey().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JournalReadEntryProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JournalReadEntryProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JournalReadEntryProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JournalReadEntryProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JournalReadEntryProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JournalReadEntryProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JournalReadEntryProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JournalReadEntryProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JournalReadEntryProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JournalReadEntryProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JournalReadEntryProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JournalReadEntryProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JournalReadEntryProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.JournalReadEntryProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JournalReadEntryProto)
      POGOProtos.Rpc.JournalReadEntryProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JournalReadEntryProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JournalReadEntryProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JournalReadEntryProto.class, POGOProtos.Rpc.JournalReadEntryProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JournalReadEntryProto.newBuilder()
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
      if (hashedKeyBuilder_ == null) {
        hashedKey_ = null;
      } else {
        hashedKey_ = null;
        hashedKeyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JournalReadEntryProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JournalReadEntryProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.JournalReadEntryProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JournalReadEntryProto build() {
      POGOProtos.Rpc.JournalReadEntryProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JournalReadEntryProto buildPartial() {
      POGOProtos.Rpc.JournalReadEntryProto result = new POGOProtos.Rpc.JournalReadEntryProto(this);
      if (hashedKeyBuilder_ == null) {
        result.hashedKey_ = hashedKey_;
      } else {
        result.hashedKey_ = hashedKeyBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.JournalReadEntryProto) {
        return mergeFrom((POGOProtos.Rpc.JournalReadEntryProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JournalReadEntryProto other) {
      if (other == POGOProtos.Rpc.JournalReadEntryProto.getDefaultInstance()) return this;
      if (other.hasHashedKey()) {
        mergeHashedKey(other.getHashedKey());
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
      POGOProtos.Rpc.JournalReadEntryProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JournalReadEntryProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.HashedKeyProto hashedKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HashedKeyProto, POGOProtos.Rpc.HashedKeyProto.Builder, POGOProtos.Rpc.HashedKeyProtoOrBuilder> hashedKeyBuilder_;
    /**
     * <code>.POGOProtos.Rpc.HashedKeyProto hashed_key = 1;</code>
     * @return Whether the hashedKey field is set.
     */
    public boolean hasHashedKey() {
      return hashedKeyBuilder_ != null || hashedKey_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.HashedKeyProto hashed_key = 1;</code>
     * @return The hashedKey.
     */
    public POGOProtos.Rpc.HashedKeyProto getHashedKey() {
      if (hashedKeyBuilder_ == null) {
        return hashedKey_ == null ? POGOProtos.Rpc.HashedKeyProto.getDefaultInstance() : hashedKey_;
      } else {
        return hashedKeyBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HashedKeyProto hashed_key = 1;</code>
     */
    public Builder setHashedKey(POGOProtos.Rpc.HashedKeyProto value) {
      if (hashedKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hashedKey_ = value;
        onChanged();
      } else {
        hashedKeyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HashedKeyProto hashed_key = 1;</code>
     */
    public Builder setHashedKey(
        POGOProtos.Rpc.HashedKeyProto.Builder builderForValue) {
      if (hashedKeyBuilder_ == null) {
        hashedKey_ = builderForValue.build();
        onChanged();
      } else {
        hashedKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HashedKeyProto hashed_key = 1;</code>
     */
    public Builder mergeHashedKey(POGOProtos.Rpc.HashedKeyProto value) {
      if (hashedKeyBuilder_ == null) {
        if (hashedKey_ != null) {
          hashedKey_ =
            POGOProtos.Rpc.HashedKeyProto.newBuilder(hashedKey_).mergeFrom(value).buildPartial();
        } else {
          hashedKey_ = value;
        }
        onChanged();
      } else {
        hashedKeyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HashedKeyProto hashed_key = 1;</code>
     */
    public Builder clearHashedKey() {
      if (hashedKeyBuilder_ == null) {
        hashedKey_ = null;
        onChanged();
      } else {
        hashedKey_ = null;
        hashedKeyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HashedKeyProto hashed_key = 1;</code>
     */
    public POGOProtos.Rpc.HashedKeyProto.Builder getHashedKeyBuilder() {
      
      onChanged();
      return getHashedKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.HashedKeyProto hashed_key = 1;</code>
     */
    public POGOProtos.Rpc.HashedKeyProtoOrBuilder getHashedKeyOrBuilder() {
      if (hashedKeyBuilder_ != null) {
        return hashedKeyBuilder_.getMessageOrBuilder();
      } else {
        return hashedKey_ == null ?
            POGOProtos.Rpc.HashedKeyProto.getDefaultInstance() : hashedKey_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HashedKeyProto hashed_key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HashedKeyProto, POGOProtos.Rpc.HashedKeyProto.Builder, POGOProtos.Rpc.HashedKeyProtoOrBuilder> 
        getHashedKeyFieldBuilder() {
      if (hashedKeyBuilder_ == null) {
        hashedKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.HashedKeyProto, POGOProtos.Rpc.HashedKeyProto.Builder, POGOProtos.Rpc.HashedKeyProtoOrBuilder>(
                getHashedKey(),
                getParentForChildren(),
                isClean());
        hashedKey_ = null;
      }
      return hashedKeyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JournalReadEntryProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JournalReadEntryProto)
  private static final POGOProtos.Rpc.JournalReadEntryProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JournalReadEntryProto();
  }

  public static POGOProtos.Rpc.JournalReadEntryProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JournalReadEntryProto>
      PARSER = new com.google.protobuf.AbstractParser<JournalReadEntryProto>() {
    @java.lang.Override
    public JournalReadEntryProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JournalReadEntryProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JournalReadEntryProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JournalReadEntryProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JournalReadEntryProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

