// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BCCBNBCFOKL}
 */
public  final class BCCBNBCFOKL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BCCBNBCFOKL)
    BCCBNBCFOKLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BCCBNBCFOKL.newBuilder() to construct.
  private BCCBNBCFOKL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BCCBNBCFOKL() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BCCBNBCFOKL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BCCBNBCFOKL(
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
            lIHKAHBCBPBCase_ = 1;
            lIHKAHBCBPB_ = rawValue;
            break;
          }
          case 16: {
            lIHKAHBCBPBCase_ = 2;
            lIHKAHBCBPB_ = input.readBool();
            break;
          }
          case 26: {
            POGOProtos.Rpc.FFGIEEPEOPM.Builder subBuilder = null;
            if (gidmfojaeip_ != null) {
              subBuilder = gidmfojaeip_.toBuilder();
            }
            gidmfojaeip_ = input.readMessage(POGOProtos.Rpc.FFGIEEPEOPM.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(gidmfojaeip_);
              gidmfojaeip_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            addmcjnoppp_ = input.readBool();
            break;
          }
          case 42: {
            POGOProtos.Rpc.FFGIEEPEOPM.Builder subBuilder = null;
            if (lfgmeggpebl_ != null) {
              subBuilder = lfgmeggpebl_.toBuilder();
            }
            lfgmeggpebl_ = input.readMessage(POGOProtos.Rpc.FFGIEEPEOPM.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lfgmeggpebl_);
              lfgmeggpebl_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCCBNBCFOKL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCCBNBCFOKL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BCCBNBCFOKL.class, POGOProtos.Rpc.BCCBNBCFOKL.Builder.class);
  }

  private int lIHKAHBCBPBCase_ = 0;
  private java.lang.Object lIHKAHBCBPB_;
  public enum LIHKAHBCBPBCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    POKEMON_ID(1),
    USE_QUEST_POKEMON_ENCOUNTER_DISTRIBUITION(2),
    LIHKAHBCBPB_NOT_SET(0);
    private final int value;
    private LIHKAHBCBPBCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LIHKAHBCBPBCase valueOf(int value) {
      return forNumber(value);
    }

    public static LIHKAHBCBPBCase forNumber(int value) {
      switch (value) {
        case 1: return POKEMON_ID;
        case 2: return USE_QUEST_POKEMON_ENCOUNTER_DISTRIBUITION;
        case 0: return LIHKAHBCBPB_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public LIHKAHBCBPBCase
  getLIHKAHBCBPBCase() {
    return LIHKAHBCBPBCase.forNumber(
        lIHKAHBCBPBCase_);
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 1;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
   * @return The enum numeric value on the wire for pokemonId.
   */
  public int getPokemonIdValue() {
    if (lIHKAHBCBPBCase_ == 1) {
      return (java.lang.Integer) lIHKAHBCBPB_;
    }
    return 0;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
   * @return The pokemonId.
   */
  public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
    if (lIHKAHBCBPBCase_ == 1) {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(
          (java.lang.Integer) lIHKAHBCBPB_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    return POGOProtos.Rpc.HoloPokemonId.MISSINGNO;
  }

  public static final int USE_QUEST_POKEMON_ENCOUNTER_DISTRIBUITION_FIELD_NUMBER = 2;
  /**
   * <code>bool use_quest_pokemon_encounter_distribuition = 2;</code>
   * @return The useQuestPokemonEncounterDistribuition.
   */
  public boolean getUseQuestPokemonEncounterDistribuition() {
    if (lIHKAHBCBPBCase_ == 2) {
      return (java.lang.Boolean) lIHKAHBCBPB_;
    }
    return false;
  }

  public static final int GIDMFOJAEIP_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip_;
  /**
   * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 3;</code>
   * @return Whether the gidmfojaeip field is set.
   */
  public boolean hasGidmfojaeip() {
    return gidmfojaeip_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 3;</code>
   * @return The gidmfojaeip.
   */
  public POGOProtos.Rpc.FFGIEEPEOPM getGidmfojaeip() {
    return gidmfojaeip_ == null ? POGOProtos.Rpc.FFGIEEPEOPM.getDefaultInstance() : gidmfojaeip_;
  }
  /**
   * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 3;</code>
   */
  public POGOProtos.Rpc.FFGIEEPEOPMOrBuilder getGidmfojaeipOrBuilder() {
    return getGidmfojaeip();
  }

  public static final int ADDMCJNOPPP_FIELD_NUMBER = 4;
  private boolean addmcjnoppp_;
  /**
   * <code>bool addmcjnoppp = 4;</code>
   * @return The addmcjnoppp.
   */
  public boolean getAddmcjnoppp() {
    return addmcjnoppp_;
  }

  public static final int LFGMEGGPEBL_FIELD_NUMBER = 5;
  private POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl_;
  /**
   * <code>.POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl = 5;</code>
   * @return Whether the lfgmeggpebl field is set.
   */
  public boolean hasLfgmeggpebl() {
    return lfgmeggpebl_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl = 5;</code>
   * @return The lfgmeggpebl.
   */
  public POGOProtos.Rpc.FFGIEEPEOPM getLfgmeggpebl() {
    return lfgmeggpebl_ == null ? POGOProtos.Rpc.FFGIEEPEOPM.getDefaultInstance() : lfgmeggpebl_;
  }
  /**
   * <code>.POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl = 5;</code>
   */
  public POGOProtos.Rpc.FFGIEEPEOPMOrBuilder getLfgmeggpeblOrBuilder() {
    return getLfgmeggpebl();
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
    if (lIHKAHBCBPBCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) lIHKAHBCBPB_));
    }
    if (lIHKAHBCBPBCase_ == 2) {
      output.writeBool(
          2, (boolean)((java.lang.Boolean) lIHKAHBCBPB_));
    }
    if (gidmfojaeip_ != null) {
      output.writeMessage(3, getGidmfojaeip());
    }
    if (addmcjnoppp_ != false) {
      output.writeBool(4, addmcjnoppp_);
    }
    if (lfgmeggpebl_ != null) {
      output.writeMessage(5, getLfgmeggpebl());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lIHKAHBCBPBCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) lIHKAHBCBPB_));
    }
    if (lIHKAHBCBPBCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            2, (boolean)((java.lang.Boolean) lIHKAHBCBPB_));
    }
    if (gidmfojaeip_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getGidmfojaeip());
    }
    if (addmcjnoppp_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, addmcjnoppp_);
    }
    if (lfgmeggpebl_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getLfgmeggpebl());
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
    if (!(obj instanceof POGOProtos.Rpc.BCCBNBCFOKL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BCCBNBCFOKL other = (POGOProtos.Rpc.BCCBNBCFOKL) obj;

    if (hasGidmfojaeip() != other.hasGidmfojaeip()) return false;
    if (hasGidmfojaeip()) {
      if (!getGidmfojaeip()
          .equals(other.getGidmfojaeip())) return false;
    }
    if (getAddmcjnoppp()
        != other.getAddmcjnoppp()) return false;
    if (hasLfgmeggpebl() != other.hasLfgmeggpebl()) return false;
    if (hasLfgmeggpebl()) {
      if (!getLfgmeggpebl()
          .equals(other.getLfgmeggpebl())) return false;
    }
    if (!getLIHKAHBCBPBCase().equals(other.getLIHKAHBCBPBCase())) return false;
    switch (lIHKAHBCBPBCase_) {
      case 1:
        if (getPokemonIdValue()
            != other.getPokemonIdValue()) return false;
        break;
      case 2:
        if (getUseQuestPokemonEncounterDistribuition()
            != other.getUseQuestPokemonEncounterDistribuition()) return false;
        break;
      case 0:
      default:
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
    if (hasGidmfojaeip()) {
      hash = (37 * hash) + GIDMFOJAEIP_FIELD_NUMBER;
      hash = (53 * hash) + getGidmfojaeip().hashCode();
    }
    hash = (37 * hash) + ADDMCJNOPPP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAddmcjnoppp());
    if (hasLfgmeggpebl()) {
      hash = (37 * hash) + LFGMEGGPEBL_FIELD_NUMBER;
      hash = (53 * hash) + getLfgmeggpebl().hashCode();
    }
    switch (lIHKAHBCBPBCase_) {
      case 1:
        hash = (37 * hash) + POKEMON_ID_FIELD_NUMBER;
        hash = (53 * hash) + getPokemonIdValue();
        break;
      case 2:
        hash = (37 * hash) + USE_QUEST_POKEMON_ENCOUNTER_DISTRIBUITION_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getUseQuestPokemonEncounterDistribuition());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BCCBNBCFOKL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BCCBNBCFOKL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCCBNBCFOKL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BCCBNBCFOKL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCCBNBCFOKL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BCCBNBCFOKL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCCBNBCFOKL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BCCBNBCFOKL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCCBNBCFOKL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BCCBNBCFOKL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCCBNBCFOKL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BCCBNBCFOKL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BCCBNBCFOKL prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BCCBNBCFOKL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BCCBNBCFOKL)
      POGOProtos.Rpc.BCCBNBCFOKLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCCBNBCFOKL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCCBNBCFOKL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BCCBNBCFOKL.class, POGOProtos.Rpc.BCCBNBCFOKL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BCCBNBCFOKL.newBuilder()
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
      if (gidmfojaeipBuilder_ == null) {
        gidmfojaeip_ = null;
      } else {
        gidmfojaeip_ = null;
        gidmfojaeipBuilder_ = null;
      }
      addmcjnoppp_ = false;

      if (lfgmeggpeblBuilder_ == null) {
        lfgmeggpebl_ = null;
      } else {
        lfgmeggpebl_ = null;
        lfgmeggpeblBuilder_ = null;
      }
      lIHKAHBCBPBCase_ = 0;
      lIHKAHBCBPB_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCCBNBCFOKL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BCCBNBCFOKL getDefaultInstanceForType() {
      return POGOProtos.Rpc.BCCBNBCFOKL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BCCBNBCFOKL build() {
      POGOProtos.Rpc.BCCBNBCFOKL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BCCBNBCFOKL buildPartial() {
      POGOProtos.Rpc.BCCBNBCFOKL result = new POGOProtos.Rpc.BCCBNBCFOKL(this);
      if (lIHKAHBCBPBCase_ == 1) {
        result.lIHKAHBCBPB_ = lIHKAHBCBPB_;
      }
      if (lIHKAHBCBPBCase_ == 2) {
        result.lIHKAHBCBPB_ = lIHKAHBCBPB_;
      }
      if (gidmfojaeipBuilder_ == null) {
        result.gidmfojaeip_ = gidmfojaeip_;
      } else {
        result.gidmfojaeip_ = gidmfojaeipBuilder_.build();
      }
      result.addmcjnoppp_ = addmcjnoppp_;
      if (lfgmeggpeblBuilder_ == null) {
        result.lfgmeggpebl_ = lfgmeggpebl_;
      } else {
        result.lfgmeggpebl_ = lfgmeggpeblBuilder_.build();
      }
      result.lIHKAHBCBPBCase_ = lIHKAHBCBPBCase_;
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
      if (other instanceof POGOProtos.Rpc.BCCBNBCFOKL) {
        return mergeFrom((POGOProtos.Rpc.BCCBNBCFOKL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BCCBNBCFOKL other) {
      if (other == POGOProtos.Rpc.BCCBNBCFOKL.getDefaultInstance()) return this;
      if (other.hasGidmfojaeip()) {
        mergeGidmfojaeip(other.getGidmfojaeip());
      }
      if (other.getAddmcjnoppp() != false) {
        setAddmcjnoppp(other.getAddmcjnoppp());
      }
      if (other.hasLfgmeggpebl()) {
        mergeLfgmeggpebl(other.getLfgmeggpebl());
      }
      switch (other.getLIHKAHBCBPBCase()) {
        case POKEMON_ID: {
          setPokemonIdValue(other.getPokemonIdValue());
          break;
        }
        case USE_QUEST_POKEMON_ENCOUNTER_DISTRIBUITION: {
          setUseQuestPokemonEncounterDistribuition(other.getUseQuestPokemonEncounterDistribuition());
          break;
        }
        case LIHKAHBCBPB_NOT_SET: {
          break;
        }
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
      POGOProtos.Rpc.BCCBNBCFOKL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BCCBNBCFOKL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int lIHKAHBCBPBCase_ = 0;
    private java.lang.Object lIHKAHBCBPB_;
    public LIHKAHBCBPBCase
        getLIHKAHBCBPBCase() {
      return LIHKAHBCBPBCase.forNumber(
          lIHKAHBCBPBCase_);
    }

    public Builder clearLIHKAHBCBPB() {
      lIHKAHBCBPBCase_ = 0;
      lIHKAHBCBPB_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @return The enum numeric value on the wire for pokemonId.
     */
    public int getPokemonIdValue() {
      if (lIHKAHBCBPBCase_ == 1) {
        return ((java.lang.Integer) lIHKAHBCBPB_).intValue();
      }
      return 0;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @param value The enum numeric value on the wire for pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonIdValue(int value) {
      lIHKAHBCBPBCase_ = 1;
      lIHKAHBCBPB_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @return The pokemonId.
     */
    public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
      if (lIHKAHBCBPBCase_ == 1) {
        @SuppressWarnings("deprecation")
        POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(
            (java.lang.Integer) lIHKAHBCBPB_);
        return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
      }
      return POGOProtos.Rpc.HoloPokemonId.MISSINGNO;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @param value The pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonId(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      lIHKAHBCBPBCase_ = 1;
      lIHKAHBCBPB_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      if (lIHKAHBCBPBCase_ == 1) {
        lIHKAHBCBPBCase_ = 0;
        lIHKAHBCBPB_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>bool use_quest_pokemon_encounter_distribuition = 2;</code>
     * @return The useQuestPokemonEncounterDistribuition.
     */
    public boolean getUseQuestPokemonEncounterDistribuition() {
      if (lIHKAHBCBPBCase_ == 2) {
        return (java.lang.Boolean) lIHKAHBCBPB_;
      }
      return false;
    }
    /**
     * <code>bool use_quest_pokemon_encounter_distribuition = 2;</code>
     * @param value The useQuestPokemonEncounterDistribuition to set.
     * @return This builder for chaining.
     */
    public Builder setUseQuestPokemonEncounterDistribuition(boolean value) {
      lIHKAHBCBPBCase_ = 2;
      lIHKAHBCBPB_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool use_quest_pokemon_encounter_distribuition = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUseQuestPokemonEncounterDistribuition() {
      if (lIHKAHBCBPBCase_ == 2) {
        lIHKAHBCBPBCase_ = 0;
        lIHKAHBCBPB_ = null;
        onChanged();
      }
      return this;
    }

    private POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FFGIEEPEOPM, POGOProtos.Rpc.FFGIEEPEOPM.Builder, POGOProtos.Rpc.FFGIEEPEOPMOrBuilder> gidmfojaeipBuilder_;
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 3;</code>
     * @return Whether the gidmfojaeip field is set.
     */
    public boolean hasGidmfojaeip() {
      return gidmfojaeipBuilder_ != null || gidmfojaeip_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 3;</code>
     * @return The gidmfojaeip.
     */
    public POGOProtos.Rpc.FFGIEEPEOPM getGidmfojaeip() {
      if (gidmfojaeipBuilder_ == null) {
        return gidmfojaeip_ == null ? POGOProtos.Rpc.FFGIEEPEOPM.getDefaultInstance() : gidmfojaeip_;
      } else {
        return gidmfojaeipBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 3;</code>
     */
    public Builder setGidmfojaeip(POGOProtos.Rpc.FFGIEEPEOPM value) {
      if (gidmfojaeipBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gidmfojaeip_ = value;
        onChanged();
      } else {
        gidmfojaeipBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 3;</code>
     */
    public Builder setGidmfojaeip(
        POGOProtos.Rpc.FFGIEEPEOPM.Builder builderForValue) {
      if (gidmfojaeipBuilder_ == null) {
        gidmfojaeip_ = builderForValue.build();
        onChanged();
      } else {
        gidmfojaeipBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 3;</code>
     */
    public Builder mergeGidmfojaeip(POGOProtos.Rpc.FFGIEEPEOPM value) {
      if (gidmfojaeipBuilder_ == null) {
        if (gidmfojaeip_ != null) {
          gidmfojaeip_ =
            POGOProtos.Rpc.FFGIEEPEOPM.newBuilder(gidmfojaeip_).mergeFrom(value).buildPartial();
        } else {
          gidmfojaeip_ = value;
        }
        onChanged();
      } else {
        gidmfojaeipBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 3;</code>
     */
    public Builder clearGidmfojaeip() {
      if (gidmfojaeipBuilder_ == null) {
        gidmfojaeip_ = null;
        onChanged();
      } else {
        gidmfojaeip_ = null;
        gidmfojaeipBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 3;</code>
     */
    public POGOProtos.Rpc.FFGIEEPEOPM.Builder getGidmfojaeipBuilder() {
      
      onChanged();
      return getGidmfojaeipFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 3;</code>
     */
    public POGOProtos.Rpc.FFGIEEPEOPMOrBuilder getGidmfojaeipOrBuilder() {
      if (gidmfojaeipBuilder_ != null) {
        return gidmfojaeipBuilder_.getMessageOrBuilder();
      } else {
        return gidmfojaeip_ == null ?
            POGOProtos.Rpc.FFGIEEPEOPM.getDefaultInstance() : gidmfojaeip_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM gidmfojaeip = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FFGIEEPEOPM, POGOProtos.Rpc.FFGIEEPEOPM.Builder, POGOProtos.Rpc.FFGIEEPEOPMOrBuilder> 
        getGidmfojaeipFieldBuilder() {
      if (gidmfojaeipBuilder_ == null) {
        gidmfojaeipBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.FFGIEEPEOPM, POGOProtos.Rpc.FFGIEEPEOPM.Builder, POGOProtos.Rpc.FFGIEEPEOPMOrBuilder>(
                getGidmfojaeip(),
                getParentForChildren(),
                isClean());
        gidmfojaeip_ = null;
      }
      return gidmfojaeipBuilder_;
    }

    private boolean addmcjnoppp_ ;
    /**
     * <code>bool addmcjnoppp = 4;</code>
     * @return The addmcjnoppp.
     */
    public boolean getAddmcjnoppp() {
      return addmcjnoppp_;
    }
    /**
     * <code>bool addmcjnoppp = 4;</code>
     * @param value The addmcjnoppp to set.
     * @return This builder for chaining.
     */
    public Builder setAddmcjnoppp(boolean value) {
      
      addmcjnoppp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool addmcjnoppp = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddmcjnoppp() {
      
      addmcjnoppp_ = false;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FFGIEEPEOPM, POGOProtos.Rpc.FFGIEEPEOPM.Builder, POGOProtos.Rpc.FFGIEEPEOPMOrBuilder> lfgmeggpeblBuilder_;
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl = 5;</code>
     * @return Whether the lfgmeggpebl field is set.
     */
    public boolean hasLfgmeggpebl() {
      return lfgmeggpeblBuilder_ != null || lfgmeggpebl_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl = 5;</code>
     * @return The lfgmeggpebl.
     */
    public POGOProtos.Rpc.FFGIEEPEOPM getLfgmeggpebl() {
      if (lfgmeggpeblBuilder_ == null) {
        return lfgmeggpebl_ == null ? POGOProtos.Rpc.FFGIEEPEOPM.getDefaultInstance() : lfgmeggpebl_;
      } else {
        return lfgmeggpeblBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl = 5;</code>
     */
    public Builder setLfgmeggpebl(POGOProtos.Rpc.FFGIEEPEOPM value) {
      if (lfgmeggpeblBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lfgmeggpebl_ = value;
        onChanged();
      } else {
        lfgmeggpeblBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl = 5;</code>
     */
    public Builder setLfgmeggpebl(
        POGOProtos.Rpc.FFGIEEPEOPM.Builder builderForValue) {
      if (lfgmeggpeblBuilder_ == null) {
        lfgmeggpebl_ = builderForValue.build();
        onChanged();
      } else {
        lfgmeggpeblBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl = 5;</code>
     */
    public Builder mergeLfgmeggpebl(POGOProtos.Rpc.FFGIEEPEOPM value) {
      if (lfgmeggpeblBuilder_ == null) {
        if (lfgmeggpebl_ != null) {
          lfgmeggpebl_ =
            POGOProtos.Rpc.FFGIEEPEOPM.newBuilder(lfgmeggpebl_).mergeFrom(value).buildPartial();
        } else {
          lfgmeggpebl_ = value;
        }
        onChanged();
      } else {
        lfgmeggpeblBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl = 5;</code>
     */
    public Builder clearLfgmeggpebl() {
      if (lfgmeggpeblBuilder_ == null) {
        lfgmeggpebl_ = null;
        onChanged();
      } else {
        lfgmeggpebl_ = null;
        lfgmeggpeblBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl = 5;</code>
     */
    public POGOProtos.Rpc.FFGIEEPEOPM.Builder getLfgmeggpeblBuilder() {
      
      onChanged();
      return getLfgmeggpeblFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl = 5;</code>
     */
    public POGOProtos.Rpc.FFGIEEPEOPMOrBuilder getLfgmeggpeblOrBuilder() {
      if (lfgmeggpeblBuilder_ != null) {
        return lfgmeggpeblBuilder_.getMessageOrBuilder();
      } else {
        return lfgmeggpebl_ == null ?
            POGOProtos.Rpc.FFGIEEPEOPM.getDefaultInstance() : lfgmeggpebl_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FFGIEEPEOPM lfgmeggpebl = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FFGIEEPEOPM, POGOProtos.Rpc.FFGIEEPEOPM.Builder, POGOProtos.Rpc.FFGIEEPEOPMOrBuilder> 
        getLfgmeggpeblFieldBuilder() {
      if (lfgmeggpeblBuilder_ == null) {
        lfgmeggpeblBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.FFGIEEPEOPM, POGOProtos.Rpc.FFGIEEPEOPM.Builder, POGOProtos.Rpc.FFGIEEPEOPMOrBuilder>(
                getLfgmeggpebl(),
                getParentForChildren(),
                isClean());
        lfgmeggpebl_ = null;
      }
      return lfgmeggpeblBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BCCBNBCFOKL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BCCBNBCFOKL)
  private static final POGOProtos.Rpc.BCCBNBCFOKL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BCCBNBCFOKL();
  }

  public static POGOProtos.Rpc.BCCBNBCFOKL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BCCBNBCFOKL>
      PARSER = new com.google.protobuf.AbstractParser<BCCBNBCFOKL>() {
    @java.lang.Override
    public BCCBNBCFOKL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BCCBNBCFOKL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BCCBNBCFOKL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BCCBNBCFOKL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BCCBNBCFOKL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

