// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PCJEFFCJEDF
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PCJEFFCJEDF}
 */
public final class PCJEFFCJEDF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PCJEFFCJEDF)
    PCJEFFCJEDFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PCJEFFCJEDF.newBuilder() to construct.
  private PCJEFFCJEDF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PCJEFFCJEDF() {
    lcajjpmoafe_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PCJEFFCJEDF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PCJEFFCJEDF(
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
          case 16: {

            cmimogeadod_ = input.readBool();
            break;
          }
          case 26: {
            POGOProtos.Rpc.AJNNNHJCCGD.Builder subBuilder = null;
            if (kahmdgeclnc_ != null) {
              subBuilder = kahmdgeclnc_.toBuilder();
            }
            kahmdgeclnc_ = input.readMessage(POGOProtos.Rpc.AJNNNHJCCGD.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(kahmdgeclnc_);
              kahmdgeclnc_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PCJEFFCJEDF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PCJEFFCJEDF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PCJEFFCJEDF.class, POGOProtos.Rpc.PCJEFFCJEDF.Builder.class);
  }

  /**
   * <pre>
   * ref: PCJEFFCJEDF/HCNGBDBBPKG/ENFEEPADCDG
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG}
   */
  public enum ENFEEPADCDG
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
    public static ENFEEPADCDG valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ENFEEPADCDG forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ENFEEPADCDG>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ENFEEPADCDG> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ENFEEPADCDG>() {
            public ENFEEPADCDG findValueByNumber(int number) {
              return ENFEEPADCDG.forNumber(number);
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
      return POGOProtos.Rpc.PCJEFFCJEDF.getDescriptor().getEnumTypes().get(0);
    }

    private static final ENFEEPADCDG[] VALUES = values();

    public static ENFEEPADCDG valueOf(
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

    private ENFEEPADCDG(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG)
  }

  public static final int LCAJJPMOAFE_FIELD_NUMBER = 1;
  private int lcajjpmoafe_;
  /**
   * <code>.POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG lcajjpmoafe = 1;</code>
   * @return The enum numeric value on the wire for lcajjpmoafe.
   */
  @java.lang.Override public int getLcajjpmoafeValue() {
    return lcajjpmoafe_;
  }
  /**
   * <code>.POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG lcajjpmoafe = 1;</code>
   * @return The lcajjpmoafe.
   */
  @java.lang.Override public POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG getLcajjpmoafe() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG result = POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG.valueOf(lcajjpmoafe_);
    return result == null ? POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG.UNRECOGNIZED : result;
  }

  public static final int CMIMOGEADOD_FIELD_NUMBER = 2;
  private boolean cmimogeadod_;
  /**
   * <code>bool cmimogeadod = 2;</code>
   * @return The cmimogeadod.
   */
  @java.lang.Override
  public boolean getCmimogeadod() {
    return cmimogeadod_;
  }

  public static final int KAHMDGECLNC_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc_;
  /**
   * <code>.POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc = 3;</code>
   * @return Whether the kahmdgeclnc field is set.
   */
  @java.lang.Override
  public boolean hasKahmdgeclnc() {
    return kahmdgeclnc_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc = 3;</code>
   * @return The kahmdgeclnc.
   */
  @java.lang.Override
  public POGOProtos.Rpc.AJNNNHJCCGD getKahmdgeclnc() {
    return kahmdgeclnc_ == null ? POGOProtos.Rpc.AJNNNHJCCGD.getDefaultInstance() : kahmdgeclnc_;
  }
  /**
   * <code>.POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.AJNNNHJCCGDOrBuilder getKahmdgeclncOrBuilder() {
    return getKahmdgeclnc();
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
    if (lcajjpmoafe_ != POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG.UNSET.getNumber()) {
      output.writeEnum(1, lcajjpmoafe_);
    }
    if (cmimogeadod_ != false) {
      output.writeBool(2, cmimogeadod_);
    }
    if (kahmdgeclnc_ != null) {
      output.writeMessage(3, getKahmdgeclnc());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lcajjpmoafe_ != POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lcajjpmoafe_);
    }
    if (cmimogeadod_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, cmimogeadod_);
    }
    if (kahmdgeclnc_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getKahmdgeclnc());
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
    if (!(obj instanceof POGOProtos.Rpc.PCJEFFCJEDF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PCJEFFCJEDF other = (POGOProtos.Rpc.PCJEFFCJEDF) obj;

    if (lcajjpmoafe_ != other.lcajjpmoafe_) return false;
    if (getCmimogeadod()
        != other.getCmimogeadod()) return false;
    if (hasKahmdgeclnc() != other.hasKahmdgeclnc()) return false;
    if (hasKahmdgeclnc()) {
      if (!getKahmdgeclnc()
          .equals(other.getKahmdgeclnc())) return false;
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
    hash = (37 * hash) + CMIMOGEADOD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCmimogeadod());
    if (hasKahmdgeclnc()) {
      hash = (37 * hash) + KAHMDGECLNC_FIELD_NUMBER;
      hash = (53 * hash) + getKahmdgeclnc().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PCJEFFCJEDF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PCJEFFCJEDF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PCJEFFCJEDF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PCJEFFCJEDF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PCJEFFCJEDF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PCJEFFCJEDF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PCJEFFCJEDF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PCJEFFCJEDF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PCJEFFCJEDF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PCJEFFCJEDF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PCJEFFCJEDF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PCJEFFCJEDF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PCJEFFCJEDF prototype) {
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
   * ref: PCJEFFCJEDF
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PCJEFFCJEDF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PCJEFFCJEDF)
      POGOProtos.Rpc.PCJEFFCJEDFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PCJEFFCJEDF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PCJEFFCJEDF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PCJEFFCJEDF.class, POGOProtos.Rpc.PCJEFFCJEDF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PCJEFFCJEDF.newBuilder()
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

      cmimogeadod_ = false;

      if (kahmdgeclncBuilder_ == null) {
        kahmdgeclnc_ = null;
      } else {
        kahmdgeclnc_ = null;
        kahmdgeclncBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PCJEFFCJEDF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PCJEFFCJEDF getDefaultInstanceForType() {
      return POGOProtos.Rpc.PCJEFFCJEDF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PCJEFFCJEDF build() {
      POGOProtos.Rpc.PCJEFFCJEDF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PCJEFFCJEDF buildPartial() {
      POGOProtos.Rpc.PCJEFFCJEDF result = new POGOProtos.Rpc.PCJEFFCJEDF(this);
      result.lcajjpmoafe_ = lcajjpmoafe_;
      result.cmimogeadod_ = cmimogeadod_;
      if (kahmdgeclncBuilder_ == null) {
        result.kahmdgeclnc_ = kahmdgeclnc_;
      } else {
        result.kahmdgeclnc_ = kahmdgeclncBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PCJEFFCJEDF) {
        return mergeFrom((POGOProtos.Rpc.PCJEFFCJEDF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PCJEFFCJEDF other) {
      if (other == POGOProtos.Rpc.PCJEFFCJEDF.getDefaultInstance()) return this;
      if (other.lcajjpmoafe_ != 0) {
        setLcajjpmoafeValue(other.getLcajjpmoafeValue());
      }
      if (other.getCmimogeadod() != false) {
        setCmimogeadod(other.getCmimogeadod());
      }
      if (other.hasKahmdgeclnc()) {
        mergeKahmdgeclnc(other.getKahmdgeclnc());
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
      POGOProtos.Rpc.PCJEFFCJEDF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PCJEFFCJEDF) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG lcajjpmoafe = 1;</code>
     * @return The enum numeric value on the wire for lcajjpmoafe.
     */
    @java.lang.Override public int getLcajjpmoafeValue() {
      return lcajjpmoafe_;
    }
    /**
     * <code>.POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG lcajjpmoafe = 1;</code>
     * @param value The enum numeric value on the wire for lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafeValue(int value) {
      
      lcajjpmoafe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG lcajjpmoafe = 1;</code>
     * @return The lcajjpmoafe.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG getLcajjpmoafe() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG result = POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG.valueOf(lcajjpmoafe_);
      return result == null ? POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG lcajjpmoafe = 1;</code>
     * @param value The lcajjpmoafe to set.
     * @return This builder for chaining.
     */
    public Builder setLcajjpmoafe(POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lcajjpmoafe_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PCJEFFCJEDF.ENFEEPADCDG lcajjpmoafe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcajjpmoafe() {
      
      lcajjpmoafe_ = 0;
      onChanged();
      return this;
    }

    private boolean cmimogeadod_ ;
    /**
     * <code>bool cmimogeadod = 2;</code>
     * @return The cmimogeadod.
     */
    @java.lang.Override
    public boolean getCmimogeadod() {
      return cmimogeadod_;
    }
    /**
     * <code>bool cmimogeadod = 2;</code>
     * @param value The cmimogeadod to set.
     * @return This builder for chaining.
     */
    public Builder setCmimogeadod(boolean value) {
      
      cmimogeadod_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool cmimogeadod = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCmimogeadod() {
      
      cmimogeadod_ = false;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AJNNNHJCCGD, POGOProtos.Rpc.AJNNNHJCCGD.Builder, POGOProtos.Rpc.AJNNNHJCCGDOrBuilder> kahmdgeclncBuilder_;
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc = 3;</code>
     * @return Whether the kahmdgeclnc field is set.
     */
    public boolean hasKahmdgeclnc() {
      return kahmdgeclncBuilder_ != null || kahmdgeclnc_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc = 3;</code>
     * @return The kahmdgeclnc.
     */
    public POGOProtos.Rpc.AJNNNHJCCGD getKahmdgeclnc() {
      if (kahmdgeclncBuilder_ == null) {
        return kahmdgeclnc_ == null ? POGOProtos.Rpc.AJNNNHJCCGD.getDefaultInstance() : kahmdgeclnc_;
      } else {
        return kahmdgeclncBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc = 3;</code>
     */
    public Builder setKahmdgeclnc(POGOProtos.Rpc.AJNNNHJCCGD value) {
      if (kahmdgeclncBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kahmdgeclnc_ = value;
        onChanged();
      } else {
        kahmdgeclncBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc = 3;</code>
     */
    public Builder setKahmdgeclnc(
        POGOProtos.Rpc.AJNNNHJCCGD.Builder builderForValue) {
      if (kahmdgeclncBuilder_ == null) {
        kahmdgeclnc_ = builderForValue.build();
        onChanged();
      } else {
        kahmdgeclncBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc = 3;</code>
     */
    public Builder mergeKahmdgeclnc(POGOProtos.Rpc.AJNNNHJCCGD value) {
      if (kahmdgeclncBuilder_ == null) {
        if (kahmdgeclnc_ != null) {
          kahmdgeclnc_ =
            POGOProtos.Rpc.AJNNNHJCCGD.newBuilder(kahmdgeclnc_).mergeFrom(value).buildPartial();
        } else {
          kahmdgeclnc_ = value;
        }
        onChanged();
      } else {
        kahmdgeclncBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc = 3;</code>
     */
    public Builder clearKahmdgeclnc() {
      if (kahmdgeclncBuilder_ == null) {
        kahmdgeclnc_ = null;
        onChanged();
      } else {
        kahmdgeclnc_ = null;
        kahmdgeclncBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc = 3;</code>
     */
    public POGOProtos.Rpc.AJNNNHJCCGD.Builder getKahmdgeclncBuilder() {
      
      onChanged();
      return getKahmdgeclncFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc = 3;</code>
     */
    public POGOProtos.Rpc.AJNNNHJCCGDOrBuilder getKahmdgeclncOrBuilder() {
      if (kahmdgeclncBuilder_ != null) {
        return kahmdgeclncBuilder_.getMessageOrBuilder();
      } else {
        return kahmdgeclnc_ == null ?
            POGOProtos.Rpc.AJNNNHJCCGD.getDefaultInstance() : kahmdgeclnc_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AJNNNHJCCGD kahmdgeclnc = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AJNNNHJCCGD, POGOProtos.Rpc.AJNNNHJCCGD.Builder, POGOProtos.Rpc.AJNNNHJCCGDOrBuilder> 
        getKahmdgeclncFieldBuilder() {
      if (kahmdgeclncBuilder_ == null) {
        kahmdgeclncBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.AJNNNHJCCGD, POGOProtos.Rpc.AJNNNHJCCGD.Builder, POGOProtos.Rpc.AJNNNHJCCGDOrBuilder>(
                getKahmdgeclnc(),
                getParentForChildren(),
                isClean());
        kahmdgeclnc_ = null;
      }
      return kahmdgeclncBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PCJEFFCJEDF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PCJEFFCJEDF)
  private static final POGOProtos.Rpc.PCJEFFCJEDF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PCJEFFCJEDF();
  }

  public static POGOProtos.Rpc.PCJEFFCJEDF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PCJEFFCJEDF>
      PARSER = new com.google.protobuf.AbstractParser<PCJEFFCJEDF>() {
    @java.lang.Override
    public PCJEFFCJEDF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PCJEFFCJEDF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PCJEFFCJEDF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PCJEFFCJEDF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PCJEFFCJEDF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

