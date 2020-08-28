// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NMJLNKOEKNO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NMJLNKOEKNO}
 */
public final class NMJLNKOEKNO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NMJLNKOEKNO)
    NMJLNKOEKNOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NMJLNKOEKNO.newBuilder() to construct.
  private NMJLNKOEKNO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NMJLNKOEKNO() {
    magjbjmclno_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NMJLNKOEKNO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NMJLNKOEKNO(
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
            POGOProtos.Rpc.ONBKNNNCMPF.Builder subBuilder = null;
            if (ajjmknbebde_ != null) {
              subBuilder = ajjmknbebde_.toBuilder();
            }
            ajjmknbebde_ = input.readMessage(POGOProtos.Rpc.ONBKNNNCMPF.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ajjmknbebde_);
              ajjmknbebde_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            mmgjiehifgb_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NMJLNKOEKNO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NMJLNKOEKNO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NMJLNKOEKNO.class, POGOProtos.Rpc.NMJLNKOEKNO.Builder.class);
  }

  /**
   * <pre>
   * ref: NMJLNKOEKNO/MBHCADOOOPM/BBAILECDOLC
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC}
   */
  public enum BBAILECDOLC
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
     * <code>ERROR_INVALID_COMBAT_STATE = 2;</code>
     */
    ERROR_INVALID_COMBAT_STATE(2),
    /**
     * <code>ERROR_COMBAT_SESSION_FULL = 3;</code>
     */
    ERROR_COMBAT_SESSION_FULL(3),
    /**
     * <code>ERROR_POKEMON_NOT_IN_INVENTORY = 4;</code>
     */
    ERROR_POKEMON_NOT_IN_INVENTORY(4),
    /**
     * <code>ERROR_OPPONENT_NOT_IN_RANGE = 5;</code>
     */
    ERROR_OPPONENT_NOT_IN_RANGE(5),
    /**
     * <code>ERROR_CHALLENGE_EXPIRED = 6;</code>
     */
    ERROR_CHALLENGE_EXPIRED(6),
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 7;</code>
     */
    ERROR_PLAYER_BELOW_MINIMUM_LEVEL(7),
    /**
     * <code>ERROR_OPPONENT_QUIT = 8;</code>
     */
    ERROR_OPPONENT_QUIT(8),
    /**
     * <code>ERROR_POKEMON_LINEUP_INELIGIBLE_FOR_LEAGUE = 9;</code>
     */
    ERROR_POKEMON_LINEUP_INELIGIBLE_FOR_LEAGUE(9),
    /**
     * <code>ERROR_COMBAT_LEAGUE_UNSPECIFIED = 10;</code>
     */
    ERROR_COMBAT_LEAGUE_UNSPECIFIED(10),
    /**
     * <code>ERROR_ACCESS_DENIED = 11;</code>
     */
    ERROR_ACCESS_DENIED(11),
    /**
     * <code>ERROR_PLAYER_HAS_NO_BATTLE_PASSES = 12;</code>
     */
    ERROR_PLAYER_HAS_NO_BATTLE_PASSES(12),
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
     * <code>ERROR_INVALID_COMBAT_STATE = 2;</code>
     */
    public static final int ERROR_INVALID_COMBAT_STATE_VALUE = 2;
    /**
     * <code>ERROR_COMBAT_SESSION_FULL = 3;</code>
     */
    public static final int ERROR_COMBAT_SESSION_FULL_VALUE = 3;
    /**
     * <code>ERROR_POKEMON_NOT_IN_INVENTORY = 4;</code>
     */
    public static final int ERROR_POKEMON_NOT_IN_INVENTORY_VALUE = 4;
    /**
     * <code>ERROR_OPPONENT_NOT_IN_RANGE = 5;</code>
     */
    public static final int ERROR_OPPONENT_NOT_IN_RANGE_VALUE = 5;
    /**
     * <code>ERROR_CHALLENGE_EXPIRED = 6;</code>
     */
    public static final int ERROR_CHALLENGE_EXPIRED_VALUE = 6;
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 7;</code>
     */
    public static final int ERROR_PLAYER_BELOW_MINIMUM_LEVEL_VALUE = 7;
    /**
     * <code>ERROR_OPPONENT_QUIT = 8;</code>
     */
    public static final int ERROR_OPPONENT_QUIT_VALUE = 8;
    /**
     * <code>ERROR_POKEMON_LINEUP_INELIGIBLE_FOR_LEAGUE = 9;</code>
     */
    public static final int ERROR_POKEMON_LINEUP_INELIGIBLE_FOR_LEAGUE_VALUE = 9;
    /**
     * <code>ERROR_COMBAT_LEAGUE_UNSPECIFIED = 10;</code>
     */
    public static final int ERROR_COMBAT_LEAGUE_UNSPECIFIED_VALUE = 10;
    /**
     * <code>ERROR_ACCESS_DENIED = 11;</code>
     */
    public static final int ERROR_ACCESS_DENIED_VALUE = 11;
    /**
     * <code>ERROR_PLAYER_HAS_NO_BATTLE_PASSES = 12;</code>
     */
    public static final int ERROR_PLAYER_HAS_NO_BATTLE_PASSES_VALUE = 12;


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
    public static BBAILECDOLC valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BBAILECDOLC forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_INVALID_COMBAT_STATE;
        case 3: return ERROR_COMBAT_SESSION_FULL;
        case 4: return ERROR_POKEMON_NOT_IN_INVENTORY;
        case 5: return ERROR_OPPONENT_NOT_IN_RANGE;
        case 6: return ERROR_CHALLENGE_EXPIRED;
        case 7: return ERROR_PLAYER_BELOW_MINIMUM_LEVEL;
        case 8: return ERROR_OPPONENT_QUIT;
        case 9: return ERROR_POKEMON_LINEUP_INELIGIBLE_FOR_LEAGUE;
        case 10: return ERROR_COMBAT_LEAGUE_UNSPECIFIED;
        case 11: return ERROR_ACCESS_DENIED;
        case 12: return ERROR_PLAYER_HAS_NO_BATTLE_PASSES;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BBAILECDOLC>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BBAILECDOLC> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BBAILECDOLC>() {
            public BBAILECDOLC findValueByNumber(int number) {
              return BBAILECDOLC.forNumber(number);
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
      return POGOProtos.Rpc.NMJLNKOEKNO.getDescriptor().getEnumTypes().get(0);
    }

    private static final BBAILECDOLC[] VALUES = values();

    public static BBAILECDOLC valueOf(
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

    private BBAILECDOLC(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC)
  }

  public static final int MAGJBJMCLNO_FIELD_NUMBER = 1;
  private int magjbjmclno_;
  /**
   * <code>.POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC magjbjmclno = 1;</code>
   * @return The enum numeric value on the wire for magjbjmclno.
   */
  @java.lang.Override public int getMagjbjmclnoValue() {
    return magjbjmclno_;
  }
  /**
   * <code>.POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC magjbjmclno = 1;</code>
   * @return The magjbjmclno.
   */
  @java.lang.Override public POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC getMagjbjmclno() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC result = POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC.valueOf(magjbjmclno_);
    return result == null ? POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC.UNRECOGNIZED : result;
  }

  public static final int AJJMKNBEBDE_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde_;
  /**
   * <code>.POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde = 2;</code>
   * @return Whether the ajjmknbebde field is set.
   */
  @java.lang.Override
  public boolean hasAjjmknbebde() {
    return ajjmknbebde_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde = 2;</code>
   * @return The ajjmknbebde.
   */
  @java.lang.Override
  public POGOProtos.Rpc.ONBKNNNCMPF getAjjmknbebde() {
    return ajjmknbebde_ == null ? POGOProtos.Rpc.ONBKNNNCMPF.getDefaultInstance() : ajjmknbebde_;
  }
  /**
   * <code>.POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ONBKNNNCMPFOrBuilder getAjjmknbebdeOrBuilder() {
    return getAjjmknbebde();
  }

  public static final int MMGJIEHIFGB_FIELD_NUMBER = 3;
  private boolean mmgjiehifgb_;
  /**
   * <code>bool mmgjiehifgb = 3;</code>
   * @return The mmgjiehifgb.
   */
  @java.lang.Override
  public boolean getMmgjiehifgb() {
    return mmgjiehifgb_;
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
    if (magjbjmclno_ != POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC.UNSET.getNumber()) {
      output.writeEnum(1, magjbjmclno_);
    }
    if (ajjmknbebde_ != null) {
      output.writeMessage(2, getAjjmknbebde());
    }
    if (mmgjiehifgb_ != false) {
      output.writeBool(3, mmgjiehifgb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (magjbjmclno_ != POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, magjbjmclno_);
    }
    if (ajjmknbebde_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAjjmknbebde());
    }
    if (mmgjiehifgb_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, mmgjiehifgb_);
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
    if (!(obj instanceof POGOProtos.Rpc.NMJLNKOEKNO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NMJLNKOEKNO other = (POGOProtos.Rpc.NMJLNKOEKNO) obj;

    if (magjbjmclno_ != other.magjbjmclno_) return false;
    if (hasAjjmknbebde() != other.hasAjjmknbebde()) return false;
    if (hasAjjmknbebde()) {
      if (!getAjjmknbebde()
          .equals(other.getAjjmknbebde())) return false;
    }
    if (getMmgjiehifgb()
        != other.getMmgjiehifgb()) return false;
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
    if (hasAjjmknbebde()) {
      hash = (37 * hash) + AJJMKNBEBDE_FIELD_NUMBER;
      hash = (53 * hash) + getAjjmknbebde().hashCode();
    }
    hash = (37 * hash) + MMGJIEHIFGB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMmgjiehifgb());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NMJLNKOEKNO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NMJLNKOEKNO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NMJLNKOEKNO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NMJLNKOEKNO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NMJLNKOEKNO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NMJLNKOEKNO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NMJLNKOEKNO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NMJLNKOEKNO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NMJLNKOEKNO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NMJLNKOEKNO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NMJLNKOEKNO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NMJLNKOEKNO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NMJLNKOEKNO prototype) {
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
   * ref: NMJLNKOEKNO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NMJLNKOEKNO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NMJLNKOEKNO)
      POGOProtos.Rpc.NMJLNKOEKNOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NMJLNKOEKNO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NMJLNKOEKNO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NMJLNKOEKNO.class, POGOProtos.Rpc.NMJLNKOEKNO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NMJLNKOEKNO.newBuilder()
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

      if (ajjmknbebdeBuilder_ == null) {
        ajjmknbebde_ = null;
      } else {
        ajjmknbebde_ = null;
        ajjmknbebdeBuilder_ = null;
      }
      mmgjiehifgb_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NMJLNKOEKNO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NMJLNKOEKNO getDefaultInstanceForType() {
      return POGOProtos.Rpc.NMJLNKOEKNO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NMJLNKOEKNO build() {
      POGOProtos.Rpc.NMJLNKOEKNO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NMJLNKOEKNO buildPartial() {
      POGOProtos.Rpc.NMJLNKOEKNO result = new POGOProtos.Rpc.NMJLNKOEKNO(this);
      result.magjbjmclno_ = magjbjmclno_;
      if (ajjmknbebdeBuilder_ == null) {
        result.ajjmknbebde_ = ajjmknbebde_;
      } else {
        result.ajjmknbebde_ = ajjmknbebdeBuilder_.build();
      }
      result.mmgjiehifgb_ = mmgjiehifgb_;
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
      if (other instanceof POGOProtos.Rpc.NMJLNKOEKNO) {
        return mergeFrom((POGOProtos.Rpc.NMJLNKOEKNO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NMJLNKOEKNO other) {
      if (other == POGOProtos.Rpc.NMJLNKOEKNO.getDefaultInstance()) return this;
      if (other.magjbjmclno_ != 0) {
        setMagjbjmclnoValue(other.getMagjbjmclnoValue());
      }
      if (other.hasAjjmknbebde()) {
        mergeAjjmknbebde(other.getAjjmknbebde());
      }
      if (other.getMmgjiehifgb() != false) {
        setMmgjiehifgb(other.getMmgjiehifgb());
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
      POGOProtos.Rpc.NMJLNKOEKNO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NMJLNKOEKNO) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC magjbjmclno = 1;</code>
     * @return The enum numeric value on the wire for magjbjmclno.
     */
    @java.lang.Override public int getMagjbjmclnoValue() {
      return magjbjmclno_;
    }
    /**
     * <code>.POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC magjbjmclno = 1;</code>
     * @param value The enum numeric value on the wire for magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclnoValue(int value) {
      
      magjbjmclno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC magjbjmclno = 1;</code>
     * @return The magjbjmclno.
     */
    @java.lang.Override
    public POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC getMagjbjmclno() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC result = POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC.valueOf(magjbjmclno_);
      return result == null ? POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC magjbjmclno = 1;</code>
     * @param value The magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclno(POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      magjbjmclno_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NMJLNKOEKNO.BBAILECDOLC magjbjmclno = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMagjbjmclno() {
      
      magjbjmclno_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ONBKNNNCMPF, POGOProtos.Rpc.ONBKNNNCMPF.Builder, POGOProtos.Rpc.ONBKNNNCMPFOrBuilder> ajjmknbebdeBuilder_;
    /**
     * <code>.POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde = 2;</code>
     * @return Whether the ajjmknbebde field is set.
     */
    public boolean hasAjjmknbebde() {
      return ajjmknbebdeBuilder_ != null || ajjmknbebde_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde = 2;</code>
     * @return The ajjmknbebde.
     */
    public POGOProtos.Rpc.ONBKNNNCMPF getAjjmknbebde() {
      if (ajjmknbebdeBuilder_ == null) {
        return ajjmknbebde_ == null ? POGOProtos.Rpc.ONBKNNNCMPF.getDefaultInstance() : ajjmknbebde_;
      } else {
        return ajjmknbebdeBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde = 2;</code>
     */
    public Builder setAjjmknbebde(POGOProtos.Rpc.ONBKNNNCMPF value) {
      if (ajjmknbebdeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ajjmknbebde_ = value;
        onChanged();
      } else {
        ajjmknbebdeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde = 2;</code>
     */
    public Builder setAjjmknbebde(
        POGOProtos.Rpc.ONBKNNNCMPF.Builder builderForValue) {
      if (ajjmknbebdeBuilder_ == null) {
        ajjmknbebde_ = builderForValue.build();
        onChanged();
      } else {
        ajjmknbebdeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde = 2;</code>
     */
    public Builder mergeAjjmknbebde(POGOProtos.Rpc.ONBKNNNCMPF value) {
      if (ajjmknbebdeBuilder_ == null) {
        if (ajjmknbebde_ != null) {
          ajjmknbebde_ =
            POGOProtos.Rpc.ONBKNNNCMPF.newBuilder(ajjmknbebde_).mergeFrom(value).buildPartial();
        } else {
          ajjmknbebde_ = value;
        }
        onChanged();
      } else {
        ajjmknbebdeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde = 2;</code>
     */
    public Builder clearAjjmknbebde() {
      if (ajjmknbebdeBuilder_ == null) {
        ajjmknbebde_ = null;
        onChanged();
      } else {
        ajjmknbebde_ = null;
        ajjmknbebdeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde = 2;</code>
     */
    public POGOProtos.Rpc.ONBKNNNCMPF.Builder getAjjmknbebdeBuilder() {
      
      onChanged();
      return getAjjmknbebdeFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde = 2;</code>
     */
    public POGOProtos.Rpc.ONBKNNNCMPFOrBuilder getAjjmknbebdeOrBuilder() {
      if (ajjmknbebdeBuilder_ != null) {
        return ajjmknbebdeBuilder_.getMessageOrBuilder();
      } else {
        return ajjmknbebde_ == null ?
            POGOProtos.Rpc.ONBKNNNCMPF.getDefaultInstance() : ajjmknbebde_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ONBKNNNCMPF ajjmknbebde = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ONBKNNNCMPF, POGOProtos.Rpc.ONBKNNNCMPF.Builder, POGOProtos.Rpc.ONBKNNNCMPFOrBuilder> 
        getAjjmknbebdeFieldBuilder() {
      if (ajjmknbebdeBuilder_ == null) {
        ajjmknbebdeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.ONBKNNNCMPF, POGOProtos.Rpc.ONBKNNNCMPF.Builder, POGOProtos.Rpc.ONBKNNNCMPFOrBuilder>(
                getAjjmknbebde(),
                getParentForChildren(),
                isClean());
        ajjmknbebde_ = null;
      }
      return ajjmknbebdeBuilder_;
    }

    private boolean mmgjiehifgb_ ;
    /**
     * <code>bool mmgjiehifgb = 3;</code>
     * @return The mmgjiehifgb.
     */
    @java.lang.Override
    public boolean getMmgjiehifgb() {
      return mmgjiehifgb_;
    }
    /**
     * <code>bool mmgjiehifgb = 3;</code>
     * @param value The mmgjiehifgb to set.
     * @return This builder for chaining.
     */
    public Builder setMmgjiehifgb(boolean value) {
      
      mmgjiehifgb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mmgjiehifgb = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMmgjiehifgb() {
      
      mmgjiehifgb_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NMJLNKOEKNO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NMJLNKOEKNO)
  private static final POGOProtos.Rpc.NMJLNKOEKNO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NMJLNKOEKNO();
  }

  public static POGOProtos.Rpc.NMJLNKOEKNO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NMJLNKOEKNO>
      PARSER = new com.google.protobuf.AbstractParser<NMJLNKOEKNO>() {
    @java.lang.Override
    public NMJLNKOEKNO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NMJLNKOEKNO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NMJLNKOEKNO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NMJLNKOEKNO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NMJLNKOEKNO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

