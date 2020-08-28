// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: COKEJFCBCFG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.COKEJFCBCFG}
 */
public final class COKEJFCBCFG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.COKEJFCBCFG)
    COKEJFCBCFGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use COKEJFCBCFG.newBuilder() to construct.
  private COKEJFCBCFG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private COKEJFCBCFG() {
    magjbjmclno_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new COKEJFCBCFG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private COKEJFCBCFG(
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

            magjbjmclno_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_COKEJFCBCFG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_COKEJFCBCFG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.COKEJFCBCFG.class, POGOProtos.Rpc.COKEJFCBCFG.Builder.class);
  }

  /**
   * <pre>
   * ref: COKEJFCBCFG/JNPEPJBGICJ/NPAIIHOJADC
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC}
   */
  public enum NPAIIHOJADC
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
     * <code>ERROR_PLAYER_ALREADY_STARTED_TUTORIAL = 2;</code>
     */
    ERROR_PLAYER_ALREADY_STARTED_TUTORIAL(2),
    /**
     * <code>ERROR_FAILED_TO_START = 3;</code>
     */
    ERROR_FAILED_TO_START(3),
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
     * <code>ERROR_PLAYER_ALREADY_STARTED_TUTORIAL = 2;</code>
     */
    public static final int ERROR_PLAYER_ALREADY_STARTED_TUTORIAL_VALUE = 2;
    /**
     * <code>ERROR_FAILED_TO_START = 3;</code>
     */
    public static final int ERROR_FAILED_TO_START_VALUE = 3;


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
    public static NPAIIHOJADC valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NPAIIHOJADC forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_PLAYER_ALREADY_STARTED_TUTORIAL;
        case 3: return ERROR_FAILED_TO_START;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NPAIIHOJADC>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NPAIIHOJADC> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NPAIIHOJADC>() {
            public NPAIIHOJADC findValueByNumber(int number) {
              return NPAIIHOJADC.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.COKEJFCBCFG.getDescriptor().getEnumTypes().get(0);
    }

    private static final NPAIIHOJADC[] VALUES = values();

    public static NPAIIHOJADC valueOf(
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

    private NPAIIHOJADC(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC)
  }

  public static final int MAGJBJMCLNO_FIELD_NUMBER = 1;
  private int magjbjmclno_;
  /**
   * <code>.POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC magjbjmclno = 1;</code>
   * @return The enum numeric value on the wire for magjbjmclno.
   */
  @java.lang.Override public int getMagjbjmclnoValue() {
    return magjbjmclno_;
  }
  /**
   * <code>.POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC magjbjmclno = 1;</code>
   * @return The magjbjmclno.
   */
  @java.lang.Override public POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC getMagjbjmclno() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC result = POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC.valueOf(magjbjmclno_);
    return result == null ? POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC.UNRECOGNIZED : result;
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
    if (magjbjmclno_ != POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC.UNSET.getNumber()) {
      output.writeEnum(1, magjbjmclno_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (magjbjmclno_ != POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, magjbjmclno_);
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
    if (!(obj instanceof POGOProtos.Rpc.COKEJFCBCFG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.COKEJFCBCFG other = (POGOProtos.Rpc.COKEJFCBCFG) obj;

    if (magjbjmclno_ != other.magjbjmclno_) return false;
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
    hash = (37 * hash) + MAGJBJMCLNO_FIELD_NUMBER;
    hash = (53 * hash) + magjbjmclno_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.COKEJFCBCFG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.COKEJFCBCFG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.COKEJFCBCFG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.COKEJFCBCFG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.COKEJFCBCFG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.COKEJFCBCFG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.COKEJFCBCFG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.COKEJFCBCFG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.COKEJFCBCFG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.COKEJFCBCFG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.COKEJFCBCFG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.COKEJFCBCFG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.COKEJFCBCFG prototype) {
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
   * ref: COKEJFCBCFG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.COKEJFCBCFG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.COKEJFCBCFG)
      POGOProtos.Rpc.COKEJFCBCFGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_COKEJFCBCFG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_COKEJFCBCFG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.COKEJFCBCFG.class, POGOProtos.Rpc.COKEJFCBCFG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.COKEJFCBCFG.newBuilder()
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
      magjbjmclno_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_COKEJFCBCFG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.COKEJFCBCFG getDefaultInstanceForType() {
      return POGOProtos.Rpc.COKEJFCBCFG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.COKEJFCBCFG build() {
      POGOProtos.Rpc.COKEJFCBCFG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.COKEJFCBCFG buildPartial() {
      POGOProtos.Rpc.COKEJFCBCFG result = new POGOProtos.Rpc.COKEJFCBCFG(this);
      result.magjbjmclno_ = magjbjmclno_;
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
      if (other instanceof POGOProtos.Rpc.COKEJFCBCFG) {
        return mergeFrom((POGOProtos.Rpc.COKEJFCBCFG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.COKEJFCBCFG other) {
      if (other == POGOProtos.Rpc.COKEJFCBCFG.getDefaultInstance()) return this;
      if (other.magjbjmclno_ != 0) {
        setMagjbjmclnoValue(other.getMagjbjmclnoValue());
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
      POGOProtos.Rpc.COKEJFCBCFG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.COKEJFCBCFG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int magjbjmclno_ = 0;
    /**
     * <code>.POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC magjbjmclno = 1;</code>
     * @return The enum numeric value on the wire for magjbjmclno.
     */
    @java.lang.Override public int getMagjbjmclnoValue() {
      return magjbjmclno_;
    }
    /**
     * <code>.POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC magjbjmclno = 1;</code>
     * @param value The enum numeric value on the wire for magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclnoValue(int value) {
      
      magjbjmclno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC magjbjmclno = 1;</code>
     * @return The magjbjmclno.
     */
    @java.lang.Override
    public POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC getMagjbjmclno() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC result = POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC.valueOf(magjbjmclno_);
      return result == null ? POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC magjbjmclno = 1;</code>
     * @param value The magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclno(POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      magjbjmclno_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.COKEJFCBCFG.NPAIIHOJADC magjbjmclno = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMagjbjmclno() {
      
      magjbjmclno_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.COKEJFCBCFG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.COKEJFCBCFG)
  private static final POGOProtos.Rpc.COKEJFCBCFG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.COKEJFCBCFG();
  }

  public static POGOProtos.Rpc.COKEJFCBCFG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<COKEJFCBCFG>
      PARSER = new com.google.protobuf.AbstractParser<COKEJFCBCFG>() {
    @java.lang.Override
    public COKEJFCBCFG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new COKEJFCBCFG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<COKEJFCBCFG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<COKEJFCBCFG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.COKEJFCBCFG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

