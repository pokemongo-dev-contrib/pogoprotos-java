// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DJDICLKKCDF
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.DJDICLKKCDF}
 */
public  final class DJDICLKKCDF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DJDICLKKCDF)
    DJDICLKKCDFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DJDICLKKCDF.newBuilder() to construct.
  private DJDICLKKCDF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DJDICLKKCDF() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DJDICLKKCDF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DJDICLKKCDF(
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
          case 9: {

            kchhfnhinno_ = input.readDouble();
            break;
          }
          case 17: {

            peffjhoggfd_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DJDICLKKCDF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DJDICLKKCDF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DJDICLKKCDF.class, POGOProtos.Rpc.DJDICLKKCDF.Builder.class);
  }

  public static final int KCHHFNHINNO_FIELD_NUMBER = 1;
  private double kchhfnhinno_;
  /**
   * <code>double kchhfnhinno = 1;</code>
   * @return The kchhfnhinno.
   */
  public double getKchhfnhinno() {
    return kchhfnhinno_;
  }

  public static final int PEFFJHOGGFD_FIELD_NUMBER = 2;
  private double peffjhoggfd_;
  /**
   * <code>double peffjhoggfd = 2;</code>
   * @return The peffjhoggfd.
   */
  public double getPeffjhoggfd() {
    return peffjhoggfd_;
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
    if (kchhfnhinno_ != 0D) {
      output.writeDouble(1, kchhfnhinno_);
    }
    if (peffjhoggfd_ != 0D) {
      output.writeDouble(2, peffjhoggfd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kchhfnhinno_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, kchhfnhinno_);
    }
    if (peffjhoggfd_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, peffjhoggfd_);
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
    if (!(obj instanceof POGOProtos.Rpc.DJDICLKKCDF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DJDICLKKCDF other = (POGOProtos.Rpc.DJDICLKKCDF) obj;

    if (java.lang.Double.doubleToLongBits(getKchhfnhinno())
        != java.lang.Double.doubleToLongBits(
            other.getKchhfnhinno())) return false;
    if (java.lang.Double.doubleToLongBits(getPeffjhoggfd())
        != java.lang.Double.doubleToLongBits(
            other.getPeffjhoggfd())) return false;
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
    hash = (37 * hash) + KCHHFNHINNO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getKchhfnhinno()));
    hash = (37 * hash) + PEFFJHOGGFD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPeffjhoggfd()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DJDICLKKCDF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DJDICLKKCDF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DJDICLKKCDF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DJDICLKKCDF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DJDICLKKCDF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DJDICLKKCDF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DJDICLKKCDF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DJDICLKKCDF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DJDICLKKCDF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DJDICLKKCDF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DJDICLKKCDF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DJDICLKKCDF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DJDICLKKCDF prototype) {
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
   * ref: DJDICLKKCDF
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.DJDICLKKCDF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DJDICLKKCDF)
      POGOProtos.Rpc.DJDICLKKCDFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DJDICLKKCDF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DJDICLKKCDF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DJDICLKKCDF.class, POGOProtos.Rpc.DJDICLKKCDF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DJDICLKKCDF.newBuilder()
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
      kchhfnhinno_ = 0D;

      peffjhoggfd_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DJDICLKKCDF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DJDICLKKCDF getDefaultInstanceForType() {
      return POGOProtos.Rpc.DJDICLKKCDF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DJDICLKKCDF build() {
      POGOProtos.Rpc.DJDICLKKCDF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DJDICLKKCDF buildPartial() {
      POGOProtos.Rpc.DJDICLKKCDF result = new POGOProtos.Rpc.DJDICLKKCDF(this);
      result.kchhfnhinno_ = kchhfnhinno_;
      result.peffjhoggfd_ = peffjhoggfd_;
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
      if (other instanceof POGOProtos.Rpc.DJDICLKKCDF) {
        return mergeFrom((POGOProtos.Rpc.DJDICLKKCDF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DJDICLKKCDF other) {
      if (other == POGOProtos.Rpc.DJDICLKKCDF.getDefaultInstance()) return this;
      if (other.getKchhfnhinno() != 0D) {
        setKchhfnhinno(other.getKchhfnhinno());
      }
      if (other.getPeffjhoggfd() != 0D) {
        setPeffjhoggfd(other.getPeffjhoggfd());
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
      POGOProtos.Rpc.DJDICLKKCDF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DJDICLKKCDF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double kchhfnhinno_ ;
    /**
     * <code>double kchhfnhinno = 1;</code>
     * @return The kchhfnhinno.
     */
    public double getKchhfnhinno() {
      return kchhfnhinno_;
    }
    /**
     * <code>double kchhfnhinno = 1;</code>
     * @param value The kchhfnhinno to set.
     * @return This builder for chaining.
     */
    public Builder setKchhfnhinno(double value) {
      
      kchhfnhinno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double kchhfnhinno = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKchhfnhinno() {
      
      kchhfnhinno_ = 0D;
      onChanged();
      return this;
    }

    private double peffjhoggfd_ ;
    /**
     * <code>double peffjhoggfd = 2;</code>
     * @return The peffjhoggfd.
     */
    public double getPeffjhoggfd() {
      return peffjhoggfd_;
    }
    /**
     * <code>double peffjhoggfd = 2;</code>
     * @param value The peffjhoggfd to set.
     * @return This builder for chaining.
     */
    public Builder setPeffjhoggfd(double value) {
      
      peffjhoggfd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double peffjhoggfd = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPeffjhoggfd() {
      
      peffjhoggfd_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DJDICLKKCDF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DJDICLKKCDF)
  private static final POGOProtos.Rpc.DJDICLKKCDF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DJDICLKKCDF();
  }

  public static POGOProtos.Rpc.DJDICLKKCDF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DJDICLKKCDF>
      PARSER = new com.google.protobuf.AbstractParser<DJDICLKKCDF>() {
    @java.lang.Override
    public DJDICLKKCDF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DJDICLKKCDF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DJDICLKKCDF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DJDICLKKCDF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DJDICLKKCDF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

