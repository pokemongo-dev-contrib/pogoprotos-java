// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ACHCLKHMFPL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ACHCLKHMFPL}
 */
public  final class ACHCLKHMFPL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ACHCLKHMFPL)
    ACHCLKHMFPLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ACHCLKHMFPL.newBuilder() to construct.
  private ACHCLKHMFPL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ACHCLKHMFPL() {
    obbpnbmjkhf_ = 0;
    nbaifjheigg_ = 0;
    ojlcopehlln_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ACHCLKHMFPL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ACHCLKHMFPL(
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

            obbpnbmjkhf_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            nbaifjheigg_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            ojlcopehlln_ = s;
            break;
          }
          case 32: {

            hahdgfdcbpd_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ACHCLKHMFPL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ACHCLKHMFPL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ACHCLKHMFPL.class, POGOProtos.Rpc.ACHCLKHMFPL.Builder.class);
  }

  public static final int OBBPNBMJKHF_FIELD_NUMBER = 1;
  private int obbpnbmjkhf_;
  /**
   * <code>.POGOProtos.Rpc.DCECAELICAF obbpnbmjkhf = 1;</code>
   * @return The enum numeric value on the wire for obbpnbmjkhf.
   */
  public int getObbpnbmjkhfValue() {
    return obbpnbmjkhf_;
  }
  /**
   * <code>.POGOProtos.Rpc.DCECAELICAF obbpnbmjkhf = 1;</code>
   * @return The obbpnbmjkhf.
   */
  public POGOProtos.Rpc.DCECAELICAF getObbpnbmjkhf() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.DCECAELICAF result = POGOProtos.Rpc.DCECAELICAF.valueOf(obbpnbmjkhf_);
    return result == null ? POGOProtos.Rpc.DCECAELICAF.UNRECOGNIZED : result;
  }

  public static final int NBAIFJHEIGG_FIELD_NUMBER = 2;
  private int nbaifjheigg_;
  /**
   * <code>.POGOProtos.Rpc.HIBGDHCKGDN nbaifjheigg = 2;</code>
   * @return The enum numeric value on the wire for nbaifjheigg.
   */
  public int getNbaifjheiggValue() {
    return nbaifjheigg_;
  }
  /**
   * <code>.POGOProtos.Rpc.HIBGDHCKGDN nbaifjheigg = 2;</code>
   * @return The nbaifjheigg.
   */
  public POGOProtos.Rpc.HIBGDHCKGDN getNbaifjheigg() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HIBGDHCKGDN result = POGOProtos.Rpc.HIBGDHCKGDN.valueOf(nbaifjheigg_);
    return result == null ? POGOProtos.Rpc.HIBGDHCKGDN.UNRECOGNIZED : result;
  }

  public static final int OJLCOPEHLLN_FIELD_NUMBER = 3;
  private volatile java.lang.Object ojlcopehlln_;
  /**
   * <code>string ojlcopehlln = 3;</code>
   * @return The ojlcopehlln.
   */
  public java.lang.String getOjlcopehlln() {
    java.lang.Object ref = ojlcopehlln_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ojlcopehlln_ = s;
      return s;
    }
  }
  /**
   * <code>string ojlcopehlln = 3;</code>
   * @return The bytes for ojlcopehlln.
   */
  public com.google.protobuf.ByteString
      getOjlcopehllnBytes() {
    java.lang.Object ref = ojlcopehlln_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ojlcopehlln_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HAHDGFDCBPD_FIELD_NUMBER = 4;
  private boolean hahdgfdcbpd_;
  /**
   * <code>bool hahdgfdcbpd = 4;</code>
   * @return The hahdgfdcbpd.
   */
  public boolean getHahdgfdcbpd() {
    return hahdgfdcbpd_;
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
    if (obbpnbmjkhf_ != POGOProtos.Rpc.DCECAELICAF.DCECAELICAF_UNDEFINED_SHOPPING_PAGE_EVENT.getNumber()) {
      output.writeEnum(1, obbpnbmjkhf_);
    }
    if (nbaifjheigg_ != POGOProtos.Rpc.HIBGDHCKGDN.HIBGDHCKGDN_UNDEFINED_SHOPPING_PAGE_SOURCE.getNumber()) {
      output.writeEnum(2, nbaifjheigg_);
    }
    if (!getOjlcopehllnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ojlcopehlln_);
    }
    if (hahdgfdcbpd_ != false) {
      output.writeBool(4, hahdgfdcbpd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (obbpnbmjkhf_ != POGOProtos.Rpc.DCECAELICAF.DCECAELICAF_UNDEFINED_SHOPPING_PAGE_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, obbpnbmjkhf_);
    }
    if (nbaifjheigg_ != POGOProtos.Rpc.HIBGDHCKGDN.HIBGDHCKGDN_UNDEFINED_SHOPPING_PAGE_SOURCE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, nbaifjheigg_);
    }
    if (!getOjlcopehllnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ojlcopehlln_);
    }
    if (hahdgfdcbpd_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, hahdgfdcbpd_);
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
    if (!(obj instanceof POGOProtos.Rpc.ACHCLKHMFPL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ACHCLKHMFPL other = (POGOProtos.Rpc.ACHCLKHMFPL) obj;

    if (obbpnbmjkhf_ != other.obbpnbmjkhf_) return false;
    if (nbaifjheigg_ != other.nbaifjheigg_) return false;
    if (!getOjlcopehlln()
        .equals(other.getOjlcopehlln())) return false;
    if (getHahdgfdcbpd()
        != other.getHahdgfdcbpd()) return false;
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
    hash = (37 * hash) + OBBPNBMJKHF_FIELD_NUMBER;
    hash = (53 * hash) + obbpnbmjkhf_;
    hash = (37 * hash) + NBAIFJHEIGG_FIELD_NUMBER;
    hash = (53 * hash) + nbaifjheigg_;
    hash = (37 * hash) + OJLCOPEHLLN_FIELD_NUMBER;
    hash = (53 * hash) + getOjlcopehlln().hashCode();
    hash = (37 * hash) + HAHDGFDCBPD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHahdgfdcbpd());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ACHCLKHMFPL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ACHCLKHMFPL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ACHCLKHMFPL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ACHCLKHMFPL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ACHCLKHMFPL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ACHCLKHMFPL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ACHCLKHMFPL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ACHCLKHMFPL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ACHCLKHMFPL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ACHCLKHMFPL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ACHCLKHMFPL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ACHCLKHMFPL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ACHCLKHMFPL prototype) {
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
   * ref: ACHCLKHMFPL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ACHCLKHMFPL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ACHCLKHMFPL)
      POGOProtos.Rpc.ACHCLKHMFPLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ACHCLKHMFPL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ACHCLKHMFPL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ACHCLKHMFPL.class, POGOProtos.Rpc.ACHCLKHMFPL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ACHCLKHMFPL.newBuilder()
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
      obbpnbmjkhf_ = 0;

      nbaifjheigg_ = 0;

      ojlcopehlln_ = "";

      hahdgfdcbpd_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ACHCLKHMFPL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ACHCLKHMFPL getDefaultInstanceForType() {
      return POGOProtos.Rpc.ACHCLKHMFPL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ACHCLKHMFPL build() {
      POGOProtos.Rpc.ACHCLKHMFPL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ACHCLKHMFPL buildPartial() {
      POGOProtos.Rpc.ACHCLKHMFPL result = new POGOProtos.Rpc.ACHCLKHMFPL(this);
      result.obbpnbmjkhf_ = obbpnbmjkhf_;
      result.nbaifjheigg_ = nbaifjheigg_;
      result.ojlcopehlln_ = ojlcopehlln_;
      result.hahdgfdcbpd_ = hahdgfdcbpd_;
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
      if (other instanceof POGOProtos.Rpc.ACHCLKHMFPL) {
        return mergeFrom((POGOProtos.Rpc.ACHCLKHMFPL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ACHCLKHMFPL other) {
      if (other == POGOProtos.Rpc.ACHCLKHMFPL.getDefaultInstance()) return this;
      if (other.obbpnbmjkhf_ != 0) {
        setObbpnbmjkhfValue(other.getObbpnbmjkhfValue());
      }
      if (other.nbaifjheigg_ != 0) {
        setNbaifjheiggValue(other.getNbaifjheiggValue());
      }
      if (!other.getOjlcopehlln().isEmpty()) {
        ojlcopehlln_ = other.ojlcopehlln_;
        onChanged();
      }
      if (other.getHahdgfdcbpd() != false) {
        setHahdgfdcbpd(other.getHahdgfdcbpd());
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
      POGOProtos.Rpc.ACHCLKHMFPL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ACHCLKHMFPL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int obbpnbmjkhf_ = 0;
    /**
     * <code>.POGOProtos.Rpc.DCECAELICAF obbpnbmjkhf = 1;</code>
     * @return The enum numeric value on the wire for obbpnbmjkhf.
     */
    public int getObbpnbmjkhfValue() {
      return obbpnbmjkhf_;
    }
    /**
     * <code>.POGOProtos.Rpc.DCECAELICAF obbpnbmjkhf = 1;</code>
     * @param value The enum numeric value on the wire for obbpnbmjkhf to set.
     * @return This builder for chaining.
     */
    public Builder setObbpnbmjkhfValue(int value) {
      obbpnbmjkhf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DCECAELICAF obbpnbmjkhf = 1;</code>
     * @return The obbpnbmjkhf.
     */
    public POGOProtos.Rpc.DCECAELICAF getObbpnbmjkhf() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.DCECAELICAF result = POGOProtos.Rpc.DCECAELICAF.valueOf(obbpnbmjkhf_);
      return result == null ? POGOProtos.Rpc.DCECAELICAF.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.DCECAELICAF obbpnbmjkhf = 1;</code>
     * @param value The obbpnbmjkhf to set.
     * @return This builder for chaining.
     */
    public Builder setObbpnbmjkhf(POGOProtos.Rpc.DCECAELICAF value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      obbpnbmjkhf_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DCECAELICAF obbpnbmjkhf = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearObbpnbmjkhf() {
      
      obbpnbmjkhf_ = 0;
      onChanged();
      return this;
    }

    private int nbaifjheigg_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HIBGDHCKGDN nbaifjheigg = 2;</code>
     * @return The enum numeric value on the wire for nbaifjheigg.
     */
    public int getNbaifjheiggValue() {
      return nbaifjheigg_;
    }
    /**
     * <code>.POGOProtos.Rpc.HIBGDHCKGDN nbaifjheigg = 2;</code>
     * @param value The enum numeric value on the wire for nbaifjheigg to set.
     * @return This builder for chaining.
     */
    public Builder setNbaifjheiggValue(int value) {
      nbaifjheigg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HIBGDHCKGDN nbaifjheigg = 2;</code>
     * @return The nbaifjheigg.
     */
    public POGOProtos.Rpc.HIBGDHCKGDN getNbaifjheigg() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HIBGDHCKGDN result = POGOProtos.Rpc.HIBGDHCKGDN.valueOf(nbaifjheigg_);
      return result == null ? POGOProtos.Rpc.HIBGDHCKGDN.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HIBGDHCKGDN nbaifjheigg = 2;</code>
     * @param value The nbaifjheigg to set.
     * @return This builder for chaining.
     */
    public Builder setNbaifjheigg(POGOProtos.Rpc.HIBGDHCKGDN value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      nbaifjheigg_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HIBGDHCKGDN nbaifjheigg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNbaifjheigg() {
      
      nbaifjheigg_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object ojlcopehlln_ = "";
    /**
     * <code>string ojlcopehlln = 3;</code>
     * @return The ojlcopehlln.
     */
    public java.lang.String getOjlcopehlln() {
      java.lang.Object ref = ojlcopehlln_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ojlcopehlln_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ojlcopehlln = 3;</code>
     * @return The bytes for ojlcopehlln.
     */
    public com.google.protobuf.ByteString
        getOjlcopehllnBytes() {
      java.lang.Object ref = ojlcopehlln_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ojlcopehlln_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ojlcopehlln = 3;</code>
     * @param value The ojlcopehlln to set.
     * @return This builder for chaining.
     */
    public Builder setOjlcopehlln(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ojlcopehlln_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ojlcopehlln = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOjlcopehlln() {
      
      ojlcopehlln_ = getDefaultInstance().getOjlcopehlln();
      onChanged();
      return this;
    }
    /**
     * <code>string ojlcopehlln = 3;</code>
     * @param value The bytes for ojlcopehlln to set.
     * @return This builder for chaining.
     */
    public Builder setOjlcopehllnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ojlcopehlln_ = value;
      onChanged();
      return this;
    }

    private boolean hahdgfdcbpd_ ;
    /**
     * <code>bool hahdgfdcbpd = 4;</code>
     * @return The hahdgfdcbpd.
     */
    public boolean getHahdgfdcbpd() {
      return hahdgfdcbpd_;
    }
    /**
     * <code>bool hahdgfdcbpd = 4;</code>
     * @param value The hahdgfdcbpd to set.
     * @return This builder for chaining.
     */
    public Builder setHahdgfdcbpd(boolean value) {
      
      hahdgfdcbpd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool hahdgfdcbpd = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHahdgfdcbpd() {
      
      hahdgfdcbpd_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ACHCLKHMFPL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ACHCLKHMFPL)
  private static final POGOProtos.Rpc.ACHCLKHMFPL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ACHCLKHMFPL();
  }

  public static POGOProtos.Rpc.ACHCLKHMFPL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ACHCLKHMFPL>
      PARSER = new com.google.protobuf.AbstractParser<ACHCLKHMFPL>() {
    @java.lang.Override
    public ACHCLKHMFPL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ACHCLKHMFPL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ACHCLKHMFPL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ACHCLKHMFPL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ACHCLKHMFPL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

