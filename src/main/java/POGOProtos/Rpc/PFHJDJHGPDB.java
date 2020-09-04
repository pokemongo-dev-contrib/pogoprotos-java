// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PFHJDJHGPDB
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PFHJDJHGPDB}
 */
public final class PFHJDJHGPDB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PFHJDJHGPDB)
    PFHJDJHGPDBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PFHJDJHGPDB.newBuilder() to construct.
  private PFHJDJHGPDB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PFHJDJHGPDB() {
    lknpioglmib_ = 0;
    lgmepgeecmg_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PFHJDJHGPDB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PFHJDJHGPDB(
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

            lknpioglmib_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              lgmepgeecmg_ = new java.util.ArrayList<POGOProtos.Rpc.HOALANDJDMB>();
              mutable_bitField0_ |= 0x00000001;
            }
            lgmepgeecmg_.add(
                input.readMessage(POGOProtos.Rpc.HOALANDJDMB.parser(), extensionRegistry));
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
        lgmepgeecmg_ = java.util.Collections.unmodifiableList(lgmepgeecmg_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFHJDJHGPDB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFHJDJHGPDB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PFHJDJHGPDB.class, POGOProtos.Rpc.PFHJDJHGPDB.Builder.class);
  }

  /**
   * <pre>
   * ref: PFHJDJHGPDB/LHCKNDBPDBI/DNMPGIGNOMG
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG}
   */
  public enum DNMPGIGNOMG
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DNMPGIGNOMG valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DNMPGIGNOMG forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DNMPGIGNOMG>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DNMPGIGNOMG> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DNMPGIGNOMG>() {
            public DNMPGIGNOMG findValueByNumber(int number) {
              return DNMPGIGNOMG.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.PFHJDJHGPDB.getDescriptor().getEnumTypes().get(0);
    }

    private static final DNMPGIGNOMG[] VALUES = values();

    public static DNMPGIGNOMG valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DNMPGIGNOMG(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG)
  }

  public static final int LKNPIOGLMIB_FIELD_NUMBER = 1;
  private int lknpioglmib_;
  /**
   * <code>.POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG lknpioglmib = 1;</code>
   * @return The enum numeric value on the wire for lknpioglmib.
   */
  @java.lang.Override public int getLknpioglmibValue() {
    return lknpioglmib_;
  }
  /**
   * <code>.POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG lknpioglmib = 1;</code>
   * @return The lknpioglmib.
   */
  @java.lang.Override public POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG getLknpioglmib() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG result = POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG.valueOf(lknpioglmib_);
    return result == null ? POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG.UNRECOGNIZED : result;
  }

  public static final int LGMEPGEECMG_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.HOALANDJDMB> lgmepgeecmg_;
  /**
   * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.HOALANDJDMB> getLgmepgeecmgList() {
    return lgmepgeecmg_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.HOALANDJDMBOrBuilder> 
      getLgmepgeecmgOrBuilderList() {
    return lgmepgeecmg_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
   */
  @java.lang.Override
  public int getLgmepgeecmgCount() {
    return lgmepgeecmg_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.HOALANDJDMB getLgmepgeecmg(int index) {
    return lgmepgeecmg_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.HOALANDJDMBOrBuilder getLgmepgeecmgOrBuilder(
      int index) {
    return lgmepgeecmg_.get(index);
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
    if (lknpioglmib_ != POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG.UNSET.getNumber()) {
      output.writeEnum(1, lknpioglmib_);
    }
    for (int i = 0; i < lgmepgeecmg_.size(); i++) {
      output.writeMessage(2, lgmepgeecmg_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lknpioglmib_ != POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lknpioglmib_);
    }
    for (int i = 0; i < lgmepgeecmg_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, lgmepgeecmg_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.PFHJDJHGPDB)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PFHJDJHGPDB other = (POGOProtos.Rpc.PFHJDJHGPDB) obj;

    if (lknpioglmib_ != other.lknpioglmib_) return false;
    if (!getLgmepgeecmgList()
        .equals(other.getLgmepgeecmgList())) return false;
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
    hash = (37 * hash) + LKNPIOGLMIB_FIELD_NUMBER;
    hash = (53 * hash) + lknpioglmib_;
    if (getLgmepgeecmgCount() > 0) {
      hash = (37 * hash) + LGMEPGEECMG_FIELD_NUMBER;
      hash = (53 * hash) + getLgmepgeecmgList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PFHJDJHGPDB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PFHJDJHGPDB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFHJDJHGPDB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PFHJDJHGPDB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFHJDJHGPDB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PFHJDJHGPDB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFHJDJHGPDB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PFHJDJHGPDB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFHJDJHGPDB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PFHJDJHGPDB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFHJDJHGPDB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PFHJDJHGPDB parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PFHJDJHGPDB prototype) {
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
   * ref: PFHJDJHGPDB
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PFHJDJHGPDB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PFHJDJHGPDB)
      POGOProtos.Rpc.PFHJDJHGPDBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFHJDJHGPDB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFHJDJHGPDB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PFHJDJHGPDB.class, POGOProtos.Rpc.PFHJDJHGPDB.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PFHJDJHGPDB.newBuilder()
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
        getLgmepgeecmgFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      lknpioglmib_ = 0;

      if (lgmepgeecmgBuilder_ == null) {
        lgmepgeecmg_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        lgmepgeecmgBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFHJDJHGPDB_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PFHJDJHGPDB getDefaultInstanceForType() {
      return POGOProtos.Rpc.PFHJDJHGPDB.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PFHJDJHGPDB build() {
      POGOProtos.Rpc.PFHJDJHGPDB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PFHJDJHGPDB buildPartial() {
      POGOProtos.Rpc.PFHJDJHGPDB result = new POGOProtos.Rpc.PFHJDJHGPDB(this);
      int from_bitField0_ = bitField0_;
      result.lknpioglmib_ = lknpioglmib_;
      if (lgmepgeecmgBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          lgmepgeecmg_ = java.util.Collections.unmodifiableList(lgmepgeecmg_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lgmepgeecmg_ = lgmepgeecmg_;
      } else {
        result.lgmepgeecmg_ = lgmepgeecmgBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PFHJDJHGPDB) {
        return mergeFrom((POGOProtos.Rpc.PFHJDJHGPDB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PFHJDJHGPDB other) {
      if (other == POGOProtos.Rpc.PFHJDJHGPDB.getDefaultInstance()) return this;
      if (other.lknpioglmib_ != 0) {
        setLknpioglmibValue(other.getLknpioglmibValue());
      }
      if (lgmepgeecmgBuilder_ == null) {
        if (!other.lgmepgeecmg_.isEmpty()) {
          if (lgmepgeecmg_.isEmpty()) {
            lgmepgeecmg_ = other.lgmepgeecmg_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLgmepgeecmgIsMutable();
            lgmepgeecmg_.addAll(other.lgmepgeecmg_);
          }
          onChanged();
        }
      } else {
        if (!other.lgmepgeecmg_.isEmpty()) {
          if (lgmepgeecmgBuilder_.isEmpty()) {
            lgmepgeecmgBuilder_.dispose();
            lgmepgeecmgBuilder_ = null;
            lgmepgeecmg_ = other.lgmepgeecmg_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lgmepgeecmgBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLgmepgeecmgFieldBuilder() : null;
          } else {
            lgmepgeecmgBuilder_.addAllMessages(other.lgmepgeecmg_);
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
      POGOProtos.Rpc.PFHJDJHGPDB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PFHJDJHGPDB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int lknpioglmib_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG lknpioglmib = 1;</code>
     * @return The enum numeric value on the wire for lknpioglmib.
     */
    @java.lang.Override public int getLknpioglmibValue() {
      return lknpioglmib_;
    }
    /**
     * <code>.POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG lknpioglmib = 1;</code>
     * @param value The enum numeric value on the wire for lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmibValue(int value) {
      
      lknpioglmib_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG lknpioglmib = 1;</code>
     * @return The lknpioglmib.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG getLknpioglmib() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG result = POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG.valueOf(lknpioglmib_);
      return result == null ? POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG lknpioglmib = 1;</code>
     * @param value The lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmib(POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lknpioglmib_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PFHJDJHGPDB.DNMPGIGNOMG lknpioglmib = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLknpioglmib() {
      
      lknpioglmib_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.HOALANDJDMB> lgmepgeecmg_ =
      java.util.Collections.emptyList();
    private void ensureLgmepgeecmgIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lgmepgeecmg_ = new java.util.ArrayList<POGOProtos.Rpc.HOALANDJDMB>(lgmepgeecmg_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.HOALANDJDMB, POGOProtos.Rpc.HOALANDJDMB.Builder, POGOProtos.Rpc.HOALANDJDMBOrBuilder> lgmepgeecmgBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.HOALANDJDMB> getLgmepgeecmgList() {
      if (lgmepgeecmgBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lgmepgeecmg_);
      } else {
        return lgmepgeecmgBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public int getLgmepgeecmgCount() {
      if (lgmepgeecmgBuilder_ == null) {
        return lgmepgeecmg_.size();
      } else {
        return lgmepgeecmgBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public POGOProtos.Rpc.HOALANDJDMB getLgmepgeecmg(int index) {
      if (lgmepgeecmgBuilder_ == null) {
        return lgmepgeecmg_.get(index);
      } else {
        return lgmepgeecmgBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public Builder setLgmepgeecmg(
        int index, POGOProtos.Rpc.HOALANDJDMB value) {
      if (lgmepgeecmgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLgmepgeecmgIsMutable();
        lgmepgeecmg_.set(index, value);
        onChanged();
      } else {
        lgmepgeecmgBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public Builder setLgmepgeecmg(
        int index, POGOProtos.Rpc.HOALANDJDMB.Builder builderForValue) {
      if (lgmepgeecmgBuilder_ == null) {
        ensureLgmepgeecmgIsMutable();
        lgmepgeecmg_.set(index, builderForValue.build());
        onChanged();
      } else {
        lgmepgeecmgBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public Builder addLgmepgeecmg(POGOProtos.Rpc.HOALANDJDMB value) {
      if (lgmepgeecmgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLgmepgeecmgIsMutable();
        lgmepgeecmg_.add(value);
        onChanged();
      } else {
        lgmepgeecmgBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public Builder addLgmepgeecmg(
        int index, POGOProtos.Rpc.HOALANDJDMB value) {
      if (lgmepgeecmgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLgmepgeecmgIsMutable();
        lgmepgeecmg_.add(index, value);
        onChanged();
      } else {
        lgmepgeecmgBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public Builder addLgmepgeecmg(
        POGOProtos.Rpc.HOALANDJDMB.Builder builderForValue) {
      if (lgmepgeecmgBuilder_ == null) {
        ensureLgmepgeecmgIsMutable();
        lgmepgeecmg_.add(builderForValue.build());
        onChanged();
      } else {
        lgmepgeecmgBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public Builder addLgmepgeecmg(
        int index, POGOProtos.Rpc.HOALANDJDMB.Builder builderForValue) {
      if (lgmepgeecmgBuilder_ == null) {
        ensureLgmepgeecmgIsMutable();
        lgmepgeecmg_.add(index, builderForValue.build());
        onChanged();
      } else {
        lgmepgeecmgBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public Builder addAllLgmepgeecmg(
        java.lang.Iterable<? extends POGOProtos.Rpc.HOALANDJDMB> values) {
      if (lgmepgeecmgBuilder_ == null) {
        ensureLgmepgeecmgIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lgmepgeecmg_);
        onChanged();
      } else {
        lgmepgeecmgBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public Builder clearLgmepgeecmg() {
      if (lgmepgeecmgBuilder_ == null) {
        lgmepgeecmg_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lgmepgeecmgBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public Builder removeLgmepgeecmg(int index) {
      if (lgmepgeecmgBuilder_ == null) {
        ensureLgmepgeecmgIsMutable();
        lgmepgeecmg_.remove(index);
        onChanged();
      } else {
        lgmepgeecmgBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public POGOProtos.Rpc.HOALANDJDMB.Builder getLgmepgeecmgBuilder(
        int index) {
      return getLgmepgeecmgFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public POGOProtos.Rpc.HOALANDJDMBOrBuilder getLgmepgeecmgOrBuilder(
        int index) {
      if (lgmepgeecmgBuilder_ == null) {
        return lgmepgeecmg_.get(index);  } else {
        return lgmepgeecmgBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.HOALANDJDMBOrBuilder> 
         getLgmepgeecmgOrBuilderList() {
      if (lgmepgeecmgBuilder_ != null) {
        return lgmepgeecmgBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lgmepgeecmg_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public POGOProtos.Rpc.HOALANDJDMB.Builder addLgmepgeecmgBuilder() {
      return getLgmepgeecmgFieldBuilder().addBuilder(
          POGOProtos.Rpc.HOALANDJDMB.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public POGOProtos.Rpc.HOALANDJDMB.Builder addLgmepgeecmgBuilder(
        int index) {
      return getLgmepgeecmgFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.HOALANDJDMB.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HOALANDJDMB lgmepgeecmg = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.HOALANDJDMB.Builder> 
         getLgmepgeecmgBuilderList() {
      return getLgmepgeecmgFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.HOALANDJDMB, POGOProtos.Rpc.HOALANDJDMB.Builder, POGOProtos.Rpc.HOALANDJDMBOrBuilder> 
        getLgmepgeecmgFieldBuilder() {
      if (lgmepgeecmgBuilder_ == null) {
        lgmepgeecmgBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.HOALANDJDMB, POGOProtos.Rpc.HOALANDJDMB.Builder, POGOProtos.Rpc.HOALANDJDMBOrBuilder>(
                lgmepgeecmg_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        lgmepgeecmg_ = null;
      }
      return lgmepgeecmgBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PFHJDJHGPDB)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PFHJDJHGPDB)
  private static final POGOProtos.Rpc.PFHJDJHGPDB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PFHJDJHGPDB();
  }

  public static POGOProtos.Rpc.PFHJDJHGPDB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PFHJDJHGPDB>
      PARSER = new com.google.protobuf.AbstractParser<PFHJDJHGPDB>() {
    @java.lang.Override
    public PFHJDJHGPDB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PFHJDJHGPDB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PFHJDJHGPDB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PFHJDJHGPDB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PFHJDJHGPDB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

