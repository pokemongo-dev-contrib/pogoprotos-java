// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FLGJOFKPPDE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FLGJOFKPPDE}
 */
public final class FLGJOFKPPDE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FLGJOFKPPDE)
    FLGJOFKPPDEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FLGJOFKPPDE.newBuilder() to construct.
  private FLGJOFKPPDE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FLGJOFKPPDE() {
    magjbjmclno_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FLGJOFKPPDE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FLGJOFKPPDE(
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
            POGOProtos.Rpc.GPGMKAAFMNM.Builder subBuilder = null;
            if (dcekimadjni_ != null) {
              subBuilder = dcekimadjni_.toBuilder();
            }
            dcekimadjni_ = input.readMessage(POGOProtos.Rpc.GPGMKAAFMNM.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dcekimadjni_);
              dcekimadjni_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FLGJOFKPPDE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FLGJOFKPPDE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FLGJOFKPPDE.class, POGOProtos.Rpc.FLGJOFKPPDE.Builder.class);
  }

  /**
   * <pre>
   * ref: FLGJOFKPPDE/GGCCOELIPIJ/GAKNDIOFGEN
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN}
   */
  public enum GAKNDIOFGEN
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NO_RESULT_SET = 0;</code>
     */
    NO_RESULT_SET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>FORT_ALREADY_HAS_MODIFIER = 2;</code>
     */
    FORT_ALREADY_HAS_MODIFIER(2),
    /**
     * <code>TOO_FAR_AWAY = 3;</code>
     */
    TOO_FAR_AWAY(3),
    /**
     * <code>NO_ITEM_IN_INVENTORY = 4;</code>
     */
    NO_ITEM_IN_INVENTORY(4),
    /**
     * <code>POI_INACCESSIBLE = 5;</code>
     */
    POI_INACCESSIBLE(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NO_RESULT_SET = 0;</code>
     */
    public static final int NO_RESULT_SET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>FORT_ALREADY_HAS_MODIFIER = 2;</code>
     */
    public static final int FORT_ALREADY_HAS_MODIFIER_VALUE = 2;
    /**
     * <code>TOO_FAR_AWAY = 3;</code>
     */
    public static final int TOO_FAR_AWAY_VALUE = 3;
    /**
     * <code>NO_ITEM_IN_INVENTORY = 4;</code>
     */
    public static final int NO_ITEM_IN_INVENTORY_VALUE = 4;
    /**
     * <code>POI_INACCESSIBLE = 5;</code>
     */
    public static final int POI_INACCESSIBLE_VALUE = 5;


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
    public static GAKNDIOFGEN valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GAKNDIOFGEN forNumber(int value) {
      switch (value) {
        case 0: return NO_RESULT_SET;
        case 1: return SUCCESS;
        case 2: return FORT_ALREADY_HAS_MODIFIER;
        case 3: return TOO_FAR_AWAY;
        case 4: return NO_ITEM_IN_INVENTORY;
        case 5: return POI_INACCESSIBLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GAKNDIOFGEN>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GAKNDIOFGEN> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GAKNDIOFGEN>() {
            public GAKNDIOFGEN findValueByNumber(int number) {
              return GAKNDIOFGEN.forNumber(number);
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
      return POGOProtos.Rpc.FLGJOFKPPDE.getDescriptor().getEnumTypes().get(0);
    }

    private static final GAKNDIOFGEN[] VALUES = values();

    public static GAKNDIOFGEN valueOf(
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

    private GAKNDIOFGEN(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN)
  }

  public static final int MAGJBJMCLNO_FIELD_NUMBER = 1;
  private int magjbjmclno_;
  /**
   * <code>.POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN magjbjmclno = 1;</code>
   * @return The enum numeric value on the wire for magjbjmclno.
   */
  @java.lang.Override public int getMagjbjmclnoValue() {
    return magjbjmclno_;
  }
  /**
   * <code>.POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN magjbjmclno = 1;</code>
   * @return The magjbjmclno.
   */
  @java.lang.Override public POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN getMagjbjmclno() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN result = POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN.valueOf(magjbjmclno_);
    return result == null ? POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN.UNRECOGNIZED : result;
  }

  public static final int DCEKIMADJNI_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni_;
  /**
   * <code>.POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni = 2;</code>
   * @return Whether the dcekimadjni field is set.
   */
  @java.lang.Override
  public boolean hasDcekimadjni() {
    return dcekimadjni_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni = 2;</code>
   * @return The dcekimadjni.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GPGMKAAFMNM getDcekimadjni() {
    return dcekimadjni_ == null ? POGOProtos.Rpc.GPGMKAAFMNM.getDefaultInstance() : dcekimadjni_;
  }
  /**
   * <code>.POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GPGMKAAFMNMOrBuilder getDcekimadjniOrBuilder() {
    return getDcekimadjni();
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
    if (magjbjmclno_ != POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN.NO_RESULT_SET.getNumber()) {
      output.writeEnum(1, magjbjmclno_);
    }
    if (dcekimadjni_ != null) {
      output.writeMessage(2, getDcekimadjni());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (magjbjmclno_ != POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN.NO_RESULT_SET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, magjbjmclno_);
    }
    if (dcekimadjni_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDcekimadjni());
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
    if (!(obj instanceof POGOProtos.Rpc.FLGJOFKPPDE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FLGJOFKPPDE other = (POGOProtos.Rpc.FLGJOFKPPDE) obj;

    if (magjbjmclno_ != other.magjbjmclno_) return false;
    if (hasDcekimadjni() != other.hasDcekimadjni()) return false;
    if (hasDcekimadjni()) {
      if (!getDcekimadjni()
          .equals(other.getDcekimadjni())) return false;
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
    if (hasDcekimadjni()) {
      hash = (37 * hash) + DCEKIMADJNI_FIELD_NUMBER;
      hash = (53 * hash) + getDcekimadjni().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FLGJOFKPPDE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FLGJOFKPPDE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FLGJOFKPPDE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FLGJOFKPPDE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FLGJOFKPPDE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FLGJOFKPPDE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FLGJOFKPPDE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FLGJOFKPPDE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FLGJOFKPPDE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FLGJOFKPPDE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FLGJOFKPPDE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FLGJOFKPPDE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FLGJOFKPPDE prototype) {
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
   * ref: FLGJOFKPPDE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FLGJOFKPPDE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FLGJOFKPPDE)
      POGOProtos.Rpc.FLGJOFKPPDEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FLGJOFKPPDE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FLGJOFKPPDE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FLGJOFKPPDE.class, POGOProtos.Rpc.FLGJOFKPPDE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FLGJOFKPPDE.newBuilder()
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

      if (dcekimadjniBuilder_ == null) {
        dcekimadjni_ = null;
      } else {
        dcekimadjni_ = null;
        dcekimadjniBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FLGJOFKPPDE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FLGJOFKPPDE getDefaultInstanceForType() {
      return POGOProtos.Rpc.FLGJOFKPPDE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FLGJOFKPPDE build() {
      POGOProtos.Rpc.FLGJOFKPPDE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FLGJOFKPPDE buildPartial() {
      POGOProtos.Rpc.FLGJOFKPPDE result = new POGOProtos.Rpc.FLGJOFKPPDE(this);
      result.magjbjmclno_ = magjbjmclno_;
      if (dcekimadjniBuilder_ == null) {
        result.dcekimadjni_ = dcekimadjni_;
      } else {
        result.dcekimadjni_ = dcekimadjniBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.FLGJOFKPPDE) {
        return mergeFrom((POGOProtos.Rpc.FLGJOFKPPDE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FLGJOFKPPDE other) {
      if (other == POGOProtos.Rpc.FLGJOFKPPDE.getDefaultInstance()) return this;
      if (other.magjbjmclno_ != 0) {
        setMagjbjmclnoValue(other.getMagjbjmclnoValue());
      }
      if (other.hasDcekimadjni()) {
        mergeDcekimadjni(other.getDcekimadjni());
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
      POGOProtos.Rpc.FLGJOFKPPDE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FLGJOFKPPDE) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN magjbjmclno = 1;</code>
     * @return The enum numeric value on the wire for magjbjmclno.
     */
    @java.lang.Override public int getMagjbjmclnoValue() {
      return magjbjmclno_;
    }
    /**
     * <code>.POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN magjbjmclno = 1;</code>
     * @param value The enum numeric value on the wire for magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclnoValue(int value) {
      
      magjbjmclno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN magjbjmclno = 1;</code>
     * @return The magjbjmclno.
     */
    @java.lang.Override
    public POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN getMagjbjmclno() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN result = POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN.valueOf(magjbjmclno_);
      return result == null ? POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN magjbjmclno = 1;</code>
     * @param value The magjbjmclno to set.
     * @return This builder for chaining.
     */
    public Builder setMagjbjmclno(POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      magjbjmclno_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FLGJOFKPPDE.GAKNDIOFGEN magjbjmclno = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMagjbjmclno() {
      
      magjbjmclno_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GPGMKAAFMNM, POGOProtos.Rpc.GPGMKAAFMNM.Builder, POGOProtos.Rpc.GPGMKAAFMNMOrBuilder> dcekimadjniBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni = 2;</code>
     * @return Whether the dcekimadjni field is set.
     */
    public boolean hasDcekimadjni() {
      return dcekimadjniBuilder_ != null || dcekimadjni_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni = 2;</code>
     * @return The dcekimadjni.
     */
    public POGOProtos.Rpc.GPGMKAAFMNM getDcekimadjni() {
      if (dcekimadjniBuilder_ == null) {
        return dcekimadjni_ == null ? POGOProtos.Rpc.GPGMKAAFMNM.getDefaultInstance() : dcekimadjni_;
      } else {
        return dcekimadjniBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni = 2;</code>
     */
    public Builder setDcekimadjni(POGOProtos.Rpc.GPGMKAAFMNM value) {
      if (dcekimadjniBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dcekimadjni_ = value;
        onChanged();
      } else {
        dcekimadjniBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni = 2;</code>
     */
    public Builder setDcekimadjni(
        POGOProtos.Rpc.GPGMKAAFMNM.Builder builderForValue) {
      if (dcekimadjniBuilder_ == null) {
        dcekimadjni_ = builderForValue.build();
        onChanged();
      } else {
        dcekimadjniBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni = 2;</code>
     */
    public Builder mergeDcekimadjni(POGOProtos.Rpc.GPGMKAAFMNM value) {
      if (dcekimadjniBuilder_ == null) {
        if (dcekimadjni_ != null) {
          dcekimadjni_ =
            POGOProtos.Rpc.GPGMKAAFMNM.newBuilder(dcekimadjni_).mergeFrom(value).buildPartial();
        } else {
          dcekimadjni_ = value;
        }
        onChanged();
      } else {
        dcekimadjniBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni = 2;</code>
     */
    public Builder clearDcekimadjni() {
      if (dcekimadjniBuilder_ == null) {
        dcekimadjni_ = null;
        onChanged();
      } else {
        dcekimadjni_ = null;
        dcekimadjniBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni = 2;</code>
     */
    public POGOProtos.Rpc.GPGMKAAFMNM.Builder getDcekimadjniBuilder() {
      
      onChanged();
      return getDcekimadjniFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni = 2;</code>
     */
    public POGOProtos.Rpc.GPGMKAAFMNMOrBuilder getDcekimadjniOrBuilder() {
      if (dcekimadjniBuilder_ != null) {
        return dcekimadjniBuilder_.getMessageOrBuilder();
      } else {
        return dcekimadjni_ == null ?
            POGOProtos.Rpc.GPGMKAAFMNM.getDefaultInstance() : dcekimadjni_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GPGMKAAFMNM dcekimadjni = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GPGMKAAFMNM, POGOProtos.Rpc.GPGMKAAFMNM.Builder, POGOProtos.Rpc.GPGMKAAFMNMOrBuilder> 
        getDcekimadjniFieldBuilder() {
      if (dcekimadjniBuilder_ == null) {
        dcekimadjniBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.GPGMKAAFMNM, POGOProtos.Rpc.GPGMKAAFMNM.Builder, POGOProtos.Rpc.GPGMKAAFMNMOrBuilder>(
                getDcekimadjni(),
                getParentForChildren(),
                isClean());
        dcekimadjni_ = null;
      }
      return dcekimadjniBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FLGJOFKPPDE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FLGJOFKPPDE)
  private static final POGOProtos.Rpc.FLGJOFKPPDE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FLGJOFKPPDE();
  }

  public static POGOProtos.Rpc.FLGJOFKPPDE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FLGJOFKPPDE>
      PARSER = new com.google.protobuf.AbstractParser<FLGJOFKPPDE>() {
    @java.lang.Override
    public FLGJOFKPPDE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FLGJOFKPPDE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FLGJOFKPPDE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FLGJOFKPPDE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FLGJOFKPPDE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

