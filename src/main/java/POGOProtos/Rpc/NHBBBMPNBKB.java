// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NHBBBMPNBKB
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NHBBBMPNBKB}
 */
public final class NHBBBMPNBKB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NHBBBMPNBKB)
    NHBBBMPNBKBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NHBBBMPNBKB.newBuilder() to construct.
  private NHBBBMPNBKB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NHBBBMPNBKB() {
    lcajjpmoafe_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NHBBBMPNBKB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NHBBBMPNBKB(
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
            POGOProtos.Rpc.ClientInbox.Builder subBuilder = null;
            if (pjjgnohfakj_ != null) {
              subBuilder = pjjgnohfakj_.toBuilder();
            }
            pjjgnohfakj_ = input.readMessage(POGOProtos.Rpc.ClientInbox.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pjjgnohfakj_);
              pjjgnohfakj_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHBBBMPNBKB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHBBBMPNBKB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NHBBBMPNBKB.class, POGOProtos.Rpc.NHBBBMPNBKB.Builder.class);
  }

  /**
   * <pre>
   * ref: NHBBBMPNBKB/AFFOHGFMDGL/KBBLPBHDCGH
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH}
   */
  public enum KBBLPBHDCGH
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
     * <code>FAILURE = 2;</code>
     */
    FAILURE(2),
    /**
     * <code>TIMED_OUT = 3;</code>
     */
    TIMED_OUT(3),
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
     * <code>FAILURE = 2;</code>
     */
    public static final int FAILURE_VALUE = 2;
    /**
     * <code>TIMED_OUT = 3;</code>
     */
    public static final int TIMED_OUT_VALUE = 3;


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
    public static KBBLPBHDCGH valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static KBBLPBHDCGH forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return FAILURE;
        case 3: return TIMED_OUT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<KBBLPBHDCGH>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        KBBLPBHDCGH> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<KBBLPBHDCGH>() {
            public KBBLPBHDCGH findValueByNumber(int number) {
              return KBBLPBHDCGH.forNumber(number);
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
      return POGOProtos.Rpc.NHBBBMPNBKB.getDescriptor().getEnumTypes().get(0);
    }

    private static final KBBLPBHDCGH[] VALUES = values();

    public static KBBLPBHDCGH valueOf(
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

    private KBBLPBHDCGH(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH)
  }

  public static final int LCAJJPMOAFE_FIELD_NUMBER = 1;
  private int lcajjpmoafe_;
  /**
   * <code>.POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH lcajjpmoafe = 1;</code>
   * @return The enum numeric value on the wire for lcajjpmoafe.
   */
  @java.lang.Override public int getLcajjpmoafeValue() {
    return lcajjpmoafe_;
  }
  /**
   * <code>.POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH lcajjpmoafe = 1;</code>
   * @return The lcajjpmoafe.
   */
  @java.lang.Override public POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH getLcajjpmoafe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH result = POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH.valueOf(lcajjpmoafe_);
    return result == null ? POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH.UNRECOGNIZED : result;
  }

  public static final int PJJGNOHFAKJ_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.ClientInbox pjjgnohfakj_;
  /**
   * <code>.POGOProtos.Rpc.ClientInbox pjjgnohfakj = 2;</code>
   * @return Whether the pjjgnohfakj field is set.
   */
  @java.lang.Override
  public boolean hasPjjgnohfakj() {
    return pjjgnohfakj_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.ClientInbox pjjgnohfakj = 2;</code>
   * @return The pjjgnohfakj.
   */
  @java.lang.Override
  public POGOProtos.Rpc.ClientInbox getPjjgnohfakj() {
    return pjjgnohfakj_ == null ? POGOProtos.Rpc.ClientInbox.getDefaultInstance() : pjjgnohfakj_;
  }
  /**
   * <code>.POGOProtos.Rpc.ClientInbox pjjgnohfakj = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ClientInboxOrBuilder getPjjgnohfakjOrBuilder() {
    return getPjjgnohfakj();
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
    if (lcajjpmoafe_ != POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH.UNSET.getNumber()) {
      output.writeEnum(1, lcajjpmoafe_);
    }
    if (pjjgnohfakj_ != null) {
      output.writeMessage(2, getPjjgnohfakj());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lcajjpmoafe_ != POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lcajjpmoafe_);
    }
    if (pjjgnohfakj_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPjjgnohfakj());
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
    if (!(obj instanceof POGOProtos.Rpc.NHBBBMPNBKB)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NHBBBMPNBKB other = (POGOProtos.Rpc.NHBBBMPNBKB) obj;

    if (lcajjpmoafe_ != other.lcajjpmoafe_) return false;
    if (hasPjjgnohfakj() != other.hasPjjgnohfakj()) return false;
    if (hasPjjgnohfakj()) {
      if (!getPjjgnohfakj()
          .equals(other.getPjjgnohfakj())) return false;
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
    if (hasPjjgnohfakj()) {
      hash = (37 * hash) + PJJGNOHFAKJ_FIELD_NUMBER;
      hash = (53 * hash) + getPjjgnohfakj().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NHBBBMPNBKB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NHBBBMPNBKB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHBBBMPNBKB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NHBBBMPNBKB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHBBBMPNBKB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NHBBBMPNBKB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHBBBMPNBKB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NHBBBMPNBKB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHBBBMPNBKB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NHBBBMPNBKB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NHBBBMPNBKB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NHBBBMPNBKB parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NHBBBMPNBKB prototype) {
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
   * ref: NHBBBMPNBKB
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NHBBBMPNBKB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NHBBBMPNBKB)
      POGOProtos.Rpc.NHBBBMPNBKBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHBBBMPNBKB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHBBBMPNBKB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NHBBBMPNBKB.class, POGOProtos.Rpc.NHBBBMPNBKB.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NHBBBMPNBKB.newBuilder()
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

      if (pjjgnohfakjBuilder_ == null) {
        pjjgnohfakj_ = null;
      } else {
        pjjgnohfakj_ = null;
        pjjgnohfakjBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NHBBBMPNBKB_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NHBBBMPNBKB getDefaultInstanceForType() {
      return POGOProtos.Rpc.NHBBBMPNBKB.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NHBBBMPNBKB build() {
      POGOProtos.Rpc.NHBBBMPNBKB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NHBBBMPNBKB buildPartial() {
      POGOProtos.Rpc.NHBBBMPNBKB result = new POGOProtos.Rpc.NHBBBMPNBKB(this);
      result.lcajjpmoafe_ = lcajjpmoafe_;
      if (pjjgnohfakjBuilder_ == null) {
        result.pjjgnohfakj_ = pjjgnohfakj_;
      } else {
        result.pjjgnohfakj_ = pjjgnohfakjBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.NHBBBMPNBKB) {
        return mergeFrom((POGOProtos.Rpc.NHBBBMPNBKB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NHBBBMPNBKB other) {
      if (other == POGOProtos.Rpc.NHBBBMPNBKB.getDefaultInstance()) return this;
      if (other.lcajjpmoafe_ != 0) {
        setLcajjpmoafeValue(other.getLcajjpmoafeValue());
      }
      if (other.hasPjjgnohfakj()) {
        mergePjjgnohfakj(other.getPjjgnohfakj());
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
      POGOProtos.Rpc.NHBBBMPNBKB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NHBBBMPNBKB) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH lcajjpmoafe = 1;</code>
     * @return The enum numeric value on the wire for lcajjpmoafe.
     */
    @java.lang.Override public int getLcajjpmoafeValue() {
      return lcajjpmoafe_;
    }
    /**
     * <code>.POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH lcajjpmoafe = 1;</code>
     * @param value The enum numeric value on the wire for lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafeValue(int value) {
      
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH lcajjpmoafe = 1;</code>
     * @return The lcajjpmoafe.
     */
    @java.lang.Override
    public POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH getLcajjpmoafe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH result = POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH.valueOf(lcajjpmoafe_);
      return result == null ? POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH lcajjpmoafe = 1;</code>
     * @param value The lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafe(POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lcajjpmoafe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NHBBBMPNBKB.KBBLPBHDCGH lcajjpmoafe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcajjpmoafe() {
      
      lcajjpmoafe_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.ClientInbox pjjgnohfakj_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ClientInbox, POGOProtos.Rpc.ClientInbox.Builder, POGOProtos.Rpc.ClientInboxOrBuilder> pjjgnohfakjBuilder_;
    /**
     * <code>.POGOProtos.Rpc.ClientInbox pjjgnohfakj = 2;</code>
     * @return Whether the pjjgnohfakj field is set.
     */
    public boolean hasPjjgnohfakj() {
      return pjjgnohfakjBuilder_ != null || pjjgnohfakj_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.ClientInbox pjjgnohfakj = 2;</code>
     * @return The pjjgnohfakj.
     */
    public POGOProtos.Rpc.ClientInbox getPjjgnohfakj() {
      if (pjjgnohfakjBuilder_ == null) {
        return pjjgnohfakj_ == null ? POGOProtos.Rpc.ClientInbox.getDefaultInstance() : pjjgnohfakj_;
      } else {
        return pjjgnohfakjBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ClientInbox pjjgnohfakj = 2;</code>
     */
    public Builder setPjjgnohfakj(POGOProtos.Rpc.ClientInbox value) {
      if (pjjgnohfakjBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pjjgnohfakj_ = value;
        onChanged();
      } else {
        pjjgnohfakjBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ClientInbox pjjgnohfakj = 2;</code>
     */
    public Builder setPjjgnohfakj(
        POGOProtos.Rpc.ClientInbox.Builder builderForValue) {
      if (pjjgnohfakjBuilder_ == null) {
        pjjgnohfakj_ = builderForValue.build();
        onChanged();
      } else {
        pjjgnohfakjBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ClientInbox pjjgnohfakj = 2;</code>
     */
    public Builder mergePjjgnohfakj(POGOProtos.Rpc.ClientInbox value) {
      if (pjjgnohfakjBuilder_ == null) {
        if (pjjgnohfakj_ != null) {
          pjjgnohfakj_ =
            POGOProtos.Rpc.ClientInbox.newBuilder(pjjgnohfakj_).mergeFrom(value).buildPartial();
        } else {
          pjjgnohfakj_ = value;
        }
        onChanged();
      } else {
        pjjgnohfakjBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ClientInbox pjjgnohfakj = 2;</code>
     */
    public Builder clearPjjgnohfakj() {
      if (pjjgnohfakjBuilder_ == null) {
        pjjgnohfakj_ = null;
        onChanged();
      } else {
        pjjgnohfakj_ = null;
        pjjgnohfakjBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ClientInbox pjjgnohfakj = 2;</code>
     */
    public POGOProtos.Rpc.ClientInbox.Builder getPjjgnohfakjBuilder() {
      
      onChanged();
      return getPjjgnohfakjFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.ClientInbox pjjgnohfakj = 2;</code>
     */
    public POGOProtos.Rpc.ClientInboxOrBuilder getPjjgnohfakjOrBuilder() {
      if (pjjgnohfakjBuilder_ != null) {
        return pjjgnohfakjBuilder_.getMessageOrBuilder();
      } else {
        return pjjgnohfakj_ == null ?
            POGOProtos.Rpc.ClientInbox.getDefaultInstance() : pjjgnohfakj_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ClientInbox pjjgnohfakj = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ClientInbox, POGOProtos.Rpc.ClientInbox.Builder, POGOProtos.Rpc.ClientInboxOrBuilder> 
        getPjjgnohfakjFieldBuilder() {
      if (pjjgnohfakjBuilder_ == null) {
        pjjgnohfakjBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.ClientInbox, POGOProtos.Rpc.ClientInbox.Builder, POGOProtos.Rpc.ClientInboxOrBuilder>(
                getPjjgnohfakj(),
                getParentForChildren(),
                isClean());
        pjjgnohfakj_ = null;
      }
      return pjjgnohfakjBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NHBBBMPNBKB)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NHBBBMPNBKB)
  private static final POGOProtos.Rpc.NHBBBMPNBKB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NHBBBMPNBKB();
  }

  public static POGOProtos.Rpc.NHBBBMPNBKB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NHBBBMPNBKB>
      PARSER = new com.google.protobuf.AbstractParser<NHBBBMPNBKB>() {
    @java.lang.Override
    public NHBBBMPNBKB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NHBBBMPNBKB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NHBBBMPNBKB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NHBBBMPNBKB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NHBBBMPNBKB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

