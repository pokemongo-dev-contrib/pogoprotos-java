// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.HMAPKPGCNCA}
 */
public  final class HMAPKPGCNCA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HMAPKPGCNCA)
    HMAPKPGCNCAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HMAPKPGCNCA.newBuilder() to construct.
  private HMAPKPGCNCA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HMAPKPGCNCA() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HMAPKPGCNCA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HMAPKPGCNCA(
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

            bilhbgbjpno_ = input.readBool();
            break;
          }
          case 16: {

            igklacpniji_ = input.readBool();
            break;
          }
          case 24: {

            lokjkjjhgnl_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMAPKPGCNCA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMAPKPGCNCA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HMAPKPGCNCA.class, POGOProtos.Rpc.HMAPKPGCNCA.Builder.class);
  }

  public static final int BILHBGBJPNO_FIELD_NUMBER = 1;
  private boolean bilhbgbjpno_;
  /**
   * <code>bool bilhbgbjpno = 1;</code>
   * @return The bilhbgbjpno.
   */
  public boolean getBilhbgbjpno() {
    return bilhbgbjpno_;
  }

  public static final int IGKLACPNIJI_FIELD_NUMBER = 2;
  private boolean igklacpniji_;
  /**
   * <code>bool igklacpniji = 2;</code>
   * @return The igklacpniji.
   */
  public boolean getIgklacpniji() {
    return igklacpniji_;
  }

  public static final int LOKJKJJHGNL_FIELD_NUMBER = 3;
  private boolean lokjkjjhgnl_;
  /**
   * <code>bool lokjkjjhgnl = 3;</code>
   * @return The lokjkjjhgnl.
   */
  public boolean getLokjkjjhgnl() {
    return lokjkjjhgnl_;
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
    if (bilhbgbjpno_ != false) {
      output.writeBool(1, bilhbgbjpno_);
    }
    if (igklacpniji_ != false) {
      output.writeBool(2, igklacpniji_);
    }
    if (lokjkjjhgnl_ != false) {
      output.writeBool(3, lokjkjjhgnl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bilhbgbjpno_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, bilhbgbjpno_);
    }
    if (igklacpniji_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, igklacpniji_);
    }
    if (lokjkjjhgnl_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, lokjkjjhgnl_);
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
    if (!(obj instanceof POGOProtos.Rpc.HMAPKPGCNCA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HMAPKPGCNCA other = (POGOProtos.Rpc.HMAPKPGCNCA) obj;

    if (getBilhbgbjpno()
        != other.getBilhbgbjpno()) return false;
    if (getIgklacpniji()
        != other.getIgklacpniji()) return false;
    if (getLokjkjjhgnl()
        != other.getLokjkjjhgnl()) return false;
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
    hash = (37 * hash) + BILHBGBJPNO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBilhbgbjpno());
    hash = (37 * hash) + IGKLACPNIJI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIgklacpniji());
    hash = (37 * hash) + LOKJKJJHGNL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLokjkjjhgnl());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HMAPKPGCNCA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HMAPKPGCNCA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMAPKPGCNCA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HMAPKPGCNCA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMAPKPGCNCA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HMAPKPGCNCA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMAPKPGCNCA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HMAPKPGCNCA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMAPKPGCNCA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HMAPKPGCNCA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMAPKPGCNCA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HMAPKPGCNCA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HMAPKPGCNCA prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.HMAPKPGCNCA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HMAPKPGCNCA)
      POGOProtos.Rpc.HMAPKPGCNCAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMAPKPGCNCA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMAPKPGCNCA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HMAPKPGCNCA.class, POGOProtos.Rpc.HMAPKPGCNCA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HMAPKPGCNCA.newBuilder()
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
      bilhbgbjpno_ = false;

      igklacpniji_ = false;

      lokjkjjhgnl_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMAPKPGCNCA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HMAPKPGCNCA getDefaultInstanceForType() {
      return POGOProtos.Rpc.HMAPKPGCNCA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HMAPKPGCNCA build() {
      POGOProtos.Rpc.HMAPKPGCNCA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HMAPKPGCNCA buildPartial() {
      POGOProtos.Rpc.HMAPKPGCNCA result = new POGOProtos.Rpc.HMAPKPGCNCA(this);
      result.bilhbgbjpno_ = bilhbgbjpno_;
      result.igklacpniji_ = igklacpniji_;
      result.lokjkjjhgnl_ = lokjkjjhgnl_;
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
      if (other instanceof POGOProtos.Rpc.HMAPKPGCNCA) {
        return mergeFrom((POGOProtos.Rpc.HMAPKPGCNCA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HMAPKPGCNCA other) {
      if (other == POGOProtos.Rpc.HMAPKPGCNCA.getDefaultInstance()) return this;
      if (other.getBilhbgbjpno() != false) {
        setBilhbgbjpno(other.getBilhbgbjpno());
      }
      if (other.getIgklacpniji() != false) {
        setIgklacpniji(other.getIgklacpniji());
      }
      if (other.getLokjkjjhgnl() != false) {
        setLokjkjjhgnl(other.getLokjkjjhgnl());
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
      POGOProtos.Rpc.HMAPKPGCNCA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HMAPKPGCNCA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean bilhbgbjpno_ ;
    /**
     * <code>bool bilhbgbjpno = 1;</code>
     * @return The bilhbgbjpno.
     */
    public boolean getBilhbgbjpno() {
      return bilhbgbjpno_;
    }
    /**
     * <code>bool bilhbgbjpno = 1;</code>
     * @param value The bilhbgbjpno to set.
     * @return This builder for chaining.
     */
    public Builder setBilhbgbjpno(boolean value) {
      
      bilhbgbjpno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool bilhbgbjpno = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBilhbgbjpno() {
      
      bilhbgbjpno_ = false;
      onChanged();
      return this;
    }

    private boolean igklacpniji_ ;
    /**
     * <code>bool igklacpniji = 2;</code>
     * @return The igklacpniji.
     */
    public boolean getIgklacpniji() {
      return igklacpniji_;
    }
    /**
     * <code>bool igklacpniji = 2;</code>
     * @param value The igklacpniji to set.
     * @return This builder for chaining.
     */
    public Builder setIgklacpniji(boolean value) {
      
      igklacpniji_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool igklacpniji = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIgklacpniji() {
      
      igklacpniji_ = false;
      onChanged();
      return this;
    }

    private boolean lokjkjjhgnl_ ;
    /**
     * <code>bool lokjkjjhgnl = 3;</code>
     * @return The lokjkjjhgnl.
     */
    public boolean getLokjkjjhgnl() {
      return lokjkjjhgnl_;
    }
    /**
     * <code>bool lokjkjjhgnl = 3;</code>
     * @param value The lokjkjjhgnl to set.
     * @return This builder for chaining.
     */
    public Builder setLokjkjjhgnl(boolean value) {
      
      lokjkjjhgnl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool lokjkjjhgnl = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLokjkjjhgnl() {
      
      lokjkjjhgnl_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HMAPKPGCNCA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HMAPKPGCNCA)
  private static final POGOProtos.Rpc.HMAPKPGCNCA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HMAPKPGCNCA();
  }

  public static POGOProtos.Rpc.HMAPKPGCNCA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HMAPKPGCNCA>
      PARSER = new com.google.protobuf.AbstractParser<HMAPKPGCNCA>() {
    @java.lang.Override
    public HMAPKPGCNCA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HMAPKPGCNCA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HMAPKPGCNCA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HMAPKPGCNCA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HMAPKPGCNCA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

