// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: EICFMELEHDN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.EICFMELEHDN}
 */
public  final class EICFMELEHDN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EICFMELEHDN)
    EICFMELEHDNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EICFMELEHDN.newBuilder() to construct.
  private EICFMELEHDN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EICFMELEHDN() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EICFMELEHDN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EICFMELEHDN(
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

            mkefiklkmbg_ = input.readInt32();
            break;
          }
          case 16: {

            pmcocpnchnh_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EICFMELEHDN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EICFMELEHDN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EICFMELEHDN.class, POGOProtos.Rpc.EICFMELEHDN.Builder.class);
  }

  public static final int MKEFIKLKMBG_FIELD_NUMBER = 1;
  private int mkefiklkmbg_;
  /**
   * <code>int32 mkefiklkmbg = 1;</code>
   * @return The mkefiklkmbg.
   */
  public int getMkefiklkmbg() {
    return mkefiklkmbg_;
  }

  public static final int PMCOCPNCHNH_FIELD_NUMBER = 2;
  private int pmcocpnchnh_;
  /**
   * <code>int32 pmcocpnchnh = 2;</code>
   * @return The pmcocpnchnh.
   */
  public int getPmcocpnchnh() {
    return pmcocpnchnh_;
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
    if (mkefiklkmbg_ != 0) {
      output.writeInt32(1, mkefiklkmbg_);
    }
    if (pmcocpnchnh_ != 0) {
      output.writeInt32(2, pmcocpnchnh_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mkefiklkmbg_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, mkefiklkmbg_);
    }
    if (pmcocpnchnh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pmcocpnchnh_);
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
    if (!(obj instanceof POGOProtos.Rpc.EICFMELEHDN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EICFMELEHDN other = (POGOProtos.Rpc.EICFMELEHDN) obj;

    if (getMkefiklkmbg()
        != other.getMkefiklkmbg()) return false;
    if (getPmcocpnchnh()
        != other.getPmcocpnchnh()) return false;
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
    hash = (37 * hash) + MKEFIKLKMBG_FIELD_NUMBER;
    hash = (53 * hash) + getMkefiklkmbg();
    hash = (37 * hash) + PMCOCPNCHNH_FIELD_NUMBER;
    hash = (53 * hash) + getPmcocpnchnh();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EICFMELEHDN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EICFMELEHDN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EICFMELEHDN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EICFMELEHDN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EICFMELEHDN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EICFMELEHDN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EICFMELEHDN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EICFMELEHDN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EICFMELEHDN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EICFMELEHDN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EICFMELEHDN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EICFMELEHDN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EICFMELEHDN prototype) {
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
   * ref: EICFMELEHDN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.EICFMELEHDN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EICFMELEHDN)
      POGOProtos.Rpc.EICFMELEHDNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EICFMELEHDN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EICFMELEHDN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EICFMELEHDN.class, POGOProtos.Rpc.EICFMELEHDN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EICFMELEHDN.newBuilder()
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
      mkefiklkmbg_ = 0;

      pmcocpnchnh_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EICFMELEHDN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EICFMELEHDN getDefaultInstanceForType() {
      return POGOProtos.Rpc.EICFMELEHDN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EICFMELEHDN build() {
      POGOProtos.Rpc.EICFMELEHDN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EICFMELEHDN buildPartial() {
      POGOProtos.Rpc.EICFMELEHDN result = new POGOProtos.Rpc.EICFMELEHDN(this);
      result.mkefiklkmbg_ = mkefiklkmbg_;
      result.pmcocpnchnh_ = pmcocpnchnh_;
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
      if (other instanceof POGOProtos.Rpc.EICFMELEHDN) {
        return mergeFrom((POGOProtos.Rpc.EICFMELEHDN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EICFMELEHDN other) {
      if (other == POGOProtos.Rpc.EICFMELEHDN.getDefaultInstance()) return this;
      if (other.getMkefiklkmbg() != 0) {
        setMkefiklkmbg(other.getMkefiklkmbg());
      }
      if (other.getPmcocpnchnh() != 0) {
        setPmcocpnchnh(other.getPmcocpnchnh());
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
      POGOProtos.Rpc.EICFMELEHDN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EICFMELEHDN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int mkefiklkmbg_ ;
    /**
     * <code>int32 mkefiklkmbg = 1;</code>
     * @return The mkefiklkmbg.
     */
    public int getMkefiklkmbg() {
      return mkefiklkmbg_;
    }
    /**
     * <code>int32 mkefiklkmbg = 1;</code>
     * @param value The mkefiklkmbg to set.
     * @return This builder for chaining.
     */
    public Builder setMkefiklkmbg(int value) {
      
      mkefiklkmbg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mkefiklkmbg = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMkefiklkmbg() {
      
      mkefiklkmbg_ = 0;
      onChanged();
      return this;
    }

    private int pmcocpnchnh_ ;
    /**
     * <code>int32 pmcocpnchnh = 2;</code>
     * @return The pmcocpnchnh.
     */
    public int getPmcocpnchnh() {
      return pmcocpnchnh_;
    }
    /**
     * <code>int32 pmcocpnchnh = 2;</code>
     * @param value The pmcocpnchnh to set.
     * @return This builder for chaining.
     */
    public Builder setPmcocpnchnh(int value) {
      
      pmcocpnchnh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pmcocpnchnh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPmcocpnchnh() {
      
      pmcocpnchnh_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EICFMELEHDN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EICFMELEHDN)
  private static final POGOProtos.Rpc.EICFMELEHDN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EICFMELEHDN();
  }

  public static POGOProtos.Rpc.EICFMELEHDN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EICFMELEHDN>
      PARSER = new com.google.protobuf.AbstractParser<EICFMELEHDN>() {
    @java.lang.Override
    public EICFMELEHDN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EICFMELEHDN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EICFMELEHDN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EICFMELEHDN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EICFMELEHDN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

