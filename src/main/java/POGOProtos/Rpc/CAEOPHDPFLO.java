// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CAEOPHDPFLO}
 */
public  final class CAEOPHDPFLO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CAEOPHDPFLO)
    CAEOPHDPFLOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CAEOPHDPFLO.newBuilder() to construct.
  private CAEOPHDPFLO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CAEOPHDPFLO() {
    dnhbpengpji_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CAEOPHDPFLO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CAEOPHDPFLO(
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

            glhgiafpnbh_ = input.readUInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAEOPHDPFLO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAEOPHDPFLO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CAEOPHDPFLO.class, POGOProtos.Rpc.CAEOPHDPFLO.Builder.class);
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

  public static final int GLHGIAFPNBH_FIELD_NUMBER = 2;
  private long glhgiafpnbh_;
  /**
   * <code>uint64 glhgiafpnbh = 2;</code>
   * @return The glhgiafpnbh.
   */
  public long getGlhgiafpnbh() {
    return glhgiafpnbh_;
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
    if (glhgiafpnbh_ != 0L) {
      output.writeUInt64(2, glhgiafpnbh_);
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
    if (glhgiafpnbh_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, glhgiafpnbh_);
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
    if (!(obj instanceof POGOProtos.Rpc.CAEOPHDPFLO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CAEOPHDPFLO other = (POGOProtos.Rpc.CAEOPHDPFLO) obj;

    if (dnhbpengpji_ != other.dnhbpengpji_) return false;
    if (getGlhgiafpnbh()
        != other.getGlhgiafpnbh()) return false;
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
    hash = (37 * hash) + GLHGIAFPNBH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGlhgiafpnbh());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CAEOPHDPFLO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CAEOPHDPFLO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAEOPHDPFLO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CAEOPHDPFLO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAEOPHDPFLO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CAEOPHDPFLO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAEOPHDPFLO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CAEOPHDPFLO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAEOPHDPFLO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CAEOPHDPFLO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CAEOPHDPFLO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CAEOPHDPFLO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CAEOPHDPFLO prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CAEOPHDPFLO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CAEOPHDPFLO)
      POGOProtos.Rpc.CAEOPHDPFLOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAEOPHDPFLO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAEOPHDPFLO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CAEOPHDPFLO.class, POGOProtos.Rpc.CAEOPHDPFLO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CAEOPHDPFLO.newBuilder()
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

      glhgiafpnbh_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CAEOPHDPFLO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CAEOPHDPFLO getDefaultInstanceForType() {
      return POGOProtos.Rpc.CAEOPHDPFLO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CAEOPHDPFLO build() {
      POGOProtos.Rpc.CAEOPHDPFLO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CAEOPHDPFLO buildPartial() {
      POGOProtos.Rpc.CAEOPHDPFLO result = new POGOProtos.Rpc.CAEOPHDPFLO(this);
      result.dnhbpengpji_ = dnhbpengpji_;
      result.glhgiafpnbh_ = glhgiafpnbh_;
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
      if (other instanceof POGOProtos.Rpc.CAEOPHDPFLO) {
        return mergeFrom((POGOProtos.Rpc.CAEOPHDPFLO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CAEOPHDPFLO other) {
      if (other == POGOProtos.Rpc.CAEOPHDPFLO.getDefaultInstance()) return this;
      if (other.dnhbpengpji_ != 0) {
        setDnhbpengpjiValue(other.getDnhbpengpjiValue());
      }
      if (other.getGlhgiafpnbh() != 0L) {
        setGlhgiafpnbh(other.getGlhgiafpnbh());
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
      POGOProtos.Rpc.CAEOPHDPFLO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CAEOPHDPFLO) e.getUnfinishedMessage();
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

    private long glhgiafpnbh_ ;
    /**
     * <code>uint64 glhgiafpnbh = 2;</code>
     * @return The glhgiafpnbh.
     */
    public long getGlhgiafpnbh() {
      return glhgiafpnbh_;
    }
    /**
     * <code>uint64 glhgiafpnbh = 2;</code>
     * @param value The glhgiafpnbh to set.
     * @return This builder for chaining.
     */
    public Builder setGlhgiafpnbh(long value) {
      
      glhgiafpnbh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 glhgiafpnbh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGlhgiafpnbh() {
      
      glhgiafpnbh_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CAEOPHDPFLO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CAEOPHDPFLO)
  private static final POGOProtos.Rpc.CAEOPHDPFLO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CAEOPHDPFLO();
  }

  public static POGOProtos.Rpc.CAEOPHDPFLO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CAEOPHDPFLO>
      PARSER = new com.google.protobuf.AbstractParser<CAEOPHDPFLO>() {
    @java.lang.Override
    public CAEOPHDPFLO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CAEOPHDPFLO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CAEOPHDPFLO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CAEOPHDPFLO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CAEOPHDPFLO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

