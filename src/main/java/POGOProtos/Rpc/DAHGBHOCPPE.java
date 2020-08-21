// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DAHGBHOCPPE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.DAHGBHOCPPE}
 */
public final class DAHGBHOCPPE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DAHGBHOCPPE)
    DAHGBHOCPPEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DAHGBHOCPPE.newBuilder() to construct.
  private DAHGBHOCPPE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DAHGBHOCPPE() {
    lcajjpmoafe_ = 0;
    hnocgafnlkp_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DAHGBHOCPPE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DAHGBHOCPPE(
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
            POGOProtos.Rpc.JPPJGGHOJFC.Builder subBuilder = null;
            if (igaehcifidf_ != null) {
              subBuilder = igaehcifidf_.toBuilder();
            }
            igaehcifidf_ = input.readMessage(POGOProtos.Rpc.JPPJGGHOJFC.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(igaehcifidf_);
              igaehcifidf_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            POGOProtos.Rpc.DFAIOMGIFJI.Builder subBuilder = null;
            if (ekjfnjbabkp_ != null) {
              subBuilder = ekjfnjbabkp_.toBuilder();
            }
            ekjfnjbabkp_ = input.readMessage(POGOProtos.Rpc.DFAIOMGIFJI.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ekjfnjbabkp_);
              ekjfnjbabkp_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            hnocgafnlkp_ = rawValue;
            break;
          }
          case 40: {

            bjllibelhkb_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DAHGBHOCPPE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DAHGBHOCPPE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DAHGBHOCPPE.class, POGOProtos.Rpc.DAHGBHOCPPE.Builder.class);
  }

  /**
   * <pre>
   * ref: DAHGBHOCPPE/FJNGOGDIFJA/OMOGBFPLBAB
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB}
   */
  public enum OMOGBFPLBAB
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
    public static OMOGBFPLBAB valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OMOGBFPLBAB forNumber(int value) {
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

    public static com.google.protobuf.Internal.EnumLiteMap<OMOGBFPLBAB>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OMOGBFPLBAB> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OMOGBFPLBAB>() {
            public OMOGBFPLBAB findValueByNumber(int number) {
              return OMOGBFPLBAB.forNumber(number);
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
      return POGOProtos.Rpc.DAHGBHOCPPE.getDescriptor().getEnumTypes().get(0);
    }

    private static final OMOGBFPLBAB[] VALUES = values();

    public static OMOGBFPLBAB valueOf(
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

    private OMOGBFPLBAB(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB)
  }

  public static final int LCAJJPMOAFE_FIELD_NUMBER = 1;
  private int lcajjpmoafe_;
  /**
   * <code>.POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB lcajjpmoafe = 1;</code>
   * @return The enum numeric value on the wire for lcajjpmoafe.
   */
  @java.lang.Override public int getLcajjpmoafeValue() {
    return lcajjpmoafe_;
  }
  /**
   * <code>.POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB lcajjpmoafe = 1;</code>
   * @return The lcajjpmoafe.
   */
  @java.lang.Override public POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB getLcajjpmoafe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB result = POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB.valueOf(lcajjpmoafe_);
    return result == null ? POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB.UNRECOGNIZED : result;
  }

  public static final int IGAEHCIFIDF_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf_;
  /**
   * <code>.POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf = 2;</code>
   * @return Whether the igaehcifidf field is set.
   */
  @java.lang.Override
  public boolean hasIgaehcifidf() {
    return igaehcifidf_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf = 2;</code>
   * @return The igaehcifidf.
   */
  @java.lang.Override
  public POGOProtos.Rpc.JPPJGGHOJFC getIgaehcifidf() {
    return igaehcifidf_ == null ? POGOProtos.Rpc.JPPJGGHOJFC.getDefaultInstance() : igaehcifidf_;
  }
  /**
   * <code>.POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.JPPJGGHOJFCOrBuilder getIgaehcifidfOrBuilder() {
    return getIgaehcifidf();
  }

  public static final int EKJFNJBABKP_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp_;
  /**
   * <code>.POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp = 3;</code>
   * @return Whether the ekjfnjbabkp field is set.
   */
  @java.lang.Override
  public boolean hasEkjfnjbabkp() {
    return ekjfnjbabkp_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp = 3;</code>
   * @return The ekjfnjbabkp.
   */
  @java.lang.Override
  public POGOProtos.Rpc.DFAIOMGIFJI getEkjfnjbabkp() {
    return ekjfnjbabkp_ == null ? POGOProtos.Rpc.DFAIOMGIFJI.getDefaultInstance() : ekjfnjbabkp_;
  }
  /**
   * <code>.POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.DFAIOMGIFJIOrBuilder getEkjfnjbabkpOrBuilder() {
    return getEkjfnjbabkp();
  }

  public static final int HNOCGAFNLKP_FIELD_NUMBER = 4;
  private int hnocgafnlkp_;
  /**
   * <code>.POGOProtos.Rpc.PBEFDOIDGPH hnocgafnlkp = 4;</code>
   * @return The enum numeric value on the wire for hnocgafnlkp.
   */
  @java.lang.Override public int getHnocgafnlkpValue() {
    return hnocgafnlkp_;
  }
  /**
   * <code>.POGOProtos.Rpc.PBEFDOIDGPH hnocgafnlkp = 4;</code>
   * @return The hnocgafnlkp.
   */
  @java.lang.Override public POGOProtos.Rpc.PBEFDOIDGPH getHnocgafnlkp() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PBEFDOIDGPH result = POGOProtos.Rpc.PBEFDOIDGPH.valueOf(hnocgafnlkp_);
    return result == null ? POGOProtos.Rpc.PBEFDOIDGPH.UNRECOGNIZED : result;
  }

  public static final int BJLLIBELHKB_FIELD_NUMBER = 5;
  private int bjllibelhkb_;
  /**
   * <code>int32 bjllibelhkb = 5;</code>
   * @return The bjllibelhkb.
   */
  @java.lang.Override
  public int getBjllibelhkb() {
    return bjllibelhkb_;
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
    if (lcajjpmoafe_ != POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB.UNKNOWN.getNumber()) {
      output.writeEnum(1, lcajjpmoafe_);
    }
    if (igaehcifidf_ != null) {
      output.writeMessage(2, getIgaehcifidf());
    }
    if (ekjfnjbabkp_ != null) {
      output.writeMessage(3, getEkjfnjbabkp());
    }
    if (hnocgafnlkp_ != POGOProtos.Rpc.PBEFDOIDGPH.PBEFDOIDGPH_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(4, hnocgafnlkp_);
    }
    if (bjllibelhkb_ != 0) {
      output.writeInt32(5, bjllibelhkb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lcajjpmoafe_ != POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lcajjpmoafe_);
    }
    if (igaehcifidf_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getIgaehcifidf());
    }
    if (ekjfnjbabkp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEkjfnjbabkp());
    }
    if (hnocgafnlkp_ != POGOProtos.Rpc.PBEFDOIDGPH.PBEFDOIDGPH_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, hnocgafnlkp_);
    }
    if (bjllibelhkb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, bjllibelhkb_);
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
    if (!(obj instanceof POGOProtos.Rpc.DAHGBHOCPPE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DAHGBHOCPPE other = (POGOProtos.Rpc.DAHGBHOCPPE) obj;

    if (lcajjpmoafe_ != other.lcajjpmoafe_) return false;
    if (hasIgaehcifidf() != other.hasIgaehcifidf()) return false;
    if (hasIgaehcifidf()) {
      if (!getIgaehcifidf()
          .equals(other.getIgaehcifidf())) return false;
    }
    if (hasEkjfnjbabkp() != other.hasEkjfnjbabkp()) return false;
    if (hasEkjfnjbabkp()) {
      if (!getEkjfnjbabkp()
          .equals(other.getEkjfnjbabkp())) return false;
    }
    if (hnocgafnlkp_ != other.hnocgafnlkp_) return false;
    if (getBjllibelhkb()
        != other.getBjllibelhkb()) return false;
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
    if (hasIgaehcifidf()) {
      hash = (37 * hash) + IGAEHCIFIDF_FIELD_NUMBER;
      hash = (53 * hash) + getIgaehcifidf().hashCode();
    }
    if (hasEkjfnjbabkp()) {
      hash = (37 * hash) + EKJFNJBABKP_FIELD_NUMBER;
      hash = (53 * hash) + getEkjfnjbabkp().hashCode();
    }
    hash = (37 * hash) + HNOCGAFNLKP_FIELD_NUMBER;
    hash = (53 * hash) + hnocgafnlkp_;
    hash = (37 * hash) + BJLLIBELHKB_FIELD_NUMBER;
    hash = (53 * hash) + getBjllibelhkb();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DAHGBHOCPPE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DAHGBHOCPPE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DAHGBHOCPPE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DAHGBHOCPPE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DAHGBHOCPPE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DAHGBHOCPPE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DAHGBHOCPPE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DAHGBHOCPPE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DAHGBHOCPPE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DAHGBHOCPPE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DAHGBHOCPPE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DAHGBHOCPPE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DAHGBHOCPPE prototype) {
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
   * ref: DAHGBHOCPPE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.DAHGBHOCPPE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DAHGBHOCPPE)
      POGOProtos.Rpc.DAHGBHOCPPEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DAHGBHOCPPE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DAHGBHOCPPE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DAHGBHOCPPE.class, POGOProtos.Rpc.DAHGBHOCPPE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DAHGBHOCPPE.newBuilder()
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

      if (igaehcifidfBuilder_ == null) {
        igaehcifidf_ = null;
      } else {
        igaehcifidf_ = null;
        igaehcifidfBuilder_ = null;
      }
      if (ekjfnjbabkpBuilder_ == null) {
        ekjfnjbabkp_ = null;
      } else {
        ekjfnjbabkp_ = null;
        ekjfnjbabkpBuilder_ = null;
      }
      hnocgafnlkp_ = 0;

      bjllibelhkb_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DAHGBHOCPPE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DAHGBHOCPPE getDefaultInstanceForType() {
      return POGOProtos.Rpc.DAHGBHOCPPE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DAHGBHOCPPE build() {
      POGOProtos.Rpc.DAHGBHOCPPE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DAHGBHOCPPE buildPartial() {
      POGOProtos.Rpc.DAHGBHOCPPE result = new POGOProtos.Rpc.DAHGBHOCPPE(this);
      result.lcajjpmoafe_ = lcajjpmoafe_;
      if (igaehcifidfBuilder_ == null) {
        result.igaehcifidf_ = igaehcifidf_;
      } else {
        result.igaehcifidf_ = igaehcifidfBuilder_.build();
      }
      if (ekjfnjbabkpBuilder_ == null) {
        result.ekjfnjbabkp_ = ekjfnjbabkp_;
      } else {
        result.ekjfnjbabkp_ = ekjfnjbabkpBuilder_.build();
      }
      result.hnocgafnlkp_ = hnocgafnlkp_;
      result.bjllibelhkb_ = bjllibelhkb_;
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
      if (other instanceof POGOProtos.Rpc.DAHGBHOCPPE) {
        return mergeFrom((POGOProtos.Rpc.DAHGBHOCPPE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DAHGBHOCPPE other) {
      if (other == POGOProtos.Rpc.DAHGBHOCPPE.getDefaultInstance()) return this;
      if (other.lcajjpmoafe_ != 0) {
        setLcajjpmoafeValue(other.getLcajjpmoafeValue());
      }
      if (other.hasIgaehcifidf()) {
        mergeIgaehcifidf(other.getIgaehcifidf());
      }
      if (other.hasEkjfnjbabkp()) {
        mergeEkjfnjbabkp(other.getEkjfnjbabkp());
      }
      if (other.hnocgafnlkp_ != 0) {
        setHnocgafnlkpValue(other.getHnocgafnlkpValue());
      }
      if (other.getBjllibelhkb() != 0) {
        setBjllibelhkb(other.getBjllibelhkb());
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
      POGOProtos.Rpc.DAHGBHOCPPE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DAHGBHOCPPE) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB lcajjpmoafe = 1;</code>
     * @return The enum numeric value on the wire for lcajjpmoafe.
     */
    @java.lang.Override public int getLcajjpmoafeValue() {
      return lcajjpmoafe_;
    }
    /**
     * <code>.POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB lcajjpmoafe = 1;</code>
     * @param value The enum numeric value on the wire for lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafeValue(int value) {
      
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB lcajjpmoafe = 1;</code>
     * @return The lcajjpmoafe.
     */
    @java.lang.Override
    public POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB getLcajjpmoafe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB result = POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB.valueOf(lcajjpmoafe_);
      return result == null ? POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB lcajjpmoafe = 1;</code>
     * @param value The lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafe(POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lcajjpmoafe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DAHGBHOCPPE.OMOGBFPLBAB lcajjpmoafe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcajjpmoafe() {
      
      lcajjpmoafe_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.JPPJGGHOJFC, POGOProtos.Rpc.JPPJGGHOJFC.Builder, POGOProtos.Rpc.JPPJGGHOJFCOrBuilder> igaehcifidfBuilder_;
    /**
     * <code>.POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf = 2;</code>
     * @return Whether the igaehcifidf field is set.
     */
    public boolean hasIgaehcifidf() {
      return igaehcifidfBuilder_ != null || igaehcifidf_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf = 2;</code>
     * @return The igaehcifidf.
     */
    public POGOProtos.Rpc.JPPJGGHOJFC getIgaehcifidf() {
      if (igaehcifidfBuilder_ == null) {
        return igaehcifidf_ == null ? POGOProtos.Rpc.JPPJGGHOJFC.getDefaultInstance() : igaehcifidf_;
      } else {
        return igaehcifidfBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf = 2;</code>
     */
    public Builder setIgaehcifidf(POGOProtos.Rpc.JPPJGGHOJFC value) {
      if (igaehcifidfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        igaehcifidf_ = value;
        onChanged();
      } else {
        igaehcifidfBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf = 2;</code>
     */
    public Builder setIgaehcifidf(
        POGOProtos.Rpc.JPPJGGHOJFC.Builder builderForValue) {
      if (igaehcifidfBuilder_ == null) {
        igaehcifidf_ = builderForValue.build();
        onChanged();
      } else {
        igaehcifidfBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf = 2;</code>
     */
    public Builder mergeIgaehcifidf(POGOProtos.Rpc.JPPJGGHOJFC value) {
      if (igaehcifidfBuilder_ == null) {
        if (igaehcifidf_ != null) {
          igaehcifidf_ =
            POGOProtos.Rpc.JPPJGGHOJFC.newBuilder(igaehcifidf_).mergeFrom(value).buildPartial();
        } else {
          igaehcifidf_ = value;
        }
        onChanged();
      } else {
        igaehcifidfBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf = 2;</code>
     */
    public Builder clearIgaehcifidf() {
      if (igaehcifidfBuilder_ == null) {
        igaehcifidf_ = null;
        onChanged();
      } else {
        igaehcifidf_ = null;
        igaehcifidfBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf = 2;</code>
     */
    public POGOProtos.Rpc.JPPJGGHOJFC.Builder getIgaehcifidfBuilder() {
      
      onChanged();
      return getIgaehcifidfFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf = 2;</code>
     */
    public POGOProtos.Rpc.JPPJGGHOJFCOrBuilder getIgaehcifidfOrBuilder() {
      if (igaehcifidfBuilder_ != null) {
        return igaehcifidfBuilder_.getMessageOrBuilder();
      } else {
        return igaehcifidf_ == null ?
            POGOProtos.Rpc.JPPJGGHOJFC.getDefaultInstance() : igaehcifidf_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.JPPJGGHOJFC igaehcifidf = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.JPPJGGHOJFC, POGOProtos.Rpc.JPPJGGHOJFC.Builder, POGOProtos.Rpc.JPPJGGHOJFCOrBuilder> 
        getIgaehcifidfFieldBuilder() {
      if (igaehcifidfBuilder_ == null) {
        igaehcifidfBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.JPPJGGHOJFC, POGOProtos.Rpc.JPPJGGHOJFC.Builder, POGOProtos.Rpc.JPPJGGHOJFCOrBuilder>(
                getIgaehcifidf(),
                getParentForChildren(),
                isClean());
        igaehcifidf_ = null;
      }
      return igaehcifidfBuilder_;
    }

    private POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.DFAIOMGIFJI, POGOProtos.Rpc.DFAIOMGIFJI.Builder, POGOProtos.Rpc.DFAIOMGIFJIOrBuilder> ekjfnjbabkpBuilder_;
    /**
     * <code>.POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp = 3;</code>
     * @return Whether the ekjfnjbabkp field is set.
     */
    public boolean hasEkjfnjbabkp() {
      return ekjfnjbabkpBuilder_ != null || ekjfnjbabkp_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp = 3;</code>
     * @return The ekjfnjbabkp.
     */
    public POGOProtos.Rpc.DFAIOMGIFJI getEkjfnjbabkp() {
      if (ekjfnjbabkpBuilder_ == null) {
        return ekjfnjbabkp_ == null ? POGOProtos.Rpc.DFAIOMGIFJI.getDefaultInstance() : ekjfnjbabkp_;
      } else {
        return ekjfnjbabkpBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp = 3;</code>
     */
    public Builder setEkjfnjbabkp(POGOProtos.Rpc.DFAIOMGIFJI value) {
      if (ekjfnjbabkpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ekjfnjbabkp_ = value;
        onChanged();
      } else {
        ekjfnjbabkpBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp = 3;</code>
     */
    public Builder setEkjfnjbabkp(
        POGOProtos.Rpc.DFAIOMGIFJI.Builder builderForValue) {
      if (ekjfnjbabkpBuilder_ == null) {
        ekjfnjbabkp_ = builderForValue.build();
        onChanged();
      } else {
        ekjfnjbabkpBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp = 3;</code>
     */
    public Builder mergeEkjfnjbabkp(POGOProtos.Rpc.DFAIOMGIFJI value) {
      if (ekjfnjbabkpBuilder_ == null) {
        if (ekjfnjbabkp_ != null) {
          ekjfnjbabkp_ =
            POGOProtos.Rpc.DFAIOMGIFJI.newBuilder(ekjfnjbabkp_).mergeFrom(value).buildPartial();
        } else {
          ekjfnjbabkp_ = value;
        }
        onChanged();
      } else {
        ekjfnjbabkpBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp = 3;</code>
     */
    public Builder clearEkjfnjbabkp() {
      if (ekjfnjbabkpBuilder_ == null) {
        ekjfnjbabkp_ = null;
        onChanged();
      } else {
        ekjfnjbabkp_ = null;
        ekjfnjbabkpBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp = 3;</code>
     */
    public POGOProtos.Rpc.DFAIOMGIFJI.Builder getEkjfnjbabkpBuilder() {
      
      onChanged();
      return getEkjfnjbabkpFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp = 3;</code>
     */
    public POGOProtos.Rpc.DFAIOMGIFJIOrBuilder getEkjfnjbabkpOrBuilder() {
      if (ekjfnjbabkpBuilder_ != null) {
        return ekjfnjbabkpBuilder_.getMessageOrBuilder();
      } else {
        return ekjfnjbabkp_ == null ?
            POGOProtos.Rpc.DFAIOMGIFJI.getDefaultInstance() : ekjfnjbabkp_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.DFAIOMGIFJI ekjfnjbabkp = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.DFAIOMGIFJI, POGOProtos.Rpc.DFAIOMGIFJI.Builder, POGOProtos.Rpc.DFAIOMGIFJIOrBuilder> 
        getEkjfnjbabkpFieldBuilder() {
      if (ekjfnjbabkpBuilder_ == null) {
        ekjfnjbabkpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.DFAIOMGIFJI, POGOProtos.Rpc.DFAIOMGIFJI.Builder, POGOProtos.Rpc.DFAIOMGIFJIOrBuilder>(
                getEkjfnjbabkp(),
                getParentForChildren(),
                isClean());
        ekjfnjbabkp_ = null;
      }
      return ekjfnjbabkpBuilder_;
    }

    private int hnocgafnlkp_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PBEFDOIDGPH hnocgafnlkp = 4;</code>
     * @return The enum numeric value on the wire for hnocgafnlkp.
     */
    @java.lang.Override public int getHnocgafnlkpValue() {
      return hnocgafnlkp_;
    }
    /**
     * <code>.POGOProtos.Rpc.PBEFDOIDGPH hnocgafnlkp = 4;</code>
     * @param value The enum numeric value on the wire for hnocgafnlkp to set.
     * @return This builder for chaining.
     */
    public Builder setHnocgafnlkpValue(int value) {
      
      hnocgafnlkp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PBEFDOIDGPH hnocgafnlkp = 4;</code>
     * @return The hnocgafnlkp.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PBEFDOIDGPH getHnocgafnlkp() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PBEFDOIDGPH result = POGOProtos.Rpc.PBEFDOIDGPH.valueOf(hnocgafnlkp_);
      return result == null ? POGOProtos.Rpc.PBEFDOIDGPH.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PBEFDOIDGPH hnocgafnlkp = 4;</code>
     * @param value The hnocgafnlkp to set.
     * @return This builder for chaining.
     */
    public Builder setHnocgafnlkp(POGOProtos.Rpc.PBEFDOIDGPH value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      hnocgafnlkp_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PBEFDOIDGPH hnocgafnlkp = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHnocgafnlkp() {
      
      hnocgafnlkp_ = 0;
      onChanged();
      return this;
    }

    private int bjllibelhkb_ ;
    /**
     * <code>int32 bjllibelhkb = 5;</code>
     * @return The bjllibelhkb.
     */
    @java.lang.Override
    public int getBjllibelhkb() {
      return bjllibelhkb_;
    }
    /**
     * <code>int32 bjllibelhkb = 5;</code>
     * @param value The bjllibelhkb to set.
     * @return This builder for chaining.
     */
    public Builder setBjllibelhkb(int value) {
      
      bjllibelhkb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bjllibelhkb = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBjllibelhkb() {
      
      bjllibelhkb_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DAHGBHOCPPE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DAHGBHOCPPE)
  private static final POGOProtos.Rpc.DAHGBHOCPPE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DAHGBHOCPPE();
  }

  public static POGOProtos.Rpc.DAHGBHOCPPE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DAHGBHOCPPE>
      PARSER = new com.google.protobuf.AbstractParser<DAHGBHOCPPE>() {
    @java.lang.Override
    public DAHGBHOCPPE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DAHGBHOCPPE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DAHGBHOCPPE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DAHGBHOCPPE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DAHGBHOCPPE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

