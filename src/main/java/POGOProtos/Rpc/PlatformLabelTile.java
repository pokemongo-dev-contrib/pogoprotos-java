// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformLabelTile}
 */
public final class PlatformLabelTile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformLabelTile)
    PlatformLabelTileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformLabelTile.newBuilder() to construct.
  private PlatformLabelTile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformLabelTile() {
    labels_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformLabelTile();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformLabelTile(
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
              labels_ = new java.util.ArrayList<POGOProtos.Rpc.PlatformLabel>();
              mutable_bitField0_ |= 0x00000001;
            }
            labels_.add(
                input.readMessage(POGOProtos.Rpc.PlatformLabel.parser(), extensionRegistry));
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
        labels_ = java.util.Collections.unmodifiableList(labels_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformLabelTile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformLabelTile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformLabelTile.class, POGOProtos.Rpc.PlatformLabelTile.Builder.class);
  }

  public static final int LABELS_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.PlatformLabel> labels_;
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.PlatformLabel> getLabelsList() {
    return labels_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.PlatformLabelOrBuilder> 
      getLabelsOrBuilderList() {
    return labels_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
   */
  @java.lang.Override
  public int getLabelsCount() {
    return labels_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlatformLabel getLabels(int index) {
    return labels_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlatformLabelOrBuilder getLabelsOrBuilder(
      int index) {
    return labels_.get(index);
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
    for (int i = 0; i < labels_.size(); i++) {
      output.writeMessage(1, labels_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < labels_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, labels_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformLabelTile)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformLabelTile other = (POGOProtos.Rpc.PlatformLabelTile) obj;

    if (!getLabelsList()
        .equals(other.getLabelsList())) return false;
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
    if (getLabelsCount() > 0) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + getLabelsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformLabelTile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformLabelTile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformLabelTile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformLabelTile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformLabelTile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformLabelTile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformLabelTile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformLabelTile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformLabelTile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformLabelTile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformLabelTile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformLabelTile parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformLabelTile prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformLabelTile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformLabelTile)
      POGOProtos.Rpc.PlatformLabelTileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformLabelTile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformLabelTile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformLabelTile.class, POGOProtos.Rpc.PlatformLabelTile.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformLabelTile.newBuilder()
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
        getLabelsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (labelsBuilder_ == null) {
        labels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        labelsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlatformLabelTile_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformLabelTile getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformLabelTile.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformLabelTile build() {
      POGOProtos.Rpc.PlatformLabelTile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformLabelTile buildPartial() {
      POGOProtos.Rpc.PlatformLabelTile result = new POGOProtos.Rpc.PlatformLabelTile(this);
      int from_bitField0_ = bitField0_;
      if (labelsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          labels_ = java.util.Collections.unmodifiableList(labels_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.labels_ = labels_;
      } else {
        result.labels_ = labelsBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PlatformLabelTile) {
        return mergeFrom((POGOProtos.Rpc.PlatformLabelTile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformLabelTile other) {
      if (other == POGOProtos.Rpc.PlatformLabelTile.getDefaultInstance()) return this;
      if (labelsBuilder_ == null) {
        if (!other.labels_.isEmpty()) {
          if (labels_.isEmpty()) {
            labels_ = other.labels_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLabelsIsMutable();
            labels_.addAll(other.labels_);
          }
          onChanged();
        }
      } else {
        if (!other.labels_.isEmpty()) {
          if (labelsBuilder_.isEmpty()) {
            labelsBuilder_.dispose();
            labelsBuilder_ = null;
            labels_ = other.labels_;
            bitField0_ = (bitField0_ & ~0x00000001);
            labelsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLabelsFieldBuilder() : null;
          } else {
            labelsBuilder_.addAllMessages(other.labels_);
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
      POGOProtos.Rpc.PlatformLabelTile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformLabelTile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.PlatformLabel> labels_ =
      java.util.Collections.emptyList();
    private void ensureLabelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        labels_ = new java.util.ArrayList<POGOProtos.Rpc.PlatformLabel>(labels_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PlatformLabel, POGOProtos.Rpc.PlatformLabel.Builder, POGOProtos.Rpc.PlatformLabelOrBuilder> labelsBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.PlatformLabel> getLabelsList() {
      if (labelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(labels_);
      } else {
        return labelsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public int getLabelsCount() {
      if (labelsBuilder_ == null) {
        return labels_.size();
      } else {
        return labelsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public POGOProtos.Rpc.PlatformLabel getLabels(int index) {
      if (labelsBuilder_ == null) {
        return labels_.get(index);
      } else {
        return labelsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public Builder setLabels(
        int index, POGOProtos.Rpc.PlatformLabel value) {
      if (labelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelsIsMutable();
        labels_.set(index, value);
        onChanged();
      } else {
        labelsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public Builder setLabels(
        int index, POGOProtos.Rpc.PlatformLabel.Builder builderForValue) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        labels_.set(index, builderForValue.build());
        onChanged();
      } else {
        labelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public Builder addLabels(POGOProtos.Rpc.PlatformLabel value) {
      if (labelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelsIsMutable();
        labels_.add(value);
        onChanged();
      } else {
        labelsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public Builder addLabels(
        int index, POGOProtos.Rpc.PlatformLabel value) {
      if (labelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelsIsMutable();
        labels_.add(index, value);
        onChanged();
      } else {
        labelsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public Builder addLabels(
        POGOProtos.Rpc.PlatformLabel.Builder builderForValue) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        labels_.add(builderForValue.build());
        onChanged();
      } else {
        labelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public Builder addLabels(
        int index, POGOProtos.Rpc.PlatformLabel.Builder builderForValue) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        labels_.add(index, builderForValue.build());
        onChanged();
      } else {
        labelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public Builder addAllLabels(
        java.lang.Iterable<? extends POGOProtos.Rpc.PlatformLabel> values) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, labels_);
        onChanged();
      } else {
        labelsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public Builder clearLabels() {
      if (labelsBuilder_ == null) {
        labels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        labelsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public Builder removeLabels(int index) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        labels_.remove(index);
        onChanged();
      } else {
        labelsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public POGOProtos.Rpc.PlatformLabel.Builder getLabelsBuilder(
        int index) {
      return getLabelsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public POGOProtos.Rpc.PlatformLabelOrBuilder getLabelsOrBuilder(
        int index) {
      if (labelsBuilder_ == null) {
        return labels_.get(index);  } else {
        return labelsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.PlatformLabelOrBuilder> 
         getLabelsOrBuilderList() {
      if (labelsBuilder_ != null) {
        return labelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(labels_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public POGOProtos.Rpc.PlatformLabel.Builder addLabelsBuilder() {
      return getLabelsFieldBuilder().addBuilder(
          POGOProtos.Rpc.PlatformLabel.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public POGOProtos.Rpc.PlatformLabel.Builder addLabelsBuilder(
        int index) {
      return getLabelsFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.PlatformLabel.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlatformLabel labels = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.PlatformLabel.Builder> 
         getLabelsBuilderList() {
      return getLabelsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.PlatformLabel, POGOProtos.Rpc.PlatformLabel.Builder, POGOProtos.Rpc.PlatformLabelOrBuilder> 
        getLabelsFieldBuilder() {
      if (labelsBuilder_ == null) {
        labelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.PlatformLabel, POGOProtos.Rpc.PlatformLabel.Builder, POGOProtos.Rpc.PlatformLabelOrBuilder>(
                labels_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        labels_ = null;
      }
      return labelsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformLabelTile)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformLabelTile)
  private static final POGOProtos.Rpc.PlatformLabelTile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformLabelTile();
  }

  public static POGOProtos.Rpc.PlatformLabelTile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformLabelTile>
      PARSER = new com.google.protobuf.AbstractParser<PlatformLabelTile>() {
    @java.lang.Override
    public PlatformLabelTile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformLabelTile(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformLabelTile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformLabelTile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformLabelTile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

