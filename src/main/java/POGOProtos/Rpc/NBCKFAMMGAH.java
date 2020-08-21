// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NBCKFAMMGAH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NBCKFAMMGAH}
 */
public final class NBCKFAMMGAH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NBCKFAMMGAH)
    NBCKFAMMGAHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NBCKFAMMGAH.newBuilder() to construct.
  private NBCKFAMMGAH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NBCKFAMMGAH() {
    lcajjpmoafe_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NBCKFAMMGAH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NBCKFAMMGAH(
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

            lcajjpmoafe_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.AOCEGMGFGMM.Builder subBuilder = null;
            if (difaoifnand_ != null) {
              subBuilder = difaoifnand_.toBuilder();
            }
            difaoifnand_ = input.readMessage(POGOProtos.Rpc.AOCEGMGFGMM.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(difaoifnand_);
              difaoifnand_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            POGOProtos.Rpc.NJDBDKOANFO.Builder subBuilder = null;
            if (fcpaglpidlk_ != null) {
              subBuilder = fcpaglpidlk_.toBuilder();
            }
            fcpaglpidlk_ = input.readMessage(POGOProtos.Rpc.NJDBDKOANFO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fcpaglpidlk_);
              fcpaglpidlk_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            gpnniccghji_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NBCKFAMMGAH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NBCKFAMMGAH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NBCKFAMMGAH.class, POGOProtos.Rpc.NBCKFAMMGAH.Builder.class);
  }

  /**
   * <pre>
   * ref: NBCKFAMMGAH/JFLMFELHFIJ/MOODCHJBKEO
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO}
   */
  public enum MOODCHJBKEO
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NO_RESULT_SET = 0;</code>
     */
    NO_RESULT_SET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>ERROR_ALREADY_HAS_POKEMON_ON_FORT = 2;</code>
     */
    ERROR_ALREADY_HAS_POKEMON_ON_FORT(2),
    /**
     * <code>ERROR_OPPOSING_TEAM_OWNS_FORT = 3;</code>
     */
    ERROR_OPPOSING_TEAM_OWNS_FORT(3),
    /**
     * <code>ERROR_FORT_IS_FULL = 4;</code>
     */
    ERROR_FORT_IS_FULL(4),
    /**
     * <code>ERROR_NOT_IN_RANGE = 5;</code>
     */
    ERROR_NOT_IN_RANGE(5),
    /**
     * <code>ERROR_PLAYER_HAS_NO_TEAM = 6;</code>
     */
    ERROR_PLAYER_HAS_NO_TEAM(6),
    /**
     * <code>ERROR_POKEMON_NOT_FULL_HP = 7;</code>
     */
    ERROR_POKEMON_NOT_FULL_HP(7),
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 8;</code>
     */
    ERROR_PLAYER_BELOW_MINIMUM_LEVEL(8),
    /**
     * <code>ERROR_POKEMON_IS_BUDDY = 9;</code>
     */
    ERROR_POKEMON_IS_BUDDY(9),
    /**
     * <code>ERROR_FORT_DEPLOY_LOCKOUT = 10;</code>
     */
    ERROR_FORT_DEPLOY_LOCKOUT(10),
    /**
     * <code>ERROR_PLAYER_HAS_NO_NICKNAME = 11;</code>
     */
    ERROR_PLAYER_HAS_NO_NICKNAME(11),
    /**
     * <code>ERROR_POI_INACCESSIBLE = 12;</code>
     */
    ERROR_POI_INACCESSIBLE(12),
    /**
     * <code>ERROR_NOT_A_POKEMON = 13;</code>
     */
    ERROR_NOT_A_POKEMON(13),
    /**
     * <code>ERROR_TOO_MANY_OF_SAME_KIND = 14;</code>
     */
    ERROR_TOO_MANY_OF_SAME_KIND(14),
    /**
     * <code>ERROR_TOO_MANY_DEPLOYED = 15;</code>
     */
    ERROR_TOO_MANY_DEPLOYED(15),
    /**
     * <code>ERROR_TEAM_DEPLOY_LOCKOUT = 16;</code>
     */
    ERROR_TEAM_DEPLOY_LOCKOUT(16),
    /**
     * <code>ERROR_LEGENDARY_POKEMON = 17;</code>
     */
    ERROR_LEGENDARY_POKEMON(17),
    /**
     * <code>ERROR_INVALID_POKEMON = 18;</code>
     */
    ERROR_INVALID_POKEMON(18),
    /**
     * <code>ERROR_RAID_ACTIVE = 19;</code>
     */
    ERROR_RAID_ACTIVE(19),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NO_RESULT_SET = 0;</code>
     */
    public static final int NO_RESULT_SET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>ERROR_ALREADY_HAS_POKEMON_ON_FORT = 2;</code>
     */
    public static final int ERROR_ALREADY_HAS_POKEMON_ON_FORT_VALUE = 2;
    /**
     * <code>ERROR_OPPOSING_TEAM_OWNS_FORT = 3;</code>
     */
    public static final int ERROR_OPPOSING_TEAM_OWNS_FORT_VALUE = 3;
    /**
     * <code>ERROR_FORT_IS_FULL = 4;</code>
     */
    public static final int ERROR_FORT_IS_FULL_VALUE = 4;
    /**
     * <code>ERROR_NOT_IN_RANGE = 5;</code>
     */
    public static final int ERROR_NOT_IN_RANGE_VALUE = 5;
    /**
     * <code>ERROR_PLAYER_HAS_NO_TEAM = 6;</code>
     */
    public static final int ERROR_PLAYER_HAS_NO_TEAM_VALUE = 6;
    /**
     * <code>ERROR_POKEMON_NOT_FULL_HP = 7;</code>
     */
    public static final int ERROR_POKEMON_NOT_FULL_HP_VALUE = 7;
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 8;</code>
     */
    public static final int ERROR_PLAYER_BELOW_MINIMUM_LEVEL_VALUE = 8;
    /**
     * <code>ERROR_POKEMON_IS_BUDDY = 9;</code>
     */
    public static final int ERROR_POKEMON_IS_BUDDY_VALUE = 9;
    /**
     * <code>ERROR_FORT_DEPLOY_LOCKOUT = 10;</code>
     */
    public static final int ERROR_FORT_DEPLOY_LOCKOUT_VALUE = 10;
    /**
     * <code>ERROR_PLAYER_HAS_NO_NICKNAME = 11;</code>
     */
    public static final int ERROR_PLAYER_HAS_NO_NICKNAME_VALUE = 11;
    /**
     * <code>ERROR_POI_INACCESSIBLE = 12;</code>
     */
    public static final int ERROR_POI_INACCESSIBLE_VALUE = 12;
    /**
     * <code>ERROR_NOT_A_POKEMON = 13;</code>
     */
    public static final int ERROR_NOT_A_POKEMON_VALUE = 13;
    /**
     * <code>ERROR_TOO_MANY_OF_SAME_KIND = 14;</code>
     */
    public static final int ERROR_TOO_MANY_OF_SAME_KIND_VALUE = 14;
    /**
     * <code>ERROR_TOO_MANY_DEPLOYED = 15;</code>
     */
    public static final int ERROR_TOO_MANY_DEPLOYED_VALUE = 15;
    /**
     * <code>ERROR_TEAM_DEPLOY_LOCKOUT = 16;</code>
     */
    public static final int ERROR_TEAM_DEPLOY_LOCKOUT_VALUE = 16;
    /**
     * <code>ERROR_LEGENDARY_POKEMON = 17;</code>
     */
    public static final int ERROR_LEGENDARY_POKEMON_VALUE = 17;
    /**
     * <code>ERROR_INVALID_POKEMON = 18;</code>
     */
    public static final int ERROR_INVALID_POKEMON_VALUE = 18;
    /**
     * <code>ERROR_RAID_ACTIVE = 19;</code>
     */
    public static final int ERROR_RAID_ACTIVE_VALUE = 19;


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
    public static MOODCHJBKEO valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MOODCHJBKEO forNumber(int value) {
      switch (value) {
        case 0: return NO_RESULT_SET;
        case 1: return SUCCESS;
        case 2: return ERROR_ALREADY_HAS_POKEMON_ON_FORT;
        case 3: return ERROR_OPPOSING_TEAM_OWNS_FORT;
        case 4: return ERROR_FORT_IS_FULL;
        case 5: return ERROR_NOT_IN_RANGE;
        case 6: return ERROR_PLAYER_HAS_NO_TEAM;
        case 7: return ERROR_POKEMON_NOT_FULL_HP;
        case 8: return ERROR_PLAYER_BELOW_MINIMUM_LEVEL;
        case 9: return ERROR_POKEMON_IS_BUDDY;
        case 10: return ERROR_FORT_DEPLOY_LOCKOUT;
        case 11: return ERROR_PLAYER_HAS_NO_NICKNAME;
        case 12: return ERROR_POI_INACCESSIBLE;
        case 13: return ERROR_NOT_A_POKEMON;
        case 14: return ERROR_TOO_MANY_OF_SAME_KIND;
        case 15: return ERROR_TOO_MANY_DEPLOYED;
        case 16: return ERROR_TEAM_DEPLOY_LOCKOUT;
        case 17: return ERROR_LEGENDARY_POKEMON;
        case 18: return ERROR_INVALID_POKEMON;
        case 19: return ERROR_RAID_ACTIVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MOODCHJBKEO>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MOODCHJBKEO> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MOODCHJBKEO>() {
            public MOODCHJBKEO findValueByNumber(int number) {
              return MOODCHJBKEO.forNumber(number);
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
      return POGOProtos.Rpc.NBCKFAMMGAH.getDescriptor().getEnumTypes().get(0);
    }

    private static final MOODCHJBKEO[] VALUES = values();

    public static MOODCHJBKEO valueOf(
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

    private MOODCHJBKEO(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO)
  }

  public static final int LCAJJPMOAFE_FIELD_NUMBER = 1;
  private int lcajjpmoafe_;
  /**
   * <code>.POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO lcajjpmoafe = 1;</code>
   * @return The enum numeric value on the wire for lcajjpmoafe.
   */
  @java.lang.Override public int getLcajjpmoafeValue() {
    return lcajjpmoafe_;
  }
  /**
   * <code>.POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO lcajjpmoafe = 1;</code>
   * @return The lcajjpmoafe.
   */
  @java.lang.Override public POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO getLcajjpmoafe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO result = POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO.valueOf(lcajjpmoafe_);
    return result == null ? POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO.UNRECOGNIZED : result;
  }

  public static final int DIFAOIFNAND_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.AOCEGMGFGMM difaoifnand_;
  /**
   * <code>.POGOProtos.Rpc.AOCEGMGFGMM difaoifnand = 2;</code>
   * @return Whether the difaoifnand field is set.
   */
  @java.lang.Override
  public boolean hasDifaoifnand() {
    return difaoifnand_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.AOCEGMGFGMM difaoifnand = 2;</code>
   * @return The difaoifnand.
   */
  @java.lang.Override
  public POGOProtos.Rpc.AOCEGMGFGMM getDifaoifnand() {
    return difaoifnand_ == null ? POGOProtos.Rpc.AOCEGMGFGMM.getDefaultInstance() : difaoifnand_;
  }
  /**
   * <code>.POGOProtos.Rpc.AOCEGMGFGMM difaoifnand = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.AOCEGMGFGMMOrBuilder getDifaoifnandOrBuilder() {
    return getDifaoifnand();
  }

  public static final int FCPAGLPIDLK_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk_;
  /**
   * <code>.POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk = 3;</code>
   * @return Whether the fcpaglpidlk field is set.
   */
  @java.lang.Override
  public boolean hasFcpaglpidlk() {
    return fcpaglpidlk_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk = 3;</code>
   * @return The fcpaglpidlk.
   */
  @java.lang.Override
  public POGOProtos.Rpc.NJDBDKOANFO getFcpaglpidlk() {
    return fcpaglpidlk_ == null ? POGOProtos.Rpc.NJDBDKOANFO.getDefaultInstance() : fcpaglpidlk_;
  }
  /**
   * <code>.POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.NJDBDKOANFOOrBuilder getFcpaglpidlkOrBuilder() {
    return getFcpaglpidlk();
  }

  public static final int GPNNICCGHJI_FIELD_NUMBER = 4;
  private long gpnniccghji_;
  /**
   * <code>int64 gpnniccghji = 4;</code>
   * @return The gpnniccghji.
   */
  @java.lang.Override
  public long getGpnniccghji() {
    return gpnniccghji_;
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
    if (lcajjpmoafe_ != POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO.NO_RESULT_SET.getNumber()) {
      output.writeEnum(1, lcajjpmoafe_);
    }
    if (difaoifnand_ != null) {
      output.writeMessage(2, getDifaoifnand());
    }
    if (fcpaglpidlk_ != null) {
      output.writeMessage(3, getFcpaglpidlk());
    }
    if (gpnniccghji_ != 0L) {
      output.writeInt64(4, gpnniccghji_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lcajjpmoafe_ != POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO.NO_RESULT_SET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lcajjpmoafe_);
    }
    if (difaoifnand_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDifaoifnand());
    }
    if (fcpaglpidlk_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFcpaglpidlk());
    }
    if (gpnniccghji_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, gpnniccghji_);
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
    if (!(obj instanceof POGOProtos.Rpc.NBCKFAMMGAH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NBCKFAMMGAH other = (POGOProtos.Rpc.NBCKFAMMGAH) obj;

    if (lcajjpmoafe_ != other.lcajjpmoafe_) return false;
    if (hasDifaoifnand() != other.hasDifaoifnand()) return false;
    if (hasDifaoifnand()) {
      if (!getDifaoifnand()
          .equals(other.getDifaoifnand())) return false;
    }
    if (hasFcpaglpidlk() != other.hasFcpaglpidlk()) return false;
    if (hasFcpaglpidlk()) {
      if (!getFcpaglpidlk()
          .equals(other.getFcpaglpidlk())) return false;
    }
    if (getGpnniccghji()
        != other.getGpnniccghji()) return false;
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
    hash = (37 * hash) + LCAJJPMOAFE_FIELD_NUMBER;
    hash = (53 * hash) + lcajjpmoafe_;
    if (hasDifaoifnand()) {
      hash = (37 * hash) + DIFAOIFNAND_FIELD_NUMBER;
      hash = (53 * hash) + getDifaoifnand().hashCode();
    }
    if (hasFcpaglpidlk()) {
      hash = (37 * hash) + FCPAGLPIDLK_FIELD_NUMBER;
      hash = (53 * hash) + getFcpaglpidlk().hashCode();
    }
    hash = (37 * hash) + GPNNICCGHJI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGpnniccghji());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NBCKFAMMGAH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NBCKFAMMGAH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NBCKFAMMGAH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NBCKFAMMGAH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NBCKFAMMGAH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NBCKFAMMGAH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NBCKFAMMGAH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NBCKFAMMGAH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NBCKFAMMGAH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NBCKFAMMGAH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NBCKFAMMGAH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NBCKFAMMGAH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NBCKFAMMGAH prototype) {
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
   * ref: NBCKFAMMGAH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NBCKFAMMGAH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NBCKFAMMGAH)
      POGOProtos.Rpc.NBCKFAMMGAHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NBCKFAMMGAH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NBCKFAMMGAH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NBCKFAMMGAH.class, POGOProtos.Rpc.NBCKFAMMGAH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NBCKFAMMGAH.newBuilder()
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
      lcajjpmoafe_ = 0;

      if (difaoifnandBuilder_ == null) {
        difaoifnand_ = null;
      } else {
        difaoifnand_ = null;
        difaoifnandBuilder_ = null;
      }
      if (fcpaglpidlkBuilder_ == null) {
        fcpaglpidlk_ = null;
      } else {
        fcpaglpidlk_ = null;
        fcpaglpidlkBuilder_ = null;
      }
      gpnniccghji_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NBCKFAMMGAH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NBCKFAMMGAH getDefaultInstanceForType() {
      return POGOProtos.Rpc.NBCKFAMMGAH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NBCKFAMMGAH build() {
      POGOProtos.Rpc.NBCKFAMMGAH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NBCKFAMMGAH buildPartial() {
      POGOProtos.Rpc.NBCKFAMMGAH result = new POGOProtos.Rpc.NBCKFAMMGAH(this);
      result.lcajjpmoafe_ = lcajjpmoafe_;
      if (difaoifnandBuilder_ == null) {
        result.difaoifnand_ = difaoifnand_;
      } else {
        result.difaoifnand_ = difaoifnandBuilder_.build();
      }
      if (fcpaglpidlkBuilder_ == null) {
        result.fcpaglpidlk_ = fcpaglpidlk_;
      } else {
        result.fcpaglpidlk_ = fcpaglpidlkBuilder_.build();
      }
      result.gpnniccghji_ = gpnniccghji_;
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
      if (other instanceof POGOProtos.Rpc.NBCKFAMMGAH) {
        return mergeFrom((POGOProtos.Rpc.NBCKFAMMGAH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NBCKFAMMGAH other) {
      if (other == POGOProtos.Rpc.NBCKFAMMGAH.getDefaultInstance()) return this;
      if (other.lcajjpmoafe_ != 0) {
        setLcajjpmoafeValue(other.getLcajjpmoafeValue());
      }
      if (other.hasDifaoifnand()) {
        mergeDifaoifnand(other.getDifaoifnand());
      }
      if (other.hasFcpaglpidlk()) {
        mergeFcpaglpidlk(other.getFcpaglpidlk());
      }
      if (other.getGpnniccghji() != 0L) {
        setGpnniccghji(other.getGpnniccghji());
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
      POGOProtos.Rpc.NBCKFAMMGAH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NBCKFAMMGAH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int lcajjpmoafe_ = 0;
    /**
     * <code>.POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO lcajjpmoafe = 1;</code>
     * @return The enum numeric value on the wire for lcajjpmoafe.
     */
    @java.lang.Override public int getLcajjpmoafeValue() {
      return lcajjpmoafe_;
    }
    /**
     * <code>.POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO lcajjpmoafe = 1;</code>
     * @param value The enum numeric value on the wire for lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafeValue(int value) {
      
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO lcajjpmoafe = 1;</code>
     * @return The lcajjpmoafe.
     */
    @java.lang.Override
    public POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO getLcajjpmoafe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO result = POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO.valueOf(lcajjpmoafe_);
      return result == null ? POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO lcajjpmoafe = 1;</code>
     * @param value The lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafe(POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lcajjpmoafe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NBCKFAMMGAH.MOODCHJBKEO lcajjpmoafe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcajjpmoafe() {
      
      lcajjpmoafe_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.AOCEGMGFGMM difaoifnand_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AOCEGMGFGMM, POGOProtos.Rpc.AOCEGMGFGMM.Builder, POGOProtos.Rpc.AOCEGMGFGMMOrBuilder> difaoifnandBuilder_;
    /**
     * <code>.POGOProtos.Rpc.AOCEGMGFGMM difaoifnand = 2;</code>
     * @return Whether the difaoifnand field is set.
     */
    public boolean hasDifaoifnand() {
      return difaoifnandBuilder_ != null || difaoifnand_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.AOCEGMGFGMM difaoifnand = 2;</code>
     * @return The difaoifnand.
     */
    public POGOProtos.Rpc.AOCEGMGFGMM getDifaoifnand() {
      if (difaoifnandBuilder_ == null) {
        return difaoifnand_ == null ? POGOProtos.Rpc.AOCEGMGFGMM.getDefaultInstance() : difaoifnand_;
      } else {
        return difaoifnandBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AOCEGMGFGMM difaoifnand = 2;</code>
     */
    public Builder setDifaoifnand(POGOProtos.Rpc.AOCEGMGFGMM value) {
      if (difaoifnandBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        difaoifnand_ = value;
        onChanged();
      } else {
        difaoifnandBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AOCEGMGFGMM difaoifnand = 2;</code>
     */
    public Builder setDifaoifnand(
        POGOProtos.Rpc.AOCEGMGFGMM.Builder builderForValue) {
      if (difaoifnandBuilder_ == null) {
        difaoifnand_ = builderForValue.build();
        onChanged();
      } else {
        difaoifnandBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AOCEGMGFGMM difaoifnand = 2;</code>
     */
    public Builder mergeDifaoifnand(POGOProtos.Rpc.AOCEGMGFGMM value) {
      if (difaoifnandBuilder_ == null) {
        if (difaoifnand_ != null) {
          difaoifnand_ =
            POGOProtos.Rpc.AOCEGMGFGMM.newBuilder(difaoifnand_).mergeFrom(value).buildPartial();
        } else {
          difaoifnand_ = value;
        }
        onChanged();
      } else {
        difaoifnandBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AOCEGMGFGMM difaoifnand = 2;</code>
     */
    public Builder clearDifaoifnand() {
      if (difaoifnandBuilder_ == null) {
        difaoifnand_ = null;
        onChanged();
      } else {
        difaoifnand_ = null;
        difaoifnandBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AOCEGMGFGMM difaoifnand = 2;</code>
     */
    public POGOProtos.Rpc.AOCEGMGFGMM.Builder getDifaoifnandBuilder() {
      
      onChanged();
      return getDifaoifnandFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.AOCEGMGFGMM difaoifnand = 2;</code>
     */
    public POGOProtos.Rpc.AOCEGMGFGMMOrBuilder getDifaoifnandOrBuilder() {
      if (difaoifnandBuilder_ != null) {
        return difaoifnandBuilder_.getMessageOrBuilder();
      } else {
        return difaoifnand_ == null ?
            POGOProtos.Rpc.AOCEGMGFGMM.getDefaultInstance() : difaoifnand_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AOCEGMGFGMM difaoifnand = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AOCEGMGFGMM, POGOProtos.Rpc.AOCEGMGFGMM.Builder, POGOProtos.Rpc.AOCEGMGFGMMOrBuilder> 
        getDifaoifnandFieldBuilder() {
      if (difaoifnandBuilder_ == null) {
        difaoifnandBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.AOCEGMGFGMM, POGOProtos.Rpc.AOCEGMGFGMM.Builder, POGOProtos.Rpc.AOCEGMGFGMMOrBuilder>(
                getDifaoifnand(),
                getParentForChildren(),
                isClean());
        difaoifnand_ = null;
      }
      return difaoifnandBuilder_;
    }

    private POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.NJDBDKOANFO, POGOProtos.Rpc.NJDBDKOANFO.Builder, POGOProtos.Rpc.NJDBDKOANFOOrBuilder> fcpaglpidlkBuilder_;
    /**
     * <code>.POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk = 3;</code>
     * @return Whether the fcpaglpidlk field is set.
     */
    public boolean hasFcpaglpidlk() {
      return fcpaglpidlkBuilder_ != null || fcpaglpidlk_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk = 3;</code>
     * @return The fcpaglpidlk.
     */
    public POGOProtos.Rpc.NJDBDKOANFO getFcpaglpidlk() {
      if (fcpaglpidlkBuilder_ == null) {
        return fcpaglpidlk_ == null ? POGOProtos.Rpc.NJDBDKOANFO.getDefaultInstance() : fcpaglpidlk_;
      } else {
        return fcpaglpidlkBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk = 3;</code>
     */
    public Builder setFcpaglpidlk(POGOProtos.Rpc.NJDBDKOANFO value) {
      if (fcpaglpidlkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fcpaglpidlk_ = value;
        onChanged();
      } else {
        fcpaglpidlkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk = 3;</code>
     */
    public Builder setFcpaglpidlk(
        POGOProtos.Rpc.NJDBDKOANFO.Builder builderForValue) {
      if (fcpaglpidlkBuilder_ == null) {
        fcpaglpidlk_ = builderForValue.build();
        onChanged();
      } else {
        fcpaglpidlkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk = 3;</code>
     */
    public Builder mergeFcpaglpidlk(POGOProtos.Rpc.NJDBDKOANFO value) {
      if (fcpaglpidlkBuilder_ == null) {
        if (fcpaglpidlk_ != null) {
          fcpaglpidlk_ =
            POGOProtos.Rpc.NJDBDKOANFO.newBuilder(fcpaglpidlk_).mergeFrom(value).buildPartial();
        } else {
          fcpaglpidlk_ = value;
        }
        onChanged();
      } else {
        fcpaglpidlkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk = 3;</code>
     */
    public Builder clearFcpaglpidlk() {
      if (fcpaglpidlkBuilder_ == null) {
        fcpaglpidlk_ = null;
        onChanged();
      } else {
        fcpaglpidlk_ = null;
        fcpaglpidlkBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk = 3;</code>
     */
    public POGOProtos.Rpc.NJDBDKOANFO.Builder getFcpaglpidlkBuilder() {
      
      onChanged();
      return getFcpaglpidlkFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk = 3;</code>
     */
    public POGOProtos.Rpc.NJDBDKOANFOOrBuilder getFcpaglpidlkOrBuilder() {
      if (fcpaglpidlkBuilder_ != null) {
        return fcpaglpidlkBuilder_.getMessageOrBuilder();
      } else {
        return fcpaglpidlk_ == null ?
            POGOProtos.Rpc.NJDBDKOANFO.getDefaultInstance() : fcpaglpidlk_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.NJDBDKOANFO fcpaglpidlk = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.NJDBDKOANFO, POGOProtos.Rpc.NJDBDKOANFO.Builder, POGOProtos.Rpc.NJDBDKOANFOOrBuilder> 
        getFcpaglpidlkFieldBuilder() {
      if (fcpaglpidlkBuilder_ == null) {
        fcpaglpidlkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.NJDBDKOANFO, POGOProtos.Rpc.NJDBDKOANFO.Builder, POGOProtos.Rpc.NJDBDKOANFOOrBuilder>(
                getFcpaglpidlk(),
                getParentForChildren(),
                isClean());
        fcpaglpidlk_ = null;
      }
      return fcpaglpidlkBuilder_;
    }

    private long gpnniccghji_ ;
    /**
     * <code>int64 gpnniccghji = 4;</code>
     * @return The gpnniccghji.
     */
    @java.lang.Override
    public long getGpnniccghji() {
      return gpnniccghji_;
    }
    /**
     * <code>int64 gpnniccghji = 4;</code>
     * @param value The gpnniccghji to set.
     * @return This builder for chaining.
     */
    public Builder setGpnniccghji(long value) {
      
      gpnniccghji_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 gpnniccghji = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGpnniccghji() {
      
      gpnniccghji_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NBCKFAMMGAH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NBCKFAMMGAH)
  private static final POGOProtos.Rpc.NBCKFAMMGAH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NBCKFAMMGAH();
  }

  public static POGOProtos.Rpc.NBCKFAMMGAH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NBCKFAMMGAH>
      PARSER = new com.google.protobuf.AbstractParser<NBCKFAMMGAH>() {
    @java.lang.Override
    public NBCKFAMMGAH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NBCKFAMMGAH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NBCKFAMMGAH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NBCKFAMMGAH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NBCKFAMMGAH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

