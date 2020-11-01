// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PCBHECHFEKN}
 */
public  final class PCBHECHFEKN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PCBHECHFEKN)
    PCBHECHFEKNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PCBHECHFEKN.newBuilder() to construct.
  private PCBHECHFEKN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PCBHECHFEKN() {
    jbflkcdndlp_ = 0;
    lecljfleiah_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PCBHECHFEKN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PCBHECHFEKN(
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

            jbflkcdndlp_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            lecljfleiah_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PCBHECHFEKN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PCBHECHFEKN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PCBHECHFEKN.class, POGOProtos.Rpc.PCBHECHFEKN.Builder.class);
  }

  /**
   * <pre>
   * ref: PCBHECHFEKN/GBBHMOPPPLH/GMFFHDDKKBK
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK}
   */
  public enum GMFFHDDKKBK
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
    public static GMFFHDDKKBK valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GMFFHDDKKBK forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GMFFHDDKKBK>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GMFFHDDKKBK> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GMFFHDDKKBK>() {
            public GMFFHDDKKBK findValueByNumber(int number) {
              return GMFFHDDKKBK.forNumber(number);
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
      return POGOProtos.Rpc.PCBHECHFEKN.getDescriptor().getEnumTypes().get(0);
    }

    private static final GMFFHDDKKBK[] VALUES = values();

    public static GMFFHDDKKBK valueOf(
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

    private GMFFHDDKKBK(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK)
  }

  public static final int JBFLKCDNDLP_FIELD_NUMBER = 1;
  private int jbflkcdndlp_;
  /**
   * <code>.POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK jbflkcdndlp = 1;</code>
   * @return The enum numeric value on the wire for jbflkcdndlp.
   */
  public int getJbflkcdndlpValue() {
    return jbflkcdndlp_;
  }
  /**
   * <code>.POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK jbflkcdndlp = 1;</code>
   * @return The jbflkcdndlp.
   */
  public POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK getJbflkcdndlp() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK result = POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK.valueOf(jbflkcdndlp_);
    return result == null ? POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK.UNRECOGNIZED : result;
  }

  public static final int LECLJFLEIAH_FIELD_NUMBER = 2;
  private volatile java.lang.Object lecljfleiah_;
  /**
   * <code>string lecljfleiah = 2;</code>
   * @return The lecljfleiah.
   */
  public java.lang.String getLecljfleiah() {
    java.lang.Object ref = lecljfleiah_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lecljfleiah_ = s;
      return s;
    }
  }
  /**
   * <code>string lecljfleiah = 2;</code>
   * @return The bytes for lecljfleiah.
   */
  public com.google.protobuf.ByteString
      getLecljfleiahBytes() {
    java.lang.Object ref = lecljfleiah_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lecljfleiah_ = b;
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
    if (jbflkcdndlp_ != POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK.UNSET.getNumber()) {
      output.writeEnum(1, jbflkcdndlp_);
    }
    if (!getLecljfleiahBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lecljfleiah_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jbflkcdndlp_ != POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, jbflkcdndlp_);
    }
    if (!getLecljfleiahBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lecljfleiah_);
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
    if (!(obj instanceof POGOProtos.Rpc.PCBHECHFEKN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PCBHECHFEKN other = (POGOProtos.Rpc.PCBHECHFEKN) obj;

    if (jbflkcdndlp_ != other.jbflkcdndlp_) return false;
    if (!getLecljfleiah()
        .equals(other.getLecljfleiah())) return false;
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
    hash = (37 * hash) + JBFLKCDNDLP_FIELD_NUMBER;
    hash = (53 * hash) + jbflkcdndlp_;
    hash = (37 * hash) + LECLJFLEIAH_FIELD_NUMBER;
    hash = (53 * hash) + getLecljfleiah().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PCBHECHFEKN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PCBHECHFEKN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PCBHECHFEKN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PCBHECHFEKN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PCBHECHFEKN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PCBHECHFEKN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PCBHECHFEKN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PCBHECHFEKN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PCBHECHFEKN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PCBHECHFEKN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PCBHECHFEKN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PCBHECHFEKN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PCBHECHFEKN prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PCBHECHFEKN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PCBHECHFEKN)
      POGOProtos.Rpc.PCBHECHFEKNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PCBHECHFEKN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PCBHECHFEKN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PCBHECHFEKN.class, POGOProtos.Rpc.PCBHECHFEKN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PCBHECHFEKN.newBuilder()
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
      jbflkcdndlp_ = 0;

      lecljfleiah_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PCBHECHFEKN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PCBHECHFEKN getDefaultInstanceForType() {
      return POGOProtos.Rpc.PCBHECHFEKN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PCBHECHFEKN build() {
      POGOProtos.Rpc.PCBHECHFEKN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PCBHECHFEKN buildPartial() {
      POGOProtos.Rpc.PCBHECHFEKN result = new POGOProtos.Rpc.PCBHECHFEKN(this);
      result.jbflkcdndlp_ = jbflkcdndlp_;
      result.lecljfleiah_ = lecljfleiah_;
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
      if (other instanceof POGOProtos.Rpc.PCBHECHFEKN) {
        return mergeFrom((POGOProtos.Rpc.PCBHECHFEKN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PCBHECHFEKN other) {
      if (other == POGOProtos.Rpc.PCBHECHFEKN.getDefaultInstance()) return this;
      if (other.jbflkcdndlp_ != 0) {
        setJbflkcdndlpValue(other.getJbflkcdndlpValue());
      }
      if (!other.getLecljfleiah().isEmpty()) {
        lecljfleiah_ = other.lecljfleiah_;
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
      POGOProtos.Rpc.PCBHECHFEKN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PCBHECHFEKN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int jbflkcdndlp_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK jbflkcdndlp = 1;</code>
     * @return The enum numeric value on the wire for jbflkcdndlp.
     */
    public int getJbflkcdndlpValue() {
      return jbflkcdndlp_;
    }
    /**
     * <code>.POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK jbflkcdndlp = 1;</code>
     * @param value The enum numeric value on the wire for jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlpValue(int value) {
      jbflkcdndlp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK jbflkcdndlp = 1;</code>
     * @return The jbflkcdndlp.
     */
    public POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK getJbflkcdndlp() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK result = POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK.valueOf(jbflkcdndlp_);
      return result == null ? POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK jbflkcdndlp = 1;</code>
     * @param value The jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlp(POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jbflkcdndlp_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PCBHECHFEKN.GMFFHDDKKBK jbflkcdndlp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJbflkcdndlp() {
      
      jbflkcdndlp_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object lecljfleiah_ = "";
    /**
     * <code>string lecljfleiah = 2;</code>
     * @return The lecljfleiah.
     */
    public java.lang.String getLecljfleiah() {
      java.lang.Object ref = lecljfleiah_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lecljfleiah_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lecljfleiah = 2;</code>
     * @return The bytes for lecljfleiah.
     */
    public com.google.protobuf.ByteString
        getLecljfleiahBytes() {
      java.lang.Object ref = lecljfleiah_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lecljfleiah_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lecljfleiah = 2;</code>
     * @param value The lecljfleiah to set.
     * @return This builder for chaining.
     */
    public Builder setLecljfleiah(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lecljfleiah_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lecljfleiah = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLecljfleiah() {
      
      lecljfleiah_ = getDefaultInstance().getLecljfleiah();
      onChanged();
      return this;
    }
    /**
     * <code>string lecljfleiah = 2;</code>
     * @param value The bytes for lecljfleiah to set.
     * @return This builder for chaining.
     */
    public Builder setLecljfleiahBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lecljfleiah_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PCBHECHFEKN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PCBHECHFEKN)
  private static final POGOProtos.Rpc.PCBHECHFEKN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PCBHECHFEKN();
  }

  public static POGOProtos.Rpc.PCBHECHFEKN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PCBHECHFEKN>
      PARSER = new com.google.protobuf.AbstractParser<PCBHECHFEKN>() {
    @java.lang.Override
    public PCBHECHFEKN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PCBHECHFEKN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PCBHECHFEKN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PCBHECHFEKN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PCBHECHFEKN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

