// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BFJICLDGBAJ}
 */
public  final class BFJICLDGBAJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BFJICLDGBAJ)
    BFJICLDGBAJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BFJICLDGBAJ.newBuilder() to construct.
  private BFJICLDGBAJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BFJICLDGBAJ() {
    ldgpndlfpbi_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BFJICLDGBAJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BFJICLDGBAJ(
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

            inchcgcajni_ = input.readUInt64();
            break;
          }
          case 16: {

            nlpkopfndbh_ = input.readUInt32();
            break;
          }
          case 24: {

            khkjppkklkk_ = input.readUInt32();
            break;
          }
          case 32: {

            ofpgpbjeebl_ = input.readUInt32();
            break;
          }
          case 40: {

            igodffgannh_ = input.readUInt32();
            break;
          }
          case 50: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ldgpndlfpbi_ = new java.util.ArrayList<POGOProtos.Rpc.EOFJFCEGPOA>();
              mutable_bitField0_ |= 0x00000001;
            }
            ldgpndlfpbi_.add(
                input.readMessage(POGOProtos.Rpc.EOFJFCEGPOA.parser(), extensionRegistry));
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
        ldgpndlfpbi_ = java.util.Collections.unmodifiableList(ldgpndlfpbi_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BFJICLDGBAJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BFJICLDGBAJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BFJICLDGBAJ.class, POGOProtos.Rpc.BFJICLDGBAJ.Builder.class);
  }

  public static final int INCHCGCAJNI_FIELD_NUMBER = 1;
  private long inchcgcajni_;
  /**
   * <code>uint64 inchcgcajni = 1;</code>
   * @return The inchcgcajni.
   */
  public long getInchcgcajni() {
    return inchcgcajni_;
  }

  public static final int NLPKOPFNDBH_FIELD_NUMBER = 2;
  private int nlpkopfndbh_;
  /**
   * <code>uint32 nlpkopfndbh = 2;</code>
   * @return The nlpkopfndbh.
   */
  public int getNlpkopfndbh() {
    return nlpkopfndbh_;
  }

  public static final int KHKJPPKKLKK_FIELD_NUMBER = 3;
  private int khkjppkklkk_;
  /**
   * <code>uint32 khkjppkklkk = 3;</code>
   * @return The khkjppkklkk.
   */
  public int getKhkjppkklkk() {
    return khkjppkklkk_;
  }

  public static final int OFPGPBJEEBL_FIELD_NUMBER = 4;
  private int ofpgpbjeebl_;
  /**
   * <code>uint32 ofpgpbjeebl = 4;</code>
   * @return The ofpgpbjeebl.
   */
  public int getOfpgpbjeebl() {
    return ofpgpbjeebl_;
  }

  public static final int IGODFFGANNH_FIELD_NUMBER = 5;
  private int igodffgannh_;
  /**
   * <code>uint32 igodffgannh = 5;</code>
   * @return The igodffgannh.
   */
  public int getIgodffgannh() {
    return igodffgannh_;
  }

  public static final int LDGPNDLFPBI_FIELD_NUMBER = 6;
  private java.util.List<POGOProtos.Rpc.EOFJFCEGPOA> ldgpndlfpbi_;
  /**
   * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
   */
  public java.util.List<POGOProtos.Rpc.EOFJFCEGPOA> getLdgpndlfpbiList() {
    return ldgpndlfpbi_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
   */
  public java.util.List<? extends POGOProtos.Rpc.EOFJFCEGPOAOrBuilder> 
      getLdgpndlfpbiOrBuilderList() {
    return ldgpndlfpbi_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
   */
  public int getLdgpndlfpbiCount() {
    return ldgpndlfpbi_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
   */
  public POGOProtos.Rpc.EOFJFCEGPOA getLdgpndlfpbi(int index) {
    return ldgpndlfpbi_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
   */
  public POGOProtos.Rpc.EOFJFCEGPOAOrBuilder getLdgpndlfpbiOrBuilder(
      int index) {
    return ldgpndlfpbi_.get(index);
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
    if (inchcgcajni_ != 0L) {
      output.writeUInt64(1, inchcgcajni_);
    }
    if (nlpkopfndbh_ != 0) {
      output.writeUInt32(2, nlpkopfndbh_);
    }
    if (khkjppkklkk_ != 0) {
      output.writeUInt32(3, khkjppkklkk_);
    }
    if (ofpgpbjeebl_ != 0) {
      output.writeUInt32(4, ofpgpbjeebl_);
    }
    if (igodffgannh_ != 0) {
      output.writeUInt32(5, igodffgannh_);
    }
    for (int i = 0; i < ldgpndlfpbi_.size(); i++) {
      output.writeMessage(6, ldgpndlfpbi_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (inchcgcajni_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, inchcgcajni_);
    }
    if (nlpkopfndbh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, nlpkopfndbh_);
    }
    if (khkjppkklkk_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, khkjppkklkk_);
    }
    if (ofpgpbjeebl_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, ofpgpbjeebl_);
    }
    if (igodffgannh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, igodffgannh_);
    }
    for (int i = 0; i < ldgpndlfpbi_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, ldgpndlfpbi_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.BFJICLDGBAJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BFJICLDGBAJ other = (POGOProtos.Rpc.BFJICLDGBAJ) obj;

    if (getInchcgcajni()
        != other.getInchcgcajni()) return false;
    if (getNlpkopfndbh()
        != other.getNlpkopfndbh()) return false;
    if (getKhkjppkklkk()
        != other.getKhkjppkklkk()) return false;
    if (getOfpgpbjeebl()
        != other.getOfpgpbjeebl()) return false;
    if (getIgodffgannh()
        != other.getIgodffgannh()) return false;
    if (!getLdgpndlfpbiList()
        .equals(other.getLdgpndlfpbiList())) return false;
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
    hash = (37 * hash) + INCHCGCAJNI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getInchcgcajni());
    hash = (37 * hash) + NLPKOPFNDBH_FIELD_NUMBER;
    hash = (53 * hash) + getNlpkopfndbh();
    hash = (37 * hash) + KHKJPPKKLKK_FIELD_NUMBER;
    hash = (53 * hash) + getKhkjppkklkk();
    hash = (37 * hash) + OFPGPBJEEBL_FIELD_NUMBER;
    hash = (53 * hash) + getOfpgpbjeebl();
    hash = (37 * hash) + IGODFFGANNH_FIELD_NUMBER;
    hash = (53 * hash) + getIgodffgannh();
    if (getLdgpndlfpbiCount() > 0) {
      hash = (37 * hash) + LDGPNDLFPBI_FIELD_NUMBER;
      hash = (53 * hash) + getLdgpndlfpbiList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BFJICLDGBAJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BFJICLDGBAJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BFJICLDGBAJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BFJICLDGBAJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BFJICLDGBAJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BFJICLDGBAJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BFJICLDGBAJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BFJICLDGBAJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BFJICLDGBAJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BFJICLDGBAJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BFJICLDGBAJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BFJICLDGBAJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BFJICLDGBAJ prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BFJICLDGBAJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BFJICLDGBAJ)
      POGOProtos.Rpc.BFJICLDGBAJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BFJICLDGBAJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BFJICLDGBAJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BFJICLDGBAJ.class, POGOProtos.Rpc.BFJICLDGBAJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BFJICLDGBAJ.newBuilder()
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
        getLdgpndlfpbiFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      inchcgcajni_ = 0L;

      nlpkopfndbh_ = 0;

      khkjppkklkk_ = 0;

      ofpgpbjeebl_ = 0;

      igodffgannh_ = 0;

      if (ldgpndlfpbiBuilder_ == null) {
        ldgpndlfpbi_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ldgpndlfpbiBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BFJICLDGBAJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BFJICLDGBAJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.BFJICLDGBAJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BFJICLDGBAJ build() {
      POGOProtos.Rpc.BFJICLDGBAJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BFJICLDGBAJ buildPartial() {
      POGOProtos.Rpc.BFJICLDGBAJ result = new POGOProtos.Rpc.BFJICLDGBAJ(this);
      int from_bitField0_ = bitField0_;
      result.inchcgcajni_ = inchcgcajni_;
      result.nlpkopfndbh_ = nlpkopfndbh_;
      result.khkjppkklkk_ = khkjppkklkk_;
      result.ofpgpbjeebl_ = ofpgpbjeebl_;
      result.igodffgannh_ = igodffgannh_;
      if (ldgpndlfpbiBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ldgpndlfpbi_ = java.util.Collections.unmodifiableList(ldgpndlfpbi_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ldgpndlfpbi_ = ldgpndlfpbi_;
      } else {
        result.ldgpndlfpbi_ = ldgpndlfpbiBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.BFJICLDGBAJ) {
        return mergeFrom((POGOProtos.Rpc.BFJICLDGBAJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BFJICLDGBAJ other) {
      if (other == POGOProtos.Rpc.BFJICLDGBAJ.getDefaultInstance()) return this;
      if (other.getInchcgcajni() != 0L) {
        setInchcgcajni(other.getInchcgcajni());
      }
      if (other.getNlpkopfndbh() != 0) {
        setNlpkopfndbh(other.getNlpkopfndbh());
      }
      if (other.getKhkjppkklkk() != 0) {
        setKhkjppkklkk(other.getKhkjppkklkk());
      }
      if (other.getOfpgpbjeebl() != 0) {
        setOfpgpbjeebl(other.getOfpgpbjeebl());
      }
      if (other.getIgodffgannh() != 0) {
        setIgodffgannh(other.getIgodffgannh());
      }
      if (ldgpndlfpbiBuilder_ == null) {
        if (!other.ldgpndlfpbi_.isEmpty()) {
          if (ldgpndlfpbi_.isEmpty()) {
            ldgpndlfpbi_ = other.ldgpndlfpbi_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLdgpndlfpbiIsMutable();
            ldgpndlfpbi_.addAll(other.ldgpndlfpbi_);
          }
          onChanged();
        }
      } else {
        if (!other.ldgpndlfpbi_.isEmpty()) {
          if (ldgpndlfpbiBuilder_.isEmpty()) {
            ldgpndlfpbiBuilder_.dispose();
            ldgpndlfpbiBuilder_ = null;
            ldgpndlfpbi_ = other.ldgpndlfpbi_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ldgpndlfpbiBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLdgpndlfpbiFieldBuilder() : null;
          } else {
            ldgpndlfpbiBuilder_.addAllMessages(other.ldgpndlfpbi_);
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
      POGOProtos.Rpc.BFJICLDGBAJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BFJICLDGBAJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long inchcgcajni_ ;
    /**
     * <code>uint64 inchcgcajni = 1;</code>
     * @return The inchcgcajni.
     */
    public long getInchcgcajni() {
      return inchcgcajni_;
    }
    /**
     * <code>uint64 inchcgcajni = 1;</code>
     * @param value The inchcgcajni to set.
     * @return This builder for chaining.
     */
    public Builder setInchcgcajni(long value) {
      
      inchcgcajni_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 inchcgcajni = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInchcgcajni() {
      
      inchcgcajni_ = 0L;
      onChanged();
      return this;
    }

    private int nlpkopfndbh_ ;
    /**
     * <code>uint32 nlpkopfndbh = 2;</code>
     * @return The nlpkopfndbh.
     */
    public int getNlpkopfndbh() {
      return nlpkopfndbh_;
    }
    /**
     * <code>uint32 nlpkopfndbh = 2;</code>
     * @param value The nlpkopfndbh to set.
     * @return This builder for chaining.
     */
    public Builder setNlpkopfndbh(int value) {
      
      nlpkopfndbh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 nlpkopfndbh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNlpkopfndbh() {
      
      nlpkopfndbh_ = 0;
      onChanged();
      return this;
    }

    private int khkjppkklkk_ ;
    /**
     * <code>uint32 khkjppkklkk = 3;</code>
     * @return The khkjppkklkk.
     */
    public int getKhkjppkklkk() {
      return khkjppkklkk_;
    }
    /**
     * <code>uint32 khkjppkklkk = 3;</code>
     * @param value The khkjppkklkk to set.
     * @return This builder for chaining.
     */
    public Builder setKhkjppkklkk(int value) {
      
      khkjppkklkk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 khkjppkklkk = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKhkjppkklkk() {
      
      khkjppkklkk_ = 0;
      onChanged();
      return this;
    }

    private int ofpgpbjeebl_ ;
    /**
     * <code>uint32 ofpgpbjeebl = 4;</code>
     * @return The ofpgpbjeebl.
     */
    public int getOfpgpbjeebl() {
      return ofpgpbjeebl_;
    }
    /**
     * <code>uint32 ofpgpbjeebl = 4;</code>
     * @param value The ofpgpbjeebl to set.
     * @return This builder for chaining.
     */
    public Builder setOfpgpbjeebl(int value) {
      
      ofpgpbjeebl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 ofpgpbjeebl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOfpgpbjeebl() {
      
      ofpgpbjeebl_ = 0;
      onChanged();
      return this;
    }

    private int igodffgannh_ ;
    /**
     * <code>uint32 igodffgannh = 5;</code>
     * @return The igodffgannh.
     */
    public int getIgodffgannh() {
      return igodffgannh_;
    }
    /**
     * <code>uint32 igodffgannh = 5;</code>
     * @param value The igodffgannh to set.
     * @return This builder for chaining.
     */
    public Builder setIgodffgannh(int value) {
      
      igodffgannh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 igodffgannh = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIgodffgannh() {
      
      igodffgannh_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.EOFJFCEGPOA> ldgpndlfpbi_ =
      java.util.Collections.emptyList();
    private void ensureLdgpndlfpbiIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ldgpndlfpbi_ = new java.util.ArrayList<POGOProtos.Rpc.EOFJFCEGPOA>(ldgpndlfpbi_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.EOFJFCEGPOA, POGOProtos.Rpc.EOFJFCEGPOA.Builder, POGOProtos.Rpc.EOFJFCEGPOAOrBuilder> ldgpndlfpbiBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public java.util.List<POGOProtos.Rpc.EOFJFCEGPOA> getLdgpndlfpbiList() {
      if (ldgpndlfpbiBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ldgpndlfpbi_);
      } else {
        return ldgpndlfpbiBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public int getLdgpndlfpbiCount() {
      if (ldgpndlfpbiBuilder_ == null) {
        return ldgpndlfpbi_.size();
      } else {
        return ldgpndlfpbiBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public POGOProtos.Rpc.EOFJFCEGPOA getLdgpndlfpbi(int index) {
      if (ldgpndlfpbiBuilder_ == null) {
        return ldgpndlfpbi_.get(index);
      } else {
        return ldgpndlfpbiBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public Builder setLdgpndlfpbi(
        int index, POGOProtos.Rpc.EOFJFCEGPOA value) {
      if (ldgpndlfpbiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLdgpndlfpbiIsMutable();
        ldgpndlfpbi_.set(index, value);
        onChanged();
      } else {
        ldgpndlfpbiBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public Builder setLdgpndlfpbi(
        int index, POGOProtos.Rpc.EOFJFCEGPOA.Builder builderForValue) {
      if (ldgpndlfpbiBuilder_ == null) {
        ensureLdgpndlfpbiIsMutable();
        ldgpndlfpbi_.set(index, builderForValue.build());
        onChanged();
      } else {
        ldgpndlfpbiBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public Builder addLdgpndlfpbi(POGOProtos.Rpc.EOFJFCEGPOA value) {
      if (ldgpndlfpbiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLdgpndlfpbiIsMutable();
        ldgpndlfpbi_.add(value);
        onChanged();
      } else {
        ldgpndlfpbiBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public Builder addLdgpndlfpbi(
        int index, POGOProtos.Rpc.EOFJFCEGPOA value) {
      if (ldgpndlfpbiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLdgpndlfpbiIsMutable();
        ldgpndlfpbi_.add(index, value);
        onChanged();
      } else {
        ldgpndlfpbiBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public Builder addLdgpndlfpbi(
        POGOProtos.Rpc.EOFJFCEGPOA.Builder builderForValue) {
      if (ldgpndlfpbiBuilder_ == null) {
        ensureLdgpndlfpbiIsMutable();
        ldgpndlfpbi_.add(builderForValue.build());
        onChanged();
      } else {
        ldgpndlfpbiBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public Builder addLdgpndlfpbi(
        int index, POGOProtos.Rpc.EOFJFCEGPOA.Builder builderForValue) {
      if (ldgpndlfpbiBuilder_ == null) {
        ensureLdgpndlfpbiIsMutable();
        ldgpndlfpbi_.add(index, builderForValue.build());
        onChanged();
      } else {
        ldgpndlfpbiBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public Builder addAllLdgpndlfpbi(
        java.lang.Iterable<? extends POGOProtos.Rpc.EOFJFCEGPOA> values) {
      if (ldgpndlfpbiBuilder_ == null) {
        ensureLdgpndlfpbiIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ldgpndlfpbi_);
        onChanged();
      } else {
        ldgpndlfpbiBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public Builder clearLdgpndlfpbi() {
      if (ldgpndlfpbiBuilder_ == null) {
        ldgpndlfpbi_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ldgpndlfpbiBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public Builder removeLdgpndlfpbi(int index) {
      if (ldgpndlfpbiBuilder_ == null) {
        ensureLdgpndlfpbiIsMutable();
        ldgpndlfpbi_.remove(index);
        onChanged();
      } else {
        ldgpndlfpbiBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public POGOProtos.Rpc.EOFJFCEGPOA.Builder getLdgpndlfpbiBuilder(
        int index) {
      return getLdgpndlfpbiFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public POGOProtos.Rpc.EOFJFCEGPOAOrBuilder getLdgpndlfpbiOrBuilder(
        int index) {
      if (ldgpndlfpbiBuilder_ == null) {
        return ldgpndlfpbi_.get(index);  } else {
        return ldgpndlfpbiBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.EOFJFCEGPOAOrBuilder> 
         getLdgpndlfpbiOrBuilderList() {
      if (ldgpndlfpbiBuilder_ != null) {
        return ldgpndlfpbiBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ldgpndlfpbi_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public POGOProtos.Rpc.EOFJFCEGPOA.Builder addLdgpndlfpbiBuilder() {
      return getLdgpndlfpbiFieldBuilder().addBuilder(
          POGOProtos.Rpc.EOFJFCEGPOA.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public POGOProtos.Rpc.EOFJFCEGPOA.Builder addLdgpndlfpbiBuilder(
        int index) {
      return getLdgpndlfpbiFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.EOFJFCEGPOA.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.EOFJFCEGPOA ldgpndlfpbi = 6;</code>
     */
    public java.util.List<POGOProtos.Rpc.EOFJFCEGPOA.Builder> 
         getLdgpndlfpbiBuilderList() {
      return getLdgpndlfpbiFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.EOFJFCEGPOA, POGOProtos.Rpc.EOFJFCEGPOA.Builder, POGOProtos.Rpc.EOFJFCEGPOAOrBuilder> 
        getLdgpndlfpbiFieldBuilder() {
      if (ldgpndlfpbiBuilder_ == null) {
        ldgpndlfpbiBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.EOFJFCEGPOA, POGOProtos.Rpc.EOFJFCEGPOA.Builder, POGOProtos.Rpc.EOFJFCEGPOAOrBuilder>(
                ldgpndlfpbi_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ldgpndlfpbi_ = null;
      }
      return ldgpndlfpbiBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BFJICLDGBAJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BFJICLDGBAJ)
  private static final POGOProtos.Rpc.BFJICLDGBAJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BFJICLDGBAJ();
  }

  public static POGOProtos.Rpc.BFJICLDGBAJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BFJICLDGBAJ>
      PARSER = new com.google.protobuf.AbstractParser<BFJICLDGBAJ>() {
    @java.lang.Override
    public BFJICLDGBAJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BFJICLDGBAJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BFJICLDGBAJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BFJICLDGBAJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BFJICLDGBAJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

