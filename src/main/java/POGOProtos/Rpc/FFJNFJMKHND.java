// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FFJNFJMKHND
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FFJNFJMKHND}
 */
public final class FFJNFJMKHND extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FFJNFJMKHND)
    FFJNFJMKHNDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FFJNFJMKHND.newBuilder() to construct.
  private FFJNFJMKHND(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FFJNFJMKHND() {
    pchaggbckfg_ = 0;
    lelcfknbpjk_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FFJNFJMKHND();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FFJNFJMKHND(
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

            pchaggbckfg_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            lelcfknbpjk_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FFJNFJMKHND_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FFJNFJMKHND_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FFJNFJMKHND.class, POGOProtos.Rpc.FFJNFJMKHND.Builder.class);
  }

  /**
   * <pre>
   * ref: FFJNFJMKHND/LEJPEHDEGOF/LGGMBIIPIOM
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM}
   */
  public enum LGGMBIIPIOM
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
    public static LGGMBIIPIOM valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LGGMBIIPIOM forNumber(int value) {
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
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LGGMBIIPIOM>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LGGMBIIPIOM> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LGGMBIIPIOM>() {
            public LGGMBIIPIOM findValueByNumber(int number) {
              return LGGMBIIPIOM.forNumber(number);
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
      return POGOProtos.Rpc.FFJNFJMKHND.getDescriptor().getEnumTypes().get(0);
    }

    private static final LGGMBIIPIOM[] VALUES = values();

    public static LGGMBIIPIOM valueOf(
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

    private LGGMBIIPIOM(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM)
  }

  public static final int PCHAGGBCKFG_FIELD_NUMBER = 1;
  private int pchaggbckfg_;
  /**
   * <code>.POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM pchaggbckfg = 1;</code>
   * @return The enum numeric value on the wire for pchaggbckfg.
   */
  @java.lang.Override public int getPchaggbckfgValue() {
    return pchaggbckfg_;
  }
  /**
   * <code>.POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM pchaggbckfg = 1;</code>
   * @return The pchaggbckfg.
   */
  @java.lang.Override public POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM getPchaggbckfg() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM result = POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM.valueOf(pchaggbckfg_);
    return result == null ? POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM.UNRECOGNIZED : result;
  }

  public static final int LELCFKNBPJK_FIELD_NUMBER = 2;
  private volatile java.lang.Object lelcfknbpjk_;
  /**
   * <code>string lelcfknbpjk = 2;</code>
   * @return The lelcfknbpjk.
   */
  @java.lang.Override
  public java.lang.String getLelcfknbpjk() {
    java.lang.Object ref = lelcfknbpjk_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lelcfknbpjk_ = s;
      return s;
    }
  }
  /**
   * <code>string lelcfknbpjk = 2;</code>
   * @return The bytes for lelcfknbpjk.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLelcfknbpjkBytes() {
    java.lang.Object ref = lelcfknbpjk_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lelcfknbpjk_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (pchaggbckfg_ != POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM.EFFECT_NONE.getNumber()) {
      output.writeEnum(1, pchaggbckfg_);
    }
    if (!getLelcfknbpjkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lelcfknbpjk_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pchaggbckfg_ != POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM.EFFECT_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, pchaggbckfg_);
    }
    if (!getLelcfknbpjkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lelcfknbpjk_);
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
    if (!(obj instanceof POGOProtos.Rpc.FFJNFJMKHND)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FFJNFJMKHND other = (POGOProtos.Rpc.FFJNFJMKHND) obj;

    if (pchaggbckfg_ != other.pchaggbckfg_) return false;
    if (!getLelcfknbpjk()
        .equals(other.getLelcfknbpjk())) return false;
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
    hash = (37 * hash) + PCHAGGBCKFG_FIELD_NUMBER;
    hash = (53 * hash) + pchaggbckfg_;
    hash = (37 * hash) + LELCFKNBPJK_FIELD_NUMBER;
    hash = (53 * hash) + getLelcfknbpjk().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FFJNFJMKHND parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FFJNFJMKHND parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FFJNFJMKHND parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FFJNFJMKHND parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FFJNFJMKHND parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FFJNFJMKHND parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FFJNFJMKHND parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FFJNFJMKHND parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FFJNFJMKHND parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FFJNFJMKHND parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FFJNFJMKHND parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FFJNFJMKHND parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FFJNFJMKHND prototype) {
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
   * ref: FFJNFJMKHND
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FFJNFJMKHND}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FFJNFJMKHND)
      POGOProtos.Rpc.FFJNFJMKHNDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FFJNFJMKHND_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FFJNFJMKHND_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FFJNFJMKHND.class, POGOProtos.Rpc.FFJNFJMKHND.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FFJNFJMKHND.newBuilder()
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
      pchaggbckfg_ = 0;

      lelcfknbpjk_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FFJNFJMKHND_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FFJNFJMKHND getDefaultInstanceForType() {
      return POGOProtos.Rpc.FFJNFJMKHND.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FFJNFJMKHND build() {
      POGOProtos.Rpc.FFJNFJMKHND result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FFJNFJMKHND buildPartial() {
      POGOProtos.Rpc.FFJNFJMKHND result = new POGOProtos.Rpc.FFJNFJMKHND(this);
      result.pchaggbckfg_ = pchaggbckfg_;
      result.lelcfknbpjk_ = lelcfknbpjk_;
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
      if (other instanceof POGOProtos.Rpc.FFJNFJMKHND) {
        return mergeFrom((POGOProtos.Rpc.FFJNFJMKHND)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FFJNFJMKHND other) {
      if (other == POGOProtos.Rpc.FFJNFJMKHND.getDefaultInstance()) return this;
      if (other.pchaggbckfg_ != 0) {
        setPchaggbckfgValue(other.getPchaggbckfgValue());
      }
      if (!other.getLelcfknbpjk().isEmpty()) {
        lelcfknbpjk_ = other.lelcfknbpjk_;
        onChanged();
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
      POGOProtos.Rpc.FFJNFJMKHND parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FFJNFJMKHND) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pchaggbckfg_ = 0;
    /**
     * <code>.POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM pchaggbckfg = 1;</code>
     * @return The enum numeric value on the wire for pchaggbckfg.
     */
    @java.lang.Override public int getPchaggbckfgValue() {
      return pchaggbckfg_;
    }
    /**
     * <code>.POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM pchaggbckfg = 1;</code>
     * @param value The enum numeric value on the wire for pchaggbckfg to set.
     * @return This builder for chaining.
     */
    public Builder setPchaggbckfgValue(int value) {
      
      pchaggbckfg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM pchaggbckfg = 1;</code>
     * @return The pchaggbckfg.
     */
    @java.lang.Override
    public POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM getPchaggbckfg() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM result = POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM.valueOf(pchaggbckfg_);
      return result == null ? POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM pchaggbckfg = 1;</code>
     * @param value The pchaggbckfg to set.
     * @return This builder for chaining.
     */
    public Builder setPchaggbckfg(POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pchaggbckfg_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFJNFJMKHND.LGGMBIIPIOM pchaggbckfg = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPchaggbckfg() {
      
      pchaggbckfg_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object lelcfknbpjk_ = "";
    /**
     * <code>string lelcfknbpjk = 2;</code>
     * @return The lelcfknbpjk.
     */
    public java.lang.String getLelcfknbpjk() {
      java.lang.Object ref = lelcfknbpjk_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lelcfknbpjk_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lelcfknbpjk = 2;</code>
     * @return The bytes for lelcfknbpjk.
     */
    public com.google.protobuf.ByteString
        getLelcfknbpjkBytes() {
      java.lang.Object ref = lelcfknbpjk_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lelcfknbpjk_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lelcfknbpjk = 2;</code>
     * @param value The lelcfknbpjk to set.
     * @return This builder for chaining.
     */
    public Builder setLelcfknbpjk(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lelcfknbpjk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lelcfknbpjk = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLelcfknbpjk() {
      
      lelcfknbpjk_ = getDefaultInstance().getLelcfknbpjk();
      onChanged();
      return this;
    }
    /**
     * <code>string lelcfknbpjk = 2;</code>
     * @param value The bytes for lelcfknbpjk to set.
     * @return This builder for chaining.
     */
    public Builder setLelcfknbpjkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lelcfknbpjk_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FFJNFJMKHND)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FFJNFJMKHND)
  private static final POGOProtos.Rpc.FFJNFJMKHND DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FFJNFJMKHND();
  }

  public static POGOProtos.Rpc.FFJNFJMKHND getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FFJNFJMKHND>
      PARSER = new com.google.protobuf.AbstractParser<FFJNFJMKHND>() {
    @java.lang.Override
    public FFJNFJMKHND parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FFJNFJMKHND(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FFJNFJMKHND> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FFJNFJMKHND> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FFJNFJMKHND getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

