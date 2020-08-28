// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FCECNFOKOPL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FCECNFOKOPL}
 */
public final class FCECNFOKOPL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FCECNFOKOPL)
    FCECNFOKOPLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FCECNFOKOPL.newBuilder() to construct.
  private FCECNFOKOPL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FCECNFOKOPL() {
    magjbjmclno_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FCECNFOKOPL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FCECNFOKOPL(
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FCECNFOKOPL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FCECNFOKOPL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FCECNFOKOPL.class, POGOProtos.Rpc.FCECNFOKOPL.Builder.class);
  }

  /**
   * <pre>
   * ref: FCECNFOKOPL/NDNICHJOGCE/JMLINCJNCGG
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG}
   */
  public enum JMLINCJNCGG
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
     * <code>FAILURE = 2;</code>
     */
    FAILURE(2),
    /**
     * <code>TOO_SOON = 3;</code>
     */
    TOO_SOON(3),
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
     * <code>FAILURE = 2;</code>
     */
    public static final int FAILURE_VALUE = 2;
    /**
     * <code>TOO_SOON = 3;</code>
     */
    public static final int TOO_SOON_VALUE = 3;


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
    public static JMLINCJNCGG valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static JMLINCJNCGG forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return FAILURE;
        case 3: return TOO_SOON;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<JMLINCJNCGG>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        JMLINCJNCGG> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<JMLINCJNCGG>() {
            public JMLINCJNCGG findValueByNumber(int number) {
              return JMLINCJNCGG.forNumber(number);
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
      return POGOProtos.Rpc.FCECNFOKOPL.getDescriptor().getEnumTypes().get(0);
    }

    private static final JMLINCJNCGG[] VALUES = values();

    public static JMLINCJNCGG valueOf(
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

    private JMLINCJNCGG(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG)
  }

  public static final int MAGJBJMCLNO_FIELD_NUMBER = 1;
  private int magjbjmclno_;
  /**
   * <code>.POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG magjbjmclno = 1;</code>
   * @return The enum numeric value on the wire for magjbjmclno.
   */
  @java.lang.Override public int getMagjbjmclnoValue() {
    return magjbjmclno_;
  }
  /**
   * <code>.POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG magjbjmclno = 1;</code>
   * @return The magjbjmclno.
   */
  @java.lang.Override public POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG getMagjbjmclno() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG result = POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG.valueOf(magjbjmclno_);
    return result == null ? POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG.UNRECOGNIZED : result;
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
    if (magjbjmclno_ != POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG.UNSET.getNumber()) {
      output.writeEnum(1, magjbjmclno_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (magjbjmclno_ != POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG.UNSET.getNumber()) {
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
    if (!(obj instanceof POGOProtos.Rpc.FCECNFOKOPL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FCECNFOKOPL other = (POGOProtos.Rpc.FCECNFOKOPL) obj;

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

  public static POGOProtos.Rpc.FCECNFOKOPL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FCECNFOKOPL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FCECNFOKOPL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FCECNFOKOPL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FCECNFOKOPL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FCECNFOKOPL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FCECNFOKOPL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FCECNFOKOPL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FCECNFOKOPL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FCECNFOKOPL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FCECNFOKOPL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FCECNFOKOPL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FCECNFOKOPL prototype) {
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
   * ref: FCECNFOKOPL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FCECNFOKOPL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FCECNFOKOPL)
      POGOProtos.Rpc.FCECNFOKOPLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FCECNFOKOPL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FCECNFOKOPL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FCECNFOKOPL.class, POGOProtos.Rpc.FCECNFOKOPL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FCECNFOKOPL.newBuilder()
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
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FCECNFOKOPL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FCECNFOKOPL getDefaultInstanceForType() {
      return POGOProtos.Rpc.FCECNFOKOPL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FCECNFOKOPL build() {
      POGOProtos.Rpc.FCECNFOKOPL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FCECNFOKOPL buildPartial() {
      POGOProtos.Rpc.FCECNFOKOPL result = new POGOProtos.Rpc.FCECNFOKOPL(this);
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
      if (other instanceof POGOProtos.Rpc.FCECNFOKOPL) {
        return mergeFrom((POGOProtos.Rpc.FCECNFOKOPL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FCECNFOKOPL other) {
      if (other == POGOProtos.Rpc.FCECNFOKOPL.getDefaultInstance()) return this;
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
      POGOProtos.Rpc.FCECNFOKOPL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FCECNFOKOPL) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG magjbjmclno = 1;</code>
     * @return The enum numeric value on the wire for magjbjmclno.
     */
    @java.lang.Override public int getMagjbjmclnoValue() {
      return magjbjmclno_;
    }
    /**
     * <code>.POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG magjbjmclno = 1;</code>
     * @param value The enum numeric value on the wire for magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclnoValue(int value) {
      
      magjbjmclno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG magjbjmclno = 1;</code>
     * @return The magjbjmclno.
     */
    @java.lang.Override
    public POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG getMagjbjmclno() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG result = POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG.valueOf(magjbjmclno_);
      return result == null ? POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG magjbjmclno = 1;</code>
     * @param value The magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclno(POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      magjbjmclno_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FCECNFOKOPL.JMLINCJNCGG magjbjmclno = 1;</code>
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FCECNFOKOPL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FCECNFOKOPL)
  private static final POGOProtos.Rpc.FCECNFOKOPL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FCECNFOKOPL();
  }

  public static POGOProtos.Rpc.FCECNFOKOPL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FCECNFOKOPL>
      PARSER = new com.google.protobuf.AbstractParser<FCECNFOKOPL>() {
    @java.lang.Override
    public FCECNFOKOPL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FCECNFOKOPL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FCECNFOKOPL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FCECNFOKOPL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FCECNFOKOPL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

