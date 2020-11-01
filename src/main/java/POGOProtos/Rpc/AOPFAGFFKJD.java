// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.AOPFAGFFKJD}
 */
public  final class AOPFAGFFKJD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AOPFAGFFKJD)
    AOPFAGFFKJDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AOPFAGFFKJD.newBuilder() to construct.
  private AOPFAGFFKJD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AOPFAGFFKJD() {
    oemhknkemca_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AOPFAGFFKJD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AOPFAGFFKJD(
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

            oemhknkemca_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.CMNKJHNKMCG.Builder subBuilder = null;
            if (iinjgomglji_ != null) {
              subBuilder = iinjgomglji_.toBuilder();
            }
            iinjgomglji_ = input.readMessage(POGOProtos.Rpc.CMNKJHNKMCG.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(iinjgomglji_);
              iinjgomglji_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AOPFAGFFKJD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AOPFAGFFKJD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AOPFAGFFKJD.class, POGOProtos.Rpc.AOPFAGFFKJD.Builder.class);
  }

  /**
   * <pre>
   * ref: AOPFAGFFKJD/AHPEGJEMEFM/HNAPEAMGNBE
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE}
   */
  public enum HNAPEAMGNBE
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
     * <code>ERROR_QUEST_NOT_FOUND = 2;</code>
     */
    ERROR_QUEST_NOT_FOUND(2),
    /**
     * <code>ERROR_EXCEEDED_GEOTARGETED_SUBMISSION_LIMIT = 3;</code>
     */
    ERROR_EXCEEDED_GEOTARGETED_SUBMISSION_LIMIT(3),
    /**
     * <code>ERROR_VALIDATION_FAILED = 4;</code>
     */
    ERROR_VALIDATION_FAILED(4),
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
     * <code>ERROR_QUEST_NOT_FOUND = 2;</code>
     */
    public static final int ERROR_QUEST_NOT_FOUND_VALUE = 2;
    /**
     * <code>ERROR_EXCEEDED_GEOTARGETED_SUBMISSION_LIMIT = 3;</code>
     */
    public static final int ERROR_EXCEEDED_GEOTARGETED_SUBMISSION_LIMIT_VALUE = 3;
    /**
     * <code>ERROR_VALIDATION_FAILED = 4;</code>
     */
    public static final int ERROR_VALIDATION_FAILED_VALUE = 4;


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
    public static HNAPEAMGNBE valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HNAPEAMGNBE forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_QUEST_NOT_FOUND;
        case 3: return ERROR_EXCEEDED_GEOTARGETED_SUBMISSION_LIMIT;
        case 4: return ERROR_VALIDATION_FAILED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HNAPEAMGNBE>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HNAPEAMGNBE> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HNAPEAMGNBE>() {
            public HNAPEAMGNBE findValueByNumber(int number) {
              return HNAPEAMGNBE.forNumber(number);
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
      return POGOProtos.Rpc.AOPFAGFFKJD.getDescriptor().getEnumTypes().get(0);
    }

    private static final HNAPEAMGNBE[] VALUES = values();

    public static HNAPEAMGNBE valueOf(
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

    private HNAPEAMGNBE(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE)
  }

  public static final int OEMHKNKEMCA_FIELD_NUMBER = 1;
  private int oemhknkemca_;
  /**
   * <code>.POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE oemhknkemca = 1;</code>
   * @return The enum numeric value on the wire for oemhknkemca.
   */
  public int getOemhknkemcaValue() {
    return oemhknkemca_;
  }
  /**
   * <code>.POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE oemhknkemca = 1;</code>
   * @return The oemhknkemca.
   */
  public POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE getOemhknkemca() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE result = POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE.valueOf(oemhknkemca_);
    return result == null ? POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE.UNRECOGNIZED : result;
  }

  public static final int IINJGOMGLJI_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji_;
  /**
   * <code>.POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji = 2;</code>
   * @return Whether the iinjgomglji field is set.
   */
  public boolean hasIinjgomglji() {
    return iinjgomglji_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji = 2;</code>
   * @return The iinjgomglji.
   */
  public POGOProtos.Rpc.CMNKJHNKMCG getIinjgomglji() {
    return iinjgomglji_ == null ? POGOProtos.Rpc.CMNKJHNKMCG.getDefaultInstance() : iinjgomglji_;
  }
  /**
   * <code>.POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji = 2;</code>
   */
  public POGOProtos.Rpc.CMNKJHNKMCGOrBuilder getIinjgomgljiOrBuilder() {
    return getIinjgomglji();
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
    if (oemhknkemca_ != POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE.UNSET.getNumber()) {
      output.writeEnum(1, oemhknkemca_);
    }
    if (iinjgomglji_ != null) {
      output.writeMessage(2, getIinjgomglji());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oemhknkemca_ != POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, oemhknkemca_);
    }
    if (iinjgomglji_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getIinjgomglji());
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
    if (!(obj instanceof POGOProtos.Rpc.AOPFAGFFKJD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AOPFAGFFKJD other = (POGOProtos.Rpc.AOPFAGFFKJD) obj;

    if (oemhknkemca_ != other.oemhknkemca_) return false;
    if (hasIinjgomglji() != other.hasIinjgomglji()) return false;
    if (hasIinjgomglji()) {
      if (!getIinjgomglji()
          .equals(other.getIinjgomglji())) return false;
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
    hash = (37 * hash) + OEMHKNKEMCA_FIELD_NUMBER;
    hash = (53 * hash) + oemhknkemca_;
    if (hasIinjgomglji()) {
      hash = (37 * hash) + IINJGOMGLJI_FIELD_NUMBER;
      hash = (53 * hash) + getIinjgomglji().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AOPFAGFFKJD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AOPFAGFFKJD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOPFAGFFKJD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AOPFAGFFKJD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOPFAGFFKJD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AOPFAGFFKJD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOPFAGFFKJD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AOPFAGFFKJD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOPFAGFFKJD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AOPFAGFFKJD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AOPFAGFFKJD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AOPFAGFFKJD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AOPFAGFFKJD prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.AOPFAGFFKJD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AOPFAGFFKJD)
      POGOProtos.Rpc.AOPFAGFFKJDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AOPFAGFFKJD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AOPFAGFFKJD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AOPFAGFFKJD.class, POGOProtos.Rpc.AOPFAGFFKJD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AOPFAGFFKJD.newBuilder()
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
      oemhknkemca_ = 0;

      if (iinjgomgljiBuilder_ == null) {
        iinjgomglji_ = null;
      } else {
        iinjgomglji_ = null;
        iinjgomgljiBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AOPFAGFFKJD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AOPFAGFFKJD getDefaultInstanceForType() {
      return POGOProtos.Rpc.AOPFAGFFKJD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AOPFAGFFKJD build() {
      POGOProtos.Rpc.AOPFAGFFKJD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AOPFAGFFKJD buildPartial() {
      POGOProtos.Rpc.AOPFAGFFKJD result = new POGOProtos.Rpc.AOPFAGFFKJD(this);
      result.oemhknkemca_ = oemhknkemca_;
      if (iinjgomgljiBuilder_ == null) {
        result.iinjgomglji_ = iinjgomglji_;
      } else {
        result.iinjgomglji_ = iinjgomgljiBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.AOPFAGFFKJD) {
        return mergeFrom((POGOProtos.Rpc.AOPFAGFFKJD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AOPFAGFFKJD other) {
      if (other == POGOProtos.Rpc.AOPFAGFFKJD.getDefaultInstance()) return this;
      if (other.oemhknkemca_ != 0) {
        setOemhknkemcaValue(other.getOemhknkemcaValue());
      }
      if (other.hasIinjgomglji()) {
        mergeIinjgomglji(other.getIinjgomglji());
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
      POGOProtos.Rpc.AOPFAGFFKJD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AOPFAGFFKJD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int oemhknkemca_ = 0;
    /**
     * <code>.POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE oemhknkemca = 1;</code>
     * @return The enum numeric value on the wire for oemhknkemca.
     */
    public int getOemhknkemcaValue() {
      return oemhknkemca_;
    }
    /**
     * <code>.POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE oemhknkemca = 1;</code>
     * @param value The enum numeric value on the wire for oemhknkemca to set.
     * @return This builder for chaining.
     */
    public Builder setOemhknkemcaValue(int value) {
      oemhknkemca_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE oemhknkemca = 1;</code>
     * @return The oemhknkemca.
     */
    public POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE getOemhknkemca() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE result = POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE.valueOf(oemhknkemca_);
      return result == null ? POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE oemhknkemca = 1;</code>
     * @param value The oemhknkemca to set.
     * @return This builder for chaining.
     */
    public Builder setOemhknkemca(POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      oemhknkemca_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AOPFAGFFKJD.HNAPEAMGNBE oemhknkemca = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOemhknkemca() {
      
      oemhknkemca_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CMNKJHNKMCG, POGOProtos.Rpc.CMNKJHNKMCG.Builder, POGOProtos.Rpc.CMNKJHNKMCGOrBuilder> iinjgomgljiBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji = 2;</code>
     * @return Whether the iinjgomglji field is set.
     */
    public boolean hasIinjgomglji() {
      return iinjgomgljiBuilder_ != null || iinjgomglji_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji = 2;</code>
     * @return The iinjgomglji.
     */
    public POGOProtos.Rpc.CMNKJHNKMCG getIinjgomglji() {
      if (iinjgomgljiBuilder_ == null) {
        return iinjgomglji_ == null ? POGOProtos.Rpc.CMNKJHNKMCG.getDefaultInstance() : iinjgomglji_;
      } else {
        return iinjgomgljiBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji = 2;</code>
     */
    public Builder setIinjgomglji(POGOProtos.Rpc.CMNKJHNKMCG value) {
      if (iinjgomgljiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        iinjgomglji_ = value;
        onChanged();
      } else {
        iinjgomgljiBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji = 2;</code>
     */
    public Builder setIinjgomglji(
        POGOProtos.Rpc.CMNKJHNKMCG.Builder builderForValue) {
      if (iinjgomgljiBuilder_ == null) {
        iinjgomglji_ = builderForValue.build();
        onChanged();
      } else {
        iinjgomgljiBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji = 2;</code>
     */
    public Builder mergeIinjgomglji(POGOProtos.Rpc.CMNKJHNKMCG value) {
      if (iinjgomgljiBuilder_ == null) {
        if (iinjgomglji_ != null) {
          iinjgomglji_ =
            POGOProtos.Rpc.CMNKJHNKMCG.newBuilder(iinjgomglji_).mergeFrom(value).buildPartial();
        } else {
          iinjgomglji_ = value;
        }
        onChanged();
      } else {
        iinjgomgljiBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji = 2;</code>
     */
    public Builder clearIinjgomglji() {
      if (iinjgomgljiBuilder_ == null) {
        iinjgomglji_ = null;
        onChanged();
      } else {
        iinjgomglji_ = null;
        iinjgomgljiBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji = 2;</code>
     */
    public POGOProtos.Rpc.CMNKJHNKMCG.Builder getIinjgomgljiBuilder() {
      
      onChanged();
      return getIinjgomgljiFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji = 2;</code>
     */
    public POGOProtos.Rpc.CMNKJHNKMCGOrBuilder getIinjgomgljiOrBuilder() {
      if (iinjgomgljiBuilder_ != null) {
        return iinjgomgljiBuilder_.getMessageOrBuilder();
      } else {
        return iinjgomglji_ == null ?
            POGOProtos.Rpc.CMNKJHNKMCG.getDefaultInstance() : iinjgomglji_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CMNKJHNKMCG iinjgomglji = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CMNKJHNKMCG, POGOProtos.Rpc.CMNKJHNKMCG.Builder, POGOProtos.Rpc.CMNKJHNKMCGOrBuilder> 
        getIinjgomgljiFieldBuilder() {
      if (iinjgomgljiBuilder_ == null) {
        iinjgomgljiBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CMNKJHNKMCG, POGOProtos.Rpc.CMNKJHNKMCG.Builder, POGOProtos.Rpc.CMNKJHNKMCGOrBuilder>(
                getIinjgomglji(),
                getParentForChildren(),
                isClean());
        iinjgomglji_ = null;
      }
      return iinjgomgljiBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AOPFAGFFKJD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AOPFAGFFKJD)
  private static final POGOProtos.Rpc.AOPFAGFFKJD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AOPFAGFFKJD();
  }

  public static POGOProtos.Rpc.AOPFAGFFKJD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AOPFAGFFKJD>
      PARSER = new com.google.protobuf.AbstractParser<AOPFAGFFKJD>() {
    @java.lang.Override
    public AOPFAGFFKJD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AOPFAGFFKJD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AOPFAGFFKJD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AOPFAGFFKJD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AOPFAGFFKJD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

