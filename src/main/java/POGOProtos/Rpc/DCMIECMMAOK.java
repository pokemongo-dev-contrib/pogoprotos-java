// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DCMIECMMAOK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.DCMIECMMAOK}
 */
public final class DCMIECMMAOK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DCMIECMMAOK)
    DCMIECMMAOKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DCMIECMMAOK.newBuilder() to construct.
  private DCMIECMMAOK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DCMIECMMAOK() {
    gfaenodgbfj_ = "";
    gjmajhipkmg_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DCMIECMMAOK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DCMIECMMAOK(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            gfaenodgbfj_ = s;
            break;
          }
          case 18: {
            POGOProtos.Rpc.ALDBMMPFJEL.Builder subBuilder = null;
            if (ichkglcaffb_ != null) {
              subBuilder = ichkglcaffb_.toBuilder();
            }
            ichkglcaffb_ = input.readMessage(POGOProtos.Rpc.ALDBMMPFJEL.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ichkglcaffb_);
              ichkglcaffb_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            gjmajhipkmg_ = rawValue;
            break;
          }
          case 32: {

            gjoahoigmck_ = input.readBool();
            break;
          }
          case 42: {
            POGOProtos.Rpc.ALDBMMPFJEL.Builder subBuilder = null;
            if (ffigdgocnij_ != null) {
              subBuilder = ffigdgocnij_.toBuilder();
            }
            ffigdgocnij_ = input.readMessage(POGOProtos.Rpc.ALDBMMPFJEL.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ffigdgocnij_);
              ffigdgocnij_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DCMIECMMAOK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DCMIECMMAOK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DCMIECMMAOK.class, POGOProtos.Rpc.DCMIECMMAOK.Builder.class);
  }

  public static final int GFAENODGBFJ_FIELD_NUMBER = 1;
  private volatile java.lang.Object gfaenodgbfj_;
  /**
   * <code>string gfaenodgbfj = 1;</code>
   * @return The gfaenodgbfj.
   */
  @java.lang.Override
  public java.lang.String getGfaenodgbfj() {
    java.lang.Object ref = gfaenodgbfj_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gfaenodgbfj_ = s;
      return s;
    }
  }
  /**
   * <code>string gfaenodgbfj = 1;</code>
   * @return The bytes for gfaenodgbfj.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGfaenodgbfjBytes() {
    java.lang.Object ref = gfaenodgbfj_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gfaenodgbfj_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ICHKGLCAFFB_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb_;
  /**
   * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
   * @return Whether the ichkglcaffb field is set.
   */
  @java.lang.Override
  public boolean hasIchkglcaffb() {
    return ichkglcaffb_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
   * @return The ichkglcaffb.
   */
  @java.lang.Override
  public POGOProtos.Rpc.ALDBMMPFJEL getIchkglcaffb() {
    return ichkglcaffb_ == null ? POGOProtos.Rpc.ALDBMMPFJEL.getDefaultInstance() : ichkglcaffb_;
  }
  /**
   * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ALDBMMPFJELOrBuilder getIchkglcaffbOrBuilder() {
    return getIchkglcaffb();
  }

  public static final int GJMAJHIPKMG_FIELD_NUMBER = 3;
  private int gjmajhipkmg_;
  /**
   * <code>.POGOProtos.Rpc.KEFCGMONCDM gjmajhipkmg = 3;</code>
   * @return The enum numeric value on the wire for gjmajhipkmg.
   */
  @java.lang.Override public int getGjmajhipkmgValue() {
    return gjmajhipkmg_;
  }
  /**
   * <code>.POGOProtos.Rpc.KEFCGMONCDM gjmajhipkmg = 3;</code>
   * @return The gjmajhipkmg.
   */
  @java.lang.Override public POGOProtos.Rpc.KEFCGMONCDM getGjmajhipkmg() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.KEFCGMONCDM result = POGOProtos.Rpc.KEFCGMONCDM.valueOf(gjmajhipkmg_);
    return result == null ? POGOProtos.Rpc.KEFCGMONCDM.UNRECOGNIZED : result;
  }

  public static final int GJOAHOIGMCK_FIELD_NUMBER = 4;
  private boolean gjoahoigmck_;
  /**
   * <code>bool gjoahoigmck = 4;</code>
   * @return The gjoahoigmck.
   */
  @java.lang.Override
  public boolean getGjoahoigmck() {
    return gjoahoigmck_;
  }

  public static final int FFIGDGOCNIJ_FIELD_NUMBER = 5;
  private POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij_;
  /**
   * <code>.POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij = 5;</code>
   * @return Whether the ffigdgocnij field is set.
   */
  @java.lang.Override
  public boolean hasFfigdgocnij() {
    return ffigdgocnij_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij = 5;</code>
   * @return The ffigdgocnij.
   */
  @java.lang.Override
  public POGOProtos.Rpc.ALDBMMPFJEL getFfigdgocnij() {
    return ffigdgocnij_ == null ? POGOProtos.Rpc.ALDBMMPFJEL.getDefaultInstance() : ffigdgocnij_;
  }
  /**
   * <code>.POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij = 5;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ALDBMMPFJELOrBuilder getFfigdgocnijOrBuilder() {
    return getFfigdgocnij();
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
    if (!getGfaenodgbfjBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gfaenodgbfj_);
    }
    if (ichkglcaffb_ != null) {
      output.writeMessage(2, getIchkglcaffb());
    }
    if (gjmajhipkmg_ != POGOProtos.Rpc.KEFCGMONCDM.KEFCGMONCDM_SPAWN_POINT.getNumber()) {
      output.writeEnum(3, gjmajhipkmg_);
    }
    if (gjoahoigmck_ != false) {
      output.writeBool(4, gjoahoigmck_);
    }
    if (ffigdgocnij_ != null) {
      output.writeMessage(5, getFfigdgocnij());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGfaenodgbfjBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gfaenodgbfj_);
    }
    if (ichkglcaffb_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getIchkglcaffb());
    }
    if (gjmajhipkmg_ != POGOProtos.Rpc.KEFCGMONCDM.KEFCGMONCDM_SPAWN_POINT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, gjmajhipkmg_);
    }
    if (gjoahoigmck_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, gjoahoigmck_);
    }
    if (ffigdgocnij_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getFfigdgocnij());
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
    if (!(obj instanceof POGOProtos.Rpc.DCMIECMMAOK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DCMIECMMAOK other = (POGOProtos.Rpc.DCMIECMMAOK) obj;

    if (!getGfaenodgbfj()
        .equals(other.getGfaenodgbfj())) return false;
    if (hasIchkglcaffb() != other.hasIchkglcaffb()) return false;
    if (hasIchkglcaffb()) {
      if (!getIchkglcaffb()
          .equals(other.getIchkglcaffb())) return false;
    }
    if (gjmajhipkmg_ != other.gjmajhipkmg_) return false;
    if (getGjoahoigmck()
        != other.getGjoahoigmck()) return false;
    if (hasFfigdgocnij() != other.hasFfigdgocnij()) return false;
    if (hasFfigdgocnij()) {
      if (!getFfigdgocnij()
          .equals(other.getFfigdgocnij())) return false;
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
    hash = (37 * hash) + GFAENODGBFJ_FIELD_NUMBER;
    hash = (53 * hash) + getGfaenodgbfj().hashCode();
    if (hasIchkglcaffb()) {
      hash = (37 * hash) + ICHKGLCAFFB_FIELD_NUMBER;
      hash = (53 * hash) + getIchkglcaffb().hashCode();
    }
    hash = (37 * hash) + GJMAJHIPKMG_FIELD_NUMBER;
    hash = (53 * hash) + gjmajhipkmg_;
    hash = (37 * hash) + GJOAHOIGMCK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getGjoahoigmck());
    if (hasFfigdgocnij()) {
      hash = (37 * hash) + FFIGDGOCNIJ_FIELD_NUMBER;
      hash = (53 * hash) + getFfigdgocnij().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DCMIECMMAOK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DCMIECMMAOK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DCMIECMMAOK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DCMIECMMAOK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DCMIECMMAOK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DCMIECMMAOK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DCMIECMMAOK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DCMIECMMAOK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DCMIECMMAOK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DCMIECMMAOK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DCMIECMMAOK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DCMIECMMAOK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DCMIECMMAOK prototype) {
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
   * ref: DCMIECMMAOK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.DCMIECMMAOK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DCMIECMMAOK)
      POGOProtos.Rpc.DCMIECMMAOKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DCMIECMMAOK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DCMIECMMAOK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DCMIECMMAOK.class, POGOProtos.Rpc.DCMIECMMAOK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DCMIECMMAOK.newBuilder()
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
      gfaenodgbfj_ = "";

      if (ichkglcaffbBuilder_ == null) {
        ichkglcaffb_ = null;
      } else {
        ichkglcaffb_ = null;
        ichkglcaffbBuilder_ = null;
      }
      gjmajhipkmg_ = 0;

      gjoahoigmck_ = false;

      if (ffigdgocnijBuilder_ == null) {
        ffigdgocnij_ = null;
      } else {
        ffigdgocnij_ = null;
        ffigdgocnijBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DCMIECMMAOK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DCMIECMMAOK getDefaultInstanceForType() {
      return POGOProtos.Rpc.DCMIECMMAOK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DCMIECMMAOK build() {
      POGOProtos.Rpc.DCMIECMMAOK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DCMIECMMAOK buildPartial() {
      POGOProtos.Rpc.DCMIECMMAOK result = new POGOProtos.Rpc.DCMIECMMAOK(this);
      result.gfaenodgbfj_ = gfaenodgbfj_;
      if (ichkglcaffbBuilder_ == null) {
        result.ichkglcaffb_ = ichkglcaffb_;
      } else {
        result.ichkglcaffb_ = ichkglcaffbBuilder_.build();
      }
      result.gjmajhipkmg_ = gjmajhipkmg_;
      result.gjoahoigmck_ = gjoahoigmck_;
      if (ffigdgocnijBuilder_ == null) {
        result.ffigdgocnij_ = ffigdgocnij_;
      } else {
        result.ffigdgocnij_ = ffigdgocnijBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.DCMIECMMAOK) {
        return mergeFrom((POGOProtos.Rpc.DCMIECMMAOK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DCMIECMMAOK other) {
      if (other == POGOProtos.Rpc.DCMIECMMAOK.getDefaultInstance()) return this;
      if (!other.getGfaenodgbfj().isEmpty()) {
        gfaenodgbfj_ = other.gfaenodgbfj_;
        onChanged();
      }
      if (other.hasIchkglcaffb()) {
        mergeIchkglcaffb(other.getIchkglcaffb());
      }
      if (other.gjmajhipkmg_ != 0) {
        setGjmajhipkmgValue(other.getGjmajhipkmgValue());
      }
      if (other.getGjoahoigmck() != false) {
        setGjoahoigmck(other.getGjoahoigmck());
      }
      if (other.hasFfigdgocnij()) {
        mergeFfigdgocnij(other.getFfigdgocnij());
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
      POGOProtos.Rpc.DCMIECMMAOK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DCMIECMMAOK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object gfaenodgbfj_ = "";
    /**
     * <code>string gfaenodgbfj = 1;</code>
     * @return The gfaenodgbfj.
     */
    public java.lang.String getGfaenodgbfj() {
      java.lang.Object ref = gfaenodgbfj_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gfaenodgbfj_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gfaenodgbfj = 1;</code>
     * @return The bytes for gfaenodgbfj.
     */
    public com.google.protobuf.ByteString
        getGfaenodgbfjBytes() {
      java.lang.Object ref = gfaenodgbfj_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gfaenodgbfj_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gfaenodgbfj = 1;</code>
     * @param value The gfaenodgbfj to set.
     * @return This builder for chaining.
     */
    public Builder setGfaenodgbfj(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gfaenodgbfj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gfaenodgbfj = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGfaenodgbfj() {
      
      gfaenodgbfj_ = getDefaultInstance().getGfaenodgbfj();
      onChanged();
      return this;
    }
    /**
     * <code>string gfaenodgbfj = 1;</code>
     * @param value The bytes for gfaenodgbfj to set.
     * @return This builder for chaining.
     */
    public Builder setGfaenodgbfjBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gfaenodgbfj_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ALDBMMPFJEL, POGOProtos.Rpc.ALDBMMPFJEL.Builder, POGOProtos.Rpc.ALDBMMPFJELOrBuilder> ichkglcaffbBuilder_;
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     * @return Whether the ichkglcaffb field is set.
     */
    public boolean hasIchkglcaffb() {
      return ichkglcaffbBuilder_ != null || ichkglcaffb_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     * @return The ichkglcaffb.
     */
    public POGOProtos.Rpc.ALDBMMPFJEL getIchkglcaffb() {
      if (ichkglcaffbBuilder_ == null) {
        return ichkglcaffb_ == null ? POGOProtos.Rpc.ALDBMMPFJEL.getDefaultInstance() : ichkglcaffb_;
      } else {
        return ichkglcaffbBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    public Builder setIchkglcaffb(POGOProtos.Rpc.ALDBMMPFJEL value) {
      if (ichkglcaffbBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ichkglcaffb_ = value;
        onChanged();
      } else {
        ichkglcaffbBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    public Builder setIchkglcaffb(
        POGOProtos.Rpc.ALDBMMPFJEL.Builder builderForValue) {
      if (ichkglcaffbBuilder_ == null) {
        ichkglcaffb_ = builderForValue.build();
        onChanged();
      } else {
        ichkglcaffbBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    public Builder mergeIchkglcaffb(POGOProtos.Rpc.ALDBMMPFJEL value) {
      if (ichkglcaffbBuilder_ == null) {
        if (ichkglcaffb_ != null) {
          ichkglcaffb_ =
            POGOProtos.Rpc.ALDBMMPFJEL.newBuilder(ichkglcaffb_).mergeFrom(value).buildPartial();
        } else {
          ichkglcaffb_ = value;
        }
        onChanged();
      } else {
        ichkglcaffbBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    public Builder clearIchkglcaffb() {
      if (ichkglcaffbBuilder_ == null) {
        ichkglcaffb_ = null;
        onChanged();
      } else {
        ichkglcaffb_ = null;
        ichkglcaffbBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    public POGOProtos.Rpc.ALDBMMPFJEL.Builder getIchkglcaffbBuilder() {
      
      onChanged();
      return getIchkglcaffbFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    public POGOProtos.Rpc.ALDBMMPFJELOrBuilder getIchkglcaffbOrBuilder() {
      if (ichkglcaffbBuilder_ != null) {
        return ichkglcaffbBuilder_.getMessageOrBuilder();
      } else {
        return ichkglcaffb_ == null ?
            POGOProtos.Rpc.ALDBMMPFJEL.getDefaultInstance() : ichkglcaffb_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ichkglcaffb = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ALDBMMPFJEL, POGOProtos.Rpc.ALDBMMPFJEL.Builder, POGOProtos.Rpc.ALDBMMPFJELOrBuilder> 
        getIchkglcaffbFieldBuilder() {
      if (ichkglcaffbBuilder_ == null) {
        ichkglcaffbBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.ALDBMMPFJEL, POGOProtos.Rpc.ALDBMMPFJEL.Builder, POGOProtos.Rpc.ALDBMMPFJELOrBuilder>(
                getIchkglcaffb(),
                getParentForChildren(),
                isClean());
        ichkglcaffb_ = null;
      }
      return ichkglcaffbBuilder_;
    }

    private int gjmajhipkmg_ = 0;
    /**
     * <code>.POGOProtos.Rpc.KEFCGMONCDM gjmajhipkmg = 3;</code>
     * @return The enum numeric value on the wire for gjmajhipkmg.
     */
    @java.lang.Override public int getGjmajhipkmgValue() {
      return gjmajhipkmg_;
    }
    /**
     * <code>.POGOProtos.Rpc.KEFCGMONCDM gjmajhipkmg = 3;</code>
     * @param value The enum numeric value on the wire for gjmajhipkmg to set.
     * @return This builder for chaining.
     */
    public Builder setGjmajhipkmgValue(int value) {
      
      gjmajhipkmg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KEFCGMONCDM gjmajhipkmg = 3;</code>
     * @return The gjmajhipkmg.
     */
    @java.lang.Override
    public POGOProtos.Rpc.KEFCGMONCDM getGjmajhipkmg() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.KEFCGMONCDM result = POGOProtos.Rpc.KEFCGMONCDM.valueOf(gjmajhipkmg_);
      return result == null ? POGOProtos.Rpc.KEFCGMONCDM.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.KEFCGMONCDM gjmajhipkmg = 3;</code>
     * @param value The gjmajhipkmg to set.
     * @return This builder for chaining.
     */
    public Builder setGjmajhipkmg(POGOProtos.Rpc.KEFCGMONCDM value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      gjmajhipkmg_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KEFCGMONCDM gjmajhipkmg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGjmajhipkmg() {
      
      gjmajhipkmg_ = 0;
      onChanged();
      return this;
    }

    private boolean gjoahoigmck_ ;
    /**
     * <code>bool gjoahoigmck = 4;</code>
     * @return The gjoahoigmck.
     */
    @java.lang.Override
    public boolean getGjoahoigmck() {
      return gjoahoigmck_;
    }
    /**
     * <code>bool gjoahoigmck = 4;</code>
     * @param value The gjoahoigmck to set.
     * @return This builder for chaining.
     */
    public Builder setGjoahoigmck(boolean value) {
      
      gjoahoigmck_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool gjoahoigmck = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGjoahoigmck() {
      
      gjoahoigmck_ = false;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ALDBMMPFJEL, POGOProtos.Rpc.ALDBMMPFJEL.Builder, POGOProtos.Rpc.ALDBMMPFJELOrBuilder> ffigdgocnijBuilder_;
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij = 5;</code>
     * @return Whether the ffigdgocnij field is set.
     */
    public boolean hasFfigdgocnij() {
      return ffigdgocnijBuilder_ != null || ffigdgocnij_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij = 5;</code>
     * @return The ffigdgocnij.
     */
    public POGOProtos.Rpc.ALDBMMPFJEL getFfigdgocnij() {
      if (ffigdgocnijBuilder_ == null) {
        return ffigdgocnij_ == null ? POGOProtos.Rpc.ALDBMMPFJEL.getDefaultInstance() : ffigdgocnij_;
      } else {
        return ffigdgocnijBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij = 5;</code>
     */
    public Builder setFfigdgocnij(POGOProtos.Rpc.ALDBMMPFJEL value) {
      if (ffigdgocnijBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ffigdgocnij_ = value;
        onChanged();
      } else {
        ffigdgocnijBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij = 5;</code>
     */
    public Builder setFfigdgocnij(
        POGOProtos.Rpc.ALDBMMPFJEL.Builder builderForValue) {
      if (ffigdgocnijBuilder_ == null) {
        ffigdgocnij_ = builderForValue.build();
        onChanged();
      } else {
        ffigdgocnijBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij = 5;</code>
     */
    public Builder mergeFfigdgocnij(POGOProtos.Rpc.ALDBMMPFJEL value) {
      if (ffigdgocnijBuilder_ == null) {
        if (ffigdgocnij_ != null) {
          ffigdgocnij_ =
            POGOProtos.Rpc.ALDBMMPFJEL.newBuilder(ffigdgocnij_).mergeFrom(value).buildPartial();
        } else {
          ffigdgocnij_ = value;
        }
        onChanged();
      } else {
        ffigdgocnijBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij = 5;</code>
     */
    public Builder clearFfigdgocnij() {
      if (ffigdgocnijBuilder_ == null) {
        ffigdgocnij_ = null;
        onChanged();
      } else {
        ffigdgocnij_ = null;
        ffigdgocnijBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij = 5;</code>
     */
    public POGOProtos.Rpc.ALDBMMPFJEL.Builder getFfigdgocnijBuilder() {
      
      onChanged();
      return getFfigdgocnijFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij = 5;</code>
     */
    public POGOProtos.Rpc.ALDBMMPFJELOrBuilder getFfigdgocnijOrBuilder() {
      if (ffigdgocnijBuilder_ != null) {
        return ffigdgocnijBuilder_.getMessageOrBuilder();
      } else {
        return ffigdgocnij_ == null ?
            POGOProtos.Rpc.ALDBMMPFJEL.getDefaultInstance() : ffigdgocnij_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ALDBMMPFJEL ffigdgocnij = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ALDBMMPFJEL, POGOProtos.Rpc.ALDBMMPFJEL.Builder, POGOProtos.Rpc.ALDBMMPFJELOrBuilder> 
        getFfigdgocnijFieldBuilder() {
      if (ffigdgocnijBuilder_ == null) {
        ffigdgocnijBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.ALDBMMPFJEL, POGOProtos.Rpc.ALDBMMPFJEL.Builder, POGOProtos.Rpc.ALDBMMPFJELOrBuilder>(
                getFfigdgocnij(),
                getParentForChildren(),
                isClean());
        ffigdgocnij_ = null;
      }
      return ffigdgocnijBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DCMIECMMAOK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DCMIECMMAOK)
  private static final POGOProtos.Rpc.DCMIECMMAOK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DCMIECMMAOK();
  }

  public static POGOProtos.Rpc.DCMIECMMAOK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DCMIECMMAOK>
      PARSER = new com.google.protobuf.AbstractParser<DCMIECMMAOK>() {
    @java.lang.Override
    public DCMIECMMAOK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DCMIECMMAOK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DCMIECMMAOK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DCMIECMMAOK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DCMIECMMAOK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

