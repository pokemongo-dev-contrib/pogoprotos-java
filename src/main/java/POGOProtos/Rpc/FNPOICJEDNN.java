// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FNPOICJEDNN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FNPOICJEDNN}
 */
public final class FNPOICJEDNN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FNPOICJEDNN)
    FNPOICJEDNNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FNPOICJEDNN.newBuilder() to construct.
  private FNPOICJEDNN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FNPOICJEDNN() {
    ljlhbdbblok_ = 0;
    nbkihkifhdg_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FNPOICJEDNN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FNPOICJEDNN(
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

            ljlhbdbblok_ = rawValue;
            break;
          }
          case 16: {

            bhjehalkngf_ = input.readInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            nbkihkifhdg_ = rawValue;
            break;
          }
          case 32: {

            hekdigpodph_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FNPOICJEDNN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FNPOICJEDNN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FNPOICJEDNN.class, POGOProtos.Rpc.FNPOICJEDNN.Builder.class);
  }

  public static final int LJLHBDBBLOK_FIELD_NUMBER = 1;
  private int ljlhbdbblok_;
  /**
   * <code>.POGOProtos.Rpc.EPMBCKFJHEN ljlhbdbblok = 1;</code>
   * @return The enum numeric value on the wire for ljlhbdbblok.
   */
  @java.lang.Override public int getLjlhbdbblokValue() {
    return ljlhbdbblok_;
  }
  /**
   * <code>.POGOProtos.Rpc.EPMBCKFJHEN ljlhbdbblok = 1;</code>
   * @return The ljlhbdbblok.
   */
  @java.lang.Override public POGOProtos.Rpc.EPMBCKFJHEN getLjlhbdbblok() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EPMBCKFJHEN result = POGOProtos.Rpc.EPMBCKFJHEN.valueOf(ljlhbdbblok_);
    return result == null ? POGOProtos.Rpc.EPMBCKFJHEN.UNRECOGNIZED : result;
  }

  public static final int BHJEHALKNGF_FIELD_NUMBER = 2;
  private int bhjehalkngf_;
  /**
   * <code>int32 bhjehalkngf = 2;</code>
   * @return The bhjehalkngf.
   */
  @java.lang.Override
  public int getBhjehalkngf() {
    return bhjehalkngf_;
  }

  public static final int NBKIHKIFHDG_FIELD_NUMBER = 3;
  private int nbkihkifhdg_;
  /**
   * <code>.POGOProtos.Rpc.LOACHEHMOJN nbkihkifhdg = 3;</code>
   * @return The enum numeric value on the wire for nbkihkifhdg.
   */
  @java.lang.Override public int getNbkihkifhdgValue() {
    return nbkihkifhdg_;
  }
  /**
   * <code>.POGOProtos.Rpc.LOACHEHMOJN nbkihkifhdg = 3;</code>
   * @return The nbkihkifhdg.
   */
  @java.lang.Override public POGOProtos.Rpc.LOACHEHMOJN getNbkihkifhdg() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.LOACHEHMOJN result = POGOProtos.Rpc.LOACHEHMOJN.valueOf(nbkihkifhdg_);
    return result == null ? POGOProtos.Rpc.LOACHEHMOJN.UNRECOGNIZED : result;
  }

  public static final int HEKDIGPODPH_FIELD_NUMBER = 4;
  private long hekdigpodph_;
  /**
   * <code>int64 hekdigpodph = 4;</code>
   * @return The hekdigpodph.
   */
  @java.lang.Override
  public long getHekdigpodph() {
    return hekdigpodph_;
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
    if (ljlhbdbblok_ != POGOProtos.Rpc.EPMBCKFJHEN.EPMBCKFJHEN_BUDDY_EMOTION_LEVEL_UNSET.getNumber()) {
      output.writeEnum(1, ljlhbdbblok_);
    }
    if (bhjehalkngf_ != 0) {
      output.writeInt32(2, bhjehalkngf_);
    }
    if (nbkihkifhdg_ != POGOProtos.Rpc.LOACHEHMOJN.LOACHEHMOJN_BUDDY_ANIMATION_UNSET.getNumber()) {
      output.writeEnum(3, nbkihkifhdg_);
    }
    if (hekdigpodph_ != 0L) {
      output.writeInt64(4, hekdigpodph_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ljlhbdbblok_ != POGOProtos.Rpc.EPMBCKFJHEN.EPMBCKFJHEN_BUDDY_EMOTION_LEVEL_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ljlhbdbblok_);
    }
    if (bhjehalkngf_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, bhjehalkngf_);
    }
    if (nbkihkifhdg_ != POGOProtos.Rpc.LOACHEHMOJN.LOACHEHMOJN_BUDDY_ANIMATION_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, nbkihkifhdg_);
    }
    if (hekdigpodph_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, hekdigpodph_);
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
    if (!(obj instanceof POGOProtos.Rpc.FNPOICJEDNN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FNPOICJEDNN other = (POGOProtos.Rpc.FNPOICJEDNN) obj;

    if (ljlhbdbblok_ != other.ljlhbdbblok_) return false;
    if (getBhjehalkngf()
        != other.getBhjehalkngf()) return false;
    if (nbkihkifhdg_ != other.nbkihkifhdg_) return false;
    if (getHekdigpodph()
        != other.getHekdigpodph()) return false;
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
    hash = (37 * hash) + LJLHBDBBLOK_FIELD_NUMBER;
    hash = (53 * hash) + ljlhbdbblok_;
    hash = (37 * hash) + BHJEHALKNGF_FIELD_NUMBER;
    hash = (53 * hash) + getBhjehalkngf();
    hash = (37 * hash) + NBKIHKIFHDG_FIELD_NUMBER;
    hash = (53 * hash) + nbkihkifhdg_;
    hash = (37 * hash) + HEKDIGPODPH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHekdigpodph());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FNPOICJEDNN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FNPOICJEDNN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FNPOICJEDNN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FNPOICJEDNN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FNPOICJEDNN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FNPOICJEDNN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FNPOICJEDNN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FNPOICJEDNN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FNPOICJEDNN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FNPOICJEDNN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FNPOICJEDNN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FNPOICJEDNN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FNPOICJEDNN prototype) {
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
   * ref: FNPOICJEDNN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FNPOICJEDNN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FNPOICJEDNN)
      POGOProtos.Rpc.FNPOICJEDNNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FNPOICJEDNN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FNPOICJEDNN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FNPOICJEDNN.class, POGOProtos.Rpc.FNPOICJEDNN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FNPOICJEDNN.newBuilder()
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
      ljlhbdbblok_ = 0;

      bhjehalkngf_ = 0;

      nbkihkifhdg_ = 0;

      hekdigpodph_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FNPOICJEDNN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FNPOICJEDNN getDefaultInstanceForType() {
      return POGOProtos.Rpc.FNPOICJEDNN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FNPOICJEDNN build() {
      POGOProtos.Rpc.FNPOICJEDNN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FNPOICJEDNN buildPartial() {
      POGOProtos.Rpc.FNPOICJEDNN result = new POGOProtos.Rpc.FNPOICJEDNN(this);
      result.ljlhbdbblok_ = ljlhbdbblok_;
      result.bhjehalkngf_ = bhjehalkngf_;
      result.nbkihkifhdg_ = nbkihkifhdg_;
      result.hekdigpodph_ = hekdigpodph_;
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
      if (other instanceof POGOProtos.Rpc.FNPOICJEDNN) {
        return mergeFrom((POGOProtos.Rpc.FNPOICJEDNN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FNPOICJEDNN other) {
      if (other == POGOProtos.Rpc.FNPOICJEDNN.getDefaultInstance()) return this;
      if (other.ljlhbdbblok_ != 0) {
        setLjlhbdbblokValue(other.getLjlhbdbblokValue());
      }
      if (other.getBhjehalkngf() != 0) {
        setBhjehalkngf(other.getBhjehalkngf());
      }
      if (other.nbkihkifhdg_ != 0) {
        setNbkihkifhdgValue(other.getNbkihkifhdgValue());
      }
      if (other.getHekdigpodph() != 0L) {
        setHekdigpodph(other.getHekdigpodph());
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
      POGOProtos.Rpc.FNPOICJEDNN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FNPOICJEDNN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ljlhbdbblok_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EPMBCKFJHEN ljlhbdbblok = 1;</code>
     * @return The enum numeric value on the wire for ljlhbdbblok.
     */
    @java.lang.Override public int getLjlhbdbblokValue() {
      return ljlhbdbblok_;
    }
    /**
     * <code>.POGOProtos.Rpc.EPMBCKFJHEN ljlhbdbblok = 1;</code>
     * @param value The enum numeric value on the wire for ljlhbdbblok to set.
     * @return This builder for chaining.
     */
    public Builder setLjlhbdbblokValue(int value) {
      
      ljlhbdbblok_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EPMBCKFJHEN ljlhbdbblok = 1;</code>
     * @return The ljlhbdbblok.
     */
    @java.lang.Override
    public POGOProtos.Rpc.EPMBCKFJHEN getLjlhbdbblok() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EPMBCKFJHEN result = POGOProtos.Rpc.EPMBCKFJHEN.valueOf(ljlhbdbblok_);
      return result == null ? POGOProtos.Rpc.EPMBCKFJHEN.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EPMBCKFJHEN ljlhbdbblok = 1;</code>
     * @param value The ljlhbdbblok to set.
     * @return This builder for chaining.
     */
    public Builder setLjlhbdbblok(POGOProtos.Rpc.EPMBCKFJHEN value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ljlhbdbblok_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EPMBCKFJHEN ljlhbdbblok = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLjlhbdbblok() {
      
      ljlhbdbblok_ = 0;
      onChanged();
      return this;
    }

    private int bhjehalkngf_ ;
    /**
     * <code>int32 bhjehalkngf = 2;</code>
     * @return The bhjehalkngf.
     */
    @java.lang.Override
    public int getBhjehalkngf() {
      return bhjehalkngf_;
    }
    /**
     * <code>int32 bhjehalkngf = 2;</code>
     * @param value The bhjehalkngf to set.
     * @return This builder for chaining.
     */
    public Builder setBhjehalkngf(int value) {
      
      bhjehalkngf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bhjehalkngf = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBhjehalkngf() {
      
      bhjehalkngf_ = 0;
      onChanged();
      return this;
    }

    private int nbkihkifhdg_ = 0;
    /**
     * <code>.POGOProtos.Rpc.LOACHEHMOJN nbkihkifhdg = 3;</code>
     * @return The enum numeric value on the wire for nbkihkifhdg.
     */
    @java.lang.Override public int getNbkihkifhdgValue() {
      return nbkihkifhdg_;
    }
    /**
     * <code>.POGOProtos.Rpc.LOACHEHMOJN nbkihkifhdg = 3;</code>
     * @param value The enum numeric value on the wire for nbkihkifhdg to set.
     * @return This builder for chaining.
     */
    public Builder setNbkihkifhdgValue(int value) {
      
      nbkihkifhdg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LOACHEHMOJN nbkihkifhdg = 3;</code>
     * @return The nbkihkifhdg.
     */
    @java.lang.Override
    public POGOProtos.Rpc.LOACHEHMOJN getNbkihkifhdg() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.LOACHEHMOJN result = POGOProtos.Rpc.LOACHEHMOJN.valueOf(nbkihkifhdg_);
      return result == null ? POGOProtos.Rpc.LOACHEHMOJN.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.LOACHEHMOJN nbkihkifhdg = 3;</code>
     * @param value The nbkihkifhdg to set.
     * @return This builder for chaining.
     */
    public Builder setNbkihkifhdg(POGOProtos.Rpc.LOACHEHMOJN value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      nbkihkifhdg_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LOACHEHMOJN nbkihkifhdg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNbkihkifhdg() {
      
      nbkihkifhdg_ = 0;
      onChanged();
      return this;
    }

    private long hekdigpodph_ ;
    /**
     * <code>int64 hekdigpodph = 4;</code>
     * @return The hekdigpodph.
     */
    @java.lang.Override
    public long getHekdigpodph() {
      return hekdigpodph_;
    }
    /**
     * <code>int64 hekdigpodph = 4;</code>
     * @param value The hekdigpodph to set.
     * @return This builder for chaining.
     */
    public Builder setHekdigpodph(long value) {
      
      hekdigpodph_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 hekdigpodph = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHekdigpodph() {
      
      hekdigpodph_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FNPOICJEDNN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FNPOICJEDNN)
  private static final POGOProtos.Rpc.FNPOICJEDNN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FNPOICJEDNN();
  }

  public static POGOProtos.Rpc.FNPOICJEDNN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FNPOICJEDNN>
      PARSER = new com.google.protobuf.AbstractParser<FNPOICJEDNN>() {
    @java.lang.Override
    public FNPOICJEDNN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FNPOICJEDNN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FNPOICJEDNN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FNPOICJEDNN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FNPOICJEDNN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

