// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LNAKGOAOGNA}
 */
public  final class LNAKGOAOGNA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LNAKGOAOGNA)
    LNAKGOAOGNAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LNAKGOAOGNA.newBuilder() to construct.
  private LNAKGOAOGNA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LNAKGOAOGNA() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LNAKGOAOGNA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LNAKGOAOGNA(
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

            lcdfpljnjjh_ = input.readBool();
            break;
          }
          case 16: {

            epcfpkomknh_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LNAKGOAOGNA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LNAKGOAOGNA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LNAKGOAOGNA.class, POGOProtos.Rpc.LNAKGOAOGNA.Builder.class);
  }

  public static final int LCDFPLJNJJH_FIELD_NUMBER = 1;
  private boolean lcdfpljnjjh_;
  /**
   * <code>bool lcdfpljnjjh = 1;</code>
   * @return The lcdfpljnjjh.
   */
  public boolean getLcdfpljnjjh() {
    return lcdfpljnjjh_;
  }

  public static final int EPCFPKOMKNH_FIELD_NUMBER = 2;
  private boolean epcfpkomknh_;
  /**
   * <code>bool epcfpkomknh = 2;</code>
   * @return The epcfpkomknh.
   */
  public boolean getEpcfpkomknh() {
    return epcfpkomknh_;
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
    if (lcdfpljnjjh_ != false) {
      output.writeBool(1, lcdfpljnjjh_);
    }
    if (epcfpkomknh_ != false) {
      output.writeBool(2, epcfpkomknh_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lcdfpljnjjh_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, lcdfpljnjjh_);
    }
    if (epcfpkomknh_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, epcfpkomknh_);
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
    if (!(obj instanceof POGOProtos.Rpc.LNAKGOAOGNA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LNAKGOAOGNA other = (POGOProtos.Rpc.LNAKGOAOGNA) obj;

    if (getLcdfpljnjjh()
        != other.getLcdfpljnjjh()) return false;
    if (getEpcfpkomknh()
        != other.getEpcfpkomknh()) return false;
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
    hash = (37 * hash) + LCDFPLJNJJH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLcdfpljnjjh());
    hash = (37 * hash) + EPCFPKOMKNH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEpcfpkomknh());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LNAKGOAOGNA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LNAKGOAOGNA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LNAKGOAOGNA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LNAKGOAOGNA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LNAKGOAOGNA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LNAKGOAOGNA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LNAKGOAOGNA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LNAKGOAOGNA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LNAKGOAOGNA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LNAKGOAOGNA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LNAKGOAOGNA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LNAKGOAOGNA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LNAKGOAOGNA prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LNAKGOAOGNA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LNAKGOAOGNA)
      POGOProtos.Rpc.LNAKGOAOGNAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LNAKGOAOGNA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LNAKGOAOGNA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LNAKGOAOGNA.class, POGOProtos.Rpc.LNAKGOAOGNA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LNAKGOAOGNA.newBuilder()
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
      lcdfpljnjjh_ = false;

      epcfpkomknh_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LNAKGOAOGNA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LNAKGOAOGNA getDefaultInstanceForType() {
      return POGOProtos.Rpc.LNAKGOAOGNA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LNAKGOAOGNA build() {
      POGOProtos.Rpc.LNAKGOAOGNA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LNAKGOAOGNA buildPartial() {
      POGOProtos.Rpc.LNAKGOAOGNA result = new POGOProtos.Rpc.LNAKGOAOGNA(this);
      result.lcdfpljnjjh_ = lcdfpljnjjh_;
      result.epcfpkomknh_ = epcfpkomknh_;
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
      if (other instanceof POGOProtos.Rpc.LNAKGOAOGNA) {
        return mergeFrom((POGOProtos.Rpc.LNAKGOAOGNA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LNAKGOAOGNA other) {
      if (other == POGOProtos.Rpc.LNAKGOAOGNA.getDefaultInstance()) return this;
      if (other.getLcdfpljnjjh() != false) {
        setLcdfpljnjjh(other.getLcdfpljnjjh());
      }
      if (other.getEpcfpkomknh() != false) {
        setEpcfpkomknh(other.getEpcfpkomknh());
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
      POGOProtos.Rpc.LNAKGOAOGNA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LNAKGOAOGNA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean lcdfpljnjjh_ ;
    /**
     * <code>bool lcdfpljnjjh = 1;</code>
     * @return The lcdfpljnjjh.
     */
    public boolean getLcdfpljnjjh() {
      return lcdfpljnjjh_;
    }
    /**
     * <code>bool lcdfpljnjjh = 1;</code>
     * @param value The lcdfpljnjjh to set.
     * @return This builder for chaining.
     */
    public Builder setLcdfpljnjjh(boolean value) {
      
      lcdfpljnjjh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool lcdfpljnjjh = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcdfpljnjjh() {
      
      lcdfpljnjjh_ = false;
      onChanged();
      return this;
    }

    private boolean epcfpkomknh_ ;
    /**
     * <code>bool epcfpkomknh = 2;</code>
     * @return The epcfpkomknh.
     */
    public boolean getEpcfpkomknh() {
      return epcfpkomknh_;
    }
    /**
     * <code>bool epcfpkomknh = 2;</code>
     * @param value The epcfpkomknh to set.
     * @return This builder for chaining.
     */
    public Builder setEpcfpkomknh(boolean value) {
      
      epcfpkomknh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool epcfpkomknh = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEpcfpkomknh() {
      
      epcfpkomknh_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LNAKGOAOGNA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LNAKGOAOGNA)
  private static final POGOProtos.Rpc.LNAKGOAOGNA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LNAKGOAOGNA();
  }

  public static POGOProtos.Rpc.LNAKGOAOGNA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LNAKGOAOGNA>
      PARSER = new com.google.protobuf.AbstractParser<LNAKGOAOGNA>() {
    @java.lang.Override
    public LNAKGOAOGNA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LNAKGOAOGNA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LNAKGOAOGNA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LNAKGOAOGNA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LNAKGOAOGNA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

