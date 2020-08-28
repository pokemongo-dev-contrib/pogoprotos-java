// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JKJBEGABEMD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JKJBEGABEMD}
 */
public final class JKJBEGABEMD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JKJBEGABEMD)
    JKJBEGABEMDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JKJBEGABEMD.newBuilder() to construct.
  private JKJBEGABEMD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JKJBEGABEMD() {
    magjbjmclno_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JKJBEGABEMD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JKJBEGABEMD(
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

            magjbjmclno_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.LPPOILIGLKF.Builder subBuilder = null;
            if (hljgelfjdfm_ != null) {
              subBuilder = hljgelfjdfm_.toBuilder();
            }
            hljgelfjdfm_ = input.readMessage(POGOProtos.Rpc.LPPOILIGLKF.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hljgelfjdfm_);
              hljgelfjdfm_ = subBuilder.buildPartial();
            }

            break;
          }
          case 25: {

            jbilchfbokm_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JKJBEGABEMD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JKJBEGABEMD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JKJBEGABEMD.class, POGOProtos.Rpc.JKJBEGABEMD.Builder.class);
  }

  /**
   * <pre>
   * ref: JKJBEGABEMD/CLKHMDIADJL/HNPFCBBCMKD
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD}
   */
  public enum HNPFCBBCMKD
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
    public static HNPFCBBCMKD valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HNPFCBBCMKD forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HNPFCBBCMKD>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HNPFCBBCMKD> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HNPFCBBCMKD>() {
            public HNPFCBBCMKD findValueByNumber(int number) {
              return HNPFCBBCMKD.forNumber(number);
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
      return POGOProtos.Rpc.JKJBEGABEMD.getDescriptor().getEnumTypes().get(0);
    }

    private static final HNPFCBBCMKD[] VALUES = values();

    public static HNPFCBBCMKD valueOf(
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

    private HNPFCBBCMKD(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD)
  }

  public static final int MAGJBJMCLNO_FIELD_NUMBER = 1;
  private int magjbjmclno_;
  /**
   * <code>.POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD magjbjmclno = 1;</code>
   * @return The enum numeric value on the wire for magjbjmclno.
   */
  @java.lang.Override public int getMagjbjmclnoValue() {
    return magjbjmclno_;
  }
  /**
   * <code>.POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD magjbjmclno = 1;</code>
   * @return The magjbjmclno.
   */
  @java.lang.Override public POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD getMagjbjmclno() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD result = POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD.valueOf(magjbjmclno_);
    return result == null ? POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD.UNRECOGNIZED : result;
  }

  public static final int HLJGELFJDFM_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm_;
  /**
   * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
   * @return Whether the hljgelfjdfm field is set.
   */
  @java.lang.Override
  public boolean hasHljgelfjdfm() {
    return hljgelfjdfm_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
   * @return The hljgelfjdfm.
   */
  @java.lang.Override
  public POGOProtos.Rpc.LPPOILIGLKF getHljgelfjdfm() {
    return hljgelfjdfm_ == null ? POGOProtos.Rpc.LPPOILIGLKF.getDefaultInstance() : hljgelfjdfm_;
  }
  /**
   * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LPPOILIGLKFOrBuilder getHljgelfjdfmOrBuilder() {
    return getHljgelfjdfm();
  }

  public static final int JBILCHFBOKM_FIELD_NUMBER = 3;
  private double jbilchfbokm_;
  /**
   * <code>double jbilchfbokm = 3;</code>
   * @return The jbilchfbokm.
   */
  @java.lang.Override
  public double getJbilchfbokm() {
    return jbilchfbokm_;
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
    if (magjbjmclno_ != POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD.UNSET.getNumber()) {
      output.writeEnum(1, magjbjmclno_);
    }
    if (hljgelfjdfm_ != null) {
      output.writeMessage(2, getHljgelfjdfm());
    }
    if (jbilchfbokm_ != 0D) {
      output.writeDouble(3, jbilchfbokm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (magjbjmclno_ != POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, magjbjmclno_);
    }
    if (hljgelfjdfm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHljgelfjdfm());
    }
    if (jbilchfbokm_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, jbilchfbokm_);
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
    if (!(obj instanceof POGOProtos.Rpc.JKJBEGABEMD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JKJBEGABEMD other = (POGOProtos.Rpc.JKJBEGABEMD) obj;

    if (magjbjmclno_ != other.magjbjmclno_) return false;
    if (hasHljgelfjdfm() != other.hasHljgelfjdfm()) return false;
    if (hasHljgelfjdfm()) {
      if (!getHljgelfjdfm()
          .equals(other.getHljgelfjdfm())) return false;
    }
    if (java.lang.Double.doubleToLongBits(getJbilchfbokm())
        != java.lang.Double.doubleToLongBits(
            other.getJbilchfbokm())) return false;
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
    hash = (37 * hash) + MAGJBJMCLNO_FIELD_NUMBER;
    hash = (53 * hash) + magjbjmclno_;
    if (hasHljgelfjdfm()) {
      hash = (37 * hash) + HLJGELFJDFM_FIELD_NUMBER;
      hash = (53 * hash) + getHljgelfjdfm().hashCode();
    }
    hash = (37 * hash) + JBILCHFBOKM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getJbilchfbokm()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JKJBEGABEMD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JKJBEGABEMD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JKJBEGABEMD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JKJBEGABEMD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JKJBEGABEMD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JKJBEGABEMD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JKJBEGABEMD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JKJBEGABEMD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JKJBEGABEMD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JKJBEGABEMD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JKJBEGABEMD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JKJBEGABEMD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JKJBEGABEMD prototype) {
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
   * ref: JKJBEGABEMD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JKJBEGABEMD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JKJBEGABEMD)
      POGOProtos.Rpc.JKJBEGABEMDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JKJBEGABEMD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JKJBEGABEMD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JKJBEGABEMD.class, POGOProtos.Rpc.JKJBEGABEMD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JKJBEGABEMD.newBuilder()
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
      magjbjmclno_ = 0;

      if (hljgelfjdfmBuilder_ == null) {
        hljgelfjdfm_ = null;
      } else {
        hljgelfjdfm_ = null;
        hljgelfjdfmBuilder_ = null;
      }
      jbilchfbokm_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JKJBEGABEMD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JKJBEGABEMD getDefaultInstanceForType() {
      return POGOProtos.Rpc.JKJBEGABEMD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JKJBEGABEMD build() {
      POGOProtos.Rpc.JKJBEGABEMD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JKJBEGABEMD buildPartial() {
      POGOProtos.Rpc.JKJBEGABEMD result = new POGOProtos.Rpc.JKJBEGABEMD(this);
      result.magjbjmclno_ = magjbjmclno_;
      if (hljgelfjdfmBuilder_ == null) {
        result.hljgelfjdfm_ = hljgelfjdfm_;
      } else {
        result.hljgelfjdfm_ = hljgelfjdfmBuilder_.build();
      }
      result.jbilchfbokm_ = jbilchfbokm_;
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
      if (other instanceof POGOProtos.Rpc.JKJBEGABEMD) {
        return mergeFrom((POGOProtos.Rpc.JKJBEGABEMD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JKJBEGABEMD other) {
      if (other == POGOProtos.Rpc.JKJBEGABEMD.getDefaultInstance()) return this;
      if (other.magjbjmclno_ != 0) {
        setMagjbjmclnoValue(other.getMagjbjmclnoValue());
      }
      if (other.hasHljgelfjdfm()) {
        mergeHljgelfjdfm(other.getHljgelfjdfm());
      }
      if (other.getJbilchfbokm() != 0D) {
        setJbilchfbokm(other.getJbilchfbokm());
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
      POGOProtos.Rpc.JKJBEGABEMD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JKJBEGABEMD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int magjbjmclno_ = 0;
    /**
     * <code>.POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD magjbjmclno = 1;</code>
     * @return The enum numeric value on the wire for magjbjmclno.
     */
    @java.lang.Override public int getMagjbjmclnoValue() {
      return magjbjmclno_;
    }
    /**
     * <code>.POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD magjbjmclno = 1;</code>
     * @param value The enum numeric value on the wire for magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclnoValue(int value) {
      
      magjbjmclno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD magjbjmclno = 1;</code>
     * @return The magjbjmclno.
     */
    @java.lang.Override
    public POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD getMagjbjmclno() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD result = POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD.valueOf(magjbjmclno_);
      return result == null ? POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD magjbjmclno = 1;</code>
     * @param value The magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclno(POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      magjbjmclno_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JKJBEGABEMD.HNPFCBBCMKD magjbjmclno = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMagjbjmclno() {
      
      magjbjmclno_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LPPOILIGLKF, POGOProtos.Rpc.LPPOILIGLKF.Builder, POGOProtos.Rpc.LPPOILIGLKFOrBuilder> hljgelfjdfmBuilder_;
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     * @return Whether the hljgelfjdfm field is set.
     */
    public boolean hasHljgelfjdfm() {
      return hljgelfjdfmBuilder_ != null || hljgelfjdfm_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     * @return The hljgelfjdfm.
     */
    public POGOProtos.Rpc.LPPOILIGLKF getHljgelfjdfm() {
      if (hljgelfjdfmBuilder_ == null) {
        return hljgelfjdfm_ == null ? POGOProtos.Rpc.LPPOILIGLKF.getDefaultInstance() : hljgelfjdfm_;
      } else {
        return hljgelfjdfmBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    public Builder setHljgelfjdfm(POGOProtos.Rpc.LPPOILIGLKF value) {
      if (hljgelfjdfmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hljgelfjdfm_ = value;
        onChanged();
      } else {
        hljgelfjdfmBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    public Builder setHljgelfjdfm(
        POGOProtos.Rpc.LPPOILIGLKF.Builder builderForValue) {
      if (hljgelfjdfmBuilder_ == null) {
        hljgelfjdfm_ = builderForValue.build();
        onChanged();
      } else {
        hljgelfjdfmBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    public Builder mergeHljgelfjdfm(POGOProtos.Rpc.LPPOILIGLKF value) {
      if (hljgelfjdfmBuilder_ == null) {
        if (hljgelfjdfm_ != null) {
          hljgelfjdfm_ =
            POGOProtos.Rpc.LPPOILIGLKF.newBuilder(hljgelfjdfm_).mergeFrom(value).buildPartial();
        } else {
          hljgelfjdfm_ = value;
        }
        onChanged();
      } else {
        hljgelfjdfmBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    public Builder clearHljgelfjdfm() {
      if (hljgelfjdfmBuilder_ == null) {
        hljgelfjdfm_ = null;
        onChanged();
      } else {
        hljgelfjdfm_ = null;
        hljgelfjdfmBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    public POGOProtos.Rpc.LPPOILIGLKF.Builder getHljgelfjdfmBuilder() {
      
      onChanged();
      return getHljgelfjdfmFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    public POGOProtos.Rpc.LPPOILIGLKFOrBuilder getHljgelfjdfmOrBuilder() {
      if (hljgelfjdfmBuilder_ != null) {
        return hljgelfjdfmBuilder_.getMessageOrBuilder();
      } else {
        return hljgelfjdfm_ == null ?
            POGOProtos.Rpc.LPPOILIGLKF.getDefaultInstance() : hljgelfjdfm_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LPPOILIGLKF hljgelfjdfm = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LPPOILIGLKF, POGOProtos.Rpc.LPPOILIGLKF.Builder, POGOProtos.Rpc.LPPOILIGLKFOrBuilder> 
        getHljgelfjdfmFieldBuilder() {
      if (hljgelfjdfmBuilder_ == null) {
        hljgelfjdfmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.LPPOILIGLKF, POGOProtos.Rpc.LPPOILIGLKF.Builder, POGOProtos.Rpc.LPPOILIGLKFOrBuilder>(
                getHljgelfjdfm(),
                getParentForChildren(),
                isClean());
        hljgelfjdfm_ = null;
      }
      return hljgelfjdfmBuilder_;
    }

    private double jbilchfbokm_ ;
    /**
     * <code>double jbilchfbokm = 3;</code>
     * @return The jbilchfbokm.
     */
    @java.lang.Override
    public double getJbilchfbokm() {
      return jbilchfbokm_;
    }
    /**
     * <code>double jbilchfbokm = 3;</code>
     * @param value The jbilchfbokm to set.
     * @return This builder for chaining.
     */
    public Builder setJbilchfbokm(double value) {
      
      jbilchfbokm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double jbilchfbokm = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJbilchfbokm() {
      
      jbilchfbokm_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JKJBEGABEMD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JKJBEGABEMD)
  private static final POGOProtos.Rpc.JKJBEGABEMD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JKJBEGABEMD();
  }

  public static POGOProtos.Rpc.JKJBEGABEMD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JKJBEGABEMD>
      PARSER = new com.google.protobuf.AbstractParser<JKJBEGABEMD>() {
    @java.lang.Override
    public JKJBEGABEMD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JKJBEGABEMD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JKJBEGABEMD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JKJBEGABEMD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JKJBEGABEMD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

