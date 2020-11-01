// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PLJJOECFKOE}
 */
public  final class PLJJOECFKOE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PLJJOECFKOE)
    PLJJOECFKOEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PLJJOECFKOE.newBuilder() to construct.
  private PLJJOECFKOE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PLJJOECFKOE() {
    anapoecpjoi_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PLJJOECFKOE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PLJJOECFKOE(
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

            anapoecpjoi_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.FEBJOCGHLEF.Builder subBuilder = null;
            if (hholkmbmkpj_ != null) {
              subBuilder = hholkmbmkpj_.toBuilder();
            }
            hholkmbmkpj_ = input.readMessage(POGOProtos.Rpc.FEBJOCGHLEF.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hholkmbmkpj_);
              hholkmbmkpj_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLJJOECFKOE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLJJOECFKOE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PLJJOECFKOE.class, POGOProtos.Rpc.PLJJOECFKOE.Builder.class);
  }

  /**
   * <pre>
   * ref: PLJJOECFKOE/CKIEJIDGJEN/JEIGKNLKIGO
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO}
   */
  public enum JEIGKNLKIGO
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ROCKET = 0;</code>
     */
    ROCKET(0),
    /**
     * <code>ROCKET_B = 1;</code>
     */
    ROCKET_B(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ROCKET = 0;</code>
     */
    public static final int ROCKET_VALUE = 0;
    /**
     * <code>ROCKET_B = 1;</code>
     */
    public static final int ROCKET_B_VALUE = 1;


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
    public static JEIGKNLKIGO valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static JEIGKNLKIGO forNumber(int value) {
      switch (value) {
        case 0: return ROCKET;
        case 1: return ROCKET_B;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<JEIGKNLKIGO>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        JEIGKNLKIGO> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<JEIGKNLKIGO>() {
            public JEIGKNLKIGO findValueByNumber(int number) {
              return JEIGKNLKIGO.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.PLJJOECFKOE.getDescriptor().getEnumTypes().get(0);
    }

    private static final JEIGKNLKIGO[] VALUES = values();

    public static JEIGKNLKIGO valueOf(
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

    private JEIGKNLKIGO(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO)
  }

  public static final int ANAPOECPJOI_FIELD_NUMBER = 1;
  private int anapoecpjoi_;
  /**
   * <code>.POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO anapoecpjoi = 1;</code>
   * @return The enum numeric value on the wire for anapoecpjoi.
   */
  public int getAnapoecpjoiValue() {
    return anapoecpjoi_;
  }
  /**
   * <code>.POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO anapoecpjoi = 1;</code>
   * @return The anapoecpjoi.
   */
  public POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO getAnapoecpjoi() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO result = POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO.valueOf(anapoecpjoi_);
    return result == null ? POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO.UNRECOGNIZED : result;
  }

  public static final int HHOLKMBMKPJ_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj_;
  /**
   * <code>.POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj = 2;</code>
   * @return Whether the hholkmbmkpj field is set.
   */
  public boolean hasHholkmbmkpj() {
    return hholkmbmkpj_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj = 2;</code>
   * @return The hholkmbmkpj.
   */
  public POGOProtos.Rpc.FEBJOCGHLEF getHholkmbmkpj() {
    return hholkmbmkpj_ == null ? POGOProtos.Rpc.FEBJOCGHLEF.getDefaultInstance() : hholkmbmkpj_;
  }
  /**
   * <code>.POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj = 2;</code>
   */
  public POGOProtos.Rpc.FEBJOCGHLEFOrBuilder getHholkmbmkpjOrBuilder() {
    return getHholkmbmkpj();
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
    if (anapoecpjoi_ != POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO.ROCKET.getNumber()) {
      output.writeEnum(1, anapoecpjoi_);
    }
    if (hholkmbmkpj_ != null) {
      output.writeMessage(2, getHholkmbmkpj());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (anapoecpjoi_ != POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO.ROCKET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, anapoecpjoi_);
    }
    if (hholkmbmkpj_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHholkmbmkpj());
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
    if (!(obj instanceof POGOProtos.Rpc.PLJJOECFKOE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PLJJOECFKOE other = (POGOProtos.Rpc.PLJJOECFKOE) obj;

    if (anapoecpjoi_ != other.anapoecpjoi_) return false;
    if (hasHholkmbmkpj() != other.hasHholkmbmkpj()) return false;
    if (hasHholkmbmkpj()) {
      if (!getHholkmbmkpj()
          .equals(other.getHholkmbmkpj())) return false;
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
    hash = (37 * hash) + ANAPOECPJOI_FIELD_NUMBER;
    hash = (53 * hash) + anapoecpjoi_;
    if (hasHholkmbmkpj()) {
      hash = (37 * hash) + HHOLKMBMKPJ_FIELD_NUMBER;
      hash = (53 * hash) + getHholkmbmkpj().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PLJJOECFKOE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PLJJOECFKOE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLJJOECFKOE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PLJJOECFKOE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLJJOECFKOE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PLJJOECFKOE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLJJOECFKOE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PLJJOECFKOE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLJJOECFKOE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PLJJOECFKOE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLJJOECFKOE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PLJJOECFKOE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PLJJOECFKOE prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PLJJOECFKOE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PLJJOECFKOE)
      POGOProtos.Rpc.PLJJOECFKOEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLJJOECFKOE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLJJOECFKOE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PLJJOECFKOE.class, POGOProtos.Rpc.PLJJOECFKOE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PLJJOECFKOE.newBuilder()
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
      anapoecpjoi_ = 0;

      if (hholkmbmkpjBuilder_ == null) {
        hholkmbmkpj_ = null;
      } else {
        hholkmbmkpj_ = null;
        hholkmbmkpjBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLJJOECFKOE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PLJJOECFKOE getDefaultInstanceForType() {
      return POGOProtos.Rpc.PLJJOECFKOE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PLJJOECFKOE build() {
      POGOProtos.Rpc.PLJJOECFKOE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PLJJOECFKOE buildPartial() {
      POGOProtos.Rpc.PLJJOECFKOE result = new POGOProtos.Rpc.PLJJOECFKOE(this);
      result.anapoecpjoi_ = anapoecpjoi_;
      if (hholkmbmkpjBuilder_ == null) {
        result.hholkmbmkpj_ = hholkmbmkpj_;
      } else {
        result.hholkmbmkpj_ = hholkmbmkpjBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PLJJOECFKOE) {
        return mergeFrom((POGOProtos.Rpc.PLJJOECFKOE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PLJJOECFKOE other) {
      if (other == POGOProtos.Rpc.PLJJOECFKOE.getDefaultInstance()) return this;
      if (other.anapoecpjoi_ != 0) {
        setAnapoecpjoiValue(other.getAnapoecpjoiValue());
      }
      if (other.hasHholkmbmkpj()) {
        mergeHholkmbmkpj(other.getHholkmbmkpj());
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
      POGOProtos.Rpc.PLJJOECFKOE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PLJJOECFKOE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int anapoecpjoi_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO anapoecpjoi = 1;</code>
     * @return The enum numeric value on the wire for anapoecpjoi.
     */
    public int getAnapoecpjoiValue() {
      return anapoecpjoi_;
    }
    /**
     * <code>.POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO anapoecpjoi = 1;</code>
     * @param value The enum numeric value on the wire for anapoecpjoi to set.
     * @return This builder for chaining.
     */
    public Builder setAnapoecpjoiValue(int value) {
      anapoecpjoi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO anapoecpjoi = 1;</code>
     * @return The anapoecpjoi.
     */
    public POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO getAnapoecpjoi() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO result = POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO.valueOf(anapoecpjoi_);
      return result == null ? POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO anapoecpjoi = 1;</code>
     * @param value The anapoecpjoi to set.
     * @return This builder for chaining.
     */
    public Builder setAnapoecpjoi(POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      anapoecpjoi_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PLJJOECFKOE.JEIGKNLKIGO anapoecpjoi = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnapoecpjoi() {
      
      anapoecpjoi_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FEBJOCGHLEF, POGOProtos.Rpc.FEBJOCGHLEF.Builder, POGOProtos.Rpc.FEBJOCGHLEFOrBuilder> hholkmbmkpjBuilder_;
    /**
     * <code>.POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj = 2;</code>
     * @return Whether the hholkmbmkpj field is set.
     */
    public boolean hasHholkmbmkpj() {
      return hholkmbmkpjBuilder_ != null || hholkmbmkpj_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj = 2;</code>
     * @return The hholkmbmkpj.
     */
    public POGOProtos.Rpc.FEBJOCGHLEF getHholkmbmkpj() {
      if (hholkmbmkpjBuilder_ == null) {
        return hholkmbmkpj_ == null ? POGOProtos.Rpc.FEBJOCGHLEF.getDefaultInstance() : hholkmbmkpj_;
      } else {
        return hholkmbmkpjBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj = 2;</code>
     */
    public Builder setHholkmbmkpj(POGOProtos.Rpc.FEBJOCGHLEF value) {
      if (hholkmbmkpjBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hholkmbmkpj_ = value;
        onChanged();
      } else {
        hholkmbmkpjBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj = 2;</code>
     */
    public Builder setHholkmbmkpj(
        POGOProtos.Rpc.FEBJOCGHLEF.Builder builderForValue) {
      if (hholkmbmkpjBuilder_ == null) {
        hholkmbmkpj_ = builderForValue.build();
        onChanged();
      } else {
        hholkmbmkpjBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj = 2;</code>
     */
    public Builder mergeHholkmbmkpj(POGOProtos.Rpc.FEBJOCGHLEF value) {
      if (hholkmbmkpjBuilder_ == null) {
        if (hholkmbmkpj_ != null) {
          hholkmbmkpj_ =
            POGOProtos.Rpc.FEBJOCGHLEF.newBuilder(hholkmbmkpj_).mergeFrom(value).buildPartial();
        } else {
          hholkmbmkpj_ = value;
        }
        onChanged();
      } else {
        hholkmbmkpjBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj = 2;</code>
     */
    public Builder clearHholkmbmkpj() {
      if (hholkmbmkpjBuilder_ == null) {
        hholkmbmkpj_ = null;
        onChanged();
      } else {
        hholkmbmkpj_ = null;
        hholkmbmkpjBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj = 2;</code>
     */
    public POGOProtos.Rpc.FEBJOCGHLEF.Builder getHholkmbmkpjBuilder() {
      
      onChanged();
      return getHholkmbmkpjFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj = 2;</code>
     */
    public POGOProtos.Rpc.FEBJOCGHLEFOrBuilder getHholkmbmkpjOrBuilder() {
      if (hholkmbmkpjBuilder_ != null) {
        return hholkmbmkpjBuilder_.getMessageOrBuilder();
      } else {
        return hholkmbmkpj_ == null ?
            POGOProtos.Rpc.FEBJOCGHLEF.getDefaultInstance() : hholkmbmkpj_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FEBJOCGHLEF hholkmbmkpj = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FEBJOCGHLEF, POGOProtos.Rpc.FEBJOCGHLEF.Builder, POGOProtos.Rpc.FEBJOCGHLEFOrBuilder> 
        getHholkmbmkpjFieldBuilder() {
      if (hholkmbmkpjBuilder_ == null) {
        hholkmbmkpjBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.FEBJOCGHLEF, POGOProtos.Rpc.FEBJOCGHLEF.Builder, POGOProtos.Rpc.FEBJOCGHLEFOrBuilder>(
                getHholkmbmkpj(),
                getParentForChildren(),
                isClean());
        hholkmbmkpj_ = null;
      }
      return hholkmbmkpjBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PLJJOECFKOE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PLJJOECFKOE)
  private static final POGOProtos.Rpc.PLJJOECFKOE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PLJJOECFKOE();
  }

  public static POGOProtos.Rpc.PLJJOECFKOE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PLJJOECFKOE>
      PARSER = new com.google.protobuf.AbstractParser<PLJJOECFKOE>() {
    @java.lang.Override
    public PLJJOECFKOE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PLJJOECFKOE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PLJJOECFKOE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PLJJOECFKOE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PLJJOECFKOE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

