// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: GDIBAHPPBLC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GDIBAHPPBLC}
 */
public final class GDIBAHPPBLC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GDIBAHPPBLC)
    GDIBAHPPBLCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GDIBAHPPBLC.newBuilder() to construct.
  private GDIBAHPPBLC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GDIBAHPPBLC() {
    mnnllgkcabd_ = 0;
    nnhhoiiieai_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GDIBAHPPBLC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GDIBAHPPBLC(
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

            mnnllgkcabd_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            nnhhoiiieai_ = rawValue;
            break;
          }
          case 24: {

            jddeopggoia_ = input.readInt64();
            break;
          }
          case 32: {

            egpnkjcghnf_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GDIBAHPPBLC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GDIBAHPPBLC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GDIBAHPPBLC.class, POGOProtos.Rpc.GDIBAHPPBLC.Builder.class);
  }

  public static final int MNNLLGKCABD_FIELD_NUMBER = 1;
  private int mnnllgkcabd_;
  /**
   * <code>.POGOProtos.Rpc.PBEFDOIDGPH mnnllgkcabd = 1;</code>
   * @return The enum numeric value on the wire for mnnllgkcabd.
   */
  @java.lang.Override public int getMnnllgkcabdValue() {
    return mnnllgkcabd_;
  }
  /**
   * <code>.POGOProtos.Rpc.PBEFDOIDGPH mnnllgkcabd = 1;</code>
   * @return The mnnllgkcabd.
   */
  @java.lang.Override public POGOProtos.Rpc.PBEFDOIDGPH getMnnllgkcabd() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PBEFDOIDGPH result = POGOProtos.Rpc.PBEFDOIDGPH.valueOf(mnnllgkcabd_);
    return result == null ? POGOProtos.Rpc.PBEFDOIDGPH.UNRECOGNIZED : result;
  }

  public static final int NNHHOIIIEAI_FIELD_NUMBER = 2;
  private int nnhhoiiieai_;
  /**
   * <code>.POGOProtos.Rpc.BNLGMBCBEBD nnhhoiiieai = 2;</code>
   * @return The enum numeric value on the wire for nnhhoiiieai.
   */
  @java.lang.Override public int getNnhhoiiieaiValue() {
    return nnhhoiiieai_;
  }
  /**
   * <code>.POGOProtos.Rpc.BNLGMBCBEBD nnhhoiiieai = 2;</code>
   * @return The nnhhoiiieai.
   */
  @java.lang.Override public POGOProtos.Rpc.BNLGMBCBEBD getNnhhoiiieai() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BNLGMBCBEBD result = POGOProtos.Rpc.BNLGMBCBEBD.valueOf(nnhhoiiieai_);
    return result == null ? POGOProtos.Rpc.BNLGMBCBEBD.UNRECOGNIZED : result;
  }

  public static final int JDDEOPGGOIA_FIELD_NUMBER = 3;
  private long jddeopggoia_;
  /**
   * <code>int64 jddeopggoia = 3;</code>
   * @return The jddeopggoia.
   */
  @java.lang.Override
  public long getJddeopggoia() {
    return jddeopggoia_;
  }

  public static final int EGPNKJCGHNF_FIELD_NUMBER = 4;
  private long egpnkjcghnf_;
  /**
   * <code>int64 egpnkjcghnf = 4;</code>
   * @return The egpnkjcghnf.
   */
  @java.lang.Override
  public long getEgpnkjcghnf() {
    return egpnkjcghnf_;
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
    if (mnnllgkcabd_ != POGOProtos.Rpc.PBEFDOIDGPH.PBEFDOIDGPH_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, mnnllgkcabd_);
    }
    if (nnhhoiiieai_ != POGOProtos.Rpc.BNLGMBCBEBD.BNLGMBCBEBD_ITEM_TYPE_NONE.getNumber()) {
      output.writeEnum(2, nnhhoiiieai_);
    }
    if (jddeopggoia_ != 0L) {
      output.writeInt64(3, jddeopggoia_);
    }
    if (egpnkjcghnf_ != 0L) {
      output.writeInt64(4, egpnkjcghnf_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mnnllgkcabd_ != POGOProtos.Rpc.PBEFDOIDGPH.PBEFDOIDGPH_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, mnnllgkcabd_);
    }
    if (nnhhoiiieai_ != POGOProtos.Rpc.BNLGMBCBEBD.BNLGMBCBEBD_ITEM_TYPE_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, nnhhoiiieai_);
    }
    if (jddeopggoia_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, jddeopggoia_);
    }
    if (egpnkjcghnf_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, egpnkjcghnf_);
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
    if (!(obj instanceof POGOProtos.Rpc.GDIBAHPPBLC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GDIBAHPPBLC other = (POGOProtos.Rpc.GDIBAHPPBLC) obj;

    if (mnnllgkcabd_ != other.mnnllgkcabd_) return false;
    if (nnhhoiiieai_ != other.nnhhoiiieai_) return false;
    if (getJddeopggoia()
        != other.getJddeopggoia()) return false;
    if (getEgpnkjcghnf()
        != other.getEgpnkjcghnf()) return false;
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
    hash = (37 * hash) + MNNLLGKCABD_FIELD_NUMBER;
    hash = (53 * hash) + mnnllgkcabd_;
    hash = (37 * hash) + NNHHOIIIEAI_FIELD_NUMBER;
    hash = (53 * hash) + nnhhoiiieai_;
    hash = (37 * hash) + JDDEOPGGOIA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getJddeopggoia());
    hash = (37 * hash) + EGPNKJCGHNF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEgpnkjcghnf());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GDIBAHPPBLC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GDIBAHPPBLC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GDIBAHPPBLC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GDIBAHPPBLC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GDIBAHPPBLC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GDIBAHPPBLC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GDIBAHPPBLC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GDIBAHPPBLC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GDIBAHPPBLC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GDIBAHPPBLC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GDIBAHPPBLC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GDIBAHPPBLC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GDIBAHPPBLC prototype) {
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
   * ref: GDIBAHPPBLC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GDIBAHPPBLC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GDIBAHPPBLC)
      POGOProtos.Rpc.GDIBAHPPBLCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GDIBAHPPBLC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GDIBAHPPBLC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GDIBAHPPBLC.class, POGOProtos.Rpc.GDIBAHPPBLC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GDIBAHPPBLC.newBuilder()
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
      mnnllgkcabd_ = 0;

      nnhhoiiieai_ = 0;

      jddeopggoia_ = 0L;

      egpnkjcghnf_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GDIBAHPPBLC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GDIBAHPPBLC getDefaultInstanceForType() {
      return POGOProtos.Rpc.GDIBAHPPBLC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GDIBAHPPBLC build() {
      POGOProtos.Rpc.GDIBAHPPBLC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GDIBAHPPBLC buildPartial() {
      POGOProtos.Rpc.GDIBAHPPBLC result = new POGOProtos.Rpc.GDIBAHPPBLC(this);
      result.mnnllgkcabd_ = mnnllgkcabd_;
      result.nnhhoiiieai_ = nnhhoiiieai_;
      result.jddeopggoia_ = jddeopggoia_;
      result.egpnkjcghnf_ = egpnkjcghnf_;
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
      if (other instanceof POGOProtos.Rpc.GDIBAHPPBLC) {
        return mergeFrom((POGOProtos.Rpc.GDIBAHPPBLC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GDIBAHPPBLC other) {
      if (other == POGOProtos.Rpc.GDIBAHPPBLC.getDefaultInstance()) return this;
      if (other.mnnllgkcabd_ != 0) {
        setMnnllgkcabdValue(other.getMnnllgkcabdValue());
      }
      if (other.nnhhoiiieai_ != 0) {
        setNnhhoiiieaiValue(other.getNnhhoiiieaiValue());
      }
      if (other.getJddeopggoia() != 0L) {
        setJddeopggoia(other.getJddeopggoia());
      }
      if (other.getEgpnkjcghnf() != 0L) {
        setEgpnkjcghnf(other.getEgpnkjcghnf());
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
      POGOProtos.Rpc.GDIBAHPPBLC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GDIBAHPPBLC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int mnnllgkcabd_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PBEFDOIDGPH mnnllgkcabd = 1;</code>
     * @return The enum numeric value on the wire for mnnllgkcabd.
     */
    @java.lang.Override public int getMnnllgkcabdValue() {
      return mnnllgkcabd_;
    }
    /**
     * <code>.POGOProtos.Rpc.PBEFDOIDGPH mnnllgkcabd = 1;</code>
     * @param value The enum numeric value on the wire for mnnllgkcabd to set.
     * @return This builder for chaining.
     */
    public Builder setMnnllgkcabdValue(int value) {
      
      mnnllgkcabd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PBEFDOIDGPH mnnllgkcabd = 1;</code>
     * @return The mnnllgkcabd.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PBEFDOIDGPH getMnnllgkcabd() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PBEFDOIDGPH result = POGOProtos.Rpc.PBEFDOIDGPH.valueOf(mnnllgkcabd_);
      return result == null ? POGOProtos.Rpc.PBEFDOIDGPH.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PBEFDOIDGPH mnnllgkcabd = 1;</code>
     * @param value The mnnllgkcabd to set.
     * @return This builder for chaining.
     */
    public Builder setMnnllgkcabd(POGOProtos.Rpc.PBEFDOIDGPH value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      mnnllgkcabd_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PBEFDOIDGPH mnnllgkcabd = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMnnllgkcabd() {
      
      mnnllgkcabd_ = 0;
      onChanged();
      return this;
    }

    private int nnhhoiiieai_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BNLGMBCBEBD nnhhoiiieai = 2;</code>
     * @return The enum numeric value on the wire for nnhhoiiieai.
     */
    @java.lang.Override public int getNnhhoiiieaiValue() {
      return nnhhoiiieai_;
    }
    /**
     * <code>.POGOProtos.Rpc.BNLGMBCBEBD nnhhoiiieai = 2;</code>
     * @param value The enum numeric value on the wire for nnhhoiiieai to set.
     * @return This builder for chaining.
     */
    public Builder setNnhhoiiieaiValue(int value) {
      
      nnhhoiiieai_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BNLGMBCBEBD nnhhoiiieai = 2;</code>
     * @return The nnhhoiiieai.
     */
    @java.lang.Override
    public POGOProtos.Rpc.BNLGMBCBEBD getNnhhoiiieai() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BNLGMBCBEBD result = POGOProtos.Rpc.BNLGMBCBEBD.valueOf(nnhhoiiieai_);
      return result == null ? POGOProtos.Rpc.BNLGMBCBEBD.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BNLGMBCBEBD nnhhoiiieai = 2;</code>
     * @param value The nnhhoiiieai to set.
     * @return This builder for chaining.
     */
    public Builder setNnhhoiiieai(POGOProtos.Rpc.BNLGMBCBEBD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      nnhhoiiieai_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BNLGMBCBEBD nnhhoiiieai = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNnhhoiiieai() {
      
      nnhhoiiieai_ = 0;
      onChanged();
      return this;
    }

    private long jddeopggoia_ ;
    /**
     * <code>int64 jddeopggoia = 3;</code>
     * @return The jddeopggoia.
     */
    @java.lang.Override
    public long getJddeopggoia() {
      return jddeopggoia_;
    }
    /**
     * <code>int64 jddeopggoia = 3;</code>
     * @param value The jddeopggoia to set.
     * @return This builder for chaining.
     */
    public Builder setJddeopggoia(long value) {
      
      jddeopggoia_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 jddeopggoia = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJddeopggoia() {
      
      jddeopggoia_ = 0L;
      onChanged();
      return this;
    }

    private long egpnkjcghnf_ ;
    /**
     * <code>int64 egpnkjcghnf = 4;</code>
     * @return The egpnkjcghnf.
     */
    @java.lang.Override
    public long getEgpnkjcghnf() {
      return egpnkjcghnf_;
    }
    /**
     * <code>int64 egpnkjcghnf = 4;</code>
     * @param value The egpnkjcghnf to set.
     * @return This builder for chaining.
     */
    public Builder setEgpnkjcghnf(long value) {
      
      egpnkjcghnf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 egpnkjcghnf = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEgpnkjcghnf() {
      
      egpnkjcghnf_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GDIBAHPPBLC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GDIBAHPPBLC)
  private static final POGOProtos.Rpc.GDIBAHPPBLC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GDIBAHPPBLC();
  }

  public static POGOProtos.Rpc.GDIBAHPPBLC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GDIBAHPPBLC>
      PARSER = new com.google.protobuf.AbstractParser<GDIBAHPPBLC>() {
    @java.lang.Override
    public GDIBAHPPBLC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GDIBAHPPBLC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GDIBAHPPBLC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GDIBAHPPBLC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GDIBAHPPBLC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

