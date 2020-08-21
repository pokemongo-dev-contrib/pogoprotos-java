// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CJBCCNKCFFN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CJBCCNKCFFN}
 */
public final class CJBCCNKCFFN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CJBCCNKCFFN)
    CJBCCNKCFFNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CJBCCNKCFFN.newBuilder() to construct.
  private CJBCCNKCFFN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CJBCCNKCFFN() {
    fmolddkjbjl_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CJBCCNKCFFN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CJBCCNKCFFN(
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

            fmolddkjbjl_ = rawValue;
            break;
          }
          case 21: {

            fdkokfpjimi_ = input.readFloat();
            break;
          }
          case 29: {

            nfbjokhcmif_ = input.readFloat();
            break;
          }
          case 37: {

            idkjkiifehe_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJBCCNKCFFN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJBCCNKCFFN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CJBCCNKCFFN.class, POGOProtos.Rpc.CJBCCNKCFFN.Builder.class);
  }

  /**
   * <pre>
   * ref: CJBCCNKCFFN/ABEDLIJEJHN/PIFEDKOGDJB
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB}
   */
  public enum PIFEDKOGDJB
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>PARTY_RECOMMENDATION_MODE_1 = 1;</code>
     */
    PARTY_RECOMMENDATION_MODE_1(1),
    /**
     * <code>PARTY_RECOMMENDATION_MODE_2 = 2;</code>
     */
    PARTY_RECOMMENDATION_MODE_2(2),
    /**
     * <code>PARTY_RECOMMENDATION_MODE_3 = 3;</code>
     */
    PARTY_RECOMMENDATION_MODE_3(3),
    /**
     * <code>PARTY_RECOMMENDATION_MODE_4 = 4;</code>
     */
    PARTY_RECOMMENDATION_MODE_4(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>PARTY_RECOMMENDATION_MODE_1 = 1;</code>
     */
    public static final int PARTY_RECOMMENDATION_MODE_1_VALUE = 1;
    /**
     * <code>PARTY_RECOMMENDATION_MODE_2 = 2;</code>
     */
    public static final int PARTY_RECOMMENDATION_MODE_2_VALUE = 2;
    /**
     * <code>PARTY_RECOMMENDATION_MODE_3 = 3;</code>
     */
    public static final int PARTY_RECOMMENDATION_MODE_3_VALUE = 3;
    /**
     * <code>PARTY_RECOMMENDATION_MODE_4 = 4;</code>
     */
    public static final int PARTY_RECOMMENDATION_MODE_4_VALUE = 4;


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
    public static PIFEDKOGDJB valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PIFEDKOGDJB forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return PARTY_RECOMMENDATION_MODE_1;
        case 2: return PARTY_RECOMMENDATION_MODE_2;
        case 3: return PARTY_RECOMMENDATION_MODE_3;
        case 4: return PARTY_RECOMMENDATION_MODE_4;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PIFEDKOGDJB>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PIFEDKOGDJB> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PIFEDKOGDJB>() {
            public PIFEDKOGDJB findValueByNumber(int number) {
              return PIFEDKOGDJB.forNumber(number);
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
      return POGOProtos.Rpc.CJBCCNKCFFN.getDescriptor().getEnumTypes().get(0);
    }

    private static final PIFEDKOGDJB[] VALUES = values();

    public static PIFEDKOGDJB valueOf(
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

    private PIFEDKOGDJB(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB)
  }

  public static final int FMOLDDKJBJL_FIELD_NUMBER = 1;
  private int fmolddkjbjl_;
  /**
   * <code>.POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB fmolddkjbjl = 1;</code>
   * @return The enum numeric value on the wire for fmolddkjbjl.
   */
  @java.lang.Override public int getFmolddkjbjlValue() {
    return fmolddkjbjl_;
  }
  /**
   * <code>.POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB fmolddkjbjl = 1;</code>
   * @return The fmolddkjbjl.
   */
  @java.lang.Override public POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB getFmolddkjbjl() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB result = POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB.valueOf(fmolddkjbjl_);
    return result == null ? POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB.UNRECOGNIZED : result;
  }

  public static final int FDKOKFPJIMI_FIELD_NUMBER = 2;
  private float fdkokfpjimi_;
  /**
   * <code>float fdkokfpjimi = 2;</code>
   * @return The fdkokfpjimi.
   */
  @java.lang.Override
  public float getFdkokfpjimi() {
    return fdkokfpjimi_;
  }

  public static final int NFBJOKHCMIF_FIELD_NUMBER = 3;
  private float nfbjokhcmif_;
  /**
   * <code>float nfbjokhcmif = 3;</code>
   * @return The nfbjokhcmif.
   */
  @java.lang.Override
  public float getNfbjokhcmif() {
    return nfbjokhcmif_;
  }

  public static final int IDKJKIIFEHE_FIELD_NUMBER = 4;
  private float idkjkiifehe_;
  /**
   * <code>float idkjkiifehe = 4;</code>
   * @return The idkjkiifehe.
   */
  @java.lang.Override
  public float getIdkjkiifehe() {
    return idkjkiifehe_;
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
    if (fmolddkjbjl_ != POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB.UNSET.getNumber()) {
      output.writeEnum(1, fmolddkjbjl_);
    }
    if (fdkokfpjimi_ != 0F) {
      output.writeFloat(2, fdkokfpjimi_);
    }
    if (nfbjokhcmif_ != 0F) {
      output.writeFloat(3, nfbjokhcmif_);
    }
    if (idkjkiifehe_ != 0F) {
      output.writeFloat(4, idkjkiifehe_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fmolddkjbjl_ != POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, fmolddkjbjl_);
    }
    if (fdkokfpjimi_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, fdkokfpjimi_);
    }
    if (nfbjokhcmif_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, nfbjokhcmif_);
    }
    if (idkjkiifehe_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, idkjkiifehe_);
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
    if (!(obj instanceof POGOProtos.Rpc.CJBCCNKCFFN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CJBCCNKCFFN other = (POGOProtos.Rpc.CJBCCNKCFFN) obj;

    if (fmolddkjbjl_ != other.fmolddkjbjl_) return false;
    if (java.lang.Float.floatToIntBits(getFdkokfpjimi())
        != java.lang.Float.floatToIntBits(
            other.getFdkokfpjimi())) return false;
    if (java.lang.Float.floatToIntBits(getNfbjokhcmif())
        != java.lang.Float.floatToIntBits(
            other.getNfbjokhcmif())) return false;
    if (java.lang.Float.floatToIntBits(getIdkjkiifehe())
        != java.lang.Float.floatToIntBits(
            other.getIdkjkiifehe())) return false;
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
    hash = (37 * hash) + FMOLDDKJBJL_FIELD_NUMBER;
    hash = (53 * hash) + fmolddkjbjl_;
    hash = (37 * hash) + FDKOKFPJIMI_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getFdkokfpjimi());
    hash = (37 * hash) + NFBJOKHCMIF_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getNfbjokhcmif());
    hash = (37 * hash) + IDKJKIIFEHE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getIdkjkiifehe());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CJBCCNKCFFN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CJBCCNKCFFN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJBCCNKCFFN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CJBCCNKCFFN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJBCCNKCFFN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CJBCCNKCFFN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJBCCNKCFFN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CJBCCNKCFFN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJBCCNKCFFN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CJBCCNKCFFN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJBCCNKCFFN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CJBCCNKCFFN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CJBCCNKCFFN prototype) {
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
   * ref: CJBCCNKCFFN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CJBCCNKCFFN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CJBCCNKCFFN)
      POGOProtos.Rpc.CJBCCNKCFFNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJBCCNKCFFN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJBCCNKCFFN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CJBCCNKCFFN.class, POGOProtos.Rpc.CJBCCNKCFFN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CJBCCNKCFFN.newBuilder()
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
      fmolddkjbjl_ = 0;

      fdkokfpjimi_ = 0F;

      nfbjokhcmif_ = 0F;

      idkjkiifehe_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJBCCNKCFFN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CJBCCNKCFFN getDefaultInstanceForType() {
      return POGOProtos.Rpc.CJBCCNKCFFN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CJBCCNKCFFN build() {
      POGOProtos.Rpc.CJBCCNKCFFN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CJBCCNKCFFN buildPartial() {
      POGOProtos.Rpc.CJBCCNKCFFN result = new POGOProtos.Rpc.CJBCCNKCFFN(this);
      result.fmolddkjbjl_ = fmolddkjbjl_;
      result.fdkokfpjimi_ = fdkokfpjimi_;
      result.nfbjokhcmif_ = nfbjokhcmif_;
      result.idkjkiifehe_ = idkjkiifehe_;
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
      if (other instanceof POGOProtos.Rpc.CJBCCNKCFFN) {
        return mergeFrom((POGOProtos.Rpc.CJBCCNKCFFN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CJBCCNKCFFN other) {
      if (other == POGOProtos.Rpc.CJBCCNKCFFN.getDefaultInstance()) return this;
      if (other.fmolddkjbjl_ != 0) {
        setFmolddkjbjlValue(other.getFmolddkjbjlValue());
      }
      if (other.getFdkokfpjimi() != 0F) {
        setFdkokfpjimi(other.getFdkokfpjimi());
      }
      if (other.getNfbjokhcmif() != 0F) {
        setNfbjokhcmif(other.getNfbjokhcmif());
      }
      if (other.getIdkjkiifehe() != 0F) {
        setIdkjkiifehe(other.getIdkjkiifehe());
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
      POGOProtos.Rpc.CJBCCNKCFFN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CJBCCNKCFFN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int fmolddkjbjl_ = 0;
    /**
     * <code>.POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB fmolddkjbjl = 1;</code>
     * @return The enum numeric value on the wire for fmolddkjbjl.
     */
    @java.lang.Override public int getFmolddkjbjlValue() {
      return fmolddkjbjl_;
    }
    /**
     * <code>.POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB fmolddkjbjl = 1;</code>
     * @param value The enum numeric value on the wire for fmolddkjbjl to set.
     * @return This builder for chaining.
     */
    public Builder setFmolddkjbjlValue(int value) {
      
      fmolddkjbjl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB fmolddkjbjl = 1;</code>
     * @return The fmolddkjbjl.
     */
    @java.lang.Override
    public POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB getFmolddkjbjl() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB result = POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB.valueOf(fmolddkjbjl_);
      return result == null ? POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB fmolddkjbjl = 1;</code>
     * @param value The fmolddkjbjl to set.
     * @return This builder for chaining.
     */
    public Builder setFmolddkjbjl(POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      fmolddkjbjl_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CJBCCNKCFFN.PIFEDKOGDJB fmolddkjbjl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFmolddkjbjl() {
      
      fmolddkjbjl_ = 0;
      onChanged();
      return this;
    }

    private float fdkokfpjimi_ ;
    /**
     * <code>float fdkokfpjimi = 2;</code>
     * @return The fdkokfpjimi.
     */
    @java.lang.Override
    public float getFdkokfpjimi() {
      return fdkokfpjimi_;
    }
    /**
     * <code>float fdkokfpjimi = 2;</code>
     * @param value The fdkokfpjimi to set.
     * @return This builder for chaining.
     */
    public Builder setFdkokfpjimi(float value) {
      
      fdkokfpjimi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float fdkokfpjimi = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFdkokfpjimi() {
      
      fdkokfpjimi_ = 0F;
      onChanged();
      return this;
    }

    private float nfbjokhcmif_ ;
    /**
     * <code>float nfbjokhcmif = 3;</code>
     * @return The nfbjokhcmif.
     */
    @java.lang.Override
    public float getNfbjokhcmif() {
      return nfbjokhcmif_;
    }
    /**
     * <code>float nfbjokhcmif = 3;</code>
     * @param value The nfbjokhcmif to set.
     * @return This builder for chaining.
     */
    public Builder setNfbjokhcmif(float value) {
      
      nfbjokhcmif_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float nfbjokhcmif = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNfbjokhcmif() {
      
      nfbjokhcmif_ = 0F;
      onChanged();
      return this;
    }

    private float idkjkiifehe_ ;
    /**
     * <code>float idkjkiifehe = 4;</code>
     * @return The idkjkiifehe.
     */
    @java.lang.Override
    public float getIdkjkiifehe() {
      return idkjkiifehe_;
    }
    /**
     * <code>float idkjkiifehe = 4;</code>
     * @param value The idkjkiifehe to set.
     * @return This builder for chaining.
     */
    public Builder setIdkjkiifehe(float value) {
      
      idkjkiifehe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float idkjkiifehe = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdkjkiifehe() {
      
      idkjkiifehe_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CJBCCNKCFFN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CJBCCNKCFFN)
  private static final POGOProtos.Rpc.CJBCCNKCFFN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CJBCCNKCFFN();
  }

  public static POGOProtos.Rpc.CJBCCNKCFFN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CJBCCNKCFFN>
      PARSER = new com.google.protobuf.AbstractParser<CJBCCNKCFFN>() {
    @java.lang.Override
    public CJBCCNKCFFN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CJBCCNKCFFN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CJBCCNKCFFN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CJBCCNKCFFN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CJBCCNKCFFN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

