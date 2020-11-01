// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GFIBBIFNGPN}
 */
public  final class GFIBBIFNGPN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GFIBBIFNGPN)
    GFIBBIFNGPNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GFIBBIFNGPN.newBuilder() to construct.
  private GFIBBIFNGPN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GFIBBIFNGPN() {
    dnncldldjim_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GFIBBIFNGPN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GFIBBIFNGPN(
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

            dnncldldjim_ = rawValue;
            break;
          }
          case 21: {

            hlaemimkeom_ = input.readFloat();
            break;
          }
          case 29: {

            joikklekpmd_ = input.readFloat();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFIBBIFNGPN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFIBBIFNGPN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GFIBBIFNGPN.class, POGOProtos.Rpc.GFIBBIFNGPN.Builder.class);
  }

  /**
   * <pre>
   * ref: GFIBBIFNGPN/JMGOKDAKGBA/MIFBIHDCACC
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC}
   */
  public enum MIFBIHDCACC
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>natural_scale = 0;</code>
     */
    natural_scale(0),
    /**
     * <code>gui_scale = 1;</code>
     */
    gui_scale(1),
    /**
     * <code>battle_pokemon_scale = 2;</code>
     */
    battle_pokemon_scale(2),
    /**
     * <code>raid_boss_scale = 3;</code>
     */
    raid_boss_scale(3),
    /**
     * <code>gym_topper_scale = 4;</code>
     */
    gym_topper_scale(4),
    /**
     * <code>map_pokemon_scale = 5;</code>
     */
    map_pokemon_scale(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>natural_scale = 0;</code>
     */
    public static final int natural_scale_VALUE = 0;
    /**
     * <code>gui_scale = 1;</code>
     */
    public static final int gui_scale_VALUE = 1;
    /**
     * <code>battle_pokemon_scale = 2;</code>
     */
    public static final int battle_pokemon_scale_VALUE = 2;
    /**
     * <code>raid_boss_scale = 3;</code>
     */
    public static final int raid_boss_scale_VALUE = 3;
    /**
     * <code>gym_topper_scale = 4;</code>
     */
    public static final int gym_topper_scale_VALUE = 4;
    /**
     * <code>map_pokemon_scale = 5;</code>
     */
    public static final int map_pokemon_scale_VALUE = 5;


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
    public static MIFBIHDCACC valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MIFBIHDCACC forNumber(int value) {
      switch (value) {
        case 0: return natural_scale;
        case 1: return gui_scale;
        case 2: return battle_pokemon_scale;
        case 3: return raid_boss_scale;
        case 4: return gym_topper_scale;
        case 5: return map_pokemon_scale;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MIFBIHDCACC>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MIFBIHDCACC> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MIFBIHDCACC>() {
            public MIFBIHDCACC findValueByNumber(int number) {
              return MIFBIHDCACC.forNumber(number);
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
      return POGOProtos.Rpc.GFIBBIFNGPN.getDescriptor().getEnumTypes().get(0);
    }

    private static final MIFBIHDCACC[] VALUES = values();

    public static MIFBIHDCACC valueOf(
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

    private MIFBIHDCACC(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC)
  }

  public static final int DNNCLDLDJIM_FIELD_NUMBER = 1;
  private int dnncldldjim_;
  /**
   * <code>.POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC dnncldldjim = 1;</code>
   * @return The enum numeric value on the wire for dnncldldjim.
   */
  public int getDnncldldjimValue() {
    return dnncldldjim_;
  }
  /**
   * <code>.POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC dnncldldjim = 1;</code>
   * @return The dnncldldjim.
   */
  public POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC getDnncldldjim() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC result = POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC.valueOf(dnncldldjim_);
    return result == null ? POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC.UNRECOGNIZED : result;
  }

  public static final int HLAEMIMKEOM_FIELD_NUMBER = 2;
  private float hlaemimkeom_;
  /**
   * <code>float hlaemimkeom = 2;</code>
   * @return The hlaemimkeom.
   */
  public float getHlaemimkeom() {
    return hlaemimkeom_;
  }

  public static final int JOIKKLEKPMD_FIELD_NUMBER = 3;
  private float joikklekpmd_;
  /**
   * <code>float joikklekpmd = 3;</code>
   * @return The joikklekpmd.
   */
  public float getJoikklekpmd() {
    return joikklekpmd_;
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
    if (dnncldldjim_ != POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC.natural_scale.getNumber()) {
      output.writeEnum(1, dnncldldjim_);
    }
    if (hlaemimkeom_ != 0F) {
      output.writeFloat(2, hlaemimkeom_);
    }
    if (joikklekpmd_ != 0F) {
      output.writeFloat(3, joikklekpmd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dnncldldjim_ != POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC.natural_scale.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dnncldldjim_);
    }
    if (hlaemimkeom_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, hlaemimkeom_);
    }
    if (joikklekpmd_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, joikklekpmd_);
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
    if (!(obj instanceof POGOProtos.Rpc.GFIBBIFNGPN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GFIBBIFNGPN other = (POGOProtos.Rpc.GFIBBIFNGPN) obj;

    if (dnncldldjim_ != other.dnncldldjim_) return false;
    if (java.lang.Float.floatToIntBits(getHlaemimkeom())
        != java.lang.Float.floatToIntBits(
            other.getHlaemimkeom())) return false;
    if (java.lang.Float.floatToIntBits(getJoikklekpmd())
        != java.lang.Float.floatToIntBits(
            other.getJoikklekpmd())) return false;
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
    hash = (37 * hash) + DNNCLDLDJIM_FIELD_NUMBER;
    hash = (53 * hash) + dnncldldjim_;
    hash = (37 * hash) + HLAEMIMKEOM_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getHlaemimkeom());
    hash = (37 * hash) + JOIKKLEKPMD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getJoikklekpmd());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GFIBBIFNGPN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GFIBBIFNGPN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFIBBIFNGPN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GFIBBIFNGPN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFIBBIFNGPN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GFIBBIFNGPN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFIBBIFNGPN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GFIBBIFNGPN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFIBBIFNGPN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GFIBBIFNGPN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFIBBIFNGPN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GFIBBIFNGPN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GFIBBIFNGPN prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GFIBBIFNGPN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GFIBBIFNGPN)
      POGOProtos.Rpc.GFIBBIFNGPNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFIBBIFNGPN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFIBBIFNGPN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GFIBBIFNGPN.class, POGOProtos.Rpc.GFIBBIFNGPN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GFIBBIFNGPN.newBuilder()
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
      dnncldldjim_ = 0;

      hlaemimkeom_ = 0F;

      joikklekpmd_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GFIBBIFNGPN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GFIBBIFNGPN getDefaultInstanceForType() {
      return POGOProtos.Rpc.GFIBBIFNGPN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GFIBBIFNGPN build() {
      POGOProtos.Rpc.GFIBBIFNGPN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GFIBBIFNGPN buildPartial() {
      POGOProtos.Rpc.GFIBBIFNGPN result = new POGOProtos.Rpc.GFIBBIFNGPN(this);
      result.dnncldldjim_ = dnncldldjim_;
      result.hlaemimkeom_ = hlaemimkeom_;
      result.joikklekpmd_ = joikklekpmd_;
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
      if (other instanceof POGOProtos.Rpc.GFIBBIFNGPN) {
        return mergeFrom((POGOProtos.Rpc.GFIBBIFNGPN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GFIBBIFNGPN other) {
      if (other == POGOProtos.Rpc.GFIBBIFNGPN.getDefaultInstance()) return this;
      if (other.dnncldldjim_ != 0) {
        setDnncldldjimValue(other.getDnncldldjimValue());
      }
      if (other.getHlaemimkeom() != 0F) {
        setHlaemimkeom(other.getHlaemimkeom());
      }
      if (other.getJoikklekpmd() != 0F) {
        setJoikklekpmd(other.getJoikklekpmd());
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
      POGOProtos.Rpc.GFIBBIFNGPN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GFIBBIFNGPN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int dnncldldjim_ = 0;
    /**
     * <code>.POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC dnncldldjim = 1;</code>
     * @return The enum numeric value on the wire for dnncldldjim.
     */
    public int getDnncldldjimValue() {
      return dnncldldjim_;
    }
    /**
     * <code>.POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC dnncldldjim = 1;</code>
     * @param value The enum numeric value on the wire for dnncldldjim to set.
     * @return This builder for chaining.
     */
    public Builder setDnncldldjimValue(int value) {
      dnncldldjim_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC dnncldldjim = 1;</code>
     * @return The dnncldldjim.
     */
    public POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC getDnncldldjim() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC result = POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC.valueOf(dnncldldjim_);
      return result == null ? POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC dnncldldjim = 1;</code>
     * @param value The dnncldldjim to set.
     * @return This builder for chaining.
     */
    public Builder setDnncldldjim(POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dnncldldjim_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GFIBBIFNGPN.MIFBIHDCACC dnncldldjim = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDnncldldjim() {
      
      dnncldldjim_ = 0;
      onChanged();
      return this;
    }

    private float hlaemimkeom_ ;
    /**
     * <code>float hlaemimkeom = 2;</code>
     * @return The hlaemimkeom.
     */
    public float getHlaemimkeom() {
      return hlaemimkeom_;
    }
    /**
     * <code>float hlaemimkeom = 2;</code>
     * @param value The hlaemimkeom to set.
     * @return This builder for chaining.
     */
    public Builder setHlaemimkeom(float value) {
      
      hlaemimkeom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float hlaemimkeom = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHlaemimkeom() {
      
      hlaemimkeom_ = 0F;
      onChanged();
      return this;
    }

    private float joikklekpmd_ ;
    /**
     * <code>float joikklekpmd = 3;</code>
     * @return The joikklekpmd.
     */
    public float getJoikklekpmd() {
      return joikklekpmd_;
    }
    /**
     * <code>float joikklekpmd = 3;</code>
     * @param value The joikklekpmd to set.
     * @return This builder for chaining.
     */
    public Builder setJoikklekpmd(float value) {
      
      joikklekpmd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float joikklekpmd = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJoikklekpmd() {
      
      joikklekpmd_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GFIBBIFNGPN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GFIBBIFNGPN)
  private static final POGOProtos.Rpc.GFIBBIFNGPN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GFIBBIFNGPN();
  }

  public static POGOProtos.Rpc.GFIBBIFNGPN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GFIBBIFNGPN>
      PARSER = new com.google.protobuf.AbstractParser<GFIBBIFNGPN>() {
    @java.lang.Override
    public GFIBBIFNGPN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GFIBBIFNGPN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GFIBBIFNGPN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GFIBBIFNGPN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GFIBBIFNGPN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

