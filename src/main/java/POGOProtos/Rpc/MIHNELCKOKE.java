// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MIHNELCKOKE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.MIHNELCKOKE}
 */
public final class MIHNELCKOKE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MIHNELCKOKE)
    MIHNELCKOKEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MIHNELCKOKE.newBuilder() to construct.
  private MIHNELCKOKE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MIHNELCKOKE() {
    dmahipegcin_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MIHNELCKOKE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MIHNELCKOKE(
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
          case 16: {

            moddeimeipg_ = input.readInt32();
            break;
          }
          case 24: {

            geebalpjllp_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MIHNELCKOKE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MIHNELCKOKE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MIHNELCKOKE.class, POGOProtos.Rpc.MIHNELCKOKE.Builder.class);
  }

  /**
   * <pre>
   * ref: MIHNELCKOKE/INFAFPJGOFN/KKHPBAFDBDG
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG}
   */
  public enum KKHPBAFDBDG
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
     * <code>POKEMON_DEPLOYED = 2;</code>
     */
    POKEMON_DEPLOYED(2),
    /**
     * <code>FAILED = 3;</code>
     */
    FAILED(3),
    /**
     * <code>ERROR_POKEMON_IS_EGG = 4;</code>
     */
    ERROR_POKEMON_IS_EGG(4),
    /**
     * <code>ERROR_POKEMON_IS_BUDDY = 5;</code>
     */
    ERROR_POKEMON_IS_BUDDY(5),
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
     * <code>POKEMON_DEPLOYED = 2;</code>
     */
    public static final int POKEMON_DEPLOYED_VALUE = 2;
    /**
     * <code>FAILED = 3;</code>
     */
    public static final int FAILED_VALUE = 3;
    /**
     * <code>ERROR_POKEMON_IS_EGG = 4;</code>
     */
    public static final int ERROR_POKEMON_IS_EGG_VALUE = 4;
    /**
     * <code>ERROR_POKEMON_IS_BUDDY = 5;</code>
     */
    public static final int ERROR_POKEMON_IS_BUDDY_VALUE = 5;


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
    public static KKHPBAFDBDG valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static KKHPBAFDBDG forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return POKEMON_DEPLOYED;
        case 3: return FAILED;
        case 4: return ERROR_POKEMON_IS_EGG;
        case 5: return ERROR_POKEMON_IS_BUDDY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<KKHPBAFDBDG>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        KKHPBAFDBDG> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<KKHPBAFDBDG>() {
            public KKHPBAFDBDG findValueByNumber(int number) {
              return KKHPBAFDBDG.forNumber(number);
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
      return POGOProtos.Rpc.MIHNELCKOKE.getDescriptor().getEnumTypes().get(0);
    }

    private static final KKHPBAFDBDG[] VALUES = values();

    public static KKHPBAFDBDG valueOf(
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

    private KKHPBAFDBDG(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG)
  }

  public static final int DMAHIPEGCIN_FIELD_NUMBER = 1;
  private int dmahipegcin_;
  /**
   * <code>.POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG dmahipegcin = 1;</code>
   * @return The enum numeric value on the wire for dmahipegcin.
   */
  @java.lang.Override public int getDmahipegcinValue() {
    return dmahipegcin_;
  }
  /**
   * <code>.POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG dmahipegcin = 1;</code>
   * @return The dmahipegcin.
   */
  @java.lang.Override public POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG getDmahipegcin() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG result = POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG.valueOf(dmahipegcin_);
    return result == null ? POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG.UNRECOGNIZED : result;
  }

  public static final int MODDEIMEIPG_FIELD_NUMBER = 2;
  private int moddeimeipg_;
  /**
   * <code>int32 moddeimeipg = 2;</code>
   * @return The moddeimeipg.
   */
  @java.lang.Override
  public int getModdeimeipg() {
    return moddeimeipg_;
  }

  public static final int GEEBALPJLLP_FIELD_NUMBER = 3;
  private int geebalpjllp_;
  /**
   * <code>int32 geebalpjllp = 3;</code>
   * @return The geebalpjllp.
   */
  @java.lang.Override
  public int getGeebalpjllp() {
    return geebalpjllp_;
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
    if (dmahipegcin_ != POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG.UNSET.getNumber()) {
      output.writeEnum(1, dmahipegcin_);
    }
    if (moddeimeipg_ != 0) {
      output.writeInt32(2, moddeimeipg_);
    }
    if (geebalpjllp_ != 0) {
      output.writeInt32(3, geebalpjllp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dmahipegcin_ != POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dmahipegcin_);
    }
    if (moddeimeipg_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, moddeimeipg_);
    }
    if (geebalpjllp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, geebalpjllp_);
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
    if (!(obj instanceof POGOProtos.Rpc.MIHNELCKOKE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MIHNELCKOKE other = (POGOProtos.Rpc.MIHNELCKOKE) obj;

    if (dmahipegcin_ != other.dmahipegcin_) return false;
    if (getModdeimeipg()
        != other.getModdeimeipg()) return false;
    if (getGeebalpjllp()
        != other.getGeebalpjllp()) return false;
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
    hash = (37 * hash) + MODDEIMEIPG_FIELD_NUMBER;
    hash = (53 * hash) + getModdeimeipg();
    hash = (37 * hash) + GEEBALPJLLP_FIELD_NUMBER;
    hash = (53 * hash) + getGeebalpjllp();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MIHNELCKOKE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MIHNELCKOKE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MIHNELCKOKE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MIHNELCKOKE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MIHNELCKOKE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MIHNELCKOKE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MIHNELCKOKE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MIHNELCKOKE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MIHNELCKOKE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MIHNELCKOKE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MIHNELCKOKE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MIHNELCKOKE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MIHNELCKOKE prototype) {
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
   * ref: MIHNELCKOKE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.MIHNELCKOKE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MIHNELCKOKE)
      POGOProtos.Rpc.MIHNELCKOKEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MIHNELCKOKE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MIHNELCKOKE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MIHNELCKOKE.class, POGOProtos.Rpc.MIHNELCKOKE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MIHNELCKOKE.newBuilder()
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

      moddeimeipg_ = 0;

      geebalpjllp_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MIHNELCKOKE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MIHNELCKOKE getDefaultInstanceForType() {
      return POGOProtos.Rpc.MIHNELCKOKE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MIHNELCKOKE build() {
      POGOProtos.Rpc.MIHNELCKOKE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MIHNELCKOKE buildPartial() {
      POGOProtos.Rpc.MIHNELCKOKE result = new POGOProtos.Rpc.MIHNELCKOKE(this);
      result.dmahipegcin_ = dmahipegcin_;
      result.moddeimeipg_ = moddeimeipg_;
      result.geebalpjllp_ = geebalpjllp_;
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
      if (other instanceof POGOProtos.Rpc.MIHNELCKOKE) {
        return mergeFrom((POGOProtos.Rpc.MIHNELCKOKE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MIHNELCKOKE other) {
      if (other == POGOProtos.Rpc.MIHNELCKOKE.getDefaultInstance()) return this;
      if (other.dmahipegcin_ != 0) {
        setDmahipegcinValue(other.getDmahipegcinValue());
      }
      if (other.getModdeimeipg() != 0) {
        setModdeimeipg(other.getModdeimeipg());
      }
      if (other.getGeebalpjllp() != 0) {
        setGeebalpjllp(other.getGeebalpjllp());
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
      POGOProtos.Rpc.MIHNELCKOKE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MIHNELCKOKE) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG dmahipegcin = 1;</code>
     * @return The enum numeric value on the wire for dmahipegcin.
     */
    @java.lang.Override public int getDmahipegcinValue() {
      return dmahipegcin_;
    }
    /**
     * <code>.POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG dmahipegcin = 1;</code>
     * @param value The enum numeric value on the wire for dmahipegcin to set.
     * @return This builder for chaining.
     */
    public Builder setDmahipegcinValue(int value) {
      
      dmahipegcin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG dmahipegcin = 1;</code>
     * @return The dmahipegcin.
     */
    @java.lang.Override
    public POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG getDmahipegcin() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG result = POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG.valueOf(dmahipegcin_);
      return result == null ? POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG dmahipegcin = 1;</code>
     * @param value The dmahipegcin to set.
     * @return This builder for chaining.
     */
    public Builder setDmahipegcin(POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dmahipegcin_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MIHNELCKOKE.KKHPBAFDBDG dmahipegcin = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDmahipegcin() {
      
      dmahipegcin_ = 0;
      onChanged();
      return this;
    }

    private int moddeimeipg_ ;
    /**
     * <code>int32 moddeimeipg = 2;</code>
     * @return The moddeimeipg.
     */
    @java.lang.Override
    public int getModdeimeipg() {
      return moddeimeipg_;
    }
    /**
     * <code>int32 moddeimeipg = 2;</code>
     * @param value The moddeimeipg to set.
     * @return This builder for chaining.
     */
    public Builder setModdeimeipg(int value) {
      
      moddeimeipg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 moddeimeipg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearModdeimeipg() {
      
      moddeimeipg_ = 0;
      onChanged();
      return this;
    }

    private int geebalpjllp_ ;
    /**
     * <code>int32 geebalpjllp = 3;</code>
     * @return The geebalpjllp.
     */
    @java.lang.Override
    public int getGeebalpjllp() {
      return geebalpjllp_;
    }
    /**
     * <code>int32 geebalpjllp = 3;</code>
     * @param value The geebalpjllp to set.
     * @return This builder for chaining.
     */
    public Builder setGeebalpjllp(int value) {
      
      geebalpjllp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 geebalpjllp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGeebalpjllp() {
      
      geebalpjllp_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MIHNELCKOKE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MIHNELCKOKE)
  private static final POGOProtos.Rpc.MIHNELCKOKE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MIHNELCKOKE();
  }

  public static POGOProtos.Rpc.MIHNELCKOKE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MIHNELCKOKE>
      PARSER = new com.google.protobuf.AbstractParser<MIHNELCKOKE>() {
    @java.lang.Override
    public MIHNELCKOKE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MIHNELCKOKE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MIHNELCKOKE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MIHNELCKOKE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MIHNELCKOKE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

