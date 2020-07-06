// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlayerFriendDisplayProto}
 */
public  final class PlayerFriendDisplayProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlayerFriendDisplayProto)
    PlayerFriendDisplayProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayerFriendDisplayProto.newBuilder() to construct.
  private PlayerFriendDisplayProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayerFriendDisplayProto() {
    buddyPokemonNickname_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayerFriendDisplayProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlayerFriendDisplayProto(
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
            POGOProtos.Rpc.PokemonDisplayProto.Builder subBuilder = null;
            if (buddy_ != null) {
              subBuilder = buddy_.toBuilder();
            }
            buddy_ = input.readMessage(POGOProtos.Rpc.PokemonDisplayProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(buddy_);
              buddy_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            buddyDisplayPokemonId_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            buddyPokemonNickname_ = s;
            break;
          }
          case 34: {
            POGOProtos.Rpc.PokemonDisplayProto.Builder subBuilder = null;
            if (lastPokemonCaught_ != null) {
              subBuilder = lastPokemonCaught_.toBuilder();
            }
            lastPokemonCaught_ = input.readMessage(POGOProtos.Rpc.PokemonDisplayProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lastPokemonCaught_);
              lastPokemonCaught_ = subBuilder.buildPartial();
            }

            break;
          }
          case 40: {

            lastPokemonCaughtDisplayId_ = input.readInt32();
            break;
          }
          case 48: {

            lastPokemonCaughtTimestamp_ = input.readInt64();
            break;
          }
          case 56: {

            buddyCandyAwarded_ = input.readInt32();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlayerFriendDisplayProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlayerFriendDisplayProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlayerFriendDisplayProto.class, POGOProtos.Rpc.PlayerFriendDisplayProto.Builder.class);
  }

  public static final int BUDDY_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.PokemonDisplayProto buddy_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
   * @return Whether the buddy field is set.
   */
  public boolean hasBuddy() {
    return buddy_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
   * @return The buddy.
   */
  public POGOProtos.Rpc.PokemonDisplayProto getBuddy() {
    return buddy_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : buddy_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
   */
  public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getBuddyOrBuilder() {
    return getBuddy();
  }

  public static final int BUDDY_DISPLAY_POKEMON_ID_FIELD_NUMBER = 2;
  private int buddyDisplayPokemonId_;
  /**
   * <code>int32 buddy_display_pokemon_id = 2;</code>
   * @return The buddyDisplayPokemonId.
   */
  public int getBuddyDisplayPokemonId() {
    return buddyDisplayPokemonId_;
  }

  public static final int BUDDY_POKEMON_NICKNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object buddyPokemonNickname_;
  /**
   * <code>string buddy_pokemon_nickname = 3;</code>
   * @return The buddyPokemonNickname.
   */
  public java.lang.String getBuddyPokemonNickname() {
    java.lang.Object ref = buddyPokemonNickname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      buddyPokemonNickname_ = s;
      return s;
    }
  }
  /**
   * <code>string buddy_pokemon_nickname = 3;</code>
   * @return The bytes for buddyPokemonNickname.
   */
  public com.google.protobuf.ByteString
      getBuddyPokemonNicknameBytes() {
    java.lang.Object ref = buddyPokemonNickname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      buddyPokemonNickname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_POKEMON_CAUGHT_FIELD_NUMBER = 4;
  private POGOProtos.Rpc.PokemonDisplayProto lastPokemonCaught_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
   * @return Whether the lastPokemonCaught field is set.
   */
  public boolean hasLastPokemonCaught() {
    return lastPokemonCaught_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
   * @return The lastPokemonCaught.
   */
  public POGOProtos.Rpc.PokemonDisplayProto getLastPokemonCaught() {
    return lastPokemonCaught_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : lastPokemonCaught_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
   */
  public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getLastPokemonCaughtOrBuilder() {
    return getLastPokemonCaught();
  }

  public static final int LAST_POKEMON_CAUGHT_DISPLAY_ID_FIELD_NUMBER = 5;
  private int lastPokemonCaughtDisplayId_;
  /**
   * <code>int32 last_pokemon_caught_display_id = 5;</code>
   * @return The lastPokemonCaughtDisplayId.
   */
  public int getLastPokemonCaughtDisplayId() {
    return lastPokemonCaughtDisplayId_;
  }

  public static final int LAST_POKEMON_CAUGHT_TIMESTAMP_FIELD_NUMBER = 6;
  private long lastPokemonCaughtTimestamp_;
  /**
   * <code>int64 last_pokemon_caught_timestamp = 6;</code>
   * @return The lastPokemonCaughtTimestamp.
   */
  public long getLastPokemonCaughtTimestamp() {
    return lastPokemonCaughtTimestamp_;
  }

  public static final int BUDDY_CANDY_AWARDED_FIELD_NUMBER = 7;
  private int buddyCandyAwarded_;
  /**
   * <code>int32 buddy_candy_awarded = 7;</code>
   * @return The buddyCandyAwarded.
   */
  public int getBuddyCandyAwarded() {
    return buddyCandyAwarded_;
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
    if (buddy_ != null) {
      output.writeMessage(1, getBuddy());
    }
    if (buddyDisplayPokemonId_ != 0) {
      output.writeInt32(2, buddyDisplayPokemonId_);
    }
    if (!getBuddyPokemonNicknameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, buddyPokemonNickname_);
    }
    if (lastPokemonCaught_ != null) {
      output.writeMessage(4, getLastPokemonCaught());
    }
    if (lastPokemonCaughtDisplayId_ != 0) {
      output.writeInt32(5, lastPokemonCaughtDisplayId_);
    }
    if (lastPokemonCaughtTimestamp_ != 0L) {
      output.writeInt64(6, lastPokemonCaughtTimestamp_);
    }
    if (buddyCandyAwarded_ != 0) {
      output.writeInt32(7, buddyCandyAwarded_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (buddy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBuddy());
    }
    if (buddyDisplayPokemonId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, buddyDisplayPokemonId_);
    }
    if (!getBuddyPokemonNicknameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, buddyPokemonNickname_);
    }
    if (lastPokemonCaught_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getLastPokemonCaught());
    }
    if (lastPokemonCaughtDisplayId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, lastPokemonCaughtDisplayId_);
    }
    if (lastPokemonCaughtTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, lastPokemonCaughtTimestamp_);
    }
    if (buddyCandyAwarded_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, buddyCandyAwarded_);
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
    if (!(obj instanceof POGOProtos.Rpc.PlayerFriendDisplayProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlayerFriendDisplayProto other = (POGOProtos.Rpc.PlayerFriendDisplayProto) obj;

    if (hasBuddy() != other.hasBuddy()) return false;
    if (hasBuddy()) {
      if (!getBuddy()
          .equals(other.getBuddy())) return false;
    }
    if (getBuddyDisplayPokemonId()
        != other.getBuddyDisplayPokemonId()) return false;
    if (!getBuddyPokemonNickname()
        .equals(other.getBuddyPokemonNickname())) return false;
    if (hasLastPokemonCaught() != other.hasLastPokemonCaught()) return false;
    if (hasLastPokemonCaught()) {
      if (!getLastPokemonCaught()
          .equals(other.getLastPokemonCaught())) return false;
    }
    if (getLastPokemonCaughtDisplayId()
        != other.getLastPokemonCaughtDisplayId()) return false;
    if (getLastPokemonCaughtTimestamp()
        != other.getLastPokemonCaughtTimestamp()) return false;
    if (getBuddyCandyAwarded()
        != other.getBuddyCandyAwarded()) return false;
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
    if (hasBuddy()) {
      hash = (37 * hash) + BUDDY_FIELD_NUMBER;
      hash = (53 * hash) + getBuddy().hashCode();
    }
    hash = (37 * hash) + BUDDY_DISPLAY_POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBuddyDisplayPokemonId();
    hash = (37 * hash) + BUDDY_POKEMON_NICKNAME_FIELD_NUMBER;
    hash = (53 * hash) + getBuddyPokemonNickname().hashCode();
    if (hasLastPokemonCaught()) {
      hash = (37 * hash) + LAST_POKEMON_CAUGHT_FIELD_NUMBER;
      hash = (53 * hash) + getLastPokemonCaught().hashCode();
    }
    hash = (37 * hash) + LAST_POKEMON_CAUGHT_DISPLAY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLastPokemonCaughtDisplayId();
    hash = (37 * hash) + LAST_POKEMON_CAUGHT_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastPokemonCaughtTimestamp());
    hash = (37 * hash) + BUDDY_CANDY_AWARDED_FIELD_NUMBER;
    hash = (53 * hash) + getBuddyCandyAwarded();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlayerFriendDisplayProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlayerFriendDisplayProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerFriendDisplayProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlayerFriendDisplayProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerFriendDisplayProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlayerFriendDisplayProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerFriendDisplayProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlayerFriendDisplayProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerFriendDisplayProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlayerFriendDisplayProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerFriendDisplayProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlayerFriendDisplayProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlayerFriendDisplayProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlayerFriendDisplayProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlayerFriendDisplayProto)
      POGOProtos.Rpc.PlayerFriendDisplayProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlayerFriendDisplayProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlayerFriendDisplayProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlayerFriendDisplayProto.class, POGOProtos.Rpc.PlayerFriendDisplayProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlayerFriendDisplayProto.newBuilder()
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
      if (buddyBuilder_ == null) {
        buddy_ = null;
      } else {
        buddy_ = null;
        buddyBuilder_ = null;
      }
      buddyDisplayPokemonId_ = 0;

      buddyPokemonNickname_ = "";

      if (lastPokemonCaughtBuilder_ == null) {
        lastPokemonCaught_ = null;
      } else {
        lastPokemonCaught_ = null;
        lastPokemonCaughtBuilder_ = null;
      }
      lastPokemonCaughtDisplayId_ = 0;

      lastPokemonCaughtTimestamp_ = 0L;

      buddyCandyAwarded_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlayerFriendDisplayProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlayerFriendDisplayProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlayerFriendDisplayProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlayerFriendDisplayProto build() {
      POGOProtos.Rpc.PlayerFriendDisplayProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlayerFriendDisplayProto buildPartial() {
      POGOProtos.Rpc.PlayerFriendDisplayProto result = new POGOProtos.Rpc.PlayerFriendDisplayProto(this);
      if (buddyBuilder_ == null) {
        result.buddy_ = buddy_;
      } else {
        result.buddy_ = buddyBuilder_.build();
      }
      result.buddyDisplayPokemonId_ = buddyDisplayPokemonId_;
      result.buddyPokemonNickname_ = buddyPokemonNickname_;
      if (lastPokemonCaughtBuilder_ == null) {
        result.lastPokemonCaught_ = lastPokemonCaught_;
      } else {
        result.lastPokemonCaught_ = lastPokemonCaughtBuilder_.build();
      }
      result.lastPokemonCaughtDisplayId_ = lastPokemonCaughtDisplayId_;
      result.lastPokemonCaughtTimestamp_ = lastPokemonCaughtTimestamp_;
      result.buddyCandyAwarded_ = buddyCandyAwarded_;
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
      if (other instanceof POGOProtos.Rpc.PlayerFriendDisplayProto) {
        return mergeFrom((POGOProtos.Rpc.PlayerFriendDisplayProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlayerFriendDisplayProto other) {
      if (other == POGOProtos.Rpc.PlayerFriendDisplayProto.getDefaultInstance()) return this;
      if (other.hasBuddy()) {
        mergeBuddy(other.getBuddy());
      }
      if (other.getBuddyDisplayPokemonId() != 0) {
        setBuddyDisplayPokemonId(other.getBuddyDisplayPokemonId());
      }
      if (!other.getBuddyPokemonNickname().isEmpty()) {
        buddyPokemonNickname_ = other.buddyPokemonNickname_;
        onChanged();
      }
      if (other.hasLastPokemonCaught()) {
        mergeLastPokemonCaught(other.getLastPokemonCaught());
      }
      if (other.getLastPokemonCaughtDisplayId() != 0) {
        setLastPokemonCaughtDisplayId(other.getLastPokemonCaughtDisplayId());
      }
      if (other.getLastPokemonCaughtTimestamp() != 0L) {
        setLastPokemonCaughtTimestamp(other.getLastPokemonCaughtTimestamp());
      }
      if (other.getBuddyCandyAwarded() != 0) {
        setBuddyCandyAwarded(other.getBuddyCandyAwarded());
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
      POGOProtos.Rpc.PlayerFriendDisplayProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlayerFriendDisplayProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.PokemonDisplayProto buddy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> buddyBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
     * @return Whether the buddy field is set.
     */
    public boolean hasBuddy() {
      return buddyBuilder_ != null || buddy_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
     * @return The buddy.
     */
    public POGOProtos.Rpc.PokemonDisplayProto getBuddy() {
      if (buddyBuilder_ == null) {
        return buddy_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : buddy_;
      } else {
        return buddyBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
     */
    public Builder setBuddy(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (buddyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        buddy_ = value;
        onChanged();
      } else {
        buddyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
     */
    public Builder setBuddy(
        POGOProtos.Rpc.PokemonDisplayProto.Builder builderForValue) {
      if (buddyBuilder_ == null) {
        buddy_ = builderForValue.build();
        onChanged();
      } else {
        buddyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
     */
    public Builder mergeBuddy(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (buddyBuilder_ == null) {
        if (buddy_ != null) {
          buddy_ =
            POGOProtos.Rpc.PokemonDisplayProto.newBuilder(buddy_).mergeFrom(value).buildPartial();
        } else {
          buddy_ = value;
        }
        onChanged();
      } else {
        buddyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
     */
    public Builder clearBuddy() {
      if (buddyBuilder_ == null) {
        buddy_ = null;
        onChanged();
      } else {
        buddy_ = null;
        buddyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProto.Builder getBuddyBuilder() {
      
      onChanged();
      return getBuddyFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getBuddyOrBuilder() {
      if (buddyBuilder_ != null) {
        return buddyBuilder_.getMessageOrBuilder();
      } else {
        return buddy_ == null ?
            POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : buddy_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> 
        getBuddyFieldBuilder() {
      if (buddyBuilder_ == null) {
        buddyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder>(
                getBuddy(),
                getParentForChildren(),
                isClean());
        buddy_ = null;
      }
      return buddyBuilder_;
    }

    private int buddyDisplayPokemonId_ ;
    /**
     * <code>int32 buddy_display_pokemon_id = 2;</code>
     * @return The buddyDisplayPokemonId.
     */
    public int getBuddyDisplayPokemonId() {
      return buddyDisplayPokemonId_;
    }
    /**
     * <code>int32 buddy_display_pokemon_id = 2;</code>
     * @param value The buddyDisplayPokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setBuddyDisplayPokemonId(int value) {
      
      buddyDisplayPokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 buddy_display_pokemon_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuddyDisplayPokemonId() {
      
      buddyDisplayPokemonId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object buddyPokemonNickname_ = "";
    /**
     * <code>string buddy_pokemon_nickname = 3;</code>
     * @return The buddyPokemonNickname.
     */
    public java.lang.String getBuddyPokemonNickname() {
      java.lang.Object ref = buddyPokemonNickname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buddyPokemonNickname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string buddy_pokemon_nickname = 3;</code>
     * @return The bytes for buddyPokemonNickname.
     */
    public com.google.protobuf.ByteString
        getBuddyPokemonNicknameBytes() {
      java.lang.Object ref = buddyPokemonNickname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buddyPokemonNickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string buddy_pokemon_nickname = 3;</code>
     * @param value The buddyPokemonNickname to set.
     * @return This builder for chaining.
     */
    public Builder setBuddyPokemonNickname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      buddyPokemonNickname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string buddy_pokemon_nickname = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuddyPokemonNickname() {
      
      buddyPokemonNickname_ = getDefaultInstance().getBuddyPokemonNickname();
      onChanged();
      return this;
    }
    /**
     * <code>string buddy_pokemon_nickname = 3;</code>
     * @param value The bytes for buddyPokemonNickname to set.
     * @return This builder for chaining.
     */
    public Builder setBuddyPokemonNicknameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      buddyPokemonNickname_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PokemonDisplayProto lastPokemonCaught_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> lastPokemonCaughtBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
     * @return Whether the lastPokemonCaught field is set.
     */
    public boolean hasLastPokemonCaught() {
      return lastPokemonCaughtBuilder_ != null || lastPokemonCaught_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
     * @return The lastPokemonCaught.
     */
    public POGOProtos.Rpc.PokemonDisplayProto getLastPokemonCaught() {
      if (lastPokemonCaughtBuilder_ == null) {
        return lastPokemonCaught_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : lastPokemonCaught_;
      } else {
        return lastPokemonCaughtBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
     */
    public Builder setLastPokemonCaught(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (lastPokemonCaughtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastPokemonCaught_ = value;
        onChanged();
      } else {
        lastPokemonCaughtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
     */
    public Builder setLastPokemonCaught(
        POGOProtos.Rpc.PokemonDisplayProto.Builder builderForValue) {
      if (lastPokemonCaughtBuilder_ == null) {
        lastPokemonCaught_ = builderForValue.build();
        onChanged();
      } else {
        lastPokemonCaughtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
     */
    public Builder mergeLastPokemonCaught(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (lastPokemonCaughtBuilder_ == null) {
        if (lastPokemonCaught_ != null) {
          lastPokemonCaught_ =
            POGOProtos.Rpc.PokemonDisplayProto.newBuilder(lastPokemonCaught_).mergeFrom(value).buildPartial();
        } else {
          lastPokemonCaught_ = value;
        }
        onChanged();
      } else {
        lastPokemonCaughtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
     */
    public Builder clearLastPokemonCaught() {
      if (lastPokemonCaughtBuilder_ == null) {
        lastPokemonCaught_ = null;
        onChanged();
      } else {
        lastPokemonCaught_ = null;
        lastPokemonCaughtBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProto.Builder getLastPokemonCaughtBuilder() {
      
      onChanged();
      return getLastPokemonCaughtFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getLastPokemonCaughtOrBuilder() {
      if (lastPokemonCaughtBuilder_ != null) {
        return lastPokemonCaughtBuilder_.getMessageOrBuilder();
      } else {
        return lastPokemonCaught_ == null ?
            POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : lastPokemonCaught_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> 
        getLastPokemonCaughtFieldBuilder() {
      if (lastPokemonCaughtBuilder_ == null) {
        lastPokemonCaughtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder>(
                getLastPokemonCaught(),
                getParentForChildren(),
                isClean());
        lastPokemonCaught_ = null;
      }
      return lastPokemonCaughtBuilder_;
    }

    private int lastPokemonCaughtDisplayId_ ;
    /**
     * <code>int32 last_pokemon_caught_display_id = 5;</code>
     * @return The lastPokemonCaughtDisplayId.
     */
    public int getLastPokemonCaughtDisplayId() {
      return lastPokemonCaughtDisplayId_;
    }
    /**
     * <code>int32 last_pokemon_caught_display_id = 5;</code>
     * @param value The lastPokemonCaughtDisplayId to set.
     * @return This builder for chaining.
     */
    public Builder setLastPokemonCaughtDisplayId(int value) {
      
      lastPokemonCaughtDisplayId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 last_pokemon_caught_display_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastPokemonCaughtDisplayId() {
      
      lastPokemonCaughtDisplayId_ = 0;
      onChanged();
      return this;
    }

    private long lastPokemonCaughtTimestamp_ ;
    /**
     * <code>int64 last_pokemon_caught_timestamp = 6;</code>
     * @return The lastPokemonCaughtTimestamp.
     */
    public long getLastPokemonCaughtTimestamp() {
      return lastPokemonCaughtTimestamp_;
    }
    /**
     * <code>int64 last_pokemon_caught_timestamp = 6;</code>
     * @param value The lastPokemonCaughtTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setLastPokemonCaughtTimestamp(long value) {
      
      lastPokemonCaughtTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 last_pokemon_caught_timestamp = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastPokemonCaughtTimestamp() {
      
      lastPokemonCaughtTimestamp_ = 0L;
      onChanged();
      return this;
    }

    private int buddyCandyAwarded_ ;
    /**
     * <code>int32 buddy_candy_awarded = 7;</code>
     * @return The buddyCandyAwarded.
     */
    public int getBuddyCandyAwarded() {
      return buddyCandyAwarded_;
    }
    /**
     * <code>int32 buddy_candy_awarded = 7;</code>
     * @param value The buddyCandyAwarded to set.
     * @return This builder for chaining.
     */
    public Builder setBuddyCandyAwarded(int value) {
      
      buddyCandyAwarded_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 buddy_candy_awarded = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuddyCandyAwarded() {
      
      buddyCandyAwarded_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlayerFriendDisplayProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlayerFriendDisplayProto)
  private static final POGOProtos.Rpc.PlayerFriendDisplayProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlayerFriendDisplayProto();
  }

  public static POGOProtos.Rpc.PlayerFriendDisplayProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayerFriendDisplayProto>
      PARSER = new com.google.protobuf.AbstractParser<PlayerFriendDisplayProto>() {
    @java.lang.Override
    public PlayerFriendDisplayProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlayerFriendDisplayProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlayerFriendDisplayProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayerFriendDisplayProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlayerFriendDisplayProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
