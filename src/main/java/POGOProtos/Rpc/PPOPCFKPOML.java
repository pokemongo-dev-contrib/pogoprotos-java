// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PPOPCFKPOML
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PPOPCFKPOML}
 */
public final class PPOPCFKPOML extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PPOPCFKPOML)
    PPOPCFKPOMLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PPOPCFKPOML.newBuilder() to construct.
  private PPOPCFKPOML(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PPOPCFKPOML() {
    igaehcifidf_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PPOPCFKPOML();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PPOPCFKPOML(
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

            igaehcifidf_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.ABJHHFLGDFD.Builder subBuilder = null;
            if (cgjbmmkojfl_ != null) {
              subBuilder = cgjbmmkojfl_.toBuilder();
            }
            cgjbmmkojfl_ = input.readMessage(POGOProtos.Rpc.ABJHHFLGDFD.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cgjbmmkojfl_);
              cgjbmmkojfl_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PPOPCFKPOML_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PPOPCFKPOML_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PPOPCFKPOML.class, POGOProtos.Rpc.PPOPCFKPOML.Builder.class);
  }

  public static final int IGAEHCIFIDF_FIELD_NUMBER = 1;
  private int igaehcifidf_;
  /**
   * <code>.POGOProtos.Rpc.PNJAAHNHPDB igaehcifidf = 1;</code>
   * @return The enum numeric value on the wire for igaehcifidf.
   */
  @java.lang.Override public int getIgaehcifidfValue() {
    return igaehcifidf_;
  }
  /**
   * <code>.POGOProtos.Rpc.PNJAAHNHPDB igaehcifidf = 1;</code>
   * @return The igaehcifidf.
   */
  @java.lang.Override public POGOProtos.Rpc.PNJAAHNHPDB getIgaehcifidf() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PNJAAHNHPDB result = POGOProtos.Rpc.PNJAAHNHPDB.valueOf(igaehcifidf_);
    return result == null ? POGOProtos.Rpc.PNJAAHNHPDB.UNRECOGNIZED : result;
  }

  public static final int CGJBMMKOJFL_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl_;
  /**
   * <code>.POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl = 2;</code>
   * @return Whether the cgjbmmkojfl field is set.
   */
  @java.lang.Override
  public boolean hasCgjbmmkojfl() {
    return cgjbmmkojfl_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl = 2;</code>
   * @return The cgjbmmkojfl.
   */
  @java.lang.Override
  public POGOProtos.Rpc.ABJHHFLGDFD getCgjbmmkojfl() {
    return cgjbmmkojfl_ == null ? POGOProtos.Rpc.ABJHHFLGDFD.getDefaultInstance() : cgjbmmkojfl_;
  }
  /**
   * <code>.POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ABJHHFLGDFDOrBuilder getCgjbmmkojflOrBuilder() {
    return getCgjbmmkojfl();
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
    if (igaehcifidf_ != POGOProtos.Rpc.PNJAAHNHPDB.PNJAAHNHPDB_POKEMON_UNSET.getNumber()) {
      output.writeEnum(1, igaehcifidf_);
    }
    if (cgjbmmkojfl_ != null) {
      output.writeMessage(2, getCgjbmmkojfl());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (igaehcifidf_ != POGOProtos.Rpc.PNJAAHNHPDB.PNJAAHNHPDB_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, igaehcifidf_);
    }
    if (cgjbmmkojfl_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCgjbmmkojfl());
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
    if (!(obj instanceof POGOProtos.Rpc.PPOPCFKPOML)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PPOPCFKPOML other = (POGOProtos.Rpc.PPOPCFKPOML) obj;

    if (igaehcifidf_ != other.igaehcifidf_) return false;
    if (hasCgjbmmkojfl() != other.hasCgjbmmkojfl()) return false;
    if (hasCgjbmmkojfl()) {
      if (!getCgjbmmkojfl()
          .equals(other.getCgjbmmkojfl())) return false;
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
    hash = (37 * hash) + IGAEHCIFIDF_FIELD_NUMBER;
    hash = (53 * hash) + igaehcifidf_;
    if (hasCgjbmmkojfl()) {
      hash = (37 * hash) + CGJBMMKOJFL_FIELD_NUMBER;
      hash = (53 * hash) + getCgjbmmkojfl().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PPOPCFKPOML parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PPOPCFKPOML parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PPOPCFKPOML parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PPOPCFKPOML parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PPOPCFKPOML parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PPOPCFKPOML parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PPOPCFKPOML parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PPOPCFKPOML parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PPOPCFKPOML parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PPOPCFKPOML parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PPOPCFKPOML parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PPOPCFKPOML parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PPOPCFKPOML prototype) {
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
   * ref: PPOPCFKPOML
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PPOPCFKPOML}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PPOPCFKPOML)
      POGOProtos.Rpc.PPOPCFKPOMLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PPOPCFKPOML_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PPOPCFKPOML_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PPOPCFKPOML.class, POGOProtos.Rpc.PPOPCFKPOML.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PPOPCFKPOML.newBuilder()
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
      igaehcifidf_ = 0;

      if (cgjbmmkojflBuilder_ == null) {
        cgjbmmkojfl_ = null;
      } else {
        cgjbmmkojfl_ = null;
        cgjbmmkojflBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PPOPCFKPOML_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PPOPCFKPOML getDefaultInstanceForType() {
      return POGOProtos.Rpc.PPOPCFKPOML.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PPOPCFKPOML build() {
      POGOProtos.Rpc.PPOPCFKPOML result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PPOPCFKPOML buildPartial() {
      POGOProtos.Rpc.PPOPCFKPOML result = new POGOProtos.Rpc.PPOPCFKPOML(this);
      result.igaehcifidf_ = igaehcifidf_;
      if (cgjbmmkojflBuilder_ == null) {
        result.cgjbmmkojfl_ = cgjbmmkojfl_;
      } else {
        result.cgjbmmkojfl_ = cgjbmmkojflBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PPOPCFKPOML) {
        return mergeFrom((POGOProtos.Rpc.PPOPCFKPOML)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PPOPCFKPOML other) {
      if (other == POGOProtos.Rpc.PPOPCFKPOML.getDefaultInstance()) return this;
      if (other.igaehcifidf_ != 0) {
        setIgaehcifidfValue(other.getIgaehcifidfValue());
      }
      if (other.hasCgjbmmkojfl()) {
        mergeCgjbmmkojfl(other.getCgjbmmkojfl());
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
      POGOProtos.Rpc.PPOPCFKPOML parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PPOPCFKPOML) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int igaehcifidf_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PNJAAHNHPDB igaehcifidf = 1;</code>
     * @return The enum numeric value on the wire for igaehcifidf.
     */
    @java.lang.Override public int getIgaehcifidfValue() {
      return igaehcifidf_;
    }
    /**
     * <code>.POGOProtos.Rpc.PNJAAHNHPDB igaehcifidf = 1;</code>
     * @param value The enum numeric value on the wire for igaehcifidf to set.
     * @return This builder for chaining.
     */
    public Builder setIgaehcifidfValue(int value) {
      
      igaehcifidf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PNJAAHNHPDB igaehcifidf = 1;</code>
     * @return The igaehcifidf.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PNJAAHNHPDB getIgaehcifidf() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PNJAAHNHPDB result = POGOProtos.Rpc.PNJAAHNHPDB.valueOf(igaehcifidf_);
      return result == null ? POGOProtos.Rpc.PNJAAHNHPDB.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PNJAAHNHPDB igaehcifidf = 1;</code>
     * @param value The igaehcifidf to set.
     * @return This builder for chaining.
     */
    public Builder setIgaehcifidf(POGOProtos.Rpc.PNJAAHNHPDB value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      igaehcifidf_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PNJAAHNHPDB igaehcifidf = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIgaehcifidf() {
      
      igaehcifidf_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ABJHHFLGDFD, POGOProtos.Rpc.ABJHHFLGDFD.Builder, POGOProtos.Rpc.ABJHHFLGDFDOrBuilder> cgjbmmkojflBuilder_;
    /**
     * <code>.POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl = 2;</code>
     * @return Whether the cgjbmmkojfl field is set.
     */
    public boolean hasCgjbmmkojfl() {
      return cgjbmmkojflBuilder_ != null || cgjbmmkojfl_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl = 2;</code>
     * @return The cgjbmmkojfl.
     */
    public POGOProtos.Rpc.ABJHHFLGDFD getCgjbmmkojfl() {
      if (cgjbmmkojflBuilder_ == null) {
        return cgjbmmkojfl_ == null ? POGOProtos.Rpc.ABJHHFLGDFD.getDefaultInstance() : cgjbmmkojfl_;
      } else {
        return cgjbmmkojflBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl = 2;</code>
     */
    public Builder setCgjbmmkojfl(POGOProtos.Rpc.ABJHHFLGDFD value) {
      if (cgjbmmkojflBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cgjbmmkojfl_ = value;
        onChanged();
      } else {
        cgjbmmkojflBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl = 2;</code>
     */
    public Builder setCgjbmmkojfl(
        POGOProtos.Rpc.ABJHHFLGDFD.Builder builderForValue) {
      if (cgjbmmkojflBuilder_ == null) {
        cgjbmmkojfl_ = builderForValue.build();
        onChanged();
      } else {
        cgjbmmkojflBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl = 2;</code>
     */
    public Builder mergeCgjbmmkojfl(POGOProtos.Rpc.ABJHHFLGDFD value) {
      if (cgjbmmkojflBuilder_ == null) {
        if (cgjbmmkojfl_ != null) {
          cgjbmmkojfl_ =
            POGOProtos.Rpc.ABJHHFLGDFD.newBuilder(cgjbmmkojfl_).mergeFrom(value).buildPartial();
        } else {
          cgjbmmkojfl_ = value;
        }
        onChanged();
      } else {
        cgjbmmkojflBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl = 2;</code>
     */
    public Builder clearCgjbmmkojfl() {
      if (cgjbmmkojflBuilder_ == null) {
        cgjbmmkojfl_ = null;
        onChanged();
      } else {
        cgjbmmkojfl_ = null;
        cgjbmmkojflBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl = 2;</code>
     */
    public POGOProtos.Rpc.ABJHHFLGDFD.Builder getCgjbmmkojflBuilder() {
      
      onChanged();
      return getCgjbmmkojflFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl = 2;</code>
     */
    public POGOProtos.Rpc.ABJHHFLGDFDOrBuilder getCgjbmmkojflOrBuilder() {
      if (cgjbmmkojflBuilder_ != null) {
        return cgjbmmkojflBuilder_.getMessageOrBuilder();
      } else {
        return cgjbmmkojfl_ == null ?
            POGOProtos.Rpc.ABJHHFLGDFD.getDefaultInstance() : cgjbmmkojfl_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ABJHHFLGDFD cgjbmmkojfl = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ABJHHFLGDFD, POGOProtos.Rpc.ABJHHFLGDFD.Builder, POGOProtos.Rpc.ABJHHFLGDFDOrBuilder> 
        getCgjbmmkojflFieldBuilder() {
      if (cgjbmmkojflBuilder_ == null) {
        cgjbmmkojflBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.ABJHHFLGDFD, POGOProtos.Rpc.ABJHHFLGDFD.Builder, POGOProtos.Rpc.ABJHHFLGDFDOrBuilder>(
                getCgjbmmkojfl(),
                getParentForChildren(),
                isClean());
        cgjbmmkojfl_ = null;
      }
      return cgjbmmkojflBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PPOPCFKPOML)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PPOPCFKPOML)
  private static final POGOProtos.Rpc.PPOPCFKPOML DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PPOPCFKPOML();
  }

  public static POGOProtos.Rpc.PPOPCFKPOML getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PPOPCFKPOML>
      PARSER = new com.google.protobuf.AbstractParser<PPOPCFKPOML>() {
    @java.lang.Override
    public PPOPCFKPOML parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PPOPCFKPOML(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PPOPCFKPOML> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PPOPCFKPOML> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PPOPCFKPOML getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

