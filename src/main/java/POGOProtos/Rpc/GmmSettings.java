// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GmmSettings}
 */
public final class GmmSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GmmSettings)
    GmmSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GmmSettings.newBuilder() to construct.
  private GmmSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GmmSettings() {
    layerRules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GmmSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GmmSettings(
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
              layerRules_ = new java.util.ArrayList<POGOProtos.Rpc.LayerRule>();
              mutable_bitField0_ |= 0x00000001;
            }
            layerRules_.add(
                input.readMessage(POGOProtos.Rpc.LayerRule.parser(), extensionRegistry));
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
        layerRules_ = java.util.Collections.unmodifiableList(layerRules_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GmmSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GmmSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GmmSettings.class, POGOProtos.Rpc.GmmSettings.Builder.class);
  }

  public static final int LAYER_RULES_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.LayerRule> layerRules_;
  /**
   * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.LayerRule> getLayerRulesList() {
    return layerRules_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.LayerRuleOrBuilder> 
      getLayerRulesOrBuilderList() {
    return layerRules_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
   */
  @java.lang.Override
  public int getLayerRulesCount() {
    return layerRules_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LayerRule getLayerRules(int index) {
    return layerRules_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LayerRuleOrBuilder getLayerRulesOrBuilder(
      int index) {
    return layerRules_.get(index);
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
    for (int i = 0; i < layerRules_.size(); i++) {
      output.writeMessage(1, layerRules_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < layerRules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, layerRules_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.GmmSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GmmSettings other = (POGOProtos.Rpc.GmmSettings) obj;

    if (!getLayerRulesList()
        .equals(other.getLayerRulesList())) return false;
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
    if (getLayerRulesCount() > 0) {
      hash = (37 * hash) + LAYER_RULES_FIELD_NUMBER;
      hash = (53 * hash) + getLayerRulesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GmmSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GmmSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GmmSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GmmSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GmmSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GmmSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GmmSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GmmSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GmmSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GmmSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GmmSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GmmSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GmmSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GmmSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GmmSettings)
      POGOProtos.Rpc.GmmSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GmmSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GmmSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GmmSettings.class, POGOProtos.Rpc.GmmSettings.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GmmSettings.newBuilder()
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
        getLayerRulesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (layerRulesBuilder_ == null) {
        layerRules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        layerRulesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GmmSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GmmSettings getDefaultInstanceForType() {
      return POGOProtos.Rpc.GmmSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GmmSettings build() {
      POGOProtos.Rpc.GmmSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GmmSettings buildPartial() {
      POGOProtos.Rpc.GmmSettings result = new POGOProtos.Rpc.GmmSettings(this);
      int from_bitField0_ = bitField0_;
      if (layerRulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          layerRules_ = java.util.Collections.unmodifiableList(layerRules_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.layerRules_ = layerRules_;
      } else {
        result.layerRules_ = layerRulesBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.GmmSettings) {
        return mergeFrom((POGOProtos.Rpc.GmmSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GmmSettings other) {
      if (other == POGOProtos.Rpc.GmmSettings.getDefaultInstance()) return this;
      if (layerRulesBuilder_ == null) {
        if (!other.layerRules_.isEmpty()) {
          if (layerRules_.isEmpty()) {
            layerRules_ = other.layerRules_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLayerRulesIsMutable();
            layerRules_.addAll(other.layerRules_);
          }
          onChanged();
        }
      } else {
        if (!other.layerRules_.isEmpty()) {
          if (layerRulesBuilder_.isEmpty()) {
            layerRulesBuilder_.dispose();
            layerRulesBuilder_ = null;
            layerRules_ = other.layerRules_;
            bitField0_ = (bitField0_ & ~0x00000001);
            layerRulesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLayerRulesFieldBuilder() : null;
          } else {
            layerRulesBuilder_.addAllMessages(other.layerRules_);
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
      POGOProtos.Rpc.GmmSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GmmSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.LayerRule> layerRules_ =
      java.util.Collections.emptyList();
    private void ensureLayerRulesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        layerRules_ = new java.util.ArrayList<POGOProtos.Rpc.LayerRule>(layerRules_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.LayerRule, POGOProtos.Rpc.LayerRule.Builder, POGOProtos.Rpc.LayerRuleOrBuilder> layerRulesBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.LayerRule> getLayerRulesList() {
      if (layerRulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(layerRules_);
      } else {
        return layerRulesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public int getLayerRulesCount() {
      if (layerRulesBuilder_ == null) {
        return layerRules_.size();
      } else {
        return layerRulesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public POGOProtos.Rpc.LayerRule getLayerRules(int index) {
      if (layerRulesBuilder_ == null) {
        return layerRules_.get(index);
      } else {
        return layerRulesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public Builder setLayerRules(
        int index, POGOProtos.Rpc.LayerRule value) {
      if (layerRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLayerRulesIsMutable();
        layerRules_.set(index, value);
        onChanged();
      } else {
        layerRulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public Builder setLayerRules(
        int index, POGOProtos.Rpc.LayerRule.Builder builderForValue) {
      if (layerRulesBuilder_ == null) {
        ensureLayerRulesIsMutable();
        layerRules_.set(index, builderForValue.build());
        onChanged();
      } else {
        layerRulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public Builder addLayerRules(POGOProtos.Rpc.LayerRule value) {
      if (layerRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLayerRulesIsMutable();
        layerRules_.add(value);
        onChanged();
      } else {
        layerRulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public Builder addLayerRules(
        int index, POGOProtos.Rpc.LayerRule value) {
      if (layerRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLayerRulesIsMutable();
        layerRules_.add(index, value);
        onChanged();
      } else {
        layerRulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public Builder addLayerRules(
        POGOProtos.Rpc.LayerRule.Builder builderForValue) {
      if (layerRulesBuilder_ == null) {
        ensureLayerRulesIsMutable();
        layerRules_.add(builderForValue.build());
        onChanged();
      } else {
        layerRulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public Builder addLayerRules(
        int index, POGOProtos.Rpc.LayerRule.Builder builderForValue) {
      if (layerRulesBuilder_ == null) {
        ensureLayerRulesIsMutable();
        layerRules_.add(index, builderForValue.build());
        onChanged();
      } else {
        layerRulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public Builder addAllLayerRules(
        java.lang.Iterable<? extends POGOProtos.Rpc.LayerRule> values) {
      if (layerRulesBuilder_ == null) {
        ensureLayerRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, layerRules_);
        onChanged();
      } else {
        layerRulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public Builder clearLayerRules() {
      if (layerRulesBuilder_ == null) {
        layerRules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        layerRulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public Builder removeLayerRules(int index) {
      if (layerRulesBuilder_ == null) {
        ensureLayerRulesIsMutable();
        layerRules_.remove(index);
        onChanged();
      } else {
        layerRulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public POGOProtos.Rpc.LayerRule.Builder getLayerRulesBuilder(
        int index) {
      return getLayerRulesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public POGOProtos.Rpc.LayerRuleOrBuilder getLayerRulesOrBuilder(
        int index) {
      if (layerRulesBuilder_ == null) {
        return layerRules_.get(index);  } else {
        return layerRulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.LayerRuleOrBuilder> 
         getLayerRulesOrBuilderList() {
      if (layerRulesBuilder_ != null) {
        return layerRulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(layerRules_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public POGOProtos.Rpc.LayerRule.Builder addLayerRulesBuilder() {
      return getLayerRulesFieldBuilder().addBuilder(
          POGOProtos.Rpc.LayerRule.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public POGOProtos.Rpc.LayerRule.Builder addLayerRulesBuilder(
        int index) {
      return getLayerRulesFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.LayerRule.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LayerRule layer_rules = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.LayerRule.Builder> 
         getLayerRulesBuilderList() {
      return getLayerRulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.LayerRule, POGOProtos.Rpc.LayerRule.Builder, POGOProtos.Rpc.LayerRuleOrBuilder> 
        getLayerRulesFieldBuilder() {
      if (layerRulesBuilder_ == null) {
        layerRulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.LayerRule, POGOProtos.Rpc.LayerRule.Builder, POGOProtos.Rpc.LayerRuleOrBuilder>(
                layerRules_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        layerRules_ = null;
      }
      return layerRulesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GmmSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GmmSettings)
  private static final POGOProtos.Rpc.GmmSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GmmSettings();
  }

  public static POGOProtos.Rpc.GmmSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GmmSettings>
      PARSER = new com.google.protobuf.AbstractParser<GmmSettings>() {
    @java.lang.Override
    public GmmSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GmmSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GmmSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GmmSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GmmSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
