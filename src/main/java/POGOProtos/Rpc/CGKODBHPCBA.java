// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CGKODBHPCBA
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CGKODBHPCBA}
 */
public  final class CGKODBHPCBA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CGKODBHPCBA)
    CGKODBHPCBAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CGKODBHPCBA.newBuilder() to construct.
  private CGKODBHPCBA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CGKODBHPCBA() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CGKODBHPCBA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CGKODBHPCBA(
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

            pjgfckfeloj_ = input.readBool();
            break;
          }
          case 16: {

            fbggikallmd_ = input.readInt32();
            break;
          }
          case 24: {

            ffbmkgidjlp_ = input.readInt32();
            break;
          }
          case 32: {

            llfinlhddfo_ = input.readBool();
            break;
          }
          case 40: {

            jeehaifghgf_ = input.readBool();
            break;
          }
          case 48: {

            eddipfljiom_ = input.readBool();
            break;
          }
          case 56: {

            nedecebicoe_ = input.readBool();
            break;
          }
          case 64: {

            abaoaainkjl_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGKODBHPCBA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGKODBHPCBA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CGKODBHPCBA.class, POGOProtos.Rpc.CGKODBHPCBA.Builder.class);
  }

  public static final int PJGFCKFELOJ_FIELD_NUMBER = 1;
  private boolean pjgfckfeloj_;
  /**
   * <code>bool pjgfckfeloj = 1;</code>
   * @return The pjgfckfeloj.
   */
  public boolean getPjgfckfeloj() {
    return pjgfckfeloj_;
  }

  public static final int FBGGIKALLMD_FIELD_NUMBER = 2;
  private int fbggikallmd_;
  /**
   * <code>int32 fbggikallmd = 2;</code>
   * @return The fbggikallmd.
   */
  public int getFbggikallmd() {
    return fbggikallmd_;
  }

  public static final int FFBMKGIDJLP_FIELD_NUMBER = 3;
  private int ffbmkgidjlp_;
  /**
   * <code>int32 ffbmkgidjlp = 3;</code>
   * @return The ffbmkgidjlp.
   */
  public int getFfbmkgidjlp() {
    return ffbmkgidjlp_;
  }

  public static final int LLFINLHDDFO_FIELD_NUMBER = 4;
  private boolean llfinlhddfo_;
  /**
   * <code>bool llfinlhddfo = 4;</code>
   * @return The llfinlhddfo.
   */
  public boolean getLlfinlhddfo() {
    return llfinlhddfo_;
  }

  public static final int JEEHAIFGHGF_FIELD_NUMBER = 5;
  private boolean jeehaifghgf_;
  /**
   * <code>bool jeehaifghgf = 5;</code>
   * @return The jeehaifghgf.
   */
  public boolean getJeehaifghgf() {
    return jeehaifghgf_;
  }

  public static final int EDDIPFLJIOM_FIELD_NUMBER = 6;
  private boolean eddipfljiom_;
  /**
   * <code>bool eddipfljiom = 6;</code>
   * @return The eddipfljiom.
   */
  public boolean getEddipfljiom() {
    return eddipfljiom_;
  }

  public static final int NEDECEBICOE_FIELD_NUMBER = 7;
  private boolean nedecebicoe_;
  /**
   * <code>bool nedecebicoe = 7;</code>
   * @return The nedecebicoe.
   */
  public boolean getNedecebicoe() {
    return nedecebicoe_;
  }

  public static final int ABAOAAINKJL_FIELD_NUMBER = 8;
  private boolean abaoaainkjl_;
  /**
   * <code>bool abaoaainkjl = 8;</code>
   * @return The abaoaainkjl.
   */
  public boolean getAbaoaainkjl() {
    return abaoaainkjl_;
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
    if (pjgfckfeloj_ != false) {
      output.writeBool(1, pjgfckfeloj_);
    }
    if (fbggikallmd_ != 0) {
      output.writeInt32(2, fbggikallmd_);
    }
    if (ffbmkgidjlp_ != 0) {
      output.writeInt32(3, ffbmkgidjlp_);
    }
    if (llfinlhddfo_ != false) {
      output.writeBool(4, llfinlhddfo_);
    }
    if (jeehaifghgf_ != false) {
      output.writeBool(5, jeehaifghgf_);
    }
    if (eddipfljiom_ != false) {
      output.writeBool(6, eddipfljiom_);
    }
    if (nedecebicoe_ != false) {
      output.writeBool(7, nedecebicoe_);
    }
    if (abaoaainkjl_ != false) {
      output.writeBool(8, abaoaainkjl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pjgfckfeloj_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, pjgfckfeloj_);
    }
    if (fbggikallmd_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, fbggikallmd_);
    }
    if (ffbmkgidjlp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, ffbmkgidjlp_);
    }
    if (llfinlhddfo_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, llfinlhddfo_);
    }
    if (jeehaifghgf_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, jeehaifghgf_);
    }
    if (eddipfljiom_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, eddipfljiom_);
    }
    if (nedecebicoe_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, nedecebicoe_);
    }
    if (abaoaainkjl_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, abaoaainkjl_);
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
    if (!(obj instanceof POGOProtos.Rpc.CGKODBHPCBA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CGKODBHPCBA other = (POGOProtos.Rpc.CGKODBHPCBA) obj;

    if (getPjgfckfeloj()
        != other.getPjgfckfeloj()) return false;
    if (getFbggikallmd()
        != other.getFbggikallmd()) return false;
    if (getFfbmkgidjlp()
        != other.getFfbmkgidjlp()) return false;
    if (getLlfinlhddfo()
        != other.getLlfinlhddfo()) return false;
    if (getJeehaifghgf()
        != other.getJeehaifghgf()) return false;
    if (getEddipfljiom()
        != other.getEddipfljiom()) return false;
    if (getNedecebicoe()
        != other.getNedecebicoe()) return false;
    if (getAbaoaainkjl()
        != other.getAbaoaainkjl()) return false;
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
    hash = (37 * hash) + PJGFCKFELOJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPjgfckfeloj());
    hash = (37 * hash) + FBGGIKALLMD_FIELD_NUMBER;
    hash = (53 * hash) + getFbggikallmd();
    hash = (37 * hash) + FFBMKGIDJLP_FIELD_NUMBER;
    hash = (53 * hash) + getFfbmkgidjlp();
    hash = (37 * hash) + LLFINLHDDFO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLlfinlhddfo());
    hash = (37 * hash) + JEEHAIFGHGF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getJeehaifghgf());
    hash = (37 * hash) + EDDIPFLJIOM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEddipfljiom());
    hash = (37 * hash) + NEDECEBICOE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNedecebicoe());
    hash = (37 * hash) + ABAOAAINKJL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAbaoaainkjl());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CGKODBHPCBA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CGKODBHPCBA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGKODBHPCBA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CGKODBHPCBA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGKODBHPCBA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CGKODBHPCBA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGKODBHPCBA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CGKODBHPCBA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGKODBHPCBA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CGKODBHPCBA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGKODBHPCBA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CGKODBHPCBA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CGKODBHPCBA prototype) {
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
   * ref: CGKODBHPCBA
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CGKODBHPCBA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CGKODBHPCBA)
      POGOProtos.Rpc.CGKODBHPCBAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGKODBHPCBA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGKODBHPCBA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CGKODBHPCBA.class, POGOProtos.Rpc.CGKODBHPCBA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CGKODBHPCBA.newBuilder()
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
      pjgfckfeloj_ = false;

      fbggikallmd_ = 0;

      ffbmkgidjlp_ = 0;

      llfinlhddfo_ = false;

      jeehaifghgf_ = false;

      eddipfljiom_ = false;

      nedecebicoe_ = false;

      abaoaainkjl_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGKODBHPCBA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CGKODBHPCBA getDefaultInstanceForType() {
      return POGOProtos.Rpc.CGKODBHPCBA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CGKODBHPCBA build() {
      POGOProtos.Rpc.CGKODBHPCBA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CGKODBHPCBA buildPartial() {
      POGOProtos.Rpc.CGKODBHPCBA result = new POGOProtos.Rpc.CGKODBHPCBA(this);
      result.pjgfckfeloj_ = pjgfckfeloj_;
      result.fbggikallmd_ = fbggikallmd_;
      result.ffbmkgidjlp_ = ffbmkgidjlp_;
      result.llfinlhddfo_ = llfinlhddfo_;
      result.jeehaifghgf_ = jeehaifghgf_;
      result.eddipfljiom_ = eddipfljiom_;
      result.nedecebicoe_ = nedecebicoe_;
      result.abaoaainkjl_ = abaoaainkjl_;
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
      if (other instanceof POGOProtos.Rpc.CGKODBHPCBA) {
        return mergeFrom((POGOProtos.Rpc.CGKODBHPCBA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CGKODBHPCBA other) {
      if (other == POGOProtos.Rpc.CGKODBHPCBA.getDefaultInstance()) return this;
      if (other.getPjgfckfeloj() != false) {
        setPjgfckfeloj(other.getPjgfckfeloj());
      }
      if (other.getFbggikallmd() != 0) {
        setFbggikallmd(other.getFbggikallmd());
      }
      if (other.getFfbmkgidjlp() != 0) {
        setFfbmkgidjlp(other.getFfbmkgidjlp());
      }
      if (other.getLlfinlhddfo() != false) {
        setLlfinlhddfo(other.getLlfinlhddfo());
      }
      if (other.getJeehaifghgf() != false) {
        setJeehaifghgf(other.getJeehaifghgf());
      }
      if (other.getEddipfljiom() != false) {
        setEddipfljiom(other.getEddipfljiom());
      }
      if (other.getNedecebicoe() != false) {
        setNedecebicoe(other.getNedecebicoe());
      }
      if (other.getAbaoaainkjl() != false) {
        setAbaoaainkjl(other.getAbaoaainkjl());
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
      POGOProtos.Rpc.CGKODBHPCBA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CGKODBHPCBA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean pjgfckfeloj_ ;
    /**
     * <code>bool pjgfckfeloj = 1;</code>
     * @return The pjgfckfeloj.
     */
    public boolean getPjgfckfeloj() {
      return pjgfckfeloj_;
    }
    /**
     * <code>bool pjgfckfeloj = 1;</code>
     * @param value The pjgfckfeloj to set.
     * @return This builder for chaining.
     */
    public Builder setPjgfckfeloj(boolean value) {
      
      pjgfckfeloj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool pjgfckfeloj = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPjgfckfeloj() {
      
      pjgfckfeloj_ = false;
      onChanged();
      return this;
    }

    private int fbggikallmd_ ;
    /**
     * <code>int32 fbggikallmd = 2;</code>
     * @return The fbggikallmd.
     */
    public int getFbggikallmd() {
      return fbggikallmd_;
    }
    /**
     * <code>int32 fbggikallmd = 2;</code>
     * @param value The fbggikallmd to set.
     * @return This builder for chaining.
     */
    public Builder setFbggikallmd(int value) {
      
      fbggikallmd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fbggikallmd = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFbggikallmd() {
      
      fbggikallmd_ = 0;
      onChanged();
      return this;
    }

    private int ffbmkgidjlp_ ;
    /**
     * <code>int32 ffbmkgidjlp = 3;</code>
     * @return The ffbmkgidjlp.
     */
    public int getFfbmkgidjlp() {
      return ffbmkgidjlp_;
    }
    /**
     * <code>int32 ffbmkgidjlp = 3;</code>
     * @param value The ffbmkgidjlp to set.
     * @return This builder for chaining.
     */
    public Builder setFfbmkgidjlp(int value) {
      
      ffbmkgidjlp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ffbmkgidjlp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFfbmkgidjlp() {
      
      ffbmkgidjlp_ = 0;
      onChanged();
      return this;
    }

    private boolean llfinlhddfo_ ;
    /**
     * <code>bool llfinlhddfo = 4;</code>
     * @return The llfinlhddfo.
     */
    public boolean getLlfinlhddfo() {
      return llfinlhddfo_;
    }
    /**
     * <code>bool llfinlhddfo = 4;</code>
     * @param value The llfinlhddfo to set.
     * @return This builder for chaining.
     */
    public Builder setLlfinlhddfo(boolean value) {
      
      llfinlhddfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool llfinlhddfo = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLlfinlhddfo() {
      
      llfinlhddfo_ = false;
      onChanged();
      return this;
    }

    private boolean jeehaifghgf_ ;
    /**
     * <code>bool jeehaifghgf = 5;</code>
     * @return The jeehaifghgf.
     */
    public boolean getJeehaifghgf() {
      return jeehaifghgf_;
    }
    /**
     * <code>bool jeehaifghgf = 5;</code>
     * @param value The jeehaifghgf to set.
     * @return This builder for chaining.
     */
    public Builder setJeehaifghgf(boolean value) {
      
      jeehaifghgf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool jeehaifghgf = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearJeehaifghgf() {
      
      jeehaifghgf_ = false;
      onChanged();
      return this;
    }

    private boolean eddipfljiom_ ;
    /**
     * <code>bool eddipfljiom = 6;</code>
     * @return The eddipfljiom.
     */
    public boolean getEddipfljiom() {
      return eddipfljiom_;
    }
    /**
     * <code>bool eddipfljiom = 6;</code>
     * @param value The eddipfljiom to set.
     * @return This builder for chaining.
     */
    public Builder setEddipfljiom(boolean value) {
      
      eddipfljiom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool eddipfljiom = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEddipfljiom() {
      
      eddipfljiom_ = false;
      onChanged();
      return this;
    }

    private boolean nedecebicoe_ ;
    /**
     * <code>bool nedecebicoe = 7;</code>
     * @return The nedecebicoe.
     */
    public boolean getNedecebicoe() {
      return nedecebicoe_;
    }
    /**
     * <code>bool nedecebicoe = 7;</code>
     * @param value The nedecebicoe to set.
     * @return This builder for chaining.
     */
    public Builder setNedecebicoe(boolean value) {
      
      nedecebicoe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool nedecebicoe = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearNedecebicoe() {
      
      nedecebicoe_ = false;
      onChanged();
      return this;
    }

    private boolean abaoaainkjl_ ;
    /**
     * <code>bool abaoaainkjl = 8;</code>
     * @return The abaoaainkjl.
     */
    public boolean getAbaoaainkjl() {
      return abaoaainkjl_;
    }
    /**
     * <code>bool abaoaainkjl = 8;</code>
     * @param value The abaoaainkjl to set.
     * @return This builder for chaining.
     */
    public Builder setAbaoaainkjl(boolean value) {
      
      abaoaainkjl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool abaoaainkjl = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearAbaoaainkjl() {
      
      abaoaainkjl_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CGKODBHPCBA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CGKODBHPCBA)
  private static final POGOProtos.Rpc.CGKODBHPCBA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CGKODBHPCBA();
  }

  public static POGOProtos.Rpc.CGKODBHPCBA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CGKODBHPCBA>
      PARSER = new com.google.protobuf.AbstractParser<CGKODBHPCBA>() {
    @java.lang.Override
    public CGKODBHPCBA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CGKODBHPCBA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CGKODBHPCBA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CGKODBHPCBA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CGKODBHPCBA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

