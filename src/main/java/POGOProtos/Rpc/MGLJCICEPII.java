// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MGLJCICEPII
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.MGLJCICEPII}
 */
public final class MGLJCICEPII extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MGLJCICEPII)
    MGLJCICEPIIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MGLJCICEPII.newBuilder() to construct.
  private MGLJCICEPII(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MGLJCICEPII() {
    lknpioglmib_ = 0;
    eajjadfogaj_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MGLJCICEPII();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MGLJCICEPII(
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
          case 24: {
            int rawValue = input.readEnum();

            eajjadfogaj_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MGLJCICEPII_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MGLJCICEPII_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MGLJCICEPII.class, POGOProtos.Rpc.MGLJCICEPII.Builder.class);
  }

  /**
   * <pre>
   * ref: MGLJCICEPII/GILFPBMLGEP/OOMAHEBDCBJ
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ}
   */
  public enum OOMAHEBDCBJ
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
    public static OOMAHEBDCBJ valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OOMAHEBDCBJ forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_BUDDY_NOT_VALID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OOMAHEBDCBJ>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OOMAHEBDCBJ> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OOMAHEBDCBJ>() {
            public OOMAHEBDCBJ findValueByNumber(int number) {
              return OOMAHEBDCBJ.forNumber(number);
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
      return POGOProtos.Rpc.MGLJCICEPII.getDescriptor().getEnumTypes().get(0);
    }

    private static final OOMAHEBDCBJ[] VALUES = values();

    public static OOMAHEBDCBJ valueOf(
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

    private OOMAHEBDCBJ(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ)
  }

  public static final int LKNPIOGLMIB_FIELD_NUMBER = 1;
  private int lknpioglmib_;
  /**
   * <code>.POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ lknpioglmib = 1;</code>
   * @return The enum numeric value on the wire for lknpioglmib.
   */
  @java.lang.Override public int getLknpioglmibValue() {
    return lknpioglmib_;
  }
  /**
   * <code>.POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ lknpioglmib = 1;</code>
   * @return The lknpioglmib.
   */
  @java.lang.Override public POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ getLknpioglmib() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ result = POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ.valueOf(lknpioglmib_);
    return result == null ? POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ.UNRECOGNIZED : result;
  }

  public static final int JODNDJICKJG_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg_;
  /**
   * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 2;</code>
   * @return Whether the jodndjickjg field is set.
   */
  @java.lang.Override
  public boolean hasJodndjickjg() {
    return jodndjickjg_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 2;</code>
   * @return The jodndjickjg.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GCJJKGJEEEF getJodndjickjg() {
    return jodndjickjg_ == null ? POGOProtos.Rpc.GCJJKGJEEEF.getDefaultInstance() : jodndjickjg_;
  }
  /**
   * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GCJJKGJEEEFOrBuilder getJodndjickjgOrBuilder() {
    return getJodndjickjg();
  }

  public static final int EAJJADFOGAJ_FIELD_NUMBER = 3;
  private int eajjadfogaj_;
  /**
   * <code>.POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC eajjadfogaj = 3;</code>
   * @return The enum numeric value on the wire for eajjadfogaj.
   */
  @java.lang.Override public int getEajjadfogajValue() {
    return eajjadfogaj_;
  }
  /**
   * <code>.POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC eajjadfogaj = 3;</code>
   * @return The eajjadfogaj.
   */
  @java.lang.Override public POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC getEajjadfogaj() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC result = POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC.valueOf(eajjadfogaj_);
    return result == null ? POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC.UNRECOGNIZED : result;
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
    if (lknpioglmib_ != POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ.UNSET.getNumber()) {
      output.writeEnum(1, lknpioglmib_);
    }
    if (jodndjickjg_ != null) {
      output.writeMessage(2, getJodndjickjg());
    }
    if (eajjadfogaj_ != POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC.BUDDY_HEART_UNSET.getNumber()) {
      output.writeEnum(3, eajjadfogaj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lknpioglmib_ != POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lknpioglmib_);
    }
    if (jodndjickjg_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJodndjickjg());
    }
    if (eajjadfogaj_ != POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC.BUDDY_HEART_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, eajjadfogaj_);
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
    if (!(obj instanceof POGOProtos.Rpc.MGLJCICEPII)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MGLJCICEPII other = (POGOProtos.Rpc.MGLJCICEPII) obj;

    if (lknpioglmib_ != other.lknpioglmib_) return false;
    if (hasJodndjickjg() != other.hasJodndjickjg()) return false;
    if (hasJodndjickjg()) {
      if (!getJodndjickjg()
          .equals(other.getJodndjickjg())) return false;
    }
    if (eajjadfogaj_ != other.eajjadfogaj_) return false;
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
    if (hasJodndjickjg()) {
      hash = (37 * hash) + JODNDJICKJG_FIELD_NUMBER;
      hash = (53 * hash) + getJodndjickjg().hashCode();
    }
    hash = (37 * hash) + EAJJADFOGAJ_FIELD_NUMBER;
    hash = (53 * hash) + eajjadfogaj_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MGLJCICEPII parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MGLJCICEPII parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MGLJCICEPII parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MGLJCICEPII parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MGLJCICEPII parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MGLJCICEPII parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MGLJCICEPII parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MGLJCICEPII parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MGLJCICEPII parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MGLJCICEPII parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MGLJCICEPII parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MGLJCICEPII parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MGLJCICEPII prototype) {
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
   * ref: MGLJCICEPII
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.MGLJCICEPII}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MGLJCICEPII)
      POGOProtos.Rpc.MGLJCICEPIIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MGLJCICEPII_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MGLJCICEPII_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MGLJCICEPII.class, POGOProtos.Rpc.MGLJCICEPII.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MGLJCICEPII.newBuilder()
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

      if (jodndjickjgBuilder_ == null) {
        jodndjickjg_ = null;
      } else {
        jodndjickjg_ = null;
        jodndjickjgBuilder_ = null;
      }
      eajjadfogaj_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MGLJCICEPII_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MGLJCICEPII getDefaultInstanceForType() {
      return POGOProtos.Rpc.MGLJCICEPII.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MGLJCICEPII build() {
      POGOProtos.Rpc.MGLJCICEPII result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MGLJCICEPII buildPartial() {
      POGOProtos.Rpc.MGLJCICEPII result = new POGOProtos.Rpc.MGLJCICEPII(this);
      result.lknpioglmib_ = lknpioglmib_;
      if (jodndjickjgBuilder_ == null) {
        result.jodndjickjg_ = jodndjickjg_;
      } else {
        result.jodndjickjg_ = jodndjickjgBuilder_.build();
      }
      result.eajjadfogaj_ = eajjadfogaj_;
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
      if (other instanceof POGOProtos.Rpc.MGLJCICEPII) {
        return mergeFrom((POGOProtos.Rpc.MGLJCICEPII)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MGLJCICEPII other) {
      if (other == POGOProtos.Rpc.MGLJCICEPII.getDefaultInstance()) return this;
      if (other.lknpioglmib_ != 0) {
        setLknpioglmibValue(other.getLknpioglmibValue());
      }
      if (other.hasJodndjickjg()) {
        mergeJodndjickjg(other.getJodndjickjg());
      }
      if (other.eajjadfogaj_ != 0) {
        setEajjadfogajValue(other.getEajjadfogajValue());
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
      POGOProtos.Rpc.MGLJCICEPII parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MGLJCICEPII) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ lknpioglmib = 1;</code>
     * @return The enum numeric value on the wire for lknpioglmib.
     */
    @java.lang.Override public int getLknpioglmibValue() {
      return lknpioglmib_;
    }
    /**
     * <code>.POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ lknpioglmib = 1;</code>
     * @param value The enum numeric value on the wire for lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmibValue(int value) {
      
      lknpioglmib_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ lknpioglmib = 1;</code>
     * @return The lknpioglmib.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ getLknpioglmib() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ result = POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ.valueOf(lknpioglmib_);
      return result == null ? POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ lknpioglmib = 1;</code>
     * @param value The lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmib(POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lknpioglmib_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MGLJCICEPII.OOMAHEBDCBJ lknpioglmib = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLknpioglmib() {
      
      lknpioglmib_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GCJJKGJEEEF, POGOProtos.Rpc.GCJJKGJEEEF.Builder, POGOProtos.Rpc.GCJJKGJEEEFOrBuilder> jodndjickjgBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 2;</code>
     * @return Whether the jodndjickjg field is set.
     */
    public boolean hasJodndjickjg() {
      return jodndjickjgBuilder_ != null || jodndjickjg_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 2;</code>
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
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 2;</code>
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
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 2;</code>
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
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 2;</code>
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
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 2;</code>
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
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 2;</code>
     */
    public POGOProtos.Rpc.GCJJKGJEEEF.Builder getJodndjickjgBuilder() {
      
      onChanged();
      return getJodndjickjgFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 2;</code>
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
     * <code>.POGOProtos.Rpc.GCJJKGJEEEF jodndjickjg = 2;</code>
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

    private int eajjadfogaj_ = 0;
    /**
     * <code>.POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC eajjadfogaj = 3;</code>
     * @return The enum numeric value on the wire for eajjadfogaj.
     */
    @java.lang.Override public int getEajjadfogajValue() {
      return eajjadfogaj_;
    }
    /**
     * <code>.POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC eajjadfogaj = 3;</code>
     * @param value The enum numeric value on the wire for eajjadfogaj to set.
     * @return This builder for chaining.
     */
    public Builder setEajjadfogajValue(int value) {
      
      eajjadfogaj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC eajjadfogaj = 3;</code>
     * @return The eajjadfogaj.
     */
    @java.lang.Override
    public POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC getEajjadfogaj() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC result = POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC.valueOf(eajjadfogaj_);
      return result == null ? POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC eajjadfogaj = 3;</code>
     * @param value The eajjadfogaj to set.
     * @return This builder for chaining.
     */
    public Builder setEajjadfogaj(POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      eajjadfogaj_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AFCIIHIODAP.DNFGNGOPJNC eajjadfogaj = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEajjadfogaj() {
      
      eajjadfogaj_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MGLJCICEPII)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MGLJCICEPII)
  private static final POGOProtos.Rpc.MGLJCICEPII DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MGLJCICEPII();
  }

  public static POGOProtos.Rpc.MGLJCICEPII getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MGLJCICEPII>
      PARSER = new com.google.protobuf.AbstractParser<MGLJCICEPII>() {
    @java.lang.Override
    public MGLJCICEPII parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MGLJCICEPII(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MGLJCICEPII> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MGLJCICEPII> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MGLJCICEPII getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

