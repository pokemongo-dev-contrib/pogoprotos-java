// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: EHHHHPBNHHF
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.EHHHHPBNHHF}
 */
public final class EHHHHPBNHHF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EHHHHPBNHHF)
    EHHHHPBNHHFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EHHHHPBNHHF.newBuilder() to construct.
  private EHHHHPBNHHF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EHHHHPBNHHF() {
    lcajjpmoafe_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EHHHHPBNHHF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EHHHHPBNHHF(
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
            POGOProtos.Rpc.MNCONLEECEA.Builder subBuilder = null;
            if (eafodhkifln_ != null) {
              subBuilder = eafodhkifln_.toBuilder();
            }
            eafodhkifln_ = input.readMessage(POGOProtos.Rpc.MNCONLEECEA.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(eafodhkifln_);
              eafodhkifln_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            aafenoiifld_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EHHHHPBNHHF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EHHHHPBNHHF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EHHHHPBNHHF.class, POGOProtos.Rpc.EHHHHPBNHHF.Builder.class);
  }

  /**
   * <pre>
   * ref: EHHHHPBNHHF/FEOKDGDFCIB/MODIMBFOPNE
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE}
   */
  public enum MODIMBFOPNE
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
    public static MODIMBFOPNE valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MODIMBFOPNE forNumber(int value) {
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

    public static com.google.protobuf.Internal.EnumLiteMap<MODIMBFOPNE>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MODIMBFOPNE> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MODIMBFOPNE>() {
            public MODIMBFOPNE findValueByNumber(int number) {
              return MODIMBFOPNE.forNumber(number);
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
      return POGOProtos.Rpc.EHHHHPBNHHF.getDescriptor().getEnumTypes().get(0);
    }

    private static final MODIMBFOPNE[] VALUES = values();

    public static MODIMBFOPNE valueOf(
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

    private MODIMBFOPNE(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE)
  }

  public static final int LCAJJPMOAFE_FIELD_NUMBER = 1;
  private int lcajjpmoafe_;
  /**
   * <code>.POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE lcajjpmoafe = 1;</code>
   * @return The enum numeric value on the wire for lcajjpmoafe.
   */
  @java.lang.Override public int getLcajjpmoafeValue() {
    return lcajjpmoafe_;
  }
  /**
   * <code>.POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE lcajjpmoafe = 1;</code>
   * @return The lcajjpmoafe.
   */
  @java.lang.Override public POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE getLcajjpmoafe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE result = POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE.valueOf(lcajjpmoafe_);
    return result == null ? POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE.UNRECOGNIZED : result;
  }

  public static final int EAFODHKIFLN_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.MNCONLEECEA eafodhkifln_;
  /**
   * <code>.POGOProtos.Rpc.MNCONLEECEA eafodhkifln = 2;</code>
   * @return Whether the eafodhkifln field is set.
   */
  @java.lang.Override
  public boolean hasEafodhkifln() {
    return eafodhkifln_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.MNCONLEECEA eafodhkifln = 2;</code>
   * @return The eafodhkifln.
   */
  @java.lang.Override
  public POGOProtos.Rpc.MNCONLEECEA getEafodhkifln() {
    return eafodhkifln_ == null ? POGOProtos.Rpc.MNCONLEECEA.getDefaultInstance() : eafodhkifln_;
  }
  /**
   * <code>.POGOProtos.Rpc.MNCONLEECEA eafodhkifln = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.MNCONLEECEAOrBuilder getEafodhkiflnOrBuilder() {
    return getEafodhkifln();
  }

  public static final int AAFENOIIFLD_FIELD_NUMBER = 3;
  private boolean aafenoiifld_;
  /**
   * <code>bool aafenoiifld = 3;</code>
   * @return The aafenoiifld.
   */
  @java.lang.Override
  public boolean getAafenoiifld() {
    return aafenoiifld_;
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
    if (lcajjpmoafe_ != POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE.UNSET.getNumber()) {
      output.writeEnum(1, lcajjpmoafe_);
    }
    if (eafodhkifln_ != null) {
      output.writeMessage(2, getEafodhkifln());
    }
    if (aafenoiifld_ != false) {
      output.writeBool(3, aafenoiifld_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lcajjpmoafe_ != POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lcajjpmoafe_);
    }
    if (eafodhkifln_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEafodhkifln());
    }
    if (aafenoiifld_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, aafenoiifld_);
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
    if (!(obj instanceof POGOProtos.Rpc.EHHHHPBNHHF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EHHHHPBNHHF other = (POGOProtos.Rpc.EHHHHPBNHHF) obj;

    if (lcajjpmoafe_ != other.lcajjpmoafe_) return false;
    if (hasEafodhkifln() != other.hasEafodhkifln()) return false;
    if (hasEafodhkifln()) {
      if (!getEafodhkifln()
          .equals(other.getEafodhkifln())) return false;
    }
    if (getAafenoiifld()
        != other.getAafenoiifld()) return false;
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
    if (hasEafodhkifln()) {
      hash = (37 * hash) + EAFODHKIFLN_FIELD_NUMBER;
      hash = (53 * hash) + getEafodhkifln().hashCode();
    }
    hash = (37 * hash) + AAFENOIIFLD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAafenoiifld());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EHHHHPBNHHF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EHHHHPBNHHF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EHHHHPBNHHF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EHHHHPBNHHF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EHHHHPBNHHF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EHHHHPBNHHF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EHHHHPBNHHF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EHHHHPBNHHF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EHHHHPBNHHF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EHHHHPBNHHF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EHHHHPBNHHF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EHHHHPBNHHF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EHHHHPBNHHF prototype) {
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
   * ref: EHHHHPBNHHF
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.EHHHHPBNHHF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EHHHHPBNHHF)
      POGOProtos.Rpc.EHHHHPBNHHFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EHHHHPBNHHF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EHHHHPBNHHF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EHHHHPBNHHF.class, POGOProtos.Rpc.EHHHHPBNHHF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EHHHHPBNHHF.newBuilder()
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

      if (eafodhkiflnBuilder_ == null) {
        eafodhkifln_ = null;
      } else {
        eafodhkifln_ = null;
        eafodhkiflnBuilder_ = null;
      }
      aafenoiifld_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EHHHHPBNHHF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EHHHHPBNHHF getDefaultInstanceForType() {
      return POGOProtos.Rpc.EHHHHPBNHHF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EHHHHPBNHHF build() {
      POGOProtos.Rpc.EHHHHPBNHHF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EHHHHPBNHHF buildPartial() {
      POGOProtos.Rpc.EHHHHPBNHHF result = new POGOProtos.Rpc.EHHHHPBNHHF(this);
      result.lcajjpmoafe_ = lcajjpmoafe_;
      if (eafodhkiflnBuilder_ == null) {
        result.eafodhkifln_ = eafodhkifln_;
      } else {
        result.eafodhkifln_ = eafodhkiflnBuilder_.build();
      }
      result.aafenoiifld_ = aafenoiifld_;
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
      if (other instanceof POGOProtos.Rpc.EHHHHPBNHHF) {
        return mergeFrom((POGOProtos.Rpc.EHHHHPBNHHF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EHHHHPBNHHF other) {
      if (other == POGOProtos.Rpc.EHHHHPBNHHF.getDefaultInstance()) return this;
      if (other.lcajjpmoafe_ != 0) {
        setLcajjpmoafeValue(other.getLcajjpmoafeValue());
      }
      if (other.hasEafodhkifln()) {
        mergeEafodhkifln(other.getEafodhkifln());
      }
      if (other.getAafenoiifld() != false) {
        setAafenoiifld(other.getAafenoiifld());
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
      POGOProtos.Rpc.EHHHHPBNHHF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EHHHHPBNHHF) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE lcajjpmoafe = 1;</code>
     * @return The enum numeric value on the wire for lcajjpmoafe.
     */
    @java.lang.Override public int getLcajjpmoafeValue() {
      return lcajjpmoafe_;
    }
    /**
     * <code>.POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE lcajjpmoafe = 1;</code>
     * @param value The enum numeric value on the wire for lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafeValue(int value) {
      
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE lcajjpmoafe = 1;</code>
     * @return The lcajjpmoafe.
     */
    @java.lang.Override
    public POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE getLcajjpmoafe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE result = POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE.valueOf(lcajjpmoafe_);
      return result == null ? POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE lcajjpmoafe = 1;</code>
     * @param value The lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafe(POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lcajjpmoafe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EHHHHPBNHHF.MODIMBFOPNE lcajjpmoafe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcajjpmoafe() {
      
      lcajjpmoafe_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.MNCONLEECEA eafodhkifln_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.MNCONLEECEA, POGOProtos.Rpc.MNCONLEECEA.Builder, POGOProtos.Rpc.MNCONLEECEAOrBuilder> eafodhkiflnBuilder_;
    /**
     * <code>.POGOProtos.Rpc.MNCONLEECEA eafodhkifln = 2;</code>
     * @return Whether the eafodhkifln field is set.
     */
    public boolean hasEafodhkifln() {
      return eafodhkiflnBuilder_ != null || eafodhkifln_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.MNCONLEECEA eafodhkifln = 2;</code>
     * @return The eafodhkifln.
     */
    public POGOProtos.Rpc.MNCONLEECEA getEafodhkifln() {
      if (eafodhkiflnBuilder_ == null) {
        return eafodhkifln_ == null ? POGOProtos.Rpc.MNCONLEECEA.getDefaultInstance() : eafodhkifln_;
      } else {
        return eafodhkiflnBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.MNCONLEECEA eafodhkifln = 2;</code>
     */
    public Builder setEafodhkifln(POGOProtos.Rpc.MNCONLEECEA value) {
      if (eafodhkiflnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        eafodhkifln_ = value;
        onChanged();
      } else {
        eafodhkiflnBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MNCONLEECEA eafodhkifln = 2;</code>
     */
    public Builder setEafodhkifln(
        POGOProtos.Rpc.MNCONLEECEA.Builder builderForValue) {
      if (eafodhkiflnBuilder_ == null) {
        eafodhkifln_ = builderForValue.build();
        onChanged();
      } else {
        eafodhkiflnBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MNCONLEECEA eafodhkifln = 2;</code>
     */
    public Builder mergeEafodhkifln(POGOProtos.Rpc.MNCONLEECEA value) {
      if (eafodhkiflnBuilder_ == null) {
        if (eafodhkifln_ != null) {
          eafodhkifln_ =
            POGOProtos.Rpc.MNCONLEECEA.newBuilder(eafodhkifln_).mergeFrom(value).buildPartial();
        } else {
          eafodhkifln_ = value;
        }
        onChanged();
      } else {
        eafodhkiflnBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MNCONLEECEA eafodhkifln = 2;</code>
     */
    public Builder clearEafodhkifln() {
      if (eafodhkiflnBuilder_ == null) {
        eafodhkifln_ = null;
        onChanged();
      } else {
        eafodhkifln_ = null;
        eafodhkiflnBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MNCONLEECEA eafodhkifln = 2;</code>
     */
    public POGOProtos.Rpc.MNCONLEECEA.Builder getEafodhkiflnBuilder() {
      
      onChanged();
      return getEafodhkiflnFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.MNCONLEECEA eafodhkifln = 2;</code>
     */
    public POGOProtos.Rpc.MNCONLEECEAOrBuilder getEafodhkiflnOrBuilder() {
      if (eafodhkiflnBuilder_ != null) {
        return eafodhkiflnBuilder_.getMessageOrBuilder();
      } else {
        return eafodhkifln_ == null ?
            POGOProtos.Rpc.MNCONLEECEA.getDefaultInstance() : eafodhkifln_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.MNCONLEECEA eafodhkifln = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.MNCONLEECEA, POGOProtos.Rpc.MNCONLEECEA.Builder, POGOProtos.Rpc.MNCONLEECEAOrBuilder> 
        getEafodhkiflnFieldBuilder() {
      if (eafodhkiflnBuilder_ == null) {
        eafodhkiflnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.MNCONLEECEA, POGOProtos.Rpc.MNCONLEECEA.Builder, POGOProtos.Rpc.MNCONLEECEAOrBuilder>(
                getEafodhkifln(),
                getParentForChildren(),
                isClean());
        eafodhkifln_ = null;
      }
      return eafodhkiflnBuilder_;
    }

    private boolean aafenoiifld_ ;
    /**
     * <code>bool aafenoiifld = 3;</code>
     * @return The aafenoiifld.
     */
    @java.lang.Override
    public boolean getAafenoiifld() {
      return aafenoiifld_;
    }
    /**
     * <code>bool aafenoiifld = 3;</code>
     * @param value The aafenoiifld to set.
     * @return This builder for chaining.
     */
    public Builder setAafenoiifld(boolean value) {
      
      aafenoiifld_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool aafenoiifld = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAafenoiifld() {
      
      aafenoiifld_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EHHHHPBNHHF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EHHHHPBNHHF)
  private static final POGOProtos.Rpc.EHHHHPBNHHF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EHHHHPBNHHF();
  }

  public static POGOProtos.Rpc.EHHHHPBNHHF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EHHHHPBNHHF>
      PARSER = new com.google.protobuf.AbstractParser<EHHHHPBNHHF>() {
    @java.lang.Override
    public EHHHHPBNHHF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EHHHHPBNHHF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EHHHHPBNHHF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EHHHHPBNHHF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EHHHHPBNHHF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

