// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DICCDODLIPA
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.DICCDODLIPA}
 */
public final class DICCDODLIPA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DICCDODLIPA)
    DICCDODLIPAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DICCDODLIPA.newBuilder() to construct.
  private DICCDODLIPA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DICCDODLIPA() {
    lcjjmpjdhmo_ = "";
    kbkjjefcpic_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DICCDODLIPA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DICCDODLIPA(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            lcjjmpjdhmo_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            kbkjjefcpic_ = s;
            break;
          }
          case 24: {

            dahdegccflo_ = input.readInt32();
            break;
          }
          case 32: {

            khmighacbpn_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DICCDODLIPA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DICCDODLIPA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DICCDODLIPA.class, POGOProtos.Rpc.DICCDODLIPA.Builder.class);
  }

  public static final int LCJJMPJDHMO_FIELD_NUMBER = 1;
  private volatile java.lang.Object lcjjmpjdhmo_;
  /**
   * <code>string lcjjmpjdhmo = 1;</code>
   * @return The lcjjmpjdhmo.
   */
  @java.lang.Override
  public java.lang.String getLcjjmpjdhmo() {
    java.lang.Object ref = lcjjmpjdhmo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lcjjmpjdhmo_ = s;
      return s;
    }
  }
  /**
   * <code>string lcjjmpjdhmo = 1;</code>
   * @return The bytes for lcjjmpjdhmo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLcjjmpjdhmoBytes() {
    java.lang.Object ref = lcjjmpjdhmo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lcjjmpjdhmo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KBKJJEFCPIC_FIELD_NUMBER = 2;
  private volatile java.lang.Object kbkjjefcpic_;
  /**
   * <code>string kbkjjefcpic = 2;</code>
   * @return The kbkjjefcpic.
   */
  @java.lang.Override
  public java.lang.String getKbkjjefcpic() {
    java.lang.Object ref = kbkjjefcpic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kbkjjefcpic_ = s;
      return s;
    }
  }
  /**
   * <code>string kbkjjefcpic = 2;</code>
   * @return The bytes for kbkjjefcpic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKbkjjefcpicBytes() {
    java.lang.Object ref = kbkjjefcpic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kbkjjefcpic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DAHDEGCCFLO_FIELD_NUMBER = 3;
  private int dahdegccflo_;
  /**
   * <code>int32 dahdegccflo = 3;</code>
   * @return The dahdegccflo.
   */
  @java.lang.Override
  public int getDahdegccflo() {
    return dahdegccflo_;
  }

  public static final int KHMIGHACBPN_FIELD_NUMBER = 4;
  private long khmighacbpn_;
  /**
   * <code>int64 khmighacbpn = 4;</code>
   * @return The khmighacbpn.
   */
  @java.lang.Override
  public long getKhmighacbpn() {
    return khmighacbpn_;
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
    if (!getLcjjmpjdhmoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lcjjmpjdhmo_);
    }
    if (!getKbkjjefcpicBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kbkjjefcpic_);
    }
    if (dahdegccflo_ != 0) {
      output.writeInt32(3, dahdegccflo_);
    }
    if (khmighacbpn_ != 0L) {
      output.writeInt64(4, khmighacbpn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLcjjmpjdhmoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lcjjmpjdhmo_);
    }
    if (!getKbkjjefcpicBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kbkjjefcpic_);
    }
    if (dahdegccflo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, dahdegccflo_);
    }
    if (khmighacbpn_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, khmighacbpn_);
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
    if (!(obj instanceof POGOProtos.Rpc.DICCDODLIPA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DICCDODLIPA other = (POGOProtos.Rpc.DICCDODLIPA) obj;

    if (!getLcjjmpjdhmo()
        .equals(other.getLcjjmpjdhmo())) return false;
    if (!getKbkjjefcpic()
        .equals(other.getKbkjjefcpic())) return false;
    if (getDahdegccflo()
        != other.getDahdegccflo()) return false;
    if (getKhmighacbpn()
        != other.getKhmighacbpn()) return false;
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
    hash = (37 * hash) + LCJJMPJDHMO_FIELD_NUMBER;
    hash = (53 * hash) + getLcjjmpjdhmo().hashCode();
    hash = (37 * hash) + KBKJJEFCPIC_FIELD_NUMBER;
    hash = (53 * hash) + getKbkjjefcpic().hashCode();
    hash = (37 * hash) + DAHDEGCCFLO_FIELD_NUMBER;
    hash = (53 * hash) + getDahdegccflo();
    hash = (37 * hash) + KHMIGHACBPN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getKhmighacbpn());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DICCDODLIPA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DICCDODLIPA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DICCDODLIPA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DICCDODLIPA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DICCDODLIPA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DICCDODLIPA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DICCDODLIPA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DICCDODLIPA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DICCDODLIPA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DICCDODLIPA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DICCDODLIPA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DICCDODLIPA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DICCDODLIPA prototype) {
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
   * ref: DICCDODLIPA
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.DICCDODLIPA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DICCDODLIPA)
      POGOProtos.Rpc.DICCDODLIPAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DICCDODLIPA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DICCDODLIPA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DICCDODLIPA.class, POGOProtos.Rpc.DICCDODLIPA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DICCDODLIPA.newBuilder()
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
      lcjjmpjdhmo_ = "";

      kbkjjefcpic_ = "";

      dahdegccflo_ = 0;

      khmighacbpn_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DICCDODLIPA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DICCDODLIPA getDefaultInstanceForType() {
      return POGOProtos.Rpc.DICCDODLIPA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DICCDODLIPA build() {
      POGOProtos.Rpc.DICCDODLIPA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DICCDODLIPA buildPartial() {
      POGOProtos.Rpc.DICCDODLIPA result = new POGOProtos.Rpc.DICCDODLIPA(this);
      result.lcjjmpjdhmo_ = lcjjmpjdhmo_;
      result.kbkjjefcpic_ = kbkjjefcpic_;
      result.dahdegccflo_ = dahdegccflo_;
      result.khmighacbpn_ = khmighacbpn_;
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
      if (other instanceof POGOProtos.Rpc.DICCDODLIPA) {
        return mergeFrom((POGOProtos.Rpc.DICCDODLIPA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DICCDODLIPA other) {
      if (other == POGOProtos.Rpc.DICCDODLIPA.getDefaultInstance()) return this;
      if (!other.getLcjjmpjdhmo().isEmpty()) {
        lcjjmpjdhmo_ = other.lcjjmpjdhmo_;
        onChanged();
      }
      if (!other.getKbkjjefcpic().isEmpty()) {
        kbkjjefcpic_ = other.kbkjjefcpic_;
        onChanged();
      }
      if (other.getDahdegccflo() != 0) {
        setDahdegccflo(other.getDahdegccflo());
      }
      if (other.getKhmighacbpn() != 0L) {
        setKhmighacbpn(other.getKhmighacbpn());
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
      POGOProtos.Rpc.DICCDODLIPA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DICCDODLIPA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object lcjjmpjdhmo_ = "";
    /**
     * <code>string lcjjmpjdhmo = 1;</code>
     * @return The lcjjmpjdhmo.
     */
    public java.lang.String getLcjjmpjdhmo() {
      java.lang.Object ref = lcjjmpjdhmo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lcjjmpjdhmo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lcjjmpjdhmo = 1;</code>
     * @return The bytes for lcjjmpjdhmo.
     */
    public com.google.protobuf.ByteString
        getLcjjmpjdhmoBytes() {
      java.lang.Object ref = lcjjmpjdhmo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lcjjmpjdhmo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lcjjmpjdhmo = 1;</code>
     * @param value The lcjjmpjdhmo to set.
     * @return This builder for chaining.
     */
    public Builder setLcjjmpjdhmo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lcjjmpjdhmo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lcjjmpjdhmo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcjjmpjdhmo() {
      
      lcjjmpjdhmo_ = getDefaultInstance().getLcjjmpjdhmo();
      onChanged();
      return this;
    }
    /**
     * <code>string lcjjmpjdhmo = 1;</code>
     * @param value The bytes for lcjjmpjdhmo to set.
     * @return This builder for chaining.
     */
    public Builder setLcjjmpjdhmoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lcjjmpjdhmo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object kbkjjefcpic_ = "";
    /**
     * <code>string kbkjjefcpic = 2;</code>
     * @return The kbkjjefcpic.
     */
    public java.lang.String getKbkjjefcpic() {
      java.lang.Object ref = kbkjjefcpic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kbkjjefcpic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string kbkjjefcpic = 2;</code>
     * @return The bytes for kbkjjefcpic.
     */
    public com.google.protobuf.ByteString
        getKbkjjefcpicBytes() {
      java.lang.Object ref = kbkjjefcpic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kbkjjefcpic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string kbkjjefcpic = 2;</code>
     * @param value The kbkjjefcpic to set.
     * @return This builder for chaining.
     */
    public Builder setKbkjjefcpic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kbkjjefcpic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string kbkjjefcpic = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKbkjjefcpic() {
      
      kbkjjefcpic_ = getDefaultInstance().getKbkjjefcpic();
      onChanged();
      return this;
    }
    /**
     * <code>string kbkjjefcpic = 2;</code>
     * @param value The bytes for kbkjjefcpic to set.
     * @return This builder for chaining.
     */
    public Builder setKbkjjefcpicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kbkjjefcpic_ = value;
      onChanged();
      return this;
    }

    private int dahdegccflo_ ;
    /**
     * <code>int32 dahdegccflo = 3;</code>
     * @return The dahdegccflo.
     */
    @java.lang.Override
    public int getDahdegccflo() {
      return dahdegccflo_;
    }
    /**
     * <code>int32 dahdegccflo = 3;</code>
     * @param value The dahdegccflo to set.
     * @return This builder for chaining.
     */
    public Builder setDahdegccflo(int value) {
      
      dahdegccflo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 dahdegccflo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDahdegccflo() {
      
      dahdegccflo_ = 0;
      onChanged();
      return this;
    }

    private long khmighacbpn_ ;
    /**
     * <code>int64 khmighacbpn = 4;</code>
     * @return The khmighacbpn.
     */
    @java.lang.Override
    public long getKhmighacbpn() {
      return khmighacbpn_;
    }
    /**
     * <code>int64 khmighacbpn = 4;</code>
     * @param value The khmighacbpn to set.
     * @return This builder for chaining.
     */
    public Builder setKhmighacbpn(long value) {
      
      khmighacbpn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 khmighacbpn = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKhmighacbpn() {
      
      khmighacbpn_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DICCDODLIPA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DICCDODLIPA)
  private static final POGOProtos.Rpc.DICCDODLIPA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DICCDODLIPA();
  }

  public static POGOProtos.Rpc.DICCDODLIPA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DICCDODLIPA>
      PARSER = new com.google.protobuf.AbstractParser<DICCDODLIPA>() {
    @java.lang.Override
    public DICCDODLIPA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DICCDODLIPA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DICCDODLIPA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DICCDODLIPA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DICCDODLIPA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

