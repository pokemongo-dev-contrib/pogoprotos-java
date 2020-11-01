// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LCBJKHPDFBI}
 */
public  final class LCBJKHPDFBI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LCBJKHPDFBI)
    LCBJKHPDFBIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LCBJKHPDFBI.newBuilder() to construct.
  private LCBJKHPDFBI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LCBJKHPDFBI() {
    jbflkcdndlp_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LCBJKHPDFBI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LCBJKHPDFBI(
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

            jbflkcdndlp_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.GPBHLAEPMMJ.Builder subBuilder = null;
            if (bcoigpfakla_ != null) {
              subBuilder = bcoigpfakla_.toBuilder();
            }
            bcoigpfakla_ = input.readMessage(POGOProtos.Rpc.GPBHLAEPMMJ.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bcoigpfakla_);
              bcoigpfakla_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LCBJKHPDFBI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LCBJKHPDFBI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LCBJKHPDFBI.class, POGOProtos.Rpc.LCBJKHPDFBI.Builder.class);
  }

  /**
   * <pre>
   * ref: LCBJKHPDFBI/CPKOMADNHBN/ABPPLBOHEDF
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF}
   */
  public enum ABPPLBOHEDF
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
     * <code>COOLDOWN_ACTIVE = 2;</code>
     */
    COOLDOWN_ACTIVE(2),
    /**
     * <code>NOT_QUALIFIED = 3;</code>
     */
    NOT_QUALIFIED(3),
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
     * <code>COOLDOWN_ACTIVE = 2;</code>
     */
    public static final int COOLDOWN_ACTIVE_VALUE = 2;
    /**
     * <code>NOT_QUALIFIED = 3;</code>
     */
    public static final int NOT_QUALIFIED_VALUE = 3;


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
    public static ABPPLBOHEDF valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ABPPLBOHEDF forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return COOLDOWN_ACTIVE;
        case 3: return NOT_QUALIFIED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ABPPLBOHEDF>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ABPPLBOHEDF> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ABPPLBOHEDF>() {
            public ABPPLBOHEDF findValueByNumber(int number) {
              return ABPPLBOHEDF.forNumber(number);
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
      return POGOProtos.Rpc.LCBJKHPDFBI.getDescriptor().getEnumTypes().get(0);
    }

    private static final ABPPLBOHEDF[] VALUES = values();

    public static ABPPLBOHEDF valueOf(
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

    private ABPPLBOHEDF(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF)
  }

  public static final int JBFLKCDNDLP_FIELD_NUMBER = 1;
  private int jbflkcdndlp_;
  /**
   * <code>.POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF jbflkcdndlp = 1;</code>
   * @return The enum numeric value on the wire for jbflkcdndlp.
   */
  public int getJbflkcdndlpValue() {
    return jbflkcdndlp_;
  }
  /**
   * <code>.POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF jbflkcdndlp = 1;</code>
   * @return The jbflkcdndlp.
   */
  public POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF getJbflkcdndlp() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF result = POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF.valueOf(jbflkcdndlp_);
    return result == null ? POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF.UNRECOGNIZED : result;
  }

  public static final int BCOIGPFAKLA_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla_;
  /**
   * <code>.POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla = 2;</code>
   * @return Whether the bcoigpfakla field is set.
   */
  public boolean hasBcoigpfakla() {
    return bcoigpfakla_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla = 2;</code>
   * @return The bcoigpfakla.
   */
  public POGOProtos.Rpc.GPBHLAEPMMJ getBcoigpfakla() {
    return bcoigpfakla_ == null ? POGOProtos.Rpc.GPBHLAEPMMJ.getDefaultInstance() : bcoigpfakla_;
  }
  /**
   * <code>.POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla = 2;</code>
   */
  public POGOProtos.Rpc.GPBHLAEPMMJOrBuilder getBcoigpfaklaOrBuilder() {
    return getBcoigpfakla();
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
    if (jbflkcdndlp_ != POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF.UNSET.getNumber()) {
      output.writeEnum(1, jbflkcdndlp_);
    }
    if (bcoigpfakla_ != null) {
      output.writeMessage(2, getBcoigpfakla());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jbflkcdndlp_ != POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, jbflkcdndlp_);
    }
    if (bcoigpfakla_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBcoigpfakla());
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
    if (!(obj instanceof POGOProtos.Rpc.LCBJKHPDFBI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LCBJKHPDFBI other = (POGOProtos.Rpc.LCBJKHPDFBI) obj;

    if (jbflkcdndlp_ != other.jbflkcdndlp_) return false;
    if (hasBcoigpfakla() != other.hasBcoigpfakla()) return false;
    if (hasBcoigpfakla()) {
      if (!getBcoigpfakla()
          .equals(other.getBcoigpfakla())) return false;
    }
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
    hash = (37 * hash) + JBFLKCDNDLP_FIELD_NUMBER;
    hash = (53 * hash) + jbflkcdndlp_;
    if (hasBcoigpfakla()) {
      hash = (37 * hash) + BCOIGPFAKLA_FIELD_NUMBER;
      hash = (53 * hash) + getBcoigpfakla().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LCBJKHPDFBI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LCBJKHPDFBI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LCBJKHPDFBI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LCBJKHPDFBI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LCBJKHPDFBI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LCBJKHPDFBI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LCBJKHPDFBI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LCBJKHPDFBI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LCBJKHPDFBI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LCBJKHPDFBI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LCBJKHPDFBI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LCBJKHPDFBI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LCBJKHPDFBI prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LCBJKHPDFBI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LCBJKHPDFBI)
      POGOProtos.Rpc.LCBJKHPDFBIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LCBJKHPDFBI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LCBJKHPDFBI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LCBJKHPDFBI.class, POGOProtos.Rpc.LCBJKHPDFBI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LCBJKHPDFBI.newBuilder()
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
      jbflkcdndlp_ = 0;

      if (bcoigpfaklaBuilder_ == null) {
        bcoigpfakla_ = null;
      } else {
        bcoigpfakla_ = null;
        bcoigpfaklaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LCBJKHPDFBI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LCBJKHPDFBI getDefaultInstanceForType() {
      return POGOProtos.Rpc.LCBJKHPDFBI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LCBJKHPDFBI build() {
      POGOProtos.Rpc.LCBJKHPDFBI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LCBJKHPDFBI buildPartial() {
      POGOProtos.Rpc.LCBJKHPDFBI result = new POGOProtos.Rpc.LCBJKHPDFBI(this);
      result.jbflkcdndlp_ = jbflkcdndlp_;
      if (bcoigpfaklaBuilder_ == null) {
        result.bcoigpfakla_ = bcoigpfakla_;
      } else {
        result.bcoigpfakla_ = bcoigpfaklaBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.LCBJKHPDFBI) {
        return mergeFrom((POGOProtos.Rpc.LCBJKHPDFBI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LCBJKHPDFBI other) {
      if (other == POGOProtos.Rpc.LCBJKHPDFBI.getDefaultInstance()) return this;
      if (other.jbflkcdndlp_ != 0) {
        setJbflkcdndlpValue(other.getJbflkcdndlpValue());
      }
      if (other.hasBcoigpfakla()) {
        mergeBcoigpfakla(other.getBcoigpfakla());
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
      POGOProtos.Rpc.LCBJKHPDFBI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LCBJKHPDFBI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int jbflkcdndlp_ = 0;
    /**
     * <code>.POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF jbflkcdndlp = 1;</code>
     * @return The enum numeric value on the wire for jbflkcdndlp.
     */
    public int getJbflkcdndlpValue() {
      return jbflkcdndlp_;
    }
    /**
     * <code>.POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF jbflkcdndlp = 1;</code>
     * @param value The enum numeric value on the wire for jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlpValue(int value) {
      jbflkcdndlp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF jbflkcdndlp = 1;</code>
     * @return The jbflkcdndlp.
     */
    public POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF getJbflkcdndlp() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF result = POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF.valueOf(jbflkcdndlp_);
      return result == null ? POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF jbflkcdndlp = 1;</code>
     * @param value The jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlp(POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jbflkcdndlp_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LCBJKHPDFBI.ABPPLBOHEDF jbflkcdndlp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJbflkcdndlp() {
      
      jbflkcdndlp_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GPBHLAEPMMJ, POGOProtos.Rpc.GPBHLAEPMMJ.Builder, POGOProtos.Rpc.GPBHLAEPMMJOrBuilder> bcoigpfaklaBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla = 2;</code>
     * @return Whether the bcoigpfakla field is set.
     */
    public boolean hasBcoigpfakla() {
      return bcoigpfaklaBuilder_ != null || bcoigpfakla_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla = 2;</code>
     * @return The bcoigpfakla.
     */
    public POGOProtos.Rpc.GPBHLAEPMMJ getBcoigpfakla() {
      if (bcoigpfaklaBuilder_ == null) {
        return bcoigpfakla_ == null ? POGOProtos.Rpc.GPBHLAEPMMJ.getDefaultInstance() : bcoigpfakla_;
      } else {
        return bcoigpfaklaBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla = 2;</code>
     */
    public Builder setBcoigpfakla(POGOProtos.Rpc.GPBHLAEPMMJ value) {
      if (bcoigpfaklaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bcoigpfakla_ = value;
        onChanged();
      } else {
        bcoigpfaklaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla = 2;</code>
     */
    public Builder setBcoigpfakla(
        POGOProtos.Rpc.GPBHLAEPMMJ.Builder builderForValue) {
      if (bcoigpfaklaBuilder_ == null) {
        bcoigpfakla_ = builderForValue.build();
        onChanged();
      } else {
        bcoigpfaklaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla = 2;</code>
     */
    public Builder mergeBcoigpfakla(POGOProtos.Rpc.GPBHLAEPMMJ value) {
      if (bcoigpfaklaBuilder_ == null) {
        if (bcoigpfakla_ != null) {
          bcoigpfakla_ =
            POGOProtos.Rpc.GPBHLAEPMMJ.newBuilder(bcoigpfakla_).mergeFrom(value).buildPartial();
        } else {
          bcoigpfakla_ = value;
        }
        onChanged();
      } else {
        bcoigpfaklaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla = 2;</code>
     */
    public Builder clearBcoigpfakla() {
      if (bcoigpfaklaBuilder_ == null) {
        bcoigpfakla_ = null;
        onChanged();
      } else {
        bcoigpfakla_ = null;
        bcoigpfaklaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla = 2;</code>
     */
    public POGOProtos.Rpc.GPBHLAEPMMJ.Builder getBcoigpfaklaBuilder() {
      
      onChanged();
      return getBcoigpfaklaFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla = 2;</code>
     */
    public POGOProtos.Rpc.GPBHLAEPMMJOrBuilder getBcoigpfaklaOrBuilder() {
      if (bcoigpfaklaBuilder_ != null) {
        return bcoigpfaklaBuilder_.getMessageOrBuilder();
      } else {
        return bcoigpfakla_ == null ?
            POGOProtos.Rpc.GPBHLAEPMMJ.getDefaultInstance() : bcoigpfakla_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GPBHLAEPMMJ bcoigpfakla = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GPBHLAEPMMJ, POGOProtos.Rpc.GPBHLAEPMMJ.Builder, POGOProtos.Rpc.GPBHLAEPMMJOrBuilder> 
        getBcoigpfaklaFieldBuilder() {
      if (bcoigpfaklaBuilder_ == null) {
        bcoigpfaklaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.GPBHLAEPMMJ, POGOProtos.Rpc.GPBHLAEPMMJ.Builder, POGOProtos.Rpc.GPBHLAEPMMJOrBuilder>(
                getBcoigpfakla(),
                getParentForChildren(),
                isClean());
        bcoigpfakla_ = null;
      }
      return bcoigpfaklaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LCBJKHPDFBI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LCBJKHPDFBI)
  private static final POGOProtos.Rpc.LCBJKHPDFBI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LCBJKHPDFBI();
  }

  public static POGOProtos.Rpc.LCBJKHPDFBI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LCBJKHPDFBI>
      PARSER = new com.google.protobuf.AbstractParser<LCBJKHPDFBI>() {
    @java.lang.Override
    public LCBJKHPDFBI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LCBJKHPDFBI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LCBJKHPDFBI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LCBJKHPDFBI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LCBJKHPDFBI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

