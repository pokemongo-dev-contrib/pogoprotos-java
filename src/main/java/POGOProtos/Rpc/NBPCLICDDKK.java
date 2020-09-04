// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NBPCLICDDKK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NBPCLICDDKK}
 */
public final class NBPCLICDDKK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NBPCLICDDKK)
    NBPCLICDDKKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NBPCLICDDKK.newBuilder() to construct.
  private NBPCLICDDKK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NBPCLICDDKK() {
    lknpioglmib_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NBPCLICDDKK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NBPCLICDDKK(
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

            lknpioglmib_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.KDAFEAMLMKO.Builder subBuilder = null;
            if (jealejabdef_ != null) {
              subBuilder = jealejabdef_.toBuilder();
            }
            jealejabdef_ = input.readMessage(POGOProtos.Rpc.KDAFEAMLMKO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jealejabdef_);
              jealejabdef_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            POGOProtos.Rpc.GCJJKGJEEEF.Builder subBuilder = null;
            if (jodndjickjg_ != null) {
              subBuilder = jodndjickjg_.toBuilder();
            }
            jodndjickjg_ = input.readMessage(POGOProtos.Rpc.GCJJKGJEEEF.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jodndjickjg_);
              jodndjickjg_ = subBuilder.buildPartial();
            }

            break;
          }
          case 33: {

            diglolenand_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NBPCLICDDKK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NBPCLICDDKK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NBPCLICDDKK.class, POGOProtos.Rpc.NBPCLICDDKK.Builder.class);
  }

  /**
   * <pre>
   * ref: NBPCLICDDKK/JCGNLNBCPBL/EHJHPKOKDOL
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL}
   */
  public enum EHJHPKOKDOL
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNEST = 0;</code>
     */
    UNEST(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>ERROR_POKEMON_DEPLOYED = 2;</code>
     */
    ERROR_POKEMON_DEPLOYED(2),
    /**
     * <code>ERROR_POKEMON_NOT_OWNED = 3;</code>
     */
    ERROR_POKEMON_NOT_OWNED(3),
    /**
     * <code>ERROR_POKEMON_IS_EGG = 4;</code>
     */
    ERROR_POKEMON_IS_EGG(4),
    /**
     * <code>ERROR_INVALID_POKEMON = 5;</code>
     */
    ERROR_INVALID_POKEMON(5),
    /**
     * <code>ERROR_BUDDY_SWAP_LIMIT_EXCEEDED = 6;</code>
     */
    ERROR_BUDDY_SWAP_LIMIT_EXCEEDED(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNEST = 0;</code>
     */
    public static final int UNEST_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>ERROR_POKEMON_DEPLOYED = 2;</code>
     */
    public static final int ERROR_POKEMON_DEPLOYED_VALUE = 2;
    /**
     * <code>ERROR_POKEMON_NOT_OWNED = 3;</code>
     */
    public static final int ERROR_POKEMON_NOT_OWNED_VALUE = 3;
    /**
     * <code>ERROR_POKEMON_IS_EGG = 4;</code>
     */
    public static final int ERROR_POKEMON_IS_EGG_VALUE = 4;
    /**
     * <code>ERROR_INVALID_POKEMON = 5;</code>
     */
    public static final int ERROR_INVALID_POKEMON_VALUE = 5;
    /**
     * <code>ERROR_BUDDY_SWAP_LIMIT_EXCEEDED = 6;</code>
     */
    public static final int ERROR_BUDDY_SWAP_LIMIT_EXCEEDED_VALUE = 6;


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
    public static EHJHPKOKDOL valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EHJHPKOKDOL forNumber(int value) {
      switch (value) {
        case 0: return UNEST;
        case 1: return SUCCESS;
        case 2: return ERROR_POKEMON_DEPLOYED;
        case 3: return ERROR_POKEMON_NOT_OWNED;
        case 4: return ERROR_POKEMON_IS_EGG;
        case 5: return ERROR_INVALID_POKEMON;
        case 6: return ERROR_BUDDY_SWAP_LIMIT_EXCEEDED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EHJHPKOKDOL>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EHJHPKOKDOL> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EHJHPKOKDOL>() {
            public EHJHPKOKDOL findValueByNumber(int number) {
              return EHJHPKOKDOL.forNumber(number);
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
      return POGOProtos.Rpc.NBPCLICDDKK.getDescriptor().getEnumTypes().get(0);
    }

    private static final EHJHPKOKDOL[] VALUES = values();

    public static EHJHPKOKDOL valueOf(
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

    private EHJHPKOKDOL(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL)
  }

  public static final int LKNPIOGLMIB_FIELD_NUMBER = 1;
  private int lknpioglmib_;
  /**
   * <code>.POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL lknpioglmib = 1;</code>
   * @return The enum numeric value on the wire for lknpioglmib.
   */
  @java.lang.Override public int getLknpioglmibValue() {
    return lknpioglmib_;
  }
  /**
   * <code>.POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL lknpioglmib = 1;</code>
   * @return The lknpioglmib.
   */
  @java.lang.Override public POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL getLknpioglmib() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL result = POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL.valueOf(lknpioglmib_);
    return result == null ? POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL.UNRECOGNIZED : result;
  }

  public static final int JEALEJABDEF_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.KDAFEAMLMKO jealejabdef_;
  /**
   * <code>.POGOProtos.Rpc.KDAFEAMLMKO jealejabdef = 2;</code>
   * @return Whether the jealejabdef field is set.
   */
  @java.lang.Override
  public boolean hasJealejabdef() {
    return jealejabdef_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.KDAFEAMLMKO jealejabdef = 2;</code>
   * @return The jealejabdef.
   */
  @java.lang.Override
  public POGOProtos.Rpc.KDAFEAMLMKO getJealejabdef() {
    return jealejabdef_ == null ? POGOProtos.Rpc.KDAFEAMLMKO.getDefaultInstance() : jealejabdef_;
  }
  /**
   * <code>.POGOProtos.Rpc.KDAFEAMLMKO jealejabdef = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.KDAFEAMLMKOOrBuilder getJealejabdefOrBuilder() {
    return getJealejabdef();
  }

  public static final int JODNDJICKJG_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg_;
  /**
   * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 3;</code>
   * @return Whether the jodndjickjg field is set.
   */
  @java.lang.Override
  public boolean hasJodndjickjg() {
    return jodndjickjg_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 3;</code>
   * @return The jodndjickjg.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GCJJKGJEEEF getJodndjickjg() {
    return jodndjickjg_ == null ? POGOProtos.Rpc.GCJJKGJEEEF.getDefaultInstance() : jodndjickjg_;
  }
  /**
   * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GCJJKGJEEEFOrBuilder getJodndjickjgOrBuilder() {
    return getJodndjickjg();
  }

  public static final int DIGLOLENAND_FIELD_NUMBER = 4;
  private double diglolenand_;
  /**
   * <code>double diglolenand = 4;</code>
   * @return The diglolenand.
   */
  @java.lang.Override
  public double getDiglolenand() {
    return diglolenand_;
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
    if (lknpioglmib_ != POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL.UNEST.getNumber()) {
      output.writeEnum(1, lknpioglmib_);
    }
    if (jealejabdef_ != null) {
      output.writeMessage(2, getJealejabdef());
    }
    if (jodndjickjg_ != null) {
      output.writeMessage(3, getJodndjickjg());
    }
    if (diglolenand_ != 0D) {
      output.writeDouble(4, diglolenand_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lknpioglmib_ != POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL.UNEST.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lknpioglmib_);
    }
    if (jealejabdef_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJealejabdef());
    }
    if (jodndjickjg_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getJodndjickjg());
    }
    if (diglolenand_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, diglolenand_);
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
    if (!(obj instanceof POGOProtos.Rpc.NBPCLICDDKK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NBPCLICDDKK other = (POGOProtos.Rpc.NBPCLICDDKK) obj;

    if (lknpioglmib_ != other.lknpioglmib_) return false;
    if (hasJealejabdef() != other.hasJealejabdef()) return false;
    if (hasJealejabdef()) {
      if (!getJealejabdef()
          .equals(other.getJealejabdef())) return false;
    }
    if (hasJodndjickjg() != other.hasJodndjickjg()) return false;
    if (hasJodndjickjg()) {
      if (!getJodndjickjg()
          .equals(other.getJodndjickjg())) return false;
    }
    if (java.lang.Double.doubleToLongBits(getDiglolenand())
        != java.lang.Double.doubleToLongBits(
            other.getDiglolenand())) return false;
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
    hash = (37 * hash) + LKNPIOGLMIB_FIELD_NUMBER;
    hash = (53 * hash) + lknpioglmib_;
    if (hasJealejabdef()) {
      hash = (37 * hash) + JEALEJABDEF_FIELD_NUMBER;
      hash = (53 * hash) + getJealejabdef().hashCode();
    }
    if (hasJodndjickjg()) {
      hash = (37 * hash) + JODNDJICKJG_FIELD_NUMBER;
      hash = (53 * hash) + getJodndjickjg().hashCode();
    }
    hash = (37 * hash) + DIGLOLENAND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDiglolenand()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NBPCLICDDKK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NBPCLICDDKK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NBPCLICDDKK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NBPCLICDDKK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NBPCLICDDKK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NBPCLICDDKK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NBPCLICDDKK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NBPCLICDDKK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NBPCLICDDKK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NBPCLICDDKK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NBPCLICDDKK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NBPCLICDDKK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NBPCLICDDKK prototype) {
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
   * ref: NBPCLICDDKK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NBPCLICDDKK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NBPCLICDDKK)
      POGOProtos.Rpc.NBPCLICDDKKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NBPCLICDDKK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NBPCLICDDKK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NBPCLICDDKK.class, POGOProtos.Rpc.NBPCLICDDKK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NBPCLICDDKK.newBuilder()
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
      lknpioglmib_ = 0;

      if (jealejabdefBuilder_ == null) {
        jealejabdef_ = null;
      } else {
        jealejabdef_ = null;
        jealejabdefBuilder_ = null;
      }
      if (jodndjickjgBuilder_ == null) {
        jodndjickjg_ = null;
      } else {
        jodndjickjg_ = null;
        jodndjickjgBuilder_ = null;
      }
      diglolenand_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NBPCLICDDKK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NBPCLICDDKK getDefaultInstanceForType() {
      return POGOProtos.Rpc.NBPCLICDDKK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NBPCLICDDKK build() {
      POGOProtos.Rpc.NBPCLICDDKK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NBPCLICDDKK buildPartial() {
      POGOProtos.Rpc.NBPCLICDDKK result = new POGOProtos.Rpc.NBPCLICDDKK(this);
      result.lknpioglmib_ = lknpioglmib_;
      if (jealejabdefBuilder_ == null) {
        result.jealejabdef_ = jealejabdef_;
      } else {
        result.jealejabdef_ = jealejabdefBuilder_.build();
      }
      if (jodndjickjgBuilder_ == null) {
        result.jodndjickjg_ = jodndjickjg_;
      } else {
        result.jodndjickjg_ = jodndjickjgBuilder_.build();
      }
      result.diglolenand_ = diglolenand_;
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
      if (other instanceof POGOProtos.Rpc.NBPCLICDDKK) {
        return mergeFrom((POGOProtos.Rpc.NBPCLICDDKK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NBPCLICDDKK other) {
      if (other == POGOProtos.Rpc.NBPCLICDDKK.getDefaultInstance()) return this;
      if (other.lknpioglmib_ != 0) {
        setLknpioglmibValue(other.getLknpioglmibValue());
      }
      if (other.hasJealejabdef()) {
        mergeJealejabdef(other.getJealejabdef());
      }
      if (other.hasJodndjickjg()) {
        mergeJodndjickjg(other.getJodndjickjg());
      }
      if (other.getDiglolenand() != 0D) {
        setDiglolenand(other.getDiglolenand());
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
      POGOProtos.Rpc.NBPCLICDDKK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NBPCLICDDKK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int lknpioglmib_ = 0;
    /**
     * <code>.POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL lknpioglmib = 1;</code>
     * @return The enum numeric value on the wire for lknpioglmib.
     */
    @java.lang.Override public int getLknpioglmibValue() {
      return lknpioglmib_;
    }
    /**
     * <code>.POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL lknpioglmib = 1;</code>
     * @param value The enum numeric value on the wire for lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmibValue(int value) {
      
      lknpioglmib_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL lknpioglmib = 1;</code>
     * @return The lknpioglmib.
     */
    @java.lang.Override
    public POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL getLknpioglmib() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL result = POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL.valueOf(lknpioglmib_);
      return result == null ? POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL lknpioglmib = 1;</code>
     * @param value The lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmib(POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lknpioglmib_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NBPCLICDDKK.EHJHPKOKDOL lknpioglmib = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLknpioglmib() {
      
      lknpioglmib_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.KDAFEAMLMKO jealejabdef_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.KDAFEAMLMKO, POGOProtos.Rpc.KDAFEAMLMKO.Builder, POGOProtos.Rpc.KDAFEAMLMKOOrBuilder> jealejabdefBuilder_;
    /**
     * <code>.POGOProtos.Rpc.KDAFEAMLMKO jealejabdef = 2;</code>
     * @return Whether the jealejabdef field is set.
     */
    public boolean hasJealejabdef() {
      return jealejabdefBuilder_ != null || jealejabdef_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.KDAFEAMLMKO jealejabdef = 2;</code>
     * @return The jealejabdef.
     */
    public POGOProtos.Rpc.KDAFEAMLMKO getJealejabdef() {
      if (jealejabdefBuilder_ == null) {
        return jealejabdef_ == null ? POGOProtos.Rpc.KDAFEAMLMKO.getDefaultInstance() : jealejabdef_;
      } else {
        return jealejabdefBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.KDAFEAMLMKO jealejabdef = 2;</code>
     */
    public Builder setJealejabdef(POGOProtos.Rpc.KDAFEAMLMKO value) {
      if (jealejabdefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jealejabdef_ = value;
        onChanged();
      } else {
        jealejabdefBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KDAFEAMLMKO jealejabdef = 2;</code>
     */
    public Builder setJealejabdef(
        POGOProtos.Rpc.KDAFEAMLMKO.Builder builderForValue) {
      if (jealejabdefBuilder_ == null) {
        jealejabdef_ = builderForValue.build();
        onChanged();
      } else {
        jealejabdefBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KDAFEAMLMKO jealejabdef = 2;</code>
     */
    public Builder mergeJealejabdef(POGOProtos.Rpc.KDAFEAMLMKO value) {
      if (jealejabdefBuilder_ == null) {
        if (jealejabdef_ != null) {
          jealejabdef_ =
            POGOProtos.Rpc.KDAFEAMLMKO.newBuilder(jealejabdef_).mergeFrom(value).buildPartial();
        } else {
          jealejabdef_ = value;
        }
        onChanged();
      } else {
        jealejabdefBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KDAFEAMLMKO jealejabdef = 2;</code>
     */
    public Builder clearJealejabdef() {
      if (jealejabdefBuilder_ == null) {
        jealejabdef_ = null;
        onChanged();
      } else {
        jealejabdef_ = null;
        jealejabdefBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KDAFEAMLMKO jealejabdef = 2;</code>
     */
    public POGOProtos.Rpc.KDAFEAMLMKO.Builder getJealejabdefBuilder() {
      
      onChanged();
      return getJealejabdefFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.KDAFEAMLMKO jealejabdef = 2;</code>
     */
    public POGOProtos.Rpc.KDAFEAMLMKOOrBuilder getJealejabdefOrBuilder() {
      if (jealejabdefBuilder_ != null) {
        return jealejabdefBuilder_.getMessageOrBuilder();
      } else {
        return jealejabdef_ == null ?
            POGOProtos.Rpc.KDAFEAMLMKO.getDefaultInstance() : jealejabdef_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.KDAFEAMLMKO jealejabdef = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.KDAFEAMLMKO, POGOProtos.Rpc.KDAFEAMLMKO.Builder, POGOProtos.Rpc.KDAFEAMLMKOOrBuilder> 
        getJealejabdefFieldBuilder() {
      if (jealejabdefBuilder_ == null) {
        jealejabdefBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.KDAFEAMLMKO, POGOProtos.Rpc.KDAFEAMLMKO.Builder, POGOProtos.Rpc.KDAFEAMLMKOOrBuilder>(
                getJealejabdef(),
                getParentForChildren(),
                isClean());
        jealejabdef_ = null;
      }
      return jealejabdefBuilder_;
    }

    private POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GCJJKGJEEEF, POGOProtos.Rpc.GCJJKGJEEEF.Builder, POGOProtos.Rpc.GCJJKGJEEEFOrBuilder> jodndjickjgBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 3;</code>
     * @return Whether the jodndjickjg field is set.
     */
    public boolean hasJodndjickjg() {
      return jodndjickjgBuilder_ != null || jodndjickjg_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 3;</code>
     * @return The jodndjickjg.
     */
    public POGOProtos.Rpc.GCJJKGJEEEF getJodndjickjg() {
      if (jodndjickjgBuilder_ == null) {
        return jodndjickjg_ == null ? POGOProtos.Rpc.GCJJKGJEEEF.getDefaultInstance() : jodndjickjg_;
      } else {
        return jodndjickjgBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 3;</code>
     */
    public Builder setJodndjickjg(POGOProtos.Rpc.GCJJKGJEEEF value) {
      if (jodndjickjgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jodndjickjg_ = value;
        onChanged();
      } else {
        jodndjickjgBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 3;</code>
     */
    public Builder setJodndjickjg(
        POGOProtos.Rpc.GCJJKGJEEEF.Builder builderForValue) {
      if (jodndjickjgBuilder_ == null) {
        jodndjickjg_ = builderForValue.build();
        onChanged();
      } else {
        jodndjickjgBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 3;</code>
     */
    public Builder mergeJodndjickjg(POGOProtos.Rpc.GCJJKGJEEEF value) {
      if (jodndjickjgBuilder_ == null) {
        if (jodndjickjg_ != null) {
          jodndjickjg_ =
            POGOProtos.Rpc.GCJJKGJEEEF.newBuilder(jodndjickjg_).mergeFrom(value).buildPartial();
        } else {
          jodndjickjg_ = value;
        }
        onChanged();
      } else {
        jodndjickjgBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 3;</code>
     */
    public Builder clearJodndjickjg() {
      if (jodndjickjgBuilder_ == null) {
        jodndjickjg_ = null;
        onChanged();
      } else {
        jodndjickjg_ = null;
        jodndjickjgBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 3;</code>
     */
    public POGOProtos.Rpc.GCJJKGJEEEF.Builder getJodndjickjgBuilder() {
      
      onChanged();
      return getJodndjickjgFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 3;</code>
     */
    public POGOProtos.Rpc.GCJJKGJEEEFOrBuilder getJodndjickjgOrBuilder() {
      if (jodndjickjgBuilder_ != null) {
        return jodndjickjgBuilder_.getMessageOrBuilder();
      } else {
        return jodndjickjg_ == null ?
            POGOProtos.Rpc.GCJJKGJEEEF.getDefaultInstance() : jodndjickjg_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GCJJKGJEEEF, POGOProtos.Rpc.GCJJKGJEEEF.Builder, POGOProtos.Rpc.GCJJKGJEEEFOrBuilder> 
        getJodndjickjgFieldBuilder() {
      if (jodndjickjgBuilder_ == null) {
        jodndjickjgBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.GCJJKGJEEEF, POGOProtos.Rpc.GCJJKGJEEEF.Builder, POGOProtos.Rpc.GCJJKGJEEEFOrBuilder>(
                getJodndjickjg(),
                getParentForChildren(),
                isClean());
        jodndjickjg_ = null;
      }
      return jodndjickjgBuilder_;
    }

    private double diglolenand_ ;
    /**
     * <code>double diglolenand = 4;</code>
     * @return The diglolenand.
     */
    @java.lang.Override
    public double getDiglolenand() {
      return diglolenand_;
    }
    /**
     * <code>double diglolenand = 4;</code>
     * @param value The diglolenand to set.
     * @return This builder for chaining.
     */
    public Builder setDiglolenand(double value) {
      
      diglolenand_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double diglolenand = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDiglolenand() {
      
      diglolenand_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NBPCLICDDKK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NBPCLICDDKK)
  private static final POGOProtos.Rpc.NBPCLICDDKK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NBPCLICDDKK();
  }

  public static POGOProtos.Rpc.NBPCLICDDKK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NBPCLICDDKK>
      PARSER = new com.google.protobuf.AbstractParser<NBPCLICDDKK>() {
    @java.lang.Override
    public NBPCLICDDKK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NBPCLICDDKK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NBPCLICDDKK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NBPCLICDDKK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NBPCLICDDKK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

