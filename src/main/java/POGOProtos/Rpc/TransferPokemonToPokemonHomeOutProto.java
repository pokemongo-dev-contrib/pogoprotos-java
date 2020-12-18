// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto}
 */
public final class TransferPokemonToPokemonHomeOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto)
    TransferPokemonToPokemonHomeOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransferPokemonToPokemonHomeOutProto.newBuilder() to construct.
  private TransferPokemonToPokemonHomeOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransferPokemonToPokemonHomeOutProto() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransferPokemonToPokemonHomeOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransferPokemonToPokemonHomeOutProto(
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

            status_ = rawValue;
            break;
          }
          case 16: {

            candyAwarded_ = input.readInt32();
            break;
          }
          case 24: {

            xlCandyAwarded_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TransferPokemonToPokemonHomeOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TransferPokemonToPokemonHomeOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.class, POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status}
   */
  public enum Status
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
     * <code>ERROR_PLAYER_LEVEL_TOO_LOW = 2;</code>
     */
    ERROR_PLAYER_LEVEL_TOO_LOW(2),
    /**
     * <code>ERROR_NO_NAID_LINKED = 3;</code>
     */
    ERROR_NO_NAID_LINKED(3),
    /**
     * <code>ERROR_TOO_MANY_POKEMON = 4;</code>
     */
    ERROR_TOO_MANY_POKEMON(4),
    /**
     * <code>ERROR_SERVER_CLIENT_ENERGY_COST_MISMATCH = 5;</code>
     */
    ERROR_SERVER_CLIENT_ENERGY_COST_MISMATCH(5),
    /**
     * <code>ERROR_INSUFFICIENT_ENERGY = 6;</code>
     */
    ERROR_INSUFFICIENT_ENERGY(6),
    /**
     * <code>ERROR_TRANSFER_IN_PROGRESS = 7;</code>
     */
    ERROR_TRANSFER_IN_PROGRESS(7),
    /**
     * <code>ERROR_POKEMON_DEPLOYED = 10;</code>
     */
    ERROR_POKEMON_DEPLOYED(10),
    /**
     * <code>ERROR_POKEMON_IS_EGG = 11;</code>
     */
    ERROR_POKEMON_IS_EGG(11),
    /**
     * <code>ERROR_POKEMON_IS_BUDDY = 12;</code>
     */
    ERROR_POKEMON_IS_BUDDY(12),
    /**
     * <code>ERROR_POKEMON_BAD = 13;</code>
     */
    ERROR_POKEMON_BAD(13),
    /**
     * <code>ERROR_POKEMON_IS_MEGA = 14;</code>
     */
    ERROR_POKEMON_IS_MEGA(14),
    /**
     * <code>ERROR_POKEMON_FAVORITED = 15;</code>
     */
    ERROR_POKEMON_FAVORITED(15),
    /**
     * <code>ERROR_POKEMON_NOT_FOUND = 16;</code>
     */
    ERROR_POKEMON_NOT_FOUND(16),
    /**
     * <code>ERROR_VALIDATION_UNKNOWN = 17;</code>
     */
    ERROR_VALIDATION_UNKNOWN(17),
    /**
     * <code>ERROR_POKEMON_HAS_COSTUME = 21;</code>
     */
    ERROR_POKEMON_HAS_COSTUME(21),
    /**
     * <code>ERROR_POKEMON_IS_SHADOW = 22;</code>
     */
    ERROR_POKEMON_IS_SHADOW(22),
    /**
     * <code>ERROR_POKEMON_DISALLOWED = 23;</code>
     */
    ERROR_POKEMON_DISALLOWED(23),
    /**
     * <code>ERROR_PHAPI_REQUEST_BODY_FALSE = 30;</code>
     */
    ERROR_PHAPI_REQUEST_BODY_FALSE(30),
    /**
     * <code>ERROR_PHAPI_REQUEST_PARAMETERS_DNE = 31;</code>
     */
    ERROR_PHAPI_REQUEST_PARAMETERS_DNE(31),
    /**
     * <code>ERROR_PHAPI_REQUEST_PARAMETERS_FALSE = 32;</code>
     */
    ERROR_PHAPI_REQUEST_PARAMETERS_FALSE(32),
    /**
     * <code>ERROR_PHAPI_MAINTENANCE = 33;</code>
     */
    ERROR_PHAPI_MAINTENANCE(33),
    /**
     * <code>ERROR_PHAPI_SERVICE_ENDED = 34;</code>
     */
    ERROR_PHAPI_SERVICE_ENDED(34),
    /**
     * <code>ERROR_PHAPI_UNKNOWN = 35;</code>
     */
    ERROR_PHAPI_UNKNOWN(35),
    /**
     * <code>ERROR_PHAPI_NAID_DOES_NOT_EXIST = 36;</code>
     */
    ERROR_PHAPI_NAID_DOES_NOT_EXIST(36),
    /**
     * <code>ERROR_PHAPI_NO_SPACE_IN_BOX = 37;</code>
     */
    ERROR_PHAPI_NO_SPACE_IN_BOX(37),
    /**
     * <code>ERROR_PHAPI_DATA_CONVERSION_FAILURE = 38;</code>
     */
    ERROR_PHAPI_DATA_CONVERSION_FAILURE(38),
    /**
     * <code>ERROR_PHAPI_WAITING_FOR_RECEIPT = 39;</code>
     */
    ERROR_PHAPI_WAITING_FOR_RECEIPT(39),
    /**
     * <code>ERROR_PHAPI_PLAYER_NOT_USING_PH_APP = 40;</code>
     */
    ERROR_PHAPI_PLAYER_NOT_USING_PH_APP(40),
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
     * <code>ERROR_PLAYER_LEVEL_TOO_LOW = 2;</code>
     */
    public static final int ERROR_PLAYER_LEVEL_TOO_LOW_VALUE = 2;
    /**
     * <code>ERROR_NO_NAID_LINKED = 3;</code>
     */
    public static final int ERROR_NO_NAID_LINKED_VALUE = 3;
    /**
     * <code>ERROR_TOO_MANY_POKEMON = 4;</code>
     */
    public static final int ERROR_TOO_MANY_POKEMON_VALUE = 4;
    /**
     * <code>ERROR_SERVER_CLIENT_ENERGY_COST_MISMATCH = 5;</code>
     */
    public static final int ERROR_SERVER_CLIENT_ENERGY_COST_MISMATCH_VALUE = 5;
    /**
     * <code>ERROR_INSUFFICIENT_ENERGY = 6;</code>
     */
    public static final int ERROR_INSUFFICIENT_ENERGY_VALUE = 6;
    /**
     * <code>ERROR_TRANSFER_IN_PROGRESS = 7;</code>
     */
    public static final int ERROR_TRANSFER_IN_PROGRESS_VALUE = 7;
    /**
     * <code>ERROR_POKEMON_DEPLOYED = 10;</code>
     */
    public static final int ERROR_POKEMON_DEPLOYED_VALUE = 10;
    /**
     * <code>ERROR_POKEMON_IS_EGG = 11;</code>
     */
    public static final int ERROR_POKEMON_IS_EGG_VALUE = 11;
    /**
     * <code>ERROR_POKEMON_IS_BUDDY = 12;</code>
     */
    public static final int ERROR_POKEMON_IS_BUDDY_VALUE = 12;
    /**
     * <code>ERROR_POKEMON_BAD = 13;</code>
     */
    public static final int ERROR_POKEMON_BAD_VALUE = 13;
    /**
     * <code>ERROR_POKEMON_IS_MEGA = 14;</code>
     */
    public static final int ERROR_POKEMON_IS_MEGA_VALUE = 14;
    /**
     * <code>ERROR_POKEMON_FAVORITED = 15;</code>
     */
    public static final int ERROR_POKEMON_FAVORITED_VALUE = 15;
    /**
     * <code>ERROR_POKEMON_NOT_FOUND = 16;</code>
     */
    public static final int ERROR_POKEMON_NOT_FOUND_VALUE = 16;
    /**
     * <code>ERROR_VALIDATION_UNKNOWN = 17;</code>
     */
    public static final int ERROR_VALIDATION_UNKNOWN_VALUE = 17;
    /**
     * <code>ERROR_POKEMON_HAS_COSTUME = 21;</code>
     */
    public static final int ERROR_POKEMON_HAS_COSTUME_VALUE = 21;
    /**
     * <code>ERROR_POKEMON_IS_SHADOW = 22;</code>
     */
    public static final int ERROR_POKEMON_IS_SHADOW_VALUE = 22;
    /**
     * <code>ERROR_POKEMON_DISALLOWED = 23;</code>
     */
    public static final int ERROR_POKEMON_DISALLOWED_VALUE = 23;
    /**
     * <code>ERROR_PHAPI_REQUEST_BODY_FALSE = 30;</code>
     */
    public static final int ERROR_PHAPI_REQUEST_BODY_FALSE_VALUE = 30;
    /**
     * <code>ERROR_PHAPI_REQUEST_PARAMETERS_DNE = 31;</code>
     */
    public static final int ERROR_PHAPI_REQUEST_PARAMETERS_DNE_VALUE = 31;
    /**
     * <code>ERROR_PHAPI_REQUEST_PARAMETERS_FALSE = 32;</code>
     */
    public static final int ERROR_PHAPI_REQUEST_PARAMETERS_FALSE_VALUE = 32;
    /**
     * <code>ERROR_PHAPI_MAINTENANCE = 33;</code>
     */
    public static final int ERROR_PHAPI_MAINTENANCE_VALUE = 33;
    /**
     * <code>ERROR_PHAPI_SERVICE_ENDED = 34;</code>
     */
    public static final int ERROR_PHAPI_SERVICE_ENDED_VALUE = 34;
    /**
     * <code>ERROR_PHAPI_UNKNOWN = 35;</code>
     */
    public static final int ERROR_PHAPI_UNKNOWN_VALUE = 35;
    /**
     * <code>ERROR_PHAPI_NAID_DOES_NOT_EXIST = 36;</code>
     */
    public static final int ERROR_PHAPI_NAID_DOES_NOT_EXIST_VALUE = 36;
    /**
     * <code>ERROR_PHAPI_NO_SPACE_IN_BOX = 37;</code>
     */
    public static final int ERROR_PHAPI_NO_SPACE_IN_BOX_VALUE = 37;
    /**
     * <code>ERROR_PHAPI_DATA_CONVERSION_FAILURE = 38;</code>
     */
    public static final int ERROR_PHAPI_DATA_CONVERSION_FAILURE_VALUE = 38;
    /**
     * <code>ERROR_PHAPI_WAITING_FOR_RECEIPT = 39;</code>
     */
    public static final int ERROR_PHAPI_WAITING_FOR_RECEIPT_VALUE = 39;
    /**
     * <code>ERROR_PHAPI_PLAYER_NOT_USING_PH_APP = 40;</code>
     */
    public static final int ERROR_PHAPI_PLAYER_NOT_USING_PH_APP_VALUE = 40;


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
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_PLAYER_LEVEL_TOO_LOW;
        case 3: return ERROR_NO_NAID_LINKED;
        case 4: return ERROR_TOO_MANY_POKEMON;
        case 5: return ERROR_SERVER_CLIENT_ENERGY_COST_MISMATCH;
        case 6: return ERROR_INSUFFICIENT_ENERGY;
        case 7: return ERROR_TRANSFER_IN_PROGRESS;
        case 10: return ERROR_POKEMON_DEPLOYED;
        case 11: return ERROR_POKEMON_IS_EGG;
        case 12: return ERROR_POKEMON_IS_BUDDY;
        case 13: return ERROR_POKEMON_BAD;
        case 14: return ERROR_POKEMON_IS_MEGA;
        case 15: return ERROR_POKEMON_FAVORITED;
        case 16: return ERROR_POKEMON_NOT_FOUND;
        case 17: return ERROR_VALIDATION_UNKNOWN;
        case 21: return ERROR_POKEMON_HAS_COSTUME;
        case 22: return ERROR_POKEMON_IS_SHADOW;
        case 23: return ERROR_POKEMON_DISALLOWED;
        case 30: return ERROR_PHAPI_REQUEST_BODY_FALSE;
        case 31: return ERROR_PHAPI_REQUEST_PARAMETERS_DNE;
        case 32: return ERROR_PHAPI_REQUEST_PARAMETERS_FALSE;
        case 33: return ERROR_PHAPI_MAINTENANCE;
        case 34: return ERROR_PHAPI_SERVICE_ENDED;
        case 35: return ERROR_PHAPI_UNKNOWN;
        case 36: return ERROR_PHAPI_NAID_DOES_NOT_EXIST;
        case 37: return ERROR_PHAPI_NO_SPACE_IN_BOX;
        case 38: return ERROR_PHAPI_DATA_CONVERSION_FAILURE;
        case 39: return ERROR_PHAPI_WAITING_FOR_RECEIPT;
        case 40: return ERROR_PHAPI_PLAYER_NOT_USING_PH_APP;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
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
      return POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
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

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status result = POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status.UNRECOGNIZED : result;
  }

  public static final int CANDY_AWARDED_FIELD_NUMBER = 2;
  private int candyAwarded_;
  /**
   * <code>int32 candy_awarded = 2;</code>
   * @return The candyAwarded.
   */
  @java.lang.Override
  public int getCandyAwarded() {
    return candyAwarded_;
  }

  public static final int XL_CANDY_AWARDED_FIELD_NUMBER = 3;
  private int xlCandyAwarded_;
  /**
   * <code>int32 xl_candy_awarded = 3;</code>
   * @return The xlCandyAwarded.
   */
  @java.lang.Override
  public int getXlCandyAwarded() {
    return xlCandyAwarded_;
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
    if (status_ != POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (candyAwarded_ != 0) {
      output.writeInt32(2, candyAwarded_);
    }
    if (xlCandyAwarded_ != 0) {
      output.writeInt32(3, xlCandyAwarded_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (candyAwarded_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, candyAwarded_);
    }
    if (xlCandyAwarded_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, xlCandyAwarded_);
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
    if (!(obj instanceof POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto other = (POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto) obj;

    if (status_ != other.status_) return false;
    if (getCandyAwarded()
        != other.getCandyAwarded()) return false;
    if (getXlCandyAwarded()
        != other.getXlCandyAwarded()) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + CANDY_AWARDED_FIELD_NUMBER;
    hash = (53 * hash) + getCandyAwarded();
    hash = (37 * hash) + XL_CANDY_AWARDED_FIELD_NUMBER;
    hash = (53 * hash) + getXlCandyAwarded();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto)
      POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TransferPokemonToPokemonHomeOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TransferPokemonToPokemonHomeOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.class, POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.newBuilder()
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
      status_ = 0;

      candyAwarded_ = 0;

      xlCandyAwarded_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TransferPokemonToPokemonHomeOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto build() {
      POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto buildPartial() {
      POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto result = new POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto(this);
      result.status_ = status_;
      result.candyAwarded_ = candyAwarded_;
      result.xlCandyAwarded_ = xlCandyAwarded_;
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
      if (other instanceof POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto) {
        return mergeFrom((POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto other) {
      if (other == POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.getCandyAwarded() != 0) {
        setCandyAwarded(other.getCandyAwarded());
      }
      if (other.getXlCandyAwarded() != 0) {
        setXlCandyAwarded(other.getXlCandyAwarded());
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
      POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status result = POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private int candyAwarded_ ;
    /**
     * <code>int32 candy_awarded = 2;</code>
     * @return The candyAwarded.
     */
    @java.lang.Override
    public int getCandyAwarded() {
      return candyAwarded_;
    }
    /**
     * <code>int32 candy_awarded = 2;</code>
     * @param value The candyAwarded to set.
     * @return This builder for chaining.
     */
    public Builder setCandyAwarded(int value) {
      
      candyAwarded_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 candy_awarded = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCandyAwarded() {
      
      candyAwarded_ = 0;
      onChanged();
      return this;
    }

    private int xlCandyAwarded_ ;
    /**
     * <code>int32 xl_candy_awarded = 3;</code>
     * @return The xlCandyAwarded.
     */
    @java.lang.Override
    public int getXlCandyAwarded() {
      return xlCandyAwarded_;
    }
    /**
     * <code>int32 xl_candy_awarded = 3;</code>
     * @param value The xlCandyAwarded to set.
     * @return This builder for chaining.
     */
    public Builder setXlCandyAwarded(int value) {
      
      xlCandyAwarded_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 xl_candy_awarded = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearXlCandyAwarded() {
      
      xlCandyAwarded_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto)
  private static final POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto();
  }

  public static POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransferPokemonToPokemonHomeOutProto>
      PARSER = new com.google.protobuf.AbstractParser<TransferPokemonToPokemonHomeOutProto>() {
    @java.lang.Override
    public TransferPokemonToPokemonHomeOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransferPokemonToPokemonHomeOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransferPokemonToPokemonHomeOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransferPokemonToPokemonHomeOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.TransferPokemonToPokemonHomeOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

