// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: EOJPEHGJNGD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.EOJPEHGJNGD}
 */
public final class EOJPEHGJNGD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EOJPEHGJNGD)
    EOJPEHGJNGDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EOJPEHGJNGD.newBuilder() to construct.
  private EOJPEHGJNGD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EOJPEHGJNGD() {
    kmieohojnij_ = 0;
    aicmffombmc_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EOJPEHGJNGD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EOJPEHGJNGD(
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

            kmieohojnij_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            aicmffombmc_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EOJPEHGJNGD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EOJPEHGJNGD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EOJPEHGJNGD.class, POGOProtos.Rpc.EOJPEHGJNGD.Builder.class);
  }

  /**
   * <pre>
   * ref: EOJPEHGJNGD/PAJFMGALPLG/DMMMIMEBBEN
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN}
   */
  public enum DMMMIMEBBEN
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    ERROR_UNKNOWN(2),
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    public static final int ERROR_UNKNOWN_VALUE = 2;


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
    public static DMMMIMEBBEN valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DMMMIMEBBEN forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_UNKNOWN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DMMMIMEBBEN>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DMMMIMEBBEN> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DMMMIMEBBEN>() {
            public DMMMIMEBBEN findValueByNumber(int number) {
              return DMMMIMEBBEN.forNumber(number);
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
      return POGOProtos.Rpc.EOJPEHGJNGD.getDescriptor().getEnumTypes().get(0);
    }

    private static final DMMMIMEBBEN[] VALUES = values();

    public static DMMMIMEBBEN valueOf(
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

    private DMMMIMEBBEN(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN)
  }

  public static final int KMIEOHOJNIJ_FIELD_NUMBER = 1;
  private int kmieohojnij_;
  /**
   * <code>.POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN kmieohojnij = 1;</code>
   * @return The enum numeric value on the wire for kmieohojnij.
   */
  @java.lang.Override public int getKmieohojnijValue() {
    return kmieohojnij_;
  }
  /**
   * <code>.POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN kmieohojnij = 1;</code>
   * @return The kmieohojnij.
   */
  @java.lang.Override public POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN getKmieohojnij() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN result = POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN.valueOf(kmieohojnij_);
    return result == null ? POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN.UNRECOGNIZED : result;
  }

  public static final int AICMFFOMBMC_FIELD_NUMBER = 2;
  private volatile java.lang.Object aicmffombmc_;
  /**
   * <code>string aicmffombmc = 2;</code>
   * @return The aicmffombmc.
   */
  @java.lang.Override
  public java.lang.String getAicmffombmc() {
    java.lang.Object ref = aicmffombmc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aicmffombmc_ = s;
      return s;
    }
  }
  /**
   * <code>string aicmffombmc = 2;</code>
   * @return The bytes for aicmffombmc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAicmffombmcBytes() {
    java.lang.Object ref = aicmffombmc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aicmffombmc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (kmieohojnij_ != POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN.UNSET.getNumber()) {
      output.writeEnum(1, kmieohojnij_);
    }
    if (!getAicmffombmcBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, aicmffombmc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kmieohojnij_ != POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, kmieohojnij_);
    }
    if (!getAicmffombmcBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, aicmffombmc_);
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
    if (!(obj instanceof POGOProtos.Rpc.EOJPEHGJNGD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EOJPEHGJNGD other = (POGOProtos.Rpc.EOJPEHGJNGD) obj;

    if (kmieohojnij_ != other.kmieohojnij_) return false;
    if (!getAicmffombmc()
        .equals(other.getAicmffombmc())) return false;
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
    hash = (37 * hash) + KMIEOHOJNIJ_FIELD_NUMBER;
    hash = (53 * hash) + kmieohojnij_;
    hash = (37 * hash) + AICMFFOMBMC_FIELD_NUMBER;
    hash = (53 * hash) + getAicmffombmc().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EOJPEHGJNGD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EOJPEHGJNGD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EOJPEHGJNGD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EOJPEHGJNGD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EOJPEHGJNGD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EOJPEHGJNGD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EOJPEHGJNGD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EOJPEHGJNGD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EOJPEHGJNGD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EOJPEHGJNGD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EOJPEHGJNGD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EOJPEHGJNGD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EOJPEHGJNGD prototype) {
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
   * ref: EOJPEHGJNGD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.EOJPEHGJNGD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EOJPEHGJNGD)
      POGOProtos.Rpc.EOJPEHGJNGDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EOJPEHGJNGD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EOJPEHGJNGD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EOJPEHGJNGD.class, POGOProtos.Rpc.EOJPEHGJNGD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EOJPEHGJNGD.newBuilder()
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
      kmieohojnij_ = 0;

      aicmffombmc_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EOJPEHGJNGD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EOJPEHGJNGD getDefaultInstanceForType() {
      return POGOProtos.Rpc.EOJPEHGJNGD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EOJPEHGJNGD build() {
      POGOProtos.Rpc.EOJPEHGJNGD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EOJPEHGJNGD buildPartial() {
      POGOProtos.Rpc.EOJPEHGJNGD result = new POGOProtos.Rpc.EOJPEHGJNGD(this);
      result.kmieohojnij_ = kmieohojnij_;
      result.aicmffombmc_ = aicmffombmc_;
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
      if (other instanceof POGOProtos.Rpc.EOJPEHGJNGD) {
        return mergeFrom((POGOProtos.Rpc.EOJPEHGJNGD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EOJPEHGJNGD other) {
      if (other == POGOProtos.Rpc.EOJPEHGJNGD.getDefaultInstance()) return this;
      if (other.kmieohojnij_ != 0) {
        setKmieohojnijValue(other.getKmieohojnijValue());
      }
      if (!other.getAicmffombmc().isEmpty()) {
        aicmffombmc_ = other.aicmffombmc_;
        onChanged();
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
      POGOProtos.Rpc.EOJPEHGJNGD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EOJPEHGJNGD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int kmieohojnij_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN kmieohojnij = 1;</code>
     * @return The enum numeric value on the wire for kmieohojnij.
     */
    @java.lang.Override public int getKmieohojnijValue() {
      return kmieohojnij_;
    }
    /**
     * <code>.POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN kmieohojnij = 1;</code>
     * @param value The enum numeric value on the wire for kmieohojnij to set.
     * @return This builder for chaining.
     */
    public Builder setKmieohojnijValue(int value) {
      
      kmieohojnij_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN kmieohojnij = 1;</code>
     * @return The kmieohojnij.
     */
    @java.lang.Override
    public POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN getKmieohojnij() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN result = POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN.valueOf(kmieohojnij_);
      return result == null ? POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN kmieohojnij = 1;</code>
     * @param value The kmieohojnij to set.
     * @return This builder for chaining.
     */
    public Builder setKmieohojnij(POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      kmieohojnij_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EOJPEHGJNGD.DMMMIMEBBEN kmieohojnij = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKmieohojnij() {
      
      kmieohojnij_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object aicmffombmc_ = "";
    /**
     * <code>string aicmffombmc = 2;</code>
     * @return The aicmffombmc.
     */
    public java.lang.String getAicmffombmc() {
      java.lang.Object ref = aicmffombmc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aicmffombmc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string aicmffombmc = 2;</code>
     * @return The bytes for aicmffombmc.
     */
    public com.google.protobuf.ByteString
        getAicmffombmcBytes() {
      java.lang.Object ref = aicmffombmc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aicmffombmc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string aicmffombmc = 2;</code>
     * @param value The aicmffombmc to set.
     * @return This builder for chaining.
     */
    public Builder setAicmffombmc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aicmffombmc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string aicmffombmc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAicmffombmc() {
      
      aicmffombmc_ = getDefaultInstance().getAicmffombmc();
      onChanged();
      return this;
    }
    /**
     * <code>string aicmffombmc = 2;</code>
     * @param value The bytes for aicmffombmc to set.
     * @return This builder for chaining.
     */
    public Builder setAicmffombmcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aicmffombmc_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EOJPEHGJNGD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EOJPEHGJNGD)
  private static final POGOProtos.Rpc.EOJPEHGJNGD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EOJPEHGJNGD();
  }

  public static POGOProtos.Rpc.EOJPEHGJNGD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EOJPEHGJNGD>
      PARSER = new com.google.protobuf.AbstractParser<EOJPEHGJNGD>() {
    @java.lang.Override
    public EOJPEHGJNGD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EOJPEHGJNGD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EOJPEHGJNGD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EOJPEHGJNGD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EOJPEHGJNGD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

