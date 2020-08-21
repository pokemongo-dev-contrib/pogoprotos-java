// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HCAGLMGPPPP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HCAGLMGPPPP}
 */
public final class HCAGLMGPPPP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HCAGLMGPPPP)
    HCAGLMGPPPPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HCAGLMGPPPP.newBuilder() to construct.
  private HCAGLMGPPPP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HCAGLMGPPPP() {
    lcajjpmoafe_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HCAGLMGPPPP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HCAGLMGPPPP(
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
          case 16: {

            jddeopggoia_ = input.readInt64();
            break;
          }
          case 24: {

            egpnkjcghnf_ = input.readInt64();
            break;
          }
          case 34: {
            POGOProtos.Rpc.EEFAGCGPFHA.Builder subBuilder = null;
            if (bjbnmbgkalk_ != null) {
              subBuilder = bjbnmbgkalk_.toBuilder();
            }
            bjbnmbgkalk_ = input.readMessage(POGOProtos.Rpc.EEFAGCGPFHA.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bjbnmbgkalk_);
              bjbnmbgkalk_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HCAGLMGPPPP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HCAGLMGPPPP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HCAGLMGPPPP.class, POGOProtos.Rpc.HCAGLMGPPPP.Builder.class);
  }

  /**
   * <pre>
   * ref: HCAGLMGPPPP/GIOHKEENIAB/GKNFJOGBHKE
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE}
   */
  public enum GKNFJOGBHKE
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
     * <code>ERROR_BUDDY_NOT_VALID = 2;</code>
     */
    ERROR_BUDDY_NOT_VALID(2),
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
     * <code>ERROR_BUDDY_NOT_VALID = 2;</code>
     */
    public static final int ERROR_BUDDY_NOT_VALID_VALUE = 2;


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
    public static GKNFJOGBHKE valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GKNFJOGBHKE forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_BUDDY_NOT_VALID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GKNFJOGBHKE>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GKNFJOGBHKE> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GKNFJOGBHKE>() {
            public GKNFJOGBHKE findValueByNumber(int number) {
              return GKNFJOGBHKE.forNumber(number);
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
      return POGOProtos.Rpc.HCAGLMGPPPP.getDescriptor().getEnumTypes().get(0);
    }

    private static final GKNFJOGBHKE[] VALUES = values();

    public static GKNFJOGBHKE valueOf(
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

    private GKNFJOGBHKE(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE)
  }

  public static final int LCAJJPMOAFE_FIELD_NUMBER = 1;
  private int lcajjpmoafe_;
  /**
   * <code>.POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE lcajjpmoafe = 1;</code>
   * @return The enum numeric value on the wire for lcajjpmoafe.
   */
  @java.lang.Override public int getLcajjpmoafeValue() {
    return lcajjpmoafe_;
  }
  /**
   * <code>.POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE lcajjpmoafe = 1;</code>
   * @return The lcajjpmoafe.
   */
  @java.lang.Override public POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE getLcajjpmoafe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE result = POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE.valueOf(lcajjpmoafe_);
    return result == null ? POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE.UNRECOGNIZED : result;
  }

  public static final int JDDEOPGGOIA_FIELD_NUMBER = 2;
  private long jddeopggoia_;
  /**
   * <code>int64 jddeopggoia = 2;</code>
   * @return The jddeopggoia.
   */
  @java.lang.Override
  public long getJddeopggoia() {
    return jddeopggoia_;
  }

  public static final int EGPNKJCGHNF_FIELD_NUMBER = 3;
  private long egpnkjcghnf_;
  /**
   * <code>int64 egpnkjcghnf = 3;</code>
   * @return The egpnkjcghnf.
   */
  @java.lang.Override
  public long getEgpnkjcghnf() {
    return egpnkjcghnf_;
  }

  public static final int BJBNMBGKALK_FIELD_NUMBER = 4;
  private POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk_;
  /**
   * <code>.POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk = 4;</code>
   * @return Whether the bjbnmbgkalk field is set.
   */
  @java.lang.Override
  public boolean hasBjbnmbgkalk() {
    return bjbnmbgkalk_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk = 4;</code>
   * @return The bjbnmbgkalk.
   */
  @java.lang.Override
  public POGOProtos.Rpc.EEFAGCGPFHA getBjbnmbgkalk() {
    return bjbnmbgkalk_ == null ? POGOProtos.Rpc.EEFAGCGPFHA.getDefaultInstance() : bjbnmbgkalk_;
  }
  /**
   * <code>.POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.EEFAGCGPFHAOrBuilder getBjbnmbgkalkOrBuilder() {
    return getBjbnmbgkalk();
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
    if (lcajjpmoafe_ != POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE.UNSET.getNumber()) {
      output.writeEnum(1, lcajjpmoafe_);
    }
    if (jddeopggoia_ != 0L) {
      output.writeInt64(2, jddeopggoia_);
    }
    if (egpnkjcghnf_ != 0L) {
      output.writeInt64(3, egpnkjcghnf_);
    }
    if (bjbnmbgkalk_ != null) {
      output.writeMessage(4, getBjbnmbgkalk());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lcajjpmoafe_ != POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lcajjpmoafe_);
    }
    if (jddeopggoia_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, jddeopggoia_);
    }
    if (egpnkjcghnf_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, egpnkjcghnf_);
    }
    if (bjbnmbgkalk_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getBjbnmbgkalk());
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
    if (!(obj instanceof POGOProtos.Rpc.HCAGLMGPPPP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HCAGLMGPPPP other = (POGOProtos.Rpc.HCAGLMGPPPP) obj;

    if (lcajjpmoafe_ != other.lcajjpmoafe_) return false;
    if (getJddeopggoia()
        != other.getJddeopggoia()) return false;
    if (getEgpnkjcghnf()
        != other.getEgpnkjcghnf()) return false;
    if (hasBjbnmbgkalk() != other.hasBjbnmbgkalk()) return false;
    if (hasBjbnmbgkalk()) {
      if (!getBjbnmbgkalk()
          .equals(other.getBjbnmbgkalk())) return false;
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
    hash = (37 * hash) + JDDEOPGGOIA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getJddeopggoia());
    hash = (37 * hash) + EGPNKJCGHNF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEgpnkjcghnf());
    if (hasBjbnmbgkalk()) {
      hash = (37 * hash) + BJBNMBGKALK_FIELD_NUMBER;
      hash = (53 * hash) + getBjbnmbgkalk().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HCAGLMGPPPP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HCAGLMGPPPP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HCAGLMGPPPP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HCAGLMGPPPP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HCAGLMGPPPP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HCAGLMGPPPP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HCAGLMGPPPP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HCAGLMGPPPP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HCAGLMGPPPP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HCAGLMGPPPP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HCAGLMGPPPP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HCAGLMGPPPP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HCAGLMGPPPP prototype) {
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
   * ref: HCAGLMGPPPP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HCAGLMGPPPP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HCAGLMGPPPP)
      POGOProtos.Rpc.HCAGLMGPPPPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HCAGLMGPPPP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HCAGLMGPPPP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HCAGLMGPPPP.class, POGOProtos.Rpc.HCAGLMGPPPP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HCAGLMGPPPP.newBuilder()
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

      jddeopggoia_ = 0L;

      egpnkjcghnf_ = 0L;

      if (bjbnmbgkalkBuilder_ == null) {
        bjbnmbgkalk_ = null;
      } else {
        bjbnmbgkalk_ = null;
        bjbnmbgkalkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HCAGLMGPPPP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HCAGLMGPPPP getDefaultInstanceForType() {
      return POGOProtos.Rpc.HCAGLMGPPPP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HCAGLMGPPPP build() {
      POGOProtos.Rpc.HCAGLMGPPPP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HCAGLMGPPPP buildPartial() {
      POGOProtos.Rpc.HCAGLMGPPPP result = new POGOProtos.Rpc.HCAGLMGPPPP(this);
      result.lcajjpmoafe_ = lcajjpmoafe_;
      result.jddeopggoia_ = jddeopggoia_;
      result.egpnkjcghnf_ = egpnkjcghnf_;
      if (bjbnmbgkalkBuilder_ == null) {
        result.bjbnmbgkalk_ = bjbnmbgkalk_;
      } else {
        result.bjbnmbgkalk_ = bjbnmbgkalkBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.HCAGLMGPPPP) {
        return mergeFrom((POGOProtos.Rpc.HCAGLMGPPPP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HCAGLMGPPPP other) {
      if (other == POGOProtos.Rpc.HCAGLMGPPPP.getDefaultInstance()) return this;
      if (other.lcajjpmoafe_ != 0) {
        setLcajjpmoafeValue(other.getLcajjpmoafeValue());
      }
      if (other.getJddeopggoia() != 0L) {
        setJddeopggoia(other.getJddeopggoia());
      }
      if (other.getEgpnkjcghnf() != 0L) {
        setEgpnkjcghnf(other.getEgpnkjcghnf());
      }
      if (other.hasBjbnmbgkalk()) {
        mergeBjbnmbgkalk(other.getBjbnmbgkalk());
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
      POGOProtos.Rpc.HCAGLMGPPPP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HCAGLMGPPPP) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE lcajjpmoafe = 1;</code>
     * @return The enum numeric value on the wire for lcajjpmoafe.
     */
    @java.lang.Override public int getLcajjpmoafeValue() {
      return lcajjpmoafe_;
    }
    /**
     * <code>.POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE lcajjpmoafe = 1;</code>
     * @param value The enum numeric value on the wire for lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafeValue(int value) {
      
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE lcajjpmoafe = 1;</code>
     * @return The lcajjpmoafe.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE getLcajjpmoafe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE result = POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE.valueOf(lcajjpmoafe_);
      return result == null ? POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE lcajjpmoafe = 1;</code>
     * @param value The lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafe(POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lcajjpmoafe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HCAGLMGPPPP.GKNFJOGBHKE lcajjpmoafe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcajjpmoafe() {
      
      lcajjpmoafe_ = 0;
      onChanged();
      return this;
    }

    private long jddeopggoia_ ;
    /**
     * <code>int64 jddeopggoia = 2;</code>
     * @return The jddeopggoia.
     */
    @java.lang.Override
    public long getJddeopggoia() {
      return jddeopggoia_;
    }
    /**
     * <code>int64 jddeopggoia = 2;</code>
     * @param value The jddeopggoia to set.
     * @return This builder for chaining.
     */
    public Builder setJddeopggoia(long value) {
      
      jddeopggoia_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 jddeopggoia = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJddeopggoia() {
      
      jddeopggoia_ = 0L;
      onChanged();
      return this;
    }

    private long egpnkjcghnf_ ;
    /**
     * <code>int64 egpnkjcghnf = 3;</code>
     * @return The egpnkjcghnf.
     */
    @java.lang.Override
    public long getEgpnkjcghnf() {
      return egpnkjcghnf_;
    }
    /**
     * <code>int64 egpnkjcghnf = 3;</code>
     * @param value The egpnkjcghnf to set.
     * @return This builder for chaining.
     */
    public Builder setEgpnkjcghnf(long value) {
      
      egpnkjcghnf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 egpnkjcghnf = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEgpnkjcghnf() {
      
      egpnkjcghnf_ = 0L;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.EEFAGCGPFHA, POGOProtos.Rpc.EEFAGCGPFHA.Builder, POGOProtos.Rpc.EEFAGCGPFHAOrBuilder> bjbnmbgkalkBuilder_;
    /**
     * <code>.POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk = 4;</code>
     * @return Whether the bjbnmbgkalk field is set.
     */
    public boolean hasBjbnmbgkalk() {
      return bjbnmbgkalkBuilder_ != null || bjbnmbgkalk_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk = 4;</code>
     * @return The bjbnmbgkalk.
     */
    public POGOProtos.Rpc.EEFAGCGPFHA getBjbnmbgkalk() {
      if (bjbnmbgkalkBuilder_ == null) {
        return bjbnmbgkalk_ == null ? POGOProtos.Rpc.EEFAGCGPFHA.getDefaultInstance() : bjbnmbgkalk_;
      } else {
        return bjbnmbgkalkBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk = 4;</code>
     */
    public Builder setBjbnmbgkalk(POGOProtos.Rpc.EEFAGCGPFHA value) {
      if (bjbnmbgkalkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bjbnmbgkalk_ = value;
        onChanged();
      } else {
        bjbnmbgkalkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk = 4;</code>
     */
    public Builder setBjbnmbgkalk(
        POGOProtos.Rpc.EEFAGCGPFHA.Builder builderForValue) {
      if (bjbnmbgkalkBuilder_ == null) {
        bjbnmbgkalk_ = builderForValue.build();
        onChanged();
      } else {
        bjbnmbgkalkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk = 4;</code>
     */
    public Builder mergeBjbnmbgkalk(POGOProtos.Rpc.EEFAGCGPFHA value) {
      if (bjbnmbgkalkBuilder_ == null) {
        if (bjbnmbgkalk_ != null) {
          bjbnmbgkalk_ =
            POGOProtos.Rpc.EEFAGCGPFHA.newBuilder(bjbnmbgkalk_).mergeFrom(value).buildPartial();
        } else {
          bjbnmbgkalk_ = value;
        }
        onChanged();
      } else {
        bjbnmbgkalkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk = 4;</code>
     */
    public Builder clearBjbnmbgkalk() {
      if (bjbnmbgkalkBuilder_ == null) {
        bjbnmbgkalk_ = null;
        onChanged();
      } else {
        bjbnmbgkalk_ = null;
        bjbnmbgkalkBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk = 4;</code>
     */
    public POGOProtos.Rpc.EEFAGCGPFHA.Builder getBjbnmbgkalkBuilder() {
      
      onChanged();
      return getBjbnmbgkalkFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk = 4;</code>
     */
    public POGOProtos.Rpc.EEFAGCGPFHAOrBuilder getBjbnmbgkalkOrBuilder() {
      if (bjbnmbgkalkBuilder_ != null) {
        return bjbnmbgkalkBuilder_.getMessageOrBuilder();
      } else {
        return bjbnmbgkalk_ == null ?
            POGOProtos.Rpc.EEFAGCGPFHA.getDefaultInstance() : bjbnmbgkalk_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.EEFAGCGPFHA bjbnmbgkalk = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.EEFAGCGPFHA, POGOProtos.Rpc.EEFAGCGPFHA.Builder, POGOProtos.Rpc.EEFAGCGPFHAOrBuilder> 
        getBjbnmbgkalkFieldBuilder() {
      if (bjbnmbgkalkBuilder_ == null) {
        bjbnmbgkalkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.EEFAGCGPFHA, POGOProtos.Rpc.EEFAGCGPFHA.Builder, POGOProtos.Rpc.EEFAGCGPFHAOrBuilder>(
                getBjbnmbgkalk(),
                getParentForChildren(),
                isClean());
        bjbnmbgkalk_ = null;
      }
      return bjbnmbgkalkBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HCAGLMGPPPP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HCAGLMGPPPP)
  private static final POGOProtos.Rpc.HCAGLMGPPPP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HCAGLMGPPPP();
  }

  public static POGOProtos.Rpc.HCAGLMGPPPP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HCAGLMGPPPP>
      PARSER = new com.google.protobuf.AbstractParser<HCAGLMGPPPP>() {
    @java.lang.Override
    public HCAGLMGPPPP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HCAGLMGPPPP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HCAGLMGPPPP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HCAGLMGPPPP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HCAGLMGPPPP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

