// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ILFCCGOCMBP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.ILFCCGOCMBP}
 */
public final class ILFCCGOCMBP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ILFCCGOCMBP)
    ILFCCGOCMBPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ILFCCGOCMBP.newBuilder() to construct.
  private ILFCCGOCMBP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ILFCCGOCMBP() {
    allklmpeffl_ = 0;
    fcmaghfcjbd_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ILFCCGOCMBP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ILFCCGOCMBP(
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

            allklmpeffl_ = rawValue;
            break;
          }
          case 16: {

            dboagcjclpg_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            fcmaghfcjbd_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ILFCCGOCMBP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ILFCCGOCMBP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ILFCCGOCMBP.class, POGOProtos.Rpc.ILFCCGOCMBP.Builder.class);
  }

  public static final int ALLKLMPEFFL_FIELD_NUMBER = 1;
  private int allklmpeffl_;
  /**
   * <code>.POGOProtos.Rpc.DPIFOJNKKOK allklmpeffl = 1;</code>
   * @return The enum numeric value on the wire for allklmpeffl.
   */
  @java.lang.Override public int getAllklmpefflValue() {
    return allklmpeffl_;
  }
  /**
   * <code>.POGOProtos.Rpc.DPIFOJNKKOK allklmpeffl = 1;</code>
   * @return The allklmpeffl.
   */
  @java.lang.Override public POGOProtos.Rpc.DPIFOJNKKOK getAllklmpeffl() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.DPIFOJNKKOK result = POGOProtos.Rpc.DPIFOJNKKOK.valueOf(allklmpeffl_);
    return result == null ? POGOProtos.Rpc.DPIFOJNKKOK.UNRECOGNIZED : result;
  }

  public static final int DBOAGCJCLPG_FIELD_NUMBER = 2;
  private int dboagcjclpg_;
  /**
   * <code>int32 dboagcjclpg = 2;</code>
   * @return The dboagcjclpg.
   */
  @java.lang.Override
  public int getDboagcjclpg() {
    return dboagcjclpg_;
  }

  public static final int FCMAGHFCJBD_FIELD_NUMBER = 3;
  private volatile java.lang.Object fcmaghfcjbd_;
  /**
   * <code>string fcmaghfcjbd = 3;</code>
   * @return The fcmaghfcjbd.
   */
  @java.lang.Override
  public java.lang.String getFcmaghfcjbd() {
    java.lang.Object ref = fcmaghfcjbd_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fcmaghfcjbd_ = s;
      return s;
    }
  }
  /**
   * <code>string fcmaghfcjbd = 3;</code>
   * @return The bytes for fcmaghfcjbd.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFcmaghfcjbdBytes() {
    java.lang.Object ref = fcmaghfcjbd_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fcmaghfcjbd_ = b;
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
    if (allklmpeffl_ != POGOProtos.Rpc.DPIFOJNKKOK.DPIFOJNKKOK_TEMP_EVOLUTION_UNSET.getNumber()) {
      output.writeEnum(1, allklmpeffl_);
    }
    if (dboagcjclpg_ != 0) {
      output.writeInt32(2, dboagcjclpg_);
    }
    if (!getFcmaghfcjbdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fcmaghfcjbd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (allklmpeffl_ != POGOProtos.Rpc.DPIFOJNKKOK.DPIFOJNKKOK_TEMP_EVOLUTION_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, allklmpeffl_);
    }
    if (dboagcjclpg_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, dboagcjclpg_);
    }
    if (!getFcmaghfcjbdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fcmaghfcjbd_);
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
    if (!(obj instanceof POGOProtos.Rpc.ILFCCGOCMBP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ILFCCGOCMBP other = (POGOProtos.Rpc.ILFCCGOCMBP) obj;

    if (allklmpeffl_ != other.allklmpeffl_) return false;
    if (getDboagcjclpg()
        != other.getDboagcjclpg()) return false;
    if (!getFcmaghfcjbd()
        .equals(other.getFcmaghfcjbd())) return false;
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
    hash = (37 * hash) + ALLKLMPEFFL_FIELD_NUMBER;
    hash = (53 * hash) + allklmpeffl_;
    hash = (37 * hash) + DBOAGCJCLPG_FIELD_NUMBER;
    hash = (53 * hash) + getDboagcjclpg();
    hash = (37 * hash) + FCMAGHFCJBD_FIELD_NUMBER;
    hash = (53 * hash) + getFcmaghfcjbd().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ILFCCGOCMBP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ILFCCGOCMBP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ILFCCGOCMBP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ILFCCGOCMBP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ILFCCGOCMBP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ILFCCGOCMBP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ILFCCGOCMBP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ILFCCGOCMBP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ILFCCGOCMBP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ILFCCGOCMBP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ILFCCGOCMBP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ILFCCGOCMBP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ILFCCGOCMBP prototype) {
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
   * ref: ILFCCGOCMBP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.ILFCCGOCMBP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ILFCCGOCMBP)
      POGOProtos.Rpc.ILFCCGOCMBPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ILFCCGOCMBP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ILFCCGOCMBP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ILFCCGOCMBP.class, POGOProtos.Rpc.ILFCCGOCMBP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ILFCCGOCMBP.newBuilder()
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
      allklmpeffl_ = 0;

      dboagcjclpg_ = 0;

      fcmaghfcjbd_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ILFCCGOCMBP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ILFCCGOCMBP getDefaultInstanceForType() {
      return POGOProtos.Rpc.ILFCCGOCMBP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ILFCCGOCMBP build() {
      POGOProtos.Rpc.ILFCCGOCMBP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ILFCCGOCMBP buildPartial() {
      POGOProtos.Rpc.ILFCCGOCMBP result = new POGOProtos.Rpc.ILFCCGOCMBP(this);
      result.allklmpeffl_ = allklmpeffl_;
      result.dboagcjclpg_ = dboagcjclpg_;
      result.fcmaghfcjbd_ = fcmaghfcjbd_;
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
      if (other instanceof POGOProtos.Rpc.ILFCCGOCMBP) {
        return mergeFrom((POGOProtos.Rpc.ILFCCGOCMBP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ILFCCGOCMBP other) {
      if (other == POGOProtos.Rpc.ILFCCGOCMBP.getDefaultInstance()) return this;
      if (other.allklmpeffl_ != 0) {
        setAllklmpefflValue(other.getAllklmpefflValue());
      }
      if (other.getDboagcjclpg() != 0) {
        setDboagcjclpg(other.getDboagcjclpg());
      }
      if (!other.getFcmaghfcjbd().isEmpty()) {
        fcmaghfcjbd_ = other.fcmaghfcjbd_;
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
      POGOProtos.Rpc.ILFCCGOCMBP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ILFCCGOCMBP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int allklmpeffl_ = 0;
    /**
     * <code>.POGOProtos.Rpc.DPIFOJNKKOK allklmpeffl = 1;</code>
     * @return The enum numeric value on the wire for allklmpeffl.
     */
    @java.lang.Override public int getAllklmpefflValue() {
      return allklmpeffl_;
    }
    /**
     * <code>.POGOProtos.Rpc.DPIFOJNKKOK allklmpeffl = 1;</code>
     * @param value The enum numeric value on the wire for allklmpeffl to set.
     * @return This builder for chaining.
     */
    public Builder setAllklmpefflValue(int value) {
      
      allklmpeffl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DPIFOJNKKOK allklmpeffl = 1;</code>
     * @return The allklmpeffl.
     */
    @java.lang.Override
    public POGOProtos.Rpc.DPIFOJNKKOK getAllklmpeffl() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.DPIFOJNKKOK result = POGOProtos.Rpc.DPIFOJNKKOK.valueOf(allklmpeffl_);
      return result == null ? POGOProtos.Rpc.DPIFOJNKKOK.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.DPIFOJNKKOK allklmpeffl = 1;</code>
     * @param value The allklmpeffl to set.
     * @return This builder for chaining.
     */
    public Builder setAllklmpeffl(POGOProtos.Rpc.DPIFOJNKKOK value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      allklmpeffl_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DPIFOJNKKOK allklmpeffl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllklmpeffl() {
      
      allklmpeffl_ = 0;
      onChanged();
      return this;
    }

    private int dboagcjclpg_ ;
    /**
     * <code>int32 dboagcjclpg = 2;</code>
     * @return The dboagcjclpg.
     */
    @java.lang.Override
    public int getDboagcjclpg() {
      return dboagcjclpg_;
    }
    /**
     * <code>int32 dboagcjclpg = 2;</code>
     * @param value The dboagcjclpg to set.
     * @return This builder for chaining.
     */
    public Builder setDboagcjclpg(int value) {
      
      dboagcjclpg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 dboagcjclpg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDboagcjclpg() {
      
      dboagcjclpg_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fcmaghfcjbd_ = "";
    /**
     * <code>string fcmaghfcjbd = 3;</code>
     * @return The fcmaghfcjbd.
     */
    public java.lang.String getFcmaghfcjbd() {
      java.lang.Object ref = fcmaghfcjbd_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fcmaghfcjbd_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fcmaghfcjbd = 3;</code>
     * @return The bytes for fcmaghfcjbd.
     */
    public com.google.protobuf.ByteString
        getFcmaghfcjbdBytes() {
      java.lang.Object ref = fcmaghfcjbd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fcmaghfcjbd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fcmaghfcjbd = 3;</code>
     * @param value The fcmaghfcjbd to set.
     * @return This builder for chaining.
     */
    public Builder setFcmaghfcjbd(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fcmaghfcjbd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fcmaghfcjbd = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFcmaghfcjbd() {
      
      fcmaghfcjbd_ = getDefaultInstance().getFcmaghfcjbd();
      onChanged();
      return this;
    }
    /**
     * <code>string fcmaghfcjbd = 3;</code>
     * @param value The bytes for fcmaghfcjbd to set.
     * @return This builder for chaining.
     */
    public Builder setFcmaghfcjbdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fcmaghfcjbd_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ILFCCGOCMBP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ILFCCGOCMBP)
  private static final POGOProtos.Rpc.ILFCCGOCMBP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ILFCCGOCMBP();
  }

  public static POGOProtos.Rpc.ILFCCGOCMBP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ILFCCGOCMBP>
      PARSER = new com.google.protobuf.AbstractParser<ILFCCGOCMBP>() {
    @java.lang.Override
    public ILFCCGOCMBP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ILFCCGOCMBP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ILFCCGOCMBP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ILFCCGOCMBP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ILFCCGOCMBP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

