// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ENIOHILBNFO}
 */
public  final class ENIOHILBNFO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ENIOHILBNFO)
    ENIOHILBNFOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ENIOHILBNFO.newBuilder() to construct.
  private ENIOHILBNFO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ENIOHILBNFO() {
    jbflkcdndlp_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ENIOHILBNFO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ENIOHILBNFO(
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
            POGOProtos.Rpc.EMNMLIPMIGK.Builder subBuilder = null;
            if (dfobjmmaoak_ != null) {
              subBuilder = dfobjmmaoak_.toBuilder();
            }
            dfobjmmaoak_ = input.readMessage(POGOProtos.Rpc.EMNMLIPMIGK.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dfobjmmaoak_);
              dfobjmmaoak_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ENIOHILBNFO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ENIOHILBNFO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ENIOHILBNFO.class, POGOProtos.Rpc.ENIOHILBNFO.Builder.class);
  }

  /**
   * <pre>
   * ref: ENIOHILBNFO/LJKGCMALOKL/IOODKMBNHJC
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC}
   */
  public enum IOODKMBNHJC
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
     * <code>ERROR_CHALLENGE_NOT_FOUND = 2;</code>
     */
    ERROR_CHALLENGE_NOT_FOUND(2),
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
     * <code>ERROR_CHALLENGE_NOT_FOUND = 2;</code>
     */
    public static final int ERROR_CHALLENGE_NOT_FOUND_VALUE = 2;


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
    public static IOODKMBNHJC valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IOODKMBNHJC forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_CHALLENGE_NOT_FOUND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IOODKMBNHJC>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IOODKMBNHJC> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IOODKMBNHJC>() {
            public IOODKMBNHJC findValueByNumber(int number) {
              return IOODKMBNHJC.forNumber(number);
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
      return POGOProtos.Rpc.ENIOHILBNFO.getDescriptor().getEnumTypes().get(0);
    }

    private static final IOODKMBNHJC[] VALUES = values();

    public static IOODKMBNHJC valueOf(
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

    private IOODKMBNHJC(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC)
  }

  public static final int JBFLKCDNDLP_FIELD_NUMBER = 1;
  private int jbflkcdndlp_;
  /**
   * <code>.POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC jbflkcdndlp = 1;</code>
   * @return The enum numeric value on the wire for jbflkcdndlp.
   */
  public int getJbflkcdndlpValue() {
    return jbflkcdndlp_;
  }
  /**
   * <code>.POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC jbflkcdndlp = 1;</code>
   * @return The jbflkcdndlp.
   */
  public POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC getJbflkcdndlp() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC result = POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC.valueOf(jbflkcdndlp_);
    return result == null ? POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC.UNRECOGNIZED : result;
  }

  public static final int DFOBJMMAOAK_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak_;
  /**
   * <code>.POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak = 2;</code>
   * @return Whether the dfobjmmaoak field is set.
   */
  public boolean hasDfobjmmaoak() {
    return dfobjmmaoak_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak = 2;</code>
   * @return The dfobjmmaoak.
   */
  public POGOProtos.Rpc.EMNMLIPMIGK getDfobjmmaoak() {
    return dfobjmmaoak_ == null ? POGOProtos.Rpc.EMNMLIPMIGK.getDefaultInstance() : dfobjmmaoak_;
  }
  /**
   * <code>.POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak = 2;</code>
   */
  public POGOProtos.Rpc.EMNMLIPMIGKOrBuilder getDfobjmmaoakOrBuilder() {
    return getDfobjmmaoak();
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
    if (jbflkcdndlp_ != POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC.UNSET.getNumber()) {
      output.writeEnum(1, jbflkcdndlp_);
    }
    if (dfobjmmaoak_ != null) {
      output.writeMessage(2, getDfobjmmaoak());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jbflkcdndlp_ != POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, jbflkcdndlp_);
    }
    if (dfobjmmaoak_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDfobjmmaoak());
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
    if (!(obj instanceof POGOProtos.Rpc.ENIOHILBNFO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ENIOHILBNFO other = (POGOProtos.Rpc.ENIOHILBNFO) obj;

    if (jbflkcdndlp_ != other.jbflkcdndlp_) return false;
    if (hasDfobjmmaoak() != other.hasDfobjmmaoak()) return false;
    if (hasDfobjmmaoak()) {
      if (!getDfobjmmaoak()
          .equals(other.getDfobjmmaoak())) return false;
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
    hash = (37 * hash) + JBFLKCDNDLP_FIELD_NUMBER;
    hash = (53 * hash) + jbflkcdndlp_;
    if (hasDfobjmmaoak()) {
      hash = (37 * hash) + DFOBJMMAOAK_FIELD_NUMBER;
      hash = (53 * hash) + getDfobjmmaoak().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ENIOHILBNFO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ENIOHILBNFO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ENIOHILBNFO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ENIOHILBNFO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ENIOHILBNFO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ENIOHILBNFO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ENIOHILBNFO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ENIOHILBNFO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ENIOHILBNFO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ENIOHILBNFO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ENIOHILBNFO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ENIOHILBNFO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ENIOHILBNFO prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ENIOHILBNFO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ENIOHILBNFO)
      POGOProtos.Rpc.ENIOHILBNFOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ENIOHILBNFO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ENIOHILBNFO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ENIOHILBNFO.class, POGOProtos.Rpc.ENIOHILBNFO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ENIOHILBNFO.newBuilder()
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

      if (dfobjmmaoakBuilder_ == null) {
        dfobjmmaoak_ = null;
      } else {
        dfobjmmaoak_ = null;
        dfobjmmaoakBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ENIOHILBNFO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ENIOHILBNFO getDefaultInstanceForType() {
      return POGOProtos.Rpc.ENIOHILBNFO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ENIOHILBNFO build() {
      POGOProtos.Rpc.ENIOHILBNFO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ENIOHILBNFO buildPartial() {
      POGOProtos.Rpc.ENIOHILBNFO result = new POGOProtos.Rpc.ENIOHILBNFO(this);
      result.jbflkcdndlp_ = jbflkcdndlp_;
      if (dfobjmmaoakBuilder_ == null) {
        result.dfobjmmaoak_ = dfobjmmaoak_;
      } else {
        result.dfobjmmaoak_ = dfobjmmaoakBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.ENIOHILBNFO) {
        return mergeFrom((POGOProtos.Rpc.ENIOHILBNFO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ENIOHILBNFO other) {
      if (other == POGOProtos.Rpc.ENIOHILBNFO.getDefaultInstance()) return this;
      if (other.jbflkcdndlp_ != 0) {
        setJbflkcdndlpValue(other.getJbflkcdndlpValue());
      }
      if (other.hasDfobjmmaoak()) {
        mergeDfobjmmaoak(other.getDfobjmmaoak());
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
      POGOProtos.Rpc.ENIOHILBNFO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ENIOHILBNFO) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC jbflkcdndlp = 1;</code>
     * @return The enum numeric value on the wire for jbflkcdndlp.
     */
    public int getJbflkcdndlpValue() {
      return jbflkcdndlp_;
    }
    /**
     * <code>.POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC jbflkcdndlp = 1;</code>
     * @param value The enum numeric value on the wire for jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlpValue(int value) {
      jbflkcdndlp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC jbflkcdndlp = 1;</code>
     * @return The jbflkcdndlp.
     */
    public POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC getJbflkcdndlp() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC result = POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC.valueOf(jbflkcdndlp_);
      return result == null ? POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC jbflkcdndlp = 1;</code>
     * @param value The jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlp(POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jbflkcdndlp_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ENIOHILBNFO.IOODKMBNHJC jbflkcdndlp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJbflkcdndlp() {
      
      jbflkcdndlp_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.EMNMLIPMIGK, POGOProtos.Rpc.EMNMLIPMIGK.Builder, POGOProtos.Rpc.EMNMLIPMIGKOrBuilder> dfobjmmaoakBuilder_;
    /**
     * <code>.POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak = 2;</code>
     * @return Whether the dfobjmmaoak field is set.
     */
    public boolean hasDfobjmmaoak() {
      return dfobjmmaoakBuilder_ != null || dfobjmmaoak_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak = 2;</code>
     * @return The dfobjmmaoak.
     */
    public POGOProtos.Rpc.EMNMLIPMIGK getDfobjmmaoak() {
      if (dfobjmmaoakBuilder_ == null) {
        return dfobjmmaoak_ == null ? POGOProtos.Rpc.EMNMLIPMIGK.getDefaultInstance() : dfobjmmaoak_;
      } else {
        return dfobjmmaoakBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak = 2;</code>
     */
    public Builder setDfobjmmaoak(POGOProtos.Rpc.EMNMLIPMIGK value) {
      if (dfobjmmaoakBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dfobjmmaoak_ = value;
        onChanged();
      } else {
        dfobjmmaoakBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak = 2;</code>
     */
    public Builder setDfobjmmaoak(
        POGOProtos.Rpc.EMNMLIPMIGK.Builder builderForValue) {
      if (dfobjmmaoakBuilder_ == null) {
        dfobjmmaoak_ = builderForValue.build();
        onChanged();
      } else {
        dfobjmmaoakBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak = 2;</code>
     */
    public Builder mergeDfobjmmaoak(POGOProtos.Rpc.EMNMLIPMIGK value) {
      if (dfobjmmaoakBuilder_ == null) {
        if (dfobjmmaoak_ != null) {
          dfobjmmaoak_ =
            POGOProtos.Rpc.EMNMLIPMIGK.newBuilder(dfobjmmaoak_).mergeFrom(value).buildPartial();
        } else {
          dfobjmmaoak_ = value;
        }
        onChanged();
      } else {
        dfobjmmaoakBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak = 2;</code>
     */
    public Builder clearDfobjmmaoak() {
      if (dfobjmmaoakBuilder_ == null) {
        dfobjmmaoak_ = null;
        onChanged();
      } else {
        dfobjmmaoak_ = null;
        dfobjmmaoakBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak = 2;</code>
     */
    public POGOProtos.Rpc.EMNMLIPMIGK.Builder getDfobjmmaoakBuilder() {
      
      onChanged();
      return getDfobjmmaoakFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak = 2;</code>
     */
    public POGOProtos.Rpc.EMNMLIPMIGKOrBuilder getDfobjmmaoakOrBuilder() {
      if (dfobjmmaoakBuilder_ != null) {
        return dfobjmmaoakBuilder_.getMessageOrBuilder();
      } else {
        return dfobjmmaoak_ == null ?
            POGOProtos.Rpc.EMNMLIPMIGK.getDefaultInstance() : dfobjmmaoak_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.EMNMLIPMIGK dfobjmmaoak = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.EMNMLIPMIGK, POGOProtos.Rpc.EMNMLIPMIGK.Builder, POGOProtos.Rpc.EMNMLIPMIGKOrBuilder> 
        getDfobjmmaoakFieldBuilder() {
      if (dfobjmmaoakBuilder_ == null) {
        dfobjmmaoakBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.EMNMLIPMIGK, POGOProtos.Rpc.EMNMLIPMIGK.Builder, POGOProtos.Rpc.EMNMLIPMIGKOrBuilder>(
                getDfobjmmaoak(),
                getParentForChildren(),
                isClean());
        dfobjmmaoak_ = null;
      }
      return dfobjmmaoakBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ENIOHILBNFO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ENIOHILBNFO)
  private static final POGOProtos.Rpc.ENIOHILBNFO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ENIOHILBNFO();
  }

  public static POGOProtos.Rpc.ENIOHILBNFO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ENIOHILBNFO>
      PARSER = new com.google.protobuf.AbstractParser<ENIOHILBNFO>() {
    @java.lang.Override
    public ENIOHILBNFO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ENIOHILBNFO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ENIOHILBNFO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ENIOHILBNFO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ENIOHILBNFO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

