// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: GLBAJPOMMNF
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GLBAJPOMMNF}
 */
public final class GLBAJPOMMNF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GLBAJPOMMNF)
    GLBAJPOMMNFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GLBAJPOMMNF.newBuilder() to construct.
  private GLBAJPOMMNF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GLBAJPOMMNF() {
    gnhihlmdocg_ = 0;
    mhegjhpbgjb_ = 0;
    mblbfdfmmed_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GLBAJPOMMNF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GLBAJPOMMNF(
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

            npegbcaodof_ = input.readUInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            gnhihlmdocg_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            mhegjhpbgjb_ = rawValue;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            mblbfdfmmed_ = rawValue;
            break;
          }
          case 40: {

            gejallfddma_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GLBAJPOMMNF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GLBAJPOMMNF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GLBAJPOMMNF.class, POGOProtos.Rpc.GLBAJPOMMNF.Builder.class);
  }

  public static final int NPEGBCAODOF_FIELD_NUMBER = 1;
  private long npegbcaodof_;
  /**
   * <code>uint64 npegbcaodof = 1;</code>
   * @return The npegbcaodof.
   */
  @java.lang.Override
  public long getNpegbcaodof() {
    return npegbcaodof_;
  }

  public static final int GNHIHLMDOCG_FIELD_NUMBER = 2;
  private int gnhihlmdocg_;
  /**
   * <code>.POGOProtos.Rpc.MAGDEIICLAK gnhihlmdocg = 2;</code>
   * @return The enum numeric value on the wire for gnhihlmdocg.
   */
  @java.lang.Override public int getGnhihlmdocgValue() {
    return gnhihlmdocg_;
  }
  /**
   * <code>.POGOProtos.Rpc.MAGDEIICLAK gnhihlmdocg = 2;</code>
   * @return The gnhihlmdocg.
   */
  @java.lang.Override public POGOProtos.Rpc.MAGDEIICLAK getGnhihlmdocg() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MAGDEIICLAK result = POGOProtos.Rpc.MAGDEIICLAK.valueOf(gnhihlmdocg_);
    return result == null ? POGOProtos.Rpc.MAGDEIICLAK.UNRECOGNIZED : result;
  }

  public static final int MHEGJHPBGJB_FIELD_NUMBER = 3;
  private int mhegjhpbgjb_;
  /**
   * <code>.POGOProtos.Rpc.NGJHAEPFGGB mhegjhpbgjb = 3;</code>
   * @return The enum numeric value on the wire for mhegjhpbgjb.
   */
  @java.lang.Override public int getMhegjhpbgjbValue() {
    return mhegjhpbgjb_;
  }
  /**
   * <code>.POGOProtos.Rpc.NGJHAEPFGGB mhegjhpbgjb = 3;</code>
   * @return The mhegjhpbgjb.
   */
  @java.lang.Override public POGOProtos.Rpc.NGJHAEPFGGB getMhegjhpbgjb() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NGJHAEPFGGB result = POGOProtos.Rpc.NGJHAEPFGGB.valueOf(mhegjhpbgjb_);
    return result == null ? POGOProtos.Rpc.NGJHAEPFGGB.UNRECOGNIZED : result;
  }

  public static final int MBLBFDFMMED_FIELD_NUMBER = 4;
  private int mblbfdfmmed_;
  /**
   * <code>.POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP mblbfdfmmed = 4;</code>
   * @return The enum numeric value on the wire for mblbfdfmmed.
   */
  @java.lang.Override public int getMblbfdfmmedValue() {
    return mblbfdfmmed_;
  }
  /**
   * <code>.POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP mblbfdfmmed = 4;</code>
   * @return The mblbfdfmmed.
   */
  @java.lang.Override public POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP getMblbfdfmmed() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP result = POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP.valueOf(mblbfdfmmed_);
    return result == null ? POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP.UNRECOGNIZED : result;
  }

  public static final int GEJALLFDDMA_FIELD_NUMBER = 5;
  private boolean gejallfddma_;
  /**
   * <code>bool gejallfddma = 5;</code>
   * @return The gejallfddma.
   */
  @java.lang.Override
  public boolean getGejallfddma() {
    return gejallfddma_;
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
    if (npegbcaodof_ != 0L) {
      output.writeUInt64(1, npegbcaodof_);
    }
    if (gnhihlmdocg_ != POGOProtos.Rpc.MAGDEIICLAK.MAGDEIICLAK_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(2, gnhihlmdocg_);
    }
    if (mhegjhpbgjb_ != POGOProtos.Rpc.NGJHAEPFGGB.NGJHAEPFGGB_POKEMON_UNSET.getNumber()) {
      output.writeEnum(3, mhegjhpbgjb_);
    }
    if (mblbfdfmmed_ != POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP.FORM_UNSET.getNumber()) {
      output.writeEnum(4, mblbfdfmmed_);
    }
    if (gejallfddma_ != false) {
      output.writeBool(5, gejallfddma_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (npegbcaodof_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, npegbcaodof_);
    }
    if (gnhihlmdocg_ != POGOProtos.Rpc.MAGDEIICLAK.MAGDEIICLAK_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, gnhihlmdocg_);
    }
    if (mhegjhpbgjb_ != POGOProtos.Rpc.NGJHAEPFGGB.NGJHAEPFGGB_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, mhegjhpbgjb_);
    }
    if (mblbfdfmmed_ != POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP.FORM_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, mblbfdfmmed_);
    }
    if (gejallfddma_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, gejallfddma_);
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
    if (!(obj instanceof POGOProtos.Rpc.GLBAJPOMMNF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GLBAJPOMMNF other = (POGOProtos.Rpc.GLBAJPOMMNF) obj;

    if (getNpegbcaodof()
        != other.getNpegbcaodof()) return false;
    if (gnhihlmdocg_ != other.gnhihlmdocg_) return false;
    if (mhegjhpbgjb_ != other.mhegjhpbgjb_) return false;
    if (mblbfdfmmed_ != other.mblbfdfmmed_) return false;
    if (getGejallfddma()
        != other.getGejallfddma()) return false;
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
    hash = (37 * hash) + NPEGBCAODOF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNpegbcaodof());
    hash = (37 * hash) + GNHIHLMDOCG_FIELD_NUMBER;
    hash = (53 * hash) + gnhihlmdocg_;
    hash = (37 * hash) + MHEGJHPBGJB_FIELD_NUMBER;
    hash = (53 * hash) + mhegjhpbgjb_;
    hash = (37 * hash) + MBLBFDFMMED_FIELD_NUMBER;
    hash = (53 * hash) + mblbfdfmmed_;
    hash = (37 * hash) + GEJALLFDDMA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getGejallfddma());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GLBAJPOMMNF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GLBAJPOMMNF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GLBAJPOMMNF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GLBAJPOMMNF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GLBAJPOMMNF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GLBAJPOMMNF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GLBAJPOMMNF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GLBAJPOMMNF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GLBAJPOMMNF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GLBAJPOMMNF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GLBAJPOMMNF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GLBAJPOMMNF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GLBAJPOMMNF prototype) {
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
   * ref: GLBAJPOMMNF
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GLBAJPOMMNF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GLBAJPOMMNF)
      POGOProtos.Rpc.GLBAJPOMMNFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GLBAJPOMMNF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GLBAJPOMMNF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GLBAJPOMMNF.class, POGOProtos.Rpc.GLBAJPOMMNF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GLBAJPOMMNF.newBuilder()
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
      npegbcaodof_ = 0L;

      gnhihlmdocg_ = 0;

      mhegjhpbgjb_ = 0;

      mblbfdfmmed_ = 0;

      gejallfddma_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GLBAJPOMMNF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GLBAJPOMMNF getDefaultInstanceForType() {
      return POGOProtos.Rpc.GLBAJPOMMNF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GLBAJPOMMNF build() {
      POGOProtos.Rpc.GLBAJPOMMNF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GLBAJPOMMNF buildPartial() {
      POGOProtos.Rpc.GLBAJPOMMNF result = new POGOProtos.Rpc.GLBAJPOMMNF(this);
      result.npegbcaodof_ = npegbcaodof_;
      result.gnhihlmdocg_ = gnhihlmdocg_;
      result.mhegjhpbgjb_ = mhegjhpbgjb_;
      result.mblbfdfmmed_ = mblbfdfmmed_;
      result.gejallfddma_ = gejallfddma_;
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
      if (other instanceof POGOProtos.Rpc.GLBAJPOMMNF) {
        return mergeFrom((POGOProtos.Rpc.GLBAJPOMMNF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GLBAJPOMMNF other) {
      if (other == POGOProtos.Rpc.GLBAJPOMMNF.getDefaultInstance()) return this;
      if (other.getNpegbcaodof() != 0L) {
        setNpegbcaodof(other.getNpegbcaodof());
      }
      if (other.gnhihlmdocg_ != 0) {
        setGnhihlmdocgValue(other.getGnhihlmdocgValue());
      }
      if (other.mhegjhpbgjb_ != 0) {
        setMhegjhpbgjbValue(other.getMhegjhpbgjbValue());
      }
      if (other.mblbfdfmmed_ != 0) {
        setMblbfdfmmedValue(other.getMblbfdfmmedValue());
      }
      if (other.getGejallfddma() != false) {
        setGejallfddma(other.getGejallfddma());
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
      POGOProtos.Rpc.GLBAJPOMMNF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GLBAJPOMMNF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long npegbcaodof_ ;
    /**
     * <code>uint64 npegbcaodof = 1;</code>
     * @return The npegbcaodof.
     */
    @java.lang.Override
    public long getNpegbcaodof() {
      return npegbcaodof_;
    }
    /**
     * <code>uint64 npegbcaodof = 1;</code>
     * @param value The npegbcaodof to set.
     * @return This builder for chaining.
     */
    public Builder setNpegbcaodof(long value) {
      
      npegbcaodof_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 npegbcaodof = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNpegbcaodof() {
      
      npegbcaodof_ = 0L;
      onChanged();
      return this;
    }

    private int gnhihlmdocg_ = 0;
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK gnhihlmdocg = 2;</code>
     * @return The enum numeric value on the wire for gnhihlmdocg.
     */
    @java.lang.Override public int getGnhihlmdocgValue() {
      return gnhihlmdocg_;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK gnhihlmdocg = 2;</code>
     * @param value The enum numeric value on the wire for gnhihlmdocg to set.
     * @return This builder for chaining.
     */
    public Builder setGnhihlmdocgValue(int value) {
      
      gnhihlmdocg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK gnhihlmdocg = 2;</code>
     * @return The gnhihlmdocg.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MAGDEIICLAK getGnhihlmdocg() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MAGDEIICLAK result = POGOProtos.Rpc.MAGDEIICLAK.valueOf(gnhihlmdocg_);
      return result == null ? POGOProtos.Rpc.MAGDEIICLAK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK gnhihlmdocg = 2;</code>
     * @param value The gnhihlmdocg to set.
     * @return This builder for chaining.
     */
    public Builder setGnhihlmdocg(POGOProtos.Rpc.MAGDEIICLAK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      gnhihlmdocg_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MAGDEIICLAK gnhihlmdocg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGnhihlmdocg() {
      
      gnhihlmdocg_ = 0;
      onChanged();
      return this;
    }

    private int mhegjhpbgjb_ = 0;
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB mhegjhpbgjb = 3;</code>
     * @return The enum numeric value on the wire for mhegjhpbgjb.
     */
    @java.lang.Override public int getMhegjhpbgjbValue() {
      return mhegjhpbgjb_;
    }
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB mhegjhpbgjb = 3;</code>
     * @param value The enum numeric value on the wire for mhegjhpbgjb to set.
     * @return This builder for chaining.
     */
    public Builder setMhegjhpbgjbValue(int value) {
      
      mhegjhpbgjb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB mhegjhpbgjb = 3;</code>
     * @return The mhegjhpbgjb.
     */
    @java.lang.Override
    public POGOProtos.Rpc.NGJHAEPFGGB getMhegjhpbgjb() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NGJHAEPFGGB result = POGOProtos.Rpc.NGJHAEPFGGB.valueOf(mhegjhpbgjb_);
      return result == null ? POGOProtos.Rpc.NGJHAEPFGGB.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB mhegjhpbgjb = 3;</code>
     * @param value The mhegjhpbgjb to set.
     * @return This builder for chaining.
     */
    public Builder setMhegjhpbgjb(POGOProtos.Rpc.NGJHAEPFGGB value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      mhegjhpbgjb_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NGJHAEPFGGB mhegjhpbgjb = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMhegjhpbgjb() {
      
      mhegjhpbgjb_ = 0;
      onChanged();
      return this;
    }

    private int mblbfdfmmed_ = 0;
    /**
     * <code>.POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP mblbfdfmmed = 4;</code>
     * @return The enum numeric value on the wire for mblbfdfmmed.
     */
    @java.lang.Override public int getMblbfdfmmedValue() {
      return mblbfdfmmed_;
    }
    /**
     * <code>.POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP mblbfdfmmed = 4;</code>
     * @param value The enum numeric value on the wire for mblbfdfmmed to set.
     * @return This builder for chaining.
     */
    public Builder setMblbfdfmmedValue(int value) {
      
      mblbfdfmmed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP mblbfdfmmed = 4;</code>
     * @return The mblbfdfmmed.
     */
    @java.lang.Override
    public POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP getMblbfdfmmed() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP result = POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP.valueOf(mblbfdfmmed_);
      return result == null ? POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP mblbfdfmmed = 4;</code>
     * @param value The mblbfdfmmed to set.
     * @return This builder for chaining.
     */
    public Builder setMblbfdfmmed(POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      mblbfdfmmed_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ILOMBODDGGG.NCBMPEHNDBP mblbfdfmmed = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMblbfdfmmed() {
      
      mblbfdfmmed_ = 0;
      onChanged();
      return this;
    }

    private boolean gejallfddma_ ;
    /**
     * <code>bool gejallfddma = 5;</code>
     * @return The gejallfddma.
     */
    @java.lang.Override
    public boolean getGejallfddma() {
      return gejallfddma_;
    }
    /**
     * <code>bool gejallfddma = 5;</code>
     * @param value The gejallfddma to set.
     * @return This builder for chaining.
     */
    public Builder setGejallfddma(boolean value) {
      
      gejallfddma_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool gejallfddma = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGejallfddma() {
      
      gejallfddma_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GLBAJPOMMNF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GLBAJPOMMNF)
  private static final POGOProtos.Rpc.GLBAJPOMMNF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GLBAJPOMMNF();
  }

  public static POGOProtos.Rpc.GLBAJPOMMNF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GLBAJPOMMNF>
      PARSER = new com.google.protobuf.AbstractParser<GLBAJPOMMNF>() {
    @java.lang.Override
    public GLBAJPOMMNF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GLBAJPOMMNF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GLBAJPOMMNF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GLBAJPOMMNF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GLBAJPOMMNF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

