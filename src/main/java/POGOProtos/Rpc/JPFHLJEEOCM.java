// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JPFHLJEEOCM
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JPFHLJEEOCM}
 */
public  final class JPFHLJEEOCM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JPFHLJEEOCM)
    JPFHLJEEOCMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JPFHLJEEOCM.newBuilder() to construct.
  private JPFHLJEEOCM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JPFHLJEEOCM() {
    olmibkifgme_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JPFHLJEEOCM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JPFHLJEEOCM(
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

            olmibkifgme_ = rawValue;
            break;
          }
          case 16: {

            emobmoongeh_ = input.readBool();
            break;
          }
          case 24: {

            neiadcjnale_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPFHLJEEOCM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPFHLJEEOCM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JPFHLJEEOCM.class, POGOProtos.Rpc.JPFHLJEEOCM.Builder.class);
  }

  public static final int OLMIBKIFGME_FIELD_NUMBER = 1;
  private int olmibkifgme_;
  /**
   * <code>.POGOProtos.Rpc.NLBGNFGGEKI olmibkifgme = 1;</code>
   * @return The enum numeric value on the wire for olmibkifgme.
   */
  public int getOlmibkifgmeValue() {
    return olmibkifgme_;
  }
  /**
   * <code>.POGOProtos.Rpc.NLBGNFGGEKI olmibkifgme = 1;</code>
   * @return The olmibkifgme.
   */
  public POGOProtos.Rpc.NLBGNFGGEKI getOlmibkifgme() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NLBGNFGGEKI result = POGOProtos.Rpc.NLBGNFGGEKI.valueOf(olmibkifgme_);
    return result == null ? POGOProtos.Rpc.NLBGNFGGEKI.UNRECOGNIZED : result;
  }

  public static final int EMOBMOONGEH_FIELD_NUMBER = 2;
  private boolean emobmoongeh_;
  /**
   * <code>bool emobmoongeh = 2;</code>
   * @return The emobmoongeh.
   */
  public boolean getEmobmoongeh() {
    return emobmoongeh_;
  }

  public static final int NEIADCJNALE_FIELD_NUMBER = 3;
  private boolean neiadcjnale_;
  /**
   * <code>bool neiadcjnale = 3;</code>
   * @return The neiadcjnale.
   */
  public boolean getNeiadcjnale() {
    return neiadcjnale_;
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
    if (olmibkifgme_ != POGOProtos.Rpc.NLBGNFGGEKI.NLBGNFGGEKI_UNDEFINED_DEVICE_SERVICE.getNumber()) {
      output.writeEnum(1, olmibkifgme_);
    }
    if (emobmoongeh_ != false) {
      output.writeBool(2, emobmoongeh_);
    }
    if (neiadcjnale_ != false) {
      output.writeBool(3, neiadcjnale_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (olmibkifgme_ != POGOProtos.Rpc.NLBGNFGGEKI.NLBGNFGGEKI_UNDEFINED_DEVICE_SERVICE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, olmibkifgme_);
    }
    if (emobmoongeh_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, emobmoongeh_);
    }
    if (neiadcjnale_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, neiadcjnale_);
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
    if (!(obj instanceof POGOProtos.Rpc.JPFHLJEEOCM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JPFHLJEEOCM other = (POGOProtos.Rpc.JPFHLJEEOCM) obj;

    if (olmibkifgme_ != other.olmibkifgme_) return false;
    if (getEmobmoongeh()
        != other.getEmobmoongeh()) return false;
    if (getNeiadcjnale()
        != other.getNeiadcjnale()) return false;
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
    hash = (37 * hash) + OLMIBKIFGME_FIELD_NUMBER;
    hash = (53 * hash) + olmibkifgme_;
    hash = (37 * hash) + EMOBMOONGEH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEmobmoongeh());
    hash = (37 * hash) + NEIADCJNALE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNeiadcjnale());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JPFHLJEEOCM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JPFHLJEEOCM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPFHLJEEOCM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JPFHLJEEOCM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPFHLJEEOCM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JPFHLJEEOCM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPFHLJEEOCM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JPFHLJEEOCM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPFHLJEEOCM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JPFHLJEEOCM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPFHLJEEOCM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JPFHLJEEOCM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JPFHLJEEOCM prototype) {
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
   * ref: JPFHLJEEOCM
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JPFHLJEEOCM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JPFHLJEEOCM)
      POGOProtos.Rpc.JPFHLJEEOCMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPFHLJEEOCM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPFHLJEEOCM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JPFHLJEEOCM.class, POGOProtos.Rpc.JPFHLJEEOCM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JPFHLJEEOCM.newBuilder()
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
      olmibkifgme_ = 0;

      emobmoongeh_ = false;

      neiadcjnale_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPFHLJEEOCM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JPFHLJEEOCM getDefaultInstanceForType() {
      return POGOProtos.Rpc.JPFHLJEEOCM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JPFHLJEEOCM build() {
      POGOProtos.Rpc.JPFHLJEEOCM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JPFHLJEEOCM buildPartial() {
      POGOProtos.Rpc.JPFHLJEEOCM result = new POGOProtos.Rpc.JPFHLJEEOCM(this);
      result.olmibkifgme_ = olmibkifgme_;
      result.emobmoongeh_ = emobmoongeh_;
      result.neiadcjnale_ = neiadcjnale_;
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
      if (other instanceof POGOProtos.Rpc.JPFHLJEEOCM) {
        return mergeFrom((POGOProtos.Rpc.JPFHLJEEOCM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JPFHLJEEOCM other) {
      if (other == POGOProtos.Rpc.JPFHLJEEOCM.getDefaultInstance()) return this;
      if (other.olmibkifgme_ != 0) {
        setOlmibkifgmeValue(other.getOlmibkifgmeValue());
      }
      if (other.getEmobmoongeh() != false) {
        setEmobmoongeh(other.getEmobmoongeh());
      }
      if (other.getNeiadcjnale() != false) {
        setNeiadcjnale(other.getNeiadcjnale());
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
      POGOProtos.Rpc.JPFHLJEEOCM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JPFHLJEEOCM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int olmibkifgme_ = 0;
    /**
     * <code>.POGOProtos.Rpc.NLBGNFGGEKI olmibkifgme = 1;</code>
     * @return The enum numeric value on the wire for olmibkifgme.
     */
    public int getOlmibkifgmeValue() {
      return olmibkifgme_;
    }
    /**
     * <code>.POGOProtos.Rpc.NLBGNFGGEKI olmibkifgme = 1;</code>
     * @param value The enum numeric value on the wire for olmibkifgme to set.
     * @return This builder for chaining.
     */
    public Builder setOlmibkifgmeValue(int value) {
      olmibkifgme_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NLBGNFGGEKI olmibkifgme = 1;</code>
     * @return The olmibkifgme.
     */
    public POGOProtos.Rpc.NLBGNFGGEKI getOlmibkifgme() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NLBGNFGGEKI result = POGOProtos.Rpc.NLBGNFGGEKI.valueOf(olmibkifgme_);
      return result == null ? POGOProtos.Rpc.NLBGNFGGEKI.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NLBGNFGGEKI olmibkifgme = 1;</code>
     * @param value The olmibkifgme to set.
     * @return This builder for chaining.
     */
    public Builder setOlmibkifgme(POGOProtos.Rpc.NLBGNFGGEKI value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      olmibkifgme_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NLBGNFGGEKI olmibkifgme = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOlmibkifgme() {
      
      olmibkifgme_ = 0;
      onChanged();
      return this;
    }

    private boolean emobmoongeh_ ;
    /**
     * <code>bool emobmoongeh = 2;</code>
     * @return The emobmoongeh.
     */
    public boolean getEmobmoongeh() {
      return emobmoongeh_;
    }
    /**
     * <code>bool emobmoongeh = 2;</code>
     * @param value The emobmoongeh to set.
     * @return This builder for chaining.
     */
    public Builder setEmobmoongeh(boolean value) {
      
      emobmoongeh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool emobmoongeh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmobmoongeh() {
      
      emobmoongeh_ = false;
      onChanged();
      return this;
    }

    private boolean neiadcjnale_ ;
    /**
     * <code>bool neiadcjnale = 3;</code>
     * @return The neiadcjnale.
     */
    public boolean getNeiadcjnale() {
      return neiadcjnale_;
    }
    /**
     * <code>bool neiadcjnale = 3;</code>
     * @param value The neiadcjnale to set.
     * @return This builder for chaining.
     */
    public Builder setNeiadcjnale(boolean value) {
      
      neiadcjnale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool neiadcjnale = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNeiadcjnale() {
      
      neiadcjnale_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JPFHLJEEOCM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JPFHLJEEOCM)
  private static final POGOProtos.Rpc.JPFHLJEEOCM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JPFHLJEEOCM();
  }

  public static POGOProtos.Rpc.JPFHLJEEOCM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JPFHLJEEOCM>
      PARSER = new com.google.protobuf.AbstractParser<JPFHLJEEOCM>() {
    @java.lang.Override
    public JPFHLJEEOCM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JPFHLJEEOCM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JPFHLJEEOCM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JPFHLJEEOCM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JPFHLJEEOCM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

