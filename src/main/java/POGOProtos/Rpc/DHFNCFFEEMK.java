// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DHFNCFFEEMK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.DHFNCFFEEMK}
 */
public final class DHFNCFFEEMK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DHFNCFFEEMK)
    DHFNCFFEEMKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DHFNCFFEEMK.newBuilder() to construct.
  private DHFNCFFEEMK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DHFNCFFEEMK() {
    mgdjhpmlgfk_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DHFNCFFEEMK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DHFNCFFEEMK(
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

            mgdjhpmlgfk_ = s;
            break;
          }
          case 16: {

            dacehgfhpic_ = input.readBool();
            break;
          }
          case 24: {

            ngnlpfneham_ = input.readInt32();
            break;
          }
          case 32: {

            ompdlbkfofh_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DHFNCFFEEMK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DHFNCFFEEMK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DHFNCFFEEMK.class, POGOProtos.Rpc.DHFNCFFEEMK.Builder.class);
  }

  public static final int MGDJHPMLGFK_FIELD_NUMBER = 1;
  private volatile java.lang.Object mgdjhpmlgfk_;
  /**
   * <code>string mgdjhpmlgfk = 1;</code>
   * @return The mgdjhpmlgfk.
   */
  @java.lang.Override
  public java.lang.String getMgdjhpmlgfk() {
    java.lang.Object ref = mgdjhpmlgfk_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mgdjhpmlgfk_ = s;
      return s;
    }
  }
  /**
   * <code>string mgdjhpmlgfk = 1;</code>
   * @return The bytes for mgdjhpmlgfk.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMgdjhpmlgfkBytes() {
    java.lang.Object ref = mgdjhpmlgfk_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mgdjhpmlgfk_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DACEHGFHPIC_FIELD_NUMBER = 2;
  private boolean dacehgfhpic_;
  /**
   * <code>bool dacehgfhpic = 2;</code>
   * @return The dacehgfhpic.
   */
  @java.lang.Override
  public boolean getDacehgfhpic() {
    return dacehgfhpic_;
  }

  public static final int NGNLPFNEHAM_FIELD_NUMBER = 3;
  private int ngnlpfneham_;
  /**
   * <code>int32 ngnlpfneham = 3;</code>
   * @return The ngnlpfneham.
   */
  @java.lang.Override
  public int getNgnlpfneham() {
    return ngnlpfneham_;
  }

  public static final int OMPDLBKFOFH_FIELD_NUMBER = 4;
  private int ompdlbkfofh_;
  /**
   * <code>int32 ompdlbkfofh = 4;</code>
   * @return The ompdlbkfofh.
   */
  @java.lang.Override
  public int getOmpdlbkfofh() {
    return ompdlbkfofh_;
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
    if (!getMgdjhpmlgfkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mgdjhpmlgfk_);
    }
    if (dacehgfhpic_ != false) {
      output.writeBool(2, dacehgfhpic_);
    }
    if (ngnlpfneham_ != 0) {
      output.writeInt32(3, ngnlpfneham_);
    }
    if (ompdlbkfofh_ != 0) {
      output.writeInt32(4, ompdlbkfofh_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMgdjhpmlgfkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mgdjhpmlgfk_);
    }
    if (dacehgfhpic_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, dacehgfhpic_);
    }
    if (ngnlpfneham_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, ngnlpfneham_);
    }
    if (ompdlbkfofh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, ompdlbkfofh_);
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
    if (!(obj instanceof POGOProtos.Rpc.DHFNCFFEEMK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DHFNCFFEEMK other = (POGOProtos.Rpc.DHFNCFFEEMK) obj;

    if (!getMgdjhpmlgfk()
        .equals(other.getMgdjhpmlgfk())) return false;
    if (getDacehgfhpic()
        != other.getDacehgfhpic()) return false;
    if (getNgnlpfneham()
        != other.getNgnlpfneham()) return false;
    if (getOmpdlbkfofh()
        != other.getOmpdlbkfofh()) return false;
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
    hash = (37 * hash) + MGDJHPMLGFK_FIELD_NUMBER;
    hash = (53 * hash) + getMgdjhpmlgfk().hashCode();
    hash = (37 * hash) + DACEHGFHPIC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDacehgfhpic());
    hash = (37 * hash) + NGNLPFNEHAM_FIELD_NUMBER;
    hash = (53 * hash) + getNgnlpfneham();
    hash = (37 * hash) + OMPDLBKFOFH_FIELD_NUMBER;
    hash = (53 * hash) + getOmpdlbkfofh();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DHFNCFFEEMK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DHFNCFFEEMK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DHFNCFFEEMK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DHFNCFFEEMK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DHFNCFFEEMK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DHFNCFFEEMK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DHFNCFFEEMK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DHFNCFFEEMK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DHFNCFFEEMK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DHFNCFFEEMK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DHFNCFFEEMK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DHFNCFFEEMK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DHFNCFFEEMK prototype) {
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
   * ref: DHFNCFFEEMK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.DHFNCFFEEMK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DHFNCFFEEMK)
      POGOProtos.Rpc.DHFNCFFEEMKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DHFNCFFEEMK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DHFNCFFEEMK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DHFNCFFEEMK.class, POGOProtos.Rpc.DHFNCFFEEMK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DHFNCFFEEMK.newBuilder()
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
      mgdjhpmlgfk_ = "";

      dacehgfhpic_ = false;

      ngnlpfneham_ = 0;

      ompdlbkfofh_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DHFNCFFEEMK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DHFNCFFEEMK getDefaultInstanceForType() {
      return POGOProtos.Rpc.DHFNCFFEEMK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DHFNCFFEEMK build() {
      POGOProtos.Rpc.DHFNCFFEEMK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DHFNCFFEEMK buildPartial() {
      POGOProtos.Rpc.DHFNCFFEEMK result = new POGOProtos.Rpc.DHFNCFFEEMK(this);
      result.mgdjhpmlgfk_ = mgdjhpmlgfk_;
      result.dacehgfhpic_ = dacehgfhpic_;
      result.ngnlpfneham_ = ngnlpfneham_;
      result.ompdlbkfofh_ = ompdlbkfofh_;
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
      if (other instanceof POGOProtos.Rpc.DHFNCFFEEMK) {
        return mergeFrom((POGOProtos.Rpc.DHFNCFFEEMK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DHFNCFFEEMK other) {
      if (other == POGOProtos.Rpc.DHFNCFFEEMK.getDefaultInstance()) return this;
      if (!other.getMgdjhpmlgfk().isEmpty()) {
        mgdjhpmlgfk_ = other.mgdjhpmlgfk_;
        onChanged();
      }
      if (other.getDacehgfhpic() != false) {
        setDacehgfhpic(other.getDacehgfhpic());
      }
      if (other.getNgnlpfneham() != 0) {
        setNgnlpfneham(other.getNgnlpfneham());
      }
      if (other.getOmpdlbkfofh() != 0) {
        setOmpdlbkfofh(other.getOmpdlbkfofh());
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
      POGOProtos.Rpc.DHFNCFFEEMK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DHFNCFFEEMK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mgdjhpmlgfk_ = "";
    /**
     * <code>string mgdjhpmlgfk = 1;</code>
     * @return The mgdjhpmlgfk.
     */
    public java.lang.String getMgdjhpmlgfk() {
      java.lang.Object ref = mgdjhpmlgfk_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mgdjhpmlgfk_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mgdjhpmlgfk = 1;</code>
     * @return The bytes for mgdjhpmlgfk.
     */
    public com.google.protobuf.ByteString
        getMgdjhpmlgfkBytes() {
      java.lang.Object ref = mgdjhpmlgfk_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mgdjhpmlgfk_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mgdjhpmlgfk = 1;</code>
     * @param value The mgdjhpmlgfk to set.
     * @return This builder for chaining.
     */
    public Builder setMgdjhpmlgfk(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mgdjhpmlgfk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mgdjhpmlgfk = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMgdjhpmlgfk() {
      
      mgdjhpmlgfk_ = getDefaultInstance().getMgdjhpmlgfk();
      onChanged();
      return this;
    }
    /**
     * <code>string mgdjhpmlgfk = 1;</code>
     * @param value The bytes for mgdjhpmlgfk to set.
     * @return This builder for chaining.
     */
    public Builder setMgdjhpmlgfkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mgdjhpmlgfk_ = value;
      onChanged();
      return this;
    }

    private boolean dacehgfhpic_ ;
    /**
     * <code>bool dacehgfhpic = 2;</code>
     * @return The dacehgfhpic.
     */
    @java.lang.Override
    public boolean getDacehgfhpic() {
      return dacehgfhpic_;
    }
    /**
     * <code>bool dacehgfhpic = 2;</code>
     * @param value The dacehgfhpic to set.
     * @return This builder for chaining.
     */
    public Builder setDacehgfhpic(boolean value) {
      
      dacehgfhpic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool dacehgfhpic = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDacehgfhpic() {
      
      dacehgfhpic_ = false;
      onChanged();
      return this;
    }

    private int ngnlpfneham_ ;
    /**
     * <code>int32 ngnlpfneham = 3;</code>
     * @return The ngnlpfneham.
     */
    @java.lang.Override
    public int getNgnlpfneham() {
      return ngnlpfneham_;
    }
    /**
     * <code>int32 ngnlpfneham = 3;</code>
     * @param value The ngnlpfneham to set.
     * @return This builder for chaining.
     */
    public Builder setNgnlpfneham(int value) {
      
      ngnlpfneham_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ngnlpfneham = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNgnlpfneham() {
      
      ngnlpfneham_ = 0;
      onChanged();
      return this;
    }

    private int ompdlbkfofh_ ;
    /**
     * <code>int32 ompdlbkfofh = 4;</code>
     * @return The ompdlbkfofh.
     */
    @java.lang.Override
    public int getOmpdlbkfofh() {
      return ompdlbkfofh_;
    }
    /**
     * <code>int32 ompdlbkfofh = 4;</code>
     * @param value The ompdlbkfofh to set.
     * @return This builder for chaining.
     */
    public Builder setOmpdlbkfofh(int value) {
      
      ompdlbkfofh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ompdlbkfofh = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOmpdlbkfofh() {
      
      ompdlbkfofh_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DHFNCFFEEMK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DHFNCFFEEMK)
  private static final POGOProtos.Rpc.DHFNCFFEEMK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DHFNCFFEEMK();
  }

  public static POGOProtos.Rpc.DHFNCFFEEMK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DHFNCFFEEMK>
      PARSER = new com.google.protobuf.AbstractParser<DHFNCFFEEMK>() {
    @java.lang.Override
    public DHFNCFFEEMK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DHFNCFFEEMK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DHFNCFFEEMK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DHFNCFFEEMK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DHFNCFFEEMK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

