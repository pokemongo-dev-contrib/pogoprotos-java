// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: GPKLMIFNKBE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GPKLMIFNKBE}
 */
public final class GPKLMIFNKBE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GPKLMIFNKBE)
    GPKLMIFNKBEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GPKLMIFNKBE.newBuilder() to construct.
  private GPKLMIFNKBE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GPKLMIFNKBE() {
    ofaneehdcfm_ = 0;
    bnfnaombmdf_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GPKLMIFNKBE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GPKLMIFNKBE(
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

            ofaneehdcfm_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              bnfnaombmdf_ = new java.util.ArrayList<POGOProtos.Rpc.ILFCCGOCMBP>();
              mutable_bitField0_ |= 0x00000001;
            }
            bnfnaombmdf_.add(
                input.readMessage(POGOProtos.Rpc.ILFCCGOCMBP.parser(), extensionRegistry));
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
        bnfnaombmdf_ = java.util.Collections.unmodifiableList(bnfnaombmdf_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GPKLMIFNKBE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GPKLMIFNKBE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GPKLMIFNKBE.class, POGOProtos.Rpc.GPKLMIFNKBE.Builder.class);
  }

  public static final int OFANEEHDCFM_FIELD_NUMBER = 1;
  private int ofaneehdcfm_;
  /**
   * <code>.POGOProtos.Rpc.NGJHAEPFGGB ofaneehdcfm = 1;</code>
   * @return The enum numeric value on the wire for ofaneehdcfm.
   */
  @java.lang.Override public int getOfaneehdcfmValue() {
    return ofaneehdcfm_;
  }
  /**
   * <code>.POGOProtos.Rpc.NGJHAEPFGGB ofaneehdcfm = 1;</code>
   * @return The ofaneehdcfm.
   */
  @java.lang.Override public POGOProtos.Rpc.NGJHAEPFGGB getOfaneehdcfm() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NGJHAEPFGGB result = POGOProtos.Rpc.NGJHAEPFGGB.valueOf(ofaneehdcfm_);
    return result == null ? POGOProtos.Rpc.NGJHAEPFGGB.UNRECOGNIZED : result;
  }

  public static final int BNFNAOMBMDF_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.ILFCCGOCMBP> bnfnaombmdf_;
  /**
   * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.ILFCCGOCMBP> getBnfnaombmdfList() {
    return bnfnaombmdf_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.ILFCCGOCMBPOrBuilder> 
      getBnfnaombmdfOrBuilderList() {
    return bnfnaombmdf_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
   */
  @java.lang.Override
  public int getBnfnaombmdfCount() {
    return bnfnaombmdf_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ILFCCGOCMBP getBnfnaombmdf(int index) {
    return bnfnaombmdf_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ILFCCGOCMBPOrBuilder getBnfnaombmdfOrBuilder(
      int index) {
    return bnfnaombmdf_.get(index);
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
    if (ofaneehdcfm_ != POGOProtos.Rpc.NGJHAEPFGGB.NGJHAEPFGGB_POKEMON_UNSET.getNumber()) {
      output.writeEnum(1, ofaneehdcfm_);
    }
    for (int i = 0; i < bnfnaombmdf_.size(); i++) {
      output.writeMessage(2, bnfnaombmdf_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ofaneehdcfm_ != POGOProtos.Rpc.NGJHAEPFGGB.NGJHAEPFGGB_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ofaneehdcfm_);
    }
    for (int i = 0; i < bnfnaombmdf_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, bnfnaombmdf_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.GPKLMIFNKBE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GPKLMIFNKBE other = (POGOProtos.Rpc.GPKLMIFNKBE) obj;

    if (ofaneehdcfm_ != other.ofaneehdcfm_) return false;
    if (!getBnfnaombmdfList()
        .equals(other.getBnfnaombmdfList())) return false;
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
    hash = (37 * hash) + OFANEEHDCFM_FIELD_NUMBER;
    hash = (53 * hash) + ofaneehdcfm_;
    if (getBnfnaombmdfCount() > 0) {
      hash = (37 * hash) + BNFNAOMBMDF_FIELD_NUMBER;
      hash = (53 * hash) + getBnfnaombmdfList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GPKLMIFNKBE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GPKLMIFNKBE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GPKLMIFNKBE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GPKLMIFNKBE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GPKLMIFNKBE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GPKLMIFNKBE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GPKLMIFNKBE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GPKLMIFNKBE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GPKLMIFNKBE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GPKLMIFNKBE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GPKLMIFNKBE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GPKLMIFNKBE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GPKLMIFNKBE prototype) {
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
   * ref: GPKLMIFNKBE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GPKLMIFNKBE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GPKLMIFNKBE)
      POGOProtos.Rpc.GPKLMIFNKBEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GPKLMIFNKBE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GPKLMIFNKBE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GPKLMIFNKBE.class, POGOProtos.Rpc.GPKLMIFNKBE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GPKLMIFNKBE.newBuilder()
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
        getBnfnaombmdfFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      ofaneehdcfm_ = 0;

      if (bnfnaombmdfBuilder_ == null) {
        bnfnaombmdf_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        bnfnaombmdfBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GPKLMIFNKBE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GPKLMIFNKBE getDefaultInstanceForType() {
      return POGOProtos.Rpc.GPKLMIFNKBE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GPKLMIFNKBE build() {
      POGOProtos.Rpc.GPKLMIFNKBE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GPKLMIFNKBE buildPartial() {
      POGOProtos.Rpc.GPKLMIFNKBE result = new POGOProtos.Rpc.GPKLMIFNKBE(this);
      int from_bitField0_ = bitField0_;
      result.ofaneehdcfm_ = ofaneehdcfm_;
      if (bnfnaombmdfBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bnfnaombmdf_ = java.util.Collections.unmodifiableList(bnfnaombmdf_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bnfnaombmdf_ = bnfnaombmdf_;
      } else {
        result.bnfnaombmdf_ = bnfnaombmdfBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.GPKLMIFNKBE) {
        return mergeFrom((POGOProtos.Rpc.GPKLMIFNKBE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GPKLMIFNKBE other) {
      if (other == POGOProtos.Rpc.GPKLMIFNKBE.getDefaultInstance()) return this;
      if (other.ofaneehdcfm_ != 0) {
        setOfaneehdcfmValue(other.getOfaneehdcfmValue());
      }
      if (bnfnaombmdfBuilder_ == null) {
        if (!other.bnfnaombmdf_.isEmpty()) {
          if (bnfnaombmdf_.isEmpty()) {
            bnfnaombmdf_ = other.bnfnaombmdf_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBnfnaombmdfIsMutable();
            bnfnaombmdf_.addAll(other.bnfnaombmdf_);
          }
          onChanged();
        }
      } else {
        if (!other.bnfnaombmdf_.isEmpty()) {
          if (bnfnaombmdfBuilder_.isEmpty()) {
            bnfnaombmdfBuilder_.dispose();
            bnfnaombmdfBuilder_ = null;
            bnfnaombmdf_ = other.bnfnaombmdf_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bnfnaombmdfBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBnfnaombmdfFieldBuilder() : null;
          } else {
            bnfnaombmdfBuilder_.addAllMessages(other.bnfnaombmdf_);
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
      POGOProtos.Rpc.GPKLMIFNKBE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GPKLMIFNKBE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int ofaneehdcfm_ = 0;
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB ofaneehdcfm = 1;</code>
     * @return The enum numeric value on the wire for ofaneehdcfm.
     */
    @java.lang.Override public int getOfaneehdcfmValue() {
      return ofaneehdcfm_;
    }
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB ofaneehdcfm = 1;</code>
     * @param value The enum numeric value on the wire for ofaneehdcfm to set.
     * @return This builder for chaining.
     */
    public Builder setOfaneehdcfmValue(int value) {
      
      ofaneehdcfm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB ofaneehdcfm = 1;</code>
     * @return The ofaneehdcfm.
     */
    @java.lang.Override
    public POGOProtos.Rpc.NGJHAEPFGGB getOfaneehdcfm() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NGJHAEPFGGB result = POGOProtos.Rpc.NGJHAEPFGGB.valueOf(ofaneehdcfm_);
      return result == null ? POGOProtos.Rpc.NGJHAEPFGGB.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB ofaneehdcfm = 1;</code>
     * @param value The ofaneehdcfm to set.
     * @return This builder for chaining.
     */
    public Builder setOfaneehdcfm(POGOProtos.Rpc.NGJHAEPFGGB value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ofaneehdcfm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB ofaneehdcfm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOfaneehdcfm() {
      
      ofaneehdcfm_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.ILFCCGOCMBP> bnfnaombmdf_ =
      java.util.Collections.emptyList();
    private void ensureBnfnaombmdfIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bnfnaombmdf_ = new java.util.ArrayList<POGOProtos.Rpc.ILFCCGOCMBP>(bnfnaombmdf_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.ILFCCGOCMBP, POGOProtos.Rpc.ILFCCGOCMBP.Builder, POGOProtos.Rpc.ILFCCGOCMBPOrBuilder> bnfnaombmdfBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.ILFCCGOCMBP> getBnfnaombmdfList() {
      if (bnfnaombmdfBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bnfnaombmdf_);
      } else {
        return bnfnaombmdfBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public int getBnfnaombmdfCount() {
      if (bnfnaombmdfBuilder_ == null) {
        return bnfnaombmdf_.size();
      } else {
        return bnfnaombmdfBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public POGOProtos.Rpc.ILFCCGOCMBP getBnfnaombmdf(int index) {
      if (bnfnaombmdfBuilder_ == null) {
        return bnfnaombmdf_.get(index);
      } else {
        return bnfnaombmdfBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public Builder setBnfnaombmdf(
        int index, POGOProtos.Rpc.ILFCCGOCMBP value) {
      if (bnfnaombmdfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBnfnaombmdfIsMutable();
        bnfnaombmdf_.set(index, value);
        onChanged();
      } else {
        bnfnaombmdfBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public Builder setBnfnaombmdf(
        int index, POGOProtos.Rpc.ILFCCGOCMBP.Builder builderForValue) {
      if (bnfnaombmdfBuilder_ == null) {
        ensureBnfnaombmdfIsMutable();
        bnfnaombmdf_.set(index, builderForValue.build());
        onChanged();
      } else {
        bnfnaombmdfBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public Builder addBnfnaombmdf(POGOProtos.Rpc.ILFCCGOCMBP value) {
      if (bnfnaombmdfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBnfnaombmdfIsMutable();
        bnfnaombmdf_.add(value);
        onChanged();
      } else {
        bnfnaombmdfBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public Builder addBnfnaombmdf(
        int index, POGOProtos.Rpc.ILFCCGOCMBP value) {
      if (bnfnaombmdfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBnfnaombmdfIsMutable();
        bnfnaombmdf_.add(index, value);
        onChanged();
      } else {
        bnfnaombmdfBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public Builder addBnfnaombmdf(
        POGOProtos.Rpc.ILFCCGOCMBP.Builder builderForValue) {
      if (bnfnaombmdfBuilder_ == null) {
        ensureBnfnaombmdfIsMutable();
        bnfnaombmdf_.add(builderForValue.build());
        onChanged();
      } else {
        bnfnaombmdfBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public Builder addBnfnaombmdf(
        int index, POGOProtos.Rpc.ILFCCGOCMBP.Builder builderForValue) {
      if (bnfnaombmdfBuilder_ == null) {
        ensureBnfnaombmdfIsMutable();
        bnfnaombmdf_.add(index, builderForValue.build());
        onChanged();
      } else {
        bnfnaombmdfBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public Builder addAllBnfnaombmdf(
        java.lang.Iterable<? extends POGOProtos.Rpc.ILFCCGOCMBP> values) {
      if (bnfnaombmdfBuilder_ == null) {
        ensureBnfnaombmdfIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bnfnaombmdf_);
        onChanged();
      } else {
        bnfnaombmdfBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public Builder clearBnfnaombmdf() {
      if (bnfnaombmdfBuilder_ == null) {
        bnfnaombmdf_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bnfnaombmdfBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public Builder removeBnfnaombmdf(int index) {
      if (bnfnaombmdfBuilder_ == null) {
        ensureBnfnaombmdfIsMutable();
        bnfnaombmdf_.remove(index);
        onChanged();
      } else {
        bnfnaombmdfBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public POGOProtos.Rpc.ILFCCGOCMBP.Builder getBnfnaombmdfBuilder(
        int index) {
      return getBnfnaombmdfFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public POGOProtos.Rpc.ILFCCGOCMBPOrBuilder getBnfnaombmdfOrBuilder(
        int index) {
      if (bnfnaombmdfBuilder_ == null) {
        return bnfnaombmdf_.get(index);  } else {
        return bnfnaombmdfBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.ILFCCGOCMBPOrBuilder> 
         getBnfnaombmdfOrBuilderList() {
      if (bnfnaombmdfBuilder_ != null) {
        return bnfnaombmdfBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bnfnaombmdf_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public POGOProtos.Rpc.ILFCCGOCMBP.Builder addBnfnaombmdfBuilder() {
      return getBnfnaombmdfFieldBuilder().addBuilder(
          POGOProtos.Rpc.ILFCCGOCMBP.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public POGOProtos.Rpc.ILFCCGOCMBP.Builder addBnfnaombmdfBuilder(
        int index) {
      return getBnfnaombmdfFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.ILFCCGOCMBP.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ILFCCGOCMBP bnfnaombmdf = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.ILFCCGOCMBP.Builder> 
         getBnfnaombmdfBuilderList() {
      return getBnfnaombmdfFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.ILFCCGOCMBP, POGOProtos.Rpc.ILFCCGOCMBP.Builder, POGOProtos.Rpc.ILFCCGOCMBPOrBuilder> 
        getBnfnaombmdfFieldBuilder() {
      if (bnfnaombmdfBuilder_ == null) {
        bnfnaombmdfBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.ILFCCGOCMBP, POGOProtos.Rpc.ILFCCGOCMBP.Builder, POGOProtos.Rpc.ILFCCGOCMBPOrBuilder>(
                bnfnaombmdf_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bnfnaombmdf_ = null;
      }
      return bnfnaombmdfBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GPKLMIFNKBE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GPKLMIFNKBE)
  private static final POGOProtos.Rpc.GPKLMIFNKBE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GPKLMIFNKBE();
  }

  public static POGOProtos.Rpc.GPKLMIFNKBE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GPKLMIFNKBE>
      PARSER = new com.google.protobuf.AbstractParser<GPKLMIFNKBE>() {
    @java.lang.Override
    public GPKLMIFNKBE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GPKLMIFNKBE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GPKLMIFNKBE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GPKLMIFNKBE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GPKLMIFNKBE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

