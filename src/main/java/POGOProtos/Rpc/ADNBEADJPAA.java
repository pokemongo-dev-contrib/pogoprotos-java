// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ADNBEADJPAA}
 */
public  final class ADNBEADJPAA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ADNBEADJPAA)
    ADNBEADJPAAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ADNBEADJPAA.newBuilder() to construct.
  private ADNBEADJPAA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ADNBEADJPAA() {
    jbflkcdndlp_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ADNBEADJPAA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ADNBEADJPAA(
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
            POGOProtos.Rpc.KHNLPGENFBI.Builder subBuilder = null;
            if (ajdpmilhijh_ != null) {
              subBuilder = ajdpmilhijh_.toBuilder();
            }
            ajdpmilhijh_ = input.readMessage(POGOProtos.Rpc.KHNLPGENFBI.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ajdpmilhijh_);
              ajdpmilhijh_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            njinhadonhg_ = input.readInt32();
            break;
          }
          case 32: {

            cphgnjkhcie_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ADNBEADJPAA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ADNBEADJPAA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ADNBEADJPAA.class, POGOProtos.Rpc.ADNBEADJPAA.Builder.class);
  }

  /**
   * <pre>
   * ref: ADNBEADJPAA/HBIGJNGBCAD/IJPBODCFNOB
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB}
   */
  public enum IJPBODCFNOB
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
     * <code>FAILED_POKEMON_MISSING = 2;</code>
     */
    FAILED_POKEMON_MISSING(2),
    /**
     * <code>FAILED_INSUFFICIENT_RESOURCES = 3;</code>
     */
    FAILED_INSUFFICIENT_RESOURCES(3),
    /**
     * <code>FAILED_POKEMON_CANNOT_EVOLVE = 4;</code>
     */
    FAILED_POKEMON_CANNOT_EVOLVE(4),
    /**
     * <code>FAILED_POKEMON_IS_DEPLOYED = 5;</code>
     */
    FAILED_POKEMON_IS_DEPLOYED(5),
    /**
     * <code>FAILED_INVALID_ITEM_REQUIREMENT = 6;</code>
     */
    FAILED_INVALID_ITEM_REQUIREMENT(6),
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
     * <code>FAILED_POKEMON_MISSING = 2;</code>
     */
    public static final int FAILED_POKEMON_MISSING_VALUE = 2;
    /**
     * <code>FAILED_INSUFFICIENT_RESOURCES = 3;</code>
     */
    public static final int FAILED_INSUFFICIENT_RESOURCES_VALUE = 3;
    /**
     * <code>FAILED_POKEMON_CANNOT_EVOLVE = 4;</code>
     */
    public static final int FAILED_POKEMON_CANNOT_EVOLVE_VALUE = 4;
    /**
     * <code>FAILED_POKEMON_IS_DEPLOYED = 5;</code>
     */
    public static final int FAILED_POKEMON_IS_DEPLOYED_VALUE = 5;
    /**
     * <code>FAILED_INVALID_ITEM_REQUIREMENT = 6;</code>
     */
    public static final int FAILED_INVALID_ITEM_REQUIREMENT_VALUE = 6;


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
    public static IJPBODCFNOB valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IJPBODCFNOB forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return FAILED_POKEMON_MISSING;
        case 3: return FAILED_INSUFFICIENT_RESOURCES;
        case 4: return FAILED_POKEMON_CANNOT_EVOLVE;
        case 5: return FAILED_POKEMON_IS_DEPLOYED;
        case 6: return FAILED_INVALID_ITEM_REQUIREMENT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IJPBODCFNOB>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IJPBODCFNOB> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IJPBODCFNOB>() {
            public IJPBODCFNOB findValueByNumber(int number) {
              return IJPBODCFNOB.forNumber(number);
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
      return POGOProtos.Rpc.ADNBEADJPAA.getDescriptor().getEnumTypes().get(0);
    }

    private static final IJPBODCFNOB[] VALUES = values();

    public static IJPBODCFNOB valueOf(
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

    private IJPBODCFNOB(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB)
  }

  public static final int JBFLKCDNDLP_FIELD_NUMBER = 1;
  private int jbflkcdndlp_;
  /**
   * <code>.POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB jbflkcdndlp = 1;</code>
   * @return The enum numeric value on the wire for jbflkcdndlp.
   */
  public int getJbflkcdndlpValue() {
    return jbflkcdndlp_;
  }
  /**
   * <code>.POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB jbflkcdndlp = 1;</code>
   * @return The jbflkcdndlp.
   */
  public POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB getJbflkcdndlp() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB result = POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB.valueOf(jbflkcdndlp_);
    return result == null ? POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB.UNRECOGNIZED : result;
  }

  public static final int AJDPMILHIJH_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh_;
  /**
   * <code>.POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh = 2;</code>
   * @return Whether the ajdpmilhijh field is set.
   */
  public boolean hasAjdpmilhijh() {
    return ajdpmilhijh_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh = 2;</code>
   * @return The ajdpmilhijh.
   */
  public POGOProtos.Rpc.KHNLPGENFBI getAjdpmilhijh() {
    return ajdpmilhijh_ == null ? POGOProtos.Rpc.KHNLPGENFBI.getDefaultInstance() : ajdpmilhijh_;
  }
  /**
   * <code>.POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh = 2;</code>
   */
  public POGOProtos.Rpc.KHNLPGENFBIOrBuilder getAjdpmilhijhOrBuilder() {
    return getAjdpmilhijh();
  }

  public static final int NJINHADONHG_FIELD_NUMBER = 3;
  private int njinhadonhg_;
  /**
   * <code>int32 njinhadonhg = 3;</code>
   * @return The njinhadonhg.
   */
  public int getNjinhadonhg() {
    return njinhadonhg_;
  }

  public static final int CPHGNJKHCIE_FIELD_NUMBER = 4;
  private int cphgnjkhcie_;
  /**
   * <code>int32 cphgnjkhcie = 4;</code>
   * @return The cphgnjkhcie.
   */
  public int getCphgnjkhcie() {
    return cphgnjkhcie_;
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
    if (jbflkcdndlp_ != POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB.UNSET.getNumber()) {
      output.writeEnum(1, jbflkcdndlp_);
    }
    if (ajdpmilhijh_ != null) {
      output.writeMessage(2, getAjdpmilhijh());
    }
    if (njinhadonhg_ != 0) {
      output.writeInt32(3, njinhadonhg_);
    }
    if (cphgnjkhcie_ != 0) {
      output.writeInt32(4, cphgnjkhcie_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jbflkcdndlp_ != POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, jbflkcdndlp_);
    }
    if (ajdpmilhijh_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAjdpmilhijh());
    }
    if (njinhadonhg_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, njinhadonhg_);
    }
    if (cphgnjkhcie_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, cphgnjkhcie_);
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
    if (!(obj instanceof POGOProtos.Rpc.ADNBEADJPAA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ADNBEADJPAA other = (POGOProtos.Rpc.ADNBEADJPAA) obj;

    if (jbflkcdndlp_ != other.jbflkcdndlp_) return false;
    if (hasAjdpmilhijh() != other.hasAjdpmilhijh()) return false;
    if (hasAjdpmilhijh()) {
      if (!getAjdpmilhijh()
          .equals(other.getAjdpmilhijh())) return false;
    }
    if (getNjinhadonhg()
        != other.getNjinhadonhg()) return false;
    if (getCphgnjkhcie()
        != other.getCphgnjkhcie()) return false;
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
    if (hasAjdpmilhijh()) {
      hash = (37 * hash) + AJDPMILHIJH_FIELD_NUMBER;
      hash = (53 * hash) + getAjdpmilhijh().hashCode();
    }
    hash = (37 * hash) + NJINHADONHG_FIELD_NUMBER;
    hash = (53 * hash) + getNjinhadonhg();
    hash = (37 * hash) + CPHGNJKHCIE_FIELD_NUMBER;
    hash = (53 * hash) + getCphgnjkhcie();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ADNBEADJPAA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ADNBEADJPAA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ADNBEADJPAA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ADNBEADJPAA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ADNBEADJPAA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ADNBEADJPAA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ADNBEADJPAA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ADNBEADJPAA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ADNBEADJPAA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ADNBEADJPAA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ADNBEADJPAA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ADNBEADJPAA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ADNBEADJPAA prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ADNBEADJPAA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ADNBEADJPAA)
      POGOProtos.Rpc.ADNBEADJPAAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ADNBEADJPAA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ADNBEADJPAA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ADNBEADJPAA.class, POGOProtos.Rpc.ADNBEADJPAA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ADNBEADJPAA.newBuilder()
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

      if (ajdpmilhijhBuilder_ == null) {
        ajdpmilhijh_ = null;
      } else {
        ajdpmilhijh_ = null;
        ajdpmilhijhBuilder_ = null;
      }
      njinhadonhg_ = 0;

      cphgnjkhcie_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ADNBEADJPAA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ADNBEADJPAA getDefaultInstanceForType() {
      return POGOProtos.Rpc.ADNBEADJPAA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ADNBEADJPAA build() {
      POGOProtos.Rpc.ADNBEADJPAA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ADNBEADJPAA buildPartial() {
      POGOProtos.Rpc.ADNBEADJPAA result = new POGOProtos.Rpc.ADNBEADJPAA(this);
      result.jbflkcdndlp_ = jbflkcdndlp_;
      if (ajdpmilhijhBuilder_ == null) {
        result.ajdpmilhijh_ = ajdpmilhijh_;
      } else {
        result.ajdpmilhijh_ = ajdpmilhijhBuilder_.build();
      }
      result.njinhadonhg_ = njinhadonhg_;
      result.cphgnjkhcie_ = cphgnjkhcie_;
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
      if (other instanceof POGOProtos.Rpc.ADNBEADJPAA) {
        return mergeFrom((POGOProtos.Rpc.ADNBEADJPAA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ADNBEADJPAA other) {
      if (other == POGOProtos.Rpc.ADNBEADJPAA.getDefaultInstance()) return this;
      if (other.jbflkcdndlp_ != 0) {
        setJbflkcdndlpValue(other.getJbflkcdndlpValue());
      }
      if (other.hasAjdpmilhijh()) {
        mergeAjdpmilhijh(other.getAjdpmilhijh());
      }
      if (other.getNjinhadonhg() != 0) {
        setNjinhadonhg(other.getNjinhadonhg());
      }
      if (other.getCphgnjkhcie() != 0) {
        setCphgnjkhcie(other.getCphgnjkhcie());
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
      POGOProtos.Rpc.ADNBEADJPAA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ADNBEADJPAA) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB jbflkcdndlp = 1;</code>
     * @return The enum numeric value on the wire for jbflkcdndlp.
     */
    public int getJbflkcdndlpValue() {
      return jbflkcdndlp_;
    }
    /**
     * <code>.POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB jbflkcdndlp = 1;</code>
     * @param value The enum numeric value on the wire for jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlpValue(int value) {
      jbflkcdndlp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB jbflkcdndlp = 1;</code>
     * @return The jbflkcdndlp.
     */
    public POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB getJbflkcdndlp() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB result = POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB.valueOf(jbflkcdndlp_);
      return result == null ? POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB jbflkcdndlp = 1;</code>
     * @param value The jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlp(POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jbflkcdndlp_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ADNBEADJPAA.IJPBODCFNOB jbflkcdndlp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJbflkcdndlp() {
      
      jbflkcdndlp_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.KHNLPGENFBI, POGOProtos.Rpc.KHNLPGENFBI.Builder, POGOProtos.Rpc.KHNLPGENFBIOrBuilder> ajdpmilhijhBuilder_;
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh = 2;</code>
     * @return Whether the ajdpmilhijh field is set.
     */
    public boolean hasAjdpmilhijh() {
      return ajdpmilhijhBuilder_ != null || ajdpmilhijh_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh = 2;</code>
     * @return The ajdpmilhijh.
     */
    public POGOProtos.Rpc.KHNLPGENFBI getAjdpmilhijh() {
      if (ajdpmilhijhBuilder_ == null) {
        return ajdpmilhijh_ == null ? POGOProtos.Rpc.KHNLPGENFBI.getDefaultInstance() : ajdpmilhijh_;
      } else {
        return ajdpmilhijhBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh = 2;</code>
     */
    public Builder setAjdpmilhijh(POGOProtos.Rpc.KHNLPGENFBI value) {
      if (ajdpmilhijhBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ajdpmilhijh_ = value;
        onChanged();
      } else {
        ajdpmilhijhBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh = 2;</code>
     */
    public Builder setAjdpmilhijh(
        POGOProtos.Rpc.KHNLPGENFBI.Builder builderForValue) {
      if (ajdpmilhijhBuilder_ == null) {
        ajdpmilhijh_ = builderForValue.build();
        onChanged();
      } else {
        ajdpmilhijhBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh = 2;</code>
     */
    public Builder mergeAjdpmilhijh(POGOProtos.Rpc.KHNLPGENFBI value) {
      if (ajdpmilhijhBuilder_ == null) {
        if (ajdpmilhijh_ != null) {
          ajdpmilhijh_ =
            POGOProtos.Rpc.KHNLPGENFBI.newBuilder(ajdpmilhijh_).mergeFrom(value).buildPartial();
        } else {
          ajdpmilhijh_ = value;
        }
        onChanged();
      } else {
        ajdpmilhijhBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh = 2;</code>
     */
    public Builder clearAjdpmilhijh() {
      if (ajdpmilhijhBuilder_ == null) {
        ajdpmilhijh_ = null;
        onChanged();
      } else {
        ajdpmilhijh_ = null;
        ajdpmilhijhBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh = 2;</code>
     */
    public POGOProtos.Rpc.KHNLPGENFBI.Builder getAjdpmilhijhBuilder() {
      
      onChanged();
      return getAjdpmilhijhFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh = 2;</code>
     */
    public POGOProtos.Rpc.KHNLPGENFBIOrBuilder getAjdpmilhijhOrBuilder() {
      if (ajdpmilhijhBuilder_ != null) {
        return ajdpmilhijhBuilder_.getMessageOrBuilder();
      } else {
        return ajdpmilhijh_ == null ?
            POGOProtos.Rpc.KHNLPGENFBI.getDefaultInstance() : ajdpmilhijh_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI ajdpmilhijh = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.KHNLPGENFBI, POGOProtos.Rpc.KHNLPGENFBI.Builder, POGOProtos.Rpc.KHNLPGENFBIOrBuilder> 
        getAjdpmilhijhFieldBuilder() {
      if (ajdpmilhijhBuilder_ == null) {
        ajdpmilhijhBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.KHNLPGENFBI, POGOProtos.Rpc.KHNLPGENFBI.Builder, POGOProtos.Rpc.KHNLPGENFBIOrBuilder>(
                getAjdpmilhijh(),
                getParentForChildren(),
                isClean());
        ajdpmilhijh_ = null;
      }
      return ajdpmilhijhBuilder_;
    }

    private int njinhadonhg_ ;
    /**
     * <code>int32 njinhadonhg = 3;</code>
     * @return The njinhadonhg.
     */
    public int getNjinhadonhg() {
      return njinhadonhg_;
    }
    /**
     * <code>int32 njinhadonhg = 3;</code>
     * @param value The njinhadonhg to set.
     * @return This builder for chaining.
     */
    public Builder setNjinhadonhg(int value) {
      
      njinhadonhg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 njinhadonhg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNjinhadonhg() {
      
      njinhadonhg_ = 0;
      onChanged();
      return this;
    }

    private int cphgnjkhcie_ ;
    /**
     * <code>int32 cphgnjkhcie = 4;</code>
     * @return The cphgnjkhcie.
     */
    public int getCphgnjkhcie() {
      return cphgnjkhcie_;
    }
    /**
     * <code>int32 cphgnjkhcie = 4;</code>
     * @param value The cphgnjkhcie to set.
     * @return This builder for chaining.
     */
    public Builder setCphgnjkhcie(int value) {
      
      cphgnjkhcie_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cphgnjkhcie = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCphgnjkhcie() {
      
      cphgnjkhcie_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ADNBEADJPAA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ADNBEADJPAA)
  private static final POGOProtos.Rpc.ADNBEADJPAA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ADNBEADJPAA();
  }

  public static POGOProtos.Rpc.ADNBEADJPAA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ADNBEADJPAA>
      PARSER = new com.google.protobuf.AbstractParser<ADNBEADJPAA>() {
    @java.lang.Override
    public ADNBEADJPAA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ADNBEADJPAA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ADNBEADJPAA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ADNBEADJPAA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ADNBEADJPAA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

