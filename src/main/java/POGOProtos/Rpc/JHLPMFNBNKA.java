// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JHLPMFNBNKA
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JHLPMFNBNKA}
 */
public final class JHLPMFNBNKA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JHLPMFNBNKA)
    JHLPMFNBNKAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JHLPMFNBNKA.newBuilder() to construct.
  private JHLPMFNBNKA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JHLPMFNBNKA() {
    lknpioglmib_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JHLPMFNBNKA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JHLPMFNBNKA(
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

            lknpioglmib_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.PKFFFFHFEMC.Builder subBuilder = null;
            if (hgjkjcjaoeh_ != null) {
              subBuilder = hgjkjcjaoeh_.toBuilder();
            }
            hgjkjcjaoeh_ = input.readMessage(POGOProtos.Rpc.PKFFFFHFEMC.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hgjkjcjaoeh_);
              hgjkjcjaoeh_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JHLPMFNBNKA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JHLPMFNBNKA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JHLPMFNBNKA.class, POGOProtos.Rpc.JHLPMFNBNKA.Builder.class);
  }

  /**
   * <pre>
   * ref: JHLPMFNBNKA/JNIILCMLDCM/KGNFHOFPKDM
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM}
   */
  public enum KGNFHOFPKDM
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
     * <code>ERROR_COMBAT_NOT_FOUND = 2;</code>
     */
    ERROR_COMBAT_NOT_FOUND(2),
    /**
     * <code>ERROR_INVALID_COMBAT_STATE = 3;</code>
     */
    ERROR_INVALID_COMBAT_STATE(3),
    /**
     * <code>ERROR_PLAYER_NOT_IN_COMBAT = 4;</code>
     */
    ERROR_PLAYER_NOT_IN_COMBAT(4),
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
     * <code>ERROR_COMBAT_NOT_FOUND = 2;</code>
     */
    public static final int ERROR_COMBAT_NOT_FOUND_VALUE = 2;
    /**
     * <code>ERROR_INVALID_COMBAT_STATE = 3;</code>
     */
    public static final int ERROR_INVALID_COMBAT_STATE_VALUE = 3;
    /**
     * <code>ERROR_PLAYER_NOT_IN_COMBAT = 4;</code>
     */
    public static final int ERROR_PLAYER_NOT_IN_COMBAT_VALUE = 4;


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
    public static KGNFHOFPKDM valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static KGNFHOFPKDM forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_COMBAT_NOT_FOUND;
        case 3: return ERROR_INVALID_COMBAT_STATE;
        case 4: return ERROR_PLAYER_NOT_IN_COMBAT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<KGNFHOFPKDM>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        KGNFHOFPKDM> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<KGNFHOFPKDM>() {
            public KGNFHOFPKDM findValueByNumber(int number) {
              return KGNFHOFPKDM.forNumber(number);
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
      return POGOProtos.Rpc.JHLPMFNBNKA.getDescriptor().getEnumTypes().get(0);
    }

    private static final KGNFHOFPKDM[] VALUES = values();

    public static KGNFHOFPKDM valueOf(
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

    private KGNFHOFPKDM(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM)
  }

  public static final int LKNPIOGLMIB_FIELD_NUMBER = 1;
  private int lknpioglmib_;
  /**
   * <code>.POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM lknpioglmib = 1;</code>
   * @return The enum numeric value on the wire for lknpioglmib.
   */
  @java.lang.Override public int getLknpioglmibValue() {
    return lknpioglmib_;
  }
  /**
   * <code>.POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM lknpioglmib = 1;</code>
   * @return The lknpioglmib.
   */
  @java.lang.Override public POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM getLknpioglmib() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM result = POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM.valueOf(lknpioglmib_);
    return result == null ? POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM.UNRECOGNIZED : result;
  }

  public static final int HGJKJCJAOEH_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh_;
  /**
   * <code>.POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh = 2;</code>
   * @return Whether the hgjkjcjaoeh field is set.
   */
  @java.lang.Override
  public boolean hasHgjkjcjaoeh() {
    return hgjkjcjaoeh_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh = 2;</code>
   * @return The hgjkjcjaoeh.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PKFFFFHFEMC getHgjkjcjaoeh() {
    return hgjkjcjaoeh_ == null ? POGOProtos.Rpc.PKFFFFHFEMC.getDefaultInstance() : hgjkjcjaoeh_;
  }
  /**
   * <code>.POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PKFFFFHFEMCOrBuilder getHgjkjcjaoehOrBuilder() {
    return getHgjkjcjaoeh();
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
    if (lknpioglmib_ != POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM.UNSET.getNumber()) {
      output.writeEnum(1, lknpioglmib_);
    }
    if (hgjkjcjaoeh_ != null) {
      output.writeMessage(2, getHgjkjcjaoeh());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lknpioglmib_ != POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lknpioglmib_);
    }
    if (hgjkjcjaoeh_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHgjkjcjaoeh());
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
    if (!(obj instanceof POGOProtos.Rpc.JHLPMFNBNKA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JHLPMFNBNKA other = (POGOProtos.Rpc.JHLPMFNBNKA) obj;

    if (lknpioglmib_ != other.lknpioglmib_) return false;
    if (hasHgjkjcjaoeh() != other.hasHgjkjcjaoeh()) return false;
    if (hasHgjkjcjaoeh()) {
      if (!getHgjkjcjaoeh()
          .equals(other.getHgjkjcjaoeh())) return false;
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
    hash = (37 * hash) + LKNPIOGLMIB_FIELD_NUMBER;
    hash = (53 * hash) + lknpioglmib_;
    if (hasHgjkjcjaoeh()) {
      hash = (37 * hash) + HGJKJCJAOEH_FIELD_NUMBER;
      hash = (53 * hash) + getHgjkjcjaoeh().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JHLPMFNBNKA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JHLPMFNBNKA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JHLPMFNBNKA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JHLPMFNBNKA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JHLPMFNBNKA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JHLPMFNBNKA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JHLPMFNBNKA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JHLPMFNBNKA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JHLPMFNBNKA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JHLPMFNBNKA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JHLPMFNBNKA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JHLPMFNBNKA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JHLPMFNBNKA prototype) {
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
   * ref: JHLPMFNBNKA
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JHLPMFNBNKA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JHLPMFNBNKA)
      POGOProtos.Rpc.JHLPMFNBNKAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JHLPMFNBNKA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JHLPMFNBNKA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JHLPMFNBNKA.class, POGOProtos.Rpc.JHLPMFNBNKA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JHLPMFNBNKA.newBuilder()
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
      lknpioglmib_ = 0;

      if (hgjkjcjaoehBuilder_ == null) {
        hgjkjcjaoeh_ = null;
      } else {
        hgjkjcjaoeh_ = null;
        hgjkjcjaoehBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JHLPMFNBNKA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JHLPMFNBNKA getDefaultInstanceForType() {
      return POGOProtos.Rpc.JHLPMFNBNKA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JHLPMFNBNKA build() {
      POGOProtos.Rpc.JHLPMFNBNKA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JHLPMFNBNKA buildPartial() {
      POGOProtos.Rpc.JHLPMFNBNKA result = new POGOProtos.Rpc.JHLPMFNBNKA(this);
      result.lknpioglmib_ = lknpioglmib_;
      if (hgjkjcjaoehBuilder_ == null) {
        result.hgjkjcjaoeh_ = hgjkjcjaoeh_;
      } else {
        result.hgjkjcjaoeh_ = hgjkjcjaoehBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.JHLPMFNBNKA) {
        return mergeFrom((POGOProtos.Rpc.JHLPMFNBNKA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JHLPMFNBNKA other) {
      if (other == POGOProtos.Rpc.JHLPMFNBNKA.getDefaultInstance()) return this;
      if (other.lknpioglmib_ != 0) {
        setLknpioglmibValue(other.getLknpioglmibValue());
      }
      if (other.hasHgjkjcjaoeh()) {
        mergeHgjkjcjaoeh(other.getHgjkjcjaoeh());
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
      POGOProtos.Rpc.JHLPMFNBNKA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JHLPMFNBNKA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int lknpioglmib_ = 0;
    /**
     * <code>.POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM lknpioglmib = 1;</code>
     * @return The enum numeric value on the wire for lknpioglmib.
     */
    @java.lang.Override public int getLknpioglmibValue() {
      return lknpioglmib_;
    }
    /**
     * <code>.POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM lknpioglmib = 1;</code>
     * @param value The enum numeric value on the wire for lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmibValue(int value) {
      
      lknpioglmib_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM lknpioglmib = 1;</code>
     * @return The lknpioglmib.
     */
    @java.lang.Override
    public POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM getLknpioglmib() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM result = POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM.valueOf(lknpioglmib_);
      return result == null ? POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM lknpioglmib = 1;</code>
     * @param value The lknpioglmib to set.
     * @return This builder for chaining.
     */
    public Builder setLknpioglmib(POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lknpioglmib_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JHLPMFNBNKA.KGNFHOFPKDM lknpioglmib = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLknpioglmib() {
      
      lknpioglmib_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PKFFFFHFEMC, POGOProtos.Rpc.PKFFFFHFEMC.Builder, POGOProtos.Rpc.PKFFFFHFEMCOrBuilder> hgjkjcjaoehBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh = 2;</code>
     * @return Whether the hgjkjcjaoeh field is set.
     */
    public boolean hasHgjkjcjaoeh() {
      return hgjkjcjaoehBuilder_ != null || hgjkjcjaoeh_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh = 2;</code>
     * @return The hgjkjcjaoeh.
     */
    public POGOProtos.Rpc.PKFFFFHFEMC getHgjkjcjaoeh() {
      if (hgjkjcjaoehBuilder_ == null) {
        return hgjkjcjaoeh_ == null ? POGOProtos.Rpc.PKFFFFHFEMC.getDefaultInstance() : hgjkjcjaoeh_;
      } else {
        return hgjkjcjaoehBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh = 2;</code>
     */
    public Builder setHgjkjcjaoeh(POGOProtos.Rpc.PKFFFFHFEMC value) {
      if (hgjkjcjaoehBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hgjkjcjaoeh_ = value;
        onChanged();
      } else {
        hgjkjcjaoehBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh = 2;</code>
     */
    public Builder setHgjkjcjaoeh(
        POGOProtos.Rpc.PKFFFFHFEMC.Builder builderForValue) {
      if (hgjkjcjaoehBuilder_ == null) {
        hgjkjcjaoeh_ = builderForValue.build();
        onChanged();
      } else {
        hgjkjcjaoehBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh = 2;</code>
     */
    public Builder mergeHgjkjcjaoeh(POGOProtos.Rpc.PKFFFFHFEMC value) {
      if (hgjkjcjaoehBuilder_ == null) {
        if (hgjkjcjaoeh_ != null) {
          hgjkjcjaoeh_ =
            POGOProtos.Rpc.PKFFFFHFEMC.newBuilder(hgjkjcjaoeh_).mergeFrom(value).buildPartial();
        } else {
          hgjkjcjaoeh_ = value;
        }
        onChanged();
      } else {
        hgjkjcjaoehBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh = 2;</code>
     */
    public Builder clearHgjkjcjaoeh() {
      if (hgjkjcjaoehBuilder_ == null) {
        hgjkjcjaoeh_ = null;
        onChanged();
      } else {
        hgjkjcjaoeh_ = null;
        hgjkjcjaoehBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh = 2;</code>
     */
    public POGOProtos.Rpc.PKFFFFHFEMC.Builder getHgjkjcjaoehBuilder() {
      
      onChanged();
      return getHgjkjcjaoehFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh = 2;</code>
     */
    public POGOProtos.Rpc.PKFFFFHFEMCOrBuilder getHgjkjcjaoehOrBuilder() {
      if (hgjkjcjaoehBuilder_ != null) {
        return hgjkjcjaoehBuilder_.getMessageOrBuilder();
      } else {
        return hgjkjcjaoeh_ == null ?
            POGOProtos.Rpc.PKFFFFHFEMC.getDefaultInstance() : hgjkjcjaoeh_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PKFFFFHFEMC hgjkjcjaoeh = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PKFFFFHFEMC, POGOProtos.Rpc.PKFFFFHFEMC.Builder, POGOProtos.Rpc.PKFFFFHFEMCOrBuilder> 
        getHgjkjcjaoehFieldBuilder() {
      if (hgjkjcjaoehBuilder_ == null) {
        hgjkjcjaoehBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PKFFFFHFEMC, POGOProtos.Rpc.PKFFFFHFEMC.Builder, POGOProtos.Rpc.PKFFFFHFEMCOrBuilder>(
                getHgjkjcjaoeh(),
                getParentForChildren(),
                isClean());
        hgjkjcjaoeh_ = null;
      }
      return hgjkjcjaoehBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JHLPMFNBNKA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JHLPMFNBNKA)
  private static final POGOProtos.Rpc.JHLPMFNBNKA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JHLPMFNBNKA();
  }

  public static POGOProtos.Rpc.JHLPMFNBNKA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JHLPMFNBNKA>
      PARSER = new com.google.protobuf.AbstractParser<JHLPMFNBNKA>() {
    @java.lang.Override
    public JHLPMFNBNKA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JHLPMFNBNKA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JHLPMFNBNKA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JHLPMFNBNKA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JHLPMFNBNKA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

