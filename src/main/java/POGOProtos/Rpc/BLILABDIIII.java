// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BLILABDIIII}
 */
public  final class BLILABDIIII extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BLILABDIIII)
    BLILABDIIIIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BLILABDIIII.newBuilder() to construct.
  private BLILABDIIII(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BLILABDIIII() {
    fiepbfhegjb_ = 0;
    booeabmclfl_ = "";
    joedeodnfoi_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BLILABDIIII();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BLILABDIIII(
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

            fiepbfhegjb_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            booeabmclfl_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            joedeodnfoi_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLILABDIIII_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLILABDIIII_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BLILABDIIII.class, POGOProtos.Rpc.BLILABDIIII.Builder.class);
  }

  /**
   * <pre>
   * ref: BLILABDIIII/LJCFDFCNKOG/CDPLELLHIDP
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP}
   */
  public enum CDPLELLHIDP
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>BGM_UNSET = 0;</code>
     */
    BGM_UNSET(0),
    /**
     * <code>BGM_EVENT = 101;</code>
     */
    BGM_EVENT(101),
    /**
     * <code>BGM_HALLOWEEN = 200;</code>
     */
    BGM_HALLOWEEN(200),
    /**
     * <code>BGM_TEAM_ROCKET_DEFAULT = 300;</code>
     */
    BGM_TEAM_ROCKET_DEFAULT(300),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>BGM_UNSET = 0;</code>
     */
    public static final int BGM_UNSET_VALUE = 0;
    /**
     * <code>BGM_EVENT = 101;</code>
     */
    public static final int BGM_EVENT_VALUE = 101;
    /**
     * <code>BGM_HALLOWEEN = 200;</code>
     */
    public static final int BGM_HALLOWEEN_VALUE = 200;
    /**
     * <code>BGM_TEAM_ROCKET_DEFAULT = 300;</code>
     */
    public static final int BGM_TEAM_ROCKET_DEFAULT_VALUE = 300;


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
    public static CDPLELLHIDP valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CDPLELLHIDP forNumber(int value) {
      switch (value) {
        case 0: return BGM_UNSET;
        case 101: return BGM_EVENT;
        case 200: return BGM_HALLOWEEN;
        case 300: return BGM_TEAM_ROCKET_DEFAULT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CDPLELLHIDP>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CDPLELLHIDP> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CDPLELLHIDP>() {
            public CDPLELLHIDP findValueByNumber(int number) {
              return CDPLELLHIDP.forNumber(number);
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
      return POGOProtos.Rpc.BLILABDIIII.getDescriptor().getEnumTypes().get(0);
    }

    private static final CDPLELLHIDP[] VALUES = values();

    public static CDPLELLHIDP valueOf(
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

    private CDPLELLHIDP(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP)
  }

  /**
   * <pre>
   * ref: BLILABDIIII/LJCFDFCNKOG/OKLGOAFABDG
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG}
   */
  public enum OKLGOAFABDG
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EFFECT_NONE = 0;</code>
     */
    EFFECT_NONE(0),
    /**
     * <code>EFFECT_CONFETTI_BASIC = 1;</code>
     */
    EFFECT_CONFETTI_BASIC(1),
    /**
     * <code>EFFECT_CONFETTI_FIRE = 2;</code>
     */
    EFFECT_CONFETTI_FIRE(2),
    /**
     * <code>EFFECT_CONFETTI_WATER = 3;</code>
     */
    EFFECT_CONFETTI_WATER(3),
    /**
     * <code>EFFECT_CONFETTI_GRASS = 4;</code>
     */
    EFFECT_CONFETTI_GRASS(4),
    /**
     * <code>EFFECT_CONFETTI_RAID_BATTLE = 5;</code>
     */
    EFFECT_CONFETTI_RAID_BATTLE(5),
    /**
     * <code>EFFECT_CONFETTI_FRIENDSHIP = 6;</code>
     */
    EFFECT_CONFETTI_FRIENDSHIP(6),
    /**
     * <code>EFFECT_CONFETTI_ROCKET = 7;</code>
     */
    EFFECT_CONFETTI_ROCKET(7),
    /**
     * <code>EFFECT_FIREWORKS_PLAIN = 8;</code>
     */
    EFFECT_FIREWORKS_PLAIN(8),
    /**
     * <code>EFFECT_CONFETTI_FLOWER = 9;</code>
     */
    EFFECT_CONFETTI_FLOWER(9),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>EFFECT_NONE = 0;</code>
     */
    public static final int EFFECT_NONE_VALUE = 0;
    /**
     * <code>EFFECT_CONFETTI_BASIC = 1;</code>
     */
    public static final int EFFECT_CONFETTI_BASIC_VALUE = 1;
    /**
     * <code>EFFECT_CONFETTI_FIRE = 2;</code>
     */
    public static final int EFFECT_CONFETTI_FIRE_VALUE = 2;
    /**
     * <code>EFFECT_CONFETTI_WATER = 3;</code>
     */
    public static final int EFFECT_CONFETTI_WATER_VALUE = 3;
    /**
     * <code>EFFECT_CONFETTI_GRASS = 4;</code>
     */
    public static final int EFFECT_CONFETTI_GRASS_VALUE = 4;
    /**
     * <code>EFFECT_CONFETTI_RAID_BATTLE = 5;</code>
     */
    public static final int EFFECT_CONFETTI_RAID_BATTLE_VALUE = 5;
    /**
     * <code>EFFECT_CONFETTI_FRIENDSHIP = 6;</code>
     */
    public static final int EFFECT_CONFETTI_FRIENDSHIP_VALUE = 6;
    /**
     * <code>EFFECT_CONFETTI_ROCKET = 7;</code>
     */
    public static final int EFFECT_CONFETTI_ROCKET_VALUE = 7;
    /**
     * <code>EFFECT_FIREWORKS_PLAIN = 8;</code>
     */
    public static final int EFFECT_FIREWORKS_PLAIN_VALUE = 8;
    /**
     * <code>EFFECT_CONFETTI_FLOWER = 9;</code>
     */
    public static final int EFFECT_CONFETTI_FLOWER_VALUE = 9;


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
    public static OKLGOAFABDG valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OKLGOAFABDG forNumber(int value) {
      switch (value) {
        case 0: return EFFECT_NONE;
        case 1: return EFFECT_CONFETTI_BASIC;
        case 2: return EFFECT_CONFETTI_FIRE;
        case 3: return EFFECT_CONFETTI_WATER;
        case 4: return EFFECT_CONFETTI_GRASS;
        case 5: return EFFECT_CONFETTI_RAID_BATTLE;
        case 6: return EFFECT_CONFETTI_FRIENDSHIP;
        case 7: return EFFECT_CONFETTI_ROCKET;
        case 8: return EFFECT_FIREWORKS_PLAIN;
        case 9: return EFFECT_CONFETTI_FLOWER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OKLGOAFABDG>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OKLGOAFABDG> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OKLGOAFABDG>() {
            public OKLGOAFABDG findValueByNumber(int number) {
              return OKLGOAFABDG.forNumber(number);
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
      return POGOProtos.Rpc.BLILABDIIII.getDescriptor().getEnumTypes().get(1);
    }

    private static final OKLGOAFABDG[] VALUES = values();

    public static OKLGOAFABDG valueOf(
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

    private OKLGOAFABDG(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG)
  }

  public static final int FIEPBFHEGJB_FIELD_NUMBER = 1;
  private int fiepbfhegjb_;
  /**
   * <code>.POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG fiepbfhegjb = 1;</code>
   * @return The enum numeric value on the wire for fiepbfhegjb.
   */
  public int getFiepbfhegjbValue() {
    return fiepbfhegjb_;
  }
  /**
   * <code>.POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG fiepbfhegjb = 1;</code>
   * @return The fiepbfhegjb.
   */
  public POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG getFiepbfhegjb() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG result = POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG.valueOf(fiepbfhegjb_);
    return result == null ? POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG.UNRECOGNIZED : result;
  }

  public static final int BOOEABMCLFL_FIELD_NUMBER = 2;
  private volatile java.lang.Object booeabmclfl_;
  /**
   * <code>string booeabmclfl = 2;</code>
   * @return The booeabmclfl.
   */
  public java.lang.String getBooeabmclfl() {
    java.lang.Object ref = booeabmclfl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      booeabmclfl_ = s;
      return s;
    }
  }
  /**
   * <code>string booeabmclfl = 2;</code>
   * @return The bytes for booeabmclfl.
   */
  public com.google.protobuf.ByteString
      getBooeabmclflBytes() {
    java.lang.Object ref = booeabmclfl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      booeabmclfl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOEDEODNFOI_FIELD_NUMBER = 3;
  private int joedeodnfoi_;
  /**
   * <code>.POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP joedeodnfoi = 3;</code>
   * @return The enum numeric value on the wire for joedeodnfoi.
   */
  public int getJoedeodnfoiValue() {
    return joedeodnfoi_;
  }
  /**
   * <code>.POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP joedeodnfoi = 3;</code>
   * @return The joedeodnfoi.
   */
  public POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP getJoedeodnfoi() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP result = POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP.valueOf(joedeodnfoi_);
    return result == null ? POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP.UNRECOGNIZED : result;
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
    if (fiepbfhegjb_ != POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG.EFFECT_NONE.getNumber()) {
      output.writeEnum(1, fiepbfhegjb_);
    }
    if (!getBooeabmclflBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, booeabmclfl_);
    }
    if (joedeodnfoi_ != POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP.BGM_UNSET.getNumber()) {
      output.writeEnum(3, joedeodnfoi_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fiepbfhegjb_ != POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG.EFFECT_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, fiepbfhegjb_);
    }
    if (!getBooeabmclflBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, booeabmclfl_);
    }
    if (joedeodnfoi_ != POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP.BGM_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, joedeodnfoi_);
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
    if (!(obj instanceof POGOProtos.Rpc.BLILABDIIII)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BLILABDIIII other = (POGOProtos.Rpc.BLILABDIIII) obj;

    if (fiepbfhegjb_ != other.fiepbfhegjb_) return false;
    if (!getBooeabmclfl()
        .equals(other.getBooeabmclfl())) return false;
    if (joedeodnfoi_ != other.joedeodnfoi_) return false;
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
    hash = (37 * hash) + FIEPBFHEGJB_FIELD_NUMBER;
    hash = (53 * hash) + fiepbfhegjb_;
    hash = (37 * hash) + BOOEABMCLFL_FIELD_NUMBER;
    hash = (53 * hash) + getBooeabmclfl().hashCode();
    hash = (37 * hash) + JOEDEODNFOI_FIELD_NUMBER;
    hash = (53 * hash) + joedeodnfoi_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BLILABDIIII parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BLILABDIIII parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLILABDIIII parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BLILABDIIII parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLILABDIIII parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BLILABDIIII parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLILABDIIII parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BLILABDIIII parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLILABDIIII parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BLILABDIIII parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BLILABDIIII parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BLILABDIIII parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BLILABDIIII prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BLILABDIIII}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BLILABDIIII)
      POGOProtos.Rpc.BLILABDIIIIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLILABDIIII_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLILABDIIII_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BLILABDIIII.class, POGOProtos.Rpc.BLILABDIIII.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BLILABDIIII.newBuilder()
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
      fiepbfhegjb_ = 0;

      booeabmclfl_ = "";

      joedeodnfoi_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BLILABDIIII_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BLILABDIIII getDefaultInstanceForType() {
      return POGOProtos.Rpc.BLILABDIIII.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BLILABDIIII build() {
      POGOProtos.Rpc.BLILABDIIII result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BLILABDIIII buildPartial() {
      POGOProtos.Rpc.BLILABDIIII result = new POGOProtos.Rpc.BLILABDIIII(this);
      result.fiepbfhegjb_ = fiepbfhegjb_;
      result.booeabmclfl_ = booeabmclfl_;
      result.joedeodnfoi_ = joedeodnfoi_;
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
      if (other instanceof POGOProtos.Rpc.BLILABDIIII) {
        return mergeFrom((POGOProtos.Rpc.BLILABDIIII)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BLILABDIIII other) {
      if (other == POGOProtos.Rpc.BLILABDIIII.getDefaultInstance()) return this;
      if (other.fiepbfhegjb_ != 0) {
        setFiepbfhegjbValue(other.getFiepbfhegjbValue());
      }
      if (!other.getBooeabmclfl().isEmpty()) {
        booeabmclfl_ = other.booeabmclfl_;
        onChanged();
      }
      if (other.joedeodnfoi_ != 0) {
        setJoedeodnfoiValue(other.getJoedeodnfoiValue());
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
      POGOProtos.Rpc.BLILABDIIII parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BLILABDIIII) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int fiepbfhegjb_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG fiepbfhegjb = 1;</code>
     * @return The enum numeric value on the wire for fiepbfhegjb.
     */
    public int getFiepbfhegjbValue() {
      return fiepbfhegjb_;
    }
    /**
     * <code>.POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG fiepbfhegjb = 1;</code>
     * @param value The enum numeric value on the wire for fiepbfhegjb to set.
     * @return This builder for chaining.
     */
    public Builder setFiepbfhegjbValue(int value) {
      fiepbfhegjb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG fiepbfhegjb = 1;</code>
     * @return The fiepbfhegjb.
     */
    public POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG getFiepbfhegjb() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG result = POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG.valueOf(fiepbfhegjb_);
      return result == null ? POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG fiepbfhegjb = 1;</code>
     * @param value The fiepbfhegjb to set.
     * @return This builder for chaining.
     */
    public Builder setFiepbfhegjb(POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      fiepbfhegjb_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BLILABDIIII.OKLGOAFABDG fiepbfhegjb = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFiepbfhegjb() {
      
      fiepbfhegjb_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object booeabmclfl_ = "";
    /**
     * <code>string booeabmclfl = 2;</code>
     * @return The booeabmclfl.
     */
    public java.lang.String getBooeabmclfl() {
      java.lang.Object ref = booeabmclfl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        booeabmclfl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string booeabmclfl = 2;</code>
     * @return The bytes for booeabmclfl.
     */
    public com.google.protobuf.ByteString
        getBooeabmclflBytes() {
      java.lang.Object ref = booeabmclfl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        booeabmclfl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string booeabmclfl = 2;</code>
     * @param value The booeabmclfl to set.
     * @return This builder for chaining.
     */
    public Builder setBooeabmclfl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      booeabmclfl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string booeabmclfl = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBooeabmclfl() {
      
      booeabmclfl_ = getDefaultInstance().getBooeabmclfl();
      onChanged();
      return this;
    }
    /**
     * <code>string booeabmclfl = 2;</code>
     * @param value The bytes for booeabmclfl to set.
     * @return This builder for chaining.
     */
    public Builder setBooeabmclflBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      booeabmclfl_ = value;
      onChanged();
      return this;
    }

    private int joedeodnfoi_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP joedeodnfoi = 3;</code>
     * @return The enum numeric value on the wire for joedeodnfoi.
     */
    public int getJoedeodnfoiValue() {
      return joedeodnfoi_;
    }
    /**
     * <code>.POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP joedeodnfoi = 3;</code>
     * @param value The enum numeric value on the wire for joedeodnfoi to set.
     * @return This builder for chaining.
     */
    public Builder setJoedeodnfoiValue(int value) {
      joedeodnfoi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP joedeodnfoi = 3;</code>
     * @return The joedeodnfoi.
     */
    public POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP getJoedeodnfoi() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP result = POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP.valueOf(joedeodnfoi_);
      return result == null ? POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP joedeodnfoi = 3;</code>
     * @param value The joedeodnfoi to set.
     * @return This builder for chaining.
     */
    public Builder setJoedeodnfoi(POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      joedeodnfoi_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BLILABDIIII.CDPLELLHIDP joedeodnfoi = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJoedeodnfoi() {
      
      joedeodnfoi_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BLILABDIIII)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BLILABDIIII)
  private static final POGOProtos.Rpc.BLILABDIIII DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BLILABDIIII();
  }

  public static POGOProtos.Rpc.BLILABDIIII getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BLILABDIIII>
      PARSER = new com.google.protobuf.AbstractParser<BLILABDIIII>() {
    @java.lang.Override
    public BLILABDIIII parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BLILABDIIII(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BLILABDIIII> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BLILABDIIII> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BLILABDIIII getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

