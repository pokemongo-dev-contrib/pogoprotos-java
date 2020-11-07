// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BattlePartiesProto}
 */
public final class BattlePartiesProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BattlePartiesProto)
    BattlePartiesProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BattlePartiesProto.newBuilder() to construct.
  private BattlePartiesProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BattlePartiesProto() {
    battleParties_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BattlePartiesProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BattlePartiesProto(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              battleParties_ = new java.util.ArrayList<POGOProtos.Rpc.BattlePartyProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            battleParties_.add(
                input.readMessage(POGOProtos.Rpc.BattlePartyProto.parser(), extensionRegistry));
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
        battleParties_ = java.util.Collections.unmodifiableList(battleParties_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattlePartiesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattlePartiesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BattlePartiesProto.class, POGOProtos.Rpc.BattlePartiesProto.Builder.class);
  }

  public static final int BATTLE_PARTIES_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.BattlePartyProto> battleParties_;
  /**
   * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.BattlePartyProto> getBattlePartiesList() {
    return battleParties_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.BattlePartyProtoOrBuilder> 
      getBattlePartiesOrBuilderList() {
    return battleParties_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
   */
  @java.lang.Override
  public int getBattlePartiesCount() {
    return battleParties_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BattlePartyProto getBattleParties(int index) {
    return battleParties_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BattlePartyProtoOrBuilder getBattlePartiesOrBuilder(
      int index) {
    return battleParties_.get(index);
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
    for (int i = 0; i < battleParties_.size(); i++) {
      output.writeMessage(1, battleParties_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < battleParties_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, battleParties_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.BattlePartiesProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BattlePartiesProto other = (POGOProtos.Rpc.BattlePartiesProto) obj;

    if (!getBattlePartiesList()
        .equals(other.getBattlePartiesList())) return false;
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
    if (getBattlePartiesCount() > 0) {
      hash = (37 * hash) + BATTLE_PARTIES_FIELD_NUMBER;
      hash = (53 * hash) + getBattlePartiesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BattlePartiesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BattlePartiesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattlePartiesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BattlePartiesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattlePartiesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BattlePartiesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattlePartiesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BattlePartiesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattlePartiesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BattlePartiesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BattlePartiesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BattlePartiesProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BattlePartiesProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BattlePartiesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BattlePartiesProto)
      POGOProtos.Rpc.BattlePartiesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattlePartiesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattlePartiesProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BattlePartiesProto.class, POGOProtos.Rpc.BattlePartiesProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BattlePartiesProto.newBuilder()
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
        getBattlePartiesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (battlePartiesBuilder_ == null) {
        battleParties_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        battlePartiesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BattlePartiesProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BattlePartiesProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.BattlePartiesProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BattlePartiesProto build() {
      POGOProtos.Rpc.BattlePartiesProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BattlePartiesProto buildPartial() {
      POGOProtos.Rpc.BattlePartiesProto result = new POGOProtos.Rpc.BattlePartiesProto(this);
      int from_bitField0_ = bitField0_;
      if (battlePartiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          battleParties_ = java.util.Collections.unmodifiableList(battleParties_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.battleParties_ = battleParties_;
      } else {
        result.battleParties_ = battlePartiesBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.BattlePartiesProto) {
        return mergeFrom((POGOProtos.Rpc.BattlePartiesProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BattlePartiesProto other) {
      if (other == POGOProtos.Rpc.BattlePartiesProto.getDefaultInstance()) return this;
      if (battlePartiesBuilder_ == null) {
        if (!other.battleParties_.isEmpty()) {
          if (battleParties_.isEmpty()) {
            battleParties_ = other.battleParties_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBattlePartiesIsMutable();
            battleParties_.addAll(other.battleParties_);
          }
          onChanged();
        }
      } else {
        if (!other.battleParties_.isEmpty()) {
          if (battlePartiesBuilder_.isEmpty()) {
            battlePartiesBuilder_.dispose();
            battlePartiesBuilder_ = null;
            battleParties_ = other.battleParties_;
            bitField0_ = (bitField0_ & ~0x00000001);
            battlePartiesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBattlePartiesFieldBuilder() : null;
          } else {
            battlePartiesBuilder_.addAllMessages(other.battleParties_);
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
      POGOProtos.Rpc.BattlePartiesProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BattlePartiesProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.BattlePartyProto> battleParties_ =
      java.util.Collections.emptyList();
    private void ensureBattlePartiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        battleParties_ = new java.util.ArrayList<POGOProtos.Rpc.BattlePartyProto>(battleParties_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.BattlePartyProto, POGOProtos.Rpc.BattlePartyProto.Builder, POGOProtos.Rpc.BattlePartyProtoOrBuilder> battlePartiesBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.BattlePartyProto> getBattlePartiesList() {
      if (battlePartiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(battleParties_);
      } else {
        return battlePartiesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public int getBattlePartiesCount() {
      if (battlePartiesBuilder_ == null) {
        return battleParties_.size();
      } else {
        return battlePartiesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public POGOProtos.Rpc.BattlePartyProto getBattleParties(int index) {
      if (battlePartiesBuilder_ == null) {
        return battleParties_.get(index);
      } else {
        return battlePartiesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public Builder setBattleParties(
        int index, POGOProtos.Rpc.BattlePartyProto value) {
      if (battlePartiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBattlePartiesIsMutable();
        battleParties_.set(index, value);
        onChanged();
      } else {
        battlePartiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public Builder setBattleParties(
        int index, POGOProtos.Rpc.BattlePartyProto.Builder builderForValue) {
      if (battlePartiesBuilder_ == null) {
        ensureBattlePartiesIsMutable();
        battleParties_.set(index, builderForValue.build());
        onChanged();
      } else {
        battlePartiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public Builder addBattleParties(POGOProtos.Rpc.BattlePartyProto value) {
      if (battlePartiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBattlePartiesIsMutable();
        battleParties_.add(value);
        onChanged();
      } else {
        battlePartiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public Builder addBattleParties(
        int index, POGOProtos.Rpc.BattlePartyProto value) {
      if (battlePartiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBattlePartiesIsMutable();
        battleParties_.add(index, value);
        onChanged();
      } else {
        battlePartiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public Builder addBattleParties(
        POGOProtos.Rpc.BattlePartyProto.Builder builderForValue) {
      if (battlePartiesBuilder_ == null) {
        ensureBattlePartiesIsMutable();
        battleParties_.add(builderForValue.build());
        onChanged();
      } else {
        battlePartiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public Builder addBattleParties(
        int index, POGOProtos.Rpc.BattlePartyProto.Builder builderForValue) {
      if (battlePartiesBuilder_ == null) {
        ensureBattlePartiesIsMutable();
        battleParties_.add(index, builderForValue.build());
        onChanged();
      } else {
        battlePartiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public Builder addAllBattleParties(
        java.lang.Iterable<? extends POGOProtos.Rpc.BattlePartyProto> values) {
      if (battlePartiesBuilder_ == null) {
        ensureBattlePartiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, battleParties_);
        onChanged();
      } else {
        battlePartiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public Builder clearBattleParties() {
      if (battlePartiesBuilder_ == null) {
        battleParties_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        battlePartiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public Builder removeBattleParties(int index) {
      if (battlePartiesBuilder_ == null) {
        ensureBattlePartiesIsMutable();
        battleParties_.remove(index);
        onChanged();
      } else {
        battlePartiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public POGOProtos.Rpc.BattlePartyProto.Builder getBattlePartiesBuilder(
        int index) {
      return getBattlePartiesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public POGOProtos.Rpc.BattlePartyProtoOrBuilder getBattlePartiesOrBuilder(
        int index) {
      if (battlePartiesBuilder_ == null) {
        return battleParties_.get(index);  } else {
        return battlePartiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.BattlePartyProtoOrBuilder> 
         getBattlePartiesOrBuilderList() {
      if (battlePartiesBuilder_ != null) {
        return battlePartiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(battleParties_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public POGOProtos.Rpc.BattlePartyProto.Builder addBattlePartiesBuilder() {
      return getBattlePartiesFieldBuilder().addBuilder(
          POGOProtos.Rpc.BattlePartyProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public POGOProtos.Rpc.BattlePartyProto.Builder addBattlePartiesBuilder(
        int index) {
      return getBattlePartiesFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.BattlePartyProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BattlePartyProto battle_parties = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.BattlePartyProto.Builder> 
         getBattlePartiesBuilderList() {
      return getBattlePartiesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.BattlePartyProto, POGOProtos.Rpc.BattlePartyProto.Builder, POGOProtos.Rpc.BattlePartyProtoOrBuilder> 
        getBattlePartiesFieldBuilder() {
      if (battlePartiesBuilder_ == null) {
        battlePartiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.BattlePartyProto, POGOProtos.Rpc.BattlePartyProto.Builder, POGOProtos.Rpc.BattlePartyProtoOrBuilder>(
                battleParties_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        battleParties_ = null;
      }
      return battlePartiesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BattlePartiesProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BattlePartiesProto)
  private static final POGOProtos.Rpc.BattlePartiesProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BattlePartiesProto();
  }

  public static POGOProtos.Rpc.BattlePartiesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BattlePartiesProto>
      PARSER = new com.google.protobuf.AbstractParser<BattlePartiesProto>() {
    @java.lang.Override
    public BattlePartiesProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BattlePartiesProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BattlePartiesProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BattlePartiesProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BattlePartiesProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

