// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CAEGHIJGHIP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CAEGHIJGHIP}
 */
public final class CAEGHIJGHIP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CAEGHIJGHIP)
    CAEGHIJGHIPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CAEGHIJGHIP.newBuilder() to construct.
  private CAEGHIJGHIP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CAEGHIJGHIP() {
    oiedebkalie_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CAEGHIJGHIP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CAEGHIJGHIP(
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

            oiedebkalie_ = rawValue;
            break;
          }
          case 16: {

            loopidkcgli_ = input.readInt32();
            break;
          }
          case 24: {

            cfailhjanon_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAEGHIJGHIP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAEGHIJGHIP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CAEGHIJGHIP.class, POGOProtos.Rpc.CAEGHIJGHIP.Builder.class);
  }

  public static final int OIEDEBKALIE_FIELD_NUMBER = 1;
  private int oiedebkalie_;
  /**
   * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
   * @return The enum numeric value on the wire for oiedebkalie.
   */
  @java.lang.Override public int getOiedebkalieValue() {
    return oiedebkalie_;
  }
  /**
   * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
   * @return The oiedebkalie.
   */
  @java.lang.Override public POGOProtos.Rpc.GOCBJFKKCCF getOiedebkalie() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GOCBJFKKCCF result = POGOProtos.Rpc.GOCBJFKKCCF.valueOf(oiedebkalie_);
    return result == null ? POGOProtos.Rpc.GOCBJFKKCCF.UNRECOGNIZED : result;
  }

  public static final int LOOPIDKCGLI_FIELD_NUMBER = 2;
  private int loopidkcgli_;
  /**
   * <code>int32 loopidkcgli = 2;</code>
   * @return The loopidkcgli.
   */
  @java.lang.Override
  public int getLoopidkcgli() {
    return loopidkcgli_;
  }

  public static final int CFAILHJANON_FIELD_NUMBER = 3;
  private boolean cfailhjanon_;
  /**
   * <code>bool cfailhjanon = 3;</code>
   * @return The cfailhjanon.
   */
  @java.lang.Override
  public boolean getCfailhjanon() {
    return cfailhjanon_;
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
    if (oiedebkalie_ != POGOProtos.Rpc.GOCBJFKKCCF.GOCBJFKKCCF_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, oiedebkalie_);
    }
    if (loopidkcgli_ != 0) {
      output.writeInt32(2, loopidkcgli_);
    }
    if (cfailhjanon_ != false) {
      output.writeBool(3, cfailhjanon_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oiedebkalie_ != POGOProtos.Rpc.GOCBJFKKCCF.GOCBJFKKCCF_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, oiedebkalie_);
    }
    if (loopidkcgli_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, loopidkcgli_);
    }
    if (cfailhjanon_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, cfailhjanon_);
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
    if (!(obj instanceof POGOProtos.Rpc.CAEGHIJGHIP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CAEGHIJGHIP other = (POGOProtos.Rpc.CAEGHIJGHIP) obj;

    if (oiedebkalie_ != other.oiedebkalie_) return false;
    if (getLoopidkcgli()
        != other.getLoopidkcgli()) return false;
    if (getCfailhjanon()
        != other.getCfailhjanon()) return false;
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
    hash = (37 * hash) + OIEDEBKALIE_FIELD_NUMBER;
    hash = (53 * hash) + oiedebkalie_;
    hash = (37 * hash) + LOOPIDKCGLI_FIELD_NUMBER;
    hash = (53 * hash) + getLoopidkcgli();
    hash = (37 * hash) + CFAILHJANON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCfailhjanon());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CAEGHIJGHIP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CAEGHIJGHIP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAEGHIJGHIP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CAEGHIJGHIP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAEGHIJGHIP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CAEGHIJGHIP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAEGHIJGHIP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CAEGHIJGHIP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAEGHIJGHIP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CAEGHIJGHIP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAEGHIJGHIP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CAEGHIJGHIP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CAEGHIJGHIP prototype) {
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
   * ref: CAEGHIJGHIP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CAEGHIJGHIP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CAEGHIJGHIP)
      POGOProtos.Rpc.CAEGHIJGHIPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAEGHIJGHIP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAEGHIJGHIP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CAEGHIJGHIP.class, POGOProtos.Rpc.CAEGHIJGHIP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CAEGHIJGHIP.newBuilder()
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
      oiedebkalie_ = 0;

      loopidkcgli_ = 0;

      cfailhjanon_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAEGHIJGHIP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CAEGHIJGHIP getDefaultInstanceForType() {
      return POGOProtos.Rpc.CAEGHIJGHIP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CAEGHIJGHIP build() {
      POGOProtos.Rpc.CAEGHIJGHIP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CAEGHIJGHIP buildPartial() {
      POGOProtos.Rpc.CAEGHIJGHIP result = new POGOProtos.Rpc.CAEGHIJGHIP(this);
      result.oiedebkalie_ = oiedebkalie_;
      result.loopidkcgli_ = loopidkcgli_;
      result.cfailhjanon_ = cfailhjanon_;
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
      if (other instanceof POGOProtos.Rpc.CAEGHIJGHIP) {
        return mergeFrom((POGOProtos.Rpc.CAEGHIJGHIP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CAEGHIJGHIP other) {
      if (other == POGOProtos.Rpc.CAEGHIJGHIP.getDefaultInstance()) return this;
      if (other.oiedebkalie_ != 0) {
        setOiedebkalieValue(other.getOiedebkalieValue());
      }
      if (other.getLoopidkcgli() != 0) {
        setLoopidkcgli(other.getLoopidkcgli());
      }
      if (other.getCfailhjanon() != false) {
        setCfailhjanon(other.getCfailhjanon());
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
      POGOProtos.Rpc.CAEGHIJGHIP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CAEGHIJGHIP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int oiedebkalie_ = 0;
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
     * @return The enum numeric value on the wire for oiedebkalie.
     */
    @java.lang.Override public int getOiedebkalieValue() {
      return oiedebkalie_;
    }
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
     * @param value The enum numeric value on the wire for oiedebkalie to set.
     * @return This builder for chaining.
     */
    public Builder setOiedebkalieValue(int value) {
      
      oiedebkalie_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
     * @return The oiedebkalie.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GOCBJFKKCCF getOiedebkalie() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GOCBJFKKCCF result = POGOProtos.Rpc.GOCBJFKKCCF.valueOf(oiedebkalie_);
      return result == null ? POGOProtos.Rpc.GOCBJFKKCCF.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
     * @param value The oiedebkalie to set.
     * @return This builder for chaining.
     */
    public Builder setOiedebkalie(POGOProtos.Rpc.GOCBJFKKCCF value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      oiedebkalie_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOiedebkalie() {
      
      oiedebkalie_ = 0;
      onChanged();
      return this;
    }

    private int loopidkcgli_ ;
    /**
     * <code>int32 loopidkcgli = 2;</code>
     * @return The loopidkcgli.
     */
    @java.lang.Override
    public int getLoopidkcgli() {
      return loopidkcgli_;
    }
    /**
     * <code>int32 loopidkcgli = 2;</code>
     * @param value The loopidkcgli to set.
     * @return This builder for chaining.
     */
    public Builder setLoopidkcgli(int value) {
      
      loopidkcgli_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 loopidkcgli = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLoopidkcgli() {
      
      loopidkcgli_ = 0;
      onChanged();
      return this;
    }

    private boolean cfailhjanon_ ;
    /**
     * <code>bool cfailhjanon = 3;</code>
     * @return The cfailhjanon.
     */
    @java.lang.Override
    public boolean getCfailhjanon() {
      return cfailhjanon_;
    }
    /**
     * <code>bool cfailhjanon = 3;</code>
     * @param value The cfailhjanon to set.
     * @return This builder for chaining.
     */
    public Builder setCfailhjanon(boolean value) {
      
      cfailhjanon_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool cfailhjanon = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCfailhjanon() {
      
      cfailhjanon_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CAEGHIJGHIP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CAEGHIJGHIP)
  private static final POGOProtos.Rpc.CAEGHIJGHIP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CAEGHIJGHIP();
  }

  public static POGOProtos.Rpc.CAEGHIJGHIP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CAEGHIJGHIP>
      PARSER = new com.google.protobuf.AbstractParser<CAEGHIJGHIP>() {
    @java.lang.Override
    public CAEGHIJGHIP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CAEGHIJGHIP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CAEGHIJGHIP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CAEGHIJGHIP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CAEGHIJGHIP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

