// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: EKGIKJHOPOH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.EKGIKJHOPOH}
 */
public final class EKGIKJHOPOH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EKGIKJHOPOH)
    EKGIKJHOPOHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EKGIKJHOPOH.newBuilder() to construct.
  private EKGIKJHOPOH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EKGIKJHOPOH() {
    cjpmhgnldhm_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EKGIKJHOPOH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EKGIKJHOPOH(
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

            cjpmhgnldhm_ = rawValue;
            break;
          }
          case 21: {

            plkoblnpgfe_ = input.readFloat();
            break;
          }
          case 29: {

            amhibpaokkn_ = input.readFloat();
            break;
          }
          case 37: {

            ijjjfigbipe_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EKGIKJHOPOH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EKGIKJHOPOH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EKGIKJHOPOH.class, POGOProtos.Rpc.EKGIKJHOPOH.Builder.class);
  }

  /**
   * <pre>
   * ref: EKGIKJHOPOH/NGEJPCLPAID/LHABENFFNPL
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL}
   */
  public enum LHABENFFNPL
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
    public static LHABENFFNPL valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LHABENFFNPL forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return PARTY_RECOMMENDATION_MODE_1;
        case 2: return PARTY_RECOMMENDATION_MODE_2;
        case 3: return PARTY_RECOMMENDATION_MODE_3;
        case 4: return PARTY_RECOMMENDATION_MODE_4;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LHABENFFNPL>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LHABENFFNPL> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LHABENFFNPL>() {
            public LHABENFFNPL findValueByNumber(int number) {
              return LHABENFFNPL.forNumber(number);
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
      return POGOProtos.Rpc.EKGIKJHOPOH.getDescriptor().getEnumTypes().get(0);
    }

    private static final LHABENFFNPL[] VALUES = values();

    public static LHABENFFNPL valueOf(
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

    private LHABENFFNPL(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL)
  }

  public static final int CJPMHGNLDHM_FIELD_NUMBER = 1;
  private int cjpmhgnldhm_;
  /**
   * <code>.POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL cjpmhgnldhm = 1;</code>
   * @return The enum numeric value on the wire for cjpmhgnldhm.
   */
  @java.lang.Override public int getCjpmhgnldhmValue() {
    return cjpmhgnldhm_;
  }
  /**
   * <code>.POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL cjpmhgnldhm = 1;</code>
   * @return The cjpmhgnldhm.
   */
  @java.lang.Override public POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL getCjpmhgnldhm() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL result = POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL.valueOf(cjpmhgnldhm_);
    return result == null ? POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL.UNRECOGNIZED : result;
  }

  public static final int PLKOBLNPGFE_FIELD_NUMBER = 2;
  private float plkoblnpgfe_;
  /**
   * <code>float plkoblnpgfe = 2;</code>
   * @return The plkoblnpgfe.
   */
  @java.lang.Override
  public float getPlkoblnpgfe() {
    return plkoblnpgfe_;
  }

  public static final int AMHIBPAOKKN_FIELD_NUMBER = 3;
  private float amhibpaokkn_;
  /**
   * <code>float amhibpaokkn = 3;</code>
   * @return The amhibpaokkn.
   */
  @java.lang.Override
  public float getAmhibpaokkn() {
    return amhibpaokkn_;
  }

  public static final int IJJJFIGBIPE_FIELD_NUMBER = 4;
  private float ijjjfigbipe_;
  /**
   * <code>float ijjjfigbipe = 4;</code>
   * @return The ijjjfigbipe.
   */
  @java.lang.Override
  public float getIjjjfigbipe() {
    return ijjjfigbipe_;
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
    if (cjpmhgnldhm_ != POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL.UNSET.getNumber()) {
      output.writeEnum(1, cjpmhgnldhm_);
    }
    if (plkoblnpgfe_ != 0F) {
      output.writeFloat(2, plkoblnpgfe_);
    }
    if (amhibpaokkn_ != 0F) {
      output.writeFloat(3, amhibpaokkn_);
    }
    if (ijjjfigbipe_ != 0F) {
      output.writeFloat(4, ijjjfigbipe_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cjpmhgnldhm_ != POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, cjpmhgnldhm_);
    }
    if (plkoblnpgfe_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, plkoblnpgfe_);
    }
    if (amhibpaokkn_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, amhibpaokkn_);
    }
    if (ijjjfigbipe_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, ijjjfigbipe_);
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
    if (!(obj instanceof POGOProtos.Rpc.EKGIKJHOPOH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EKGIKJHOPOH other = (POGOProtos.Rpc.EKGIKJHOPOH) obj;

    if (cjpmhgnldhm_ != other.cjpmhgnldhm_) return false;
    if (java.lang.Float.floatToIntBits(getPlkoblnpgfe())
        != java.lang.Float.floatToIntBits(
            other.getPlkoblnpgfe())) return false;
    if (java.lang.Float.floatToIntBits(getAmhibpaokkn())
        != java.lang.Float.floatToIntBits(
            other.getAmhibpaokkn())) return false;
    if (java.lang.Float.floatToIntBits(getIjjjfigbipe())
        != java.lang.Float.floatToIntBits(
            other.getIjjjfigbipe())) return false;
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
    hash = (37 * hash) + CJPMHGNLDHM_FIELD_NUMBER;
    hash = (53 * hash) + cjpmhgnldhm_;
    hash = (37 * hash) + PLKOBLNPGFE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPlkoblnpgfe());
    hash = (37 * hash) + AMHIBPAOKKN_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAmhibpaokkn());
    hash = (37 * hash) + IJJJFIGBIPE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getIjjjfigbipe());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EKGIKJHOPOH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EKGIKJHOPOH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EKGIKJHOPOH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EKGIKJHOPOH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EKGIKJHOPOH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EKGIKJHOPOH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EKGIKJHOPOH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EKGIKJHOPOH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EKGIKJHOPOH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EKGIKJHOPOH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EKGIKJHOPOH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EKGIKJHOPOH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EKGIKJHOPOH prototype) {
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
   * ref: EKGIKJHOPOH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.EKGIKJHOPOH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EKGIKJHOPOH)
      POGOProtos.Rpc.EKGIKJHOPOHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EKGIKJHOPOH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EKGIKJHOPOH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EKGIKJHOPOH.class, POGOProtos.Rpc.EKGIKJHOPOH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EKGIKJHOPOH.newBuilder()
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
      cjpmhgnldhm_ = 0;

      plkoblnpgfe_ = 0F;

      amhibpaokkn_ = 0F;

      ijjjfigbipe_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EKGIKJHOPOH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EKGIKJHOPOH getDefaultInstanceForType() {
      return POGOProtos.Rpc.EKGIKJHOPOH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EKGIKJHOPOH build() {
      POGOProtos.Rpc.EKGIKJHOPOH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EKGIKJHOPOH buildPartial() {
      POGOProtos.Rpc.EKGIKJHOPOH result = new POGOProtos.Rpc.EKGIKJHOPOH(this);
      result.cjpmhgnldhm_ = cjpmhgnldhm_;
      result.plkoblnpgfe_ = plkoblnpgfe_;
      result.amhibpaokkn_ = amhibpaokkn_;
      result.ijjjfigbipe_ = ijjjfigbipe_;
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
      if (other instanceof POGOProtos.Rpc.EKGIKJHOPOH) {
        return mergeFrom((POGOProtos.Rpc.EKGIKJHOPOH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EKGIKJHOPOH other) {
      if (other == POGOProtos.Rpc.EKGIKJHOPOH.getDefaultInstance()) return this;
      if (other.cjpmhgnldhm_ != 0) {
        setCjpmhgnldhmValue(other.getCjpmhgnldhmValue());
      }
      if (other.getPlkoblnpgfe() != 0F) {
        setPlkoblnpgfe(other.getPlkoblnpgfe());
      }
      if (other.getAmhibpaokkn() != 0F) {
        setAmhibpaokkn(other.getAmhibpaokkn());
      }
      if (other.getIjjjfigbipe() != 0F) {
        setIjjjfigbipe(other.getIjjjfigbipe());
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
      POGOProtos.Rpc.EKGIKJHOPOH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EKGIKJHOPOH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int cjpmhgnldhm_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL cjpmhgnldhm = 1;</code>
     * @return The enum numeric value on the wire for cjpmhgnldhm.
     */
    @java.lang.Override public int getCjpmhgnldhmValue() {
      return cjpmhgnldhm_;
    }
    /**
     * <code>.POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL cjpmhgnldhm = 1;</code>
     * @param value The enum numeric value on the wire for cjpmhgnldhm to set.
     * @return This builder for chaining.
     */
    public Builder setCjpmhgnldhmValue(int value) {
      
      cjpmhgnldhm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL cjpmhgnldhm = 1;</code>
     * @return The cjpmhgnldhm.
     */
    @java.lang.Override
    public POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL getCjpmhgnldhm() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL result = POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL.valueOf(cjpmhgnldhm_);
      return result == null ? POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL cjpmhgnldhm = 1;</code>
     * @param value The cjpmhgnldhm to set.
     * @return This builder for chaining.
     */
    public Builder setCjpmhgnldhm(POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      cjpmhgnldhm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EKGIKJHOPOH.LHABENFFNPL cjpmhgnldhm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCjpmhgnldhm() {
      
      cjpmhgnldhm_ = 0;
      onChanged();
      return this;
    }

    private float plkoblnpgfe_ ;
    /**
     * <code>float plkoblnpgfe = 2;</code>
     * @return The plkoblnpgfe.
     */
    @java.lang.Override
    public float getPlkoblnpgfe() {
      return plkoblnpgfe_;
    }
    /**
     * <code>float plkoblnpgfe = 2;</code>
     * @param value The plkoblnpgfe to set.
     * @return This builder for chaining.
     */
    public Builder setPlkoblnpgfe(float value) {
      
      plkoblnpgfe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float plkoblnpgfe = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlkoblnpgfe() {
      
      plkoblnpgfe_ = 0F;
      onChanged();
      return this;
    }

    private float amhibpaokkn_ ;
    /**
     * <code>float amhibpaokkn = 3;</code>
     * @return The amhibpaokkn.
     */
    @java.lang.Override
    public float getAmhibpaokkn() {
      return amhibpaokkn_;
    }
    /**
     * <code>float amhibpaokkn = 3;</code>
     * @param value The amhibpaokkn to set.
     * @return This builder for chaining.
     */
    public Builder setAmhibpaokkn(float value) {
      
      amhibpaokkn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float amhibpaokkn = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmhibpaokkn() {
      
      amhibpaokkn_ = 0F;
      onChanged();
      return this;
    }

    private float ijjjfigbipe_ ;
    /**
     * <code>float ijjjfigbipe = 4;</code>
     * @return The ijjjfigbipe.
     */
    @java.lang.Override
    public float getIjjjfigbipe() {
      return ijjjfigbipe_;
    }
    /**
     * <code>float ijjjfigbipe = 4;</code>
     * @param value The ijjjfigbipe to set.
     * @return This builder for chaining.
     */
    public Builder setIjjjfigbipe(float value) {
      
      ijjjfigbipe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float ijjjfigbipe = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIjjjfigbipe() {
      
      ijjjfigbipe_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EKGIKJHOPOH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EKGIKJHOPOH)
  private static final POGOProtos.Rpc.EKGIKJHOPOH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EKGIKJHOPOH();
  }

  public static POGOProtos.Rpc.EKGIKJHOPOH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EKGIKJHOPOH>
      PARSER = new com.google.protobuf.AbstractParser<EKGIKJHOPOH>() {
    @java.lang.Override
    public EKGIKJHOPOH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EKGIKJHOPOH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EKGIKJHOPOH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EKGIKJHOPOH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EKGIKJHOPOH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

