// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FPJAFPHHFDN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FPJAFPHHFDN}
 */
public final class FPJAFPHHFDN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FPJAFPHHFDN)
    FPJAFPHHFDNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FPJAFPHHFDN.newBuilder() to construct.
  private FPJAFPHHFDN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FPJAFPHHFDN() {
    fkpkhgnmdld_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FPJAFPHHFDN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FPJAFPHHFDN(
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
              fkpkhgnmdld_ = new java.util.ArrayList<POGOProtos.Rpc.FIBKKLEKDHH>();
              mutable_bitField0_ |= 0x00000001;
            }
            fkpkhgnmdld_.add(
                input.readMessage(POGOProtos.Rpc.FIBKKLEKDHH.parser(), extensionRegistry));
            break;
          }
          case 16: {

            anldljbgkno_ = input.readInt32();
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
        fkpkhgnmdld_ = java.util.Collections.unmodifiableList(fkpkhgnmdld_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FPJAFPHHFDN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FPJAFPHHFDN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FPJAFPHHFDN.class, POGOProtos.Rpc.FPJAFPHHFDN.Builder.class);
  }

  public static final int FKPKHGNMDLD_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.FIBKKLEKDHH> fkpkhgnmdld_;
  /**
   * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.FIBKKLEKDHH> getFkpkhgnmdldList() {
    return fkpkhgnmdld_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.FIBKKLEKDHHOrBuilder> 
      getFkpkhgnmdldOrBuilderList() {
    return fkpkhgnmdld_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
   */
  @java.lang.Override
  public int getFkpkhgnmdldCount() {
    return fkpkhgnmdld_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.FIBKKLEKDHH getFkpkhgnmdld(int index) {
    return fkpkhgnmdld_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.FIBKKLEKDHHOrBuilder getFkpkhgnmdldOrBuilder(
      int index) {
    return fkpkhgnmdld_.get(index);
  }

  public static final int ANLDLJBGKNO_FIELD_NUMBER = 2;
  private int anldljbgkno_;
  /**
   * <code>int32 anldljbgkno = 2;</code>
   * @return The anldljbgkno.
   */
  @java.lang.Override
  public int getAnldljbgkno() {
    return anldljbgkno_;
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
    for (int i = 0; i < fkpkhgnmdld_.size(); i++) {
      output.writeMessage(1, fkpkhgnmdld_.get(i));
    }
    if (anldljbgkno_ != 0) {
      output.writeInt32(2, anldljbgkno_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < fkpkhgnmdld_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, fkpkhgnmdld_.get(i));
    }
    if (anldljbgkno_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, anldljbgkno_);
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
    if (!(obj instanceof POGOProtos.Rpc.FPJAFPHHFDN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FPJAFPHHFDN other = (POGOProtos.Rpc.FPJAFPHHFDN) obj;

    if (!getFkpkhgnmdldList()
        .equals(other.getFkpkhgnmdldList())) return false;
    if (getAnldljbgkno()
        != other.getAnldljbgkno()) return false;
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
    if (getFkpkhgnmdldCount() > 0) {
      hash = (37 * hash) + FKPKHGNMDLD_FIELD_NUMBER;
      hash = (53 * hash) + getFkpkhgnmdldList().hashCode();
    }
    hash = (37 * hash) + ANLDLJBGKNO_FIELD_NUMBER;
    hash = (53 * hash) + getAnldljbgkno();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FPJAFPHHFDN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FPJAFPHHFDN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FPJAFPHHFDN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FPJAFPHHFDN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FPJAFPHHFDN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FPJAFPHHFDN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FPJAFPHHFDN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FPJAFPHHFDN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FPJAFPHHFDN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FPJAFPHHFDN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FPJAFPHHFDN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FPJAFPHHFDN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FPJAFPHHFDN prototype) {
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
   * ref: FPJAFPHHFDN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FPJAFPHHFDN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FPJAFPHHFDN)
      POGOProtos.Rpc.FPJAFPHHFDNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FPJAFPHHFDN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FPJAFPHHFDN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FPJAFPHHFDN.class, POGOProtos.Rpc.FPJAFPHHFDN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FPJAFPHHFDN.newBuilder()
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
        getFkpkhgnmdldFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (fkpkhgnmdldBuilder_ == null) {
        fkpkhgnmdld_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        fkpkhgnmdldBuilder_.clear();
      }
      anldljbgkno_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FPJAFPHHFDN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FPJAFPHHFDN getDefaultInstanceForType() {
      return POGOProtos.Rpc.FPJAFPHHFDN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FPJAFPHHFDN build() {
      POGOProtos.Rpc.FPJAFPHHFDN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FPJAFPHHFDN buildPartial() {
      POGOProtos.Rpc.FPJAFPHHFDN result = new POGOProtos.Rpc.FPJAFPHHFDN(this);
      int from_bitField0_ = bitField0_;
      if (fkpkhgnmdldBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fkpkhgnmdld_ = java.util.Collections.unmodifiableList(fkpkhgnmdld_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fkpkhgnmdld_ = fkpkhgnmdld_;
      } else {
        result.fkpkhgnmdld_ = fkpkhgnmdldBuilder_.build();
      }
      result.anldljbgkno_ = anldljbgkno_;
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
      if (other instanceof POGOProtos.Rpc.FPJAFPHHFDN) {
        return mergeFrom((POGOProtos.Rpc.FPJAFPHHFDN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FPJAFPHHFDN other) {
      if (other == POGOProtos.Rpc.FPJAFPHHFDN.getDefaultInstance()) return this;
      if (fkpkhgnmdldBuilder_ == null) {
        if (!other.fkpkhgnmdld_.isEmpty()) {
          if (fkpkhgnmdld_.isEmpty()) {
            fkpkhgnmdld_ = other.fkpkhgnmdld_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFkpkhgnmdldIsMutable();
            fkpkhgnmdld_.addAll(other.fkpkhgnmdld_);
          }
          onChanged();
        }
      } else {
        if (!other.fkpkhgnmdld_.isEmpty()) {
          if (fkpkhgnmdldBuilder_.isEmpty()) {
            fkpkhgnmdldBuilder_.dispose();
            fkpkhgnmdldBuilder_ = null;
            fkpkhgnmdld_ = other.fkpkhgnmdld_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fkpkhgnmdldBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFkpkhgnmdldFieldBuilder() : null;
          } else {
            fkpkhgnmdldBuilder_.addAllMessages(other.fkpkhgnmdld_);
          }
        }
      }
      if (other.getAnldljbgkno() != 0) {
        setAnldljbgkno(other.getAnldljbgkno());
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
      POGOProtos.Rpc.FPJAFPHHFDN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FPJAFPHHFDN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.FIBKKLEKDHH> fkpkhgnmdld_ =
      java.util.Collections.emptyList();
    private void ensureFkpkhgnmdldIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fkpkhgnmdld_ = new java.util.ArrayList<POGOProtos.Rpc.FIBKKLEKDHH>(fkpkhgnmdld_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.FIBKKLEKDHH, POGOProtos.Rpc.FIBKKLEKDHH.Builder, POGOProtos.Rpc.FIBKKLEKDHHOrBuilder> fkpkhgnmdldBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.FIBKKLEKDHH> getFkpkhgnmdldList() {
      if (fkpkhgnmdldBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fkpkhgnmdld_);
      } else {
        return fkpkhgnmdldBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public int getFkpkhgnmdldCount() {
      if (fkpkhgnmdldBuilder_ == null) {
        return fkpkhgnmdld_.size();
      } else {
        return fkpkhgnmdldBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public POGOProtos.Rpc.FIBKKLEKDHH getFkpkhgnmdld(int index) {
      if (fkpkhgnmdldBuilder_ == null) {
        return fkpkhgnmdld_.get(index);
      } else {
        return fkpkhgnmdldBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public Builder setFkpkhgnmdld(
        int index, POGOProtos.Rpc.FIBKKLEKDHH value) {
      if (fkpkhgnmdldBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFkpkhgnmdldIsMutable();
        fkpkhgnmdld_.set(index, value);
        onChanged();
      } else {
        fkpkhgnmdldBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public Builder setFkpkhgnmdld(
        int index, POGOProtos.Rpc.FIBKKLEKDHH.Builder builderForValue) {
      if (fkpkhgnmdldBuilder_ == null) {
        ensureFkpkhgnmdldIsMutable();
        fkpkhgnmdld_.set(index, builderForValue.build());
        onChanged();
      } else {
        fkpkhgnmdldBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public Builder addFkpkhgnmdld(POGOProtos.Rpc.FIBKKLEKDHH value) {
      if (fkpkhgnmdldBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFkpkhgnmdldIsMutable();
        fkpkhgnmdld_.add(value);
        onChanged();
      } else {
        fkpkhgnmdldBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public Builder addFkpkhgnmdld(
        int index, POGOProtos.Rpc.FIBKKLEKDHH value) {
      if (fkpkhgnmdldBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFkpkhgnmdldIsMutable();
        fkpkhgnmdld_.add(index, value);
        onChanged();
      } else {
        fkpkhgnmdldBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public Builder addFkpkhgnmdld(
        POGOProtos.Rpc.FIBKKLEKDHH.Builder builderForValue) {
      if (fkpkhgnmdldBuilder_ == null) {
        ensureFkpkhgnmdldIsMutable();
        fkpkhgnmdld_.add(builderForValue.build());
        onChanged();
      } else {
        fkpkhgnmdldBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public Builder addFkpkhgnmdld(
        int index, POGOProtos.Rpc.FIBKKLEKDHH.Builder builderForValue) {
      if (fkpkhgnmdldBuilder_ == null) {
        ensureFkpkhgnmdldIsMutable();
        fkpkhgnmdld_.add(index, builderForValue.build());
        onChanged();
      } else {
        fkpkhgnmdldBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public Builder addAllFkpkhgnmdld(
        java.lang.Iterable<? extends POGOProtos.Rpc.FIBKKLEKDHH> values) {
      if (fkpkhgnmdldBuilder_ == null) {
        ensureFkpkhgnmdldIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fkpkhgnmdld_);
        onChanged();
      } else {
        fkpkhgnmdldBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public Builder clearFkpkhgnmdld() {
      if (fkpkhgnmdldBuilder_ == null) {
        fkpkhgnmdld_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fkpkhgnmdldBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public Builder removeFkpkhgnmdld(int index) {
      if (fkpkhgnmdldBuilder_ == null) {
        ensureFkpkhgnmdldIsMutable();
        fkpkhgnmdld_.remove(index);
        onChanged();
      } else {
        fkpkhgnmdldBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public POGOProtos.Rpc.FIBKKLEKDHH.Builder getFkpkhgnmdldBuilder(
        int index) {
      return getFkpkhgnmdldFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public POGOProtos.Rpc.FIBKKLEKDHHOrBuilder getFkpkhgnmdldOrBuilder(
        int index) {
      if (fkpkhgnmdldBuilder_ == null) {
        return fkpkhgnmdld_.get(index);  } else {
        return fkpkhgnmdldBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.FIBKKLEKDHHOrBuilder> 
         getFkpkhgnmdldOrBuilderList() {
      if (fkpkhgnmdldBuilder_ != null) {
        return fkpkhgnmdldBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fkpkhgnmdld_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public POGOProtos.Rpc.FIBKKLEKDHH.Builder addFkpkhgnmdldBuilder() {
      return getFkpkhgnmdldFieldBuilder().addBuilder(
          POGOProtos.Rpc.FIBKKLEKDHH.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public POGOProtos.Rpc.FIBKKLEKDHH.Builder addFkpkhgnmdldBuilder(
        int index) {
      return getFkpkhgnmdldFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.FIBKKLEKDHH.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FIBKKLEKDHH fkpkhgnmdld = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.FIBKKLEKDHH.Builder> 
         getFkpkhgnmdldBuilderList() {
      return getFkpkhgnmdldFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.FIBKKLEKDHH, POGOProtos.Rpc.FIBKKLEKDHH.Builder, POGOProtos.Rpc.FIBKKLEKDHHOrBuilder> 
        getFkpkhgnmdldFieldBuilder() {
      if (fkpkhgnmdldBuilder_ == null) {
        fkpkhgnmdldBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.FIBKKLEKDHH, POGOProtos.Rpc.FIBKKLEKDHH.Builder, POGOProtos.Rpc.FIBKKLEKDHHOrBuilder>(
                fkpkhgnmdld_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        fkpkhgnmdld_ = null;
      }
      return fkpkhgnmdldBuilder_;
    }

    private int anldljbgkno_ ;
    /**
     * <code>int32 anldljbgkno = 2;</code>
     * @return The anldljbgkno.
     */
    @java.lang.Override
    public int getAnldljbgkno() {
      return anldljbgkno_;
    }
    /**
     * <code>int32 anldljbgkno = 2;</code>
     * @param value The anldljbgkno to set.
     * @return This builder for chaining.
     */
    public Builder setAnldljbgkno(int value) {
      
      anldljbgkno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 anldljbgkno = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnldljbgkno() {
      
      anldljbgkno_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FPJAFPHHFDN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FPJAFPHHFDN)
  private static final POGOProtos.Rpc.FPJAFPHHFDN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FPJAFPHHFDN();
  }

  public static POGOProtos.Rpc.FPJAFPHHFDN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FPJAFPHHFDN>
      PARSER = new com.google.protobuf.AbstractParser<FPJAFPHHFDN>() {
    @java.lang.Override
    public FPJAFPHHFDN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FPJAFPHHFDN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FPJAFPHHFDN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FPJAFPHHFDN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FPJAFPHHFDN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

