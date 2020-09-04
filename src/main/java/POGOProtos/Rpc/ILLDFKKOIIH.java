// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ILLDFKKOIIH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ILLDFKKOIIH}
 */
public final class ILLDFKKOIIH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ILLDFKKOIIH)
    ILLDFKKOIIHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ILLDFKKOIIH.newBuilder() to construct.
  private ILLDFKKOIIH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ILLDFKKOIIH() {
    lknpioglmib_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ILLDFKKOIIH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ILLDFKKOIIH(
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
            POGOProtos.Rpc.GJLECHMJABM.Builder subBuilder = null;
            if (hnoncfdkkha_ != null) {
              subBuilder = hnoncfdkkha_.toBuilder();
            }
            hnoncfdkkha_ = input.readMessage(POGOProtos.Rpc.GJLECHMJABM.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hnoncfdkkha_);
              hnoncfdkkha_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ILLDFKKOIIH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ILLDFKKOIIH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ILLDFKKOIIH.class, POGOProtos.Rpc.ILLDFKKOIIH.Builder.class);
  }

  /**
   * <pre>
   * ref: ILLDFKKOIIH/KNPEALFGMGI/HKFNODCAPAM
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM}
   */
  public enum HKFNODCAPAM
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
     * <code>ERROR_CHALLENGE_NOT_FOUND = 2;</code>
     */
    ERROR_CHALLENGE_NOT_FOUND(2),
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
     * <code>ERROR_CHALLENGE_NOT_FOUND = 2;</code>
     */
    public static final int ERROR_CHALLENGE_NOT_FOUND_VALUE = 2;


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
    public static HKFNODCAPAM valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HKFNODCAPAM forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_CHALLENGE_NOT_FOUND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HKFNODCAPAM>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HKFNODCAPAM> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HKFNODCAPAM>() {
            public HKFNODCAPAM findValueByNumber(int number) {
              return HKFNODCAPAM.forNumber(number);
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
      return POGOProtos.Rpc.ILLDFKKOIIH.getDescriptor().getEnumTypes().get(0);
    }

    private static final HKFNODCAPAM[] VALUES = values();

    public static HKFNODCAPAM valueOf(
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

    private HKFNODCAPAM(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM)
  }

  public static final int LKNPIOGLMIB_FIELD_NUMBER = 1;
  private int lknpioglmib_;
  /**
   * <code>.POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM lknpioglmib = 1;</code>
   * @return The enum numeric value on the wire for lknpioglmib.
   */
  @java.lang.Override public int getLknpioglmibValue() {
    return lknpioglmib_;
  }
  /**
   * <code>.POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM lknpioglmib = 1;</code>
   * @return The lknpioglmib.
   */
  @java.lang.Override public POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM getLknpioglmib() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM result = POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM.valueOf(lknpioglmib_);
    return result == null ? POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM.UNRECOGNIZED : result;
  }

  public static final int HNONCFDKKHA_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha_;
  /**
   * <code>.POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha = 2;</code>
   * @return Whether the hnoncfdkkha field is set.
   */
  @java.lang.Override
  public boolean hasHnoncfdkkha() {
    return hnoncfdkkha_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha = 2;</code>
   * @return The hnoncfdkkha.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GJLECHMJABM getHnoncfdkkha() {
    return hnoncfdkkha_ == null ? POGOProtos.Rpc.GJLECHMJABM.getDefaultInstance() : hnoncfdkkha_;
  }
  /**
   * <code>.POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GJLECHMJABMOrBuilder getHnoncfdkkhaOrBuilder() {
    return getHnoncfdkkha();
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
    if (lknpioglmib_ != POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM.UNSET.getNumber()) {
      output.writeEnum(1, lknpioglmib_);
    }
    if (hnoncfdkkha_ != null) {
      output.writeMessage(2, getHnoncfdkkha());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lknpioglmib_ != POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lknpioglmib_);
    }
    if (hnoncfdkkha_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHnoncfdkkha());
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
    if (!(obj instanceof POGOProtos.Rpc.ILLDFKKOIIH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ILLDFKKOIIH other = (POGOProtos.Rpc.ILLDFKKOIIH) obj;

    if (lknpioglmib_ != other.lknpioglmib_) return false;
    if (hasHnoncfdkkha() != other.hasHnoncfdkkha()) return false;
    if (hasHnoncfdkkha()) {
      if (!getHnoncfdkkha()
          .equals(other.getHnoncfdkkha())) return false;
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
    hash = (37 * hash) + LKNPIOGLMIB_FIELD_NUMBER;
    hash = (53 * hash) + lknpioglmib_;
    if (hasHnoncfdkkha()) {
      hash = (37 * hash) + HNONCFDKKHA_FIELD_NUMBER;
      hash = (53 * hash) + getHnoncfdkkha().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ILLDFKKOIIH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ILLDFKKOIIH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ILLDFKKOIIH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ILLDFKKOIIH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ILLDFKKOIIH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ILLDFKKOIIH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ILLDFKKOIIH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ILLDFKKOIIH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ILLDFKKOIIH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ILLDFKKOIIH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ILLDFKKOIIH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ILLDFKKOIIH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ILLDFKKOIIH prototype) {
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
   * ref: ILLDFKKOIIH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ILLDFKKOIIH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ILLDFKKOIIH)
      POGOProtos.Rpc.ILLDFKKOIIHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ILLDFKKOIIH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ILLDFKKOIIH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ILLDFKKOIIH.class, POGOProtos.Rpc.ILLDFKKOIIH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ILLDFKKOIIH.newBuilder()
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

      if (hnoncfdkkhaBuilder_ == null) {
        hnoncfdkkha_ = null;
      } else {
        hnoncfdkkha_ = null;
        hnoncfdkkhaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ILLDFKKOIIH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ILLDFKKOIIH getDefaultInstanceForType() {
      return POGOProtos.Rpc.ILLDFKKOIIH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ILLDFKKOIIH build() {
      POGOProtos.Rpc.ILLDFKKOIIH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ILLDFKKOIIH buildPartial() {
      POGOProtos.Rpc.ILLDFKKOIIH result = new POGOProtos.Rpc.ILLDFKKOIIH(this);
      result.lknpioglmib_ = lknpioglmib_;
      if (hnoncfdkkhaBuilder_ == null) {
        result.hnoncfdkkha_ = hnoncfdkkha_;
      } else {
        result.hnoncfdkkha_ = hnoncfdkkhaBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.ILLDFKKOIIH) {
        return mergeFrom((POGOProtos.Rpc.ILLDFKKOIIH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ILLDFKKOIIH other) {
      if (other == POGOProtos.Rpc.ILLDFKKOIIH.getDefaultInstance()) return this;
      if (other.lknpioglmib_ != 0) {
        setLknpioglmibValue(other.getLknpioglmibValue());
      }
      if (other.hasHnoncfdkkha()) {
        mergeHnoncfdkkha(other.getHnoncfdkkha());
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
      POGOProtos.Rpc.ILLDFKKOIIH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ILLDFKKOIIH) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM lknpioglmib = 1;</code>
     * @return The enum numeric value on the wire for lknpioglmib.
     */
    @java.lang.Override public int getLknpioglmibValue() {
      return lknpioglmib_;
    }
    /**
     * <code>.POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM lknpioglmib = 1;</code>
     * @param value The enum numeric value on the wire for lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmibValue(int value) {
      
      lknpioglmib_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM lknpioglmib = 1;</code>
     * @return The lknpioglmib.
     */
    @java.lang.Override
    public POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM getLknpioglmib() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM result = POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM.valueOf(lknpioglmib_);
      return result == null ? POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM lknpioglmib = 1;</code>
     * @param value The lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmib(POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lknpioglmib_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ILLDFKKOIIH.HKFNODCAPAM lknpioglmib = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLknpioglmib() {
      
      lknpioglmib_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GJLECHMJABM, POGOProtos.Rpc.GJLECHMJABM.Builder, POGOProtos.Rpc.GJLECHMJABMOrBuilder> hnoncfdkkhaBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha = 2;</code>
     * @return Whether the hnoncfdkkha field is set.
     */
    public boolean hasHnoncfdkkha() {
      return hnoncfdkkhaBuilder_ != null || hnoncfdkkha_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha = 2;</code>
     * @return The hnoncfdkkha.
     */
    public POGOProtos.Rpc.GJLECHMJABM getHnoncfdkkha() {
      if (hnoncfdkkhaBuilder_ == null) {
        return hnoncfdkkha_ == null ? POGOProtos.Rpc.GJLECHMJABM.getDefaultInstance() : hnoncfdkkha_;
      } else {
        return hnoncfdkkhaBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha = 2;</code>
     */
    public Builder setHnoncfdkkha(POGOProtos.Rpc.GJLECHMJABM value) {
      if (hnoncfdkkhaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hnoncfdkkha_ = value;
        onChanged();
      } else {
        hnoncfdkkhaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha = 2;</code>
     */
    public Builder setHnoncfdkkha(
        POGOProtos.Rpc.GJLECHMJABM.Builder builderForValue) {
      if (hnoncfdkkhaBuilder_ == null) {
        hnoncfdkkha_ = builderForValue.build();
        onChanged();
      } else {
        hnoncfdkkhaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha = 2;</code>
     */
    public Builder mergeHnoncfdkkha(POGOProtos.Rpc.GJLECHMJABM value) {
      if (hnoncfdkkhaBuilder_ == null) {
        if (hnoncfdkkha_ != null) {
          hnoncfdkkha_ =
            POGOProtos.Rpc.GJLECHMJABM.newBuilder(hnoncfdkkha_).mergeFrom(value).buildPartial();
        } else {
          hnoncfdkkha_ = value;
        }
        onChanged();
      } else {
        hnoncfdkkhaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha = 2;</code>
     */
    public Builder clearHnoncfdkkha() {
      if (hnoncfdkkhaBuilder_ == null) {
        hnoncfdkkha_ = null;
        onChanged();
      } else {
        hnoncfdkkha_ = null;
        hnoncfdkkhaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha = 2;</code>
     */
    public POGOProtos.Rpc.GJLECHMJABM.Builder getHnoncfdkkhaBuilder() {
      
      onChanged();
      return getHnoncfdkkhaFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha = 2;</code>
     */
    public POGOProtos.Rpc.GJLECHMJABMOrBuilder getHnoncfdkkhaOrBuilder() {
      if (hnoncfdkkhaBuilder_ != null) {
        return hnoncfdkkhaBuilder_.getMessageOrBuilder();
      } else {
        return hnoncfdkkha_ == null ?
            POGOProtos.Rpc.GJLECHMJABM.getDefaultInstance() : hnoncfdkkha_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GJLECHMJABM hnoncfdkkha = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GJLECHMJABM, POGOProtos.Rpc.GJLECHMJABM.Builder, POGOProtos.Rpc.GJLECHMJABMOrBuilder> 
        getHnoncfdkkhaFieldBuilder() {
      if (hnoncfdkkhaBuilder_ == null) {
        hnoncfdkkhaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.GJLECHMJABM, POGOProtos.Rpc.GJLECHMJABM.Builder, POGOProtos.Rpc.GJLECHMJABMOrBuilder>(
                getHnoncfdkkha(),
                getParentForChildren(),
                isClean());
        hnoncfdkkha_ = null;
      }
      return hnoncfdkkhaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ILLDFKKOIIH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ILLDFKKOIIH)
  private static final POGOProtos.Rpc.ILLDFKKOIIH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ILLDFKKOIIH();
  }

  public static POGOProtos.Rpc.ILLDFKKOIIH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ILLDFKKOIIH>
      PARSER = new com.google.protobuf.AbstractParser<ILLDFKKOIIH>() {
    @java.lang.Override
    public ILLDFKKOIIH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ILLDFKKOIIH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ILLDFKKOIIH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ILLDFKKOIIH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ILLDFKKOIIH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

