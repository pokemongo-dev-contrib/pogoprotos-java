// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HDENIFJCELJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HDENIFJCELJ}
 */
public  final class HDENIFJCELJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HDENIFJCELJ)
    HDENIFJCELJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HDENIFJCELJ.newBuilder() to construct.
  private HDENIFJCELJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HDENIFJCELJ() {
    hjoiiddgbfd_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HDENIFJCELJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HDENIFJCELJ(
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

            hjoiiddgbfd_ = rawValue;
            break;
          }
          case 16: {

            ffmamkgngcj_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDENIFJCELJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDENIFJCELJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HDENIFJCELJ.class, POGOProtos.Rpc.HDENIFJCELJ.Builder.class);
  }

  /**
   * <pre>
   * ref: HDENIFJCELJ/GHFOJDPOLPF
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.HDENIFJCELJ.GHFOJDPOLPF}
   */
  public enum GHFOJDPOLPF
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GHFOJDPOLPF_none = 0;</code>
     */
    GHFOJDPOLPF_none(0),
    /**
     * <code>GHFOJDPOLPF_throw_type = 1;</code>
     */
    GHFOJDPOLPF_throw_type(1),
    /**
     * <code>GHFOJDPOLPF_hit = 2;</code>
     */
    GHFOJDPOLPF_hit(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GHFOJDPOLPF_none = 0;</code>
     */
    public static final int GHFOJDPOLPF_none_VALUE = 0;
    /**
     * <code>GHFOJDPOLPF_throw_type = 1;</code>
     */
    public static final int GHFOJDPOLPF_throw_type_VALUE = 1;
    /**
     * <code>GHFOJDPOLPF_hit = 2;</code>
     */
    public static final int GHFOJDPOLPF_hit_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GHFOJDPOLPF valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GHFOJDPOLPF forNumber(int value) {
      switch (value) {
        case 0: return GHFOJDPOLPF_none;
        case 1: return GHFOJDPOLPF_throw_type;
        case 2: return GHFOJDPOLPF_hit;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GHFOJDPOLPF>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GHFOJDPOLPF> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GHFOJDPOLPF>() {
            public GHFOJDPOLPF findValueByNumber(int number) {
              return GHFOJDPOLPF.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.HDENIFJCELJ.getDescriptor().getEnumTypes().get(0);
    }

    private static final GHFOJDPOLPF[] VALUES = values();

    public static GHFOJDPOLPF valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GHFOJDPOLPF(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.HDENIFJCELJ.GHFOJDPOLPF)
  }

  public static final int HJOIIDDGBFD_FIELD_NUMBER = 1;
  private int hjoiiddgbfd_;
  /**
   * <code>.POGOProtos.Rpc.FENILLCEMDH hjoiiddgbfd = 1;</code>
   * @return The enum numeric value on the wire for hjoiiddgbfd.
   */
  public int getHjoiiddgbfdValue() {
    return hjoiiddgbfd_;
  }
  /**
   * <code>.POGOProtos.Rpc.FENILLCEMDH hjoiiddgbfd = 1;</code>
   * @return The hjoiiddgbfd.
   */
  public POGOProtos.Rpc.FENILLCEMDH getHjoiiddgbfd() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FENILLCEMDH result = POGOProtos.Rpc.FENILLCEMDH.valueOf(hjoiiddgbfd_);
    return result == null ? POGOProtos.Rpc.FENILLCEMDH.UNRECOGNIZED : result;
  }

  public static final int FFMAMKGNGCJ_FIELD_NUMBER = 2;
  private boolean ffmamkgngcj_;
  /**
   * <code>bool ffmamkgngcj = 2;</code>
   * @return The ffmamkgngcj.
   */
  public boolean getFfmamkgngcj() {
    return ffmamkgngcj_;
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
    if (hjoiiddgbfd_ != POGOProtos.Rpc.FENILLCEMDH.FENILLCEMDH_ACTIVITY_UNKNOWN.getNumber()) {
      output.writeEnum(1, hjoiiddgbfd_);
    }
    if (ffmamkgngcj_ != false) {
      output.writeBool(2, ffmamkgngcj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hjoiiddgbfd_ != POGOProtos.Rpc.FENILLCEMDH.FENILLCEMDH_ACTIVITY_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, hjoiiddgbfd_);
    }
    if (ffmamkgngcj_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, ffmamkgngcj_);
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
    if (!(obj instanceof POGOProtos.Rpc.HDENIFJCELJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HDENIFJCELJ other = (POGOProtos.Rpc.HDENIFJCELJ) obj;

    if (hjoiiddgbfd_ != other.hjoiiddgbfd_) return false;
    if (getFfmamkgngcj()
        != other.getFfmamkgngcj()) return false;
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
    hash = (37 * hash) + HJOIIDDGBFD_FIELD_NUMBER;
    hash = (53 * hash) + hjoiiddgbfd_;
    hash = (37 * hash) + FFMAMKGNGCJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFfmamkgngcj());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HDENIFJCELJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HDENIFJCELJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDENIFJCELJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HDENIFJCELJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDENIFJCELJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HDENIFJCELJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDENIFJCELJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HDENIFJCELJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDENIFJCELJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HDENIFJCELJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HDENIFJCELJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HDENIFJCELJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HDENIFJCELJ prototype) {
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
   * ref: HDENIFJCELJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HDENIFJCELJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HDENIFJCELJ)
      POGOProtos.Rpc.HDENIFJCELJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDENIFJCELJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDENIFJCELJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HDENIFJCELJ.class, POGOProtos.Rpc.HDENIFJCELJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HDENIFJCELJ.newBuilder()
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
      hjoiiddgbfd_ = 0;

      ffmamkgngcj_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HDENIFJCELJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HDENIFJCELJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.HDENIFJCELJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HDENIFJCELJ build() {
      POGOProtos.Rpc.HDENIFJCELJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HDENIFJCELJ buildPartial() {
      POGOProtos.Rpc.HDENIFJCELJ result = new POGOProtos.Rpc.HDENIFJCELJ(this);
      result.hjoiiddgbfd_ = hjoiiddgbfd_;
      result.ffmamkgngcj_ = ffmamkgngcj_;
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
      if (other instanceof POGOProtos.Rpc.HDENIFJCELJ) {
        return mergeFrom((POGOProtos.Rpc.HDENIFJCELJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HDENIFJCELJ other) {
      if (other == POGOProtos.Rpc.HDENIFJCELJ.getDefaultInstance()) return this;
      if (other.hjoiiddgbfd_ != 0) {
        setHjoiiddgbfdValue(other.getHjoiiddgbfdValue());
      }
      if (other.getFfmamkgngcj() != false) {
        setFfmamkgngcj(other.getFfmamkgngcj());
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
      POGOProtos.Rpc.HDENIFJCELJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HDENIFJCELJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int hjoiiddgbfd_ = 0;
    /**
     * <code>.POGOProtos.Rpc.FENILLCEMDH hjoiiddgbfd = 1;</code>
     * @return The enum numeric value on the wire for hjoiiddgbfd.
     */
    public int getHjoiiddgbfdValue() {
      return hjoiiddgbfd_;
    }
    /**
     * <code>.POGOProtos.Rpc.FENILLCEMDH hjoiiddgbfd = 1;</code>
     * @param value The enum numeric value on the wire for hjoiiddgbfd to set.
     * @return This builder for chaining.
     */
    public Builder setHjoiiddgbfdValue(int value) {
      hjoiiddgbfd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FENILLCEMDH hjoiiddgbfd = 1;</code>
     * @return The hjoiiddgbfd.
     */
    public POGOProtos.Rpc.FENILLCEMDH getHjoiiddgbfd() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FENILLCEMDH result = POGOProtos.Rpc.FENILLCEMDH.valueOf(hjoiiddgbfd_);
      return result == null ? POGOProtos.Rpc.FENILLCEMDH.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FENILLCEMDH hjoiiddgbfd = 1;</code>
     * @param value The hjoiiddgbfd to set.
     * @return This builder for chaining.
     */
    public Builder setHjoiiddgbfd(POGOProtos.Rpc.FENILLCEMDH value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      hjoiiddgbfd_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FENILLCEMDH hjoiiddgbfd = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHjoiiddgbfd() {
      
      hjoiiddgbfd_ = 0;
      onChanged();
      return this;
    }

    private boolean ffmamkgngcj_ ;
    /**
     * <code>bool ffmamkgngcj = 2;</code>
     * @return The ffmamkgngcj.
     */
    public boolean getFfmamkgngcj() {
      return ffmamkgngcj_;
    }
    /**
     * <code>bool ffmamkgngcj = 2;</code>
     * @param value The ffmamkgngcj to set.
     * @return This builder for chaining.
     */
    public Builder setFfmamkgngcj(boolean value) {
      
      ffmamkgngcj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ffmamkgngcj = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFfmamkgngcj() {
      
      ffmamkgngcj_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HDENIFJCELJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HDENIFJCELJ)
  private static final POGOProtos.Rpc.HDENIFJCELJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HDENIFJCELJ();
  }

  public static POGOProtos.Rpc.HDENIFJCELJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HDENIFJCELJ>
      PARSER = new com.google.protobuf.AbstractParser<HDENIFJCELJ>() {
    @java.lang.Override
    public HDENIFJCELJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HDENIFJCELJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HDENIFJCELJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HDENIFJCELJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HDENIFJCELJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

