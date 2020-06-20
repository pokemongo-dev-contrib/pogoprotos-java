// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto}
 */
public  final class PlatformAcceptFriendInviteOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto)
    PlatformAcceptFriendInviteOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformAcceptFriendInviteOutProto.newBuilder() to construct.
  private PlatformAcceptFriendInviteOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformAcceptFriendInviteOutProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformAcceptFriendInviteOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformAcceptFriendInviteOutProto(
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
            POGOProtos.Rpc.PlatformPlayerSummaryProto.Builder subBuilder = null;
            if (friend_ != null) {
              subBuilder = friend_.toBuilder();
            }
            friend_ = input.readMessage(POGOProtos.Rpc.PlatformPlayerSummaryProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(friend_);
              friend_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformAcceptFriendInviteOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformAcceptFriendInviteOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto.class, POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>RESULT_UNSET = 0;</code>
     */
    RESULT_UNSET(0),
    /**
     * <code>RESULT_SUCCESS = 1;</code>
     */
    RESULT_SUCCESS(1),
    /**
     * <code>RESULT_ERROR_UNKNOWN = 2;</code>
     */
    RESULT_ERROR_UNKNOWN(2),
    /**
     * <code>RESULT_ERROR_INVITE_DOES_NOT_EXIST = 3;</code>
     */
    RESULT_ERROR_INVITE_DOES_NOT_EXIST(3),
    /**
     * <code>RESULT_ERROR_MAX_FRIENDS_LIMIT_REACHED_DELETED = 4;</code>
     */
    RESULT_ERROR_MAX_FRIENDS_LIMIT_REACHED_DELETED(4),
    /**
     * <code>RESULT_ERROR_INVITE_HAS_BEEN_CANCELLED = 5;</code>
     */
    RESULT_ERROR_INVITE_HAS_BEEN_CANCELLED(5),
    /**
     * <code>RESULT_ERROR_SENDER_HAS_MAX_FRIENDS = 6;</code>
     */
    RESULT_ERROR_SENDER_HAS_MAX_FRIENDS(6),
    /**
     * <code>RESULT_ERROR_RECEIVER_HAS_MAX_FRIENDS = 7;</code>
     */
    RESULT_ERROR_RECEIVER_HAS_MAX_FRIENDS(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>RESULT_UNSET = 0;</code>
     */
    public static final int RESULT_UNSET_VALUE = 0;
    /**
     * <code>RESULT_SUCCESS = 1;</code>
     */
    public static final int RESULT_SUCCESS_VALUE = 1;
    /**
     * <code>RESULT_ERROR_UNKNOWN = 2;</code>
     */
    public static final int RESULT_ERROR_UNKNOWN_VALUE = 2;
    /**
     * <code>RESULT_ERROR_INVITE_DOES_NOT_EXIST = 3;</code>
     */
    public static final int RESULT_ERROR_INVITE_DOES_NOT_EXIST_VALUE = 3;
    /**
     * <code>RESULT_ERROR_MAX_FRIENDS_LIMIT_REACHED_DELETED = 4;</code>
     */
    public static final int RESULT_ERROR_MAX_FRIENDS_LIMIT_REACHED_DELETED_VALUE = 4;
    /**
     * <code>RESULT_ERROR_INVITE_HAS_BEEN_CANCELLED = 5;</code>
     */
    public static final int RESULT_ERROR_INVITE_HAS_BEEN_CANCELLED_VALUE = 5;
    /**
     * <code>RESULT_ERROR_SENDER_HAS_MAX_FRIENDS = 6;</code>
     */
    public static final int RESULT_ERROR_SENDER_HAS_MAX_FRIENDS_VALUE = 6;
    /**
     * <code>RESULT_ERROR_RECEIVER_HAS_MAX_FRIENDS = 7;</code>
     */
    public static final int RESULT_ERROR_RECEIVER_HAS_MAX_FRIENDS_VALUE = 7;


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
        case 0: return RESULT_UNSET;
        case 1: return RESULT_SUCCESS;
        case 2: return RESULT_ERROR_UNKNOWN;
        case 3: return RESULT_ERROR_INVITE_DOES_NOT_EXIST;
        case 4: return RESULT_ERROR_MAX_FRIENDS_LIMIT_REACHED_DELETED;
        case 5: return RESULT_ERROR_INVITE_HAS_BEEN_CANCELLED;
        case 6: return RESULT_ERROR_SENDER_HAS_MAX_FRIENDS;
        case 7: return RESULT_ERROR_RECEIVER_HAS_MAX_FRIENDS;
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
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto.Result)
  }

  public static final int FRIEND_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.PlatformPlayerSummaryProto friend_;
  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 1;</code>
   * @return Whether the friend field is set.
   */
  public boolean hasFriend() {
    return friend_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 1;</code>
   * @return The friend.
   */
  public POGOProtos.Rpc.PlatformPlayerSummaryProto getFriend() {
    return friend_ == null ? POGOProtos.Rpc.PlatformPlayerSummaryProto.getDefaultInstance() : friend_;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 1;</code>
   */
  public POGOProtos.Rpc.PlatformPlayerSummaryProtoOrBuilder getFriendOrBuilder() {
    return getFriend();
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
    if (friend_ != null) {
      output.writeMessage(1, getFriend());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (friend_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFriend());
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto other = (POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto) obj;

    if (hasFriend() != other.hasFriend()) return false;
    if (hasFriend()) {
      if (!getFriend()
          .equals(other.getFriend())) return false;
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
    if (hasFriend()) {
      hash = (37 * hash) + FRIEND_FIELD_NUMBER;
      hash = (53 * hash) + getFriend().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto)
      POGOProtos.Rpc.PlatformAcceptFriendInviteOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformAcceptFriendInviteOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformAcceptFriendInviteOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto.class, POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto.newBuilder()
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
      if (friendBuilder_ == null) {
        friend_ = null;
      } else {
        friend_ = null;
        friendBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformAcceptFriendInviteOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto build() {
      POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto buildPartial() {
      POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto result = new POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto(this);
      if (friendBuilder_ == null) {
        result.friend_ = friend_;
      } else {
        result.friend_ = friendBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto) {
        return mergeFrom((POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto other) {
      if (other == POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto.getDefaultInstance()) return this;
      if (other.hasFriend()) {
        mergeFriend(other.getFriend());
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
      POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.PlatformPlayerSummaryProto friend_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlatformPlayerSummaryProto, POGOProtos.Rpc.PlatformPlayerSummaryProto.Builder, POGOProtos.Rpc.PlatformPlayerSummaryProtoOrBuilder> friendBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 1;</code>
     * @return Whether the friend field is set.
     */
    public boolean hasFriend() {
      return friendBuilder_ != null || friend_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 1;</code>
     * @return The friend.
     */
    public POGOProtos.Rpc.PlatformPlayerSummaryProto getFriend() {
      if (friendBuilder_ == null) {
        return friend_ == null ? POGOProtos.Rpc.PlatformPlayerSummaryProto.getDefaultInstance() : friend_;
      } else {
        return friendBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 1;</code>
     */
    public Builder setFriend(POGOProtos.Rpc.PlatformPlayerSummaryProto value) {
      if (friendBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        friend_ = value;
        onChanged();
      } else {
        friendBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 1;</code>
     */
    public Builder setFriend(
        POGOProtos.Rpc.PlatformPlayerSummaryProto.Builder builderForValue) {
      if (friendBuilder_ == null) {
        friend_ = builderForValue.build();
        onChanged();
      } else {
        friendBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 1;</code>
     */
    public Builder mergeFriend(POGOProtos.Rpc.PlatformPlayerSummaryProto value) {
      if (friendBuilder_ == null) {
        if (friend_ != null) {
          friend_ =
            POGOProtos.Rpc.PlatformPlayerSummaryProto.newBuilder(friend_).mergeFrom(value).buildPartial();
        } else {
          friend_ = value;
        }
        onChanged();
      } else {
        friendBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 1;</code>
     */
    public Builder clearFriend() {
      if (friendBuilder_ == null) {
        friend_ = null;
        onChanged();
      } else {
        friend_ = null;
        friendBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 1;</code>
     */
    public POGOProtos.Rpc.PlatformPlayerSummaryProto.Builder getFriendBuilder() {
      
      onChanged();
      return getFriendFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 1;</code>
     */
    public POGOProtos.Rpc.PlatformPlayerSummaryProtoOrBuilder getFriendOrBuilder() {
      if (friendBuilder_ != null) {
        return friendBuilder_.getMessageOrBuilder();
      } else {
        return friend_ == null ?
            POGOProtos.Rpc.PlatformPlayerSummaryProto.getDefaultInstance() : friend_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlatformPlayerSummaryProto, POGOProtos.Rpc.PlatformPlayerSummaryProto.Builder, POGOProtos.Rpc.PlatformPlayerSummaryProtoOrBuilder> 
        getFriendFieldBuilder() {
      if (friendBuilder_ == null) {
        friendBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PlatformPlayerSummaryProto, POGOProtos.Rpc.PlatformPlayerSummaryProto.Builder, POGOProtos.Rpc.PlatformPlayerSummaryProtoOrBuilder>(
                getFriend(),
                getParentForChildren(),
                isClean());
        friend_ = null;
      }
      return friendBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto)
  private static final POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto();
  }

  public static POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformAcceptFriendInviteOutProto>
      PARSER = new com.google.protobuf.AbstractParser<PlatformAcceptFriendInviteOutProto>() {
    @java.lang.Override
    public PlatformAcceptFriendInviteOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformAcceptFriendInviteOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformAcceptFriendInviteOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformAcceptFriendInviteOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

