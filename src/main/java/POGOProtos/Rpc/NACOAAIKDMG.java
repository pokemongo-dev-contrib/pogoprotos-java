// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NACOAAIKDMG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NACOAAIKDMG}
 */
public final class NACOAAIKDMG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NACOAAIKDMG)
    NACOAAIKDMGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NACOAAIKDMG.newBuilder() to construct.
  private NACOAAIKDMG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NACOAAIKDMG() {
    bimeaijafjk_ = "";
    ppiopehpfop_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NACOAAIKDMG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NACOAAIKDMG(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            bimeaijafjk_ = s;
            break;
          }
          case 16: {

            idpniopmoad_ = input.readInt64();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            ppiopehpfop_ = rawValue;
            break;
          }
          case 32: {

            feckikndmgh_ = input.readInt32();
            break;
          }
          case 40: {

            nggkfeakpca_ = input.readUInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NACOAAIKDMG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NACOAAIKDMG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NACOAAIKDMG.class, POGOProtos.Rpc.NACOAAIKDMG.Builder.class);
  }

  /**
   * <pre>
   * ref: NACOAAIKDMG/PNHEGJKLIEC/IOGLHFPJEGD
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD}
   */
  public enum IOGLHFPJEGD
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>POKEMON_FED = 1;</code>
     */
    POKEMON_FED(1),
    /**
     * <code>POKEMON_DEPLOYED = 2;</code>
     */
    POKEMON_DEPLOYED(2),
    /**
     * <code>POKEMON_RETURNED = 3;</code>
     */
    POKEMON_RETURNED(3),
    /**
     * <code>BATTLE_WON = 4;</code>
     */
    BATTLE_WON(4),
    /**
     * <code>BATTLE_LOSS = 5;</code>
     */
    BATTLE_LOSS(5),
    /**
     * <code>RAID_STARTED = 6;</code>
     */
    RAID_STARTED(6),
    /**
     * <code>RAID_ENDED = 7;</code>
     */
    RAID_ENDED(7),
    /**
     * <code>GYM_NEUTRALIZED = 8;</code>
     */
    GYM_NEUTRALIZED(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>POKEMON_FED = 1;</code>
     */
    public static final int POKEMON_FED_VALUE = 1;
    /**
     * <code>POKEMON_DEPLOYED = 2;</code>
     */
    public static final int POKEMON_DEPLOYED_VALUE = 2;
    /**
     * <code>POKEMON_RETURNED = 3;</code>
     */
    public static final int POKEMON_RETURNED_VALUE = 3;
    /**
     * <code>BATTLE_WON = 4;</code>
     */
    public static final int BATTLE_WON_VALUE = 4;
    /**
     * <code>BATTLE_LOSS = 5;</code>
     */
    public static final int BATTLE_LOSS_VALUE = 5;
    /**
     * <code>RAID_STARTED = 6;</code>
     */
    public static final int RAID_STARTED_VALUE = 6;
    /**
     * <code>RAID_ENDED = 7;</code>
     */
    public static final int RAID_ENDED_VALUE = 7;
    /**
     * <code>GYM_NEUTRALIZED = 8;</code>
     */
    public static final int GYM_NEUTRALIZED_VALUE = 8;


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
    public static IOGLHFPJEGD valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IOGLHFPJEGD forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return POKEMON_FED;
        case 2: return POKEMON_DEPLOYED;
        case 3: return POKEMON_RETURNED;
        case 4: return BATTLE_WON;
        case 5: return BATTLE_LOSS;
        case 6: return RAID_STARTED;
        case 7: return RAID_ENDED;
        case 8: return GYM_NEUTRALIZED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IOGLHFPJEGD>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IOGLHFPJEGD> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IOGLHFPJEGD>() {
            public IOGLHFPJEGD findValueByNumber(int number) {
              return IOGLHFPJEGD.forNumber(number);
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
      return POGOProtos.Rpc.NACOAAIKDMG.getDescriptor().getEnumTypes().get(0);
    }

    private static final IOGLHFPJEGD[] VALUES = values();

    public static IOGLHFPJEGD valueOf(
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

    private IOGLHFPJEGD(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD)
  }

  public static final int BIMEAIJAFJK_FIELD_NUMBER = 1;
  private volatile java.lang.Object bimeaijafjk_;
  /**
   * <code>string bimeaijafjk = 1;</code>
   * @return The bimeaijafjk.
   */
  @java.lang.Override
  public java.lang.String getBimeaijafjk() {
    java.lang.Object ref = bimeaijafjk_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bimeaijafjk_ = s;
      return s;
    }
  }
  /**
   * <code>string bimeaijafjk = 1;</code>
   * @return The bytes for bimeaijafjk.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBimeaijafjkBytes() {
    java.lang.Object ref = bimeaijafjk_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bimeaijafjk_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDPNIOPMOAD_FIELD_NUMBER = 2;
  private long idpniopmoad_;
  /**
   * <code>int64 idpniopmoad = 2;</code>
   * @return The idpniopmoad.
   */
  @java.lang.Override
  public long getIdpniopmoad() {
    return idpniopmoad_;
  }

  public static final int PPIOPEHPFOP_FIELD_NUMBER = 3;
  private int ppiopehpfop_;
  /**
   * <code>.POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD ppiopehpfop = 3;</code>
   * @return The enum numeric value on the wire for ppiopehpfop.
   */
  @java.lang.Override public int getPpiopehpfopValue() {
    return ppiopehpfop_;
  }
  /**
   * <code>.POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD ppiopehpfop = 3;</code>
   * @return The ppiopehpfop.
   */
  @java.lang.Override public POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD getPpiopehpfop() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD result = POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD.valueOf(ppiopehpfop_);
    return result == null ? POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD.UNRECOGNIZED : result;
  }

  public static final int FECKIKNDMGH_FIELD_NUMBER = 4;
  private int feckikndmgh_;
  /**
   * <code>int32 feckikndmgh = 4;</code>
   * @return The feckikndmgh.
   */
  @java.lang.Override
  public int getFeckikndmgh() {
    return feckikndmgh_;
  }

  public static final int NGGKFEAKPCA_FIELD_NUMBER = 5;
  private long nggkfeakpca_;
  /**
   * <code>uint64 nggkfeakpca = 5;</code>
   * @return The nggkfeakpca.
   */
  @java.lang.Override
  public long getNggkfeakpca() {
    return nggkfeakpca_;
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
    if (!getBimeaijafjkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bimeaijafjk_);
    }
    if (idpniopmoad_ != 0L) {
      output.writeInt64(2, idpniopmoad_);
    }
    if (ppiopehpfop_ != POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD.UNKNOWN.getNumber()) {
      output.writeEnum(3, ppiopehpfop_);
    }
    if (feckikndmgh_ != 0) {
      output.writeInt32(4, feckikndmgh_);
    }
    if (nggkfeakpca_ != 0L) {
      output.writeUInt64(5, nggkfeakpca_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBimeaijafjkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bimeaijafjk_);
    }
    if (idpniopmoad_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, idpniopmoad_);
    }
    if (ppiopehpfop_ != POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, ppiopehpfop_);
    }
    if (feckikndmgh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, feckikndmgh_);
    }
    if (nggkfeakpca_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, nggkfeakpca_);
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
    if (!(obj instanceof POGOProtos.Rpc.NACOAAIKDMG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NACOAAIKDMG other = (POGOProtos.Rpc.NACOAAIKDMG) obj;

    if (!getBimeaijafjk()
        .equals(other.getBimeaijafjk())) return false;
    if (getIdpniopmoad()
        != other.getIdpniopmoad()) return false;
    if (ppiopehpfop_ != other.ppiopehpfop_) return false;
    if (getFeckikndmgh()
        != other.getFeckikndmgh()) return false;
    if (getNggkfeakpca()
        != other.getNggkfeakpca()) return false;
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
    hash = (37 * hash) + BIMEAIJAFJK_FIELD_NUMBER;
    hash = (53 * hash) + getBimeaijafjk().hashCode();
    hash = (37 * hash) + IDPNIOPMOAD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIdpniopmoad());
    hash = (37 * hash) + PPIOPEHPFOP_FIELD_NUMBER;
    hash = (53 * hash) + ppiopehpfop_;
    hash = (37 * hash) + FECKIKNDMGH_FIELD_NUMBER;
    hash = (53 * hash) + getFeckikndmgh();
    hash = (37 * hash) + NGGKFEAKPCA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNggkfeakpca());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NACOAAIKDMG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NACOAAIKDMG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NACOAAIKDMG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NACOAAIKDMG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NACOAAIKDMG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NACOAAIKDMG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NACOAAIKDMG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NACOAAIKDMG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NACOAAIKDMG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NACOAAIKDMG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NACOAAIKDMG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NACOAAIKDMG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NACOAAIKDMG prototype) {
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
   * ref: NACOAAIKDMG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NACOAAIKDMG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NACOAAIKDMG)
      POGOProtos.Rpc.NACOAAIKDMGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NACOAAIKDMG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NACOAAIKDMG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NACOAAIKDMG.class, POGOProtos.Rpc.NACOAAIKDMG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NACOAAIKDMG.newBuilder()
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
      bimeaijafjk_ = "";

      idpniopmoad_ = 0L;

      ppiopehpfop_ = 0;

      feckikndmgh_ = 0;

      nggkfeakpca_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NACOAAIKDMG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NACOAAIKDMG getDefaultInstanceForType() {
      return POGOProtos.Rpc.NACOAAIKDMG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NACOAAIKDMG build() {
      POGOProtos.Rpc.NACOAAIKDMG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NACOAAIKDMG buildPartial() {
      POGOProtos.Rpc.NACOAAIKDMG result = new POGOProtos.Rpc.NACOAAIKDMG(this);
      result.bimeaijafjk_ = bimeaijafjk_;
      result.idpniopmoad_ = idpniopmoad_;
      result.ppiopehpfop_ = ppiopehpfop_;
      result.feckikndmgh_ = feckikndmgh_;
      result.nggkfeakpca_ = nggkfeakpca_;
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
      if (other instanceof POGOProtos.Rpc.NACOAAIKDMG) {
        return mergeFrom((POGOProtos.Rpc.NACOAAIKDMG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NACOAAIKDMG other) {
      if (other == POGOProtos.Rpc.NACOAAIKDMG.getDefaultInstance()) return this;
      if (!other.getBimeaijafjk().isEmpty()) {
        bimeaijafjk_ = other.bimeaijafjk_;
        onChanged();
      }
      if (other.getIdpniopmoad() != 0L) {
        setIdpniopmoad(other.getIdpniopmoad());
      }
      if (other.ppiopehpfop_ != 0) {
        setPpiopehpfopValue(other.getPpiopehpfopValue());
      }
      if (other.getFeckikndmgh() != 0) {
        setFeckikndmgh(other.getFeckikndmgh());
      }
      if (other.getNggkfeakpca() != 0L) {
        setNggkfeakpca(other.getNggkfeakpca());
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
      POGOProtos.Rpc.NACOAAIKDMG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NACOAAIKDMG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object bimeaijafjk_ = "";
    /**
     * <code>string bimeaijafjk = 1;</code>
     * @return The bimeaijafjk.
     */
    public java.lang.String getBimeaijafjk() {
      java.lang.Object ref = bimeaijafjk_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bimeaijafjk_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bimeaijafjk = 1;</code>
     * @return The bytes for bimeaijafjk.
     */
    public com.google.protobuf.ByteString
        getBimeaijafjkBytes() {
      java.lang.Object ref = bimeaijafjk_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bimeaijafjk_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bimeaijafjk = 1;</code>
     * @param value The bimeaijafjk to set.
     * @return This builder for chaining.
     */
    public Builder setBimeaijafjk(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bimeaijafjk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bimeaijafjk = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBimeaijafjk() {
      
      bimeaijafjk_ = getDefaultInstance().getBimeaijafjk();
      onChanged();
      return this;
    }
    /**
     * <code>string bimeaijafjk = 1;</code>
     * @param value The bytes for bimeaijafjk to set.
     * @return This builder for chaining.
     */
    public Builder setBimeaijafjkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bimeaijafjk_ = value;
      onChanged();
      return this;
    }

    private long idpniopmoad_ ;
    /**
     * <code>int64 idpniopmoad = 2;</code>
     * @return The idpniopmoad.
     */
    @java.lang.Override
    public long getIdpniopmoad() {
      return idpniopmoad_;
    }
    /**
     * <code>int64 idpniopmoad = 2;</code>
     * @param value The idpniopmoad to set.
     * @return This builder for chaining.
     */
    public Builder setIdpniopmoad(long value) {
      
      idpniopmoad_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 idpniopmoad = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdpniopmoad() {
      
      idpniopmoad_ = 0L;
      onChanged();
      return this;
    }

    private int ppiopehpfop_ = 0;
    /**
     * <code>.POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD ppiopehpfop = 3;</code>
     * @return The enum numeric value on the wire for ppiopehpfop.
     */
    @java.lang.Override public int getPpiopehpfopValue() {
      return ppiopehpfop_;
    }
    /**
     * <code>.POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD ppiopehpfop = 3;</code>
     * @param value The enum numeric value on the wire for ppiopehpfop to set.
     * @return This builder for chaining.
     */
    public Builder setPpiopehpfopValue(int value) {
      
      ppiopehpfop_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD ppiopehpfop = 3;</code>
     * @return The ppiopehpfop.
     */
    @java.lang.Override
    public POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD getPpiopehpfop() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD result = POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD.valueOf(ppiopehpfop_);
      return result == null ? POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD ppiopehpfop = 3;</code>
     * @param value The ppiopehpfop to set.
     * @return This builder for chaining.
     */
    public Builder setPpiopehpfop(POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ppiopehpfop_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NACOAAIKDMG.IOGLHFPJEGD ppiopehpfop = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPpiopehpfop() {
      
      ppiopehpfop_ = 0;
      onChanged();
      return this;
    }

    private int feckikndmgh_ ;
    /**
     * <code>int32 feckikndmgh = 4;</code>
     * @return The feckikndmgh.
     */
    @java.lang.Override
    public int getFeckikndmgh() {
      return feckikndmgh_;
    }
    /**
     * <code>int32 feckikndmgh = 4;</code>
     * @param value The feckikndmgh to set.
     * @return This builder for chaining.
     */
    public Builder setFeckikndmgh(int value) {
      
      feckikndmgh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 feckikndmgh = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeckikndmgh() {
      
      feckikndmgh_ = 0;
      onChanged();
      return this;
    }

    private long nggkfeakpca_ ;
    /**
     * <code>uint64 nggkfeakpca = 5;</code>
     * @return The nggkfeakpca.
     */
    @java.lang.Override
    public long getNggkfeakpca() {
      return nggkfeakpca_;
    }
    /**
     * <code>uint64 nggkfeakpca = 5;</code>
     * @param value The nggkfeakpca to set.
     * @return This builder for chaining.
     */
    public Builder setNggkfeakpca(long value) {
      
      nggkfeakpca_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 nggkfeakpca = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNggkfeakpca() {
      
      nggkfeakpca_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NACOAAIKDMG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NACOAAIKDMG)
  private static final POGOProtos.Rpc.NACOAAIKDMG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NACOAAIKDMG();
  }

  public static POGOProtos.Rpc.NACOAAIKDMG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NACOAAIKDMG>
      PARSER = new com.google.protobuf.AbstractParser<NACOAAIKDMG>() {
    @java.lang.Override
    public NACOAAIKDMG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NACOAAIKDMG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NACOAAIKDMG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NACOAAIKDMG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NACOAAIKDMG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

