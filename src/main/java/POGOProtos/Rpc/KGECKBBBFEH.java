// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.KGECKBBBFEH}
 */
public  final class KGECKBBBFEH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KGECKBBBFEH)
    KGECKBBBFEHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KGECKBBBFEH.newBuilder() to construct.
  private KGECKBBBFEH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KGECKBBBFEH() {
    dnhbpengpji_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KGECKBBBFEH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KGECKBBBFEH(
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

            dnhbpengpji_ = rawValue;
            break;
          }
          case 16: {

            nkfapneoklj_ = input.readInt32();
            break;
          }
          case 24: {

            jkbfajmblkg_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KGECKBBBFEH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KGECKBBBFEH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KGECKBBBFEH.class, POGOProtos.Rpc.KGECKBBBFEH.Builder.class);
  }

  public static final int DNHBPENGPJI_FIELD_NUMBER = 1;
  private int dnhbpengpji_;
  /**
   * <code>.POGOProtos.Rpc.Item dnhbpengpji = 1;</code>
   * @return The enum numeric value on the wire for dnhbpengpji.
   */
  public int getDnhbpengpjiValue() {
    return dnhbpengpji_;
  }
  /**
   * <code>.POGOProtos.Rpc.Item dnhbpengpji = 1;</code>
   * @return The dnhbpengpji.
   */
  public POGOProtos.Rpc.Item getDnhbpengpji() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(dnhbpengpji_);
    return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
  }

  public static final int NKFAPNEOKLJ_FIELD_NUMBER = 2;
  private int nkfapneoklj_;
  /**
   * <code>int32 nkfapneoklj = 2;</code>
   * @return The nkfapneoklj.
   */
  public int getNkfapneoklj() {
    return nkfapneoklj_;
  }

  public static final int JKBFAJMBLKG_FIELD_NUMBER = 3;
  private int jkbfajmblkg_;
  /**
   * <code>int32 jkbfajmblkg = 3;</code>
   * @return The jkbfajmblkg.
   */
  public int getJkbfajmblkg() {
    return jkbfajmblkg_;
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
    if (dnhbpengpji_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, dnhbpengpji_);
    }
    if (nkfapneoklj_ != 0) {
      output.writeInt32(2, nkfapneoklj_);
    }
    if (jkbfajmblkg_ != 0) {
      output.writeInt32(3, jkbfajmblkg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dnhbpengpji_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dnhbpengpji_);
    }
    if (nkfapneoklj_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, nkfapneoklj_);
    }
    if (jkbfajmblkg_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, jkbfajmblkg_);
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
    if (!(obj instanceof POGOProtos.Rpc.KGECKBBBFEH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KGECKBBBFEH other = (POGOProtos.Rpc.KGECKBBBFEH) obj;

    if (dnhbpengpji_ != other.dnhbpengpji_) return false;
    if (getNkfapneoklj()
        != other.getNkfapneoklj()) return false;
    if (getJkbfajmblkg()
        != other.getJkbfajmblkg()) return false;
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
    hash = (37 * hash) + DNHBPENGPJI_FIELD_NUMBER;
    hash = (53 * hash) + dnhbpengpji_;
    hash = (37 * hash) + NKFAPNEOKLJ_FIELD_NUMBER;
    hash = (53 * hash) + getNkfapneoklj();
    hash = (37 * hash) + JKBFAJMBLKG_FIELD_NUMBER;
    hash = (53 * hash) + getJkbfajmblkg();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KGECKBBBFEH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KGECKBBBFEH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KGECKBBBFEH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KGECKBBBFEH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KGECKBBBFEH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KGECKBBBFEH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KGECKBBBFEH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KGECKBBBFEH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KGECKBBBFEH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KGECKBBBFEH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KGECKBBBFEH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KGECKBBBFEH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KGECKBBBFEH prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.KGECKBBBFEH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KGECKBBBFEH)
      POGOProtos.Rpc.KGECKBBBFEHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KGECKBBBFEH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KGECKBBBFEH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KGECKBBBFEH.class, POGOProtos.Rpc.KGECKBBBFEH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KGECKBBBFEH.newBuilder()
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
      dnhbpengpji_ = 0;

      nkfapneoklj_ = 0;

      jkbfajmblkg_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KGECKBBBFEH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KGECKBBBFEH getDefaultInstanceForType() {
      return POGOProtos.Rpc.KGECKBBBFEH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KGECKBBBFEH build() {
      POGOProtos.Rpc.KGECKBBBFEH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KGECKBBBFEH buildPartial() {
      POGOProtos.Rpc.KGECKBBBFEH result = new POGOProtos.Rpc.KGECKBBBFEH(this);
      result.dnhbpengpji_ = dnhbpengpji_;
      result.nkfapneoklj_ = nkfapneoklj_;
      result.jkbfajmblkg_ = jkbfajmblkg_;
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
      if (other instanceof POGOProtos.Rpc.KGECKBBBFEH) {
        return mergeFrom((POGOProtos.Rpc.KGECKBBBFEH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KGECKBBBFEH other) {
      if (other == POGOProtos.Rpc.KGECKBBBFEH.getDefaultInstance()) return this;
      if (other.dnhbpengpji_ != 0) {
        setDnhbpengpjiValue(other.getDnhbpengpjiValue());
      }
      if (other.getNkfapneoklj() != 0) {
        setNkfapneoklj(other.getNkfapneoklj());
      }
      if (other.getJkbfajmblkg() != 0) {
        setJkbfajmblkg(other.getJkbfajmblkg());
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
      POGOProtos.Rpc.KGECKBBBFEH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KGECKBBBFEH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int dnhbpengpji_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Item dnhbpengpji = 1;</code>
     * @return The enum numeric value on the wire for dnhbpengpji.
     */
    public int getDnhbpengpjiValue() {
      return dnhbpengpji_;
    }
    /**
     * <code>.POGOProtos.Rpc.Item dnhbpengpji = 1;</code>
     * @param value The enum numeric value on the wire for dnhbpengpji to set.
     * @return This builder for chaining.
     */
    public Builder setDnhbpengpjiValue(int value) {
      dnhbpengpji_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item dnhbpengpji = 1;</code>
     * @return The dnhbpengpji.
     */
    public POGOProtos.Rpc.Item getDnhbpengpji() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(dnhbpengpji_);
      return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Item dnhbpengpji = 1;</code>
     * @param value The dnhbpengpji to set.
     * @return This builder for chaining.
     */
    public Builder setDnhbpengpji(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dnhbpengpji_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item dnhbpengpji = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDnhbpengpji() {
      
      dnhbpengpji_ = 0;
      onChanged();
      return this;
    }

    private int nkfapneoklj_ ;
    /**
     * <code>int32 nkfapneoklj = 2;</code>
     * @return The nkfapneoklj.
     */
    public int getNkfapneoklj() {
      return nkfapneoklj_;
    }
    /**
     * <code>int32 nkfapneoklj = 2;</code>
     * @param value The nkfapneoklj to set.
     * @return This builder for chaining.
     */
    public Builder setNkfapneoklj(int value) {
      
      nkfapneoklj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 nkfapneoklj = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNkfapneoklj() {
      
      nkfapneoklj_ = 0;
      onChanged();
      return this;
    }

    private int jkbfajmblkg_ ;
    /**
     * <code>int32 jkbfajmblkg = 3;</code>
     * @return The jkbfajmblkg.
     */
    public int getJkbfajmblkg() {
      return jkbfajmblkg_;
    }
    /**
     * <code>int32 jkbfajmblkg = 3;</code>
     * @param value The jkbfajmblkg to set.
     * @return This builder for chaining.
     */
    public Builder setJkbfajmblkg(int value) {
      
      jkbfajmblkg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 jkbfajmblkg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJkbfajmblkg() {
      
      jkbfajmblkg_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KGECKBBBFEH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KGECKBBBFEH)
  private static final POGOProtos.Rpc.KGECKBBBFEH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KGECKBBBFEH();
  }

  public static POGOProtos.Rpc.KGECKBBBFEH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KGECKBBBFEH>
      PARSER = new com.google.protobuf.AbstractParser<KGECKBBBFEH>() {
    @java.lang.Override
    public KGECKBBBFEH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KGECKBBBFEH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KGECKBBBFEH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KGECKBBBFEH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KGECKBBBFEH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

