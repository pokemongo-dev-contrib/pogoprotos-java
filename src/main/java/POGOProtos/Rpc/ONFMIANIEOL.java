// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ONFMIANIEOL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ONFMIANIEOL}
 */
public final class ONFMIANIEOL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ONFMIANIEOL)
    ONFMIANIEOLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ONFMIANIEOL.newBuilder() to construct.
  private ONFMIANIEOL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ONFMIANIEOL() {
    lcajjpmoafe_ = 0;
    gndakjmhegl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ONFMIANIEOL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ONFMIANIEOL(
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
            java.lang.String s = input.readStringRequireUtf8();

            gndakjmhegl_ = s;
            break;
          }
          case 26: {
            POGOProtos.Rpc.HLGFDIMFNJI.Builder subBuilder = null;
            if (jelghdhedjb_ != null) {
              subBuilder = jelghdhedjb_.toBuilder();
            }
            jelghdhedjb_ = input.readMessage(POGOProtos.Rpc.HLGFDIMFNJI.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jelghdhedjb_);
              jelghdhedjb_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONFMIANIEOL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONFMIANIEOL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ONFMIANIEOL.class, POGOProtos.Rpc.ONFMIANIEOL.Builder.class);
  }

  /**
   * <pre>
   * ref: ONFMIANIEOL/AGKNGFNBGGO/PHGEKAELKOB
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB}
   */
  public enum PHGEKAELKOB
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
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
    public static PHGEKAELKOB valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PHGEKAELKOB forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PHGEKAELKOB>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PHGEKAELKOB> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PHGEKAELKOB>() {
            public PHGEKAELKOB findValueByNumber(int number) {
              return PHGEKAELKOB.forNumber(number);
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
      return POGOProtos.Rpc.ONFMIANIEOL.getDescriptor().getEnumTypes().get(0);
    }

    private static final PHGEKAELKOB[] VALUES = values();

    public static PHGEKAELKOB valueOf(
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

    private PHGEKAELKOB(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB)
  }

  public static final int LCAJJPMOAFE_FIELD_NUMBER = 1;
  private int lcajjpmoafe_;
  /**
   * <code>.POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB lcajjpmoafe = 1;</code>
   * @return The enum numeric value on the wire for lcajjpmoafe.
   */
  @java.lang.Override public int getLcajjpmoafeValue() {
    return lcajjpmoafe_;
  }
  /**
   * <code>.POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB lcajjpmoafe = 1;</code>
   * @return The lcajjpmoafe.
   */
  @java.lang.Override public POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB getLcajjpmoafe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB result = POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB.valueOf(lcajjpmoafe_);
    return result == null ? POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB.UNRECOGNIZED : result;
  }

  public static final int GNDAKJMHEGL_FIELD_NUMBER = 2;
  private volatile java.lang.Object gndakjmhegl_;
  /**
   * <code>string gndakjmhegl = 2;</code>
   * @return The gndakjmhegl.
   */
  @java.lang.Override
  public java.lang.String getGndakjmhegl() {
    java.lang.Object ref = gndakjmhegl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gndakjmhegl_ = s;
      return s;
    }
  }
  /**
   * <code>string gndakjmhegl = 2;</code>
   * @return The bytes for gndakjmhegl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGndakjmheglBytes() {
    java.lang.Object ref = gndakjmhegl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gndakjmhegl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JELGHDHEDJB_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb_;
  /**
   * <code>.POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb = 3;</code>
   * @return Whether the jelghdhedjb field is set.
   */
  @java.lang.Override
  public boolean hasJelghdhedjb() {
    return jelghdhedjb_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb = 3;</code>
   * @return The jelghdhedjb.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HLGFDIMFNJI getJelghdhedjb() {
    return jelghdhedjb_ == null ? POGOProtos.Rpc.HLGFDIMFNJI.getDefaultInstance() : jelghdhedjb_;
  }
  /**
   * <code>.POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.HLGFDIMFNJIOrBuilder getJelghdhedjbOrBuilder() {
    return getJelghdhedjb();
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
    if (lcajjpmoafe_ != POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB.UNSET.getNumber()) {
      output.writeEnum(1, lcajjpmoafe_);
    }
    if (!getGndakjmheglBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gndakjmhegl_);
    }
    if (jelghdhedjb_ != null) {
      output.writeMessage(3, getJelghdhedjb());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lcajjpmoafe_ != POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lcajjpmoafe_);
    }
    if (!getGndakjmheglBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gndakjmhegl_);
    }
    if (jelghdhedjb_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getJelghdhedjb());
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
    if (!(obj instanceof POGOProtos.Rpc.ONFMIANIEOL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ONFMIANIEOL other = (POGOProtos.Rpc.ONFMIANIEOL) obj;

    if (lcajjpmoafe_ != other.lcajjpmoafe_) return false;
    if (!getGndakjmhegl()
        .equals(other.getGndakjmhegl())) return false;
    if (hasJelghdhedjb() != other.hasJelghdhedjb()) return false;
    if (hasJelghdhedjb()) {
      if (!getJelghdhedjb()
          .equals(other.getJelghdhedjb())) return false;
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
    hash = (37 * hash) + GNDAKJMHEGL_FIELD_NUMBER;
    hash = (53 * hash) + getGndakjmhegl().hashCode();
    if (hasJelghdhedjb()) {
      hash = (37 * hash) + JELGHDHEDJB_FIELD_NUMBER;
      hash = (53 * hash) + getJelghdhedjb().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ONFMIANIEOL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ONFMIANIEOL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONFMIANIEOL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ONFMIANIEOL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONFMIANIEOL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ONFMIANIEOL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONFMIANIEOL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ONFMIANIEOL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONFMIANIEOL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ONFMIANIEOL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ONFMIANIEOL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ONFMIANIEOL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ONFMIANIEOL prototype) {
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
   * ref: ONFMIANIEOL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ONFMIANIEOL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ONFMIANIEOL)
      POGOProtos.Rpc.ONFMIANIEOLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONFMIANIEOL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONFMIANIEOL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ONFMIANIEOL.class, POGOProtos.Rpc.ONFMIANIEOL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ONFMIANIEOL.newBuilder()
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

      gndakjmhegl_ = "";

      if (jelghdhedjbBuilder_ == null) {
        jelghdhedjb_ = null;
      } else {
        jelghdhedjb_ = null;
        jelghdhedjbBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ONFMIANIEOL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ONFMIANIEOL getDefaultInstanceForType() {
      return POGOProtos.Rpc.ONFMIANIEOL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ONFMIANIEOL build() {
      POGOProtos.Rpc.ONFMIANIEOL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ONFMIANIEOL buildPartial() {
      POGOProtos.Rpc.ONFMIANIEOL result = new POGOProtos.Rpc.ONFMIANIEOL(this);
      result.lcajjpmoafe_ = lcajjpmoafe_;
      result.gndakjmhegl_ = gndakjmhegl_;
      if (jelghdhedjbBuilder_ == null) {
        result.jelghdhedjb_ = jelghdhedjb_;
      } else {
        result.jelghdhedjb_ = jelghdhedjbBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.ONFMIANIEOL) {
        return mergeFrom((POGOProtos.Rpc.ONFMIANIEOL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ONFMIANIEOL other) {
      if (other == POGOProtos.Rpc.ONFMIANIEOL.getDefaultInstance()) return this;
      if (other.lcajjpmoafe_ != 0) {
        setLcajjpmoafeValue(other.getLcajjpmoafeValue());
      }
      if (!other.getGndakjmhegl().isEmpty()) {
        gndakjmhegl_ = other.gndakjmhegl_;
        onChanged();
      }
      if (other.hasJelghdhedjb()) {
        mergeJelghdhedjb(other.getJelghdhedjb());
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
      POGOProtos.Rpc.ONFMIANIEOL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ONFMIANIEOL) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB lcajjpmoafe = 1;</code>
     * @return The enum numeric value on the wire for lcajjpmoafe.
     */
    @java.lang.Override public int getLcajjpmoafeValue() {
      return lcajjpmoafe_;
    }
    /**
     * <code>.POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB lcajjpmoafe = 1;</code>
     * @param value The enum numeric value on the wire for lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafeValue(int value) {
      
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB lcajjpmoafe = 1;</code>
     * @return The lcajjpmoafe.
     */
    @java.lang.Override
    public POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB getLcajjpmoafe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB result = POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB.valueOf(lcajjpmoafe_);
      return result == null ? POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB lcajjpmoafe = 1;</code>
     * @param value The lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafe(POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lcajjpmoafe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ONFMIANIEOL.PHGEKAELKOB lcajjpmoafe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcajjpmoafe() {
      
      lcajjpmoafe_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object gndakjmhegl_ = "";
    /**
     * <code>string gndakjmhegl = 2;</code>
     * @return The gndakjmhegl.
     */
    public java.lang.String getGndakjmhegl() {
      java.lang.Object ref = gndakjmhegl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gndakjmhegl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gndakjmhegl = 2;</code>
     * @return The bytes for gndakjmhegl.
     */
    public com.google.protobuf.ByteString
        getGndakjmheglBytes() {
      java.lang.Object ref = gndakjmhegl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gndakjmhegl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gndakjmhegl = 2;</code>
     * @param value The gndakjmhegl to set.
     * @return This builder for chaining.
     */
    public Builder setGndakjmhegl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gndakjmhegl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gndakjmhegl = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGndakjmhegl() {
      
      gndakjmhegl_ = getDefaultInstance().getGndakjmhegl();
      onChanged();
      return this;
    }
    /**
     * <code>string gndakjmhegl = 2;</code>
     * @param value The bytes for gndakjmhegl to set.
     * @return This builder for chaining.
     */
    public Builder setGndakjmheglBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gndakjmhegl_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HLGFDIMFNJI, POGOProtos.Rpc.HLGFDIMFNJI.Builder, POGOProtos.Rpc.HLGFDIMFNJIOrBuilder> jelghdhedjbBuilder_;
    /**
     * <code>.POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb = 3;</code>
     * @return Whether the jelghdhedjb field is set.
     */
    public boolean hasJelghdhedjb() {
      return jelghdhedjbBuilder_ != null || jelghdhedjb_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb = 3;</code>
     * @return The jelghdhedjb.
     */
    public POGOProtos.Rpc.HLGFDIMFNJI getJelghdhedjb() {
      if (jelghdhedjbBuilder_ == null) {
        return jelghdhedjb_ == null ? POGOProtos.Rpc.HLGFDIMFNJI.getDefaultInstance() : jelghdhedjb_;
      } else {
        return jelghdhedjbBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb = 3;</code>
     */
    public Builder setJelghdhedjb(POGOProtos.Rpc.HLGFDIMFNJI value) {
      if (jelghdhedjbBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jelghdhedjb_ = value;
        onChanged();
      } else {
        jelghdhedjbBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb = 3;</code>
     */
    public Builder setJelghdhedjb(
        POGOProtos.Rpc.HLGFDIMFNJI.Builder builderForValue) {
      if (jelghdhedjbBuilder_ == null) {
        jelghdhedjb_ = builderForValue.build();
        onChanged();
      } else {
        jelghdhedjbBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb = 3;</code>
     */
    public Builder mergeJelghdhedjb(POGOProtos.Rpc.HLGFDIMFNJI value) {
      if (jelghdhedjbBuilder_ == null) {
        if (jelghdhedjb_ != null) {
          jelghdhedjb_ =
            POGOProtos.Rpc.HLGFDIMFNJI.newBuilder(jelghdhedjb_).mergeFrom(value).buildPartial();
        } else {
          jelghdhedjb_ = value;
        }
        onChanged();
      } else {
        jelghdhedjbBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb = 3;</code>
     */
    public Builder clearJelghdhedjb() {
      if (jelghdhedjbBuilder_ == null) {
        jelghdhedjb_ = null;
        onChanged();
      } else {
        jelghdhedjb_ = null;
        jelghdhedjbBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb = 3;</code>
     */
    public POGOProtos.Rpc.HLGFDIMFNJI.Builder getJelghdhedjbBuilder() {
      
      onChanged();
      return getJelghdhedjbFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb = 3;</code>
     */
    public POGOProtos.Rpc.HLGFDIMFNJIOrBuilder getJelghdhedjbOrBuilder() {
      if (jelghdhedjbBuilder_ != null) {
        return jelghdhedjbBuilder_.getMessageOrBuilder();
      } else {
        return jelghdhedjb_ == null ?
            POGOProtos.Rpc.HLGFDIMFNJI.getDefaultInstance() : jelghdhedjb_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HLGFDIMFNJI jelghdhedjb = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HLGFDIMFNJI, POGOProtos.Rpc.HLGFDIMFNJI.Builder, POGOProtos.Rpc.HLGFDIMFNJIOrBuilder> 
        getJelghdhedjbFieldBuilder() {
      if (jelghdhedjbBuilder_ == null) {
        jelghdhedjbBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.HLGFDIMFNJI, POGOProtos.Rpc.HLGFDIMFNJI.Builder, POGOProtos.Rpc.HLGFDIMFNJIOrBuilder>(
                getJelghdhedjb(),
                getParentForChildren(),
                isClean());
        jelghdhedjb_ = null;
      }
      return jelghdhedjbBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ONFMIANIEOL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ONFMIANIEOL)
  private static final POGOProtos.Rpc.ONFMIANIEOL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ONFMIANIEOL();
  }

  public static POGOProtos.Rpc.ONFMIANIEOL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ONFMIANIEOL>
      PARSER = new com.google.protobuf.AbstractParser<ONFMIANIEOL>() {
    @java.lang.Override
    public ONFMIANIEOL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ONFMIANIEOL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ONFMIANIEOL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ONFMIANIEOL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ONFMIANIEOL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

