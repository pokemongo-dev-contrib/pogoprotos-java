// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OIIEOOGMOIE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.OIIEOOGMOIE}
 */
public final class OIIEOOGMOIE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OIIEOOGMOIE)
    OIIEOOGMOIEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OIIEOOGMOIE.newBuilder() to construct.
  private OIIEOOGMOIE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OIIEOOGMOIE() {
    lknpioglmib_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OIIEOOGMOIE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OIIEOOGMOIE(
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
            POGOProtos.Rpc.ALDBMMPFJEL.Builder subBuilder = null;
            if (nilfcplopob_ != null) {
              subBuilder = nilfcplopob_.toBuilder();
            }
            nilfcplopob_ = input.readMessage(POGOProtos.Rpc.ALDBMMPFJEL.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nilfcplopob_);
              nilfcplopob_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OIIEOOGMOIE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OIIEOOGMOIE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OIIEOOGMOIE.class, POGOProtos.Rpc.OIIEOOGMOIE.Builder.class);
  }

  /**
   * <pre>
   * ref: OIIEOOGMOIE/BPIHHMLGFPK/GPBCFCGBOEC
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC}
   */
  public enum GPBCFCGBOEC
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
     * <code>ERROR_POKEMON_NOT_FOUND = 2;</code>
     */
    ERROR_POKEMON_NOT_FOUND(2),
    /**
     * <code>ERROR_UNLOCK_NOT_AVAILABLE = 3;</code>
     */
    ERROR_UNLOCK_NOT_AVAILABLE(3),
    /**
     * <code>ERROR_ALREADY_UNLOCKED = 4;</code>
     */
    ERROR_ALREADY_UNLOCKED(4),
    /**
     * <code>ERROR_INSUFFICIENT_RESOURCES = 5;</code>
     */
    ERROR_INSUFFICIENT_RESOURCES(5),
    /**
     * <code>ERROR_DISABLED = 6;</code>
     */
    ERROR_DISABLED(6),
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
     * <code>ERROR_POKEMON_NOT_FOUND = 2;</code>
     */
    public static final int ERROR_POKEMON_NOT_FOUND_VALUE = 2;
    /**
     * <code>ERROR_UNLOCK_NOT_AVAILABLE = 3;</code>
     */
    public static final int ERROR_UNLOCK_NOT_AVAILABLE_VALUE = 3;
    /**
     * <code>ERROR_ALREADY_UNLOCKED = 4;</code>
     */
    public static final int ERROR_ALREADY_UNLOCKED_VALUE = 4;
    /**
     * <code>ERROR_INSUFFICIENT_RESOURCES = 5;</code>
     */
    public static final int ERROR_INSUFFICIENT_RESOURCES_VALUE = 5;
    /**
     * <code>ERROR_DISABLED = 6;</code>
     */
    public static final int ERROR_DISABLED_VALUE = 6;


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
    public static GPBCFCGBOEC valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GPBCFCGBOEC forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_POKEMON_NOT_FOUND;
        case 3: return ERROR_UNLOCK_NOT_AVAILABLE;
        case 4: return ERROR_ALREADY_UNLOCKED;
        case 5: return ERROR_INSUFFICIENT_RESOURCES;
        case 6: return ERROR_DISABLED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GPBCFCGBOEC>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GPBCFCGBOEC> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GPBCFCGBOEC>() {
            public GPBCFCGBOEC findValueByNumber(int number) {
              return GPBCFCGBOEC.forNumber(number);
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
      return POGOProtos.Rpc.OIIEOOGMOIE.getDescriptor().getEnumTypes().get(0);
    }

    private static final GPBCFCGBOEC[] VALUES = values();

    public static GPBCFCGBOEC valueOf(
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

    private GPBCFCGBOEC(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC)
  }

  public static final int LKNPIOGLMIB_FIELD_NUMBER = 1;
  private int lknpioglmib_;
  /**
   * <code>.POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC lknpioglmib = 1;</code>
   * @return The enum numeric value on the wire for lknpioglmib.
   */
  @java.lang.Override public int getLknpioglmibValue() {
    return lknpioglmib_;
  }
  /**
   * <code>.POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC lknpioglmib = 1;</code>
   * @return The lknpioglmib.
   */
  @java.lang.Override public POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC getLknpioglmib() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC result = POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC.valueOf(lknpioglmib_);
    return result == null ? POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC.UNRECOGNIZED : result;
  }

  public static final int NILFCPLOPOB_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob_;
  /**
   * <code>.POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob = 2;</code>
   * @return Whether the nilfcplopob field is set.
   */
  @java.lang.Override
  public boolean hasNilfcplopob() {
    return nilfcplopob_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob = 2;</code>
   * @return The nilfcplopob.
   */
  @java.lang.Override
  public POGOProtos.Rpc.ALDBMMPFJEL getNilfcplopob() {
    return nilfcplopob_ == null ? POGOProtos.Rpc.ALDBMMPFJEL.getDefaultInstance() : nilfcplopob_;
  }
  /**
   * <code>.POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ALDBMMPFJELOrBuilder getNilfcplopobOrBuilder() {
    return getNilfcplopob();
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
    if (lknpioglmib_ != POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC.UNSET.getNumber()) {
      output.writeEnum(1, lknpioglmib_);
    }
    if (nilfcplopob_ != null) {
      output.writeMessage(2, getNilfcplopob());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lknpioglmib_ != POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lknpioglmib_);
    }
    if (nilfcplopob_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNilfcplopob());
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
    if (!(obj instanceof POGOProtos.Rpc.OIIEOOGMOIE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OIIEOOGMOIE other = (POGOProtos.Rpc.OIIEOOGMOIE) obj;

    if (lknpioglmib_ != other.lknpioglmib_) return false;
    if (hasNilfcplopob() != other.hasNilfcplopob()) return false;
    if (hasNilfcplopob()) {
      if (!getNilfcplopob()
          .equals(other.getNilfcplopob())) return false;
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
    hash = (37 * hash) + LKNPIOGLMIB_FIELD_NUMBER;
    hash = (53 * hash) + lknpioglmib_;
    if (hasNilfcplopob()) {
      hash = (37 * hash) + NILFCPLOPOB_FIELD_NUMBER;
      hash = (53 * hash) + getNilfcplopob().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OIIEOOGMOIE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OIIEOOGMOIE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OIIEOOGMOIE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OIIEOOGMOIE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OIIEOOGMOIE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OIIEOOGMOIE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OIIEOOGMOIE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OIIEOOGMOIE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OIIEOOGMOIE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OIIEOOGMOIE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OIIEOOGMOIE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OIIEOOGMOIE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OIIEOOGMOIE prototype) {
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
   * ref: OIIEOOGMOIE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.OIIEOOGMOIE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OIIEOOGMOIE)
      POGOProtos.Rpc.OIIEOOGMOIEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OIIEOOGMOIE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OIIEOOGMOIE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OIIEOOGMOIE.class, POGOProtos.Rpc.OIIEOOGMOIE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OIIEOOGMOIE.newBuilder()
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

      if (nilfcplopobBuilder_ == null) {
        nilfcplopob_ = null;
      } else {
        nilfcplopob_ = null;
        nilfcplopobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OIIEOOGMOIE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OIIEOOGMOIE getDefaultInstanceForType() {
      return POGOProtos.Rpc.OIIEOOGMOIE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OIIEOOGMOIE build() {
      POGOProtos.Rpc.OIIEOOGMOIE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OIIEOOGMOIE buildPartial() {
      POGOProtos.Rpc.OIIEOOGMOIE result = new POGOProtos.Rpc.OIIEOOGMOIE(this);
      result.lknpioglmib_ = lknpioglmib_;
      if (nilfcplopobBuilder_ == null) {
        result.nilfcplopob_ = nilfcplopob_;
      } else {
        result.nilfcplopob_ = nilfcplopobBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.OIIEOOGMOIE) {
        return mergeFrom((POGOProtos.Rpc.OIIEOOGMOIE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OIIEOOGMOIE other) {
      if (other == POGOProtos.Rpc.OIIEOOGMOIE.getDefaultInstance()) return this;
      if (other.lknpioglmib_ != 0) {
        setLknpioglmibValue(other.getLknpioglmibValue());
      }
      if (other.hasNilfcplopob()) {
        mergeNilfcplopob(other.getNilfcplopob());
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
      POGOProtos.Rpc.OIIEOOGMOIE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OIIEOOGMOIE) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC lknpioglmib = 1;</code>
     * @return The enum numeric value on the wire for lknpioglmib.
     */
    @java.lang.Override public int getLknpioglmibValue() {
      return lknpioglmib_;
    }
    /**
     * <code>.POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC lknpioglmib = 1;</code>
     * @param value The enum numeric value on the wire for lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmibValue(int value) {
      
      lknpioglmib_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC lknpioglmib = 1;</code>
     * @return The lknpioglmib.
     */
    @java.lang.Override
    public POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC getLknpioglmib() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC result = POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC.valueOf(lknpioglmib_);
      return result == null ? POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC lknpioglmib = 1;</code>
     * @param value The lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmib(POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lknpioglmib_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OIIEOOGMOIE.GPBCFCGBOEC lknpioglmib = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLknpioglmib() {
      
      lknpioglmib_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ALDBMMPFJEL, POGOProtos.Rpc.ALDBMMPFJEL.Builder, POGOProtos.Rpc.ALDBMMPFJELOrBuilder> nilfcplopobBuilder_;
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob = 2;</code>
     * @return Whether the nilfcplopob field is set.
     */
    public boolean hasNilfcplopob() {
      return nilfcplopobBuilder_ != null || nilfcplopob_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob = 2;</code>
     * @return The nilfcplopob.
     */
    public POGOProtos.Rpc.ALDBMMPFJEL getNilfcplopob() {
      if (nilfcplopobBuilder_ == null) {
        return nilfcplopob_ == null ? POGOProtos.Rpc.ALDBMMPFJEL.getDefaultInstance() : nilfcplopob_;
      } else {
        return nilfcplopobBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob = 2;</code>
     */
    public Builder setNilfcplopob(POGOProtos.Rpc.ALDBMMPFJEL value) {
      if (nilfcplopobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nilfcplopob_ = value;
        onChanged();
      } else {
        nilfcplopobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob = 2;</code>
     */
    public Builder setNilfcplopob(
        POGOProtos.Rpc.ALDBMMPFJEL.Builder builderForValue) {
      if (nilfcplopobBuilder_ == null) {
        nilfcplopob_ = builderForValue.build();
        onChanged();
      } else {
        nilfcplopobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob = 2;</code>
     */
    public Builder mergeNilfcplopob(POGOProtos.Rpc.ALDBMMPFJEL value) {
      if (nilfcplopobBuilder_ == null) {
        if (nilfcplopob_ != null) {
          nilfcplopob_ =
            POGOProtos.Rpc.ALDBMMPFJEL.newBuilder(nilfcplopob_).mergeFrom(value).buildPartial();
        } else {
          nilfcplopob_ = value;
        }
        onChanged();
      } else {
        nilfcplopobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob = 2;</code>
     */
    public Builder clearNilfcplopob() {
      if (nilfcplopobBuilder_ == null) {
        nilfcplopob_ = null;
        onChanged();
      } else {
        nilfcplopob_ = null;
        nilfcplopobBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob = 2;</code>
     */
    public POGOProtos.Rpc.ALDBMMPFJEL.Builder getNilfcplopobBuilder() {
      
      onChanged();
      return getNilfcplopobFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob = 2;</code>
     */
    public POGOProtos.Rpc.ALDBMMPFJELOrBuilder getNilfcplopobOrBuilder() {
      if (nilfcplopobBuilder_ != null) {
        return nilfcplopobBuilder_.getMessageOrBuilder();
      } else {
        return nilfcplopob_ == null ?
            POGOProtos.Rpc.ALDBMMPFJEL.getDefaultInstance() : nilfcplopob_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL nilfcplopob = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ALDBMMPFJEL, POGOProtos.Rpc.ALDBMMPFJEL.Builder, POGOProtos.Rpc.ALDBMMPFJELOrBuilder> 
        getNilfcplopobFieldBuilder() {
      if (nilfcplopobBuilder_ == null) {
        nilfcplopobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.ALDBMMPFJEL, POGOProtos.Rpc.ALDBMMPFJEL.Builder, POGOProtos.Rpc.ALDBMMPFJELOrBuilder>(
                getNilfcplopob(),
                getParentForChildren(),
                isClean());
        nilfcplopob_ = null;
      }
      return nilfcplopobBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OIIEOOGMOIE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OIIEOOGMOIE)
  private static final POGOProtos.Rpc.OIIEOOGMOIE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OIIEOOGMOIE();
  }

  public static POGOProtos.Rpc.OIIEOOGMOIE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OIIEOOGMOIE>
      PARSER = new com.google.protobuf.AbstractParser<OIIEOOGMOIE>() {
    @java.lang.Override
    public OIIEOOGMOIE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OIIEOOGMOIE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OIIEOOGMOIE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OIIEOOGMOIE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OIIEOOGMOIE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

