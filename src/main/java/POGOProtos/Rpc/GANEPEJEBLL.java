// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: GANEPEJEBLL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GANEPEJEBLL}
 */
public final class GANEPEJEBLL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GANEPEJEBLL)
    GANEPEJEBLLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GANEPEJEBLL.newBuilder() to construct.
  private GANEPEJEBLL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GANEPEJEBLL() {
    lcajjpmoafe_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GANEPEJEBLL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GANEPEJEBLL(
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
            POGOProtos.Rpc.HPPJBPLGEHK.Builder subBuilder = null;
            if (nlhmfojnjge_ != null) {
              subBuilder = nlhmfojnjge_.toBuilder();
            }
            nlhmfojnjge_ = input.readMessage(POGOProtos.Rpc.HPPJBPLGEHK.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nlhmfojnjge_);
              nlhmfojnjge_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GANEPEJEBLL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GANEPEJEBLL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GANEPEJEBLL.class, POGOProtos.Rpc.GANEPEJEBLL.Builder.class);
  }

  /**
   * <pre>
   * ref: GANEPEJEBLL/IFAAHKHGPHL/BHOPCLNKOGO
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO}
   */
  public enum BHOPCLNKOGO
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
     * <code>ERROR_GYM_NOT_FOUND = 2;</code>
     */
    ERROR_GYM_NOT_FOUND(2),
    /**
     * <code>ERROR_RAID_UNAVAILABLE = 3;</code>
     */
    ERROR_RAID_UNAVAILABLE(3),
    /**
     * <code>ERROR_RAID_COMPLETED = 4;</code>
     */
    ERROR_RAID_COMPLETED(4),
    /**
     * <code>ERROR_INVALID_ATTACKERS = 5;</code>
     */
    ERROR_INVALID_ATTACKERS(5),
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 6;</code>
     */
    ERROR_PLAYER_BELOW_MINIMUM_LEVEL(6),
    /**
     * <code>ERROR_NOT_IN_RANGE = 7;</code>
     */
    ERROR_NOT_IN_RANGE(7),
    /**
     * <code>ERROR_POI_INACCESSIBLE = 8;</code>
     */
    ERROR_POI_INACCESSIBLE(8),
    /**
     * <code>ERROR_LOBBY_NOT_FOUND = 9;</code>
     */
    ERROR_LOBBY_NOT_FOUND(9),
    /**
     * <code>ERROR_NO_TICKET = 10;</code>
     */
    ERROR_NO_TICKET(10),
    /**
     * <code>ERROR_INVALID_SERVER = 11;</code>
     */
    ERROR_INVALID_SERVER(11),
    /**
     * <code>ERROR_NEVER_JOINED_BATTLE = 12;</code>
     */
    ERROR_NEVER_JOINED_BATTLE(12),
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
     * <code>ERROR_GYM_NOT_FOUND = 2;</code>
     */
    public static final int ERROR_GYM_NOT_FOUND_VALUE = 2;
    /**
     * <code>ERROR_RAID_UNAVAILABLE = 3;</code>
     */
    public static final int ERROR_RAID_UNAVAILABLE_VALUE = 3;
    /**
     * <code>ERROR_RAID_COMPLETED = 4;</code>
     */
    public static final int ERROR_RAID_COMPLETED_VALUE = 4;
    /**
     * <code>ERROR_INVALID_ATTACKERS = 5;</code>
     */
    public static final int ERROR_INVALID_ATTACKERS_VALUE = 5;
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 6;</code>
     */
    public static final int ERROR_PLAYER_BELOW_MINIMUM_LEVEL_VALUE = 6;
    /**
     * <code>ERROR_NOT_IN_RANGE = 7;</code>
     */
    public static final int ERROR_NOT_IN_RANGE_VALUE = 7;
    /**
     * <code>ERROR_POI_INACCESSIBLE = 8;</code>
     */
    public static final int ERROR_POI_INACCESSIBLE_VALUE = 8;
    /**
     * <code>ERROR_LOBBY_NOT_FOUND = 9;</code>
     */
    public static final int ERROR_LOBBY_NOT_FOUND_VALUE = 9;
    /**
     * <code>ERROR_NO_TICKET = 10;</code>
     */
    public static final int ERROR_NO_TICKET_VALUE = 10;
    /**
     * <code>ERROR_INVALID_SERVER = 11;</code>
     */
    public static final int ERROR_INVALID_SERVER_VALUE = 11;
    /**
     * <code>ERROR_NEVER_JOINED_BATTLE = 12;</code>
     */
    public static final int ERROR_NEVER_JOINED_BATTLE_VALUE = 12;


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
    public static BHOPCLNKOGO valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BHOPCLNKOGO forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_GYM_NOT_FOUND;
        case 3: return ERROR_RAID_UNAVAILABLE;
        case 4: return ERROR_RAID_COMPLETED;
        case 5: return ERROR_INVALID_ATTACKERS;
        case 6: return ERROR_PLAYER_BELOW_MINIMUM_LEVEL;
        case 7: return ERROR_NOT_IN_RANGE;
        case 8: return ERROR_POI_INACCESSIBLE;
        case 9: return ERROR_LOBBY_NOT_FOUND;
        case 10: return ERROR_NO_TICKET;
        case 11: return ERROR_INVALID_SERVER;
        case 12: return ERROR_NEVER_JOINED_BATTLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BHOPCLNKOGO>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BHOPCLNKOGO> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BHOPCLNKOGO>() {
            public BHOPCLNKOGO findValueByNumber(int number) {
              return BHOPCLNKOGO.forNumber(number);
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
      return POGOProtos.Rpc.GANEPEJEBLL.getDescriptor().getEnumTypes().get(0);
    }

    private static final BHOPCLNKOGO[] VALUES = values();

    public static BHOPCLNKOGO valueOf(
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

    private BHOPCLNKOGO(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO)
  }

  public static final int LCAJJPMOAFE_FIELD_NUMBER = 1;
  private int lcajjpmoafe_;
  /**
   * <code>.POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO lcajjpmoafe = 1;</code>
   * @return The enum numeric value on the wire for lcajjpmoafe.
   */
  @java.lang.Override public int getLcajjpmoafeValue() {
    return lcajjpmoafe_;
  }
  /**
   * <code>.POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO lcajjpmoafe = 1;</code>
   * @return The lcajjpmoafe.
   */
  @java.lang.Override public POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO getLcajjpmoafe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO result = POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO.valueOf(lcajjpmoafe_);
    return result == null ? POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO.UNRECOGNIZED : result;
  }

  public static final int NLHMFOJNJGE_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge_;
  /**
   * <code>.POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge = 2;</code>
   * @return Whether the nlhmfojnjge field is set.
   */
  @java.lang.Override
  public boolean hasNlhmfojnjge() {
    return nlhmfojnjge_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge = 2;</code>
   * @return The nlhmfojnjge.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HPPJBPLGEHK getNlhmfojnjge() {
    return nlhmfojnjge_ == null ? POGOProtos.Rpc.HPPJBPLGEHK.getDefaultInstance() : nlhmfojnjge_;
  }
  /**
   * <code>.POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.HPPJBPLGEHKOrBuilder getNlhmfojnjgeOrBuilder() {
    return getNlhmfojnjge();
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
    if (lcajjpmoafe_ != POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO.UNSET.getNumber()) {
      output.writeEnum(1, lcajjpmoafe_);
    }
    if (nlhmfojnjge_ != null) {
      output.writeMessage(2, getNlhmfojnjge());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lcajjpmoafe_ != POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lcajjpmoafe_);
    }
    if (nlhmfojnjge_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNlhmfojnjge());
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
    if (!(obj instanceof POGOProtos.Rpc.GANEPEJEBLL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GANEPEJEBLL other = (POGOProtos.Rpc.GANEPEJEBLL) obj;

    if (lcajjpmoafe_ != other.lcajjpmoafe_) return false;
    if (hasNlhmfojnjge() != other.hasNlhmfojnjge()) return false;
    if (hasNlhmfojnjge()) {
      if (!getNlhmfojnjge()
          .equals(other.getNlhmfojnjge())) return false;
    }
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
    if (hasNlhmfojnjge()) {
      hash = (37 * hash) + NLHMFOJNJGE_FIELD_NUMBER;
      hash = (53 * hash) + getNlhmfojnjge().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GANEPEJEBLL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GANEPEJEBLL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GANEPEJEBLL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GANEPEJEBLL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GANEPEJEBLL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GANEPEJEBLL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GANEPEJEBLL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GANEPEJEBLL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GANEPEJEBLL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GANEPEJEBLL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GANEPEJEBLL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GANEPEJEBLL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GANEPEJEBLL prototype) {
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
   * ref: GANEPEJEBLL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GANEPEJEBLL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GANEPEJEBLL)
      POGOProtos.Rpc.GANEPEJEBLLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GANEPEJEBLL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GANEPEJEBLL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GANEPEJEBLL.class, POGOProtos.Rpc.GANEPEJEBLL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GANEPEJEBLL.newBuilder()
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

      if (nlhmfojnjgeBuilder_ == null) {
        nlhmfojnjge_ = null;
      } else {
        nlhmfojnjge_ = null;
        nlhmfojnjgeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GANEPEJEBLL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GANEPEJEBLL getDefaultInstanceForType() {
      return POGOProtos.Rpc.GANEPEJEBLL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GANEPEJEBLL build() {
      POGOProtos.Rpc.GANEPEJEBLL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GANEPEJEBLL buildPartial() {
      POGOProtos.Rpc.GANEPEJEBLL result = new POGOProtos.Rpc.GANEPEJEBLL(this);
      result.lcajjpmoafe_ = lcajjpmoafe_;
      if (nlhmfojnjgeBuilder_ == null) {
        result.nlhmfojnjge_ = nlhmfojnjge_;
      } else {
        result.nlhmfojnjge_ = nlhmfojnjgeBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.GANEPEJEBLL) {
        return mergeFrom((POGOProtos.Rpc.GANEPEJEBLL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GANEPEJEBLL other) {
      if (other == POGOProtos.Rpc.GANEPEJEBLL.getDefaultInstance()) return this;
      if (other.lcajjpmoafe_ != 0) {
        setLcajjpmoafeValue(other.getLcajjpmoafeValue());
      }
      if (other.hasNlhmfojnjge()) {
        mergeNlhmfojnjge(other.getNlhmfojnjge());
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
      POGOProtos.Rpc.GANEPEJEBLL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GANEPEJEBLL) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO lcajjpmoafe = 1;</code>
     * @return The enum numeric value on the wire for lcajjpmoafe.
     */
    @java.lang.Override public int getLcajjpmoafeValue() {
      return lcajjpmoafe_;
    }
    /**
     * <code>.POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO lcajjpmoafe = 1;</code>
     * @param value The enum numeric value on the wire for lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafeValue(int value) {
      
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO lcajjpmoafe = 1;</code>
     * @return The lcajjpmoafe.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO getLcajjpmoafe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO result = POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO.valueOf(lcajjpmoafe_);
      return result == null ? POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO lcajjpmoafe = 1;</code>
     * @param value The lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafe(POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lcajjpmoafe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GANEPEJEBLL.BHOPCLNKOGO lcajjpmoafe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcajjpmoafe() {
      
      lcajjpmoafe_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HPPJBPLGEHK, POGOProtos.Rpc.HPPJBPLGEHK.Builder, POGOProtos.Rpc.HPPJBPLGEHKOrBuilder> nlhmfojnjgeBuilder_;
    /**
     * <code>.POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge = 2;</code>
     * @return Whether the nlhmfojnjge field is set.
     */
    public boolean hasNlhmfojnjge() {
      return nlhmfojnjgeBuilder_ != null || nlhmfojnjge_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge = 2;</code>
     * @return The nlhmfojnjge.
     */
    public POGOProtos.Rpc.HPPJBPLGEHK getNlhmfojnjge() {
      if (nlhmfojnjgeBuilder_ == null) {
        return nlhmfojnjge_ == null ? POGOProtos.Rpc.HPPJBPLGEHK.getDefaultInstance() : nlhmfojnjge_;
      } else {
        return nlhmfojnjgeBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge = 2;</code>
     */
    public Builder setNlhmfojnjge(POGOProtos.Rpc.HPPJBPLGEHK value) {
      if (nlhmfojnjgeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nlhmfojnjge_ = value;
        onChanged();
      } else {
        nlhmfojnjgeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge = 2;</code>
     */
    public Builder setNlhmfojnjge(
        POGOProtos.Rpc.HPPJBPLGEHK.Builder builderForValue) {
      if (nlhmfojnjgeBuilder_ == null) {
        nlhmfojnjge_ = builderForValue.build();
        onChanged();
      } else {
        nlhmfojnjgeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge = 2;</code>
     */
    public Builder mergeNlhmfojnjge(POGOProtos.Rpc.HPPJBPLGEHK value) {
      if (nlhmfojnjgeBuilder_ == null) {
        if (nlhmfojnjge_ != null) {
          nlhmfojnjge_ =
            POGOProtos.Rpc.HPPJBPLGEHK.newBuilder(nlhmfojnjge_).mergeFrom(value).buildPartial();
        } else {
          nlhmfojnjge_ = value;
        }
        onChanged();
      } else {
        nlhmfojnjgeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge = 2;</code>
     */
    public Builder clearNlhmfojnjge() {
      if (nlhmfojnjgeBuilder_ == null) {
        nlhmfojnjge_ = null;
        onChanged();
      } else {
        nlhmfojnjge_ = null;
        nlhmfojnjgeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge = 2;</code>
     */
    public POGOProtos.Rpc.HPPJBPLGEHK.Builder getNlhmfojnjgeBuilder() {
      
      onChanged();
      return getNlhmfojnjgeFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge = 2;</code>
     */
    public POGOProtos.Rpc.HPPJBPLGEHKOrBuilder getNlhmfojnjgeOrBuilder() {
      if (nlhmfojnjgeBuilder_ != null) {
        return nlhmfojnjgeBuilder_.getMessageOrBuilder();
      } else {
        return nlhmfojnjge_ == null ?
            POGOProtos.Rpc.HPPJBPLGEHK.getDefaultInstance() : nlhmfojnjge_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HPPJBPLGEHK nlhmfojnjge = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HPPJBPLGEHK, POGOProtos.Rpc.HPPJBPLGEHK.Builder, POGOProtos.Rpc.HPPJBPLGEHKOrBuilder> 
        getNlhmfojnjgeFieldBuilder() {
      if (nlhmfojnjgeBuilder_ == null) {
        nlhmfojnjgeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.HPPJBPLGEHK, POGOProtos.Rpc.HPPJBPLGEHK.Builder, POGOProtos.Rpc.HPPJBPLGEHKOrBuilder>(
                getNlhmfojnjge(),
                getParentForChildren(),
                isClean());
        nlhmfojnjge_ = null;
      }
      return nlhmfojnjgeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GANEPEJEBLL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GANEPEJEBLL)
  private static final POGOProtos.Rpc.GANEPEJEBLL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GANEPEJEBLL();
  }

  public static POGOProtos.Rpc.GANEPEJEBLL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GANEPEJEBLL>
      PARSER = new com.google.protobuf.AbstractParser<GANEPEJEBLL>() {
    @java.lang.Override
    public GANEPEJEBLL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GANEPEJEBLL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GANEPEJEBLL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GANEPEJEBLL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GANEPEJEBLL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

