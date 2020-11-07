// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GuiSearchSettingsProto}
 */
public final class GuiSearchSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GuiSearchSettingsProto)
    GuiSearchSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GuiSearchSettingsProto.newBuilder() to construct.
  private GuiSearchSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GuiSearchSettingsProto() {
    recommendedSearch_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GuiSearchSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GuiSearchSettingsProto(
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

            guiSearchEnabled_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              recommendedSearch_ = new java.util.ArrayList<POGOProtos.Rpc.RecommendedSearchProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            recommendedSearch_.add(
                input.readMessage(POGOProtos.Rpc.RecommendedSearchProto.parser(), extensionRegistry));
            break;
          }
          case 24: {

            maxNumberRecentSearches_ = input.readInt32();
            break;
          }
          case 32: {

            maxNumberFavoriteSearches_ = input.readInt32();
            break;
          }
          case 40: {

            maxQueryLength_ = input.readInt32();
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
        recommendedSearch_ = java.util.Collections.unmodifiableList(recommendedSearch_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GuiSearchSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GuiSearchSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GuiSearchSettingsProto.class, POGOProtos.Rpc.GuiSearchSettingsProto.Builder.class);
  }

  public static final int GUI_SEARCH_ENABLED_FIELD_NUMBER = 1;
  private boolean guiSearchEnabled_;
  /**
   * <code>bool gui_search_enabled = 1;</code>
   * @return The guiSearchEnabled.
   */
  @java.lang.Override
  public boolean getGuiSearchEnabled() {
    return guiSearchEnabled_;
  }

  public static final int RECOMMENDED_SEARCH_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.RecommendedSearchProto> recommendedSearch_;
  /**
   * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.RecommendedSearchProto> getRecommendedSearchList() {
    return recommendedSearch_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.RecommendedSearchProtoOrBuilder> 
      getRecommendedSearchOrBuilderList() {
    return recommendedSearch_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
   */
  @java.lang.Override
  public int getRecommendedSearchCount() {
    return recommendedSearch_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.RecommendedSearchProto getRecommendedSearch(int index) {
    return recommendedSearch_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.RecommendedSearchProtoOrBuilder getRecommendedSearchOrBuilder(
      int index) {
    return recommendedSearch_.get(index);
  }

  public static final int MAX_NUMBER_RECENT_SEARCHES_FIELD_NUMBER = 3;
  private int maxNumberRecentSearches_;
  /**
   * <code>int32 max_number_recent_searches = 3;</code>
   * @return The maxNumberRecentSearches.
   */
  @java.lang.Override
  public int getMaxNumberRecentSearches() {
    return maxNumberRecentSearches_;
  }

  public static final int MAX_NUMBER_FAVORITE_SEARCHES_FIELD_NUMBER = 4;
  private int maxNumberFavoriteSearches_;
  /**
   * <code>int32 max_number_favorite_searches = 4;</code>
   * @return The maxNumberFavoriteSearches.
   */
  @java.lang.Override
  public int getMaxNumberFavoriteSearches() {
    return maxNumberFavoriteSearches_;
  }

  public static final int MAX_QUERY_LENGTH_FIELD_NUMBER = 5;
  private int maxQueryLength_;
  /**
   * <code>int32 max_query_length = 5;</code>
   * @return The maxQueryLength.
   */
  @java.lang.Override
  public int getMaxQueryLength() {
    return maxQueryLength_;
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
    if (guiSearchEnabled_ != false) {
      output.writeBool(1, guiSearchEnabled_);
    }
    for (int i = 0; i < recommendedSearch_.size(); i++) {
      output.writeMessage(2, recommendedSearch_.get(i));
    }
    if (maxNumberRecentSearches_ != 0) {
      output.writeInt32(3, maxNumberRecentSearches_);
    }
    if (maxNumberFavoriteSearches_ != 0) {
      output.writeInt32(4, maxNumberFavoriteSearches_);
    }
    if (maxQueryLength_ != 0) {
      output.writeInt32(5, maxQueryLength_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (guiSearchEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, guiSearchEnabled_);
    }
    for (int i = 0; i < recommendedSearch_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, recommendedSearch_.get(i));
    }
    if (maxNumberRecentSearches_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxNumberRecentSearches_);
    }
    if (maxNumberFavoriteSearches_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, maxNumberFavoriteSearches_);
    }
    if (maxQueryLength_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, maxQueryLength_);
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
    if (!(obj instanceof POGOProtos.Rpc.GuiSearchSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GuiSearchSettingsProto other = (POGOProtos.Rpc.GuiSearchSettingsProto) obj;

    if (getGuiSearchEnabled()
        != other.getGuiSearchEnabled()) return false;
    if (!getRecommendedSearchList()
        .equals(other.getRecommendedSearchList())) return false;
    if (getMaxNumberRecentSearches()
        != other.getMaxNumberRecentSearches()) return false;
    if (getMaxNumberFavoriteSearches()
        != other.getMaxNumberFavoriteSearches()) return false;
    if (getMaxQueryLength()
        != other.getMaxQueryLength()) return false;
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
    hash = (37 * hash) + GUI_SEARCH_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getGuiSearchEnabled());
    if (getRecommendedSearchCount() > 0) {
      hash = (37 * hash) + RECOMMENDED_SEARCH_FIELD_NUMBER;
      hash = (53 * hash) + getRecommendedSearchList().hashCode();
    }
    hash = (37 * hash) + MAX_NUMBER_RECENT_SEARCHES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxNumberRecentSearches();
    hash = (37 * hash) + MAX_NUMBER_FAVORITE_SEARCHES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxNumberFavoriteSearches();
    hash = (37 * hash) + MAX_QUERY_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getMaxQueryLength();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GuiSearchSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GuiSearchSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GuiSearchSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GuiSearchSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GuiSearchSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GuiSearchSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GuiSearchSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GuiSearchSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GuiSearchSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GuiSearchSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GuiSearchSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GuiSearchSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GuiSearchSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GuiSearchSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GuiSearchSettingsProto)
      POGOProtos.Rpc.GuiSearchSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GuiSearchSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GuiSearchSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GuiSearchSettingsProto.class, POGOProtos.Rpc.GuiSearchSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GuiSearchSettingsProto.newBuilder()
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
        getRecommendedSearchFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      guiSearchEnabled_ = false;

      if (recommendedSearchBuilder_ == null) {
        recommendedSearch_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        recommendedSearchBuilder_.clear();
      }
      maxNumberRecentSearches_ = 0;

      maxNumberFavoriteSearches_ = 0;

      maxQueryLength_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GuiSearchSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GuiSearchSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GuiSearchSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GuiSearchSettingsProto build() {
      POGOProtos.Rpc.GuiSearchSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GuiSearchSettingsProto buildPartial() {
      POGOProtos.Rpc.GuiSearchSettingsProto result = new POGOProtos.Rpc.GuiSearchSettingsProto(this);
      int from_bitField0_ = bitField0_;
      result.guiSearchEnabled_ = guiSearchEnabled_;
      if (recommendedSearchBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          recommendedSearch_ = java.util.Collections.unmodifiableList(recommendedSearch_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.recommendedSearch_ = recommendedSearch_;
      } else {
        result.recommendedSearch_ = recommendedSearchBuilder_.build();
      }
      result.maxNumberRecentSearches_ = maxNumberRecentSearches_;
      result.maxNumberFavoriteSearches_ = maxNumberFavoriteSearches_;
      result.maxQueryLength_ = maxQueryLength_;
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
      if (other instanceof POGOProtos.Rpc.GuiSearchSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.GuiSearchSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GuiSearchSettingsProto other) {
      if (other == POGOProtos.Rpc.GuiSearchSettingsProto.getDefaultInstance()) return this;
      if (other.getGuiSearchEnabled() != false) {
        setGuiSearchEnabled(other.getGuiSearchEnabled());
      }
      if (recommendedSearchBuilder_ == null) {
        if (!other.recommendedSearch_.isEmpty()) {
          if (recommendedSearch_.isEmpty()) {
            recommendedSearch_ = other.recommendedSearch_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRecommendedSearchIsMutable();
            recommendedSearch_.addAll(other.recommendedSearch_);
          }
          onChanged();
        }
      } else {
        if (!other.recommendedSearch_.isEmpty()) {
          if (recommendedSearchBuilder_.isEmpty()) {
            recommendedSearchBuilder_.dispose();
            recommendedSearchBuilder_ = null;
            recommendedSearch_ = other.recommendedSearch_;
            bitField0_ = (bitField0_ & ~0x00000001);
            recommendedSearchBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRecommendedSearchFieldBuilder() : null;
          } else {
            recommendedSearchBuilder_.addAllMessages(other.recommendedSearch_);
          }
        }
      }
      if (other.getMaxNumberRecentSearches() != 0) {
        setMaxNumberRecentSearches(other.getMaxNumberRecentSearches());
      }
      if (other.getMaxNumberFavoriteSearches() != 0) {
        setMaxNumberFavoriteSearches(other.getMaxNumberFavoriteSearches());
      }
      if (other.getMaxQueryLength() != 0) {
        setMaxQueryLength(other.getMaxQueryLength());
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
      POGOProtos.Rpc.GuiSearchSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GuiSearchSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean guiSearchEnabled_ ;
    /**
     * <code>bool gui_search_enabled = 1;</code>
     * @return The guiSearchEnabled.
     */
    @java.lang.Override
    public boolean getGuiSearchEnabled() {
      return guiSearchEnabled_;
    }
    /**
     * <code>bool gui_search_enabled = 1;</code>
     * @param value The guiSearchEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setGuiSearchEnabled(boolean value) {
      
      guiSearchEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool gui_search_enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGuiSearchEnabled() {
      
      guiSearchEnabled_ = false;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.RecommendedSearchProto> recommendedSearch_ =
      java.util.Collections.emptyList();
    private void ensureRecommendedSearchIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        recommendedSearch_ = new java.util.ArrayList<POGOProtos.Rpc.RecommendedSearchProto>(recommendedSearch_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.RecommendedSearchProto, POGOProtos.Rpc.RecommendedSearchProto.Builder, POGOProtos.Rpc.RecommendedSearchProtoOrBuilder> recommendedSearchBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.RecommendedSearchProto> getRecommendedSearchList() {
      if (recommendedSearchBuilder_ == null) {
        return java.util.Collections.unmodifiableList(recommendedSearch_);
      } else {
        return recommendedSearchBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public int getRecommendedSearchCount() {
      if (recommendedSearchBuilder_ == null) {
        return recommendedSearch_.size();
      } else {
        return recommendedSearchBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public POGOProtos.Rpc.RecommendedSearchProto getRecommendedSearch(int index) {
      if (recommendedSearchBuilder_ == null) {
        return recommendedSearch_.get(index);
      } else {
        return recommendedSearchBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public Builder setRecommendedSearch(
        int index, POGOProtos.Rpc.RecommendedSearchProto value) {
      if (recommendedSearchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecommendedSearchIsMutable();
        recommendedSearch_.set(index, value);
        onChanged();
      } else {
        recommendedSearchBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public Builder setRecommendedSearch(
        int index, POGOProtos.Rpc.RecommendedSearchProto.Builder builderForValue) {
      if (recommendedSearchBuilder_ == null) {
        ensureRecommendedSearchIsMutable();
        recommendedSearch_.set(index, builderForValue.build());
        onChanged();
      } else {
        recommendedSearchBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public Builder addRecommendedSearch(POGOProtos.Rpc.RecommendedSearchProto value) {
      if (recommendedSearchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecommendedSearchIsMutable();
        recommendedSearch_.add(value);
        onChanged();
      } else {
        recommendedSearchBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public Builder addRecommendedSearch(
        int index, POGOProtos.Rpc.RecommendedSearchProto value) {
      if (recommendedSearchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecommendedSearchIsMutable();
        recommendedSearch_.add(index, value);
        onChanged();
      } else {
        recommendedSearchBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public Builder addRecommendedSearch(
        POGOProtos.Rpc.RecommendedSearchProto.Builder builderForValue) {
      if (recommendedSearchBuilder_ == null) {
        ensureRecommendedSearchIsMutable();
        recommendedSearch_.add(builderForValue.build());
        onChanged();
      } else {
        recommendedSearchBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public Builder addRecommendedSearch(
        int index, POGOProtos.Rpc.RecommendedSearchProto.Builder builderForValue) {
      if (recommendedSearchBuilder_ == null) {
        ensureRecommendedSearchIsMutable();
        recommendedSearch_.add(index, builderForValue.build());
        onChanged();
      } else {
        recommendedSearchBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public Builder addAllRecommendedSearch(
        java.lang.Iterable<? extends POGOProtos.Rpc.RecommendedSearchProto> values) {
      if (recommendedSearchBuilder_ == null) {
        ensureRecommendedSearchIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, recommendedSearch_);
        onChanged();
      } else {
        recommendedSearchBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public Builder clearRecommendedSearch() {
      if (recommendedSearchBuilder_ == null) {
        recommendedSearch_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        recommendedSearchBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public Builder removeRecommendedSearch(int index) {
      if (recommendedSearchBuilder_ == null) {
        ensureRecommendedSearchIsMutable();
        recommendedSearch_.remove(index);
        onChanged();
      } else {
        recommendedSearchBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public POGOProtos.Rpc.RecommendedSearchProto.Builder getRecommendedSearchBuilder(
        int index) {
      return getRecommendedSearchFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public POGOProtos.Rpc.RecommendedSearchProtoOrBuilder getRecommendedSearchOrBuilder(
        int index) {
      if (recommendedSearchBuilder_ == null) {
        return recommendedSearch_.get(index);  } else {
        return recommendedSearchBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.RecommendedSearchProtoOrBuilder> 
         getRecommendedSearchOrBuilderList() {
      if (recommendedSearchBuilder_ != null) {
        return recommendedSearchBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(recommendedSearch_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public POGOProtos.Rpc.RecommendedSearchProto.Builder addRecommendedSearchBuilder() {
      return getRecommendedSearchFieldBuilder().addBuilder(
          POGOProtos.Rpc.RecommendedSearchProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public POGOProtos.Rpc.RecommendedSearchProto.Builder addRecommendedSearchBuilder(
        int index) {
      return getRecommendedSearchFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.RecommendedSearchProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RecommendedSearchProto recommended_search = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.RecommendedSearchProto.Builder> 
         getRecommendedSearchBuilderList() {
      return getRecommendedSearchFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.RecommendedSearchProto, POGOProtos.Rpc.RecommendedSearchProto.Builder, POGOProtos.Rpc.RecommendedSearchProtoOrBuilder> 
        getRecommendedSearchFieldBuilder() {
      if (recommendedSearchBuilder_ == null) {
        recommendedSearchBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.RecommendedSearchProto, POGOProtos.Rpc.RecommendedSearchProto.Builder, POGOProtos.Rpc.RecommendedSearchProtoOrBuilder>(
                recommendedSearch_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        recommendedSearch_ = null;
      }
      return recommendedSearchBuilder_;
    }

    private int maxNumberRecentSearches_ ;
    /**
     * <code>int32 max_number_recent_searches = 3;</code>
     * @return The maxNumberRecentSearches.
     */
    @java.lang.Override
    public int getMaxNumberRecentSearches() {
      return maxNumberRecentSearches_;
    }
    /**
     * <code>int32 max_number_recent_searches = 3;</code>
     * @param value The maxNumberRecentSearches to set.
     * @return This builder for chaining.
     */
    public Builder setMaxNumberRecentSearches(int value) {
      
      maxNumberRecentSearches_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_number_recent_searches = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxNumberRecentSearches() {
      
      maxNumberRecentSearches_ = 0;
      onChanged();
      return this;
    }

    private int maxNumberFavoriteSearches_ ;
    /**
     * <code>int32 max_number_favorite_searches = 4;</code>
     * @return The maxNumberFavoriteSearches.
     */
    @java.lang.Override
    public int getMaxNumberFavoriteSearches() {
      return maxNumberFavoriteSearches_;
    }
    /**
     * <code>int32 max_number_favorite_searches = 4;</code>
     * @param value The maxNumberFavoriteSearches to set.
     * @return This builder for chaining.
     */
    public Builder setMaxNumberFavoriteSearches(int value) {
      
      maxNumberFavoriteSearches_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_number_favorite_searches = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxNumberFavoriteSearches() {
      
      maxNumberFavoriteSearches_ = 0;
      onChanged();
      return this;
    }

    private int maxQueryLength_ ;
    /**
     * <code>int32 max_query_length = 5;</code>
     * @return The maxQueryLength.
     */
    @java.lang.Override
    public int getMaxQueryLength() {
      return maxQueryLength_;
    }
    /**
     * <code>int32 max_query_length = 5;</code>
     * @param value The maxQueryLength to set.
     * @return This builder for chaining.
     */
    public Builder setMaxQueryLength(int value) {
      
      maxQueryLength_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_query_length = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxQueryLength() {
      
      maxQueryLength_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GuiSearchSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GuiSearchSettingsProto)
  private static final POGOProtos.Rpc.GuiSearchSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GuiSearchSettingsProto();
  }

  public static POGOProtos.Rpc.GuiSearchSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GuiSearchSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<GuiSearchSettingsProto>() {
    @java.lang.Override
    public GuiSearchSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GuiSearchSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GuiSearchSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuiSearchSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GuiSearchSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

