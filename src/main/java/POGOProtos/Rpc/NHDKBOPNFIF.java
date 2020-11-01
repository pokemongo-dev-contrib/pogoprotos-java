// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.NHDKBOPNFIF}
 */
public  final class NHDKBOPNFIF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NHDKBOPNFIF)
    NHDKBOPNFIFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NHDKBOPNFIF.newBuilder() to construct.
  private NHDKBOPNFIF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NHDKBOPNFIF() {
    fhaecmkdfoi_ = 0;
    lhjjnkahjkg_ = "";
    ooihlknaipe_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NHDKBOPNFIF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NHDKBOPNFIF(
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

            fhaecmkdfoi_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            lhjjnkahjkg_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            ooihlknaipe_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHDKBOPNFIF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHDKBOPNFIF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NHDKBOPNFIF.class, POGOProtos.Rpc.NHDKBOPNFIF.Builder.class);
  }

  /**
   * <pre>
   * ref: NHDKBOPNFIF/DBLOOCHGKAK/GPKENNNGIFG
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG}
   */
  public enum GPKENNNGIFG
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NONE = 0;</code>
     */
    NONE(0),
    /**
     * <code>HALLOWEEN = 1;</code>
     */
    HALLOWEEN(1),
    /**
     * <code>HOLIDAY = 2;</code>
     */
    HOLIDAY(2),
    /**
     * <code>ROCKET = 3;</code>
     */
    ROCKET(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NONE = 0;</code>
     */
    public static final int NONE_VALUE = 0;
    /**
     * <code>HALLOWEEN = 1;</code>
     */
    public static final int HALLOWEEN_VALUE = 1;
    /**
     * <code>HOLIDAY = 2;</code>
     */
    public static final int HOLIDAY_VALUE = 2;
    /**
     * <code>ROCKET = 3;</code>
     */
    public static final int ROCKET_VALUE = 3;


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
    public static GPKENNNGIFG valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GPKENNNGIFG forNumber(int value) {
      switch (value) {
        case 0: return NONE;
        case 1: return HALLOWEEN;
        case 2: return HOLIDAY;
        case 3: return ROCKET;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GPKENNNGIFG>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GPKENNNGIFG> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GPKENNNGIFG>() {
            public GPKENNNGIFG findValueByNumber(int number) {
              return GPKENNNGIFG.forNumber(number);
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
      return POGOProtos.Rpc.NHDKBOPNFIF.getDescriptor().getEnumTypes().get(0);
    }

    private static final GPKENNNGIFG[] VALUES = values();

    public static GPKENNNGIFG valueOf(
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

    private GPKENNNGIFG(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG)
  }

  public static final int FHAECMKDFOI_FIELD_NUMBER = 1;
  private int fhaecmkdfoi_;
  /**
   * <code>.POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG fhaecmkdfoi = 1;</code>
   * @return The enum numeric value on the wire for fhaecmkdfoi.
   */
  public int getFhaecmkdfoiValue() {
    return fhaecmkdfoi_;
  }
  /**
   * <code>.POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG fhaecmkdfoi = 1;</code>
   * @return The fhaecmkdfoi.
   */
  public POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG getFhaecmkdfoi() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG result = POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG.valueOf(fhaecmkdfoi_);
    return result == null ? POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG.UNRECOGNIZED : result;
  }

  public static final int LHJJNKAHJKG_FIELD_NUMBER = 2;
  private volatile java.lang.Object lhjjnkahjkg_;
  /**
   * <code>string lhjjnkahjkg = 2;</code>
   * @return The lhjjnkahjkg.
   */
  public java.lang.String getLhjjnkahjkg() {
    java.lang.Object ref = lhjjnkahjkg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lhjjnkahjkg_ = s;
      return s;
    }
  }
  /**
   * <code>string lhjjnkahjkg = 2;</code>
   * @return The bytes for lhjjnkahjkg.
   */
  public com.google.protobuf.ByteString
      getLhjjnkahjkgBytes() {
    java.lang.Object ref = lhjjnkahjkg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lhjjnkahjkg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OOIHLKNAIPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object ooihlknaipe_;
  /**
   * <code>string ooihlknaipe = 3;</code>
   * @return The ooihlknaipe.
   */
  public java.lang.String getOoihlknaipe() {
    java.lang.Object ref = ooihlknaipe_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ooihlknaipe_ = s;
      return s;
    }
  }
  /**
   * <code>string ooihlknaipe = 3;</code>
   * @return The bytes for ooihlknaipe.
   */
  public com.google.protobuf.ByteString
      getOoihlknaipeBytes() {
    java.lang.Object ref = ooihlknaipe_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ooihlknaipe_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (fhaecmkdfoi_ != POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG.NONE.getNumber()) {
      output.writeEnum(1, fhaecmkdfoi_);
    }
    if (!getLhjjnkahjkgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lhjjnkahjkg_);
    }
    if (!getOoihlknaipeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ooihlknaipe_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fhaecmkdfoi_ != POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, fhaecmkdfoi_);
    }
    if (!getLhjjnkahjkgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lhjjnkahjkg_);
    }
    if (!getOoihlknaipeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ooihlknaipe_);
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
    if (!(obj instanceof POGOProtos.Rpc.NHDKBOPNFIF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NHDKBOPNFIF other = (POGOProtos.Rpc.NHDKBOPNFIF) obj;

    if (fhaecmkdfoi_ != other.fhaecmkdfoi_) return false;
    if (!getLhjjnkahjkg()
        .equals(other.getLhjjnkahjkg())) return false;
    if (!getOoihlknaipe()
        .equals(other.getOoihlknaipe())) return false;
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
    hash = (37 * hash) + FHAECMKDFOI_FIELD_NUMBER;
    hash = (53 * hash) + fhaecmkdfoi_;
    hash = (37 * hash) + LHJJNKAHJKG_FIELD_NUMBER;
    hash = (53 * hash) + getLhjjnkahjkg().hashCode();
    hash = (37 * hash) + OOIHLKNAIPE_FIELD_NUMBER;
    hash = (53 * hash) + getOoihlknaipe().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NHDKBOPNFIF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NHDKBOPNFIF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHDKBOPNFIF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NHDKBOPNFIF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHDKBOPNFIF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NHDKBOPNFIF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHDKBOPNFIF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NHDKBOPNFIF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHDKBOPNFIF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NHDKBOPNFIF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHDKBOPNFIF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NHDKBOPNFIF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NHDKBOPNFIF prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.NHDKBOPNFIF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NHDKBOPNFIF)
      POGOProtos.Rpc.NHDKBOPNFIFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHDKBOPNFIF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHDKBOPNFIF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NHDKBOPNFIF.class, POGOProtos.Rpc.NHDKBOPNFIF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NHDKBOPNFIF.newBuilder()
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
      fhaecmkdfoi_ = 0;

      lhjjnkahjkg_ = "";

      ooihlknaipe_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHDKBOPNFIF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NHDKBOPNFIF getDefaultInstanceForType() {
      return POGOProtos.Rpc.NHDKBOPNFIF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NHDKBOPNFIF build() {
      POGOProtos.Rpc.NHDKBOPNFIF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NHDKBOPNFIF buildPartial() {
      POGOProtos.Rpc.NHDKBOPNFIF result = new POGOProtos.Rpc.NHDKBOPNFIF(this);
      result.fhaecmkdfoi_ = fhaecmkdfoi_;
      result.lhjjnkahjkg_ = lhjjnkahjkg_;
      result.ooihlknaipe_ = ooihlknaipe_;
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
      if (other instanceof POGOProtos.Rpc.NHDKBOPNFIF) {
        return mergeFrom((POGOProtos.Rpc.NHDKBOPNFIF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NHDKBOPNFIF other) {
      if (other == POGOProtos.Rpc.NHDKBOPNFIF.getDefaultInstance()) return this;
      if (other.fhaecmkdfoi_ != 0) {
        setFhaecmkdfoiValue(other.getFhaecmkdfoiValue());
      }
      if (!other.getLhjjnkahjkg().isEmpty()) {
        lhjjnkahjkg_ = other.lhjjnkahjkg_;
        onChanged();
      }
      if (!other.getOoihlknaipe().isEmpty()) {
        ooihlknaipe_ = other.ooihlknaipe_;
        onChanged();
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
      POGOProtos.Rpc.NHDKBOPNFIF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NHDKBOPNFIF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int fhaecmkdfoi_ = 0;
    /**
     * <code>.POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG fhaecmkdfoi = 1;</code>
     * @return The enum numeric value on the wire for fhaecmkdfoi.
     */
    public int getFhaecmkdfoiValue() {
      return fhaecmkdfoi_;
    }
    /**
     * <code>.POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG fhaecmkdfoi = 1;</code>
     * @param value The enum numeric value on the wire for fhaecmkdfoi to set.
     * @return This builder for chaining.
     */
    public Builder setFhaecmkdfoiValue(int value) {
      fhaecmkdfoi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG fhaecmkdfoi = 1;</code>
     * @return The fhaecmkdfoi.
     */
    public POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG getFhaecmkdfoi() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG result = POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG.valueOf(fhaecmkdfoi_);
      return result == null ? POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG fhaecmkdfoi = 1;</code>
     * @param value The fhaecmkdfoi to set.
     * @return This builder for chaining.
     */
    public Builder setFhaecmkdfoi(POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      fhaecmkdfoi_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NHDKBOPNFIF.GPKENNNGIFG fhaecmkdfoi = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFhaecmkdfoi() {
      
      fhaecmkdfoi_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object lhjjnkahjkg_ = "";
    /**
     * <code>string lhjjnkahjkg = 2;</code>
     * @return The lhjjnkahjkg.
     */
    public java.lang.String getLhjjnkahjkg() {
      java.lang.Object ref = lhjjnkahjkg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lhjjnkahjkg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lhjjnkahjkg = 2;</code>
     * @return The bytes for lhjjnkahjkg.
     */
    public com.google.protobuf.ByteString
        getLhjjnkahjkgBytes() {
      java.lang.Object ref = lhjjnkahjkg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lhjjnkahjkg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lhjjnkahjkg = 2;</code>
     * @param value The lhjjnkahjkg to set.
     * @return This builder for chaining.
     */
    public Builder setLhjjnkahjkg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lhjjnkahjkg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lhjjnkahjkg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLhjjnkahjkg() {
      
      lhjjnkahjkg_ = getDefaultInstance().getLhjjnkahjkg();
      onChanged();
      return this;
    }
    /**
     * <code>string lhjjnkahjkg = 2;</code>
     * @param value The bytes for lhjjnkahjkg to set.
     * @return This builder for chaining.
     */
    public Builder setLhjjnkahjkgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lhjjnkahjkg_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ooihlknaipe_ = "";
    /**
     * <code>string ooihlknaipe = 3;</code>
     * @return The ooihlknaipe.
     */
    public java.lang.String getOoihlknaipe() {
      java.lang.Object ref = ooihlknaipe_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ooihlknaipe_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ooihlknaipe = 3;</code>
     * @return The bytes for ooihlknaipe.
     */
    public com.google.protobuf.ByteString
        getOoihlknaipeBytes() {
      java.lang.Object ref = ooihlknaipe_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ooihlknaipe_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ooihlknaipe = 3;</code>
     * @param value The ooihlknaipe to set.
     * @return This builder for chaining.
     */
    public Builder setOoihlknaipe(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ooihlknaipe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ooihlknaipe = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOoihlknaipe() {
      
      ooihlknaipe_ = getDefaultInstance().getOoihlknaipe();
      onChanged();
      return this;
    }
    /**
     * <code>string ooihlknaipe = 3;</code>
     * @param value The bytes for ooihlknaipe to set.
     * @return This builder for chaining.
     */
    public Builder setOoihlknaipeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ooihlknaipe_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NHDKBOPNFIF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NHDKBOPNFIF)
  private static final POGOProtos.Rpc.NHDKBOPNFIF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NHDKBOPNFIF();
  }

  public static POGOProtos.Rpc.NHDKBOPNFIF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NHDKBOPNFIF>
      PARSER = new com.google.protobuf.AbstractParser<NHDKBOPNFIF>() {
    @java.lang.Override
    public NHDKBOPNFIF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NHDKBOPNFIF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NHDKBOPNFIF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NHDKBOPNFIF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NHDKBOPNFIF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

