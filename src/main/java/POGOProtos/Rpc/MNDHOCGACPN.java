// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MNDHOCGACPN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.MNDHOCGACPN}
 */
public final class MNDHOCGACPN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MNDHOCGACPN)
    MNDHOCGACPNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MNDHOCGACPN.newBuilder() to construct.
  private MNDHOCGACPN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MNDHOCGACPN() {
    dmahipegcin_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MNDHOCGACPN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MNDHOCGACPN(
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
            POGOProtos.Rpc.COOOEKOJFAO.Builder subBuilder = null;
            if (modleahleaf_ != null) {
              subBuilder = modleahleaf_.toBuilder();
            }
            modleahleaf_ = input.readMessage(POGOProtos.Rpc.COOOEKOJFAO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(modleahleaf_);
              modleahleaf_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MNDHOCGACPN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MNDHOCGACPN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MNDHOCGACPN.class, POGOProtos.Rpc.MNDHOCGACPN.Builder.class);
  }

  /**
   * <pre>
   * ref: MNDHOCGACPN/CAOHJBOHIKJ/OGGMFGFFOMA
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA}
   */
  public enum OGGMFGFFOMA
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
     * <code>AVATAR_ALREADY_SET = 2;</code>
     */
    AVATAR_ALREADY_SET(2),
    /**
     * <code>FAILURE = 3;</code>
     */
    FAILURE(3),
    /**
     * <code>SLOT_NOT_ALLOWED = 4;</code>
     */
    SLOT_NOT_ALLOWED(4),
    /**
     * <code>ITEM_NOT_OWNED = 5;</code>
     */
    ITEM_NOT_OWNED(5),
    /**
     * <code>INVALID_AVATAR_TYPE = 6;</code>
     */
    INVALID_AVATAR_TYPE(6),
    /**
     * <code>AVATAR_RESET = 7;</code>
     */
    AVATAR_RESET(7),
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
     * <code>AVATAR_ALREADY_SET = 2;</code>
     */
    public static final int AVATAR_ALREADY_SET_VALUE = 2;
    /**
     * <code>FAILURE = 3;</code>
     */
    public static final int FAILURE_VALUE = 3;
    /**
     * <code>SLOT_NOT_ALLOWED = 4;</code>
     */
    public static final int SLOT_NOT_ALLOWED_VALUE = 4;
    /**
     * <code>ITEM_NOT_OWNED = 5;</code>
     */
    public static final int ITEM_NOT_OWNED_VALUE = 5;
    /**
     * <code>INVALID_AVATAR_TYPE = 6;</code>
     */
    public static final int INVALID_AVATAR_TYPE_VALUE = 6;
    /**
     * <code>AVATAR_RESET = 7;</code>
     */
    public static final int AVATAR_RESET_VALUE = 7;


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
    public static OGGMFGFFOMA valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OGGMFGFFOMA forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return AVATAR_ALREADY_SET;
        case 3: return FAILURE;
        case 4: return SLOT_NOT_ALLOWED;
        case 5: return ITEM_NOT_OWNED;
        case 6: return INVALID_AVATAR_TYPE;
        case 7: return AVATAR_RESET;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OGGMFGFFOMA>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OGGMFGFFOMA> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OGGMFGFFOMA>() {
            public OGGMFGFFOMA findValueByNumber(int number) {
              return OGGMFGFFOMA.forNumber(number);
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
      return POGOProtos.Rpc.MNDHOCGACPN.getDescriptor().getEnumTypes().get(0);
    }

    private static final OGGMFGFFOMA[] VALUES = values();

    public static OGGMFGFFOMA valueOf(
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

    private OGGMFGFFOMA(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA)
  }

  public static final int DMAHIPEGCIN_FIELD_NUMBER = 1;
  private int dmahipegcin_;
  /**
   * <code>.POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA dmahipegcin = 1;</code>
   * @return The enum numeric value on the wire for dmahipegcin.
   */
  @java.lang.Override public int getDmahipegcinValue() {
    return dmahipegcin_;
  }
  /**
   * <code>.POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA dmahipegcin = 1;</code>
   * @return The dmahipegcin.
   */
  @java.lang.Override public POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA getDmahipegcin() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA result = POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA.valueOf(dmahipegcin_);
    return result == null ? POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA.UNRECOGNIZED : result;
  }

  public static final int MODLEAHLEAF_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.COOOEKOJFAO modleahleaf_;
  /**
   * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
   * @return Whether the modleahleaf field is set.
   */
  @java.lang.Override
  public boolean hasModleahleaf() {
    return modleahleaf_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
   * @return The modleahleaf.
   */
  @java.lang.Override
  public POGOProtos.Rpc.COOOEKOJFAO getModleahleaf() {
    return modleahleaf_ == null ? POGOProtos.Rpc.COOOEKOJFAO.getDefaultInstance() : modleahleaf_;
  }
  /**
   * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.COOOEKOJFAOOrBuilder getModleahleafOrBuilder() {
    return getModleahleaf();
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
    if (dmahipegcin_ != POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA.UNSET.getNumber()) {
      output.writeEnum(1, dmahipegcin_);
    }
    if (modleahleaf_ != null) {
      output.writeMessage(2, getModleahleaf());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dmahipegcin_ != POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dmahipegcin_);
    }
    if (modleahleaf_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getModleahleaf());
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
    if (!(obj instanceof POGOProtos.Rpc.MNDHOCGACPN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MNDHOCGACPN other = (POGOProtos.Rpc.MNDHOCGACPN) obj;

    if (dmahipegcin_ != other.dmahipegcin_) return false;
    if (hasModleahleaf() != other.hasModleahleaf()) return false;
    if (hasModleahleaf()) {
      if (!getModleahleaf()
          .equals(other.getModleahleaf())) return false;
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
    if (hasModleahleaf()) {
      hash = (37 * hash) + MODLEAHLEAF_FIELD_NUMBER;
      hash = (53 * hash) + getModleahleaf().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MNDHOCGACPN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MNDHOCGACPN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MNDHOCGACPN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MNDHOCGACPN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MNDHOCGACPN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MNDHOCGACPN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MNDHOCGACPN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MNDHOCGACPN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MNDHOCGACPN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MNDHOCGACPN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MNDHOCGACPN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MNDHOCGACPN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MNDHOCGACPN prototype) {
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
   * ref: MNDHOCGACPN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.MNDHOCGACPN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MNDHOCGACPN)
      POGOProtos.Rpc.MNDHOCGACPNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MNDHOCGACPN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MNDHOCGACPN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MNDHOCGACPN.class, POGOProtos.Rpc.MNDHOCGACPN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MNDHOCGACPN.newBuilder()
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

      if (modleahleafBuilder_ == null) {
        modleahleaf_ = null;
      } else {
        modleahleaf_ = null;
        modleahleafBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MNDHOCGACPN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MNDHOCGACPN getDefaultInstanceForType() {
      return POGOProtos.Rpc.MNDHOCGACPN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MNDHOCGACPN build() {
      POGOProtos.Rpc.MNDHOCGACPN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MNDHOCGACPN buildPartial() {
      POGOProtos.Rpc.MNDHOCGACPN result = new POGOProtos.Rpc.MNDHOCGACPN(this);
      result.dmahipegcin_ = dmahipegcin_;
      if (modleahleafBuilder_ == null) {
        result.modleahleaf_ = modleahleaf_;
      } else {
        result.modleahleaf_ = modleahleafBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.MNDHOCGACPN) {
        return mergeFrom((POGOProtos.Rpc.MNDHOCGACPN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MNDHOCGACPN other) {
      if (other == POGOProtos.Rpc.MNDHOCGACPN.getDefaultInstance()) return this;
      if (other.dmahipegcin_ != 0) {
        setDmahipegcinValue(other.getDmahipegcinValue());
      }
      if (other.hasModleahleaf()) {
        mergeModleahleaf(other.getModleahleaf());
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
      POGOProtos.Rpc.MNDHOCGACPN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MNDHOCGACPN) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA dmahipegcin = 1;</code>
     * @return The enum numeric value on the wire for dmahipegcin.
     */
    @java.lang.Override public int getDmahipegcinValue() {
      return dmahipegcin_;
    }
    /**
     * <code>.POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA dmahipegcin = 1;</code>
     * @param value The enum numeric value on the wire for dmahipegcin to set.
     * @return This builder for chaining.
     */
    public Builder setDmahipegcinValue(int value) {
      
      dmahipegcin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA dmahipegcin = 1;</code>
     * @return The dmahipegcin.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA getDmahipegcin() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA result = POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA.valueOf(dmahipegcin_);
      return result == null ? POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA dmahipegcin = 1;</code>
     * @param value The dmahipegcin to set.
     * @return This builder for chaining.
     */
    public Builder setDmahipegcin(POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dmahipegcin_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MNDHOCGACPN.OGGMFGFFOMA dmahipegcin = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDmahipegcin() {
      
      dmahipegcin_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.COOOEKOJFAO modleahleaf_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.COOOEKOJFAO, POGOProtos.Rpc.COOOEKOJFAO.Builder, POGOProtos.Rpc.COOOEKOJFAOOrBuilder> modleahleafBuilder_;
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     * @return Whether the modleahleaf field is set.
     */
    public boolean hasModleahleaf() {
      return modleahleafBuilder_ != null || modleahleaf_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     * @return The modleahleaf.
     */
    public POGOProtos.Rpc.COOOEKOJFAO getModleahleaf() {
      if (modleahleafBuilder_ == null) {
        return modleahleaf_ == null ? POGOProtos.Rpc.COOOEKOJFAO.getDefaultInstance() : modleahleaf_;
      } else {
        return modleahleafBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    public Builder setModleahleaf(POGOProtos.Rpc.COOOEKOJFAO value) {
      if (modleahleafBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modleahleaf_ = value;
        onChanged();
      } else {
        modleahleafBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    public Builder setModleahleaf(
        POGOProtos.Rpc.COOOEKOJFAO.Builder builderForValue) {
      if (modleahleafBuilder_ == null) {
        modleahleaf_ = builderForValue.build();
        onChanged();
      } else {
        modleahleafBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    public Builder mergeModleahleaf(POGOProtos.Rpc.COOOEKOJFAO value) {
      if (modleahleafBuilder_ == null) {
        if (modleahleaf_ != null) {
          modleahleaf_ =
            POGOProtos.Rpc.COOOEKOJFAO.newBuilder(modleahleaf_).mergeFrom(value).buildPartial();
        } else {
          modleahleaf_ = value;
        }
        onChanged();
      } else {
        modleahleafBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    public Builder clearModleahleaf() {
      if (modleahleafBuilder_ == null) {
        modleahleaf_ = null;
        onChanged();
      } else {
        modleahleaf_ = null;
        modleahleafBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    public POGOProtos.Rpc.COOOEKOJFAO.Builder getModleahleafBuilder() {
      
      onChanged();
      return getModleahleafFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    public POGOProtos.Rpc.COOOEKOJFAOOrBuilder getModleahleafOrBuilder() {
      if (modleahleafBuilder_ != null) {
        return modleahleafBuilder_.getMessageOrBuilder();
      } else {
        return modleahleaf_ == null ?
            POGOProtos.Rpc.COOOEKOJFAO.getDefaultInstance() : modleahleaf_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.COOOEKOJFAO modleahleaf = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.COOOEKOJFAO, POGOProtos.Rpc.COOOEKOJFAO.Builder, POGOProtos.Rpc.COOOEKOJFAOOrBuilder> 
        getModleahleafFieldBuilder() {
      if (modleahleafBuilder_ == null) {
        modleahleafBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.COOOEKOJFAO, POGOProtos.Rpc.COOOEKOJFAO.Builder, POGOProtos.Rpc.COOOEKOJFAOOrBuilder>(
                getModleahleaf(),
                getParentForChildren(),
                isClean());
        modleahleaf_ = null;
      }
      return modleahleafBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MNDHOCGACPN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MNDHOCGACPN)
  private static final POGOProtos.Rpc.MNDHOCGACPN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MNDHOCGACPN();
  }

  public static POGOProtos.Rpc.MNDHOCGACPN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MNDHOCGACPN>
      PARSER = new com.google.protobuf.AbstractParser<MNDHOCGACPN>() {
    @java.lang.Override
    public MNDHOCGACPN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MNDHOCGACPN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MNDHOCGACPN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MNDHOCGACPN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MNDHOCGACPN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

