// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PLLNKBGKAMN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PLLNKBGKAMN}
 */
public final class PLLNKBGKAMN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PLLNKBGKAMN)
    PLLNKBGKAMNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PLLNKBGKAMN.newBuilder() to construct.
  private PLLNKBGKAMN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PLLNKBGKAMN() {
    mnihbgfekmo_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PLLNKBGKAMN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PLLNKBGKAMN(
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

            mnihbgfekmo_ = rawValue;
            break;
          }
          case 16: {

            hhpfbbmbooi_ = input.readInt32();
            break;
          }
          case 24: {

            legignhpdoi_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLLNKBGKAMN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLLNKBGKAMN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PLLNKBGKAMN.class, POGOProtos.Rpc.PLLNKBGKAMN.Builder.class);
  }

  public static final int MNIHBGFEKMO_FIELD_NUMBER = 1;
  private int mnihbgfekmo_;
  /**
   * <code>.POGOProtos.Rpc.PEJNDCJAOCE mnihbgfekmo = 1;</code>
   * @return The enum numeric value on the wire for mnihbgfekmo.
   */
  @java.lang.Override public int getMnihbgfekmoValue() {
    return mnihbgfekmo_;
  }
  /**
   * <code>.POGOProtos.Rpc.PEJNDCJAOCE mnihbgfekmo = 1;</code>
   * @return The mnihbgfekmo.
   */
  @java.lang.Override public POGOProtos.Rpc.PEJNDCJAOCE getMnihbgfekmo() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PEJNDCJAOCE result = POGOProtos.Rpc.PEJNDCJAOCE.valueOf(mnihbgfekmo_);
    return result == null ? POGOProtos.Rpc.PEJNDCJAOCE.UNRECOGNIZED : result;
  }

  public static final int HHPFBBMBOOI_FIELD_NUMBER = 2;
  private int hhpfbbmbooi_;
  /**
   * <code>int32 hhpfbbmbooi = 2;</code>
   * @return The hhpfbbmbooi.
   */
  @java.lang.Override
  public int getHhpfbbmbooi() {
    return hhpfbbmbooi_;
  }

  public static final int LEGIGNHPDOI_FIELD_NUMBER = 3;
  private int legignhpdoi_;
  /**
   * <code>int32 legignhpdoi = 3;</code>
   * @return The legignhpdoi.
   */
  @java.lang.Override
  public int getLegignhpdoi() {
    return legignhpdoi_;
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
    if (mnihbgfekmo_ != POGOProtos.Rpc.PEJNDCJAOCE.PEJNDCJAOCE_UNDEFINED_SHOPPING_PAGE_SCROLL_TYPE.getNumber()) {
      output.writeEnum(1, mnihbgfekmo_);
    }
    if (hhpfbbmbooi_ != 0) {
      output.writeInt32(2, hhpfbbmbooi_);
    }
    if (legignhpdoi_ != 0) {
      output.writeInt32(3, legignhpdoi_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mnihbgfekmo_ != POGOProtos.Rpc.PEJNDCJAOCE.PEJNDCJAOCE_UNDEFINED_SHOPPING_PAGE_SCROLL_TYPE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, mnihbgfekmo_);
    }
    if (hhpfbbmbooi_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, hhpfbbmbooi_);
    }
    if (legignhpdoi_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, legignhpdoi_);
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
    if (!(obj instanceof POGOProtos.Rpc.PLLNKBGKAMN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PLLNKBGKAMN other = (POGOProtos.Rpc.PLLNKBGKAMN) obj;

    if (mnihbgfekmo_ != other.mnihbgfekmo_) return false;
    if (getHhpfbbmbooi()
        != other.getHhpfbbmbooi()) return false;
    if (getLegignhpdoi()
        != other.getLegignhpdoi()) return false;
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
    hash = (37 * hash) + MNIHBGFEKMO_FIELD_NUMBER;
    hash = (53 * hash) + mnihbgfekmo_;
    hash = (37 * hash) + HHPFBBMBOOI_FIELD_NUMBER;
    hash = (53 * hash) + getHhpfbbmbooi();
    hash = (37 * hash) + LEGIGNHPDOI_FIELD_NUMBER;
    hash = (53 * hash) + getLegignhpdoi();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PLLNKBGKAMN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PLLNKBGKAMN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLLNKBGKAMN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PLLNKBGKAMN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLLNKBGKAMN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PLLNKBGKAMN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLLNKBGKAMN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PLLNKBGKAMN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLLNKBGKAMN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PLLNKBGKAMN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLLNKBGKAMN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PLLNKBGKAMN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PLLNKBGKAMN prototype) {
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
   * ref: PLLNKBGKAMN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PLLNKBGKAMN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PLLNKBGKAMN)
      POGOProtos.Rpc.PLLNKBGKAMNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLLNKBGKAMN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLLNKBGKAMN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PLLNKBGKAMN.class, POGOProtos.Rpc.PLLNKBGKAMN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PLLNKBGKAMN.newBuilder()
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
      mnihbgfekmo_ = 0;

      hhpfbbmbooi_ = 0;

      legignhpdoi_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PLLNKBGKAMN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PLLNKBGKAMN getDefaultInstanceForType() {
      return POGOProtos.Rpc.PLLNKBGKAMN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PLLNKBGKAMN build() {
      POGOProtos.Rpc.PLLNKBGKAMN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PLLNKBGKAMN buildPartial() {
      POGOProtos.Rpc.PLLNKBGKAMN result = new POGOProtos.Rpc.PLLNKBGKAMN(this);
      result.mnihbgfekmo_ = mnihbgfekmo_;
      result.hhpfbbmbooi_ = hhpfbbmbooi_;
      result.legignhpdoi_ = legignhpdoi_;
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
      if (other instanceof POGOProtos.Rpc.PLLNKBGKAMN) {
        return mergeFrom((POGOProtos.Rpc.PLLNKBGKAMN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PLLNKBGKAMN other) {
      if (other == POGOProtos.Rpc.PLLNKBGKAMN.getDefaultInstance()) return this;
      if (other.mnihbgfekmo_ != 0) {
        setMnihbgfekmoValue(other.getMnihbgfekmoValue());
      }
      if (other.getHhpfbbmbooi() != 0) {
        setHhpfbbmbooi(other.getHhpfbbmbooi());
      }
      if (other.getLegignhpdoi() != 0) {
        setLegignhpdoi(other.getLegignhpdoi());
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
      POGOProtos.Rpc.PLLNKBGKAMN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PLLNKBGKAMN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int mnihbgfekmo_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PEJNDCJAOCE mnihbgfekmo = 1;</code>
     * @return The enum numeric value on the wire for mnihbgfekmo.
     */
    @java.lang.Override public int getMnihbgfekmoValue() {
      return mnihbgfekmo_;
    }
    /**
     * <code>.POGOProtos.Rpc.PEJNDCJAOCE mnihbgfekmo = 1;</code>
     * @param value The enum numeric value on the wire for mnihbgfekmo to set.
     * @return This builder for chaining.
     */
    public Builder setMnihbgfekmoValue(int value) {
      
      mnihbgfekmo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PEJNDCJAOCE mnihbgfekmo = 1;</code>
     * @return The mnihbgfekmo.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PEJNDCJAOCE getMnihbgfekmo() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PEJNDCJAOCE result = POGOProtos.Rpc.PEJNDCJAOCE.valueOf(mnihbgfekmo_);
      return result == null ? POGOProtos.Rpc.PEJNDCJAOCE.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PEJNDCJAOCE mnihbgfekmo = 1;</code>
     * @param value The mnihbgfekmo to set.
     * @return This builder for chaining.
     */
    public Builder setMnihbgfekmo(POGOProtos.Rpc.PEJNDCJAOCE value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      mnihbgfekmo_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PEJNDCJAOCE mnihbgfekmo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMnihbgfekmo() {
      
      mnihbgfekmo_ = 0;
      onChanged();
      return this;
    }

    private int hhpfbbmbooi_ ;
    /**
     * <code>int32 hhpfbbmbooi = 2;</code>
     * @return The hhpfbbmbooi.
     */
    @java.lang.Override
    public int getHhpfbbmbooi() {
      return hhpfbbmbooi_;
    }
    /**
     * <code>int32 hhpfbbmbooi = 2;</code>
     * @param value The hhpfbbmbooi to set.
     * @return This builder for chaining.
     */
    public Builder setHhpfbbmbooi(int value) {
      
      hhpfbbmbooi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hhpfbbmbooi = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHhpfbbmbooi() {
      
      hhpfbbmbooi_ = 0;
      onChanged();
      return this;
    }

    private int legignhpdoi_ ;
    /**
     * <code>int32 legignhpdoi = 3;</code>
     * @return The legignhpdoi.
     */
    @java.lang.Override
    public int getLegignhpdoi() {
      return legignhpdoi_;
    }
    /**
     * <code>int32 legignhpdoi = 3;</code>
     * @param value The legignhpdoi to set.
     * @return This builder for chaining.
     */
    public Builder setLegignhpdoi(int value) {
      
      legignhpdoi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 legignhpdoi = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLegignhpdoi() {
      
      legignhpdoi_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PLLNKBGKAMN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PLLNKBGKAMN)
  private static final POGOProtos.Rpc.PLLNKBGKAMN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PLLNKBGKAMN();
  }

  public static POGOProtos.Rpc.PLLNKBGKAMN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PLLNKBGKAMN>
      PARSER = new com.google.protobuf.AbstractParser<PLLNKBGKAMN>() {
    @java.lang.Override
    public PLLNKBGKAMN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PLLNKBGKAMN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PLLNKBGKAMN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PLLNKBGKAMN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PLLNKBGKAMN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

