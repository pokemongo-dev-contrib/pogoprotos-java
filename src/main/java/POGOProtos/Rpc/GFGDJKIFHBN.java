// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GFGDJKIFHBN}
 */
public  final class GFGDJKIFHBN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GFGDJKIFHBN)
    GFGDJKIFHBNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GFGDJKIFHBN.newBuilder() to construct.
  private GFGDJKIFHBN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GFGDJKIFHBN() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GFGDJKIFHBN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GFGDJKIFHBN(
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

            fappjlmkkml_ = input.readBool();
            break;
          }
          case 16: {

            kghpdnpihnl_ = input.readBool();
            break;
          }
          case 24: {

            mcdkckmgajf_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFGDJKIFHBN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFGDJKIFHBN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GFGDJKIFHBN.class, POGOProtos.Rpc.GFGDJKIFHBN.Builder.class);
  }

  public static final int FAPPJLMKKML_FIELD_NUMBER = 1;
  private boolean fappjlmkkml_;
  /**
   * <code>bool fappjlmkkml = 1;</code>
   * @return The fappjlmkkml.
   */
  public boolean getFappjlmkkml() {
    return fappjlmkkml_;
  }

  public static final int KGHPDNPIHNL_FIELD_NUMBER = 2;
  private boolean kghpdnpihnl_;
  /**
   * <code>bool kghpdnpihnl = 2;</code>
   * @return The kghpdnpihnl.
   */
  public boolean getKghpdnpihnl() {
    return kghpdnpihnl_;
  }

  public static final int MCDKCKMGAJF_FIELD_NUMBER = 3;
  private long mcdkckmgajf_;
  /**
   * <code>int64 mcdkckmgajf = 3;</code>
   * @return The mcdkckmgajf.
   */
  public long getMcdkckmgajf() {
    return mcdkckmgajf_;
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
    if (fappjlmkkml_ != false) {
      output.writeBool(1, fappjlmkkml_);
    }
    if (kghpdnpihnl_ != false) {
      output.writeBool(2, kghpdnpihnl_);
    }
    if (mcdkckmgajf_ != 0L) {
      output.writeInt64(3, mcdkckmgajf_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fappjlmkkml_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, fappjlmkkml_);
    }
    if (kghpdnpihnl_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, kghpdnpihnl_);
    }
    if (mcdkckmgajf_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, mcdkckmgajf_);
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
    if (!(obj instanceof POGOProtos.Rpc.GFGDJKIFHBN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GFGDJKIFHBN other = (POGOProtos.Rpc.GFGDJKIFHBN) obj;

    if (getFappjlmkkml()
        != other.getFappjlmkkml()) return false;
    if (getKghpdnpihnl()
        != other.getKghpdnpihnl()) return false;
    if (getMcdkckmgajf()
        != other.getMcdkckmgajf()) return false;
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
    hash = (37 * hash) + FAPPJLMKKML_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFappjlmkkml());
    hash = (37 * hash) + KGHPDNPIHNL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getKghpdnpihnl());
    hash = (37 * hash) + MCDKCKMGAJF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMcdkckmgajf());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GFGDJKIFHBN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GFGDJKIFHBN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFGDJKIFHBN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GFGDJKIFHBN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFGDJKIFHBN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GFGDJKIFHBN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFGDJKIFHBN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GFGDJKIFHBN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFGDJKIFHBN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GFGDJKIFHBN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFGDJKIFHBN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GFGDJKIFHBN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GFGDJKIFHBN prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GFGDJKIFHBN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GFGDJKIFHBN)
      POGOProtos.Rpc.GFGDJKIFHBNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFGDJKIFHBN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFGDJKIFHBN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GFGDJKIFHBN.class, POGOProtos.Rpc.GFGDJKIFHBN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GFGDJKIFHBN.newBuilder()
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
      fappjlmkkml_ = false;

      kghpdnpihnl_ = false;

      mcdkckmgajf_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFGDJKIFHBN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GFGDJKIFHBN getDefaultInstanceForType() {
      return POGOProtos.Rpc.GFGDJKIFHBN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GFGDJKIFHBN build() {
      POGOProtos.Rpc.GFGDJKIFHBN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GFGDJKIFHBN buildPartial() {
      POGOProtos.Rpc.GFGDJKIFHBN result = new POGOProtos.Rpc.GFGDJKIFHBN(this);
      result.fappjlmkkml_ = fappjlmkkml_;
      result.kghpdnpihnl_ = kghpdnpihnl_;
      result.mcdkckmgajf_ = mcdkckmgajf_;
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
      if (other instanceof POGOProtos.Rpc.GFGDJKIFHBN) {
        return mergeFrom((POGOProtos.Rpc.GFGDJKIFHBN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GFGDJKIFHBN other) {
      if (other == POGOProtos.Rpc.GFGDJKIFHBN.getDefaultInstance()) return this;
      if (other.getFappjlmkkml() != false) {
        setFappjlmkkml(other.getFappjlmkkml());
      }
      if (other.getKghpdnpihnl() != false) {
        setKghpdnpihnl(other.getKghpdnpihnl());
      }
      if (other.getMcdkckmgajf() != 0L) {
        setMcdkckmgajf(other.getMcdkckmgajf());
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
      POGOProtos.Rpc.GFGDJKIFHBN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GFGDJKIFHBN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean fappjlmkkml_ ;
    /**
     * <code>bool fappjlmkkml = 1;</code>
     * @return The fappjlmkkml.
     */
    public boolean getFappjlmkkml() {
      return fappjlmkkml_;
    }
    /**
     * <code>bool fappjlmkkml = 1;</code>
     * @param value The fappjlmkkml to set.
     * @return This builder for chaining.
     */
    public Builder setFappjlmkkml(boolean value) {
      
      fappjlmkkml_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool fappjlmkkml = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFappjlmkkml() {
      
      fappjlmkkml_ = false;
      onChanged();
      return this;
    }

    private boolean kghpdnpihnl_ ;
    /**
     * <code>bool kghpdnpihnl = 2;</code>
     * @return The kghpdnpihnl.
     */
    public boolean getKghpdnpihnl() {
      return kghpdnpihnl_;
    }
    /**
     * <code>bool kghpdnpihnl = 2;</code>
     * @param value The kghpdnpihnl to set.
     * @return This builder for chaining.
     */
    public Builder setKghpdnpihnl(boolean value) {
      
      kghpdnpihnl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool kghpdnpihnl = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKghpdnpihnl() {
      
      kghpdnpihnl_ = false;
      onChanged();
      return this;
    }

    private long mcdkckmgajf_ ;
    /**
     * <code>int64 mcdkckmgajf = 3;</code>
     * @return The mcdkckmgajf.
     */
    public long getMcdkckmgajf() {
      return mcdkckmgajf_;
    }
    /**
     * <code>int64 mcdkckmgajf = 3;</code>
     * @param value The mcdkckmgajf to set.
     * @return This builder for chaining.
     */
    public Builder setMcdkckmgajf(long value) {
      
      mcdkckmgajf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 mcdkckmgajf = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMcdkckmgajf() {
      
      mcdkckmgajf_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GFGDJKIFHBN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GFGDJKIFHBN)
  private static final POGOProtos.Rpc.GFGDJKIFHBN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GFGDJKIFHBN();
  }

  public static POGOProtos.Rpc.GFGDJKIFHBN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GFGDJKIFHBN>
      PARSER = new com.google.protobuf.AbstractParser<GFGDJKIFHBN>() {
    @java.lang.Override
    public GFGDJKIFHBN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GFGDJKIFHBN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GFGDJKIFHBN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GFGDJKIFHBN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GFGDJKIFHBN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

