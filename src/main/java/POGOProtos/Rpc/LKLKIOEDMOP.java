// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LKLKIOEDMOP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.LKLKIOEDMOP}
 */
public final class LKLKIOEDMOP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LKLKIOEDMOP)
    LKLKIOEDMOPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LKLKIOEDMOP.newBuilder() to construct.
  private LKLKIOEDMOP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LKLKIOEDMOP() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LKLKIOEDMOP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LKLKIOEDMOP(
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

            oojkjamfmki_ = input.readBool();
            break;
          }
          case 16: {

            ggehofcoecf_ = input.readInt32();
            break;
          }
          case 24: {

            icifdnjgnjg_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LKLKIOEDMOP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LKLKIOEDMOP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LKLKIOEDMOP.class, POGOProtos.Rpc.LKLKIOEDMOP.Builder.class);
  }

  public static final int OOJKJAMFMKI_FIELD_NUMBER = 1;
  private boolean oojkjamfmki_;
  /**
   * <code>bool oojkjamfmki = 1;</code>
   * @return The oojkjamfmki.
   */
  @java.lang.Override
  public boolean getOojkjamfmki() {
    return oojkjamfmki_;
  }

  public static final int GGEHOFCOECF_FIELD_NUMBER = 2;
  private int ggehofcoecf_;
  /**
   * <code>int32 ggehofcoecf = 2;</code>
   * @return The ggehofcoecf.
   */
  @java.lang.Override
  public int getGgehofcoecf() {
    return ggehofcoecf_;
  }

  public static final int ICIFDNJGNJG_FIELD_NUMBER = 3;
  private int icifdnjgnjg_;
  /**
   * <code>int32 icifdnjgnjg = 3;</code>
   * @return The icifdnjgnjg.
   */
  @java.lang.Override
  public int getIcifdnjgnjg() {
    return icifdnjgnjg_;
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
    if (oojkjamfmki_ != false) {
      output.writeBool(1, oojkjamfmki_);
    }
    if (ggehofcoecf_ != 0) {
      output.writeInt32(2, ggehofcoecf_);
    }
    if (icifdnjgnjg_ != 0) {
      output.writeInt32(3, icifdnjgnjg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oojkjamfmki_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, oojkjamfmki_);
    }
    if (ggehofcoecf_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, ggehofcoecf_);
    }
    if (icifdnjgnjg_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, icifdnjgnjg_);
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
    if (!(obj instanceof POGOProtos.Rpc.LKLKIOEDMOP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LKLKIOEDMOP other = (POGOProtos.Rpc.LKLKIOEDMOP) obj;

    if (getOojkjamfmki()
        != other.getOojkjamfmki()) return false;
    if (getGgehofcoecf()
        != other.getGgehofcoecf()) return false;
    if (getIcifdnjgnjg()
        != other.getIcifdnjgnjg()) return false;
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
    hash = (37 * hash) + OOJKJAMFMKI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOojkjamfmki());
    hash = (37 * hash) + GGEHOFCOECF_FIELD_NUMBER;
    hash = (53 * hash) + getGgehofcoecf();
    hash = (37 * hash) + ICIFDNJGNJG_FIELD_NUMBER;
    hash = (53 * hash) + getIcifdnjgnjg();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LKLKIOEDMOP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LKLKIOEDMOP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LKLKIOEDMOP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LKLKIOEDMOP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LKLKIOEDMOP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LKLKIOEDMOP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LKLKIOEDMOP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LKLKIOEDMOP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LKLKIOEDMOP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LKLKIOEDMOP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LKLKIOEDMOP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LKLKIOEDMOP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LKLKIOEDMOP prototype) {
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
   * ref: LKLKIOEDMOP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.LKLKIOEDMOP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LKLKIOEDMOP)
      POGOProtos.Rpc.LKLKIOEDMOPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LKLKIOEDMOP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LKLKIOEDMOP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LKLKIOEDMOP.class, POGOProtos.Rpc.LKLKIOEDMOP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LKLKIOEDMOP.newBuilder()
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
      oojkjamfmki_ = false;

      ggehofcoecf_ = 0;

      icifdnjgnjg_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LKLKIOEDMOP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LKLKIOEDMOP getDefaultInstanceForType() {
      return POGOProtos.Rpc.LKLKIOEDMOP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LKLKIOEDMOP build() {
      POGOProtos.Rpc.LKLKIOEDMOP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LKLKIOEDMOP buildPartial() {
      POGOProtos.Rpc.LKLKIOEDMOP result = new POGOProtos.Rpc.LKLKIOEDMOP(this);
      result.oojkjamfmki_ = oojkjamfmki_;
      result.ggehofcoecf_ = ggehofcoecf_;
      result.icifdnjgnjg_ = icifdnjgnjg_;
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
      if (other instanceof POGOProtos.Rpc.LKLKIOEDMOP) {
        return mergeFrom((POGOProtos.Rpc.LKLKIOEDMOP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LKLKIOEDMOP other) {
      if (other == POGOProtos.Rpc.LKLKIOEDMOP.getDefaultInstance()) return this;
      if (other.getOojkjamfmki() != false) {
        setOojkjamfmki(other.getOojkjamfmki());
      }
      if (other.getGgehofcoecf() != 0) {
        setGgehofcoecf(other.getGgehofcoecf());
      }
      if (other.getIcifdnjgnjg() != 0) {
        setIcifdnjgnjg(other.getIcifdnjgnjg());
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
      POGOProtos.Rpc.LKLKIOEDMOP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LKLKIOEDMOP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean oojkjamfmki_ ;
    /**
     * <code>bool oojkjamfmki = 1;</code>
     * @return The oojkjamfmki.
     */
    @java.lang.Override
    public boolean getOojkjamfmki() {
      return oojkjamfmki_;
    }
    /**
     * <code>bool oojkjamfmki = 1;</code>
     * @param value The oojkjamfmki to set.
     * @return This builder for chaining.
     */
    public Builder setOojkjamfmki(boolean value) {
      
      oojkjamfmki_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool oojkjamfmki = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOojkjamfmki() {
      
      oojkjamfmki_ = false;
      onChanged();
      return this;
    }

    private int ggehofcoecf_ ;
    /**
     * <code>int32 ggehofcoecf = 2;</code>
     * @return The ggehofcoecf.
     */
    @java.lang.Override
    public int getGgehofcoecf() {
      return ggehofcoecf_;
    }
    /**
     * <code>int32 ggehofcoecf = 2;</code>
     * @param value The ggehofcoecf to set.
     * @return This builder for chaining.
     */
    public Builder setGgehofcoecf(int value) {
      
      ggehofcoecf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ggehofcoecf = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGgehofcoecf() {
      
      ggehofcoecf_ = 0;
      onChanged();
      return this;
    }

    private int icifdnjgnjg_ ;
    /**
     * <code>int32 icifdnjgnjg = 3;</code>
     * @return The icifdnjgnjg.
     */
    @java.lang.Override
    public int getIcifdnjgnjg() {
      return icifdnjgnjg_;
    }
    /**
     * <code>int32 icifdnjgnjg = 3;</code>
     * @param value The icifdnjgnjg to set.
     * @return This builder for chaining.
     */
    public Builder setIcifdnjgnjg(int value) {
      
      icifdnjgnjg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 icifdnjgnjg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIcifdnjgnjg() {
      
      icifdnjgnjg_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LKLKIOEDMOP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LKLKIOEDMOP)
  private static final POGOProtos.Rpc.LKLKIOEDMOP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LKLKIOEDMOP();
  }

  public static POGOProtos.Rpc.LKLKIOEDMOP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LKLKIOEDMOP>
      PARSER = new com.google.protobuf.AbstractParser<LKLKIOEDMOP>() {
    @java.lang.Override
    public LKLKIOEDMOP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LKLKIOEDMOP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LKLKIOEDMOP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LKLKIOEDMOP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LKLKIOEDMOP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

