// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: EIAKNLBODEA
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.EIAKNLBODEA}
 */
public final class EIAKNLBODEA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EIAKNLBODEA)
    EIAKNLBODEAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EIAKNLBODEA.newBuilder() to construct.
  private EIAKNLBODEA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EIAKNLBODEA() {
    leehhlngfeo_ = "";
    lambpobimae_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EIAKNLBODEA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EIAKNLBODEA(
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

            leehhlngfeo_ = s;
            break;
          }
          case 17: {

            acbjkipgmcl_ = input.readDouble();
            break;
          }
          case 25: {

            haoplpbmplb_ = input.readDouble();
            break;
          }
          case 33: {

            fdmbonikaig_ = input.readDouble();
            break;
          }
          case 41: {

            fdcookjekkj_ = input.readDouble();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            lambpobimae_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIAKNLBODEA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIAKNLBODEA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EIAKNLBODEA.class, POGOProtos.Rpc.EIAKNLBODEA.Builder.class);
  }

  public static final int LEEHHLNGFEO_FIELD_NUMBER = 1;
  private volatile java.lang.Object leehhlngfeo_;
  /**
   * <code>string leehhlngfeo = 1;</code>
   * @return The leehhlngfeo.
   */
  @java.lang.Override
  public java.lang.String getLeehhlngfeo() {
    java.lang.Object ref = leehhlngfeo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      leehhlngfeo_ = s;
      return s;
    }
  }
  /**
   * <code>string leehhlngfeo = 1;</code>
   * @return The bytes for leehhlngfeo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLeehhlngfeoBytes() {
    java.lang.Object ref = leehhlngfeo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      leehhlngfeo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACBJKIPGMCL_FIELD_NUMBER = 2;
  private double acbjkipgmcl_;
  /**
   * <code>double acbjkipgmcl = 2;</code>
   * @return The acbjkipgmcl.
   */
  @java.lang.Override
  public double getAcbjkipgmcl() {
    return acbjkipgmcl_;
  }

  public static final int HAOPLPBMPLB_FIELD_NUMBER = 3;
  private double haoplpbmplb_;
  /**
   * <code>double haoplpbmplb = 3;</code>
   * @return The haoplpbmplb.
   */
  @java.lang.Override
  public double getHaoplpbmplb() {
    return haoplpbmplb_;
  }

  public static final int FDMBONIKAIG_FIELD_NUMBER = 4;
  private double fdmbonikaig_;
  /**
   * <code>double fdmbonikaig = 4;</code>
   * @return The fdmbonikaig.
   */
  @java.lang.Override
  public double getFdmbonikaig() {
    return fdmbonikaig_;
  }

  public static final int FDCOOKJEKKJ_FIELD_NUMBER = 5;
  private double fdcookjekkj_;
  /**
   * <code>double fdcookjekkj = 5;</code>
   * @return The fdcookjekkj.
   */
  @java.lang.Override
  public double getFdcookjekkj() {
    return fdcookjekkj_;
  }

  public static final int LAMBPOBIMAE_FIELD_NUMBER = 6;
  private volatile java.lang.Object lambpobimae_;
  /**
   * <code>string lambpobimae = 6;</code>
   * @return The lambpobimae.
   */
  @java.lang.Override
  public java.lang.String getLambpobimae() {
    java.lang.Object ref = lambpobimae_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lambpobimae_ = s;
      return s;
    }
  }
  /**
   * <code>string lambpobimae = 6;</code>
   * @return The bytes for lambpobimae.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLambpobimaeBytes() {
    java.lang.Object ref = lambpobimae_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lambpobimae_ = b;
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
    if (!getLeehhlngfeoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, leehhlngfeo_);
    }
    if (acbjkipgmcl_ != 0D) {
      output.writeDouble(2, acbjkipgmcl_);
    }
    if (haoplpbmplb_ != 0D) {
      output.writeDouble(3, haoplpbmplb_);
    }
    if (fdmbonikaig_ != 0D) {
      output.writeDouble(4, fdmbonikaig_);
    }
    if (fdcookjekkj_ != 0D) {
      output.writeDouble(5, fdcookjekkj_);
    }
    if (!getLambpobimaeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, lambpobimae_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLeehhlngfeoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, leehhlngfeo_);
    }
    if (acbjkipgmcl_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, acbjkipgmcl_);
    }
    if (haoplpbmplb_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, haoplpbmplb_);
    }
    if (fdmbonikaig_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, fdmbonikaig_);
    }
    if (fdcookjekkj_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, fdcookjekkj_);
    }
    if (!getLambpobimaeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, lambpobimae_);
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
    if (!(obj instanceof POGOProtos.Rpc.EIAKNLBODEA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EIAKNLBODEA other = (POGOProtos.Rpc.EIAKNLBODEA) obj;

    if (!getLeehhlngfeo()
        .equals(other.getLeehhlngfeo())) return false;
    if (java.lang.Double.doubleToLongBits(getAcbjkipgmcl())
        != java.lang.Double.doubleToLongBits(
            other.getAcbjkipgmcl())) return false;
    if (java.lang.Double.doubleToLongBits(getHaoplpbmplb())
        != java.lang.Double.doubleToLongBits(
            other.getHaoplpbmplb())) return false;
    if (java.lang.Double.doubleToLongBits(getFdmbonikaig())
        != java.lang.Double.doubleToLongBits(
            other.getFdmbonikaig())) return false;
    if (java.lang.Double.doubleToLongBits(getFdcookjekkj())
        != java.lang.Double.doubleToLongBits(
            other.getFdcookjekkj())) return false;
    if (!getLambpobimae()
        .equals(other.getLambpobimae())) return false;
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
    hash = (37 * hash) + LEEHHLNGFEO_FIELD_NUMBER;
    hash = (53 * hash) + getLeehhlngfeo().hashCode();
    hash = (37 * hash) + ACBJKIPGMCL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAcbjkipgmcl()));
    hash = (37 * hash) + HAOPLPBMPLB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getHaoplpbmplb()));
    hash = (37 * hash) + FDMBONIKAIG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getFdmbonikaig()));
    hash = (37 * hash) + FDCOOKJEKKJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getFdcookjekkj()));
    hash = (37 * hash) + LAMBPOBIMAE_FIELD_NUMBER;
    hash = (53 * hash) + getLambpobimae().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EIAKNLBODEA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EIAKNLBODEA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIAKNLBODEA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EIAKNLBODEA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIAKNLBODEA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EIAKNLBODEA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIAKNLBODEA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EIAKNLBODEA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIAKNLBODEA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EIAKNLBODEA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIAKNLBODEA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EIAKNLBODEA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EIAKNLBODEA prototype) {
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
   * ref: EIAKNLBODEA
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.EIAKNLBODEA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EIAKNLBODEA)
      POGOProtos.Rpc.EIAKNLBODEAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIAKNLBODEA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIAKNLBODEA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EIAKNLBODEA.class, POGOProtos.Rpc.EIAKNLBODEA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EIAKNLBODEA.newBuilder()
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
      leehhlngfeo_ = "";

      acbjkipgmcl_ = 0D;

      haoplpbmplb_ = 0D;

      fdmbonikaig_ = 0D;

      fdcookjekkj_ = 0D;

      lambpobimae_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIAKNLBODEA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EIAKNLBODEA getDefaultInstanceForType() {
      return POGOProtos.Rpc.EIAKNLBODEA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EIAKNLBODEA build() {
      POGOProtos.Rpc.EIAKNLBODEA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EIAKNLBODEA buildPartial() {
      POGOProtos.Rpc.EIAKNLBODEA result = new POGOProtos.Rpc.EIAKNLBODEA(this);
      result.leehhlngfeo_ = leehhlngfeo_;
      result.acbjkipgmcl_ = acbjkipgmcl_;
      result.haoplpbmplb_ = haoplpbmplb_;
      result.fdmbonikaig_ = fdmbonikaig_;
      result.fdcookjekkj_ = fdcookjekkj_;
      result.lambpobimae_ = lambpobimae_;
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
      if (other instanceof POGOProtos.Rpc.EIAKNLBODEA) {
        return mergeFrom((POGOProtos.Rpc.EIAKNLBODEA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EIAKNLBODEA other) {
      if (other == POGOProtos.Rpc.EIAKNLBODEA.getDefaultInstance()) return this;
      if (!other.getLeehhlngfeo().isEmpty()) {
        leehhlngfeo_ = other.leehhlngfeo_;
        onChanged();
      }
      if (other.getAcbjkipgmcl() != 0D) {
        setAcbjkipgmcl(other.getAcbjkipgmcl());
      }
      if (other.getHaoplpbmplb() != 0D) {
        setHaoplpbmplb(other.getHaoplpbmplb());
      }
      if (other.getFdmbonikaig() != 0D) {
        setFdmbonikaig(other.getFdmbonikaig());
      }
      if (other.getFdcookjekkj() != 0D) {
        setFdcookjekkj(other.getFdcookjekkj());
      }
      if (!other.getLambpobimae().isEmpty()) {
        lambpobimae_ = other.lambpobimae_;
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
      POGOProtos.Rpc.EIAKNLBODEA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EIAKNLBODEA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object leehhlngfeo_ = "";
    /**
     * <code>string leehhlngfeo = 1;</code>
     * @return The leehhlngfeo.
     */
    public java.lang.String getLeehhlngfeo() {
      java.lang.Object ref = leehhlngfeo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        leehhlngfeo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string leehhlngfeo = 1;</code>
     * @return The bytes for leehhlngfeo.
     */
    public com.google.protobuf.ByteString
        getLeehhlngfeoBytes() {
      java.lang.Object ref = leehhlngfeo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        leehhlngfeo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string leehhlngfeo = 1;</code>
     * @param value The leehhlngfeo to set.
     * @return This builder for chaining.
     */
    public Builder setLeehhlngfeo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      leehhlngfeo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string leehhlngfeo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeehhlngfeo() {
      
      leehhlngfeo_ = getDefaultInstance().getLeehhlngfeo();
      onChanged();
      return this;
    }
    /**
     * <code>string leehhlngfeo = 1;</code>
     * @param value The bytes for leehhlngfeo to set.
     * @return This builder for chaining.
     */
    public Builder setLeehhlngfeoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      leehhlngfeo_ = value;
      onChanged();
      return this;
    }

    private double acbjkipgmcl_ ;
    /**
     * <code>double acbjkipgmcl = 2;</code>
     * @return The acbjkipgmcl.
     */
    @java.lang.Override
    public double getAcbjkipgmcl() {
      return acbjkipgmcl_;
    }
    /**
     * <code>double acbjkipgmcl = 2;</code>
     * @param value The acbjkipgmcl to set.
     * @return This builder for chaining.
     */
    public Builder setAcbjkipgmcl(double value) {
      
      acbjkipgmcl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double acbjkipgmcl = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcbjkipgmcl() {
      
      acbjkipgmcl_ = 0D;
      onChanged();
      return this;
    }

    private double haoplpbmplb_ ;
    /**
     * <code>double haoplpbmplb = 3;</code>
     * @return The haoplpbmplb.
     */
    @java.lang.Override
    public double getHaoplpbmplb() {
      return haoplpbmplb_;
    }
    /**
     * <code>double haoplpbmplb = 3;</code>
     * @param value The haoplpbmplb to set.
     * @return This builder for chaining.
     */
    public Builder setHaoplpbmplb(double value) {
      
      haoplpbmplb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double haoplpbmplb = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHaoplpbmplb() {
      
      haoplpbmplb_ = 0D;
      onChanged();
      return this;
    }

    private double fdmbonikaig_ ;
    /**
     * <code>double fdmbonikaig = 4;</code>
     * @return The fdmbonikaig.
     */
    @java.lang.Override
    public double getFdmbonikaig() {
      return fdmbonikaig_;
    }
    /**
     * <code>double fdmbonikaig = 4;</code>
     * @param value The fdmbonikaig to set.
     * @return This builder for chaining.
     */
    public Builder setFdmbonikaig(double value) {
      
      fdmbonikaig_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double fdmbonikaig = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFdmbonikaig() {
      
      fdmbonikaig_ = 0D;
      onChanged();
      return this;
    }

    private double fdcookjekkj_ ;
    /**
     * <code>double fdcookjekkj = 5;</code>
     * @return The fdcookjekkj.
     */
    @java.lang.Override
    public double getFdcookjekkj() {
      return fdcookjekkj_;
    }
    /**
     * <code>double fdcookjekkj = 5;</code>
     * @param value The fdcookjekkj to set.
     * @return This builder for chaining.
     */
    public Builder setFdcookjekkj(double value) {
      
      fdcookjekkj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double fdcookjekkj = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFdcookjekkj() {
      
      fdcookjekkj_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object lambpobimae_ = "";
    /**
     * <code>string lambpobimae = 6;</code>
     * @return The lambpobimae.
     */
    public java.lang.String getLambpobimae() {
      java.lang.Object ref = lambpobimae_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lambpobimae_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lambpobimae = 6;</code>
     * @return The bytes for lambpobimae.
     */
    public com.google.protobuf.ByteString
        getLambpobimaeBytes() {
      java.lang.Object ref = lambpobimae_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lambpobimae_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lambpobimae = 6;</code>
     * @param value The lambpobimae to set.
     * @return This builder for chaining.
     */
    public Builder setLambpobimae(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lambpobimae_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lambpobimae = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLambpobimae() {
      
      lambpobimae_ = getDefaultInstance().getLambpobimae();
      onChanged();
      return this;
    }
    /**
     * <code>string lambpobimae = 6;</code>
     * @param value The bytes for lambpobimae to set.
     * @return This builder for chaining.
     */
    public Builder setLambpobimaeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lambpobimae_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EIAKNLBODEA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EIAKNLBODEA)
  private static final POGOProtos.Rpc.EIAKNLBODEA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EIAKNLBODEA();
  }

  public static POGOProtos.Rpc.EIAKNLBODEA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EIAKNLBODEA>
      PARSER = new com.google.protobuf.AbstractParser<EIAKNLBODEA>() {
    @java.lang.Override
    public EIAKNLBODEA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EIAKNLBODEA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EIAKNLBODEA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EIAKNLBODEA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EIAKNLBODEA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

