// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BOKLNCKKFDE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BOKLNCKKFDE}
 */
public final class BOKLNCKKFDE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BOKLNCKKFDE)
    BOKLNCKKFDEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BOKLNCKKFDE.newBuilder() to construct.
  private BOKLNCKKFDE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BOKLNCKKFDE() {
    npofgidldag_ = "";
    ppljipmkgnd_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BOKLNCKKFDE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BOKLNCKKFDE(
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

            lbnnjjdgpfg_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            npofgidldag_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ppljipmkgnd_ = new java.util.ArrayList<POGOProtos.Rpc.NFKAMFICHCI>();
              mutable_bitField0_ |= 0x00000001;
            }
            ppljipmkgnd_.add(
                input.readMessage(POGOProtos.Rpc.NFKAMFICHCI.parser(), extensionRegistry));
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
        ppljipmkgnd_ = java.util.Collections.unmodifiableList(ppljipmkgnd_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BOKLNCKKFDE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BOKLNCKKFDE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BOKLNCKKFDE.class, POGOProtos.Rpc.BOKLNCKKFDE.Builder.class);
  }

  public static final int LBNNJJDGPFG_FIELD_NUMBER = 1;
  private long lbnnjjdgpfg_;
  /**
   * <code>uint64 lbnnjjdgpfg = 1;</code>
   * @return The lbnnjjdgpfg.
   */
  @java.lang.Override
  public long getLbnnjjdgpfg() {
    return lbnnjjdgpfg_;
  }

  public static final int NPOFGIDLDAG_FIELD_NUMBER = 2;
  private volatile java.lang.Object npofgidldag_;
  /**
   * <code>string npofgidldag = 2;</code>
   * @return The npofgidldag.
   */
  @java.lang.Override
  public java.lang.String getNpofgidldag() {
    java.lang.Object ref = npofgidldag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      npofgidldag_ = s;
      return s;
    }
  }
  /**
   * <code>string npofgidldag = 2;</code>
   * @return The bytes for npofgidldag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNpofgidldagBytes() {
    java.lang.Object ref = npofgidldag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      npofgidldag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PPLJIPMKGND_FIELD_NUMBER = 3;
  private java.util.List<POGOProtos.Rpc.NFKAMFICHCI> ppljipmkgnd_;
  /**
   * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.NFKAMFICHCI> getPpljipmkgndList() {
    return ppljipmkgnd_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.NFKAMFICHCIOrBuilder> 
      getPpljipmkgndOrBuilderList() {
    return ppljipmkgnd_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
   */
  @java.lang.Override
  public int getPpljipmkgndCount() {
    return ppljipmkgnd_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.NFKAMFICHCI getPpljipmkgnd(int index) {
    return ppljipmkgnd_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.NFKAMFICHCIOrBuilder getPpljipmkgndOrBuilder(
      int index) {
    return ppljipmkgnd_.get(index);
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
    if (lbnnjjdgpfg_ != 0L) {
      output.writeUInt64(1, lbnnjjdgpfg_);
    }
    if (!getNpofgidldagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, npofgidldag_);
    }
    for (int i = 0; i < ppljipmkgnd_.size(); i++) {
      output.writeMessage(3, ppljipmkgnd_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lbnnjjdgpfg_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, lbnnjjdgpfg_);
    }
    if (!getNpofgidldagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, npofgidldag_);
    }
    for (int i = 0; i < ppljipmkgnd_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, ppljipmkgnd_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.BOKLNCKKFDE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BOKLNCKKFDE other = (POGOProtos.Rpc.BOKLNCKKFDE) obj;

    if (getLbnnjjdgpfg()
        != other.getLbnnjjdgpfg()) return false;
    if (!getNpofgidldag()
        .equals(other.getNpofgidldag())) return false;
    if (!getPpljipmkgndList()
        .equals(other.getPpljipmkgndList())) return false;
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
    hash = (37 * hash) + LBNNJJDGPFG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLbnnjjdgpfg());
    hash = (37 * hash) + NPOFGIDLDAG_FIELD_NUMBER;
    hash = (53 * hash) + getNpofgidldag().hashCode();
    if (getPpljipmkgndCount() > 0) {
      hash = (37 * hash) + PPLJIPMKGND_FIELD_NUMBER;
      hash = (53 * hash) + getPpljipmkgndList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BOKLNCKKFDE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BOKLNCKKFDE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BOKLNCKKFDE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BOKLNCKKFDE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BOKLNCKKFDE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BOKLNCKKFDE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BOKLNCKKFDE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BOKLNCKKFDE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BOKLNCKKFDE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BOKLNCKKFDE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BOKLNCKKFDE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BOKLNCKKFDE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BOKLNCKKFDE prototype) {
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
   * ref: BOKLNCKKFDE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BOKLNCKKFDE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BOKLNCKKFDE)
      POGOProtos.Rpc.BOKLNCKKFDEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BOKLNCKKFDE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BOKLNCKKFDE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BOKLNCKKFDE.class, POGOProtos.Rpc.BOKLNCKKFDE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BOKLNCKKFDE.newBuilder()
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
        getPpljipmkgndFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      lbnnjjdgpfg_ = 0L;

      npofgidldag_ = "";

      if (ppljipmkgndBuilder_ == null) {
        ppljipmkgnd_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ppljipmkgndBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BOKLNCKKFDE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BOKLNCKKFDE getDefaultInstanceForType() {
      return POGOProtos.Rpc.BOKLNCKKFDE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BOKLNCKKFDE build() {
      POGOProtos.Rpc.BOKLNCKKFDE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BOKLNCKKFDE buildPartial() {
      POGOProtos.Rpc.BOKLNCKKFDE result = new POGOProtos.Rpc.BOKLNCKKFDE(this);
      int from_bitField0_ = bitField0_;
      result.lbnnjjdgpfg_ = lbnnjjdgpfg_;
      result.npofgidldag_ = npofgidldag_;
      if (ppljipmkgndBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ppljipmkgnd_ = java.util.Collections.unmodifiableList(ppljipmkgnd_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ppljipmkgnd_ = ppljipmkgnd_;
      } else {
        result.ppljipmkgnd_ = ppljipmkgndBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.BOKLNCKKFDE) {
        return mergeFrom((POGOProtos.Rpc.BOKLNCKKFDE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BOKLNCKKFDE other) {
      if (other == POGOProtos.Rpc.BOKLNCKKFDE.getDefaultInstance()) return this;
      if (other.getLbnnjjdgpfg() != 0L) {
        setLbnnjjdgpfg(other.getLbnnjjdgpfg());
      }
      if (!other.getNpofgidldag().isEmpty()) {
        npofgidldag_ = other.npofgidldag_;
        onChanged();
      }
      if (ppljipmkgndBuilder_ == null) {
        if (!other.ppljipmkgnd_.isEmpty()) {
          if (ppljipmkgnd_.isEmpty()) {
            ppljipmkgnd_ = other.ppljipmkgnd_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePpljipmkgndIsMutable();
            ppljipmkgnd_.addAll(other.ppljipmkgnd_);
          }
          onChanged();
        }
      } else {
        if (!other.ppljipmkgnd_.isEmpty()) {
          if (ppljipmkgndBuilder_.isEmpty()) {
            ppljipmkgndBuilder_.dispose();
            ppljipmkgndBuilder_ = null;
            ppljipmkgnd_ = other.ppljipmkgnd_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ppljipmkgndBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPpljipmkgndFieldBuilder() : null;
          } else {
            ppljipmkgndBuilder_.addAllMessages(other.ppljipmkgnd_);
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
      POGOProtos.Rpc.BOKLNCKKFDE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BOKLNCKKFDE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long lbnnjjdgpfg_ ;
    /**
     * <code>uint64 lbnnjjdgpfg = 1;</code>
     * @return The lbnnjjdgpfg.
     */
    @java.lang.Override
    public long getLbnnjjdgpfg() {
      return lbnnjjdgpfg_;
    }
    /**
     * <code>uint64 lbnnjjdgpfg = 1;</code>
     * @param value The lbnnjjdgpfg to set.
     * @return This builder for chaining.
     */
    public Builder setLbnnjjdgpfg(long value) {
      
      lbnnjjdgpfg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 lbnnjjdgpfg = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLbnnjjdgpfg() {
      
      lbnnjjdgpfg_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object npofgidldag_ = "";
    /**
     * <code>string npofgidldag = 2;</code>
     * @return The npofgidldag.
     */
    public java.lang.String getNpofgidldag() {
      java.lang.Object ref = npofgidldag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        npofgidldag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string npofgidldag = 2;</code>
     * @return The bytes for npofgidldag.
     */
    public com.google.protobuf.ByteString
        getNpofgidldagBytes() {
      java.lang.Object ref = npofgidldag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        npofgidldag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string npofgidldag = 2;</code>
     * @param value The npofgidldag to set.
     * @return This builder for chaining.
     */
    public Builder setNpofgidldag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      npofgidldag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string npofgidldag = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNpofgidldag() {
      
      npofgidldag_ = getDefaultInstance().getNpofgidldag();
      onChanged();
      return this;
    }
    /**
     * <code>string npofgidldag = 2;</code>
     * @param value The bytes for npofgidldag to set.
     * @return This builder for chaining.
     */
    public Builder setNpofgidldagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      npofgidldag_ = value;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.NFKAMFICHCI> ppljipmkgnd_ =
      java.util.Collections.emptyList();
    private void ensurePpljipmkgndIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ppljipmkgnd_ = new java.util.ArrayList<POGOProtos.Rpc.NFKAMFICHCI>(ppljipmkgnd_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.NFKAMFICHCI, POGOProtos.Rpc.NFKAMFICHCI.Builder, POGOProtos.Rpc.NFKAMFICHCIOrBuilder> ppljipmkgndBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public java.util.List<POGOProtos.Rpc.NFKAMFICHCI> getPpljipmkgndList() {
      if (ppljipmkgndBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ppljipmkgnd_);
      } else {
        return ppljipmkgndBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public int getPpljipmkgndCount() {
      if (ppljipmkgndBuilder_ == null) {
        return ppljipmkgnd_.size();
      } else {
        return ppljipmkgndBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public POGOProtos.Rpc.NFKAMFICHCI getPpljipmkgnd(int index) {
      if (ppljipmkgndBuilder_ == null) {
        return ppljipmkgnd_.get(index);
      } else {
        return ppljipmkgndBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public Builder setPpljipmkgnd(
        int index, POGOProtos.Rpc.NFKAMFICHCI value) {
      if (ppljipmkgndBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePpljipmkgndIsMutable();
        ppljipmkgnd_.set(index, value);
        onChanged();
      } else {
        ppljipmkgndBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public Builder setPpljipmkgnd(
        int index, POGOProtos.Rpc.NFKAMFICHCI.Builder builderForValue) {
      if (ppljipmkgndBuilder_ == null) {
        ensurePpljipmkgndIsMutable();
        ppljipmkgnd_.set(index, builderForValue.build());
        onChanged();
      } else {
        ppljipmkgndBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public Builder addPpljipmkgnd(POGOProtos.Rpc.NFKAMFICHCI value) {
      if (ppljipmkgndBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePpljipmkgndIsMutable();
        ppljipmkgnd_.add(value);
        onChanged();
      } else {
        ppljipmkgndBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public Builder addPpljipmkgnd(
        int index, POGOProtos.Rpc.NFKAMFICHCI value) {
      if (ppljipmkgndBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePpljipmkgndIsMutable();
        ppljipmkgnd_.add(index, value);
        onChanged();
      } else {
        ppljipmkgndBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public Builder addPpljipmkgnd(
        POGOProtos.Rpc.NFKAMFICHCI.Builder builderForValue) {
      if (ppljipmkgndBuilder_ == null) {
        ensurePpljipmkgndIsMutable();
        ppljipmkgnd_.add(builderForValue.build());
        onChanged();
      } else {
        ppljipmkgndBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public Builder addPpljipmkgnd(
        int index, POGOProtos.Rpc.NFKAMFICHCI.Builder builderForValue) {
      if (ppljipmkgndBuilder_ == null) {
        ensurePpljipmkgndIsMutable();
        ppljipmkgnd_.add(index, builderForValue.build());
        onChanged();
      } else {
        ppljipmkgndBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public Builder addAllPpljipmkgnd(
        java.lang.Iterable<? extends POGOProtos.Rpc.NFKAMFICHCI> values) {
      if (ppljipmkgndBuilder_ == null) {
        ensurePpljipmkgndIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ppljipmkgnd_);
        onChanged();
      } else {
        ppljipmkgndBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public Builder clearPpljipmkgnd() {
      if (ppljipmkgndBuilder_ == null) {
        ppljipmkgnd_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ppljipmkgndBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public Builder removePpljipmkgnd(int index) {
      if (ppljipmkgndBuilder_ == null) {
        ensurePpljipmkgndIsMutable();
        ppljipmkgnd_.remove(index);
        onChanged();
      } else {
        ppljipmkgndBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public POGOProtos.Rpc.NFKAMFICHCI.Builder getPpljipmkgndBuilder(
        int index) {
      return getPpljipmkgndFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public POGOProtos.Rpc.NFKAMFICHCIOrBuilder getPpljipmkgndOrBuilder(
        int index) {
      if (ppljipmkgndBuilder_ == null) {
        return ppljipmkgnd_.get(index);  } else {
        return ppljipmkgndBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.NFKAMFICHCIOrBuilder> 
         getPpljipmkgndOrBuilderList() {
      if (ppljipmkgndBuilder_ != null) {
        return ppljipmkgndBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ppljipmkgnd_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public POGOProtos.Rpc.NFKAMFICHCI.Builder addPpljipmkgndBuilder() {
      return getPpljipmkgndFieldBuilder().addBuilder(
          POGOProtos.Rpc.NFKAMFICHCI.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public POGOProtos.Rpc.NFKAMFICHCI.Builder addPpljipmkgndBuilder(
        int index) {
      return getPpljipmkgndFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.NFKAMFICHCI.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NFKAMFICHCI ppljipmkgnd = 3;</code>
     */
    public java.util.List<POGOProtos.Rpc.NFKAMFICHCI.Builder> 
         getPpljipmkgndBuilderList() {
      return getPpljipmkgndFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.NFKAMFICHCI, POGOProtos.Rpc.NFKAMFICHCI.Builder, POGOProtos.Rpc.NFKAMFICHCIOrBuilder> 
        getPpljipmkgndFieldBuilder() {
      if (ppljipmkgndBuilder_ == null) {
        ppljipmkgndBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.NFKAMFICHCI, POGOProtos.Rpc.NFKAMFICHCI.Builder, POGOProtos.Rpc.NFKAMFICHCIOrBuilder>(
                ppljipmkgnd_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ppljipmkgnd_ = null;
      }
      return ppljipmkgndBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BOKLNCKKFDE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BOKLNCKKFDE)
  private static final POGOProtos.Rpc.BOKLNCKKFDE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BOKLNCKKFDE();
  }

  public static POGOProtos.Rpc.BOKLNCKKFDE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BOKLNCKKFDE>
      PARSER = new com.google.protobuf.AbstractParser<BOKLNCKKFDE>() {
    @java.lang.Override
    public BOKLNCKKFDE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BOKLNCKKFDE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BOKLNCKKFDE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BOKLNCKKFDE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BOKLNCKKFDE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

