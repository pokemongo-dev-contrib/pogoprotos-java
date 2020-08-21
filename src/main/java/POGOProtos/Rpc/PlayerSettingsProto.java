// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Niantic.Platform.Protos.PlayerSettingsProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PlayerSettingsProto}
 */
public final class PlayerSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlayerSettingsProto)
    PlayerSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayerSettingsProto.newBuilder() to construct.
  private PlayerSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayerSettingsProto() {
    completedTutorials_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayerSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlayerSettingsProto(
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
          case 8: {

            optOutOnlineStatus_ = input.readBool();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              completedTutorials_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            completedTutorials_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                completedTutorials_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              completedTutorials_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
        completedTutorials_ = java.util.Collections.unmodifiableList(completedTutorials_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlayerSettingsProto.class, POGOProtos.Rpc.PlayerSettingsProto.Builder.class);
  }

  public static final int OPT_OUT_ONLINE_STATUS_FIELD_NUMBER = 1;
  private boolean optOutOnlineStatus_;
  /**
   * <code>bool opt_out_online_status = 1;</code>
   * @return The optOutOnlineStatus.
   */
  @java.lang.Override
  public boolean getOptOutOnlineStatus() {
    return optOutOnlineStatus_;
  }

  public static final int COMPLETED_TUTORIALS_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> completedTutorials_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.SocialSettings.TutorialType> completedTutorials_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.SocialSettings.TutorialType>() {
            public POGOProtos.Rpc.SocialSettings.TutorialType convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.SocialSettings.TutorialType result = POGOProtos.Rpc.SocialSettings.TutorialType.valueOf(from);
              return result == null ? POGOProtos.Rpc.SocialSettings.TutorialType.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
   * @return A list containing the completedTutorials.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.SocialSettings.TutorialType> getCompletedTutorialsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.SocialSettings.TutorialType>(completedTutorials_, completedTutorials_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
   * @return The count of completedTutorials.
   */
  @java.lang.Override
  public int getCompletedTutorialsCount() {
    return completedTutorials_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
   * @param index The index of the element to return.
   * @return The completedTutorials at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.SocialSettings.TutorialType getCompletedTutorials(int index) {
    return completedTutorials_converter_.convert(completedTutorials_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
   * @return A list containing the enum numeric values on the wire for completedTutorials.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getCompletedTutorialsValueList() {
    return completedTutorials_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of completedTutorials at the given index.
   */
  @java.lang.Override
  public int getCompletedTutorialsValue(int index) {
    return completedTutorials_.get(index);
  }
  private int completedTutorialsMemoizedSerializedSize;

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
    getSerializedSize();
    if (optOutOnlineStatus_ != false) {
      output.writeBool(1, optOutOnlineStatus_);
    }
    if (getCompletedTutorialsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(completedTutorialsMemoizedSerializedSize);
    }
    for (int i = 0; i < completedTutorials_.size(); i++) {
      output.writeEnumNoTag(completedTutorials_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (optOutOnlineStatus_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, optOutOnlineStatus_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < completedTutorials_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(completedTutorials_.get(i));
      }
      size += dataSize;
      if (!getCompletedTutorialsList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }completedTutorialsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.PlayerSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlayerSettingsProto other = (POGOProtos.Rpc.PlayerSettingsProto) obj;

    if (getOptOutOnlineStatus()
        != other.getOptOutOnlineStatus()) return false;
    if (!completedTutorials_.equals(other.completedTutorials_)) return false;
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
    hash = (37 * hash) + OPT_OUT_ONLINE_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOptOutOnlineStatus());
    if (getCompletedTutorialsCount() > 0) {
      hash = (37 * hash) + COMPLETED_TUTORIALS_FIELD_NUMBER;
      hash = (53 * hash) + completedTutorials_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlayerSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlayerSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlayerSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlayerSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlayerSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlayerSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlayerSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlayerSettingsProto prototype) {
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
   * <pre>
   * ref: Niantic.Platform.Protos.PlayerSettingsProto
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PlayerSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlayerSettingsProto)
      POGOProtos.Rpc.PlayerSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlayerSettingsProto.class, POGOProtos.Rpc.PlayerSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlayerSettingsProto.newBuilder()
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
      optOutOnlineStatus_ = false;

      completedTutorials_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlayerSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlayerSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlayerSettingsProto build() {
      POGOProtos.Rpc.PlayerSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlayerSettingsProto buildPartial() {
      POGOProtos.Rpc.PlayerSettingsProto result = new POGOProtos.Rpc.PlayerSettingsProto(this);
      int from_bitField0_ = bitField0_;
      result.optOutOnlineStatus_ = optOutOnlineStatus_;
      if (((bitField0_ & 0x00000001) != 0)) {
        completedTutorials_ = java.util.Collections.unmodifiableList(completedTutorials_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.completedTutorials_ = completedTutorials_;
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
      if (other instanceof POGOProtos.Rpc.PlayerSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.PlayerSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlayerSettingsProto other) {
      if (other == POGOProtos.Rpc.PlayerSettingsProto.getDefaultInstance()) return this;
      if (other.getOptOutOnlineStatus() != false) {
        setOptOutOnlineStatus(other.getOptOutOnlineStatus());
      }
      if (!other.completedTutorials_.isEmpty()) {
        if (completedTutorials_.isEmpty()) {
          completedTutorials_ = other.completedTutorials_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCompletedTutorialsIsMutable();
          completedTutorials_.addAll(other.completedTutorials_);
        }
        onChanged();
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
      POGOProtos.Rpc.PlayerSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlayerSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean optOutOnlineStatus_ ;
    /**
     * <code>bool opt_out_online_status = 1;</code>
     * @return The optOutOnlineStatus.
     */
    @java.lang.Override
    public boolean getOptOutOnlineStatus() {
      return optOutOnlineStatus_;
    }
    /**
     * <code>bool opt_out_online_status = 1;</code>
     * @param value The optOutOnlineStatus to set.
     * @return This builder for chaining.
     */
    public Builder setOptOutOnlineStatus(boolean value) {
      
      optOutOnlineStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool opt_out_online_status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOptOutOnlineStatus() {
      
      optOutOnlineStatus_ = false;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> completedTutorials_ =
      java.util.Collections.emptyList();
    private void ensureCompletedTutorialsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        completedTutorials_ = new java.util.ArrayList<java.lang.Integer>(completedTutorials_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
     * @return A list containing the completedTutorials.
     */
    public java.util.List<POGOProtos.Rpc.SocialSettings.TutorialType> getCompletedTutorialsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.SocialSettings.TutorialType>(completedTutorials_, completedTutorials_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
     * @return The count of completedTutorials.
     */
    public int getCompletedTutorialsCount() {
      return completedTutorials_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
     * @param index The index of the element to return.
     * @return The completedTutorials at the given index.
     */
    public POGOProtos.Rpc.SocialSettings.TutorialType getCompletedTutorials(int index) {
      return completedTutorials_converter_.convert(completedTutorials_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
     * @param index The index to set the value at.
     * @param value The completedTutorials to set.
     * @return This builder for chaining.
     */
    public Builder setCompletedTutorials(
        int index, POGOProtos.Rpc.SocialSettings.TutorialType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCompletedTutorialsIsMutable();
      completedTutorials_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
     * @param value The completedTutorials to add.
     * @return This builder for chaining.
     */
    public Builder addCompletedTutorials(POGOProtos.Rpc.SocialSettings.TutorialType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCompletedTutorialsIsMutable();
      completedTutorials_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
     * @param values The completedTutorials to add.
     * @return This builder for chaining.
     */
    public Builder addAllCompletedTutorials(
        java.lang.Iterable<? extends POGOProtos.Rpc.SocialSettings.TutorialType> values) {
      ensureCompletedTutorialsIsMutable();
      for (POGOProtos.Rpc.SocialSettings.TutorialType value : values) {
        completedTutorials_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompletedTutorials() {
      completedTutorials_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
     * @return A list containing the enum numeric values on the wire for completedTutorials.
     */
    public java.util.List<java.lang.Integer>
    getCompletedTutorialsValueList() {
      return java.util.Collections.unmodifiableList(completedTutorials_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of completedTutorials at the given index.
     */
    public int getCompletedTutorialsValue(int index) {
      return completedTutorials_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of completedTutorials at the given index.
     * @return This builder for chaining.
     */
    public Builder setCompletedTutorialsValue(
        int index, int value) {
      ensureCompletedTutorialsIsMutable();
      completedTutorials_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
     * @param value The enum numeric value on the wire for completedTutorials to add.
     * @return This builder for chaining.
     */
    public Builder addCompletedTutorialsValue(int value) {
      ensureCompletedTutorialsIsMutable();
      completedTutorials_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.SocialSettings.TutorialType completed_tutorials = 2;</code>
     * @param values The enum numeric values on the wire for completedTutorials to add.
     * @return This builder for chaining.
     */
    public Builder addAllCompletedTutorialsValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureCompletedTutorialsIsMutable();
      for (int value : values) {
        completedTutorials_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlayerSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlayerSettingsProto)
  private static final POGOProtos.Rpc.PlayerSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlayerSettingsProto();
  }

  public static POGOProtos.Rpc.PlayerSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayerSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<PlayerSettingsProto>() {
    @java.lang.Override
    public PlayerSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlayerSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlayerSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayerSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlayerSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

