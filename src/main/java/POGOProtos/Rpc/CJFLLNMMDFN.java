// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CJFLLNMMDFN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CJFLLNMMDFN}
 */
public final class CJFLLNMMDFN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CJFLLNMMDFN)
    CJFLLNMMDFNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CJFLLNMMDFN.newBuilder() to construct.
  private CJFLLNMMDFN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CJFLLNMMDFN() {
    dmahipegcin_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CJFLLNMMDFN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CJFLLNMMDFN(
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

            dmahipegcin_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.POODFKIAKOK.Builder subBuilder = null;
            if (hdenlcpmihc_ != null) {
              subBuilder = hdenlcpmihc_.toBuilder();
            }
            hdenlcpmihc_ = input.readMessage(POGOProtos.Rpc.POODFKIAKOK.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hdenlcpmihc_);
              hdenlcpmihc_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJFLLNMMDFN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJFLLNMMDFN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CJFLLNMMDFN.class, POGOProtos.Rpc.CJFLLNMMDFN.Builder.class);
  }

  /**
   * <pre>
   * ref: CJFLLNMMDFN/EEMCPCBEAII/GFLINFKNJEB
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB}
   */
  public enum GFLINFKNJEB
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
     * <code>ERROR = 2;</code>
     */
    ERROR(2),
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
     * <code>ERROR = 2;</code>
     */
    public static final int ERROR_VALUE = 2;


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
    public static GFLINFKNJEB valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GFLINFKNJEB forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GFLINFKNJEB>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GFLINFKNJEB> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GFLINFKNJEB>() {
            public GFLINFKNJEB findValueByNumber(int number) {
              return GFLINFKNJEB.forNumber(number);
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
      return POGOProtos.Rpc.CJFLLNMMDFN.getDescriptor().getEnumTypes().get(0);
    }

    private static final GFLINFKNJEB[] VALUES = values();

    public static GFLINFKNJEB valueOf(
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

    private GFLINFKNJEB(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB)
  }

  public static final int DMAHIPEGCIN_FIELD_NUMBER = 1;
  private int dmahipegcin_;
  /**
   * <code>.POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB dmahipegcin = 1;</code>
   * @return The enum numeric value on the wire for dmahipegcin.
   */
  @java.lang.Override public int getDmahipegcinValue() {
    return dmahipegcin_;
  }
  /**
   * <code>.POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB dmahipegcin = 1;</code>
   * @return The dmahipegcin.
   */
  @java.lang.Override public POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB getDmahipegcin() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB result = POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB.valueOf(dmahipegcin_);
    return result == null ? POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB.UNRECOGNIZED : result;
  }

  public static final int HDENLCPMIHC_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc_;
  /**
   * <code>.POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc = 2;</code>
   * @return Whether the hdenlcpmihc field is set.
   */
  @java.lang.Override
  public boolean hasHdenlcpmihc() {
    return hdenlcpmihc_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc = 2;</code>
   * @return The hdenlcpmihc.
   */
  @java.lang.Override
  public POGOProtos.Rpc.POODFKIAKOK getHdenlcpmihc() {
    return hdenlcpmihc_ == null ? POGOProtos.Rpc.POODFKIAKOK.getDefaultInstance() : hdenlcpmihc_;
  }
  /**
   * <code>.POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.POODFKIAKOKOrBuilder getHdenlcpmihcOrBuilder() {
    return getHdenlcpmihc();
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
    if (dmahipegcin_ != POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB.UNSET.getNumber()) {
      output.writeEnum(1, dmahipegcin_);
    }
    if (hdenlcpmihc_ != null) {
      output.writeMessage(2, getHdenlcpmihc());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dmahipegcin_ != POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dmahipegcin_);
    }
    if (hdenlcpmihc_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHdenlcpmihc());
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
    if (!(obj instanceof POGOProtos.Rpc.CJFLLNMMDFN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CJFLLNMMDFN other = (POGOProtos.Rpc.CJFLLNMMDFN) obj;

    if (dmahipegcin_ != other.dmahipegcin_) return false;
    if (hasHdenlcpmihc() != other.hasHdenlcpmihc()) return false;
    if (hasHdenlcpmihc()) {
      if (!getHdenlcpmihc()
          .equals(other.getHdenlcpmihc())) return false;
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
    hash = (37 * hash) + DMAHIPEGCIN_FIELD_NUMBER;
    hash = (53 * hash) + dmahipegcin_;
    if (hasHdenlcpmihc()) {
      hash = (37 * hash) + HDENLCPMIHC_FIELD_NUMBER;
      hash = (53 * hash) + getHdenlcpmihc().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CJFLLNMMDFN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CJFLLNMMDFN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJFLLNMMDFN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CJFLLNMMDFN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJFLLNMMDFN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CJFLLNMMDFN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJFLLNMMDFN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CJFLLNMMDFN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJFLLNMMDFN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CJFLLNMMDFN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CJFLLNMMDFN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CJFLLNMMDFN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CJFLLNMMDFN prototype) {
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
   * ref: CJFLLNMMDFN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CJFLLNMMDFN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CJFLLNMMDFN)
      POGOProtos.Rpc.CJFLLNMMDFNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJFLLNMMDFN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJFLLNMMDFN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CJFLLNMMDFN.class, POGOProtos.Rpc.CJFLLNMMDFN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CJFLLNMMDFN.newBuilder()
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
      dmahipegcin_ = 0;

      if (hdenlcpmihcBuilder_ == null) {
        hdenlcpmihc_ = null;
      } else {
        hdenlcpmihc_ = null;
        hdenlcpmihcBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CJFLLNMMDFN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CJFLLNMMDFN getDefaultInstanceForType() {
      return POGOProtos.Rpc.CJFLLNMMDFN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CJFLLNMMDFN build() {
      POGOProtos.Rpc.CJFLLNMMDFN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CJFLLNMMDFN buildPartial() {
      POGOProtos.Rpc.CJFLLNMMDFN result = new POGOProtos.Rpc.CJFLLNMMDFN(this);
      result.dmahipegcin_ = dmahipegcin_;
      if (hdenlcpmihcBuilder_ == null) {
        result.hdenlcpmihc_ = hdenlcpmihc_;
      } else {
        result.hdenlcpmihc_ = hdenlcpmihcBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.CJFLLNMMDFN) {
        return mergeFrom((POGOProtos.Rpc.CJFLLNMMDFN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CJFLLNMMDFN other) {
      if (other == POGOProtos.Rpc.CJFLLNMMDFN.getDefaultInstance()) return this;
      if (other.dmahipegcin_ != 0) {
        setDmahipegcinValue(other.getDmahipegcinValue());
      }
      if (other.hasHdenlcpmihc()) {
        mergeHdenlcpmihc(other.getHdenlcpmihc());
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
      POGOProtos.Rpc.CJFLLNMMDFN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CJFLLNMMDFN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int dmahipegcin_ = 0;
    /**
     * <code>.POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB dmahipegcin = 1;</code>
     * @return The enum numeric value on the wire for dmahipegcin.
     */
    @java.lang.Override public int getDmahipegcinValue() {
      return dmahipegcin_;
    }
    /**
     * <code>.POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB dmahipegcin = 1;</code>
     * @param value The enum numeric value on the wire for dmahipegcin to set.
     * @return This builder for chaining.
     */
    public Builder setDmahipegcinValue(int value) {
      
      dmahipegcin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB dmahipegcin = 1;</code>
     * @return The dmahipegcin.
     */
    @java.lang.Override
    public POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB getDmahipegcin() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB result = POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB.valueOf(dmahipegcin_);
      return result == null ? POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB dmahipegcin = 1;</code>
     * @param value The dmahipegcin to set.
     * @return This builder for chaining.
     */
    public Builder setDmahipegcin(POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dmahipegcin_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CJFLLNMMDFN.GFLINFKNJEB dmahipegcin = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDmahipegcin() {
      
      dmahipegcin_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.POODFKIAKOK, POGOProtos.Rpc.POODFKIAKOK.Builder, POGOProtos.Rpc.POODFKIAKOKOrBuilder> hdenlcpmihcBuilder_;
    /**
     * <code>.POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc = 2;</code>
     * @return Whether the hdenlcpmihc field is set.
     */
    public boolean hasHdenlcpmihc() {
      return hdenlcpmihcBuilder_ != null || hdenlcpmihc_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc = 2;</code>
     * @return The hdenlcpmihc.
     */
    public POGOProtos.Rpc.POODFKIAKOK getHdenlcpmihc() {
      if (hdenlcpmihcBuilder_ == null) {
        return hdenlcpmihc_ == null ? POGOProtos.Rpc.POODFKIAKOK.getDefaultInstance() : hdenlcpmihc_;
      } else {
        return hdenlcpmihcBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc = 2;</code>
     */
    public Builder setHdenlcpmihc(POGOProtos.Rpc.POODFKIAKOK value) {
      if (hdenlcpmihcBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hdenlcpmihc_ = value;
        onChanged();
      } else {
        hdenlcpmihcBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc = 2;</code>
     */
    public Builder setHdenlcpmihc(
        POGOProtos.Rpc.POODFKIAKOK.Builder builderForValue) {
      if (hdenlcpmihcBuilder_ == null) {
        hdenlcpmihc_ = builderForValue.build();
        onChanged();
      } else {
        hdenlcpmihcBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc = 2;</code>
     */
    public Builder mergeHdenlcpmihc(POGOProtos.Rpc.POODFKIAKOK value) {
      if (hdenlcpmihcBuilder_ == null) {
        if (hdenlcpmihc_ != null) {
          hdenlcpmihc_ =
            POGOProtos.Rpc.POODFKIAKOK.newBuilder(hdenlcpmihc_).mergeFrom(value).buildPartial();
        } else {
          hdenlcpmihc_ = value;
        }
        onChanged();
      } else {
        hdenlcpmihcBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc = 2;</code>
     */
    public Builder clearHdenlcpmihc() {
      if (hdenlcpmihcBuilder_ == null) {
        hdenlcpmihc_ = null;
        onChanged();
      } else {
        hdenlcpmihc_ = null;
        hdenlcpmihcBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc = 2;</code>
     */
    public POGOProtos.Rpc.POODFKIAKOK.Builder getHdenlcpmihcBuilder() {
      
      onChanged();
      return getHdenlcpmihcFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc = 2;</code>
     */
    public POGOProtos.Rpc.POODFKIAKOKOrBuilder getHdenlcpmihcOrBuilder() {
      if (hdenlcpmihcBuilder_ != null) {
        return hdenlcpmihcBuilder_.getMessageOrBuilder();
      } else {
        return hdenlcpmihc_ == null ?
            POGOProtos.Rpc.POODFKIAKOK.getDefaultInstance() : hdenlcpmihc_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.POODFKIAKOK hdenlcpmihc = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.POODFKIAKOK, POGOProtos.Rpc.POODFKIAKOK.Builder, POGOProtos.Rpc.POODFKIAKOKOrBuilder> 
        getHdenlcpmihcFieldBuilder() {
      if (hdenlcpmihcBuilder_ == null) {
        hdenlcpmihcBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.POODFKIAKOK, POGOProtos.Rpc.POODFKIAKOK.Builder, POGOProtos.Rpc.POODFKIAKOKOrBuilder>(
                getHdenlcpmihc(),
                getParentForChildren(),
                isClean());
        hdenlcpmihc_ = null;
      }
      return hdenlcpmihcBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CJFLLNMMDFN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CJFLLNMMDFN)
  private static final POGOProtos.Rpc.CJFLLNMMDFN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CJFLLNMMDFN();
  }

  public static POGOProtos.Rpc.CJFLLNMMDFN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CJFLLNMMDFN>
      PARSER = new com.google.protobuf.AbstractParser<CJFLLNMMDFN>() {
    @java.lang.Override
    public CJFLLNMMDFN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CJFLLNMMDFN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CJFLLNMMDFN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CJFLLNMMDFN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CJFLLNMMDFN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

