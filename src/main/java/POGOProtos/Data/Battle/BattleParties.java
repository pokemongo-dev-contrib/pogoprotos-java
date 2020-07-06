// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Battle/BattleParties.proto

package POGOProtos.Data.Battle;

/**
 * Protobuf type {@code POGOProtos.Data.Battle.BattleParties}
 */
public  final class BattleParties extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Battle.BattleParties)
    BattlePartiesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BattleParties.newBuilder() to construct.
  private BattleParties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BattleParties() {
    battleParties_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BattleParties();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BattleParties(
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
              battleParties_ = new java.util.ArrayList<POGOProtos.Data.Battle.BattleParty>();
              mutable_bitField0_ |= 0x00000001;
            }
            battleParties_.add(
                input.readMessage(POGOProtos.Data.Battle.BattleParty.parser(), extensionRegistry));
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
    return POGOProtos.Data.Battle.BattlePartiesOuterClass.internal_static_POGOProtos_Data_Battle_BattleParties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Battle.BattlePartiesOuterClass.internal_static_POGOProtos_Data_Battle_BattleParties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Battle.BattleParties.class, POGOProtos.Data.Battle.BattleParties.Builder.class);
  }

  public static final int BATTLE_PARTIES_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Data.Battle.BattleParty> battleParties_;
  /**
   * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
   */
  public java.util.List<POGOProtos.Data.Battle.BattleParty> getBattlePartiesList() {
    return battleParties_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
   */
  public java.util.List<? extends POGOProtos.Data.Battle.BattlePartyOrBuilder> 
      getBattlePartiesOrBuilderList() {
    return battleParties_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
   */
  public int getBattlePartiesCount() {
    return battleParties_.size();
  }
  /**
   * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
   */
  public POGOProtos.Data.Battle.BattleParty getBattleParties(int index) {
    return battleParties_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
   */
  public POGOProtos.Data.Battle.BattlePartyOrBuilder getBattlePartiesOrBuilder(
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
    if (!(obj instanceof POGOProtos.Data.Battle.BattleParties)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Battle.BattleParties other = (POGOProtos.Data.Battle.BattleParties) obj;

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

  public static POGOProtos.Data.Battle.BattleParties parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Battle.BattleParties parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Battle.BattleParties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Battle.BattleParties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Battle.BattleParties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Battle.BattleParties parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Battle.BattleParties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Battle.BattleParties parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Battle.BattleParties parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Battle.BattleParties parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Battle.BattleParties parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Battle.BattleParties parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Battle.BattleParties prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Battle.BattleParties}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Battle.BattleParties)
      POGOProtos.Data.Battle.BattlePartiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Battle.BattlePartiesOuterClass.internal_static_POGOProtos_Data_Battle_BattleParties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Battle.BattlePartiesOuterClass.internal_static_POGOProtos_Data_Battle_BattleParties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Battle.BattleParties.class, POGOProtos.Data.Battle.BattleParties.Builder.class);
    }

    // Construct using POGOProtos.Data.Battle.BattleParties.newBuilder()
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
      return POGOProtos.Data.Battle.BattlePartiesOuterClass.internal_static_POGOProtos_Data_Battle_BattleParties_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Battle.BattleParties getDefaultInstanceForType() {
      return POGOProtos.Data.Battle.BattleParties.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Battle.BattleParties build() {
      POGOProtos.Data.Battle.BattleParties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Battle.BattleParties buildPartial() {
      POGOProtos.Data.Battle.BattleParties result = new POGOProtos.Data.Battle.BattleParties(this);
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
      if (other instanceof POGOProtos.Data.Battle.BattleParties) {
        return mergeFrom((POGOProtos.Data.Battle.BattleParties)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Battle.BattleParties other) {
      if (other == POGOProtos.Data.Battle.BattleParties.getDefaultInstance()) return this;
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
      POGOProtos.Data.Battle.BattleParties parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Battle.BattleParties) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Data.Battle.BattleParty> battleParties_ =
      java.util.Collections.emptyList();
    private void ensureBattlePartiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        battleParties_ = new java.util.ArrayList<POGOProtos.Data.Battle.BattleParty>(battleParties_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Battle.BattleParty, POGOProtos.Data.Battle.BattleParty.Builder, POGOProtos.Data.Battle.BattlePartyOrBuilder> battlePartiesBuilder_;

    /**
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public java.util.List<POGOProtos.Data.Battle.BattleParty> getBattlePartiesList() {
      if (battlePartiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(battleParties_);
      } else {
        return battlePartiesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public int getBattlePartiesCount() {
      if (battlePartiesBuilder_ == null) {
        return battleParties_.size();
      } else {
        return battlePartiesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public POGOProtos.Data.Battle.BattleParty getBattleParties(int index) {
      if (battlePartiesBuilder_ == null) {
        return battleParties_.get(index);
      } else {
        return battlePartiesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public Builder setBattleParties(
        int index, POGOProtos.Data.Battle.BattleParty value) {
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
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public Builder setBattleParties(
        int index, POGOProtos.Data.Battle.BattleParty.Builder builderForValue) {
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
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public Builder addBattleParties(POGOProtos.Data.Battle.BattleParty value) {
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
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public Builder addBattleParties(
        int index, POGOProtos.Data.Battle.BattleParty value) {
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
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public Builder addBattleParties(
        POGOProtos.Data.Battle.BattleParty.Builder builderForValue) {
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
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public Builder addBattleParties(
        int index, POGOProtos.Data.Battle.BattleParty.Builder builderForValue) {
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
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public Builder addAllBattleParties(
        java.lang.Iterable<? extends POGOProtos.Data.Battle.BattleParty> values) {
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
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
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
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
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
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public POGOProtos.Data.Battle.BattleParty.Builder getBattlePartiesBuilder(
        int index) {
      return getBattlePartiesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public POGOProtos.Data.Battle.BattlePartyOrBuilder getBattlePartiesOrBuilder(
        int index) {
      if (battlePartiesBuilder_ == null) {
        return battleParties_.get(index);  } else {
        return battlePartiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Data.Battle.BattlePartyOrBuilder> 
         getBattlePartiesOrBuilderList() {
      if (battlePartiesBuilder_ != null) {
        return battlePartiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(battleParties_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public POGOProtos.Data.Battle.BattleParty.Builder addBattlePartiesBuilder() {
      return getBattlePartiesFieldBuilder().addBuilder(
          POGOProtos.Data.Battle.BattleParty.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public POGOProtos.Data.Battle.BattleParty.Builder addBattlePartiesBuilder(
        int index) {
      return getBattlePartiesFieldBuilder().addBuilder(
          index, POGOProtos.Data.Battle.BattleParty.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Battle.BattleParty battle_parties = 1;</code>
     */
    public java.util.List<POGOProtos.Data.Battle.BattleParty.Builder> 
         getBattlePartiesBuilderList() {
      return getBattlePartiesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Battle.BattleParty, POGOProtos.Data.Battle.BattleParty.Builder, POGOProtos.Data.Battle.BattlePartyOrBuilder> 
        getBattlePartiesFieldBuilder() {
      if (battlePartiesBuilder_ == null) {
        battlePartiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Data.Battle.BattleParty, POGOProtos.Data.Battle.BattleParty.Builder, POGOProtos.Data.Battle.BattlePartyOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Battle.BattleParties)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Battle.BattleParties)
  private static final POGOProtos.Data.Battle.BattleParties DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Battle.BattleParties();
  }

  public static POGOProtos.Data.Battle.BattleParties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BattleParties>
      PARSER = new com.google.protobuf.AbstractParser<BattleParties>() {
    @java.lang.Override
    public BattleParties parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BattleParties(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BattleParties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BattleParties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Battle.BattleParties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
