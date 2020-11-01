// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ANFPPGLBIND}
 */
public  final class ANFPPGLBIND extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ANFPPGLBIND)
    ANFPPGLBINDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ANFPPGLBIND.newBuilder() to construct.
  private ANFPPGLBIND(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ANFPPGLBIND() {
    jbflkcdndlp_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ANFPPGLBIND();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ANFPPGLBIND(
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

            jbflkcdndlp_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.GMOJPDFILEM.Builder subBuilder = null;
            if (lnhoiakmjbk_ != null) {
              subBuilder = lnhoiakmjbk_.toBuilder();
            }
            lnhoiakmjbk_ = input.readMessage(POGOProtos.Rpc.GMOJPDFILEM.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lnhoiakmjbk_);
              lnhoiakmjbk_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ANFPPGLBIND_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ANFPPGLBIND_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ANFPPGLBIND.class, POGOProtos.Rpc.ANFPPGLBIND.Builder.class);
  }

  /**
   * <pre>
   * ref: ANFPPGLBIND/NAOKAMALOFK/NLHIMKGKKKK
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK}
   */
  public enum NLHIMKGKKKK
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
    public static NLHIMKGKKKK valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NLHIMKGKKKK forNumber(int value) {
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

    public static com.google.protobuf.Internal.EnumLiteMap<NLHIMKGKKKK>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NLHIMKGKKKK> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NLHIMKGKKKK>() {
            public NLHIMKGKKKK findValueByNumber(int number) {
              return NLHIMKGKKKK.forNumber(number);
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
      return POGOProtos.Rpc.ANFPPGLBIND.getDescriptor().getEnumTypes().get(0);
    }

    private static final NLHIMKGKKKK[] VALUES = values();

    public static NLHIMKGKKKK valueOf(
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

    private NLHIMKGKKKK(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK)
  }

  public static final int JBFLKCDNDLP_FIELD_NUMBER = 1;
  private int jbflkcdndlp_;
  /**
   * <code>.POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK jbflkcdndlp = 1;</code>
   * @return The enum numeric value on the wire for jbflkcdndlp.
   */
  public int getJbflkcdndlpValue() {
    return jbflkcdndlp_;
  }
  /**
   * <code>.POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK jbflkcdndlp = 1;</code>
   * @return The jbflkcdndlp.
   */
  public POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK getJbflkcdndlp() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK result = POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK.valueOf(jbflkcdndlp_);
    return result == null ? POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK.UNRECOGNIZED : result;
  }

  public static final int LNHOIAKMJBK_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk_;
  /**
   * <code>.POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk = 2;</code>
   * @return Whether the lnhoiakmjbk field is set.
   */
  public boolean hasLnhoiakmjbk() {
    return lnhoiakmjbk_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk = 2;</code>
   * @return The lnhoiakmjbk.
   */
  public POGOProtos.Rpc.GMOJPDFILEM getLnhoiakmjbk() {
    return lnhoiakmjbk_ == null ? POGOProtos.Rpc.GMOJPDFILEM.getDefaultInstance() : lnhoiakmjbk_;
  }
  /**
   * <code>.POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk = 2;</code>
   */
  public POGOProtos.Rpc.GMOJPDFILEMOrBuilder getLnhoiakmjbkOrBuilder() {
    return getLnhoiakmjbk();
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
    if (jbflkcdndlp_ != POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK.UNSET.getNumber()) {
      output.writeEnum(1, jbflkcdndlp_);
    }
    if (lnhoiakmjbk_ != null) {
      output.writeMessage(2, getLnhoiakmjbk());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jbflkcdndlp_ != POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, jbflkcdndlp_);
    }
    if (lnhoiakmjbk_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLnhoiakmjbk());
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
    if (!(obj instanceof POGOProtos.Rpc.ANFPPGLBIND)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ANFPPGLBIND other = (POGOProtos.Rpc.ANFPPGLBIND) obj;

    if (jbflkcdndlp_ != other.jbflkcdndlp_) return false;
    if (hasLnhoiakmjbk() != other.hasLnhoiakmjbk()) return false;
    if (hasLnhoiakmjbk()) {
      if (!getLnhoiakmjbk()
          .equals(other.getLnhoiakmjbk())) return false;
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
    hash = (37 * hash) + JBFLKCDNDLP_FIELD_NUMBER;
    hash = (53 * hash) + jbflkcdndlp_;
    if (hasLnhoiakmjbk()) {
      hash = (37 * hash) + LNHOIAKMJBK_FIELD_NUMBER;
      hash = (53 * hash) + getLnhoiakmjbk().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ANFPPGLBIND parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ANFPPGLBIND parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ANFPPGLBIND parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ANFPPGLBIND parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ANFPPGLBIND parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ANFPPGLBIND parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ANFPPGLBIND parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ANFPPGLBIND parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ANFPPGLBIND parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ANFPPGLBIND parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ANFPPGLBIND parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ANFPPGLBIND parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ANFPPGLBIND prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ANFPPGLBIND}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ANFPPGLBIND)
      POGOProtos.Rpc.ANFPPGLBINDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ANFPPGLBIND_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ANFPPGLBIND_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ANFPPGLBIND.class, POGOProtos.Rpc.ANFPPGLBIND.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ANFPPGLBIND.newBuilder()
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
      jbflkcdndlp_ = 0;

      if (lnhoiakmjbkBuilder_ == null) {
        lnhoiakmjbk_ = null;
      } else {
        lnhoiakmjbk_ = null;
        lnhoiakmjbkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ANFPPGLBIND_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ANFPPGLBIND getDefaultInstanceForType() {
      return POGOProtos.Rpc.ANFPPGLBIND.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ANFPPGLBIND build() {
      POGOProtos.Rpc.ANFPPGLBIND result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ANFPPGLBIND buildPartial() {
      POGOProtos.Rpc.ANFPPGLBIND result = new POGOProtos.Rpc.ANFPPGLBIND(this);
      result.jbflkcdndlp_ = jbflkcdndlp_;
      if (lnhoiakmjbkBuilder_ == null) {
        result.lnhoiakmjbk_ = lnhoiakmjbk_;
      } else {
        result.lnhoiakmjbk_ = lnhoiakmjbkBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.ANFPPGLBIND) {
        return mergeFrom((POGOProtos.Rpc.ANFPPGLBIND)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ANFPPGLBIND other) {
      if (other == POGOProtos.Rpc.ANFPPGLBIND.getDefaultInstance()) return this;
      if (other.jbflkcdndlp_ != 0) {
        setJbflkcdndlpValue(other.getJbflkcdndlpValue());
      }
      if (other.hasLnhoiakmjbk()) {
        mergeLnhoiakmjbk(other.getLnhoiakmjbk());
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
      POGOProtos.Rpc.ANFPPGLBIND parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ANFPPGLBIND) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int jbflkcdndlp_ = 0;
    /**
     * <code>.POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK jbflkcdndlp = 1;</code>
     * @return The enum numeric value on the wire for jbflkcdndlp.
     */
    public int getJbflkcdndlpValue() {
      return jbflkcdndlp_;
    }
    /**
     * <code>.POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK jbflkcdndlp = 1;</code>
     * @param value The enum numeric value on the wire for jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlpValue(int value) {
      jbflkcdndlp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK jbflkcdndlp = 1;</code>
     * @return The jbflkcdndlp.
     */
    public POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK getJbflkcdndlp() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK result = POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK.valueOf(jbflkcdndlp_);
      return result == null ? POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK jbflkcdndlp = 1;</code>
     * @param value The jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlp(POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jbflkcdndlp_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ANFPPGLBIND.NLHIMKGKKKK jbflkcdndlp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJbflkcdndlp() {
      
      jbflkcdndlp_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GMOJPDFILEM, POGOProtos.Rpc.GMOJPDFILEM.Builder, POGOProtos.Rpc.GMOJPDFILEMOrBuilder> lnhoiakmjbkBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk = 2;</code>
     * @return Whether the lnhoiakmjbk field is set.
     */
    public boolean hasLnhoiakmjbk() {
      return lnhoiakmjbkBuilder_ != null || lnhoiakmjbk_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk = 2;</code>
     * @return The lnhoiakmjbk.
     */
    public POGOProtos.Rpc.GMOJPDFILEM getLnhoiakmjbk() {
      if (lnhoiakmjbkBuilder_ == null) {
        return lnhoiakmjbk_ == null ? POGOProtos.Rpc.GMOJPDFILEM.getDefaultInstance() : lnhoiakmjbk_;
      } else {
        return lnhoiakmjbkBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk = 2;</code>
     */
    public Builder setLnhoiakmjbk(POGOProtos.Rpc.GMOJPDFILEM value) {
      if (lnhoiakmjbkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lnhoiakmjbk_ = value;
        onChanged();
      } else {
        lnhoiakmjbkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk = 2;</code>
     */
    public Builder setLnhoiakmjbk(
        POGOProtos.Rpc.GMOJPDFILEM.Builder builderForValue) {
      if (lnhoiakmjbkBuilder_ == null) {
        lnhoiakmjbk_ = builderForValue.build();
        onChanged();
      } else {
        lnhoiakmjbkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk = 2;</code>
     */
    public Builder mergeLnhoiakmjbk(POGOProtos.Rpc.GMOJPDFILEM value) {
      if (lnhoiakmjbkBuilder_ == null) {
        if (lnhoiakmjbk_ != null) {
          lnhoiakmjbk_ =
            POGOProtos.Rpc.GMOJPDFILEM.newBuilder(lnhoiakmjbk_).mergeFrom(value).buildPartial();
        } else {
          lnhoiakmjbk_ = value;
        }
        onChanged();
      } else {
        lnhoiakmjbkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk = 2;</code>
     */
    public Builder clearLnhoiakmjbk() {
      if (lnhoiakmjbkBuilder_ == null) {
        lnhoiakmjbk_ = null;
        onChanged();
      } else {
        lnhoiakmjbk_ = null;
        lnhoiakmjbkBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk = 2;</code>
     */
    public POGOProtos.Rpc.GMOJPDFILEM.Builder getLnhoiakmjbkBuilder() {
      
      onChanged();
      return getLnhoiakmjbkFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk = 2;</code>
     */
    public POGOProtos.Rpc.GMOJPDFILEMOrBuilder getLnhoiakmjbkOrBuilder() {
      if (lnhoiakmjbkBuilder_ != null) {
        return lnhoiakmjbkBuilder_.getMessageOrBuilder();
      } else {
        return lnhoiakmjbk_ == null ?
            POGOProtos.Rpc.GMOJPDFILEM.getDefaultInstance() : lnhoiakmjbk_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GMOJPDFILEM lnhoiakmjbk = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GMOJPDFILEM, POGOProtos.Rpc.GMOJPDFILEM.Builder, POGOProtos.Rpc.GMOJPDFILEMOrBuilder> 
        getLnhoiakmjbkFieldBuilder() {
      if (lnhoiakmjbkBuilder_ == null) {
        lnhoiakmjbkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.GMOJPDFILEM, POGOProtos.Rpc.GMOJPDFILEM.Builder, POGOProtos.Rpc.GMOJPDFILEMOrBuilder>(
                getLnhoiakmjbk(),
                getParentForChildren(),
                isClean());
        lnhoiakmjbk_ = null;
      }
      return lnhoiakmjbkBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ANFPPGLBIND)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ANFPPGLBIND)
  private static final POGOProtos.Rpc.ANFPPGLBIND DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ANFPPGLBIND();
  }

  public static POGOProtos.Rpc.ANFPPGLBIND getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ANFPPGLBIND>
      PARSER = new com.google.protobuf.AbstractParser<ANFPPGLBIND>() {
    @java.lang.Override
    public ANFPPGLBIND parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ANFPPGLBIND(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ANFPPGLBIND> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ANFPPGLBIND> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ANFPPGLBIND getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

