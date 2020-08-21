// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: AEHOBDGIGPI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.AEHOBDGIGPI}
 */
public final class AEHOBDGIGPI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AEHOBDGIGPI)
    AEHOBDGIGPIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AEHOBDGIGPI.newBuilder() to construct.
  private AEHOBDGIGPI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AEHOBDGIGPI() {
    lcajjpmoafe_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AEHOBDGIGPI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AEHOBDGIGPI(
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
            POGOProtos.Rpc.JCHNONABFLJ.Builder subBuilder = null;
            if (djmdcafjoim_ != null) {
              subBuilder = djmdcafjoim_.toBuilder();
            }
            djmdcafjoim_ = input.readMessage(POGOProtos.Rpc.JCHNONABFLJ.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(djmdcafjoim_);
              djmdcafjoim_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AEHOBDGIGPI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AEHOBDGIGPI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AEHOBDGIGPI.class, POGOProtos.Rpc.AEHOBDGIGPI.Builder.class);
  }

  /**
   * <pre>
   * ref: AEHOBDGIGPI/DKKGBLIAEJB/DCIOMGOFGDJ
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ}
   */
  public enum DCIOMGOFGDJ
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS_ACTIVATED = 1;</code>
     */
    SUCCESS_ACTIVATED(1),
    /**
     * <code>ERROR_NO_PREMIUM_BATTLE_PASS = 2;</code>
     */
    ERROR_NO_PREMIUM_BATTLE_PASS(2),
    /**
     * <code>ERROR_VS_SEEKER_NOT_CHARGED = 3;</code>
     */
    ERROR_VS_SEEKER_NOT_CHARGED(3),
    /**
     * <code>ERROR_VS_SEEKER_ALREADY_ACTIVATED = 4;</code>
     */
    ERROR_VS_SEEKER_ALREADY_ACTIVATED(4),
    /**
     * <code>ERROR_EXCEEDED_LIMIT = 5;</code>
     */
    ERROR_EXCEEDED_LIMIT(5),
    /**
     * <code>ERROR_TEMPORARILY_UNAVAILABLE = 6;</code>
     */
    ERROR_TEMPORARILY_UNAVAILABLE(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS_ACTIVATED = 1;</code>
     */
    public static final int SUCCESS_ACTIVATED_VALUE = 1;
    /**
     * <code>ERROR_NO_PREMIUM_BATTLE_PASS = 2;</code>
     */
    public static final int ERROR_NO_PREMIUM_BATTLE_PASS_VALUE = 2;
    /**
     * <code>ERROR_VS_SEEKER_NOT_CHARGED = 3;</code>
     */
    public static final int ERROR_VS_SEEKER_NOT_CHARGED_VALUE = 3;
    /**
     * <code>ERROR_VS_SEEKER_ALREADY_ACTIVATED = 4;</code>
     */
    public static final int ERROR_VS_SEEKER_ALREADY_ACTIVATED_VALUE = 4;
    /**
     * <code>ERROR_EXCEEDED_LIMIT = 5;</code>
     */
    public static final int ERROR_EXCEEDED_LIMIT_VALUE = 5;
    /**
     * <code>ERROR_TEMPORARILY_UNAVAILABLE = 6;</code>
     */
    public static final int ERROR_TEMPORARILY_UNAVAILABLE_VALUE = 6;


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
    public static DCIOMGOFGDJ valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DCIOMGOFGDJ forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS_ACTIVATED;
        case 2: return ERROR_NO_PREMIUM_BATTLE_PASS;
        case 3: return ERROR_VS_SEEKER_NOT_CHARGED;
        case 4: return ERROR_VS_SEEKER_ALREADY_ACTIVATED;
        case 5: return ERROR_EXCEEDED_LIMIT;
        case 6: return ERROR_TEMPORARILY_UNAVAILABLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DCIOMGOFGDJ>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DCIOMGOFGDJ> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DCIOMGOFGDJ>() {
            public DCIOMGOFGDJ findValueByNumber(int number) {
              return DCIOMGOFGDJ.forNumber(number);
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
      return POGOProtos.Rpc.AEHOBDGIGPI.getDescriptor().getEnumTypes().get(0);
    }

    private static final DCIOMGOFGDJ[] VALUES = values();

    public static DCIOMGOFGDJ valueOf(
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

    private DCIOMGOFGDJ(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ)
  }

  public static final int LCAJJPMOAFE_FIELD_NUMBER = 1;
  private int lcajjpmoafe_;
  /**
   * <code>.POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ lcajjpmoafe = 1;</code>
   * @return The enum numeric value on the wire for lcajjpmoafe.
   */
  @java.lang.Override public int getLcajjpmoafeValue() {
    return lcajjpmoafe_;
  }
  /**
   * <code>.POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ lcajjpmoafe = 1;</code>
   * @return The lcajjpmoafe.
   */
  @java.lang.Override public POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ getLcajjpmoafe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ result = POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ.valueOf(lcajjpmoafe_);
    return result == null ? POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ.UNRECOGNIZED : result;
  }

  public static final int DJMDCAFJOIM_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim_;
  /**
   * <code>.POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim = 2;</code>
   * @return Whether the djmdcafjoim field is set.
   */
  @java.lang.Override
  public boolean hasDjmdcafjoim() {
    return djmdcafjoim_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim = 2;</code>
   * @return The djmdcafjoim.
   */
  @java.lang.Override
  public POGOProtos.Rpc.JCHNONABFLJ getDjmdcafjoim() {
    return djmdcafjoim_ == null ? POGOProtos.Rpc.JCHNONABFLJ.getDefaultInstance() : djmdcafjoim_;
  }
  /**
   * <code>.POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.JCHNONABFLJOrBuilder getDjmdcafjoimOrBuilder() {
    return getDjmdcafjoim();
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
    if (lcajjpmoafe_ != POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ.UNSET.getNumber()) {
      output.writeEnum(1, lcajjpmoafe_);
    }
    if (djmdcafjoim_ != null) {
      output.writeMessage(2, getDjmdcafjoim());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lcajjpmoafe_ != POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lcajjpmoafe_);
    }
    if (djmdcafjoim_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDjmdcafjoim());
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
    if (!(obj instanceof POGOProtos.Rpc.AEHOBDGIGPI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AEHOBDGIGPI other = (POGOProtos.Rpc.AEHOBDGIGPI) obj;

    if (lcajjpmoafe_ != other.lcajjpmoafe_) return false;
    if (hasDjmdcafjoim() != other.hasDjmdcafjoim()) return false;
    if (hasDjmdcafjoim()) {
      if (!getDjmdcafjoim()
          .equals(other.getDjmdcafjoim())) return false;
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
    if (hasDjmdcafjoim()) {
      hash = (37 * hash) + DJMDCAFJOIM_FIELD_NUMBER;
      hash = (53 * hash) + getDjmdcafjoim().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AEHOBDGIGPI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AEHOBDGIGPI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AEHOBDGIGPI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AEHOBDGIGPI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AEHOBDGIGPI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AEHOBDGIGPI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AEHOBDGIGPI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AEHOBDGIGPI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AEHOBDGIGPI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AEHOBDGIGPI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AEHOBDGIGPI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AEHOBDGIGPI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AEHOBDGIGPI prototype) {
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
   * ref: AEHOBDGIGPI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.AEHOBDGIGPI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AEHOBDGIGPI)
      POGOProtos.Rpc.AEHOBDGIGPIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AEHOBDGIGPI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AEHOBDGIGPI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AEHOBDGIGPI.class, POGOProtos.Rpc.AEHOBDGIGPI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AEHOBDGIGPI.newBuilder()
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

      if (djmdcafjoimBuilder_ == null) {
        djmdcafjoim_ = null;
      } else {
        djmdcafjoim_ = null;
        djmdcafjoimBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AEHOBDGIGPI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AEHOBDGIGPI getDefaultInstanceForType() {
      return POGOProtos.Rpc.AEHOBDGIGPI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AEHOBDGIGPI build() {
      POGOProtos.Rpc.AEHOBDGIGPI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AEHOBDGIGPI buildPartial() {
      POGOProtos.Rpc.AEHOBDGIGPI result = new POGOProtos.Rpc.AEHOBDGIGPI(this);
      result.lcajjpmoafe_ = lcajjpmoafe_;
      if (djmdcafjoimBuilder_ == null) {
        result.djmdcafjoim_ = djmdcafjoim_;
      } else {
        result.djmdcafjoim_ = djmdcafjoimBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.AEHOBDGIGPI) {
        return mergeFrom((POGOProtos.Rpc.AEHOBDGIGPI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AEHOBDGIGPI other) {
      if (other == POGOProtos.Rpc.AEHOBDGIGPI.getDefaultInstance()) return this;
      if (other.lcajjpmoafe_ != 0) {
        setLcajjpmoafeValue(other.getLcajjpmoafeValue());
      }
      if (other.hasDjmdcafjoim()) {
        mergeDjmdcafjoim(other.getDjmdcafjoim());
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
      POGOProtos.Rpc.AEHOBDGIGPI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AEHOBDGIGPI) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ lcajjpmoafe = 1;</code>
     * @return The enum numeric value on the wire for lcajjpmoafe.
     */
    @java.lang.Override public int getLcajjpmoafeValue() {
      return lcajjpmoafe_;
    }
    /**
     * <code>.POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ lcajjpmoafe = 1;</code>
     * @param value The enum numeric value on the wire for lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafeValue(int value) {
      
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ lcajjpmoafe = 1;</code>
     * @return The lcajjpmoafe.
     */
    @java.lang.Override
    public POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ getLcajjpmoafe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ result = POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ.valueOf(lcajjpmoafe_);
      return result == null ? POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ lcajjpmoafe = 1;</code>
     * @param value The lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafe(POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lcajjpmoafe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AEHOBDGIGPI.DCIOMGOFGDJ lcajjpmoafe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcajjpmoafe() {
      
      lcajjpmoafe_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.JCHNONABFLJ, POGOProtos.Rpc.JCHNONABFLJ.Builder, POGOProtos.Rpc.JCHNONABFLJOrBuilder> djmdcafjoimBuilder_;
    /**
     * <code>.POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim = 2;</code>
     * @return Whether the djmdcafjoim field is set.
     */
    public boolean hasDjmdcafjoim() {
      return djmdcafjoimBuilder_ != null || djmdcafjoim_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim = 2;</code>
     * @return The djmdcafjoim.
     */
    public POGOProtos.Rpc.JCHNONABFLJ getDjmdcafjoim() {
      if (djmdcafjoimBuilder_ == null) {
        return djmdcafjoim_ == null ? POGOProtos.Rpc.JCHNONABFLJ.getDefaultInstance() : djmdcafjoim_;
      } else {
        return djmdcafjoimBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim = 2;</code>
     */
    public Builder setDjmdcafjoim(POGOProtos.Rpc.JCHNONABFLJ value) {
      if (djmdcafjoimBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        djmdcafjoim_ = value;
        onChanged();
      } else {
        djmdcafjoimBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim = 2;</code>
     */
    public Builder setDjmdcafjoim(
        POGOProtos.Rpc.JCHNONABFLJ.Builder builderForValue) {
      if (djmdcafjoimBuilder_ == null) {
        djmdcafjoim_ = builderForValue.build();
        onChanged();
      } else {
        djmdcafjoimBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim = 2;</code>
     */
    public Builder mergeDjmdcafjoim(POGOProtos.Rpc.JCHNONABFLJ value) {
      if (djmdcafjoimBuilder_ == null) {
        if (djmdcafjoim_ != null) {
          djmdcafjoim_ =
            POGOProtos.Rpc.JCHNONABFLJ.newBuilder(djmdcafjoim_).mergeFrom(value).buildPartial();
        } else {
          djmdcafjoim_ = value;
        }
        onChanged();
      } else {
        djmdcafjoimBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim = 2;</code>
     */
    public Builder clearDjmdcafjoim() {
      if (djmdcafjoimBuilder_ == null) {
        djmdcafjoim_ = null;
        onChanged();
      } else {
        djmdcafjoim_ = null;
        djmdcafjoimBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim = 2;</code>
     */
    public POGOProtos.Rpc.JCHNONABFLJ.Builder getDjmdcafjoimBuilder() {
      
      onChanged();
      return getDjmdcafjoimFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim = 2;</code>
     */
    public POGOProtos.Rpc.JCHNONABFLJOrBuilder getDjmdcafjoimOrBuilder() {
      if (djmdcafjoimBuilder_ != null) {
        return djmdcafjoimBuilder_.getMessageOrBuilder();
      } else {
        return djmdcafjoim_ == null ?
            POGOProtos.Rpc.JCHNONABFLJ.getDefaultInstance() : djmdcafjoim_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.JCHNONABFLJ djmdcafjoim = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.JCHNONABFLJ, POGOProtos.Rpc.JCHNONABFLJ.Builder, POGOProtos.Rpc.JCHNONABFLJOrBuilder> 
        getDjmdcafjoimFieldBuilder() {
      if (djmdcafjoimBuilder_ == null) {
        djmdcafjoimBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.JCHNONABFLJ, POGOProtos.Rpc.JCHNONABFLJ.Builder, POGOProtos.Rpc.JCHNONABFLJOrBuilder>(
                getDjmdcafjoim(),
                getParentForChildren(),
                isClean());
        djmdcafjoim_ = null;
      }
      return djmdcafjoimBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AEHOBDGIGPI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AEHOBDGIGPI)
  private static final POGOProtos.Rpc.AEHOBDGIGPI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AEHOBDGIGPI();
  }

  public static POGOProtos.Rpc.AEHOBDGIGPI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AEHOBDGIGPI>
      PARSER = new com.google.protobuf.AbstractParser<AEHOBDGIGPI>() {
    @java.lang.Override
    public AEHOBDGIGPI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AEHOBDGIGPI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AEHOBDGIGPI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AEHOBDGIGPI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AEHOBDGIGPI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

