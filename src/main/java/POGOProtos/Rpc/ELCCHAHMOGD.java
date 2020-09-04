// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ELCCHAHMOGD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ELCCHAHMOGD}
 */
public final class ELCCHAHMOGD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ELCCHAHMOGD)
    ELCCHAHMOGDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ELCCHAHMOGD.newBuilder() to construct.
  private ELCCHAHMOGD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ELCCHAHMOGD() {
    lknpioglmib_ = 0;
    omkipbfoaho_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ELCCHAHMOGD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ELCCHAHMOGD(
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

            lknpioglmib_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            omkipbfoaho_ = s;
            break;
          }
          case 24: {

            mkffbahdnoc_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ELCCHAHMOGD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ELCCHAHMOGD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ELCCHAHMOGD.class, POGOProtos.Rpc.ELCCHAHMOGD.Builder.class);
  }

  /**
   * <pre>
   * ref: ELCCHAHMOGD/BGNPONLELHB/DIJALIACLEF
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF}
   */
  public enum DIJALIACLEF
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
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
    public static DIJALIACLEF valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DIJALIACLEF forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DIJALIACLEF>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DIJALIACLEF> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DIJALIACLEF>() {
            public DIJALIACLEF findValueByNumber(int number) {
              return DIJALIACLEF.forNumber(number);
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
      return POGOProtos.Rpc.ELCCHAHMOGD.getDescriptor().getEnumTypes().get(0);
    }

    private static final DIJALIACLEF[] VALUES = values();

    public static DIJALIACLEF valueOf(
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

    private DIJALIACLEF(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF)
  }

  public static final int LKNPIOGLMIB_FIELD_NUMBER = 1;
  private int lknpioglmib_;
  /**
   * <code>.POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF lknpioglmib = 1;</code>
   * @return The enum numeric value on the wire for lknpioglmib.
   */
  @java.lang.Override public int getLknpioglmibValue() {
    return lknpioglmib_;
  }
  /**
   * <code>.POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF lknpioglmib = 1;</code>
   * @return The lknpioglmib.
   */
  @java.lang.Override public POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF getLknpioglmib() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF result = POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF.valueOf(lknpioglmib_);
    return result == null ? POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF.UNRECOGNIZED : result;
  }

  public static final int OMKIPBFOAHO_FIELD_NUMBER = 2;
  private volatile java.lang.Object omkipbfoaho_;
  /**
   * <code>string omkipbfoaho = 2;</code>
   * @return The omkipbfoaho.
   */
  @java.lang.Override
  public java.lang.String getOmkipbfoaho() {
    java.lang.Object ref = omkipbfoaho_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      omkipbfoaho_ = s;
      return s;
    }
  }
  /**
   * <code>string omkipbfoaho = 2;</code>
   * @return The bytes for omkipbfoaho.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOmkipbfoahoBytes() {
    java.lang.Object ref = omkipbfoaho_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      omkipbfoaho_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MKFFBAHDNOC_FIELD_NUMBER = 3;
  private long mkffbahdnoc_;
  /**
   * <code>int64 mkffbahdnoc = 3;</code>
   * @return The mkffbahdnoc.
   */
  @java.lang.Override
  public long getMkffbahdnoc() {
    return mkffbahdnoc_;
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
    if (lknpioglmib_ != POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF.UNSET.getNumber()) {
      output.writeEnum(1, lknpioglmib_);
    }
    if (!getOmkipbfoahoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, omkipbfoaho_);
    }
    if (mkffbahdnoc_ != 0L) {
      output.writeInt64(3, mkffbahdnoc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lknpioglmib_ != POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lknpioglmib_);
    }
    if (!getOmkipbfoahoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, omkipbfoaho_);
    }
    if (mkffbahdnoc_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, mkffbahdnoc_);
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
    if (!(obj instanceof POGOProtos.Rpc.ELCCHAHMOGD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ELCCHAHMOGD other = (POGOProtos.Rpc.ELCCHAHMOGD) obj;

    if (lknpioglmib_ != other.lknpioglmib_) return false;
    if (!getOmkipbfoaho()
        .equals(other.getOmkipbfoaho())) return false;
    if (getMkffbahdnoc()
        != other.getMkffbahdnoc()) return false;
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
    hash = (37 * hash) + LKNPIOGLMIB_FIELD_NUMBER;
    hash = (53 * hash) + lknpioglmib_;
    hash = (37 * hash) + OMKIPBFOAHO_FIELD_NUMBER;
    hash = (53 * hash) + getOmkipbfoaho().hashCode();
    hash = (37 * hash) + MKFFBAHDNOC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMkffbahdnoc());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ELCCHAHMOGD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ELCCHAHMOGD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ELCCHAHMOGD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ELCCHAHMOGD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ELCCHAHMOGD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ELCCHAHMOGD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ELCCHAHMOGD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ELCCHAHMOGD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ELCCHAHMOGD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ELCCHAHMOGD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ELCCHAHMOGD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ELCCHAHMOGD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ELCCHAHMOGD prototype) {
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
   * ref: ELCCHAHMOGD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ELCCHAHMOGD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ELCCHAHMOGD)
      POGOProtos.Rpc.ELCCHAHMOGDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ELCCHAHMOGD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ELCCHAHMOGD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ELCCHAHMOGD.class, POGOProtos.Rpc.ELCCHAHMOGD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ELCCHAHMOGD.newBuilder()
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
      lknpioglmib_ = 0;

      omkipbfoaho_ = "";

      mkffbahdnoc_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ELCCHAHMOGD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ELCCHAHMOGD getDefaultInstanceForType() {
      return POGOProtos.Rpc.ELCCHAHMOGD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ELCCHAHMOGD build() {
      POGOProtos.Rpc.ELCCHAHMOGD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ELCCHAHMOGD buildPartial() {
      POGOProtos.Rpc.ELCCHAHMOGD result = new POGOProtos.Rpc.ELCCHAHMOGD(this);
      result.lknpioglmib_ = lknpioglmib_;
      result.omkipbfoaho_ = omkipbfoaho_;
      result.mkffbahdnoc_ = mkffbahdnoc_;
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
      if (other instanceof POGOProtos.Rpc.ELCCHAHMOGD) {
        return mergeFrom((POGOProtos.Rpc.ELCCHAHMOGD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ELCCHAHMOGD other) {
      if (other == POGOProtos.Rpc.ELCCHAHMOGD.getDefaultInstance()) return this;
      if (other.lknpioglmib_ != 0) {
        setLknpioglmibValue(other.getLknpioglmibValue());
      }
      if (!other.getOmkipbfoaho().isEmpty()) {
        omkipbfoaho_ = other.omkipbfoaho_;
        onChanged();
      }
      if (other.getMkffbahdnoc() != 0L) {
        setMkffbahdnoc(other.getMkffbahdnoc());
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
      POGOProtos.Rpc.ELCCHAHMOGD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ELCCHAHMOGD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int lknpioglmib_ = 0;
    /**
     * <code>.POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF lknpioglmib = 1;</code>
     * @return The enum numeric value on the wire for lknpioglmib.
     */
    @java.lang.Override public int getLknpioglmibValue() {
      return lknpioglmib_;
    }
    /**
     * <code>.POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF lknpioglmib = 1;</code>
     * @param value The enum numeric value on the wire for lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmibValue(int value) {
      
      lknpioglmib_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF lknpioglmib = 1;</code>
     * @return The lknpioglmib.
     */
    @java.lang.Override
    public POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF getLknpioglmib() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF result = POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF.valueOf(lknpioglmib_);
      return result == null ? POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF lknpioglmib = 1;</code>
     * @param value The lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmib(POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lknpioglmib_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ELCCHAHMOGD.DIJALIACLEF lknpioglmib = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLknpioglmib() {
      
      lknpioglmib_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object omkipbfoaho_ = "";
    /**
     * <code>string omkipbfoaho = 2;</code>
     * @return The omkipbfoaho.
     */
    public java.lang.String getOmkipbfoaho() {
      java.lang.Object ref = omkipbfoaho_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        omkipbfoaho_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string omkipbfoaho = 2;</code>
     * @return The bytes for omkipbfoaho.
     */
    public com.google.protobuf.ByteString
        getOmkipbfoahoBytes() {
      java.lang.Object ref = omkipbfoaho_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        omkipbfoaho_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string omkipbfoaho = 2;</code>
     * @param value The omkipbfoaho to set.
     * @return This builder for chaining.
     */
    public Builder setOmkipbfoaho(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      omkipbfoaho_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string omkipbfoaho = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOmkipbfoaho() {
      
      omkipbfoaho_ = getDefaultInstance().getOmkipbfoaho();
      onChanged();
      return this;
    }
    /**
     * <code>string omkipbfoaho = 2;</code>
     * @param value The bytes for omkipbfoaho to set.
     * @return This builder for chaining.
     */
    public Builder setOmkipbfoahoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      omkipbfoaho_ = value;
      onChanged();
      return this;
    }

    private long mkffbahdnoc_ ;
    /**
     * <code>int64 mkffbahdnoc = 3;</code>
     * @return The mkffbahdnoc.
     */
    @java.lang.Override
    public long getMkffbahdnoc() {
      return mkffbahdnoc_;
    }
    /**
     * <code>int64 mkffbahdnoc = 3;</code>
     * @param value The mkffbahdnoc to set.
     * @return This builder for chaining.
     */
    public Builder setMkffbahdnoc(long value) {
      
      mkffbahdnoc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 mkffbahdnoc = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMkffbahdnoc() {
      
      mkffbahdnoc_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ELCCHAHMOGD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ELCCHAHMOGD)
  private static final POGOProtos.Rpc.ELCCHAHMOGD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ELCCHAHMOGD();
  }

  public static POGOProtos.Rpc.ELCCHAHMOGD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ELCCHAHMOGD>
      PARSER = new com.google.protobuf.AbstractParser<ELCCHAHMOGD>() {
    @java.lang.Override
    public ELCCHAHMOGD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ELCCHAHMOGD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ELCCHAHMOGD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ELCCHAHMOGD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ELCCHAHMOGD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

