// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MILCKNCAKGE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.MILCKNCAKGE}
 */
public final class MILCKNCAKGE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MILCKNCAKGE)
    MILCKNCAKGEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MILCKNCAKGE.newBuilder() to construct.
  private MILCKNCAKGE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MILCKNCAKGE() {
    pekhbkhoimi_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MILCKNCAKGE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MILCKNCAKGE(
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

            pekhbkhoimi_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.CHHENECHNPF.Builder subBuilder = null;
            if (mbcdbnjjkof_ != null) {
              subBuilder = mbcdbnjjkof_.toBuilder();
            }
            mbcdbnjjkof_ = input.readMessage(POGOProtos.Rpc.CHHENECHNPF.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(mbcdbnjjkof_);
              mbcdbnjjkof_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MILCKNCAKGE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MILCKNCAKGE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MILCKNCAKGE.class, POGOProtos.Rpc.MILCKNCAKGE.Builder.class);
  }

  /**
   * <pre>
   * ref: MILCKNCAKGE/HHIEHLEINJN/EAIJJAINNKO
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO}
   */
  public enum EAIJJAINNKO
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
     * <code>TEAM_ALREADY_SET = 2;</code>
     */
    TEAM_ALREADY_SET(2),
    /**
     * <code>FAILURE = 3;</code>
     */
    FAILURE(3),
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
     * <code>TEAM_ALREADY_SET = 2;</code>
     */
    public static final int TEAM_ALREADY_SET_VALUE = 2;
    /**
     * <code>FAILURE = 3;</code>
     */
    public static final int FAILURE_VALUE = 3;


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
    public static EAIJJAINNKO valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EAIJJAINNKO forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return TEAM_ALREADY_SET;
        case 3: return FAILURE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EAIJJAINNKO>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EAIJJAINNKO> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EAIJJAINNKO>() {
            public EAIJJAINNKO findValueByNumber(int number) {
              return EAIJJAINNKO.forNumber(number);
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
      return POGOProtos.Rpc.MILCKNCAKGE.getDescriptor().getEnumTypes().get(0);
    }

    private static final EAIJJAINNKO[] VALUES = values();

    public static EAIJJAINNKO valueOf(
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

    private EAIJJAINNKO(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO)
  }

  public static final int PEKHBKHOIMI_FIELD_NUMBER = 1;
  private int pekhbkhoimi_;
  /**
   * <code>.POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO pekhbkhoimi = 1;</code>
   * @return The enum numeric value on the wire for pekhbkhoimi.
   */
  @java.lang.Override public int getPekhbkhoimiValue() {
    return pekhbkhoimi_;
  }
  /**
   * <code>.POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO pekhbkhoimi = 1;</code>
   * @return The pekhbkhoimi.
   */
  @java.lang.Override public POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO getPekhbkhoimi() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO result = POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO.valueOf(pekhbkhoimi_);
    return result == null ? POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO.UNRECOGNIZED : result;
  }

  public static final int MBCDBNJJKOF_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof_;
  /**
   * <code>.POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof = 2;</code>
   * @return Whether the mbcdbnjjkof field is set.
   */
  @java.lang.Override
  public boolean hasMbcdbnjjkof() {
    return mbcdbnjjkof_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof = 2;</code>
   * @return The mbcdbnjjkof.
   */
  @java.lang.Override
  public POGOProtos.Rpc.CHHENECHNPF getMbcdbnjjkof() {
    return mbcdbnjjkof_ == null ? POGOProtos.Rpc.CHHENECHNPF.getDefaultInstance() : mbcdbnjjkof_;
  }
  /**
   * <code>.POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CHHENECHNPFOrBuilder getMbcdbnjjkofOrBuilder() {
    return getMbcdbnjjkof();
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
    if (pekhbkhoimi_ != POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO.UNSET.getNumber()) {
      output.writeEnum(1, pekhbkhoimi_);
    }
    if (mbcdbnjjkof_ != null) {
      output.writeMessage(2, getMbcdbnjjkof());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pekhbkhoimi_ != POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, pekhbkhoimi_);
    }
    if (mbcdbnjjkof_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMbcdbnjjkof());
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
    if (!(obj instanceof POGOProtos.Rpc.MILCKNCAKGE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MILCKNCAKGE other = (POGOProtos.Rpc.MILCKNCAKGE) obj;

    if (pekhbkhoimi_ != other.pekhbkhoimi_) return false;
    if (hasMbcdbnjjkof() != other.hasMbcdbnjjkof()) return false;
    if (hasMbcdbnjjkof()) {
      if (!getMbcdbnjjkof()
          .equals(other.getMbcdbnjjkof())) return false;
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
    hash = (37 * hash) + PEKHBKHOIMI_FIELD_NUMBER;
    hash = (53 * hash) + pekhbkhoimi_;
    if (hasMbcdbnjjkof()) {
      hash = (37 * hash) + MBCDBNJJKOF_FIELD_NUMBER;
      hash = (53 * hash) + getMbcdbnjjkof().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MILCKNCAKGE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MILCKNCAKGE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MILCKNCAKGE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MILCKNCAKGE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MILCKNCAKGE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MILCKNCAKGE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MILCKNCAKGE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MILCKNCAKGE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MILCKNCAKGE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MILCKNCAKGE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MILCKNCAKGE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MILCKNCAKGE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MILCKNCAKGE prototype) {
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
   * ref: MILCKNCAKGE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.MILCKNCAKGE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MILCKNCAKGE)
      POGOProtos.Rpc.MILCKNCAKGEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MILCKNCAKGE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MILCKNCAKGE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MILCKNCAKGE.class, POGOProtos.Rpc.MILCKNCAKGE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MILCKNCAKGE.newBuilder()
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
      pekhbkhoimi_ = 0;

      if (mbcdbnjjkofBuilder_ == null) {
        mbcdbnjjkof_ = null;
      } else {
        mbcdbnjjkof_ = null;
        mbcdbnjjkofBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MILCKNCAKGE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MILCKNCAKGE getDefaultInstanceForType() {
      return POGOProtos.Rpc.MILCKNCAKGE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MILCKNCAKGE build() {
      POGOProtos.Rpc.MILCKNCAKGE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MILCKNCAKGE buildPartial() {
      POGOProtos.Rpc.MILCKNCAKGE result = new POGOProtos.Rpc.MILCKNCAKGE(this);
      result.pekhbkhoimi_ = pekhbkhoimi_;
      if (mbcdbnjjkofBuilder_ == null) {
        result.mbcdbnjjkof_ = mbcdbnjjkof_;
      } else {
        result.mbcdbnjjkof_ = mbcdbnjjkofBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.MILCKNCAKGE) {
        return mergeFrom((POGOProtos.Rpc.MILCKNCAKGE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MILCKNCAKGE other) {
      if (other == POGOProtos.Rpc.MILCKNCAKGE.getDefaultInstance()) return this;
      if (other.pekhbkhoimi_ != 0) {
        setPekhbkhoimiValue(other.getPekhbkhoimiValue());
      }
      if (other.hasMbcdbnjjkof()) {
        mergeMbcdbnjjkof(other.getMbcdbnjjkof());
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
      POGOProtos.Rpc.MILCKNCAKGE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MILCKNCAKGE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pekhbkhoimi_ = 0;
    /**
     * <code>.POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO pekhbkhoimi = 1;</code>
     * @return The enum numeric value on the wire for pekhbkhoimi.
     */
    @java.lang.Override public int getPekhbkhoimiValue() {
      return pekhbkhoimi_;
    }
    /**
     * <code>.POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO pekhbkhoimi = 1;</code>
     * @param value The enum numeric value on the wire for pekhbkhoimi to set.
     * @return This builder for chaining.
     */
    public Builder setPekhbkhoimiValue(int value) {
      
      pekhbkhoimi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO pekhbkhoimi = 1;</code>
     * @return The pekhbkhoimi.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO getPekhbkhoimi() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO result = POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO.valueOf(pekhbkhoimi_);
      return result == null ? POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO pekhbkhoimi = 1;</code>
     * @param value The pekhbkhoimi to set.
     * @return This builder for chaining.
     */
    public Builder setPekhbkhoimi(POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pekhbkhoimi_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MILCKNCAKGE.EAIJJAINNKO pekhbkhoimi = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPekhbkhoimi() {
      
      pekhbkhoimi_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CHHENECHNPF, POGOProtos.Rpc.CHHENECHNPF.Builder, POGOProtos.Rpc.CHHENECHNPFOrBuilder> mbcdbnjjkofBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof = 2;</code>
     * @return Whether the mbcdbnjjkof field is set.
     */
    public boolean hasMbcdbnjjkof() {
      return mbcdbnjjkofBuilder_ != null || mbcdbnjjkof_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof = 2;</code>
     * @return The mbcdbnjjkof.
     */
    public POGOProtos.Rpc.CHHENECHNPF getMbcdbnjjkof() {
      if (mbcdbnjjkofBuilder_ == null) {
        return mbcdbnjjkof_ == null ? POGOProtos.Rpc.CHHENECHNPF.getDefaultInstance() : mbcdbnjjkof_;
      } else {
        return mbcdbnjjkofBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof = 2;</code>
     */
    public Builder setMbcdbnjjkof(POGOProtos.Rpc.CHHENECHNPF value) {
      if (mbcdbnjjkofBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mbcdbnjjkof_ = value;
        onChanged();
      } else {
        mbcdbnjjkofBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof = 2;</code>
     */
    public Builder setMbcdbnjjkof(
        POGOProtos.Rpc.CHHENECHNPF.Builder builderForValue) {
      if (mbcdbnjjkofBuilder_ == null) {
        mbcdbnjjkof_ = builderForValue.build();
        onChanged();
      } else {
        mbcdbnjjkofBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof = 2;</code>
     */
    public Builder mergeMbcdbnjjkof(POGOProtos.Rpc.CHHENECHNPF value) {
      if (mbcdbnjjkofBuilder_ == null) {
        if (mbcdbnjjkof_ != null) {
          mbcdbnjjkof_ =
            POGOProtos.Rpc.CHHENECHNPF.newBuilder(mbcdbnjjkof_).mergeFrom(value).buildPartial();
        } else {
          mbcdbnjjkof_ = value;
        }
        onChanged();
      } else {
        mbcdbnjjkofBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof = 2;</code>
     */
    public Builder clearMbcdbnjjkof() {
      if (mbcdbnjjkofBuilder_ == null) {
        mbcdbnjjkof_ = null;
        onChanged();
      } else {
        mbcdbnjjkof_ = null;
        mbcdbnjjkofBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof = 2;</code>
     */
    public POGOProtos.Rpc.CHHENECHNPF.Builder getMbcdbnjjkofBuilder() {
      
      onChanged();
      return getMbcdbnjjkofFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof = 2;</code>
     */
    public POGOProtos.Rpc.CHHENECHNPFOrBuilder getMbcdbnjjkofOrBuilder() {
      if (mbcdbnjjkofBuilder_ != null) {
        return mbcdbnjjkofBuilder_.getMessageOrBuilder();
      } else {
        return mbcdbnjjkof_ == null ?
            POGOProtos.Rpc.CHHENECHNPF.getDefaultInstance() : mbcdbnjjkof_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CHHENECHNPF mbcdbnjjkof = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CHHENECHNPF, POGOProtos.Rpc.CHHENECHNPF.Builder, POGOProtos.Rpc.CHHENECHNPFOrBuilder> 
        getMbcdbnjjkofFieldBuilder() {
      if (mbcdbnjjkofBuilder_ == null) {
        mbcdbnjjkofBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CHHENECHNPF, POGOProtos.Rpc.CHHENECHNPF.Builder, POGOProtos.Rpc.CHHENECHNPFOrBuilder>(
                getMbcdbnjjkof(),
                getParentForChildren(),
                isClean());
        mbcdbnjjkof_ = null;
      }
      return mbcdbnjjkofBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MILCKNCAKGE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MILCKNCAKGE)
  private static final POGOProtos.Rpc.MILCKNCAKGE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MILCKNCAKGE();
  }

  public static POGOProtos.Rpc.MILCKNCAKGE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MILCKNCAKGE>
      PARSER = new com.google.protobuf.AbstractParser<MILCKNCAKGE>() {
    @java.lang.Override
    public MILCKNCAKGE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MILCKNCAKGE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MILCKNCAKGE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MILCKNCAKGE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MILCKNCAKGE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

