// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CNECNNOFMKG}
 */
public  final class CNECNNOFMKG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CNECNNOFMKG)
    CNECNNOFMKGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CNECNNOFMKG.newBuilder() to construct.
  private CNECNNOFMKG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CNECNNOFMKG() {
    oemhknkemca_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CNECNNOFMKG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CNECNNOFMKG(
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

            oemhknkemca_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CNECNNOFMKG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CNECNNOFMKG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CNECNNOFMKG.class, POGOProtos.Rpc.CNECNNOFMKG.Builder.class);
  }

  /**
   * <pre>
   * ref: CNECNNOFMKG/IJGFBMGFFGP/KAPDIBKPCKC
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC}
   */
  public enum KAPDIBKPCKC
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    ERROR_UNKNOWN(2),
    /**
     * <code>ERROR_PLAYER_NOT_FOUND = 3;</code>
     */
    ERROR_PLAYER_NOT_FOUND(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    public static final int ERROR_UNKNOWN_VALUE = 2;
    /**
     * <code>ERROR_PLAYER_NOT_FOUND = 3;</code>
     */
    public static final int ERROR_PLAYER_NOT_FOUND_VALUE = 3;


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
    public static KAPDIBKPCKC valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static KAPDIBKPCKC forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_UNKNOWN;
        case 3: return ERROR_PLAYER_NOT_FOUND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<KAPDIBKPCKC>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        KAPDIBKPCKC> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<KAPDIBKPCKC>() {
            public KAPDIBKPCKC findValueByNumber(int number) {
              return KAPDIBKPCKC.forNumber(number);
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
      return POGOProtos.Rpc.CNECNNOFMKG.getDescriptor().getEnumTypes().get(0);
    }

    private static final KAPDIBKPCKC[] VALUES = values();

    public static KAPDIBKPCKC valueOf(
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

    private KAPDIBKPCKC(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC)
  }

  public static final int OEMHKNKEMCA_FIELD_NUMBER = 1;
  private int oemhknkemca_;
  /**
   * <code>.POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC oemhknkemca = 1;</code>
   * @return The enum numeric value on the wire for oemhknkemca.
   */
  public int getOemhknkemcaValue() {
    return oemhknkemca_;
  }
  /**
   * <code>.POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC oemhknkemca = 1;</code>
   * @return The oemhknkemca.
   */
  public POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC getOemhknkemca() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC result = POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC.valueOf(oemhknkemca_);
    return result == null ? POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC.UNRECOGNIZED : result;
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
    if (oemhknkemca_ != POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC.UNSET.getNumber()) {
      output.writeEnum(1, oemhknkemca_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oemhknkemca_ != POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, oemhknkemca_);
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
    if (!(obj instanceof POGOProtos.Rpc.CNECNNOFMKG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CNECNNOFMKG other = (POGOProtos.Rpc.CNECNNOFMKG) obj;

    if (oemhknkemca_ != other.oemhknkemca_) return false;
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
    hash = (37 * hash) + OEMHKNKEMCA_FIELD_NUMBER;
    hash = (53 * hash) + oemhknkemca_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CNECNNOFMKG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CNECNNOFMKG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CNECNNOFMKG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CNECNNOFMKG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CNECNNOFMKG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CNECNNOFMKG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CNECNNOFMKG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CNECNNOFMKG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CNECNNOFMKG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CNECNNOFMKG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CNECNNOFMKG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CNECNNOFMKG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CNECNNOFMKG prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CNECNNOFMKG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CNECNNOFMKG)
      POGOProtos.Rpc.CNECNNOFMKGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CNECNNOFMKG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CNECNNOFMKG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CNECNNOFMKG.class, POGOProtos.Rpc.CNECNNOFMKG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CNECNNOFMKG.newBuilder()
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
      oemhknkemca_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CNECNNOFMKG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CNECNNOFMKG getDefaultInstanceForType() {
      return POGOProtos.Rpc.CNECNNOFMKG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CNECNNOFMKG build() {
      POGOProtos.Rpc.CNECNNOFMKG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CNECNNOFMKG buildPartial() {
      POGOProtos.Rpc.CNECNNOFMKG result = new POGOProtos.Rpc.CNECNNOFMKG(this);
      result.oemhknkemca_ = oemhknkemca_;
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
      if (other instanceof POGOProtos.Rpc.CNECNNOFMKG) {
        return mergeFrom((POGOProtos.Rpc.CNECNNOFMKG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CNECNNOFMKG other) {
      if (other == POGOProtos.Rpc.CNECNNOFMKG.getDefaultInstance()) return this;
      if (other.oemhknkemca_ != 0) {
        setOemhknkemcaValue(other.getOemhknkemcaValue());
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
      POGOProtos.Rpc.CNECNNOFMKG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CNECNNOFMKG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int oemhknkemca_ = 0;
    /**
     * <code>.POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC oemhknkemca = 1;</code>
     * @return The enum numeric value on the wire for oemhknkemca.
     */
    public int getOemhknkemcaValue() {
      return oemhknkemca_;
    }
    /**
     * <code>.POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC oemhknkemca = 1;</code>
     * @param value The enum numeric value on the wire for oemhknkemca to set.
     * @return This builder for chaining.
     */
    public Builder setOemhknkemcaValue(int value) {
      oemhknkemca_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC oemhknkemca = 1;</code>
     * @return The oemhknkemca.
     */
    public POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC getOemhknkemca() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC result = POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC.valueOf(oemhknkemca_);
      return result == null ? POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC oemhknkemca = 1;</code>
     * @param value The oemhknkemca to set.
     * @return This builder for chaining.
     */
    public Builder setOemhknkemca(POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      oemhknkemca_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CNECNNOFMKG.KAPDIBKPCKC oemhknkemca = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOemhknkemca() {
      
      oemhknkemca_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CNECNNOFMKG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CNECNNOFMKG)
  private static final POGOProtos.Rpc.CNECNNOFMKG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CNECNNOFMKG();
  }

  public static POGOProtos.Rpc.CNECNNOFMKG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CNECNNOFMKG>
      PARSER = new com.google.protobuf.AbstractParser<CNECNNOFMKG>() {
    @java.lang.Override
    public CNECNNOFMKG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CNECNNOFMKG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CNECNNOFMKG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CNECNNOFMKG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CNECNNOFMKG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

