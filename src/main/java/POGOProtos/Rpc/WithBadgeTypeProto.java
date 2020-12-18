// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.WithBadgeTypeProto}
 */
public final class WithBadgeTypeProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.WithBadgeTypeProto)
    WithBadgeTypeProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WithBadgeTypeProto.newBuilder() to construct.
  private WithBadgeTypeProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WithBadgeTypeProto() {
    badgeType_ = java.util.Collections.emptyList();
    badgeTypesToExclude_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WithBadgeTypeProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WithBadgeTypeProto(
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
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              badgeType_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            badgeType_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                badgeType_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              badgeType_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 16: {

            badgeRank_ = input.readInt32();
            break;
          }
          case 24: {

            amount_ = input.readInt32();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              badgeTypesToExclude_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            badgeTypesToExclude_.add(rawValue);
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                badgeTypesToExclude_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              badgeTypesToExclude_.add(rawValue);
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
        badgeType_ = java.util.Collections.unmodifiableList(badgeType_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        badgeTypesToExclude_ = java.util.Collections.unmodifiableList(badgeTypesToExclude_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithBadgeTypeProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithBadgeTypeProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.WithBadgeTypeProto.class, POGOProtos.Rpc.WithBadgeTypeProto.Builder.class);
  }

  public static final int BADGE_TYPE_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> badgeType_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.HoloBadgeType> badgeType_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.HoloBadgeType>() {
            public POGOProtos.Rpc.HoloBadgeType convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.HoloBadgeType result = POGOProtos.Rpc.HoloBadgeType.valueOf(from);
              return result == null ? POGOProtos.Rpc.HoloBadgeType.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
   * @return A list containing the badgeType.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.HoloBadgeType> getBadgeTypeList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.HoloBadgeType>(badgeType_, badgeType_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
   * @return The count of badgeType.
   */
  @java.lang.Override
  public int getBadgeTypeCount() {
    return badgeType_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
   * @param index The index of the element to return.
   * @return The badgeType at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HoloBadgeType getBadgeType(int index) {
    return badgeType_converter_.convert(badgeType_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
   * @return A list containing the enum numeric values on the wire for badgeType.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getBadgeTypeValueList() {
    return badgeType_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of badgeType at the given index.
   */
  @java.lang.Override
  public int getBadgeTypeValue(int index) {
    return badgeType_.get(index);
  }
  private int badgeTypeMemoizedSerializedSize;

  public static final int BADGE_RANK_FIELD_NUMBER = 2;
  private int badgeRank_;
  /**
   * <code>int32 badge_rank = 2;</code>
   * @return The badgeRank.
   */
  @java.lang.Override
  public int getBadgeRank() {
    return badgeRank_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private int amount_;
  /**
   * <code>int32 amount = 3;</code>
   * @return The amount.
   */
  @java.lang.Override
  public int getAmount() {
    return amount_;
  }

  public static final int BADGE_TYPES_TO_EXCLUDE_FIELD_NUMBER = 4;
  private java.util.List<java.lang.Integer> badgeTypesToExclude_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.HoloBadgeType> badgeTypesToExclude_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.HoloBadgeType>() {
            public POGOProtos.Rpc.HoloBadgeType convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.HoloBadgeType result = POGOProtos.Rpc.HoloBadgeType.valueOf(from);
              return result == null ? POGOProtos.Rpc.HoloBadgeType.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
   * @return A list containing the badgeTypesToExclude.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.HoloBadgeType> getBadgeTypesToExcludeList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.HoloBadgeType>(badgeTypesToExclude_, badgeTypesToExclude_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
   * @return The count of badgeTypesToExclude.
   */
  @java.lang.Override
  public int getBadgeTypesToExcludeCount() {
    return badgeTypesToExclude_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
   * @param index The index of the element to return.
   * @return The badgeTypesToExclude at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HoloBadgeType getBadgeTypesToExclude(int index) {
    return badgeTypesToExclude_converter_.convert(badgeTypesToExclude_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
   * @return A list containing the enum numeric values on the wire for badgeTypesToExclude.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getBadgeTypesToExcludeValueList() {
    return badgeTypesToExclude_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of badgeTypesToExclude at the given index.
   */
  @java.lang.Override
  public int getBadgeTypesToExcludeValue(int index) {
    return badgeTypesToExclude_.get(index);
  }
  private int badgeTypesToExcludeMemoizedSerializedSize;

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
    if (getBadgeTypeList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(badgeTypeMemoizedSerializedSize);
    }
    for (int i = 0; i < badgeType_.size(); i++) {
      output.writeEnumNoTag(badgeType_.get(i));
    }
    if (badgeRank_ != 0) {
      output.writeInt32(2, badgeRank_);
    }
    if (amount_ != 0) {
      output.writeInt32(3, amount_);
    }
    if (getBadgeTypesToExcludeList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(badgeTypesToExcludeMemoizedSerializedSize);
    }
    for (int i = 0; i < badgeTypesToExclude_.size(); i++) {
      output.writeEnumNoTag(badgeTypesToExclude_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < badgeType_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(badgeType_.get(i));
      }
      size += dataSize;
      if (!getBadgeTypeList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }badgeTypeMemoizedSerializedSize = dataSize;
    }
    if (badgeRank_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, badgeRank_);
    }
    if (amount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, amount_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < badgeTypesToExclude_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(badgeTypesToExclude_.get(i));
      }
      size += dataSize;
      if (!getBadgeTypesToExcludeList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }badgeTypesToExcludeMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.WithBadgeTypeProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.WithBadgeTypeProto other = (POGOProtos.Rpc.WithBadgeTypeProto) obj;

    if (!badgeType_.equals(other.badgeType_)) return false;
    if (getBadgeRank()
        != other.getBadgeRank()) return false;
    if (getAmount()
        != other.getAmount()) return false;
    if (!badgeTypesToExclude_.equals(other.badgeTypesToExclude_)) return false;
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
    if (getBadgeTypeCount() > 0) {
      hash = (37 * hash) + BADGE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + badgeType_.hashCode();
    }
    hash = (37 * hash) + BADGE_RANK_FIELD_NUMBER;
    hash = (53 * hash) + getBadgeRank();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount();
    if (getBadgeTypesToExcludeCount() > 0) {
      hash = (37 * hash) + BADGE_TYPES_TO_EXCLUDE_FIELD_NUMBER;
      hash = (53 * hash) + badgeTypesToExclude_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.WithBadgeTypeProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithBadgeTypeProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithBadgeTypeProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithBadgeTypeProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithBadgeTypeProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithBadgeTypeProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithBadgeTypeProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithBadgeTypeProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithBadgeTypeProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithBadgeTypeProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithBadgeTypeProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithBadgeTypeProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.WithBadgeTypeProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.WithBadgeTypeProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.WithBadgeTypeProto)
      POGOProtos.Rpc.WithBadgeTypeProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithBadgeTypeProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithBadgeTypeProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.WithBadgeTypeProto.class, POGOProtos.Rpc.WithBadgeTypeProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.WithBadgeTypeProto.newBuilder()
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
      badgeType_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      badgeRank_ = 0;

      amount_ = 0;

      badgeTypesToExclude_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithBadgeTypeProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithBadgeTypeProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.WithBadgeTypeProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithBadgeTypeProto build() {
      POGOProtos.Rpc.WithBadgeTypeProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithBadgeTypeProto buildPartial() {
      POGOProtos.Rpc.WithBadgeTypeProto result = new POGOProtos.Rpc.WithBadgeTypeProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        badgeType_ = java.util.Collections.unmodifiableList(badgeType_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.badgeType_ = badgeType_;
      result.badgeRank_ = badgeRank_;
      result.amount_ = amount_;
      if (((bitField0_ & 0x00000002) != 0)) {
        badgeTypesToExclude_ = java.util.Collections.unmodifiableList(badgeTypesToExclude_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.badgeTypesToExclude_ = badgeTypesToExclude_;
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
      if (other instanceof POGOProtos.Rpc.WithBadgeTypeProto) {
        return mergeFrom((POGOProtos.Rpc.WithBadgeTypeProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.WithBadgeTypeProto other) {
      if (other == POGOProtos.Rpc.WithBadgeTypeProto.getDefaultInstance()) return this;
      if (!other.badgeType_.isEmpty()) {
        if (badgeType_.isEmpty()) {
          badgeType_ = other.badgeType_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBadgeTypeIsMutable();
          badgeType_.addAll(other.badgeType_);
        }
        onChanged();
      }
      if (other.getBadgeRank() != 0) {
        setBadgeRank(other.getBadgeRank());
      }
      if (other.getAmount() != 0) {
        setAmount(other.getAmount());
      }
      if (!other.badgeTypesToExclude_.isEmpty()) {
        if (badgeTypesToExclude_.isEmpty()) {
          badgeTypesToExclude_ = other.badgeTypesToExclude_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureBadgeTypesToExcludeIsMutable();
          badgeTypesToExclude_.addAll(other.badgeTypesToExclude_);
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
      POGOProtos.Rpc.WithBadgeTypeProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.WithBadgeTypeProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> badgeType_ =
      java.util.Collections.emptyList();
    private void ensureBadgeTypeIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        badgeType_ = new java.util.ArrayList<java.lang.Integer>(badgeType_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
     * @return A list containing the badgeType.
     */
    public java.util.List<POGOProtos.Rpc.HoloBadgeType> getBadgeTypeList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.HoloBadgeType>(badgeType_, badgeType_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
     * @return The count of badgeType.
     */
    public int getBadgeTypeCount() {
      return badgeType_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
     * @param index The index of the element to return.
     * @return The badgeType at the given index.
     */
    public POGOProtos.Rpc.HoloBadgeType getBadgeType(int index) {
      return badgeType_converter_.convert(badgeType_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
     * @param index The index to set the value at.
     * @param value The badgeType to set.
     * @return This builder for chaining.
     */
    public Builder setBadgeType(
        int index, POGOProtos.Rpc.HoloBadgeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureBadgeTypeIsMutable();
      badgeType_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
     * @param value The badgeType to add.
     * @return This builder for chaining.
     */
    public Builder addBadgeType(POGOProtos.Rpc.HoloBadgeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureBadgeTypeIsMutable();
      badgeType_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
     * @param values The badgeType to add.
     * @return This builder for chaining.
     */
    public Builder addAllBadgeType(
        java.lang.Iterable<? extends POGOProtos.Rpc.HoloBadgeType> values) {
      ensureBadgeTypeIsMutable();
      for (POGOProtos.Rpc.HoloBadgeType value : values) {
        badgeType_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBadgeType() {
      badgeType_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
     * @return A list containing the enum numeric values on the wire for badgeType.
     */
    public java.util.List<java.lang.Integer>
    getBadgeTypeValueList() {
      return java.util.Collections.unmodifiableList(badgeType_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of badgeType at the given index.
     */
    public int getBadgeTypeValue(int index) {
      return badgeType_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of badgeType at the given index.
     * @return This builder for chaining.
     */
    public Builder setBadgeTypeValue(
        int index, int value) {
      ensureBadgeTypeIsMutable();
      badgeType_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
     * @param value The enum numeric value on the wire for badgeType to add.
     * @return This builder for chaining.
     */
    public Builder addBadgeTypeValue(int value) {
      ensureBadgeTypeIsMutable();
      badgeType_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
     * @param values The enum numeric values on the wire for badgeType to add.
     * @return This builder for chaining.
     */
    public Builder addAllBadgeTypeValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureBadgeTypeIsMutable();
      for (int value : values) {
        badgeType_.add(value);
      }
      onChanged();
      return this;
    }

    private int badgeRank_ ;
    /**
     * <code>int32 badge_rank = 2;</code>
     * @return The badgeRank.
     */
    @java.lang.Override
    public int getBadgeRank() {
      return badgeRank_;
    }
    /**
     * <code>int32 badge_rank = 2;</code>
     * @param value The badgeRank to set.
     * @return This builder for chaining.
     */
    public Builder setBadgeRank(int value) {
      
      badgeRank_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 badge_rank = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBadgeRank() {
      
      badgeRank_ = 0;
      onChanged();
      return this;
    }

    private int amount_ ;
    /**
     * <code>int32 amount = 3;</code>
     * @return The amount.
     */
    @java.lang.Override
    public int getAmount() {
      return amount_;
    }
    /**
     * <code>int32 amount = 3;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(int value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 amount = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> badgeTypesToExclude_ =
      java.util.Collections.emptyList();
    private void ensureBadgeTypesToExcludeIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        badgeTypesToExclude_ = new java.util.ArrayList<java.lang.Integer>(badgeTypesToExclude_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
     * @return A list containing the badgeTypesToExclude.
     */
    public java.util.List<POGOProtos.Rpc.HoloBadgeType> getBadgeTypesToExcludeList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.HoloBadgeType>(badgeTypesToExclude_, badgeTypesToExclude_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
     * @return The count of badgeTypesToExclude.
     */
    public int getBadgeTypesToExcludeCount() {
      return badgeTypesToExclude_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
     * @param index The index of the element to return.
     * @return The badgeTypesToExclude at the given index.
     */
    public POGOProtos.Rpc.HoloBadgeType getBadgeTypesToExclude(int index) {
      return badgeTypesToExclude_converter_.convert(badgeTypesToExclude_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
     * @param index The index to set the value at.
     * @param value The badgeTypesToExclude to set.
     * @return This builder for chaining.
     */
    public Builder setBadgeTypesToExclude(
        int index, POGOProtos.Rpc.HoloBadgeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureBadgeTypesToExcludeIsMutable();
      badgeTypesToExclude_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
     * @param value The badgeTypesToExclude to add.
     * @return This builder for chaining.
     */
    public Builder addBadgeTypesToExclude(POGOProtos.Rpc.HoloBadgeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureBadgeTypesToExcludeIsMutable();
      badgeTypesToExclude_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
     * @param values The badgeTypesToExclude to add.
     * @return This builder for chaining.
     */
    public Builder addAllBadgeTypesToExclude(
        java.lang.Iterable<? extends POGOProtos.Rpc.HoloBadgeType> values) {
      ensureBadgeTypesToExcludeIsMutable();
      for (POGOProtos.Rpc.HoloBadgeType value : values) {
        badgeTypesToExclude_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBadgeTypesToExclude() {
      badgeTypesToExclude_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
     * @return A list containing the enum numeric values on the wire for badgeTypesToExclude.
     */
    public java.util.List<java.lang.Integer>
    getBadgeTypesToExcludeValueList() {
      return java.util.Collections.unmodifiableList(badgeTypesToExclude_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of badgeTypesToExclude at the given index.
     */
    public int getBadgeTypesToExcludeValue(int index) {
      return badgeTypesToExclude_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of badgeTypesToExclude at the given index.
     * @return This builder for chaining.
     */
    public Builder setBadgeTypesToExcludeValue(
        int index, int value) {
      ensureBadgeTypesToExcludeIsMutable();
      badgeTypesToExclude_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
     * @param value The enum numeric value on the wire for badgeTypesToExclude to add.
     * @return This builder for chaining.
     */
    public Builder addBadgeTypesToExcludeValue(int value) {
      ensureBadgeTypesToExcludeIsMutable();
      badgeTypesToExclude_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
     * @param values The enum numeric values on the wire for badgeTypesToExclude to add.
     * @return This builder for chaining.
     */
    public Builder addAllBadgeTypesToExcludeValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureBadgeTypesToExcludeIsMutable();
      for (int value : values) {
        badgeTypesToExclude_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.WithBadgeTypeProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.WithBadgeTypeProto)
  private static final POGOProtos.Rpc.WithBadgeTypeProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.WithBadgeTypeProto();
  }

  public static POGOProtos.Rpc.WithBadgeTypeProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WithBadgeTypeProto>
      PARSER = new com.google.protobuf.AbstractParser<WithBadgeTypeProto>() {
    @java.lang.Override
    public WithBadgeTypeProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WithBadgeTypeProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WithBadgeTypeProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WithBadgeTypeProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.WithBadgeTypeProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

