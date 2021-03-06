// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetPlayerProto}
 */
public final class GetPlayerProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetPlayerProto)
    GetPlayerProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPlayerProto.newBuilder() to construct.
  private GetPlayerProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPlayerProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPlayerProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetPlayerProto(
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
            POGOProtos.Rpc.PlayerLocaleProto.Builder subBuilder = null;
            if (playerLocale_ != null) {
              subBuilder = playerLocale_.toBuilder();
            }
            playerLocale_ = input.readMessage(POGOProtos.Rpc.PlayerLocaleProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(playerLocale_);
              playerLocale_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            preventCreation_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetPlayerProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetPlayerProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetPlayerProto.class, POGOProtos.Rpc.GetPlayerProto.Builder.class);
  }

  public static final int PLAYER_LOCALE_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.PlayerLocaleProto playerLocale_;
  /**
   * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
   * @return Whether the playerLocale field is set.
   */
  @java.lang.Override
  public boolean hasPlayerLocale() {
    return playerLocale_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
   * @return The playerLocale.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlayerLocaleProto getPlayerLocale() {
    return playerLocale_ == null ? POGOProtos.Rpc.PlayerLocaleProto.getDefaultInstance() : playerLocale_;
  }
  /**
   * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlayerLocaleProtoOrBuilder getPlayerLocaleOrBuilder() {
    return getPlayerLocale();
  }

  public static final int PREVENT_CREATION_FIELD_NUMBER = 2;
  private boolean preventCreation_;
  /**
   * <code>bool prevent_creation = 2;</code>
   * @return The preventCreation.
   */
  @java.lang.Override
  public boolean getPreventCreation() {
    return preventCreation_;
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
    if (playerLocale_ != null) {
      output.writeMessage(1, getPlayerLocale());
    }
    if (preventCreation_ != false) {
      output.writeBool(2, preventCreation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (playerLocale_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPlayerLocale());
    }
    if (preventCreation_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, preventCreation_);
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
    if (!(obj instanceof POGOProtos.Rpc.GetPlayerProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetPlayerProto other = (POGOProtos.Rpc.GetPlayerProto) obj;

    if (hasPlayerLocale() != other.hasPlayerLocale()) return false;
    if (hasPlayerLocale()) {
      if (!getPlayerLocale()
          .equals(other.getPlayerLocale())) return false;
    }
    if (getPreventCreation()
        != other.getPreventCreation()) return false;
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
    if (hasPlayerLocale()) {
      hash = (37 * hash) + PLAYER_LOCALE_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerLocale().hashCode();
    }
    hash = (37 * hash) + PREVENT_CREATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPreventCreation());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetPlayerProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetPlayerProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetPlayerProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetPlayerProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetPlayerProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetPlayerProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetPlayerProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetPlayerProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetPlayerProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetPlayerProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetPlayerProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetPlayerProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetPlayerProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetPlayerProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetPlayerProto)
      POGOProtos.Rpc.GetPlayerProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetPlayerProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetPlayerProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetPlayerProto.class, POGOProtos.Rpc.GetPlayerProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetPlayerProto.newBuilder()
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
      if (playerLocaleBuilder_ == null) {
        playerLocale_ = null;
      } else {
        playerLocale_ = null;
        playerLocaleBuilder_ = null;
      }
      preventCreation_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetPlayerProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetPlayerProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetPlayerProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetPlayerProto build() {
      POGOProtos.Rpc.GetPlayerProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetPlayerProto buildPartial() {
      POGOProtos.Rpc.GetPlayerProto result = new POGOProtos.Rpc.GetPlayerProto(this);
      if (playerLocaleBuilder_ == null) {
        result.playerLocale_ = playerLocale_;
      } else {
        result.playerLocale_ = playerLocaleBuilder_.build();
      }
      result.preventCreation_ = preventCreation_;
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
      if (other instanceof POGOProtos.Rpc.GetPlayerProto) {
        return mergeFrom((POGOProtos.Rpc.GetPlayerProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetPlayerProto other) {
      if (other == POGOProtos.Rpc.GetPlayerProto.getDefaultInstance()) return this;
      if (other.hasPlayerLocale()) {
        mergePlayerLocale(other.getPlayerLocale());
      }
      if (other.getPreventCreation() != false) {
        setPreventCreation(other.getPreventCreation());
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
      POGOProtos.Rpc.GetPlayerProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetPlayerProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.PlayerLocaleProto playerLocale_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlayerLocaleProto, POGOProtos.Rpc.PlayerLocaleProto.Builder, POGOProtos.Rpc.PlayerLocaleProtoOrBuilder> playerLocaleBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
     * @return Whether the playerLocale field is set.
     */
    public boolean hasPlayerLocale() {
      return playerLocaleBuilder_ != null || playerLocale_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
     * @return The playerLocale.
     */
    public POGOProtos.Rpc.PlayerLocaleProto getPlayerLocale() {
      if (playerLocaleBuilder_ == null) {
        return playerLocale_ == null ? POGOProtos.Rpc.PlayerLocaleProto.getDefaultInstance() : playerLocale_;
      } else {
        return playerLocaleBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
     */
    public Builder setPlayerLocale(POGOProtos.Rpc.PlayerLocaleProto value) {
      if (playerLocaleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        playerLocale_ = value;
        onChanged();
      } else {
        playerLocaleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
     */
    public Builder setPlayerLocale(
        POGOProtos.Rpc.PlayerLocaleProto.Builder builderForValue) {
      if (playerLocaleBuilder_ == null) {
        playerLocale_ = builderForValue.build();
        onChanged();
      } else {
        playerLocaleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
     */
    public Builder mergePlayerLocale(POGOProtos.Rpc.PlayerLocaleProto value) {
      if (playerLocaleBuilder_ == null) {
        if (playerLocale_ != null) {
          playerLocale_ =
            POGOProtos.Rpc.PlayerLocaleProto.newBuilder(playerLocale_).mergeFrom(value).buildPartial();
        } else {
          playerLocale_ = value;
        }
        onChanged();
      } else {
        playerLocaleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
     */
    public Builder clearPlayerLocale() {
      if (playerLocaleBuilder_ == null) {
        playerLocale_ = null;
        onChanged();
      } else {
        playerLocale_ = null;
        playerLocaleBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
     */
    public POGOProtos.Rpc.PlayerLocaleProto.Builder getPlayerLocaleBuilder() {
      
      onChanged();
      return getPlayerLocaleFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
     */
    public POGOProtos.Rpc.PlayerLocaleProtoOrBuilder getPlayerLocaleOrBuilder() {
      if (playerLocaleBuilder_ != null) {
        return playerLocaleBuilder_.getMessageOrBuilder();
      } else {
        return playerLocale_ == null ?
            POGOProtos.Rpc.PlayerLocaleProto.getDefaultInstance() : playerLocale_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlayerLocaleProto, POGOProtos.Rpc.PlayerLocaleProto.Builder, POGOProtos.Rpc.PlayerLocaleProtoOrBuilder> 
        getPlayerLocaleFieldBuilder() {
      if (playerLocaleBuilder_ == null) {
        playerLocaleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PlayerLocaleProto, POGOProtos.Rpc.PlayerLocaleProto.Builder, POGOProtos.Rpc.PlayerLocaleProtoOrBuilder>(
                getPlayerLocale(),
                getParentForChildren(),
                isClean());
        playerLocale_ = null;
      }
      return playerLocaleBuilder_;
    }

    private boolean preventCreation_ ;
    /**
     * <code>bool prevent_creation = 2;</code>
     * @return The preventCreation.
     */
    @java.lang.Override
    public boolean getPreventCreation() {
      return preventCreation_;
    }
    /**
     * <code>bool prevent_creation = 2;</code>
     * @param value The preventCreation to set.
     * @return This builder for chaining.
     */
    public Builder setPreventCreation(boolean value) {
      
      preventCreation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool prevent_creation = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPreventCreation() {
      
      preventCreation_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetPlayerProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetPlayerProto)
  private static final POGOProtos.Rpc.GetPlayerProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetPlayerProto();
  }

  public static POGOProtos.Rpc.GetPlayerProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPlayerProto>
      PARSER = new com.google.protobuf.AbstractParser<GetPlayerProto>() {
    @java.lang.Override
    public GetPlayerProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetPlayerProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetPlayerProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPlayerProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetPlayerProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

