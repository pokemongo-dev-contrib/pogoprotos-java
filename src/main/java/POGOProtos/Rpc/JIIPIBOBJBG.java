// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JIIPIBOBJBG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JIIPIBOBJBG}
 */
public final class JIIPIBOBJBG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JIIPIBOBJBG)
    JIIPIBOBJBGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JIIPIBOBJBG.newBuilder() to construct.
  private JIIPIBOBJBG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JIIPIBOBJBG() {
    mmabfgfmjmn_ = 0;
    bmepeplnpij_ = "";
    kalnhjhnhei_ = "";
    kiknmaflpnp_ = "";
    kcnpaoeckih_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JIIPIBOBJBG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JIIPIBOBJBG(
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

            mmabfgfmjmn_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            bmepeplnpij_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            kalnhjhnhei_ = s;
            break;
          }
          case 32: {

            bighckpglim_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            kiknmaflpnp_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            kcnpaoeckih_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JIIPIBOBJBG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JIIPIBOBJBG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JIIPIBOBJBG.class, POGOProtos.Rpc.JIIPIBOBJBG.Builder.class);
  }

  public static final int MMABFGFMJMN_FIELD_NUMBER = 1;
  private int mmabfgfmjmn_;
  /**
   * <code>.POGOProtos.Rpc.PKBKGFCCECL mmabfgfmjmn = 1;</code>
   * @return The enum numeric value on the wire for mmabfgfmjmn.
   */
  @java.lang.Override public int getMmabfgfmjmnValue() {
    return mmabfgfmjmn_;
  }
  /**
   * <code>.POGOProtos.Rpc.PKBKGFCCECL mmabfgfmjmn = 1;</code>
   * @return The mmabfgfmjmn.
   */
  @java.lang.Override public POGOProtos.Rpc.PKBKGFCCECL getMmabfgfmjmn() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PKBKGFCCECL result = POGOProtos.Rpc.PKBKGFCCECL.valueOf(mmabfgfmjmn_);
    return result == null ? POGOProtos.Rpc.PKBKGFCCECL.UNRECOGNIZED : result;
  }

  public static final int BMEPEPLNPIJ_FIELD_NUMBER = 2;
  private volatile java.lang.Object bmepeplnpij_;
  /**
   * <code>string bmepeplnpij = 2;</code>
   * @return The bmepeplnpij.
   */
  @java.lang.Override
  public java.lang.String getBmepeplnpij() {
    java.lang.Object ref = bmepeplnpij_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bmepeplnpij_ = s;
      return s;
    }
  }
  /**
   * <code>string bmepeplnpij = 2;</code>
   * @return The bytes for bmepeplnpij.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBmepeplnpijBytes() {
    java.lang.Object ref = bmepeplnpij_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bmepeplnpij_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KALNHJHNHEI_FIELD_NUMBER = 3;
  private volatile java.lang.Object kalnhjhnhei_;
  /**
   * <code>string kalnhjhnhei = 3;</code>
   * @return The kalnhjhnhei.
   */
  @java.lang.Override
  public java.lang.String getKalnhjhnhei() {
    java.lang.Object ref = kalnhjhnhei_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kalnhjhnhei_ = s;
      return s;
    }
  }
  /**
   * <code>string kalnhjhnhei = 3;</code>
   * @return The bytes for kalnhjhnhei.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKalnhjhnheiBytes() {
    java.lang.Object ref = kalnhjhnhei_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kalnhjhnhei_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BIGHCKPGLIM_FIELD_NUMBER = 4;
  private boolean bighckpglim_;
  /**
   * <code>bool bighckpglim = 4;</code>
   * @return The bighckpglim.
   */
  @java.lang.Override
  public boolean getBighckpglim() {
    return bighckpglim_;
  }

  public static final int KIKNMAFLPNP_FIELD_NUMBER = 5;
  private volatile java.lang.Object kiknmaflpnp_;
  /**
   * <code>string kiknmaflpnp = 5;</code>
   * @return The kiknmaflpnp.
   */
  @java.lang.Override
  public java.lang.String getKiknmaflpnp() {
    java.lang.Object ref = kiknmaflpnp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kiknmaflpnp_ = s;
      return s;
    }
  }
  /**
   * <code>string kiknmaflpnp = 5;</code>
   * @return The bytes for kiknmaflpnp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKiknmaflpnpBytes() {
    java.lang.Object ref = kiknmaflpnp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kiknmaflpnp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KCNPAOECKIH_FIELD_NUMBER = 6;
  private volatile java.lang.Object kcnpaoeckih_;
  /**
   * <code>string kcnpaoeckih = 6;</code>
   * @return The kcnpaoeckih.
   */
  @java.lang.Override
  public java.lang.String getKcnpaoeckih() {
    java.lang.Object ref = kcnpaoeckih_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kcnpaoeckih_ = s;
      return s;
    }
  }
  /**
   * <code>string kcnpaoeckih = 6;</code>
   * @return The bytes for kcnpaoeckih.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKcnpaoeckihBytes() {
    java.lang.Object ref = kcnpaoeckih_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kcnpaoeckih_ = b;
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
    if (mmabfgfmjmn_ != POGOProtos.Rpc.PKBKGFCCECL.PKBKGFCCECL_UNDEFINED_AVATAR_CUSTOMIZATION.getNumber()) {
      output.writeEnum(1, mmabfgfmjmn_);
    }
    if (!getBmepeplnpijBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bmepeplnpij_);
    }
    if (!getKalnhjhnheiBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, kalnhjhnhei_);
    }
    if (bighckpglim_ != false) {
      output.writeBool(4, bighckpglim_);
    }
    if (!getKiknmaflpnpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, kiknmaflpnp_);
    }
    if (!getKcnpaoeckihBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, kcnpaoeckih_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mmabfgfmjmn_ != POGOProtos.Rpc.PKBKGFCCECL.PKBKGFCCECL_UNDEFINED_AVATAR_CUSTOMIZATION.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, mmabfgfmjmn_);
    }
    if (!getBmepeplnpijBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bmepeplnpij_);
    }
    if (!getKalnhjhnheiBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, kalnhjhnhei_);
    }
    if (bighckpglim_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, bighckpglim_);
    }
    if (!getKiknmaflpnpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, kiknmaflpnp_);
    }
    if (!getKcnpaoeckihBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, kcnpaoeckih_);
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
    if (!(obj instanceof POGOProtos.Rpc.JIIPIBOBJBG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JIIPIBOBJBG other = (POGOProtos.Rpc.JIIPIBOBJBG) obj;

    if (mmabfgfmjmn_ != other.mmabfgfmjmn_) return false;
    if (!getBmepeplnpij()
        .equals(other.getBmepeplnpij())) return false;
    if (!getKalnhjhnhei()
        .equals(other.getKalnhjhnhei())) return false;
    if (getBighckpglim()
        != other.getBighckpglim()) return false;
    if (!getKiknmaflpnp()
        .equals(other.getKiknmaflpnp())) return false;
    if (!getKcnpaoeckih()
        .equals(other.getKcnpaoeckih())) return false;
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
    hash = (37 * hash) + MMABFGFMJMN_FIELD_NUMBER;
    hash = (53 * hash) + mmabfgfmjmn_;
    hash = (37 * hash) + BMEPEPLNPIJ_FIELD_NUMBER;
    hash = (53 * hash) + getBmepeplnpij().hashCode();
    hash = (37 * hash) + KALNHJHNHEI_FIELD_NUMBER;
    hash = (53 * hash) + getKalnhjhnhei().hashCode();
    hash = (37 * hash) + BIGHCKPGLIM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBighckpglim());
    hash = (37 * hash) + KIKNMAFLPNP_FIELD_NUMBER;
    hash = (53 * hash) + getKiknmaflpnp().hashCode();
    hash = (37 * hash) + KCNPAOECKIH_FIELD_NUMBER;
    hash = (53 * hash) + getKcnpaoeckih().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JIIPIBOBJBG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JIIPIBOBJBG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIIPIBOBJBG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JIIPIBOBJBG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIIPIBOBJBG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JIIPIBOBJBG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIIPIBOBJBG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JIIPIBOBJBG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIIPIBOBJBG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JIIPIBOBJBG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIIPIBOBJBG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JIIPIBOBJBG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JIIPIBOBJBG prototype) {
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
   * ref: JIIPIBOBJBG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JIIPIBOBJBG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JIIPIBOBJBG)
      POGOProtos.Rpc.JIIPIBOBJBGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JIIPIBOBJBG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JIIPIBOBJBG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JIIPIBOBJBG.class, POGOProtos.Rpc.JIIPIBOBJBG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JIIPIBOBJBG.newBuilder()
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
      mmabfgfmjmn_ = 0;

      bmepeplnpij_ = "";

      kalnhjhnhei_ = "";

      bighckpglim_ = false;

      kiknmaflpnp_ = "";

      kcnpaoeckih_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JIIPIBOBJBG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JIIPIBOBJBG getDefaultInstanceForType() {
      return POGOProtos.Rpc.JIIPIBOBJBG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JIIPIBOBJBG build() {
      POGOProtos.Rpc.JIIPIBOBJBG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JIIPIBOBJBG buildPartial() {
      POGOProtos.Rpc.JIIPIBOBJBG result = new POGOProtos.Rpc.JIIPIBOBJBG(this);
      result.mmabfgfmjmn_ = mmabfgfmjmn_;
      result.bmepeplnpij_ = bmepeplnpij_;
      result.kalnhjhnhei_ = kalnhjhnhei_;
      result.bighckpglim_ = bighckpglim_;
      result.kiknmaflpnp_ = kiknmaflpnp_;
      result.kcnpaoeckih_ = kcnpaoeckih_;
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
      if (other instanceof POGOProtos.Rpc.JIIPIBOBJBG) {
        return mergeFrom((POGOProtos.Rpc.JIIPIBOBJBG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JIIPIBOBJBG other) {
      if (other == POGOProtos.Rpc.JIIPIBOBJBG.getDefaultInstance()) return this;
      if (other.mmabfgfmjmn_ != 0) {
        setMmabfgfmjmnValue(other.getMmabfgfmjmnValue());
      }
      if (!other.getBmepeplnpij().isEmpty()) {
        bmepeplnpij_ = other.bmepeplnpij_;
        onChanged();
      }
      if (!other.getKalnhjhnhei().isEmpty()) {
        kalnhjhnhei_ = other.kalnhjhnhei_;
        onChanged();
      }
      if (other.getBighckpglim() != false) {
        setBighckpglim(other.getBighckpglim());
      }
      if (!other.getKiknmaflpnp().isEmpty()) {
        kiknmaflpnp_ = other.kiknmaflpnp_;
        onChanged();
      }
      if (!other.getKcnpaoeckih().isEmpty()) {
        kcnpaoeckih_ = other.kcnpaoeckih_;
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
      POGOProtos.Rpc.JIIPIBOBJBG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JIIPIBOBJBG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int mmabfgfmjmn_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PKBKGFCCECL mmabfgfmjmn = 1;</code>
     * @return The enum numeric value on the wire for mmabfgfmjmn.
     */
    @java.lang.Override public int getMmabfgfmjmnValue() {
      return mmabfgfmjmn_;
    }
    /**
     * <code>.POGOProtos.Rpc.PKBKGFCCECL mmabfgfmjmn = 1;</code>
     * @param value The enum numeric value on the wire for mmabfgfmjmn to set.
     * @return This builder for chaining.
     */
    public Builder setMmabfgfmjmnValue(int value) {
      
      mmabfgfmjmn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PKBKGFCCECL mmabfgfmjmn = 1;</code>
     * @return The mmabfgfmjmn.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PKBKGFCCECL getMmabfgfmjmn() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PKBKGFCCECL result = POGOProtos.Rpc.PKBKGFCCECL.valueOf(mmabfgfmjmn_);
      return result == null ? POGOProtos.Rpc.PKBKGFCCECL.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PKBKGFCCECL mmabfgfmjmn = 1;</code>
     * @param value The mmabfgfmjmn to set.
     * @return This builder for chaining.
     */
    public Builder setMmabfgfmjmn(POGOProtos.Rpc.PKBKGFCCECL value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      mmabfgfmjmn_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PKBKGFCCECL mmabfgfmjmn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMmabfgfmjmn() {
      
      mmabfgfmjmn_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object bmepeplnpij_ = "";
    /**
     * <code>string bmepeplnpij = 2;</code>
     * @return The bmepeplnpij.
     */
    public java.lang.String getBmepeplnpij() {
      java.lang.Object ref = bmepeplnpij_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bmepeplnpij_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bmepeplnpij = 2;</code>
     * @return The bytes for bmepeplnpij.
     */
    public com.google.protobuf.ByteString
        getBmepeplnpijBytes() {
      java.lang.Object ref = bmepeplnpij_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bmepeplnpij_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bmepeplnpij = 2;</code>
     * @param value The bmepeplnpij to set.
     * @return This builder for chaining.
     */
    public Builder setBmepeplnpij(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bmepeplnpij_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bmepeplnpij = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBmepeplnpij() {
      
      bmepeplnpij_ = getDefaultInstance().getBmepeplnpij();
      onChanged();
      return this;
    }
    /**
     * <code>string bmepeplnpij = 2;</code>
     * @param value The bytes for bmepeplnpij to set.
     * @return This builder for chaining.
     */
    public Builder setBmepeplnpijBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bmepeplnpij_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object kalnhjhnhei_ = "";
    /**
     * <code>string kalnhjhnhei = 3;</code>
     * @return The kalnhjhnhei.
     */
    public java.lang.String getKalnhjhnhei() {
      java.lang.Object ref = kalnhjhnhei_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kalnhjhnhei_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string kalnhjhnhei = 3;</code>
     * @return The bytes for kalnhjhnhei.
     */
    public com.google.protobuf.ByteString
        getKalnhjhnheiBytes() {
      java.lang.Object ref = kalnhjhnhei_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kalnhjhnhei_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string kalnhjhnhei = 3;</code>
     * @param value The kalnhjhnhei to set.
     * @return This builder for chaining.
     */
    public Builder setKalnhjhnhei(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kalnhjhnhei_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string kalnhjhnhei = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKalnhjhnhei() {
      
      kalnhjhnhei_ = getDefaultInstance().getKalnhjhnhei();
      onChanged();
      return this;
    }
    /**
     * <code>string kalnhjhnhei = 3;</code>
     * @param value The bytes for kalnhjhnhei to set.
     * @return This builder for chaining.
     */
    public Builder setKalnhjhnheiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kalnhjhnhei_ = value;
      onChanged();
      return this;
    }

    private boolean bighckpglim_ ;
    /**
     * <code>bool bighckpglim = 4;</code>
     * @return The bighckpglim.
     */
    @java.lang.Override
    public boolean getBighckpglim() {
      return bighckpglim_;
    }
    /**
     * <code>bool bighckpglim = 4;</code>
     * @param value The bighckpglim to set.
     * @return This builder for chaining.
     */
    public Builder setBighckpglim(boolean value) {
      
      bighckpglim_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool bighckpglim = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBighckpglim() {
      
      bighckpglim_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object kiknmaflpnp_ = "";
    /**
     * <code>string kiknmaflpnp = 5;</code>
     * @return The kiknmaflpnp.
     */
    public java.lang.String getKiknmaflpnp() {
      java.lang.Object ref = kiknmaflpnp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kiknmaflpnp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string kiknmaflpnp = 5;</code>
     * @return The bytes for kiknmaflpnp.
     */
    public com.google.protobuf.ByteString
        getKiknmaflpnpBytes() {
      java.lang.Object ref = kiknmaflpnp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kiknmaflpnp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string kiknmaflpnp = 5;</code>
     * @param value The kiknmaflpnp to set.
     * @return This builder for chaining.
     */
    public Builder setKiknmaflpnp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kiknmaflpnp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string kiknmaflpnp = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearKiknmaflpnp() {
      
      kiknmaflpnp_ = getDefaultInstance().getKiknmaflpnp();
      onChanged();
      return this;
    }
    /**
     * <code>string kiknmaflpnp = 5;</code>
     * @param value The bytes for kiknmaflpnp to set.
     * @return This builder for chaining.
     */
    public Builder setKiknmaflpnpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kiknmaflpnp_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object kcnpaoeckih_ = "";
    /**
     * <code>string kcnpaoeckih = 6;</code>
     * @return The kcnpaoeckih.
     */
    public java.lang.String getKcnpaoeckih() {
      java.lang.Object ref = kcnpaoeckih_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kcnpaoeckih_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string kcnpaoeckih = 6;</code>
     * @return The bytes for kcnpaoeckih.
     */
    public com.google.protobuf.ByteString
        getKcnpaoeckihBytes() {
      java.lang.Object ref = kcnpaoeckih_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kcnpaoeckih_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string kcnpaoeckih = 6;</code>
     * @param value The kcnpaoeckih to set.
     * @return This builder for chaining.
     */
    public Builder setKcnpaoeckih(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kcnpaoeckih_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string kcnpaoeckih = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearKcnpaoeckih() {
      
      kcnpaoeckih_ = getDefaultInstance().getKcnpaoeckih();
      onChanged();
      return this;
    }
    /**
     * <code>string kcnpaoeckih = 6;</code>
     * @param value The bytes for kcnpaoeckih to set.
     * @return This builder for chaining.
     */
    public Builder setKcnpaoeckihBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kcnpaoeckih_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JIIPIBOBJBG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JIIPIBOBJBG)
  private static final POGOProtos.Rpc.JIIPIBOBJBG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JIIPIBOBJBG();
  }

  public static POGOProtos.Rpc.JIIPIBOBJBG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JIIPIBOBJBG>
      PARSER = new com.google.protobuf.AbstractParser<JIIPIBOBJBG>() {
    @java.lang.Override
    public JIIPIBOBJBG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JIIPIBOBJBG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JIIPIBOBJBG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JIIPIBOBJBG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JIIPIBOBJBG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

