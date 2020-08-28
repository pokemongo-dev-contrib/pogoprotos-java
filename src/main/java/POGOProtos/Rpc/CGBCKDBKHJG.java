// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CGBCKDBKHJG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CGBCKDBKHJG}
 */
public final class CGBCKDBKHJG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CGBCKDBKHJG)
    CGBCKDBKHJGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CGBCKDBKHJG.newBuilder() to construct.
  private CGBCKDBKHJG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CGBCKDBKHJG() {
    magjbjmclno_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CGBCKDBKHJG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CGBCKDBKHJG(
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

            magjbjmclno_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.HNHADHEEAIF.Builder subBuilder = null;
            if (eclnnjodfia_ != null) {
              subBuilder = eclnnjodfia_.toBuilder();
            }
            eclnnjodfia_ = input.readMessage(POGOProtos.Rpc.HNHADHEEAIF.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(eclnnjodfia_);
              eclnnjodfia_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGBCKDBKHJG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGBCKDBKHJG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CGBCKDBKHJG.class, POGOProtos.Rpc.CGBCKDBKHJG.Builder.class);
  }

  /**
   * <pre>
   * ref: CGBCKDBKHJG/GONFBFODKDO/CIFBGOMFJFG
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG}
   */
  public enum CIFBGOMFJFG
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>INCENSE_ALREADY_ACTIVE = 2;</code>
     */
    INCENSE_ALREADY_ACTIVE(2),
    /**
     * <code>NONE_IN_INVENTORY = 3;</code>
     */
    NONE_IN_INVENTORY(3),
    /**
     * <code>LOCATION_UNSET = 4;</code>
     */
    LOCATION_UNSET(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>INCENSE_ALREADY_ACTIVE = 2;</code>
     */
    public static final int INCENSE_ALREADY_ACTIVE_VALUE = 2;
    /**
     * <code>NONE_IN_INVENTORY = 3;</code>
     */
    public static final int NONE_IN_INVENTORY_VALUE = 3;
    /**
     * <code>LOCATION_UNSET = 4;</code>
     */
    public static final int LOCATION_UNSET_VALUE = 4;


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
    public static CIFBGOMFJFG valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CIFBGOMFJFG forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return SUCCESS;
        case 2: return INCENSE_ALREADY_ACTIVE;
        case 3: return NONE_IN_INVENTORY;
        case 4: return LOCATION_UNSET;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CIFBGOMFJFG>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CIFBGOMFJFG> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CIFBGOMFJFG>() {
            public CIFBGOMFJFG findValueByNumber(int number) {
              return CIFBGOMFJFG.forNumber(number);
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
      return POGOProtos.Rpc.CGBCKDBKHJG.getDescriptor().getEnumTypes().get(0);
    }

    private static final CIFBGOMFJFG[] VALUES = values();

    public static CIFBGOMFJFG valueOf(
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

    private CIFBGOMFJFG(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG)
  }

  public static final int MAGJBJMCLNO_FIELD_NUMBER = 1;
  private int magjbjmclno_;
  /**
   * <code>.POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG magjbjmclno = 1;</code>
   * @return The enum numeric value on the wire for magjbjmclno.
   */
  @java.lang.Override public int getMagjbjmclnoValue() {
    return magjbjmclno_;
  }
  /**
   * <code>.POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG magjbjmclno = 1;</code>
   * @return The magjbjmclno.
   */
  @java.lang.Override public POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG getMagjbjmclno() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG result = POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG.valueOf(magjbjmclno_);
    return result == null ? POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG.UNRECOGNIZED : result;
  }

  public static final int ECLNNJODFIA_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia_;
  /**
   * <code>.POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia = 2;</code>
   * @return Whether the eclnnjodfia field is set.
   */
  @java.lang.Override
  public boolean hasEclnnjodfia() {
    return eclnnjodfia_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia = 2;</code>
   * @return The eclnnjodfia.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HNHADHEEAIF getEclnnjodfia() {
    return eclnnjodfia_ == null ? POGOProtos.Rpc.HNHADHEEAIF.getDefaultInstance() : eclnnjodfia_;
  }
  /**
   * <code>.POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.HNHADHEEAIFOrBuilder getEclnnjodfiaOrBuilder() {
    return getEclnnjodfia();
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
    if (magjbjmclno_ != POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG.UNKNOWN.getNumber()) {
      output.writeEnum(1, magjbjmclno_);
    }
    if (eclnnjodfia_ != null) {
      output.writeMessage(2, getEclnnjodfia());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (magjbjmclno_ != POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, magjbjmclno_);
    }
    if (eclnnjodfia_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEclnnjodfia());
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
    if (!(obj instanceof POGOProtos.Rpc.CGBCKDBKHJG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CGBCKDBKHJG other = (POGOProtos.Rpc.CGBCKDBKHJG) obj;

    if (magjbjmclno_ != other.magjbjmclno_) return false;
    if (hasEclnnjodfia() != other.hasEclnnjodfia()) return false;
    if (hasEclnnjodfia()) {
      if (!getEclnnjodfia()
          .equals(other.getEclnnjodfia())) return false;
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
    hash = (37 * hash) + MAGJBJMCLNO_FIELD_NUMBER;
    hash = (53 * hash) + magjbjmclno_;
    if (hasEclnnjodfia()) {
      hash = (37 * hash) + ECLNNJODFIA_FIELD_NUMBER;
      hash = (53 * hash) + getEclnnjodfia().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CGBCKDBKHJG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CGBCKDBKHJG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGBCKDBKHJG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CGBCKDBKHJG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGBCKDBKHJG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CGBCKDBKHJG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGBCKDBKHJG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CGBCKDBKHJG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGBCKDBKHJG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CGBCKDBKHJG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CGBCKDBKHJG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CGBCKDBKHJG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CGBCKDBKHJG prototype) {
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
   * ref: CGBCKDBKHJG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CGBCKDBKHJG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CGBCKDBKHJG)
      POGOProtos.Rpc.CGBCKDBKHJGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGBCKDBKHJG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGBCKDBKHJG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CGBCKDBKHJG.class, POGOProtos.Rpc.CGBCKDBKHJG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CGBCKDBKHJG.newBuilder()
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
      magjbjmclno_ = 0;

      if (eclnnjodfiaBuilder_ == null) {
        eclnnjodfia_ = null;
      } else {
        eclnnjodfia_ = null;
        eclnnjodfiaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CGBCKDBKHJG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CGBCKDBKHJG getDefaultInstanceForType() {
      return POGOProtos.Rpc.CGBCKDBKHJG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CGBCKDBKHJG build() {
      POGOProtos.Rpc.CGBCKDBKHJG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CGBCKDBKHJG buildPartial() {
      POGOProtos.Rpc.CGBCKDBKHJG result = new POGOProtos.Rpc.CGBCKDBKHJG(this);
      result.magjbjmclno_ = magjbjmclno_;
      if (eclnnjodfiaBuilder_ == null) {
        result.eclnnjodfia_ = eclnnjodfia_;
      } else {
        result.eclnnjodfia_ = eclnnjodfiaBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.CGBCKDBKHJG) {
        return mergeFrom((POGOProtos.Rpc.CGBCKDBKHJG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CGBCKDBKHJG other) {
      if (other == POGOProtos.Rpc.CGBCKDBKHJG.getDefaultInstance()) return this;
      if (other.magjbjmclno_ != 0) {
        setMagjbjmclnoValue(other.getMagjbjmclnoValue());
      }
      if (other.hasEclnnjodfia()) {
        mergeEclnnjodfia(other.getEclnnjodfia());
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
      POGOProtos.Rpc.CGBCKDBKHJG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CGBCKDBKHJG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int magjbjmclno_ = 0;
    /**
     * <code>.POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG magjbjmclno = 1;</code>
     * @return The enum numeric value on the wire for magjbjmclno.
     */
    @java.lang.Override public int getMagjbjmclnoValue() {
      return magjbjmclno_;
    }
    /**
     * <code>.POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG magjbjmclno = 1;</code>
     * @param value The enum numeric value on the wire for magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclnoValue(int value) {
      
      magjbjmclno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG magjbjmclno = 1;</code>
     * @return The magjbjmclno.
     */
    @java.lang.Override
    public POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG getMagjbjmclno() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG result = POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG.valueOf(magjbjmclno_);
      return result == null ? POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG magjbjmclno = 1;</code>
     * @param value The magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclno(POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      magjbjmclno_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CGBCKDBKHJG.CIFBGOMFJFG magjbjmclno = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMagjbjmclno() {
      
      magjbjmclno_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HNHADHEEAIF, POGOProtos.Rpc.HNHADHEEAIF.Builder, POGOProtos.Rpc.HNHADHEEAIFOrBuilder> eclnnjodfiaBuilder_;
    /**
     * <code>.POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia = 2;</code>
     * @return Whether the eclnnjodfia field is set.
     */
    public boolean hasEclnnjodfia() {
      return eclnnjodfiaBuilder_ != null || eclnnjodfia_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia = 2;</code>
     * @return The eclnnjodfia.
     */
    public POGOProtos.Rpc.HNHADHEEAIF getEclnnjodfia() {
      if (eclnnjodfiaBuilder_ == null) {
        return eclnnjodfia_ == null ? POGOProtos.Rpc.HNHADHEEAIF.getDefaultInstance() : eclnnjodfia_;
      } else {
        return eclnnjodfiaBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia = 2;</code>
     */
    public Builder setEclnnjodfia(POGOProtos.Rpc.HNHADHEEAIF value) {
      if (eclnnjodfiaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        eclnnjodfia_ = value;
        onChanged();
      } else {
        eclnnjodfiaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia = 2;</code>
     */
    public Builder setEclnnjodfia(
        POGOProtos.Rpc.HNHADHEEAIF.Builder builderForValue) {
      if (eclnnjodfiaBuilder_ == null) {
        eclnnjodfia_ = builderForValue.build();
        onChanged();
      } else {
        eclnnjodfiaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia = 2;</code>
     */
    public Builder mergeEclnnjodfia(POGOProtos.Rpc.HNHADHEEAIF value) {
      if (eclnnjodfiaBuilder_ == null) {
        if (eclnnjodfia_ != null) {
          eclnnjodfia_ =
            POGOProtos.Rpc.HNHADHEEAIF.newBuilder(eclnnjodfia_).mergeFrom(value).buildPartial();
        } else {
          eclnnjodfia_ = value;
        }
        onChanged();
      } else {
        eclnnjodfiaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia = 2;</code>
     */
    public Builder clearEclnnjodfia() {
      if (eclnnjodfiaBuilder_ == null) {
        eclnnjodfia_ = null;
        onChanged();
      } else {
        eclnnjodfia_ = null;
        eclnnjodfiaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia = 2;</code>
     */
    public POGOProtos.Rpc.HNHADHEEAIF.Builder getEclnnjodfiaBuilder() {
      
      onChanged();
      return getEclnnjodfiaFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia = 2;</code>
     */
    public POGOProtos.Rpc.HNHADHEEAIFOrBuilder getEclnnjodfiaOrBuilder() {
      if (eclnnjodfiaBuilder_ != null) {
        return eclnnjodfiaBuilder_.getMessageOrBuilder();
      } else {
        return eclnnjodfia_ == null ?
            POGOProtos.Rpc.HNHADHEEAIF.getDefaultInstance() : eclnnjodfia_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HNHADHEEAIF eclnnjodfia = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HNHADHEEAIF, POGOProtos.Rpc.HNHADHEEAIF.Builder, POGOProtos.Rpc.HNHADHEEAIFOrBuilder> 
        getEclnnjodfiaFieldBuilder() {
      if (eclnnjodfiaBuilder_ == null) {
        eclnnjodfiaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.HNHADHEEAIF, POGOProtos.Rpc.HNHADHEEAIF.Builder, POGOProtos.Rpc.HNHADHEEAIFOrBuilder>(
                getEclnnjodfia(),
                getParentForChildren(),
                isClean());
        eclnnjodfia_ = null;
      }
      return eclnnjodfiaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CGBCKDBKHJG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CGBCKDBKHJG)
  private static final POGOProtos.Rpc.CGBCKDBKHJG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CGBCKDBKHJG();
  }

  public static POGOProtos.Rpc.CGBCKDBKHJG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CGBCKDBKHJG>
      PARSER = new com.google.protobuf.AbstractParser<CGBCKDBKHJG>() {
    @java.lang.Override
    public CGBCKDBKHJG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CGBCKDBKHJG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CGBCKDBKHJG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CGBCKDBKHJG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CGBCKDBKHJG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

