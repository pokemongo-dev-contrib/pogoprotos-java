// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HFDHMFIAPIN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HFDHMFIAPIN}
 */
public final class HFDHMFIAPIN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HFDHMFIAPIN)
    HFDHMFIAPINOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HFDHMFIAPIN.newBuilder() to construct.
  private HFDHMFIAPIN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HFDHMFIAPIN() {
    magjbjmclno_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HFDHMFIAPIN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HFDHMFIAPIN(
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
          case 18: {
            POGOProtos.Rpc.BGOABGLKOGN.Builder subBuilder = null;
            if (fdgffaembpm_ != null) {
              subBuilder = fdgffaembpm_.toBuilder();
            }
            fdgffaembpm_ = input.readMessage(POGOProtos.Rpc.BGOABGLKOGN.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fdgffaembpm_);
              fdgffaembpm_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            blhedjobkkm_ = input.readInt32();
            break;
          }
          case 32: {

            moddeimeipg_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFDHMFIAPIN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFDHMFIAPIN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HFDHMFIAPIN.class, POGOProtos.Rpc.HFDHMFIAPIN.Builder.class);
  }

  /**
   * <pre>
   * ref: HFDHMFIAPIN/NFEGFMGFIFP/NBJBJANHCNA
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA}
   */
  public enum NBJBJANHCNA
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
     * <code>FAILED_POKEMON_MISSING = 2;</code>
     */
    FAILED_POKEMON_MISSING(2),
    /**
     * <code>FAILED_INSUFFICIENT_RESOURCES = 3;</code>
     */
    FAILED_INSUFFICIENT_RESOURCES(3),
    /**
     * <code>FAILED_POKEMON_CANNOT_EVOLVE = 4;</code>
     */
    FAILED_POKEMON_CANNOT_EVOLVE(4),
    /**
     * <code>FAILED_POKEMON_IS_DEPLOYED = 5;</code>
     */
    FAILED_POKEMON_IS_DEPLOYED(5),
    /**
     * <code>FAILED_INVALID_ITEM_REQUIREMENT = 6;</code>
     */
    FAILED_INVALID_ITEM_REQUIREMENT(6),
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
     * <code>FAILED_POKEMON_MISSING = 2;</code>
     */
    public static final int FAILED_POKEMON_MISSING_VALUE = 2;
    /**
     * <code>FAILED_INSUFFICIENT_RESOURCES = 3;</code>
     */
    public static final int FAILED_INSUFFICIENT_RESOURCES_VALUE = 3;
    /**
     * <code>FAILED_POKEMON_CANNOT_EVOLVE = 4;</code>
     */
    public static final int FAILED_POKEMON_CANNOT_EVOLVE_VALUE = 4;
    /**
     * <code>FAILED_POKEMON_IS_DEPLOYED = 5;</code>
     */
    public static final int FAILED_POKEMON_IS_DEPLOYED_VALUE = 5;
    /**
     * <code>FAILED_INVALID_ITEM_REQUIREMENT = 6;</code>
     */
    public static final int FAILED_INVALID_ITEM_REQUIREMENT_VALUE = 6;


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
    public static NBJBJANHCNA valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NBJBJANHCNA forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return FAILED_POKEMON_MISSING;
        case 3: return FAILED_INSUFFICIENT_RESOURCES;
        case 4: return FAILED_POKEMON_CANNOT_EVOLVE;
        case 5: return FAILED_POKEMON_IS_DEPLOYED;
        case 6: return FAILED_INVALID_ITEM_REQUIREMENT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NBJBJANHCNA>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NBJBJANHCNA> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NBJBJANHCNA>() {
            public NBJBJANHCNA findValueByNumber(int number) {
              return NBJBJANHCNA.forNumber(number);
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
      return POGOProtos.Rpc.HFDHMFIAPIN.getDescriptor().getEnumTypes().get(0);
    }

    private static final NBJBJANHCNA[] VALUES = values();

    public static NBJBJANHCNA valueOf(
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

    private NBJBJANHCNA(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA)
  }

  public static final int MAGJBJMCLNO_FIELD_NUMBER = 1;
  private int magjbjmclno_;
  /**
   * <code>.POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA magjbjmclno = 1;</code>
   * @return The enum numeric value on the wire for magjbjmclno.
   */
  @java.lang.Override public int getMagjbjmclnoValue() {
    return magjbjmclno_;
  }
  /**
   * <code>.POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA magjbjmclno = 1;</code>
   * @return The magjbjmclno.
   */
  @java.lang.Override public POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA getMagjbjmclno() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA result = POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA.valueOf(magjbjmclno_);
    return result == null ? POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA.UNRECOGNIZED : result;
  }

  public static final int FDGFFAEMBPM_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm_;
  /**
   * <code>.POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm = 2;</code>
   * @return Whether the fdgffaembpm field is set.
   */
  @java.lang.Override
  public boolean hasFdgffaembpm() {
    return fdgffaembpm_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm = 2;</code>
   * @return The fdgffaembpm.
   */
  @java.lang.Override
  public POGOProtos.Rpc.BGOABGLKOGN getFdgffaembpm() {
    return fdgffaembpm_ == null ? POGOProtos.Rpc.BGOABGLKOGN.getDefaultInstance() : fdgffaembpm_;
  }
  /**
   * <code>.POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BGOABGLKOGNOrBuilder getFdgffaembpmOrBuilder() {
    return getFdgffaembpm();
  }

  public static final int BLHEDJOBKKM_FIELD_NUMBER = 3;
  private int blhedjobkkm_;
  /**
   * <code>int32 blhedjobkkm = 3;</code>
   * @return The blhedjobkkm.
   */
  @java.lang.Override
  public int getBlhedjobkkm() {
    return blhedjobkkm_;
  }

  public static final int MODDEIMEIPG_FIELD_NUMBER = 4;
  private int moddeimeipg_;
  /**
   * <code>int32 moddeimeipg = 4;</code>
   * @return The moddeimeipg.
   */
  @java.lang.Override
  public int getModdeimeipg() {
    return moddeimeipg_;
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
    if (magjbjmclno_ != POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA.UNSET.getNumber()) {
      output.writeEnum(1, magjbjmclno_);
    }
    if (fdgffaembpm_ != null) {
      output.writeMessage(2, getFdgffaembpm());
    }
    if (blhedjobkkm_ != 0) {
      output.writeInt32(3, blhedjobkkm_);
    }
    if (moddeimeipg_ != 0) {
      output.writeInt32(4, moddeimeipg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (magjbjmclno_ != POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, magjbjmclno_);
    }
    if (fdgffaembpm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFdgffaembpm());
    }
    if (blhedjobkkm_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, blhedjobkkm_);
    }
    if (moddeimeipg_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, moddeimeipg_);
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
    if (!(obj instanceof POGOProtos.Rpc.HFDHMFIAPIN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HFDHMFIAPIN other = (POGOProtos.Rpc.HFDHMFIAPIN) obj;

    if (magjbjmclno_ != other.magjbjmclno_) return false;
    if (hasFdgffaembpm() != other.hasFdgffaembpm()) return false;
    if (hasFdgffaembpm()) {
      if (!getFdgffaembpm()
          .equals(other.getFdgffaembpm())) return false;
    }
    if (getBlhedjobkkm()
        != other.getBlhedjobkkm()) return false;
    if (getModdeimeipg()
        != other.getModdeimeipg()) return false;
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
    if (hasFdgffaembpm()) {
      hash = (37 * hash) + FDGFFAEMBPM_FIELD_NUMBER;
      hash = (53 * hash) + getFdgffaembpm().hashCode();
    }
    hash = (37 * hash) + BLHEDJOBKKM_FIELD_NUMBER;
    hash = (53 * hash) + getBlhedjobkkm();
    hash = (37 * hash) + MODDEIMEIPG_FIELD_NUMBER;
    hash = (53 * hash) + getModdeimeipg();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HFDHMFIAPIN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HFDHMFIAPIN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFDHMFIAPIN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HFDHMFIAPIN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFDHMFIAPIN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HFDHMFIAPIN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFDHMFIAPIN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HFDHMFIAPIN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFDHMFIAPIN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HFDHMFIAPIN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HFDHMFIAPIN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HFDHMFIAPIN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HFDHMFIAPIN prototype) {
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
   * ref: HFDHMFIAPIN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HFDHMFIAPIN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HFDHMFIAPIN)
      POGOProtos.Rpc.HFDHMFIAPINOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFDHMFIAPIN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFDHMFIAPIN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HFDHMFIAPIN.class, POGOProtos.Rpc.HFDHMFIAPIN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HFDHMFIAPIN.newBuilder()
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

      if (fdgffaembpmBuilder_ == null) {
        fdgffaembpm_ = null;
      } else {
        fdgffaembpm_ = null;
        fdgffaembpmBuilder_ = null;
      }
      blhedjobkkm_ = 0;

      moddeimeipg_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HFDHMFIAPIN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HFDHMFIAPIN getDefaultInstanceForType() {
      return POGOProtos.Rpc.HFDHMFIAPIN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HFDHMFIAPIN build() {
      POGOProtos.Rpc.HFDHMFIAPIN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HFDHMFIAPIN buildPartial() {
      POGOProtos.Rpc.HFDHMFIAPIN result = new POGOProtos.Rpc.HFDHMFIAPIN(this);
      result.magjbjmclno_ = magjbjmclno_;
      if (fdgffaembpmBuilder_ == null) {
        result.fdgffaembpm_ = fdgffaembpm_;
      } else {
        result.fdgffaembpm_ = fdgffaembpmBuilder_.build();
      }
      result.blhedjobkkm_ = blhedjobkkm_;
      result.moddeimeipg_ = moddeimeipg_;
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
      if (other instanceof POGOProtos.Rpc.HFDHMFIAPIN) {
        return mergeFrom((POGOProtos.Rpc.HFDHMFIAPIN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HFDHMFIAPIN other) {
      if (other == POGOProtos.Rpc.HFDHMFIAPIN.getDefaultInstance()) return this;
      if (other.magjbjmclno_ != 0) {
        setMagjbjmclnoValue(other.getMagjbjmclnoValue());
      }
      if (other.hasFdgffaembpm()) {
        mergeFdgffaembpm(other.getFdgffaembpm());
      }
      if (other.getBlhedjobkkm() != 0) {
        setBlhedjobkkm(other.getBlhedjobkkm());
      }
      if (other.getModdeimeipg() != 0) {
        setModdeimeipg(other.getModdeimeipg());
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
      POGOProtos.Rpc.HFDHMFIAPIN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HFDHMFIAPIN) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA magjbjmclno = 1;</code>
     * @return The enum numeric value on the wire for magjbjmclno.
     */
    @java.lang.Override public int getMagjbjmclnoValue() {
      return magjbjmclno_;
    }
    /**
     * <code>.POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA magjbjmclno = 1;</code>
     * @param value The enum numeric value on the wire for magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclnoValue(int value) {
      
      magjbjmclno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA magjbjmclno = 1;</code>
     * @return The magjbjmclno.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA getMagjbjmclno() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA result = POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA.valueOf(magjbjmclno_);
      return result == null ? POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA magjbjmclno = 1;</code>
     * @param value The magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclno(POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      magjbjmclno_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HFDHMFIAPIN.NBJBJANHCNA magjbjmclno = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMagjbjmclno() {
      
      magjbjmclno_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BGOABGLKOGN, POGOProtos.Rpc.BGOABGLKOGN.Builder, POGOProtos.Rpc.BGOABGLKOGNOrBuilder> fdgffaembpmBuilder_;
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm = 2;</code>
     * @return Whether the fdgffaembpm field is set.
     */
    public boolean hasFdgffaembpm() {
      return fdgffaembpmBuilder_ != null || fdgffaembpm_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm = 2;</code>
     * @return The fdgffaembpm.
     */
    public POGOProtos.Rpc.BGOABGLKOGN getFdgffaembpm() {
      if (fdgffaembpmBuilder_ == null) {
        return fdgffaembpm_ == null ? POGOProtos.Rpc.BGOABGLKOGN.getDefaultInstance() : fdgffaembpm_;
      } else {
        return fdgffaembpmBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm = 2;</code>
     */
    public Builder setFdgffaembpm(POGOProtos.Rpc.BGOABGLKOGN value) {
      if (fdgffaembpmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fdgffaembpm_ = value;
        onChanged();
      } else {
        fdgffaembpmBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm = 2;</code>
     */
    public Builder setFdgffaembpm(
        POGOProtos.Rpc.BGOABGLKOGN.Builder builderForValue) {
      if (fdgffaembpmBuilder_ == null) {
        fdgffaembpm_ = builderForValue.build();
        onChanged();
      } else {
        fdgffaembpmBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm = 2;</code>
     */
    public Builder mergeFdgffaembpm(POGOProtos.Rpc.BGOABGLKOGN value) {
      if (fdgffaembpmBuilder_ == null) {
        if (fdgffaembpm_ != null) {
          fdgffaembpm_ =
            POGOProtos.Rpc.BGOABGLKOGN.newBuilder(fdgffaembpm_).mergeFrom(value).buildPartial();
        } else {
          fdgffaembpm_ = value;
        }
        onChanged();
      } else {
        fdgffaembpmBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm = 2;</code>
     */
    public Builder clearFdgffaembpm() {
      if (fdgffaembpmBuilder_ == null) {
        fdgffaembpm_ = null;
        onChanged();
      } else {
        fdgffaembpm_ = null;
        fdgffaembpmBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm = 2;</code>
     */
    public POGOProtos.Rpc.BGOABGLKOGN.Builder getFdgffaembpmBuilder() {
      
      onChanged();
      return getFdgffaembpmFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm = 2;</code>
     */
    public POGOProtos.Rpc.BGOABGLKOGNOrBuilder getFdgffaembpmOrBuilder() {
      if (fdgffaembpmBuilder_ != null) {
        return fdgffaembpmBuilder_.getMessageOrBuilder();
      } else {
        return fdgffaembpm_ == null ?
            POGOProtos.Rpc.BGOABGLKOGN.getDefaultInstance() : fdgffaembpm_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BGOABGLKOGN fdgffaembpm = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BGOABGLKOGN, POGOProtos.Rpc.BGOABGLKOGN.Builder, POGOProtos.Rpc.BGOABGLKOGNOrBuilder> 
        getFdgffaembpmFieldBuilder() {
      if (fdgffaembpmBuilder_ == null) {
        fdgffaembpmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.BGOABGLKOGN, POGOProtos.Rpc.BGOABGLKOGN.Builder, POGOProtos.Rpc.BGOABGLKOGNOrBuilder>(
                getFdgffaembpm(),
                getParentForChildren(),
                isClean());
        fdgffaembpm_ = null;
      }
      return fdgffaembpmBuilder_;
    }

    private int blhedjobkkm_ ;
    /**
     * <code>int32 blhedjobkkm = 3;</code>
     * @return The blhedjobkkm.
     */
    @java.lang.Override
    public int getBlhedjobkkm() {
      return blhedjobkkm_;
    }
    /**
     * <code>int32 blhedjobkkm = 3;</code>
     * @param value The blhedjobkkm to set.
     * @return This builder for chaining.
     */
    public Builder setBlhedjobkkm(int value) {
      
      blhedjobkkm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 blhedjobkkm = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlhedjobkkm() {
      
      blhedjobkkm_ = 0;
      onChanged();
      return this;
    }

    private int moddeimeipg_ ;
    /**
     * <code>int32 moddeimeipg = 4;</code>
     * @return The moddeimeipg.
     */
    @java.lang.Override
    public int getModdeimeipg() {
      return moddeimeipg_;
    }
    /**
     * <code>int32 moddeimeipg = 4;</code>
     * @param value The moddeimeipg to set.
     * @return This builder for chaining.
     */
    public Builder setModdeimeipg(int value) {
      
      moddeimeipg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 moddeimeipg = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearModdeimeipg() {
      
      moddeimeipg_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HFDHMFIAPIN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HFDHMFIAPIN)
  private static final POGOProtos.Rpc.HFDHMFIAPIN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HFDHMFIAPIN();
  }

  public static POGOProtos.Rpc.HFDHMFIAPIN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HFDHMFIAPIN>
      PARSER = new com.google.protobuf.AbstractParser<HFDHMFIAPIN>() {
    @java.lang.Override
    public HFDHMFIAPIN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HFDHMFIAPIN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HFDHMFIAPIN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HFDHMFIAPIN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HFDHMFIAPIN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

