// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BJIKPGFJJKD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BJIKPGFJJKD}
 */
public final class BJIKPGFJJKD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BJIKPGFJJKD)
    BJIKPGFJJKDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BJIKPGFJJKD.newBuilder() to construct.
  private BJIKPGFJJKD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BJIKPGFJJKD() {
    baomajakhlo_ = java.util.Collections.emptyList();
    lefnlmpondh_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BJIKPGFJJKD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BJIKPGFJJKD(
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
              baomajakhlo_ = new java.util.ArrayList<POGOProtos.Rpc.MIKCCBIIGKM>();
              mutable_bitField0_ |= 0x00000001;
            }
            baomajakhlo_.add(
                input.readMessage(POGOProtos.Rpc.MIKCCBIIGKM.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            lefnlmpondh_ = s;
            break;
          }
          case 24: {

            emamcegccjd_ = input.readInt64();
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
        baomajakhlo_ = java.util.Collections.unmodifiableList(baomajakhlo_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJIKPGFJJKD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJIKPGFJJKD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BJIKPGFJJKD.class, POGOProtos.Rpc.BJIKPGFJJKD.Builder.class);
  }

  public static final int BAOMAJAKHLO_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.MIKCCBIIGKM> baomajakhlo_;
  /**
   * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.MIKCCBIIGKM> getBaomajakhloList() {
    return baomajakhlo_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.MIKCCBIIGKMOrBuilder> 
      getBaomajakhloOrBuilderList() {
    return baomajakhlo_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
   */
  @java.lang.Override
  public int getBaomajakhloCount() {
    return baomajakhlo_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.MIKCCBIIGKM getBaomajakhlo(int index) {
    return baomajakhlo_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.MIKCCBIIGKMOrBuilder getBaomajakhloOrBuilder(
      int index) {
    return baomajakhlo_.get(index);
  }

  public static final int LEFNLMPONDH_FIELD_NUMBER = 2;
  private volatile java.lang.Object lefnlmpondh_;
  /**
   * <code>string lefnlmpondh = 2;</code>
   * @return The lefnlmpondh.
   */
  @java.lang.Override
  public java.lang.String getLefnlmpondh() {
    java.lang.Object ref = lefnlmpondh_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lefnlmpondh_ = s;
      return s;
    }
  }
  /**
   * <code>string lefnlmpondh = 2;</code>
   * @return The bytes for lefnlmpondh.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLefnlmpondhBytes() {
    java.lang.Object ref = lefnlmpondh_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lefnlmpondh_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAMCEGCCJD_FIELD_NUMBER = 3;
  private long emamcegccjd_;
  /**
   * <code>int64 emamcegccjd = 3;</code>
   * @return The emamcegccjd.
   */
  @java.lang.Override
  public long getEmamcegccjd() {
    return emamcegccjd_;
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
    for (int i = 0; i < baomajakhlo_.size(); i++) {
      output.writeMessage(1, baomajakhlo_.get(i));
    }
    if (!getLefnlmpondhBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lefnlmpondh_);
    }
    if (emamcegccjd_ != 0L) {
      output.writeInt64(3, emamcegccjd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < baomajakhlo_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, baomajakhlo_.get(i));
    }
    if (!getLefnlmpondhBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lefnlmpondh_);
    }
    if (emamcegccjd_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, emamcegccjd_);
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
    if (!(obj instanceof POGOProtos.Rpc.BJIKPGFJJKD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BJIKPGFJJKD other = (POGOProtos.Rpc.BJIKPGFJJKD) obj;

    if (!getBaomajakhloList()
        .equals(other.getBaomajakhloList())) return false;
    if (!getLefnlmpondh()
        .equals(other.getLefnlmpondh())) return false;
    if (getEmamcegccjd()
        != other.getEmamcegccjd()) return false;
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
    if (getBaomajakhloCount() > 0) {
      hash = (37 * hash) + BAOMAJAKHLO_FIELD_NUMBER;
      hash = (53 * hash) + getBaomajakhloList().hashCode();
    }
    hash = (37 * hash) + LEFNLMPONDH_FIELD_NUMBER;
    hash = (53 * hash) + getLefnlmpondh().hashCode();
    hash = (37 * hash) + EMAMCEGCCJD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEmamcegccjd());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BJIKPGFJJKD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BJIKPGFJJKD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJIKPGFJJKD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BJIKPGFJJKD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJIKPGFJJKD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BJIKPGFJJKD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJIKPGFJJKD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BJIKPGFJJKD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJIKPGFJJKD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BJIKPGFJJKD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BJIKPGFJJKD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BJIKPGFJJKD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BJIKPGFJJKD prototype) {
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
   * ref: BJIKPGFJJKD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BJIKPGFJJKD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BJIKPGFJJKD)
      POGOProtos.Rpc.BJIKPGFJJKDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJIKPGFJJKD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJIKPGFJJKD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BJIKPGFJJKD.class, POGOProtos.Rpc.BJIKPGFJJKD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BJIKPGFJJKD.newBuilder()
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
        getBaomajakhloFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (baomajakhloBuilder_ == null) {
        baomajakhlo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        baomajakhloBuilder_.clear();
      }
      lefnlmpondh_ = "";

      emamcegccjd_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BJIKPGFJJKD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BJIKPGFJJKD getDefaultInstanceForType() {
      return POGOProtos.Rpc.BJIKPGFJJKD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BJIKPGFJJKD build() {
      POGOProtos.Rpc.BJIKPGFJJKD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BJIKPGFJJKD buildPartial() {
      POGOProtos.Rpc.BJIKPGFJJKD result = new POGOProtos.Rpc.BJIKPGFJJKD(this);
      int from_bitField0_ = bitField0_;
      if (baomajakhloBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          baomajakhlo_ = java.util.Collections.unmodifiableList(baomajakhlo_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.baomajakhlo_ = baomajakhlo_;
      } else {
        result.baomajakhlo_ = baomajakhloBuilder_.build();
      }
      result.lefnlmpondh_ = lefnlmpondh_;
      result.emamcegccjd_ = emamcegccjd_;
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
      if (other instanceof POGOProtos.Rpc.BJIKPGFJJKD) {
        return mergeFrom((POGOProtos.Rpc.BJIKPGFJJKD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BJIKPGFJJKD other) {
      if (other == POGOProtos.Rpc.BJIKPGFJJKD.getDefaultInstance()) return this;
      if (baomajakhloBuilder_ == null) {
        if (!other.baomajakhlo_.isEmpty()) {
          if (baomajakhlo_.isEmpty()) {
            baomajakhlo_ = other.baomajakhlo_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBaomajakhloIsMutable();
            baomajakhlo_.addAll(other.baomajakhlo_);
          }
          onChanged();
        }
      } else {
        if (!other.baomajakhlo_.isEmpty()) {
          if (baomajakhloBuilder_.isEmpty()) {
            baomajakhloBuilder_.dispose();
            baomajakhloBuilder_ = null;
            baomajakhlo_ = other.baomajakhlo_;
            bitField0_ = (bitField0_ & ~0x00000001);
            baomajakhloBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBaomajakhloFieldBuilder() : null;
          } else {
            baomajakhloBuilder_.addAllMessages(other.baomajakhlo_);
          }
        }
      }
      if (!other.getLefnlmpondh().isEmpty()) {
        lefnlmpondh_ = other.lefnlmpondh_;
        onChanged();
      }
      if (other.getEmamcegccjd() != 0L) {
        setEmamcegccjd(other.getEmamcegccjd());
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
      POGOProtos.Rpc.BJIKPGFJJKD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BJIKPGFJJKD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.MIKCCBIIGKM> baomajakhlo_ =
      java.util.Collections.emptyList();
    private void ensureBaomajakhloIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        baomajakhlo_ = new java.util.ArrayList<POGOProtos.Rpc.MIKCCBIIGKM>(baomajakhlo_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.MIKCCBIIGKM, POGOProtos.Rpc.MIKCCBIIGKM.Builder, POGOProtos.Rpc.MIKCCBIIGKMOrBuilder> baomajakhloBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.MIKCCBIIGKM> getBaomajakhloList() {
      if (baomajakhloBuilder_ == null) {
        return java.util.Collections.unmodifiableList(baomajakhlo_);
      } else {
        return baomajakhloBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public int getBaomajakhloCount() {
      if (baomajakhloBuilder_ == null) {
        return baomajakhlo_.size();
      } else {
        return baomajakhloBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public POGOProtos.Rpc.MIKCCBIIGKM getBaomajakhlo(int index) {
      if (baomajakhloBuilder_ == null) {
        return baomajakhlo_.get(index);
      } else {
        return baomajakhloBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public Builder setBaomajakhlo(
        int index, POGOProtos.Rpc.MIKCCBIIGKM value) {
      if (baomajakhloBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBaomajakhloIsMutable();
        baomajakhlo_.set(index, value);
        onChanged();
      } else {
        baomajakhloBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public Builder setBaomajakhlo(
        int index, POGOProtos.Rpc.MIKCCBIIGKM.Builder builderForValue) {
      if (baomajakhloBuilder_ == null) {
        ensureBaomajakhloIsMutable();
        baomajakhlo_.set(index, builderForValue.build());
        onChanged();
      } else {
        baomajakhloBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public Builder addBaomajakhlo(POGOProtos.Rpc.MIKCCBIIGKM value) {
      if (baomajakhloBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBaomajakhloIsMutable();
        baomajakhlo_.add(value);
        onChanged();
      } else {
        baomajakhloBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public Builder addBaomajakhlo(
        int index, POGOProtos.Rpc.MIKCCBIIGKM value) {
      if (baomajakhloBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBaomajakhloIsMutable();
        baomajakhlo_.add(index, value);
        onChanged();
      } else {
        baomajakhloBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public Builder addBaomajakhlo(
        POGOProtos.Rpc.MIKCCBIIGKM.Builder builderForValue) {
      if (baomajakhloBuilder_ == null) {
        ensureBaomajakhloIsMutable();
        baomajakhlo_.add(builderForValue.build());
        onChanged();
      } else {
        baomajakhloBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public Builder addBaomajakhlo(
        int index, POGOProtos.Rpc.MIKCCBIIGKM.Builder builderForValue) {
      if (baomajakhloBuilder_ == null) {
        ensureBaomajakhloIsMutable();
        baomajakhlo_.add(index, builderForValue.build());
        onChanged();
      } else {
        baomajakhloBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public Builder addAllBaomajakhlo(
        java.lang.Iterable<? extends POGOProtos.Rpc.MIKCCBIIGKM> values) {
      if (baomajakhloBuilder_ == null) {
        ensureBaomajakhloIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, baomajakhlo_);
        onChanged();
      } else {
        baomajakhloBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public Builder clearBaomajakhlo() {
      if (baomajakhloBuilder_ == null) {
        baomajakhlo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        baomajakhloBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public Builder removeBaomajakhlo(int index) {
      if (baomajakhloBuilder_ == null) {
        ensureBaomajakhloIsMutable();
        baomajakhlo_.remove(index);
        onChanged();
      } else {
        baomajakhloBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public POGOProtos.Rpc.MIKCCBIIGKM.Builder getBaomajakhloBuilder(
        int index) {
      return getBaomajakhloFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public POGOProtos.Rpc.MIKCCBIIGKMOrBuilder getBaomajakhloOrBuilder(
        int index) {
      if (baomajakhloBuilder_ == null) {
        return baomajakhlo_.get(index);  } else {
        return baomajakhloBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.MIKCCBIIGKMOrBuilder> 
         getBaomajakhloOrBuilderList() {
      if (baomajakhloBuilder_ != null) {
        return baomajakhloBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(baomajakhlo_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public POGOProtos.Rpc.MIKCCBIIGKM.Builder addBaomajakhloBuilder() {
      return getBaomajakhloFieldBuilder().addBuilder(
          POGOProtos.Rpc.MIKCCBIIGKM.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public POGOProtos.Rpc.MIKCCBIIGKM.Builder addBaomajakhloBuilder(
        int index) {
      return getBaomajakhloFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.MIKCCBIIGKM.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.MIKCCBIIGKM baomajakhlo = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.MIKCCBIIGKM.Builder> 
         getBaomajakhloBuilderList() {
      return getBaomajakhloFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.MIKCCBIIGKM, POGOProtos.Rpc.MIKCCBIIGKM.Builder, POGOProtos.Rpc.MIKCCBIIGKMOrBuilder> 
        getBaomajakhloFieldBuilder() {
      if (baomajakhloBuilder_ == null) {
        baomajakhloBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.MIKCCBIIGKM, POGOProtos.Rpc.MIKCCBIIGKM.Builder, POGOProtos.Rpc.MIKCCBIIGKMOrBuilder>(
                baomajakhlo_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        baomajakhlo_ = null;
      }
      return baomajakhloBuilder_;
    }

    private java.lang.Object lefnlmpondh_ = "";
    /**
     * <code>string lefnlmpondh = 2;</code>
     * @return The lefnlmpondh.
     */
    public java.lang.String getLefnlmpondh() {
      java.lang.Object ref = lefnlmpondh_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lefnlmpondh_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lefnlmpondh = 2;</code>
     * @return The bytes for lefnlmpondh.
     */
    public com.google.protobuf.ByteString
        getLefnlmpondhBytes() {
      java.lang.Object ref = lefnlmpondh_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lefnlmpondh_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lefnlmpondh = 2;</code>
     * @param value The lefnlmpondh to set.
     * @return This builder for chaining.
     */
    public Builder setLefnlmpondh(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lefnlmpondh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lefnlmpondh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLefnlmpondh() {
      
      lefnlmpondh_ = getDefaultInstance().getLefnlmpondh();
      onChanged();
      return this;
    }
    /**
     * <code>string lefnlmpondh = 2;</code>
     * @param value The bytes for lefnlmpondh to set.
     * @return This builder for chaining.
     */
    public Builder setLefnlmpondhBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lefnlmpondh_ = value;
      onChanged();
      return this;
    }

    private long emamcegccjd_ ;
    /**
     * <code>int64 emamcegccjd = 3;</code>
     * @return The emamcegccjd.
     */
    @java.lang.Override
    public long getEmamcegccjd() {
      return emamcegccjd_;
    }
    /**
     * <code>int64 emamcegccjd = 3;</code>
     * @param value The emamcegccjd to set.
     * @return This builder for chaining.
     */
    public Builder setEmamcegccjd(long value) {
      
      emamcegccjd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 emamcegccjd = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmamcegccjd() {
      
      emamcegccjd_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BJIKPGFJJKD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BJIKPGFJJKD)
  private static final POGOProtos.Rpc.BJIKPGFJJKD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BJIKPGFJJKD();
  }

  public static POGOProtos.Rpc.BJIKPGFJJKD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BJIKPGFJJKD>
      PARSER = new com.google.protobuf.AbstractParser<BJIKPGFJJKD>() {
    @java.lang.Override
    public BJIKPGFJJKD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BJIKPGFJJKD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BJIKPGFJJKD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BJIKPGFJJKD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BJIKPGFJJKD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

