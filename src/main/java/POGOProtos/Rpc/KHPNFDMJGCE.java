// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.KHPNFDMJGCE}
 */
public  final class KHPNFDMJGCE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KHPNFDMJGCE)
    KHPNFDMJGCEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KHPNFDMJGCE.newBuilder() to construct.
  private KHPNFDMJGCE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KHPNFDMJGCE() {
    jbflkcdndlp_ = 0;
    opodipeklnn_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KHPNFDMJGCE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KHPNFDMJGCE(
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
            if (glhibjpemch_ != null) {
              subBuilder = glhibjpemch_.toBuilder();
            }
            glhibjpemch_ = input.readMessage(POGOProtos.Rpc.KHNLPGENFBI.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(glhibjpemch_);
              glhibjpemch_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            POGOProtos.Rpc.PGKKOMHNBDH.Builder subBuilder = null;
            if (ljpfimjpjdj_ != null) {
              subBuilder = ljpfimjpjdj_.toBuilder();
            }
            ljpfimjpjdj_ = input.readMessage(POGOProtos.Rpc.PGKKOMHNBDH.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ljpfimjpjdj_);
              ljpfimjpjdj_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            opodipeklnn_ = rawValue;
            break;
          }
          case 40: {

            ekmejobghjg_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KHPNFDMJGCE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KHPNFDMJGCE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KHPNFDMJGCE.class, POGOProtos.Rpc.KHPNFDMJGCE.Builder.class);
  }

  /**
   * <pre>
   * ref: KHPNFDMJGCE/LCHMIPOCEJF/IDBBBIHKFCL
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL}
   */
  public enum IDBBBIHKFCL
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>NOT_AVAILABLE = 2;</code>
     */
    NOT_AVAILABLE(2),
    /**
     * <code>NOT_IN_RANGE = 3;</code>
     */
    NOT_IN_RANGE(3),
    /**
     * <code>ENCOUNTER_ALREADY_FINISHED = 4;</code>
     */
    ENCOUNTER_ALREADY_FINISHED(4),
    /**
     * <code>POKEMON_INVENTORY_FULL = 5;</code>
     */
    POKEMON_INVENTORY_FULL(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>NOT_AVAILABLE = 2;</code>
     */
    public static final int NOT_AVAILABLE_VALUE = 2;
    /**
     * <code>NOT_IN_RANGE = 3;</code>
     */
    public static final int NOT_IN_RANGE_VALUE = 3;
    /**
     * <code>ENCOUNTER_ALREADY_FINISHED = 4;</code>
     */
    public static final int ENCOUNTER_ALREADY_FINISHED_VALUE = 4;
    /**
     * <code>POKEMON_INVENTORY_FULL = 5;</code>
     */
    public static final int POKEMON_INVENTORY_FULL_VALUE = 5;


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
    public static IDBBBIHKFCL valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IDBBBIHKFCL forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return SUCCESS;
        case 2: return NOT_AVAILABLE;
        case 3: return NOT_IN_RANGE;
        case 4: return ENCOUNTER_ALREADY_FINISHED;
        case 5: return POKEMON_INVENTORY_FULL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IDBBBIHKFCL>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IDBBBIHKFCL> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IDBBBIHKFCL>() {
            public IDBBBIHKFCL findValueByNumber(int number) {
              return IDBBBIHKFCL.forNumber(number);
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
      return POGOProtos.Rpc.KHPNFDMJGCE.getDescriptor().getEnumTypes().get(0);
    }

    private static final IDBBBIHKFCL[] VALUES = values();

    public static IDBBBIHKFCL valueOf(
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

    private IDBBBIHKFCL(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL)
  }

  public static final int JBFLKCDNDLP_FIELD_NUMBER = 1;
  private int jbflkcdndlp_;
  /**
   * <code>.POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL jbflkcdndlp = 1;</code>
   * @return The enum numeric value on the wire for jbflkcdndlp.
   */
  public int getJbflkcdndlpValue() {
    return jbflkcdndlp_;
  }
  /**
   * <code>.POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL jbflkcdndlp = 1;</code>
   * @return The jbflkcdndlp.
   */
  public POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL getJbflkcdndlp() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL result = POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL.valueOf(jbflkcdndlp_);
    return result == null ? POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL.UNRECOGNIZED : result;
  }

  public static final int GLHIBJPEMCH_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.KHNLPGENFBI glhibjpemch_;
  /**
   * <code>.POGOProtos.Rpc.KHNLPGENFBI glhibjpemch = 2;</code>
   * @return Whether the glhibjpemch field is set.
   */
  public boolean hasGlhibjpemch() {
    return glhibjpemch_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.KHNLPGENFBI glhibjpemch = 2;</code>
   * @return The glhibjpemch.
   */
  public POGOProtos.Rpc.KHNLPGENFBI getGlhibjpemch() {
    return glhibjpemch_ == null ? POGOProtos.Rpc.KHNLPGENFBI.getDefaultInstance() : glhibjpemch_;
  }
  /**
   * <code>.POGOProtos.Rpc.KHNLPGENFBI glhibjpemch = 2;</code>
   */
  public POGOProtos.Rpc.KHNLPGENFBIOrBuilder getGlhibjpemchOrBuilder() {
    return getGlhibjpemch();
  }

  public static final int LJPFIMJPJDJ_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj_;
  /**
   * <code>.POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj = 3;</code>
   * @return Whether the ljpfimjpjdj field is set.
   */
  public boolean hasLjpfimjpjdj() {
    return ljpfimjpjdj_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj = 3;</code>
   * @return The ljpfimjpjdj.
   */
  public POGOProtos.Rpc.PGKKOMHNBDH getLjpfimjpjdj() {
    return ljpfimjpjdj_ == null ? POGOProtos.Rpc.PGKKOMHNBDH.getDefaultInstance() : ljpfimjpjdj_;
  }
  /**
   * <code>.POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj = 3;</code>
   */
  public POGOProtos.Rpc.PGKKOMHNBDHOrBuilder getLjpfimjpjdjOrBuilder() {
    return getLjpfimjpjdj();
  }

  public static final int OPODIPEKLNN_FIELD_NUMBER = 4;
  private int opodipeklnn_;
  /**
   * <code>.POGOProtos.Rpc.Item opodipeklnn = 4;</code>
   * @return The enum numeric value on the wire for opodipeklnn.
   */
  public int getOpodipeklnnValue() {
    return opodipeklnn_;
  }
  /**
   * <code>.POGOProtos.Rpc.Item opodipeklnn = 4;</code>
   * @return The opodipeklnn.
   */
  public POGOProtos.Rpc.Item getOpodipeklnn() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(opodipeklnn_);
    return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
  }

  public static final int EKMEJOBGHJG_FIELD_NUMBER = 5;
  private int ekmejobghjg_;
  /**
   * <code>int32 ekmejobghjg = 5;</code>
   * @return The ekmejobghjg.
   */
  public int getEkmejobghjg() {
    return ekmejobghjg_;
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
    if (jbflkcdndlp_ != POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL.UNKNOWN.getNumber()) {
      output.writeEnum(1, jbflkcdndlp_);
    }
    if (glhibjpemch_ != null) {
      output.writeMessage(2, getGlhibjpemch());
    }
    if (ljpfimjpjdj_ != null) {
      output.writeMessage(3, getLjpfimjpjdj());
    }
    if (opodipeklnn_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(4, opodipeklnn_);
    }
    if (ekmejobghjg_ != 0) {
      output.writeInt32(5, ekmejobghjg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jbflkcdndlp_ != POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, jbflkcdndlp_);
    }
    if (glhibjpemch_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGlhibjpemch());
    }
    if (ljpfimjpjdj_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLjpfimjpjdj());
    }
    if (opodipeklnn_ != POGOProtos.Rpc.Item.ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, opodipeklnn_);
    }
    if (ekmejobghjg_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, ekmejobghjg_);
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
    if (!(obj instanceof POGOProtos.Rpc.KHPNFDMJGCE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KHPNFDMJGCE other = (POGOProtos.Rpc.KHPNFDMJGCE) obj;

    if (jbflkcdndlp_ != other.jbflkcdndlp_) return false;
    if (hasGlhibjpemch() != other.hasGlhibjpemch()) return false;
    if (hasGlhibjpemch()) {
      if (!getGlhibjpemch()
          .equals(other.getGlhibjpemch())) return false;
    }
    if (hasLjpfimjpjdj() != other.hasLjpfimjpjdj()) return false;
    if (hasLjpfimjpjdj()) {
      if (!getLjpfimjpjdj()
          .equals(other.getLjpfimjpjdj())) return false;
    }
    if (opodipeklnn_ != other.opodipeklnn_) return false;
    if (getEkmejobghjg()
        != other.getEkmejobghjg()) return false;
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
    if (hasGlhibjpemch()) {
      hash = (37 * hash) + GLHIBJPEMCH_FIELD_NUMBER;
      hash = (53 * hash) + getGlhibjpemch().hashCode();
    }
    if (hasLjpfimjpjdj()) {
      hash = (37 * hash) + LJPFIMJPJDJ_FIELD_NUMBER;
      hash = (53 * hash) + getLjpfimjpjdj().hashCode();
    }
    hash = (37 * hash) + OPODIPEKLNN_FIELD_NUMBER;
    hash = (53 * hash) + opodipeklnn_;
    hash = (37 * hash) + EKMEJOBGHJG_FIELD_NUMBER;
    hash = (53 * hash) + getEkmejobghjg();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KHPNFDMJGCE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KHPNFDMJGCE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KHPNFDMJGCE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KHPNFDMJGCE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KHPNFDMJGCE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KHPNFDMJGCE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KHPNFDMJGCE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KHPNFDMJGCE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KHPNFDMJGCE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KHPNFDMJGCE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KHPNFDMJGCE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KHPNFDMJGCE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KHPNFDMJGCE prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.KHPNFDMJGCE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KHPNFDMJGCE)
      POGOProtos.Rpc.KHPNFDMJGCEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KHPNFDMJGCE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KHPNFDMJGCE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KHPNFDMJGCE.class, POGOProtos.Rpc.KHPNFDMJGCE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KHPNFDMJGCE.newBuilder()
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

      if (glhibjpemchBuilder_ == null) {
        glhibjpemch_ = null;
      } else {
        glhibjpemch_ = null;
        glhibjpemchBuilder_ = null;
      }
      if (ljpfimjpjdjBuilder_ == null) {
        ljpfimjpjdj_ = null;
      } else {
        ljpfimjpjdj_ = null;
        ljpfimjpjdjBuilder_ = null;
      }
      opodipeklnn_ = 0;

      ekmejobghjg_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KHPNFDMJGCE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KHPNFDMJGCE getDefaultInstanceForType() {
      return POGOProtos.Rpc.KHPNFDMJGCE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KHPNFDMJGCE build() {
      POGOProtos.Rpc.KHPNFDMJGCE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KHPNFDMJGCE buildPartial() {
      POGOProtos.Rpc.KHPNFDMJGCE result = new POGOProtos.Rpc.KHPNFDMJGCE(this);
      result.jbflkcdndlp_ = jbflkcdndlp_;
      if (glhibjpemchBuilder_ == null) {
        result.glhibjpemch_ = glhibjpemch_;
      } else {
        result.glhibjpemch_ = glhibjpemchBuilder_.build();
      }
      if (ljpfimjpjdjBuilder_ == null) {
        result.ljpfimjpjdj_ = ljpfimjpjdj_;
      } else {
        result.ljpfimjpjdj_ = ljpfimjpjdjBuilder_.build();
      }
      result.opodipeklnn_ = opodipeklnn_;
      result.ekmejobghjg_ = ekmejobghjg_;
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
      if (other instanceof POGOProtos.Rpc.KHPNFDMJGCE) {
        return mergeFrom((POGOProtos.Rpc.KHPNFDMJGCE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KHPNFDMJGCE other) {
      if (other == POGOProtos.Rpc.KHPNFDMJGCE.getDefaultInstance()) return this;
      if (other.jbflkcdndlp_ != 0) {
        setJbflkcdndlpValue(other.getJbflkcdndlpValue());
      }
      if (other.hasGlhibjpemch()) {
        mergeGlhibjpemch(other.getGlhibjpemch());
      }
      if (other.hasLjpfimjpjdj()) {
        mergeLjpfimjpjdj(other.getLjpfimjpjdj());
      }
      if (other.opodipeklnn_ != 0) {
        setOpodipeklnnValue(other.getOpodipeklnnValue());
      }
      if (other.getEkmejobghjg() != 0) {
        setEkmejobghjg(other.getEkmejobghjg());
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
      POGOProtos.Rpc.KHPNFDMJGCE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KHPNFDMJGCE) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL jbflkcdndlp = 1;</code>
     * @return The enum numeric value on the wire for jbflkcdndlp.
     */
    public int getJbflkcdndlpValue() {
      return jbflkcdndlp_;
    }
    /**
     * <code>.POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL jbflkcdndlp = 1;</code>
     * @param value The enum numeric value on the wire for jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlpValue(int value) {
      jbflkcdndlp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL jbflkcdndlp = 1;</code>
     * @return The jbflkcdndlp.
     */
    public POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL getJbflkcdndlp() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL result = POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL.valueOf(jbflkcdndlp_);
      return result == null ? POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL jbflkcdndlp = 1;</code>
     * @param value The jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlp(POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jbflkcdndlp_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHPNFDMJGCE.IDBBBIHKFCL jbflkcdndlp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJbflkcdndlp() {
      
      jbflkcdndlp_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.KHNLPGENFBI glhibjpemch_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.KHNLPGENFBI, POGOProtos.Rpc.KHNLPGENFBI.Builder, POGOProtos.Rpc.KHNLPGENFBIOrBuilder> glhibjpemchBuilder_;
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI glhibjpemch = 2;</code>
     * @return Whether the glhibjpemch field is set.
     */
    public boolean hasGlhibjpemch() {
      return glhibjpemchBuilder_ != null || glhibjpemch_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI glhibjpemch = 2;</code>
     * @return The glhibjpemch.
     */
    public POGOProtos.Rpc.KHNLPGENFBI getGlhibjpemch() {
      if (glhibjpemchBuilder_ == null) {
        return glhibjpemch_ == null ? POGOProtos.Rpc.KHNLPGENFBI.getDefaultInstance() : glhibjpemch_;
      } else {
        return glhibjpemchBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI glhibjpemch = 2;</code>
     */
    public Builder setGlhibjpemch(POGOProtos.Rpc.KHNLPGENFBI value) {
      if (glhibjpemchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        glhibjpemch_ = value;
        onChanged();
      } else {
        glhibjpemchBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI glhibjpemch = 2;</code>
     */
    public Builder setGlhibjpemch(
        POGOProtos.Rpc.KHNLPGENFBI.Builder builderForValue) {
      if (glhibjpemchBuilder_ == null) {
        glhibjpemch_ = builderForValue.build();
        onChanged();
      } else {
        glhibjpemchBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI glhibjpemch = 2;</code>
     */
    public Builder mergeGlhibjpemch(POGOProtos.Rpc.KHNLPGENFBI value) {
      if (glhibjpemchBuilder_ == null) {
        if (glhibjpemch_ != null) {
          glhibjpemch_ =
            POGOProtos.Rpc.KHNLPGENFBI.newBuilder(glhibjpemch_).mergeFrom(value).buildPartial();
        } else {
          glhibjpemch_ = value;
        }
        onChanged();
      } else {
        glhibjpemchBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI glhibjpemch = 2;</code>
     */
    public Builder clearGlhibjpemch() {
      if (glhibjpemchBuilder_ == null) {
        glhibjpemch_ = null;
        onChanged();
      } else {
        glhibjpemch_ = null;
        glhibjpemchBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI glhibjpemch = 2;</code>
     */
    public POGOProtos.Rpc.KHNLPGENFBI.Builder getGlhibjpemchBuilder() {
      
      onChanged();
      return getGlhibjpemchFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI glhibjpemch = 2;</code>
     */
    public POGOProtos.Rpc.KHNLPGENFBIOrBuilder getGlhibjpemchOrBuilder() {
      if (glhibjpemchBuilder_ != null) {
        return glhibjpemchBuilder_.getMessageOrBuilder();
      } else {
        return glhibjpemch_ == null ?
            POGOProtos.Rpc.KHNLPGENFBI.getDefaultInstance() : glhibjpemch_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.KHNLPGENFBI glhibjpemch = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.KHNLPGENFBI, POGOProtos.Rpc.KHNLPGENFBI.Builder, POGOProtos.Rpc.KHNLPGENFBIOrBuilder> 
        getGlhibjpemchFieldBuilder() {
      if (glhibjpemchBuilder_ == null) {
        glhibjpemchBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.KHNLPGENFBI, POGOProtos.Rpc.KHNLPGENFBI.Builder, POGOProtos.Rpc.KHNLPGENFBIOrBuilder>(
                getGlhibjpemch(),
                getParentForChildren(),
                isClean());
        glhibjpemch_ = null;
      }
      return glhibjpemchBuilder_;
    }

    private POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PGKKOMHNBDH, POGOProtos.Rpc.PGKKOMHNBDH.Builder, POGOProtos.Rpc.PGKKOMHNBDHOrBuilder> ljpfimjpjdjBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj = 3;</code>
     * @return Whether the ljpfimjpjdj field is set.
     */
    public boolean hasLjpfimjpjdj() {
      return ljpfimjpjdjBuilder_ != null || ljpfimjpjdj_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj = 3;</code>
     * @return The ljpfimjpjdj.
     */
    public POGOProtos.Rpc.PGKKOMHNBDH getLjpfimjpjdj() {
      if (ljpfimjpjdjBuilder_ == null) {
        return ljpfimjpjdj_ == null ? POGOProtos.Rpc.PGKKOMHNBDH.getDefaultInstance() : ljpfimjpjdj_;
      } else {
        return ljpfimjpjdjBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj = 3;</code>
     */
    public Builder setLjpfimjpjdj(POGOProtos.Rpc.PGKKOMHNBDH value) {
      if (ljpfimjpjdjBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ljpfimjpjdj_ = value;
        onChanged();
      } else {
        ljpfimjpjdjBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj = 3;</code>
     */
    public Builder setLjpfimjpjdj(
        POGOProtos.Rpc.PGKKOMHNBDH.Builder builderForValue) {
      if (ljpfimjpjdjBuilder_ == null) {
        ljpfimjpjdj_ = builderForValue.build();
        onChanged();
      } else {
        ljpfimjpjdjBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj = 3;</code>
     */
    public Builder mergeLjpfimjpjdj(POGOProtos.Rpc.PGKKOMHNBDH value) {
      if (ljpfimjpjdjBuilder_ == null) {
        if (ljpfimjpjdj_ != null) {
          ljpfimjpjdj_ =
            POGOProtos.Rpc.PGKKOMHNBDH.newBuilder(ljpfimjpjdj_).mergeFrom(value).buildPartial();
        } else {
          ljpfimjpjdj_ = value;
        }
        onChanged();
      } else {
        ljpfimjpjdjBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj = 3;</code>
     */
    public Builder clearLjpfimjpjdj() {
      if (ljpfimjpjdjBuilder_ == null) {
        ljpfimjpjdj_ = null;
        onChanged();
      } else {
        ljpfimjpjdj_ = null;
        ljpfimjpjdjBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj = 3;</code>
     */
    public POGOProtos.Rpc.PGKKOMHNBDH.Builder getLjpfimjpjdjBuilder() {
      
      onChanged();
      return getLjpfimjpjdjFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj = 3;</code>
     */
    public POGOProtos.Rpc.PGKKOMHNBDHOrBuilder getLjpfimjpjdjOrBuilder() {
      if (ljpfimjpjdjBuilder_ != null) {
        return ljpfimjpjdjBuilder_.getMessageOrBuilder();
      } else {
        return ljpfimjpjdj_ == null ?
            POGOProtos.Rpc.PGKKOMHNBDH.getDefaultInstance() : ljpfimjpjdj_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PGKKOMHNBDH ljpfimjpjdj = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PGKKOMHNBDH, POGOProtos.Rpc.PGKKOMHNBDH.Builder, POGOProtos.Rpc.PGKKOMHNBDHOrBuilder> 
        getLjpfimjpjdjFieldBuilder() {
      if (ljpfimjpjdjBuilder_ == null) {
        ljpfimjpjdjBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PGKKOMHNBDH, POGOProtos.Rpc.PGKKOMHNBDH.Builder, POGOProtos.Rpc.PGKKOMHNBDHOrBuilder>(
                getLjpfimjpjdj(),
                getParentForChildren(),
                isClean());
        ljpfimjpjdj_ = null;
      }
      return ljpfimjpjdjBuilder_;
    }

    private int opodipeklnn_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Item opodipeklnn = 4;</code>
     * @return The enum numeric value on the wire for opodipeklnn.
     */
    public int getOpodipeklnnValue() {
      return opodipeklnn_;
    }
    /**
     * <code>.POGOProtos.Rpc.Item opodipeklnn = 4;</code>
     * @param value The enum numeric value on the wire for opodipeklnn to set.
     * @return This builder for chaining.
     */
    public Builder setOpodipeklnnValue(int value) {
      opodipeklnn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item opodipeklnn = 4;</code>
     * @return The opodipeklnn.
     */
    public POGOProtos.Rpc.Item getOpodipeklnn() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(opodipeklnn_);
      return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Item opodipeklnn = 4;</code>
     * @param value The opodipeklnn to set.
     * @return This builder for chaining.
     */
    public Builder setOpodipeklnn(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      opodipeklnn_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item opodipeklnn = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpodipeklnn() {
      
      opodipeklnn_ = 0;
      onChanged();
      return this;
    }

    private int ekmejobghjg_ ;
    /**
     * <code>int32 ekmejobghjg = 5;</code>
     * @return The ekmejobghjg.
     */
    public int getEkmejobghjg() {
      return ekmejobghjg_;
    }
    /**
     * <code>int32 ekmejobghjg = 5;</code>
     * @param value The ekmejobghjg to set.
     * @return This builder for chaining.
     */
    public Builder setEkmejobghjg(int value) {
      
      ekmejobghjg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ekmejobghjg = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEkmejobghjg() {
      
      ekmejobghjg_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KHPNFDMJGCE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KHPNFDMJGCE)
  private static final POGOProtos.Rpc.KHPNFDMJGCE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KHPNFDMJGCE();
  }

  public static POGOProtos.Rpc.KHPNFDMJGCE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KHPNFDMJGCE>
      PARSER = new com.google.protobuf.AbstractParser<KHPNFDMJGCE>() {
    @java.lang.Override
    public KHPNFDMJGCE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KHPNFDMJGCE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KHPNFDMJGCE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KHPNFDMJGCE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KHPNFDMJGCE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

