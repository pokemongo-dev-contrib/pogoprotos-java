// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LMGICMKEKLP}
 */
public  final class LMGICMKEKLP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LMGICMKEKLP)
    LMGICMKEKLPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LMGICMKEKLP.newBuilder() to construct.
  private LMGICMKEKLP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LMGICMKEKLP() {
    jbflkcdndlp_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LMGICMKEKLP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LMGICMKEKLP(
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
            POGOProtos.Rpc.CCEINPGJEEL.Builder subBuilder = null;
            if (mibhceljhjn_ != null) {
              subBuilder = mibhceljhjn_.toBuilder();
            }
            mibhceljhjn_ = input.readMessage(POGOProtos.Rpc.CCEINPGJEEL.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(mibhceljhjn_);
              mibhceljhjn_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            jljgijmehkg_ = input.readBool();
            break;
          }
          case 34: {
            POGOProtos.Rpc.PFENIHMCEPI.Builder subBuilder = null;
            if (hehpojcahca_ != null) {
              subBuilder = hehpojcahca_.toBuilder();
            }
            hehpojcahca_ = input.readMessage(POGOProtos.Rpc.PFENIHMCEPI.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hehpojcahca_);
              hehpojcahca_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMGICMKEKLP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMGICMKEKLP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LMGICMKEKLP.class, POGOProtos.Rpc.LMGICMKEKLP.Builder.class);
  }

  /**
   * <pre>
   * ref: LMGICMKEKLP/MDMDFGIJBBI/LOJPFDEENHD
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD}
   */
  public enum LOJPFDEENHD
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS_FULLY_CHARGED = 1;</code>
     */
    SUCCESS_FULLY_CHARGED(1),
    /**
     * <code>SUCCESS_NOT_FULLY_CHARGED_YET = 2;</code>
     */
    SUCCESS_NOT_FULLY_CHARGED_YET(2),
    /**
     * <code>ERROR_VS_SEEKER_NOT_FOUND = 3;</code>
     */
    ERROR_VS_SEEKER_NOT_FOUND(3),
    /**
     * <code>ERROR_VS_SEEKER_NEVER_STARTED_CHARGING = 4;</code>
     */
    ERROR_VS_SEEKER_NEVER_STARTED_CHARGING(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS_FULLY_CHARGED = 1;</code>
     */
    public static final int SUCCESS_FULLY_CHARGED_VALUE = 1;
    /**
     * <code>SUCCESS_NOT_FULLY_CHARGED_YET = 2;</code>
     */
    public static final int SUCCESS_NOT_FULLY_CHARGED_YET_VALUE = 2;
    /**
     * <code>ERROR_VS_SEEKER_NOT_FOUND = 3;</code>
     */
    public static final int ERROR_VS_SEEKER_NOT_FOUND_VALUE = 3;
    /**
     * <code>ERROR_VS_SEEKER_NEVER_STARTED_CHARGING = 4;</code>
     */
    public static final int ERROR_VS_SEEKER_NEVER_STARTED_CHARGING_VALUE = 4;


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
    public static LOJPFDEENHD valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LOJPFDEENHD forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS_FULLY_CHARGED;
        case 2: return SUCCESS_NOT_FULLY_CHARGED_YET;
        case 3: return ERROR_VS_SEEKER_NOT_FOUND;
        case 4: return ERROR_VS_SEEKER_NEVER_STARTED_CHARGING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LOJPFDEENHD>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LOJPFDEENHD> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LOJPFDEENHD>() {
            public LOJPFDEENHD findValueByNumber(int number) {
              return LOJPFDEENHD.forNumber(number);
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
      return POGOProtos.Rpc.LMGICMKEKLP.getDescriptor().getEnumTypes().get(0);
    }

    private static final LOJPFDEENHD[] VALUES = values();

    public static LOJPFDEENHD valueOf(
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

    private LOJPFDEENHD(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD)
  }

  public static final int JBFLKCDNDLP_FIELD_NUMBER = 1;
  private int jbflkcdndlp_;
  /**
   * <code>.POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD jbflkcdndlp = 1;</code>
   * @return The enum numeric value on the wire for jbflkcdndlp.
   */
  public int getJbflkcdndlpValue() {
    return jbflkcdndlp_;
  }
  /**
   * <code>.POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD jbflkcdndlp = 1;</code>
   * @return The jbflkcdndlp.
   */
  public POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD getJbflkcdndlp() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD result = POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD.valueOf(jbflkcdndlp_);
    return result == null ? POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD.UNRECOGNIZED : result;
  }

  public static final int MIBHCELJHJN_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn_;
  /**
   * <code>.POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn = 2;</code>
   * @return Whether the mibhceljhjn field is set.
   */
  public boolean hasMibhceljhjn() {
    return mibhceljhjn_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn = 2;</code>
   * @return The mibhceljhjn.
   */
  public POGOProtos.Rpc.CCEINPGJEEL getMibhceljhjn() {
    return mibhceljhjn_ == null ? POGOProtos.Rpc.CCEINPGJEEL.getDefaultInstance() : mibhceljhjn_;
  }
  /**
   * <code>.POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn = 2;</code>
   */
  public POGOProtos.Rpc.CCEINPGJEELOrBuilder getMibhceljhjnOrBuilder() {
    return getMibhceljhjn();
  }

  public static final int JLJGIJMEHKG_FIELD_NUMBER = 3;
  private boolean jljgijmehkg_;
  /**
   * <code>bool jljgijmehkg = 3;</code>
   * @return The jljgijmehkg.
   */
  public boolean getJljgijmehkg() {
    return jljgijmehkg_;
  }

  public static final int HEHPOJCAHCA_FIELD_NUMBER = 4;
  private POGOProtos.Rpc.PFENIHMCEPI hehpojcahca_;
  /**
   * <code>.POGOProtos.Rpc.PFENIHMCEPI hehpojcahca = 4;</code>
   * @return Whether the hehpojcahca field is set.
   */
  public boolean hasHehpojcahca() {
    return hehpojcahca_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PFENIHMCEPI hehpojcahca = 4;</code>
   * @return The hehpojcahca.
   */
  public POGOProtos.Rpc.PFENIHMCEPI getHehpojcahca() {
    return hehpojcahca_ == null ? POGOProtos.Rpc.PFENIHMCEPI.getDefaultInstance() : hehpojcahca_;
  }
  /**
   * <code>.POGOProtos.Rpc.PFENIHMCEPI hehpojcahca = 4;</code>
   */
  public POGOProtos.Rpc.PFENIHMCEPIOrBuilder getHehpojcahcaOrBuilder() {
    return getHehpojcahca();
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
    if (jbflkcdndlp_ != POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD.UNSET.getNumber()) {
      output.writeEnum(1, jbflkcdndlp_);
    }
    if (mibhceljhjn_ != null) {
      output.writeMessage(2, getMibhceljhjn());
    }
    if (jljgijmehkg_ != false) {
      output.writeBool(3, jljgijmehkg_);
    }
    if (hehpojcahca_ != null) {
      output.writeMessage(4, getHehpojcahca());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jbflkcdndlp_ != POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, jbflkcdndlp_);
    }
    if (mibhceljhjn_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMibhceljhjn());
    }
    if (jljgijmehkg_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, jljgijmehkg_);
    }
    if (hehpojcahca_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getHehpojcahca());
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
    if (!(obj instanceof POGOProtos.Rpc.LMGICMKEKLP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LMGICMKEKLP other = (POGOProtos.Rpc.LMGICMKEKLP) obj;

    if (jbflkcdndlp_ != other.jbflkcdndlp_) return false;
    if (hasMibhceljhjn() != other.hasMibhceljhjn()) return false;
    if (hasMibhceljhjn()) {
      if (!getMibhceljhjn()
          .equals(other.getMibhceljhjn())) return false;
    }
    if (getJljgijmehkg()
        != other.getJljgijmehkg()) return false;
    if (hasHehpojcahca() != other.hasHehpojcahca()) return false;
    if (hasHehpojcahca()) {
      if (!getHehpojcahca()
          .equals(other.getHehpojcahca())) return false;
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
    if (hasMibhceljhjn()) {
      hash = (37 * hash) + MIBHCELJHJN_FIELD_NUMBER;
      hash = (53 * hash) + getMibhceljhjn().hashCode();
    }
    hash = (37 * hash) + JLJGIJMEHKG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getJljgijmehkg());
    if (hasHehpojcahca()) {
      hash = (37 * hash) + HEHPOJCAHCA_FIELD_NUMBER;
      hash = (53 * hash) + getHehpojcahca().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LMGICMKEKLP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LMGICMKEKLP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMGICMKEKLP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LMGICMKEKLP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMGICMKEKLP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LMGICMKEKLP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMGICMKEKLP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LMGICMKEKLP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMGICMKEKLP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LMGICMKEKLP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LMGICMKEKLP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LMGICMKEKLP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LMGICMKEKLP prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LMGICMKEKLP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LMGICMKEKLP)
      POGOProtos.Rpc.LMGICMKEKLPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMGICMKEKLP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMGICMKEKLP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LMGICMKEKLP.class, POGOProtos.Rpc.LMGICMKEKLP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LMGICMKEKLP.newBuilder()
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

      if (mibhceljhjnBuilder_ == null) {
        mibhceljhjn_ = null;
      } else {
        mibhceljhjn_ = null;
        mibhceljhjnBuilder_ = null;
      }
      jljgijmehkg_ = false;

      if (hehpojcahcaBuilder_ == null) {
        hehpojcahca_ = null;
      } else {
        hehpojcahca_ = null;
        hehpojcahcaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LMGICMKEKLP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LMGICMKEKLP getDefaultInstanceForType() {
      return POGOProtos.Rpc.LMGICMKEKLP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LMGICMKEKLP build() {
      POGOProtos.Rpc.LMGICMKEKLP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LMGICMKEKLP buildPartial() {
      POGOProtos.Rpc.LMGICMKEKLP result = new POGOProtos.Rpc.LMGICMKEKLP(this);
      result.jbflkcdndlp_ = jbflkcdndlp_;
      if (mibhceljhjnBuilder_ == null) {
        result.mibhceljhjn_ = mibhceljhjn_;
      } else {
        result.mibhceljhjn_ = mibhceljhjnBuilder_.build();
      }
      result.jljgijmehkg_ = jljgijmehkg_;
      if (hehpojcahcaBuilder_ == null) {
        result.hehpojcahca_ = hehpojcahca_;
      } else {
        result.hehpojcahca_ = hehpojcahcaBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.LMGICMKEKLP) {
        return mergeFrom((POGOProtos.Rpc.LMGICMKEKLP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LMGICMKEKLP other) {
      if (other == POGOProtos.Rpc.LMGICMKEKLP.getDefaultInstance()) return this;
      if (other.jbflkcdndlp_ != 0) {
        setJbflkcdndlpValue(other.getJbflkcdndlpValue());
      }
      if (other.hasMibhceljhjn()) {
        mergeMibhceljhjn(other.getMibhceljhjn());
      }
      if (other.getJljgijmehkg() != false) {
        setJljgijmehkg(other.getJljgijmehkg());
      }
      if (other.hasHehpojcahca()) {
        mergeHehpojcahca(other.getHehpojcahca());
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
      POGOProtos.Rpc.LMGICMKEKLP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LMGICMKEKLP) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD jbflkcdndlp = 1;</code>
     * @return The enum numeric value on the wire for jbflkcdndlp.
     */
    public int getJbflkcdndlpValue() {
      return jbflkcdndlp_;
    }
    /**
     * <code>.POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD jbflkcdndlp = 1;</code>
     * @param value The enum numeric value on the wire for jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlpValue(int value) {
      jbflkcdndlp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD jbflkcdndlp = 1;</code>
     * @return The jbflkcdndlp.
     */
    public POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD getJbflkcdndlp() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD result = POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD.valueOf(jbflkcdndlp_);
      return result == null ? POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD jbflkcdndlp = 1;</code>
     * @param value The jbflkcdndlp to set.
     * @return This builder for chaining.
     */
    public Builder setJbflkcdndlp(POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jbflkcdndlp_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LMGICMKEKLP.LOJPFDEENHD jbflkcdndlp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJbflkcdndlp() {
      
      jbflkcdndlp_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CCEINPGJEEL, POGOProtos.Rpc.CCEINPGJEEL.Builder, POGOProtos.Rpc.CCEINPGJEELOrBuilder> mibhceljhjnBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn = 2;</code>
     * @return Whether the mibhceljhjn field is set.
     */
    public boolean hasMibhceljhjn() {
      return mibhceljhjnBuilder_ != null || mibhceljhjn_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn = 2;</code>
     * @return The mibhceljhjn.
     */
    public POGOProtos.Rpc.CCEINPGJEEL getMibhceljhjn() {
      if (mibhceljhjnBuilder_ == null) {
        return mibhceljhjn_ == null ? POGOProtos.Rpc.CCEINPGJEEL.getDefaultInstance() : mibhceljhjn_;
      } else {
        return mibhceljhjnBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn = 2;</code>
     */
    public Builder setMibhceljhjn(POGOProtos.Rpc.CCEINPGJEEL value) {
      if (mibhceljhjnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mibhceljhjn_ = value;
        onChanged();
      } else {
        mibhceljhjnBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn = 2;</code>
     */
    public Builder setMibhceljhjn(
        POGOProtos.Rpc.CCEINPGJEEL.Builder builderForValue) {
      if (mibhceljhjnBuilder_ == null) {
        mibhceljhjn_ = builderForValue.build();
        onChanged();
      } else {
        mibhceljhjnBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn = 2;</code>
     */
    public Builder mergeMibhceljhjn(POGOProtos.Rpc.CCEINPGJEEL value) {
      if (mibhceljhjnBuilder_ == null) {
        if (mibhceljhjn_ != null) {
          mibhceljhjn_ =
            POGOProtos.Rpc.CCEINPGJEEL.newBuilder(mibhceljhjn_).mergeFrom(value).buildPartial();
        } else {
          mibhceljhjn_ = value;
        }
        onChanged();
      } else {
        mibhceljhjnBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn = 2;</code>
     */
    public Builder clearMibhceljhjn() {
      if (mibhceljhjnBuilder_ == null) {
        mibhceljhjn_ = null;
        onChanged();
      } else {
        mibhceljhjn_ = null;
        mibhceljhjnBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn = 2;</code>
     */
    public POGOProtos.Rpc.CCEINPGJEEL.Builder getMibhceljhjnBuilder() {
      
      onChanged();
      return getMibhceljhjnFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn = 2;</code>
     */
    public POGOProtos.Rpc.CCEINPGJEELOrBuilder getMibhceljhjnOrBuilder() {
      if (mibhceljhjnBuilder_ != null) {
        return mibhceljhjnBuilder_.getMessageOrBuilder();
      } else {
        return mibhceljhjn_ == null ?
            POGOProtos.Rpc.CCEINPGJEEL.getDefaultInstance() : mibhceljhjn_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CCEINPGJEEL mibhceljhjn = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CCEINPGJEEL, POGOProtos.Rpc.CCEINPGJEEL.Builder, POGOProtos.Rpc.CCEINPGJEELOrBuilder> 
        getMibhceljhjnFieldBuilder() {
      if (mibhceljhjnBuilder_ == null) {
        mibhceljhjnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CCEINPGJEEL, POGOProtos.Rpc.CCEINPGJEEL.Builder, POGOProtos.Rpc.CCEINPGJEELOrBuilder>(
                getMibhceljhjn(),
                getParentForChildren(),
                isClean());
        mibhceljhjn_ = null;
      }
      return mibhceljhjnBuilder_;
    }

    private boolean jljgijmehkg_ ;
    /**
     * <code>bool jljgijmehkg = 3;</code>
     * @return The jljgijmehkg.
     */
    public boolean getJljgijmehkg() {
      return jljgijmehkg_;
    }
    /**
     * <code>bool jljgijmehkg = 3;</code>
     * @param value The jljgijmehkg to set.
     * @return This builder for chaining.
     */
    public Builder setJljgijmehkg(boolean value) {
      
      jljgijmehkg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool jljgijmehkg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJljgijmehkg() {
      
      jljgijmehkg_ = false;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PFENIHMCEPI hehpojcahca_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PFENIHMCEPI, POGOProtos.Rpc.PFENIHMCEPI.Builder, POGOProtos.Rpc.PFENIHMCEPIOrBuilder> hehpojcahcaBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PFENIHMCEPI hehpojcahca = 4;</code>
     * @return Whether the hehpojcahca field is set.
     */
    public boolean hasHehpojcahca() {
      return hehpojcahcaBuilder_ != null || hehpojcahca_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PFENIHMCEPI hehpojcahca = 4;</code>
     * @return The hehpojcahca.
     */
    public POGOProtos.Rpc.PFENIHMCEPI getHehpojcahca() {
      if (hehpojcahcaBuilder_ == null) {
        return hehpojcahca_ == null ? POGOProtos.Rpc.PFENIHMCEPI.getDefaultInstance() : hehpojcahca_;
      } else {
        return hehpojcahcaBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PFENIHMCEPI hehpojcahca = 4;</code>
     */
    public Builder setHehpojcahca(POGOProtos.Rpc.PFENIHMCEPI value) {
      if (hehpojcahcaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hehpojcahca_ = value;
        onChanged();
      } else {
        hehpojcahcaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PFENIHMCEPI hehpojcahca = 4;</code>
     */
    public Builder setHehpojcahca(
        POGOProtos.Rpc.PFENIHMCEPI.Builder builderForValue) {
      if (hehpojcahcaBuilder_ == null) {
        hehpojcahca_ = builderForValue.build();
        onChanged();
      } else {
        hehpojcahcaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PFENIHMCEPI hehpojcahca = 4;</code>
     */
    public Builder mergeHehpojcahca(POGOProtos.Rpc.PFENIHMCEPI value) {
      if (hehpojcahcaBuilder_ == null) {
        if (hehpojcahca_ != null) {
          hehpojcahca_ =
            POGOProtos.Rpc.PFENIHMCEPI.newBuilder(hehpojcahca_).mergeFrom(value).buildPartial();
        } else {
          hehpojcahca_ = value;
        }
        onChanged();
      } else {
        hehpojcahcaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PFENIHMCEPI hehpojcahca = 4;</code>
     */
    public Builder clearHehpojcahca() {
      if (hehpojcahcaBuilder_ == null) {
        hehpojcahca_ = null;
        onChanged();
      } else {
        hehpojcahca_ = null;
        hehpojcahcaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PFENIHMCEPI hehpojcahca = 4;</code>
     */
    public POGOProtos.Rpc.PFENIHMCEPI.Builder getHehpojcahcaBuilder() {
      
      onChanged();
      return getHehpojcahcaFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PFENIHMCEPI hehpojcahca = 4;</code>
     */
    public POGOProtos.Rpc.PFENIHMCEPIOrBuilder getHehpojcahcaOrBuilder() {
      if (hehpojcahcaBuilder_ != null) {
        return hehpojcahcaBuilder_.getMessageOrBuilder();
      } else {
        return hehpojcahca_ == null ?
            POGOProtos.Rpc.PFENIHMCEPI.getDefaultInstance() : hehpojcahca_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PFENIHMCEPI hehpojcahca = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PFENIHMCEPI, POGOProtos.Rpc.PFENIHMCEPI.Builder, POGOProtos.Rpc.PFENIHMCEPIOrBuilder> 
        getHehpojcahcaFieldBuilder() {
      if (hehpojcahcaBuilder_ == null) {
        hehpojcahcaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PFENIHMCEPI, POGOProtos.Rpc.PFENIHMCEPI.Builder, POGOProtos.Rpc.PFENIHMCEPIOrBuilder>(
                getHehpojcahca(),
                getParentForChildren(),
                isClean());
        hehpojcahca_ = null;
      }
      return hehpojcahcaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LMGICMKEKLP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LMGICMKEKLP)
  private static final POGOProtos.Rpc.LMGICMKEKLP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LMGICMKEKLP();
  }

  public static POGOProtos.Rpc.LMGICMKEKLP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LMGICMKEKLP>
      PARSER = new com.google.protobuf.AbstractParser<LMGICMKEKLP>() {
    @java.lang.Override
    public LMGICMKEKLP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LMGICMKEKLP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LMGICMKEKLP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LMGICMKEKLP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LMGICMKEKLP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

