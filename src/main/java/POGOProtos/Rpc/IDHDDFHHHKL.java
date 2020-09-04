// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: IDHDDFHHHKL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.IDHDDFHHHKL}
 */
public final class IDHDDFHHHKL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IDHDDFHHHKL)
    IDHDDFHHHKLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IDHDDFHHHKL.newBuilder() to construct.
  private IDHDDFHHHKL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IDHDDFHHHKL() {
    lknpioglmib_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IDHDDFHHHKL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IDHDDFHHHKL(
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
            POGOProtos.Rpc.NJAEBCDCPIG.Builder subBuilder = null;
            if (mkllhjhebdg_ != null) {
              subBuilder = mkllhjhebdg_.toBuilder();
            }
            mkllhjhebdg_ = input.readMessage(POGOProtos.Rpc.NJAEBCDCPIG.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(mkllhjhebdg_);
              mkllhjhebdg_ = subBuilder.buildPartial();
            }

            break;
          }
          case 25: {

            ppbjhoeaboh_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IDHDDFHHHKL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IDHDDFHHHKL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IDHDDFHHHKL.class, POGOProtos.Rpc.IDHDDFHHHKL.Builder.class);
  }

  /**
   * <pre>
   * ref: IDHDDFHHHKL/IHKGNBMKBGH/NOHBAFDIGNG
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG}
   */
  public enum NOHBAFDIGNG
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
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
    public static NOHBAFDIGNG valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NOHBAFDIGNG forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NOHBAFDIGNG>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NOHBAFDIGNG> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NOHBAFDIGNG>() {
            public NOHBAFDIGNG findValueByNumber(int number) {
              return NOHBAFDIGNG.forNumber(number);
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
      return POGOProtos.Rpc.IDHDDFHHHKL.getDescriptor().getEnumTypes().get(0);
    }

    private static final NOHBAFDIGNG[] VALUES = values();

    public static NOHBAFDIGNG valueOf(
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

    private NOHBAFDIGNG(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG)
  }

  public static final int LKNPIOGLMIB_FIELD_NUMBER = 1;
  private int lknpioglmib_;
  /**
   * <code>.POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG lknpioglmib = 1;</code>
   * @return The enum numeric value on the wire for lknpioglmib.
   */
  @java.lang.Override public int getLknpioglmibValue() {
    return lknpioglmib_;
  }
  /**
   * <code>.POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG lknpioglmib = 1;</code>
   * @return The lknpioglmib.
   */
  @java.lang.Override public POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG getLknpioglmib() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG result = POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG.valueOf(lknpioglmib_);
    return result == null ? POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG.UNRECOGNIZED : result;
  }

  public static final int MKLLHJHEBDG_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg_;
  /**
   * <code>.POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg = 2;</code>
   * @return Whether the mkllhjhebdg field is set.
   */
  @java.lang.Override
  public boolean hasMkllhjhebdg() {
    return mkllhjhebdg_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg = 2;</code>
   * @return The mkllhjhebdg.
   */
  @java.lang.Override
  public POGOProtos.Rpc.NJAEBCDCPIG getMkllhjhebdg() {
    return mkllhjhebdg_ == null ? POGOProtos.Rpc.NJAEBCDCPIG.getDefaultInstance() : mkllhjhebdg_;
  }
  /**
   * <code>.POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.NJAEBCDCPIGOrBuilder getMkllhjhebdgOrBuilder() {
    return getMkllhjhebdg();
  }

  public static final int PPBJHOEABOH_FIELD_NUMBER = 3;
  private double ppbjhoeaboh_;
  /**
   * <code>double ppbjhoeaboh = 3;</code>
   * @return The ppbjhoeaboh.
   */
  @java.lang.Override
  public double getPpbjhoeaboh() {
    return ppbjhoeaboh_;
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
    if (lknpioglmib_ != POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG.UNSET.getNumber()) {
      output.writeEnum(1, lknpioglmib_);
    }
    if (mkllhjhebdg_ != null) {
      output.writeMessage(2, getMkllhjhebdg());
    }
    if (ppbjhoeaboh_ != 0D) {
      output.writeDouble(3, ppbjhoeaboh_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lknpioglmib_ != POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lknpioglmib_);
    }
    if (mkllhjhebdg_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMkllhjhebdg());
    }
    if (ppbjhoeaboh_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, ppbjhoeaboh_);
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
    if (!(obj instanceof POGOProtos.Rpc.IDHDDFHHHKL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IDHDDFHHHKL other = (POGOProtos.Rpc.IDHDDFHHHKL) obj;

    if (lknpioglmib_ != other.lknpioglmib_) return false;
    if (hasMkllhjhebdg() != other.hasMkllhjhebdg()) return false;
    if (hasMkllhjhebdg()) {
      if (!getMkllhjhebdg()
          .equals(other.getMkllhjhebdg())) return false;
    }
    if (java.lang.Double.doubleToLongBits(getPpbjhoeaboh())
        != java.lang.Double.doubleToLongBits(
            other.getPpbjhoeaboh())) return false;
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
    if (hasMkllhjhebdg()) {
      hash = (37 * hash) + MKLLHJHEBDG_FIELD_NUMBER;
      hash = (53 * hash) + getMkllhjhebdg().hashCode();
    }
    hash = (37 * hash) + PPBJHOEABOH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPpbjhoeaboh()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IDHDDFHHHKL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IDHDDFHHHKL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDHDDFHHHKL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IDHDDFHHHKL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDHDDFHHHKL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IDHDDFHHHKL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDHDDFHHHKL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IDHDDFHHHKL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDHDDFHHHKL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IDHDDFHHHKL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDHDDFHHHKL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IDHDDFHHHKL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IDHDDFHHHKL prototype) {
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
   * ref: IDHDDFHHHKL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.IDHDDFHHHKL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IDHDDFHHHKL)
      POGOProtos.Rpc.IDHDDFHHHKLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IDHDDFHHHKL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IDHDDFHHHKL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IDHDDFHHHKL.class, POGOProtos.Rpc.IDHDDFHHHKL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IDHDDFHHHKL.newBuilder()
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

      if (mkllhjhebdgBuilder_ == null) {
        mkllhjhebdg_ = null;
      } else {
        mkllhjhebdg_ = null;
        mkllhjhebdgBuilder_ = null;
      }
      ppbjhoeaboh_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IDHDDFHHHKL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IDHDDFHHHKL getDefaultInstanceForType() {
      return POGOProtos.Rpc.IDHDDFHHHKL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IDHDDFHHHKL build() {
      POGOProtos.Rpc.IDHDDFHHHKL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IDHDDFHHHKL buildPartial() {
      POGOProtos.Rpc.IDHDDFHHHKL result = new POGOProtos.Rpc.IDHDDFHHHKL(this);
      result.lknpioglmib_ = lknpioglmib_;
      if (mkllhjhebdgBuilder_ == null) {
        result.mkllhjhebdg_ = mkllhjhebdg_;
      } else {
        result.mkllhjhebdg_ = mkllhjhebdgBuilder_.build();
      }
      result.ppbjhoeaboh_ = ppbjhoeaboh_;
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
      if (other instanceof POGOProtos.Rpc.IDHDDFHHHKL) {
        return mergeFrom((POGOProtos.Rpc.IDHDDFHHHKL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IDHDDFHHHKL other) {
      if (other == POGOProtos.Rpc.IDHDDFHHHKL.getDefaultInstance()) return this;
      if (other.lknpioglmib_ != 0) {
        setLknpioglmibValue(other.getLknpioglmibValue());
      }
      if (other.hasMkllhjhebdg()) {
        mergeMkllhjhebdg(other.getMkllhjhebdg());
      }
      if (other.getPpbjhoeaboh() != 0D) {
        setPpbjhoeaboh(other.getPpbjhoeaboh());
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
      POGOProtos.Rpc.IDHDDFHHHKL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IDHDDFHHHKL) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG lknpioglmib = 1;</code>
     * @return The enum numeric value on the wire for lknpioglmib.
     */
    @java.lang.Override public int getLknpioglmibValue() {
      return lknpioglmib_;
    }
    /**
     * <code>.POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG lknpioglmib = 1;</code>
     * @param value The enum numeric value on the wire for lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmibValue(int value) {
      
      lknpioglmib_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG lknpioglmib = 1;</code>
     * @return The lknpioglmib.
     */
    @java.lang.Override
    public POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG getLknpioglmib() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG result = POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG.valueOf(lknpioglmib_);
      return result == null ? POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG lknpioglmib = 1;</code>
     * @param value The lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmib(POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lknpioglmib_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IDHDDFHHHKL.NOHBAFDIGNG lknpioglmib = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLknpioglmib() {
      
      lknpioglmib_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.NJAEBCDCPIG, POGOProtos.Rpc.NJAEBCDCPIG.Builder, POGOProtos.Rpc.NJAEBCDCPIGOrBuilder> mkllhjhebdgBuilder_;
    /**
     * <code>.POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg = 2;</code>
     * @return Whether the mkllhjhebdg field is set.
     */
    public boolean hasMkllhjhebdg() {
      return mkllhjhebdgBuilder_ != null || mkllhjhebdg_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg = 2;</code>
     * @return The mkllhjhebdg.
     */
    public POGOProtos.Rpc.NJAEBCDCPIG getMkllhjhebdg() {
      if (mkllhjhebdgBuilder_ == null) {
        return mkllhjhebdg_ == null ? POGOProtos.Rpc.NJAEBCDCPIG.getDefaultInstance() : mkllhjhebdg_;
      } else {
        return mkllhjhebdgBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg = 2;</code>
     */
    public Builder setMkllhjhebdg(POGOProtos.Rpc.NJAEBCDCPIG value) {
      if (mkllhjhebdgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mkllhjhebdg_ = value;
        onChanged();
      } else {
        mkllhjhebdgBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg = 2;</code>
     */
    public Builder setMkllhjhebdg(
        POGOProtos.Rpc.NJAEBCDCPIG.Builder builderForValue) {
      if (mkllhjhebdgBuilder_ == null) {
        mkllhjhebdg_ = builderForValue.build();
        onChanged();
      } else {
        mkllhjhebdgBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg = 2;</code>
     */
    public Builder mergeMkllhjhebdg(POGOProtos.Rpc.NJAEBCDCPIG value) {
      if (mkllhjhebdgBuilder_ == null) {
        if (mkllhjhebdg_ != null) {
          mkllhjhebdg_ =
            POGOProtos.Rpc.NJAEBCDCPIG.newBuilder(mkllhjhebdg_).mergeFrom(value).buildPartial();
        } else {
          mkllhjhebdg_ = value;
        }
        onChanged();
      } else {
        mkllhjhebdgBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg = 2;</code>
     */
    public Builder clearMkllhjhebdg() {
      if (mkllhjhebdgBuilder_ == null) {
        mkllhjhebdg_ = null;
        onChanged();
      } else {
        mkllhjhebdg_ = null;
        mkllhjhebdgBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg = 2;</code>
     */
    public POGOProtos.Rpc.NJAEBCDCPIG.Builder getMkllhjhebdgBuilder() {
      
      onChanged();
      return getMkllhjhebdgFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg = 2;</code>
     */
    public POGOProtos.Rpc.NJAEBCDCPIGOrBuilder getMkllhjhebdgOrBuilder() {
      if (mkllhjhebdgBuilder_ != null) {
        return mkllhjhebdgBuilder_.getMessageOrBuilder();
      } else {
        return mkllhjhebdg_ == null ?
            POGOProtos.Rpc.NJAEBCDCPIG.getDefaultInstance() : mkllhjhebdg_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.NJAEBCDCPIG mkllhjhebdg = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.NJAEBCDCPIG, POGOProtos.Rpc.NJAEBCDCPIG.Builder, POGOProtos.Rpc.NJAEBCDCPIGOrBuilder> 
        getMkllhjhebdgFieldBuilder() {
      if (mkllhjhebdgBuilder_ == null) {
        mkllhjhebdgBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.NJAEBCDCPIG, POGOProtos.Rpc.NJAEBCDCPIG.Builder, POGOProtos.Rpc.NJAEBCDCPIGOrBuilder>(
                getMkllhjhebdg(),
                getParentForChildren(),
                isClean());
        mkllhjhebdg_ = null;
      }
      return mkllhjhebdgBuilder_;
    }

    private double ppbjhoeaboh_ ;
    /**
     * <code>double ppbjhoeaboh = 3;</code>
     * @return The ppbjhoeaboh.
     */
    @java.lang.Override
    public double getPpbjhoeaboh() {
      return ppbjhoeaboh_;
    }
    /**
     * <code>double ppbjhoeaboh = 3;</code>
     * @param value The ppbjhoeaboh to set.
     * @return This builder for chaining.
     */
    public Builder setPpbjhoeaboh(double value) {
      
      ppbjhoeaboh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double ppbjhoeaboh = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPpbjhoeaboh() {
      
      ppbjhoeaboh_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IDHDDFHHHKL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IDHDDFHHHKL)
  private static final POGOProtos.Rpc.IDHDDFHHHKL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IDHDDFHHHKL();
  }

  public static POGOProtos.Rpc.IDHDDFHHHKL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IDHDDFHHHKL>
      PARSER = new com.google.protobuf.AbstractParser<IDHDDFHHHKL>() {
    @java.lang.Override
    public IDHDDFHHHKL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IDHDDFHHHKL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IDHDDFHHHKL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IDHDDFHHHKL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IDHDDFHHHKL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

