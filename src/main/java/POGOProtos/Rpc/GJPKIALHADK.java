// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: GJPKIALHADK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GJPKIALHADK}
 */
public final class GJPKIALHADK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GJPKIALHADK)
    GJPKIALHADKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GJPKIALHADK.newBuilder() to construct.
  private GJPKIALHADK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GJPKIALHADK() {
    nekmkfjmhdl_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GJPKIALHADK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GJPKIALHADK(
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

            nekmkfjmhdl_ = rawValue;
            break;
          }
          case 16: {

            ofabcfnedbe_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GJPKIALHADK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GJPKIALHADK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GJPKIALHADK.class, POGOProtos.Rpc.GJPKIALHADK.Builder.class);
  }

  public static final int NEKMKFJMHDL_FIELD_NUMBER = 1;
  private int nekmkfjmhdl_;
  /**
   * <code>.POGOProtos.Rpc.BHHHOIEIGFO nekmkfjmhdl = 1;</code>
   * @return The enum numeric value on the wire for nekmkfjmhdl.
   */
  @java.lang.Override public int getNekmkfjmhdlValue() {
    return nekmkfjmhdl_;
  }
  /**
   * <code>.POGOProtos.Rpc.BHHHOIEIGFO nekmkfjmhdl = 1;</code>
   * @return The nekmkfjmhdl.
   */
  @java.lang.Override public POGOProtos.Rpc.BHHHOIEIGFO getNekmkfjmhdl() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BHHHOIEIGFO result = POGOProtos.Rpc.BHHHOIEIGFO.valueOf(nekmkfjmhdl_);
    return result == null ? POGOProtos.Rpc.BHHHOIEIGFO.UNRECOGNIZED : result;
  }

  public static final int OFABCFNEDBE_FIELD_NUMBER = 2;
  private boolean ofabcfnedbe_;
  /**
   * <code>bool ofabcfnedbe = 2;</code>
   * @return The ofabcfnedbe.
   */
  @java.lang.Override
  public boolean getOfabcfnedbe() {
    return ofabcfnedbe_;
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
    if (nekmkfjmhdl_ != POGOProtos.Rpc.BHHHOIEIGFO.BHHHOIEIGFO_ACTIVITY_UNKNOWN.getNumber()) {
      output.writeEnum(1, nekmkfjmhdl_);
    }
    if (ofabcfnedbe_ != false) {
      output.writeBool(2, ofabcfnedbe_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nekmkfjmhdl_ != POGOProtos.Rpc.BHHHOIEIGFO.BHHHOIEIGFO_ACTIVITY_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, nekmkfjmhdl_);
    }
    if (ofabcfnedbe_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, ofabcfnedbe_);
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
    if (!(obj instanceof POGOProtos.Rpc.GJPKIALHADK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GJPKIALHADK other = (POGOProtos.Rpc.GJPKIALHADK) obj;

    if (nekmkfjmhdl_ != other.nekmkfjmhdl_) return false;
    if (getOfabcfnedbe()
        != other.getOfabcfnedbe()) return false;
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
    hash = (37 * hash) + NEKMKFJMHDL_FIELD_NUMBER;
    hash = (53 * hash) + nekmkfjmhdl_;
    hash = (37 * hash) + OFABCFNEDBE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOfabcfnedbe());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GJPKIALHADK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GJPKIALHADK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJPKIALHADK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GJPKIALHADK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJPKIALHADK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GJPKIALHADK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJPKIALHADK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GJPKIALHADK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJPKIALHADK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GJPKIALHADK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GJPKIALHADK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GJPKIALHADK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GJPKIALHADK prototype) {
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
   * ref: GJPKIALHADK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GJPKIALHADK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GJPKIALHADK)
      POGOProtos.Rpc.GJPKIALHADKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GJPKIALHADK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GJPKIALHADK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GJPKIALHADK.class, POGOProtos.Rpc.GJPKIALHADK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GJPKIALHADK.newBuilder()
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
      nekmkfjmhdl_ = 0;

      ofabcfnedbe_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GJPKIALHADK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GJPKIALHADK getDefaultInstanceForType() {
      return POGOProtos.Rpc.GJPKIALHADK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GJPKIALHADK build() {
      POGOProtos.Rpc.GJPKIALHADK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GJPKIALHADK buildPartial() {
      POGOProtos.Rpc.GJPKIALHADK result = new POGOProtos.Rpc.GJPKIALHADK(this);
      result.nekmkfjmhdl_ = nekmkfjmhdl_;
      result.ofabcfnedbe_ = ofabcfnedbe_;
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
      if (other instanceof POGOProtos.Rpc.GJPKIALHADK) {
        return mergeFrom((POGOProtos.Rpc.GJPKIALHADK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GJPKIALHADK other) {
      if (other == POGOProtos.Rpc.GJPKIALHADK.getDefaultInstance()) return this;
      if (other.nekmkfjmhdl_ != 0) {
        setNekmkfjmhdlValue(other.getNekmkfjmhdlValue());
      }
      if (other.getOfabcfnedbe() != false) {
        setOfabcfnedbe(other.getOfabcfnedbe());
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
      POGOProtos.Rpc.GJPKIALHADK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GJPKIALHADK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int nekmkfjmhdl_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BHHHOIEIGFO nekmkfjmhdl = 1;</code>
     * @return The enum numeric value on the wire for nekmkfjmhdl.
     */
    @java.lang.Override public int getNekmkfjmhdlValue() {
      return nekmkfjmhdl_;
    }
    /**
     * <code>.POGOProtos.Rpc.BHHHOIEIGFO nekmkfjmhdl = 1;</code>
     * @param value The enum numeric value on the wire for nekmkfjmhdl to set.
     * @return This builder for chaining.
     */
    public Builder setNekmkfjmhdlValue(int value) {
      
      nekmkfjmhdl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BHHHOIEIGFO nekmkfjmhdl = 1;</code>
     * @return The nekmkfjmhdl.
     */
    @java.lang.Override
    public POGOProtos.Rpc.BHHHOIEIGFO getNekmkfjmhdl() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BHHHOIEIGFO result = POGOProtos.Rpc.BHHHOIEIGFO.valueOf(nekmkfjmhdl_);
      return result == null ? POGOProtos.Rpc.BHHHOIEIGFO.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BHHHOIEIGFO nekmkfjmhdl = 1;</code>
     * @param value The nekmkfjmhdl to set.
     * @return This builder for chaining.
     */
    public Builder setNekmkfjmhdl(POGOProtos.Rpc.BHHHOIEIGFO value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      nekmkfjmhdl_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BHHHOIEIGFO nekmkfjmhdl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNekmkfjmhdl() {
      
      nekmkfjmhdl_ = 0;
      onChanged();
      return this;
    }

    private boolean ofabcfnedbe_ ;
    /**
     * <code>bool ofabcfnedbe = 2;</code>
     * @return The ofabcfnedbe.
     */
    @java.lang.Override
    public boolean getOfabcfnedbe() {
      return ofabcfnedbe_;
    }
    /**
     * <code>bool ofabcfnedbe = 2;</code>
     * @param value The ofabcfnedbe to set.
     * @return This builder for chaining.
     */
    public Builder setOfabcfnedbe(boolean value) {
      
      ofabcfnedbe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ofabcfnedbe = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOfabcfnedbe() {
      
      ofabcfnedbe_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GJPKIALHADK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GJPKIALHADK)
  private static final POGOProtos.Rpc.GJPKIALHADK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GJPKIALHADK();
  }

  public static POGOProtos.Rpc.GJPKIALHADK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GJPKIALHADK>
      PARSER = new com.google.protobuf.AbstractParser<GJPKIALHADK>() {
    @java.lang.Override
    public GJPKIALHADK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GJPKIALHADK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GJPKIALHADK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GJPKIALHADK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GJPKIALHADK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

