// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FHONAFGFJFM
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FHONAFGFJFM}
 */
public final class FHONAFGFJFM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FHONAFGFJFM)
    FHONAFGFJFMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FHONAFGFJFM.newBuilder() to construct.
  private FHONAFGFJFM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FHONAFGFJFM() {
    ddmflcmbajg_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FHONAFGFJFM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FHONAFGFJFM(
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
            int rawValue = input.readEnum();

            ddmflcmbajg_ = rawValue;
            break;
          }
          case 16: {

            gpohlachejb_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FHONAFGFJFM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FHONAFGFJFM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FHONAFGFJFM.class, POGOProtos.Rpc.FHONAFGFJFM.Builder.class);
  }

  public static final int DDMFLCMBAJG_FIELD_NUMBER = 1;
  private int ddmflcmbajg_;
  /**
   * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
   * @return The enum numeric value on the wire for ddmflcmbajg.
   */
  @java.lang.Override public int getDdmflcmbajgValue() {
    return ddmflcmbajg_;
  }
  /**
   * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
   * @return The ddmflcmbajg.
   */
  @java.lang.Override public POGOProtos.Rpc.MAGDEIICLAK getDdmflcmbajg() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MAGDEIICLAK result = POGOProtos.Rpc.MAGDEIICLAK.valueOf(ddmflcmbajg_);
    return result == null ? POGOProtos.Rpc.MAGDEIICLAK.UNRECOGNIZED : result;
  }

  public static final int GPOHLACHEJB_FIELD_NUMBER = 2;
  private int gpohlachejb_;
  /**
   * <code>int32 gpohlachejb = 2;</code>
   * @return The gpohlachejb.
   */
  @java.lang.Override
  public int getGpohlachejb() {
    return gpohlachejb_;
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
    if (ddmflcmbajg_ != POGOProtos.Rpc.MAGDEIICLAK.MAGDEIICLAK_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, ddmflcmbajg_);
    }
    if (gpohlachejb_ != 0) {
      output.writeInt32(2, gpohlachejb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ddmflcmbajg_ != POGOProtos.Rpc.MAGDEIICLAK.MAGDEIICLAK_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ddmflcmbajg_);
    }
    if (gpohlachejb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, gpohlachejb_);
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
    if (!(obj instanceof POGOProtos.Rpc.FHONAFGFJFM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FHONAFGFJFM other = (POGOProtos.Rpc.FHONAFGFJFM) obj;

    if (ddmflcmbajg_ != other.ddmflcmbajg_) return false;
    if (getGpohlachejb()
        != other.getGpohlachejb()) return false;
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
    hash = (37 * hash) + DDMFLCMBAJG_FIELD_NUMBER;
    hash = (53 * hash) + ddmflcmbajg_;
    hash = (37 * hash) + GPOHLACHEJB_FIELD_NUMBER;
    hash = (53 * hash) + getGpohlachejb();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FHONAFGFJFM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FHONAFGFJFM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FHONAFGFJFM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FHONAFGFJFM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FHONAFGFJFM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FHONAFGFJFM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FHONAFGFJFM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FHONAFGFJFM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FHONAFGFJFM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FHONAFGFJFM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FHONAFGFJFM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FHONAFGFJFM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FHONAFGFJFM prototype) {
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
   * ref: FHONAFGFJFM
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FHONAFGFJFM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FHONAFGFJFM)
      POGOProtos.Rpc.FHONAFGFJFMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FHONAFGFJFM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FHONAFGFJFM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FHONAFGFJFM.class, POGOProtos.Rpc.FHONAFGFJFM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FHONAFGFJFM.newBuilder()
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
      ddmflcmbajg_ = 0;

      gpohlachejb_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FHONAFGFJFM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FHONAFGFJFM getDefaultInstanceForType() {
      return POGOProtos.Rpc.FHONAFGFJFM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FHONAFGFJFM build() {
      POGOProtos.Rpc.FHONAFGFJFM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FHONAFGFJFM buildPartial() {
      POGOProtos.Rpc.FHONAFGFJFM result = new POGOProtos.Rpc.FHONAFGFJFM(this);
      result.ddmflcmbajg_ = ddmflcmbajg_;
      result.gpohlachejb_ = gpohlachejb_;
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
      if (other instanceof POGOProtos.Rpc.FHONAFGFJFM) {
        return mergeFrom((POGOProtos.Rpc.FHONAFGFJFM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FHONAFGFJFM other) {
      if (other == POGOProtos.Rpc.FHONAFGFJFM.getDefaultInstance()) return this;
      if (other.ddmflcmbajg_ != 0) {
        setDdmflcmbajgValue(other.getDdmflcmbajgValue());
      }
      if (other.getGpohlachejb() != 0) {
        setGpohlachejb(other.getGpohlachejb());
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
      POGOProtos.Rpc.FHONAFGFJFM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FHONAFGFJFM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ddmflcmbajg_ = 0;
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
     * @return The enum numeric value on the wire for ddmflcmbajg.
     */
    @java.lang.Override public int getDdmflcmbajgValue() {
      return ddmflcmbajg_;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
     * @param value The enum numeric value on the wire for ddmflcmbajg to set.
     * @return This builder for chaining.
     */
    public Builder setDdmflcmbajgValue(int value) {
      
      ddmflcmbajg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
     * @return The ddmflcmbajg.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MAGDEIICLAK getDdmflcmbajg() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MAGDEIICLAK result = POGOProtos.Rpc.MAGDEIICLAK.valueOf(ddmflcmbajg_);
      return result == null ? POGOProtos.Rpc.MAGDEIICLAK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
     * @param value The ddmflcmbajg to set.
     * @return This builder for chaining.
     */
    public Builder setDdmflcmbajg(POGOProtos.Rpc.MAGDEIICLAK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ddmflcmbajg_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK ddmflcmbajg = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDdmflcmbajg() {
      
      ddmflcmbajg_ = 0;
      onChanged();
      return this;
    }

    private int gpohlachejb_ ;
    /**
     * <code>int32 gpohlachejb = 2;</code>
     * @return The gpohlachejb.
     */
    @java.lang.Override
    public int getGpohlachejb() {
      return gpohlachejb_;
    }
    /**
     * <code>int32 gpohlachejb = 2;</code>
     * @param value The gpohlachejb to set.
     * @return This builder for chaining.
     */
    public Builder setGpohlachejb(int value) {
      
      gpohlachejb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 gpohlachejb = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGpohlachejb() {
      
      gpohlachejb_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FHONAFGFJFM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FHONAFGFJFM)
  private static final POGOProtos.Rpc.FHONAFGFJFM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FHONAFGFJFM();
  }

  public static POGOProtos.Rpc.FHONAFGFJFM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FHONAFGFJFM>
      PARSER = new com.google.protobuf.AbstractParser<FHONAFGFJFM>() {
    @java.lang.Override
    public FHONAFGFJFM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FHONAFGFJFM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FHONAFGFJFM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FHONAFGFJFM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FHONAFGFJFM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

