// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.OCIDDBLFPIP}
 */
public  final class OCIDDBLFPIP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OCIDDBLFPIP)
    OCIDDBLFPIPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OCIDDBLFPIP.newBuilder() to construct.
  private OCIDDBLFPIP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OCIDDBLFPIP() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OCIDDBLFPIP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OCIDDBLFPIP(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            dkahfnfnkjn_ = input.readBool();
            break;
          }
          case 16: {

            dbjbglnlgcl_ = input.readInt32();
            break;
          }
          case 24: {

            bkfgbocepha_ = input.readBool();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OCIDDBLFPIP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OCIDDBLFPIP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OCIDDBLFPIP.class, POGOProtos.Rpc.OCIDDBLFPIP.Builder.class);
  }

  public static final int DKAHFNFNKJN_FIELD_NUMBER = 1;
  private boolean dkahfnfnkjn_;
  /**
   * <code>bool dkahfnfnkjn = 1;</code>
   * @return The dkahfnfnkjn.
   */
  public boolean getDkahfnfnkjn() {
    return dkahfnfnkjn_;
  }

  public static final int DBJBGLNLGCL_FIELD_NUMBER = 2;
  private int dbjbglnlgcl_;
  /**
   * <code>int32 dbjbglnlgcl = 2;</code>
   * @return The dbjbglnlgcl.
   */
  public int getDbjbglnlgcl() {
    return dbjbglnlgcl_;
  }

  public static final int BKFGBOCEPHA_FIELD_NUMBER = 3;
  private boolean bkfgbocepha_;
  /**
   * <code>bool bkfgbocepha = 3;</code>
   * @return The bkfgbocepha.
   */
  public boolean getBkfgbocepha() {
    return bkfgbocepha_;
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
    if (dkahfnfnkjn_ != false) {
      output.writeBool(1, dkahfnfnkjn_);
    }
    if (dbjbglnlgcl_ != 0) {
      output.writeInt32(2, dbjbglnlgcl_);
    }
    if (bkfgbocepha_ != false) {
      output.writeBool(3, bkfgbocepha_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dkahfnfnkjn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, dkahfnfnkjn_);
    }
    if (dbjbglnlgcl_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, dbjbglnlgcl_);
    }
    if (bkfgbocepha_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, bkfgbocepha_);
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
    if (!(obj instanceof POGOProtos.Rpc.OCIDDBLFPIP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OCIDDBLFPIP other = (POGOProtos.Rpc.OCIDDBLFPIP) obj;

    if (getDkahfnfnkjn()
        != other.getDkahfnfnkjn()) return false;
    if (getDbjbglnlgcl()
        != other.getDbjbglnlgcl()) return false;
    if (getBkfgbocepha()
        != other.getBkfgbocepha()) return false;
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
    hash = (37 * hash) + DKAHFNFNKJN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDkahfnfnkjn());
    hash = (37 * hash) + DBJBGLNLGCL_FIELD_NUMBER;
    hash = (53 * hash) + getDbjbglnlgcl();
    hash = (37 * hash) + BKFGBOCEPHA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBkfgbocepha());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OCIDDBLFPIP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OCIDDBLFPIP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OCIDDBLFPIP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OCIDDBLFPIP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OCIDDBLFPIP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OCIDDBLFPIP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OCIDDBLFPIP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OCIDDBLFPIP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OCIDDBLFPIP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OCIDDBLFPIP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OCIDDBLFPIP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OCIDDBLFPIP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OCIDDBLFPIP prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.OCIDDBLFPIP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OCIDDBLFPIP)
      POGOProtos.Rpc.OCIDDBLFPIPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OCIDDBLFPIP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OCIDDBLFPIP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OCIDDBLFPIP.class, POGOProtos.Rpc.OCIDDBLFPIP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OCIDDBLFPIP.newBuilder()
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
      dkahfnfnkjn_ = false;

      dbjbglnlgcl_ = 0;

      bkfgbocepha_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OCIDDBLFPIP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OCIDDBLFPIP getDefaultInstanceForType() {
      return POGOProtos.Rpc.OCIDDBLFPIP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OCIDDBLFPIP build() {
      POGOProtos.Rpc.OCIDDBLFPIP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OCIDDBLFPIP buildPartial() {
      POGOProtos.Rpc.OCIDDBLFPIP result = new POGOProtos.Rpc.OCIDDBLFPIP(this);
      result.dkahfnfnkjn_ = dkahfnfnkjn_;
      result.dbjbglnlgcl_ = dbjbglnlgcl_;
      result.bkfgbocepha_ = bkfgbocepha_;
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
      if (other instanceof POGOProtos.Rpc.OCIDDBLFPIP) {
        return mergeFrom((POGOProtos.Rpc.OCIDDBLFPIP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OCIDDBLFPIP other) {
      if (other == POGOProtos.Rpc.OCIDDBLFPIP.getDefaultInstance()) return this;
      if (other.getDkahfnfnkjn() != false) {
        setDkahfnfnkjn(other.getDkahfnfnkjn());
      }
      if (other.getDbjbglnlgcl() != 0) {
        setDbjbglnlgcl(other.getDbjbglnlgcl());
      }
      if (other.getBkfgbocepha() != false) {
        setBkfgbocepha(other.getBkfgbocepha());
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
      POGOProtos.Rpc.OCIDDBLFPIP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OCIDDBLFPIP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean dkahfnfnkjn_ ;
    /**
     * <code>bool dkahfnfnkjn = 1;</code>
     * @return The dkahfnfnkjn.
     */
    public boolean getDkahfnfnkjn() {
      return dkahfnfnkjn_;
    }
    /**
     * <code>bool dkahfnfnkjn = 1;</code>
     * @param value The dkahfnfnkjn to set.
     * @return This builder for chaining.
     */
    public Builder setDkahfnfnkjn(boolean value) {
      
      dkahfnfnkjn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool dkahfnfnkjn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDkahfnfnkjn() {
      
      dkahfnfnkjn_ = false;
      onChanged();
      return this;
    }

    private int dbjbglnlgcl_ ;
    /**
     * <code>int32 dbjbglnlgcl = 2;</code>
     * @return The dbjbglnlgcl.
     */
    public int getDbjbglnlgcl() {
      return dbjbglnlgcl_;
    }
    /**
     * <code>int32 dbjbglnlgcl = 2;</code>
     * @param value The dbjbglnlgcl to set.
     * @return This builder for chaining.
     */
    public Builder setDbjbglnlgcl(int value) {
      
      dbjbglnlgcl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 dbjbglnlgcl = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDbjbglnlgcl() {
      
      dbjbglnlgcl_ = 0;
      onChanged();
      return this;
    }

    private boolean bkfgbocepha_ ;
    /**
     * <code>bool bkfgbocepha = 3;</code>
     * @return The bkfgbocepha.
     */
    public boolean getBkfgbocepha() {
      return bkfgbocepha_;
    }
    /**
     * <code>bool bkfgbocepha = 3;</code>
     * @param value The bkfgbocepha to set.
     * @return This builder for chaining.
     */
    public Builder setBkfgbocepha(boolean value) {
      
      bkfgbocepha_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool bkfgbocepha = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBkfgbocepha() {
      
      bkfgbocepha_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OCIDDBLFPIP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OCIDDBLFPIP)
  private static final POGOProtos.Rpc.OCIDDBLFPIP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OCIDDBLFPIP();
  }

  public static POGOProtos.Rpc.OCIDDBLFPIP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OCIDDBLFPIP>
      PARSER = new com.google.protobuf.AbstractParser<OCIDDBLFPIP>() {
    @java.lang.Override
    public OCIDDBLFPIP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OCIDDBLFPIP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OCIDDBLFPIP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OCIDDBLFPIP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OCIDDBLFPIP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

