// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KLLBKGDLOPL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.KLLBKGDLOPL}
 */
public  final class KLLBKGDLOPL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KLLBKGDLOPL)
    KLLBKGDLOPLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KLLBKGDLOPL.newBuilder() to construct.
  private KLLBKGDLOPL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KLLBKGDLOPL() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KLLBKGDLOPL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KLLBKGDLOPL(
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
          case 13: {

            lpkiicbempc_ = input.readFloat();
            break;
          }
          case 21: {

            ilafiedhlni_ = input.readFloat();
            break;
          }
          case 29: {

            oilgjjdelgj_ = input.readFloat();
            break;
          }
          case 37: {

            nkkhfdbibih_ = input.readFloat();
            break;
          }
          case 40: {

            ejammojbagc_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KLLBKGDLOPL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KLLBKGDLOPL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KLLBKGDLOPL.class, POGOProtos.Rpc.KLLBKGDLOPL.Builder.class);
  }

  public static final int LPKIICBEMPC_FIELD_NUMBER = 1;
  private float lpkiicbempc_;
  /**
   * <code>float lpkiicbempc = 1;</code>
   * @return The lpkiicbempc.
   */
  public float getLpkiicbempc() {
    return lpkiicbempc_;
  }

  public static final int ILAFIEDHLNI_FIELD_NUMBER = 2;
  private float ilafiedhlni_;
  /**
   * <code>float ilafiedhlni = 2;</code>
   * @return The ilafiedhlni.
   */
  public float getIlafiedhlni() {
    return ilafiedhlni_;
  }

  public static final int OILGJJDELGJ_FIELD_NUMBER = 3;
  private float oilgjjdelgj_;
  /**
   * <code>float oilgjjdelgj = 3;</code>
   * @return The oilgjjdelgj.
   */
  public float getOilgjjdelgj() {
    return oilgjjdelgj_;
  }

  public static final int NKKHFDBIBIH_FIELD_NUMBER = 4;
  private float nkkhfdbibih_;
  /**
   * <code>float nkkhfdbibih = 4;</code>
   * @return The nkkhfdbibih.
   */
  public float getNkkhfdbibih() {
    return nkkhfdbibih_;
  }

  public static final int EJAMMOJBAGC_FIELD_NUMBER = 5;
  private boolean ejammojbagc_;
  /**
   * <code>bool ejammojbagc = 5;</code>
   * @return The ejammojbagc.
   */
  public boolean getEjammojbagc() {
    return ejammojbagc_;
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
    if (lpkiicbempc_ != 0F) {
      output.writeFloat(1, lpkiicbempc_);
    }
    if (ilafiedhlni_ != 0F) {
      output.writeFloat(2, ilafiedhlni_);
    }
    if (oilgjjdelgj_ != 0F) {
      output.writeFloat(3, oilgjjdelgj_);
    }
    if (nkkhfdbibih_ != 0F) {
      output.writeFloat(4, nkkhfdbibih_);
    }
    if (ejammojbagc_ != false) {
      output.writeBool(5, ejammojbagc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lpkiicbempc_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, lpkiicbempc_);
    }
    if (ilafiedhlni_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, ilafiedhlni_);
    }
    if (oilgjjdelgj_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, oilgjjdelgj_);
    }
    if (nkkhfdbibih_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, nkkhfdbibih_);
    }
    if (ejammojbagc_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, ejammojbagc_);
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
    if (!(obj instanceof POGOProtos.Rpc.KLLBKGDLOPL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KLLBKGDLOPL other = (POGOProtos.Rpc.KLLBKGDLOPL) obj;

    if (java.lang.Float.floatToIntBits(getLpkiicbempc())
        != java.lang.Float.floatToIntBits(
            other.getLpkiicbempc())) return false;
    if (java.lang.Float.floatToIntBits(getIlafiedhlni())
        != java.lang.Float.floatToIntBits(
            other.getIlafiedhlni())) return false;
    if (java.lang.Float.floatToIntBits(getOilgjjdelgj())
        != java.lang.Float.floatToIntBits(
            other.getOilgjjdelgj())) return false;
    if (java.lang.Float.floatToIntBits(getNkkhfdbibih())
        != java.lang.Float.floatToIntBits(
            other.getNkkhfdbibih())) return false;
    if (getEjammojbagc()
        != other.getEjammojbagc()) return false;
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
    hash = (37 * hash) + LPKIICBEMPC_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLpkiicbempc());
    hash = (37 * hash) + ILAFIEDHLNI_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getIlafiedhlni());
    hash = (37 * hash) + OILGJJDELGJ_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getOilgjjdelgj());
    hash = (37 * hash) + NKKHFDBIBIH_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getNkkhfdbibih());
    hash = (37 * hash) + EJAMMOJBAGC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEjammojbagc());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KLLBKGDLOPL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KLLBKGDLOPL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KLLBKGDLOPL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KLLBKGDLOPL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KLLBKGDLOPL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KLLBKGDLOPL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KLLBKGDLOPL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KLLBKGDLOPL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KLLBKGDLOPL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KLLBKGDLOPL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KLLBKGDLOPL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KLLBKGDLOPL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KLLBKGDLOPL prototype) {
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
   * ref: KLLBKGDLOPL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.KLLBKGDLOPL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KLLBKGDLOPL)
      POGOProtos.Rpc.KLLBKGDLOPLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KLLBKGDLOPL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KLLBKGDLOPL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KLLBKGDLOPL.class, POGOProtos.Rpc.KLLBKGDLOPL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KLLBKGDLOPL.newBuilder()
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
      lpkiicbempc_ = 0F;

      ilafiedhlni_ = 0F;

      oilgjjdelgj_ = 0F;

      nkkhfdbibih_ = 0F;

      ejammojbagc_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KLLBKGDLOPL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KLLBKGDLOPL getDefaultInstanceForType() {
      return POGOProtos.Rpc.KLLBKGDLOPL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KLLBKGDLOPL build() {
      POGOProtos.Rpc.KLLBKGDLOPL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KLLBKGDLOPL buildPartial() {
      POGOProtos.Rpc.KLLBKGDLOPL result = new POGOProtos.Rpc.KLLBKGDLOPL(this);
      result.lpkiicbempc_ = lpkiicbempc_;
      result.ilafiedhlni_ = ilafiedhlni_;
      result.oilgjjdelgj_ = oilgjjdelgj_;
      result.nkkhfdbibih_ = nkkhfdbibih_;
      result.ejammojbagc_ = ejammojbagc_;
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
      if (other instanceof POGOProtos.Rpc.KLLBKGDLOPL) {
        return mergeFrom((POGOProtos.Rpc.KLLBKGDLOPL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KLLBKGDLOPL other) {
      if (other == POGOProtos.Rpc.KLLBKGDLOPL.getDefaultInstance()) return this;
      if (other.getLpkiicbempc() != 0F) {
        setLpkiicbempc(other.getLpkiicbempc());
      }
      if (other.getIlafiedhlni() != 0F) {
        setIlafiedhlni(other.getIlafiedhlni());
      }
      if (other.getOilgjjdelgj() != 0F) {
        setOilgjjdelgj(other.getOilgjjdelgj());
      }
      if (other.getNkkhfdbibih() != 0F) {
        setNkkhfdbibih(other.getNkkhfdbibih());
      }
      if (other.getEjammojbagc() != false) {
        setEjammojbagc(other.getEjammojbagc());
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
      POGOProtos.Rpc.KLLBKGDLOPL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KLLBKGDLOPL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float lpkiicbempc_ ;
    /**
     * <code>float lpkiicbempc = 1;</code>
     * @return The lpkiicbempc.
     */
    public float getLpkiicbempc() {
      return lpkiicbempc_;
    }
    /**
     * <code>float lpkiicbempc = 1;</code>
     * @param value The lpkiicbempc to set.
     * @return This builder for chaining.
     */
    public Builder setLpkiicbempc(float value) {
      
      lpkiicbempc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float lpkiicbempc = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLpkiicbempc() {
      
      lpkiicbempc_ = 0F;
      onChanged();
      return this;
    }

    private float ilafiedhlni_ ;
    /**
     * <code>float ilafiedhlni = 2;</code>
     * @return The ilafiedhlni.
     */
    public float getIlafiedhlni() {
      return ilafiedhlni_;
    }
    /**
     * <code>float ilafiedhlni = 2;</code>
     * @param value The ilafiedhlni to set.
     * @return This builder for chaining.
     */
    public Builder setIlafiedhlni(float value) {
      
      ilafiedhlni_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float ilafiedhlni = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIlafiedhlni() {
      
      ilafiedhlni_ = 0F;
      onChanged();
      return this;
    }

    private float oilgjjdelgj_ ;
    /**
     * <code>float oilgjjdelgj = 3;</code>
     * @return The oilgjjdelgj.
     */
    public float getOilgjjdelgj() {
      return oilgjjdelgj_;
    }
    /**
     * <code>float oilgjjdelgj = 3;</code>
     * @param value The oilgjjdelgj to set.
     * @return This builder for chaining.
     */
    public Builder setOilgjjdelgj(float value) {
      
      oilgjjdelgj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float oilgjjdelgj = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOilgjjdelgj() {
      
      oilgjjdelgj_ = 0F;
      onChanged();
      return this;
    }

    private float nkkhfdbibih_ ;
    /**
     * <code>float nkkhfdbibih = 4;</code>
     * @return The nkkhfdbibih.
     */
    public float getNkkhfdbibih() {
      return nkkhfdbibih_;
    }
    /**
     * <code>float nkkhfdbibih = 4;</code>
     * @param value The nkkhfdbibih to set.
     * @return This builder for chaining.
     */
    public Builder setNkkhfdbibih(float value) {
      
      nkkhfdbibih_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float nkkhfdbibih = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNkkhfdbibih() {
      
      nkkhfdbibih_ = 0F;
      onChanged();
      return this;
    }

    private boolean ejammojbagc_ ;
    /**
     * <code>bool ejammojbagc = 5;</code>
     * @return The ejammojbagc.
     */
    public boolean getEjammojbagc() {
      return ejammojbagc_;
    }
    /**
     * <code>bool ejammojbagc = 5;</code>
     * @param value The ejammojbagc to set.
     * @return This builder for chaining.
     */
    public Builder setEjammojbagc(boolean value) {
      
      ejammojbagc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ejammojbagc = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEjammojbagc() {
      
      ejammojbagc_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KLLBKGDLOPL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KLLBKGDLOPL)
  private static final POGOProtos.Rpc.KLLBKGDLOPL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KLLBKGDLOPL();
  }

  public static POGOProtos.Rpc.KLLBKGDLOPL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KLLBKGDLOPL>
      PARSER = new com.google.protobuf.AbstractParser<KLLBKGDLOPL>() {
    @java.lang.Override
    public KLLBKGDLOPL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KLLBKGDLOPL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KLLBKGDLOPL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KLLBKGDLOPL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KLLBKGDLOPL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

