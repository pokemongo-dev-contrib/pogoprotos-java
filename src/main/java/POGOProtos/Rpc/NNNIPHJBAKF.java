// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NNNIPHJBAKF
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NNNIPHJBAKF}
 */
public final class NNNIPHJBAKF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NNNIPHJBAKF)
    NNNIPHJBAKFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NNNIPHJBAKF.newBuilder() to construct.
  private NNNIPHJBAKF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NNNIPHJBAKF() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NNNIPHJBAKF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NNNIPHJBAKF(
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
            POGOProtos.Rpc.MLGCMCDKMNE.Builder subBuilder = null;
            if (igaehcifidf_ != null) {
              subBuilder = igaehcifidf_.toBuilder();
            }
            igaehcifidf_ = input.readMessage(POGOProtos.Rpc.MLGCMCDKMNE.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(igaehcifidf_);
              igaehcifidf_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            POGOProtos.Rpc.MLGCMCDKMNE.Builder subBuilder = null;
            if (kjjnmmehgmh_ != null) {
              subBuilder = kjjnmmehgmh_.toBuilder();
            }
            kjjnmmehgmh_ = input.readMessage(POGOProtos.Rpc.MLGCMCDKMNE.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(kjjnmmehgmh_);
              kjjnmmehgmh_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNNIPHJBAKF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNNIPHJBAKF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NNNIPHJBAKF.class, POGOProtos.Rpc.NNNIPHJBAKF.Builder.class);
  }

  public static final int IGAEHCIFIDF_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf_;
  /**
   * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 1;</code>
   * @return Whether the igaehcifidf field is set.
   */
  @java.lang.Override
  public boolean hasIgaehcifidf() {
    return igaehcifidf_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 1;</code>
   * @return The igaehcifidf.
   */
  @java.lang.Override
  public POGOProtos.Rpc.MLGCMCDKMNE getIgaehcifidf() {
    return igaehcifidf_ == null ? POGOProtos.Rpc.MLGCMCDKMNE.getDefaultInstance() : igaehcifidf_;
  }
  /**
   * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.MLGCMCDKMNEOrBuilder getIgaehcifidfOrBuilder() {
    return getIgaehcifidf();
  }

  public static final int KJJNMMEHGMH_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh_;
  /**
   * <code>.POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh = 2;</code>
   * @return Whether the kjjnmmehgmh field is set.
   */
  @java.lang.Override
  public boolean hasKjjnmmehgmh() {
    return kjjnmmehgmh_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh = 2;</code>
   * @return The kjjnmmehgmh.
   */
  @java.lang.Override
  public POGOProtos.Rpc.MLGCMCDKMNE getKjjnmmehgmh() {
    return kjjnmmehgmh_ == null ? POGOProtos.Rpc.MLGCMCDKMNE.getDefaultInstance() : kjjnmmehgmh_;
  }
  /**
   * <code>.POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.MLGCMCDKMNEOrBuilder getKjjnmmehgmhOrBuilder() {
    return getKjjnmmehgmh();
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
    if (igaehcifidf_ != null) {
      output.writeMessage(1, getIgaehcifidf());
    }
    if (kjjnmmehgmh_ != null) {
      output.writeMessage(2, getKjjnmmehgmh());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (igaehcifidf_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIgaehcifidf());
    }
    if (kjjnmmehgmh_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getKjjnmmehgmh());
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
    if (!(obj instanceof POGOProtos.Rpc.NNNIPHJBAKF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NNNIPHJBAKF other = (POGOProtos.Rpc.NNNIPHJBAKF) obj;

    if (hasIgaehcifidf() != other.hasIgaehcifidf()) return false;
    if (hasIgaehcifidf()) {
      if (!getIgaehcifidf()
          .equals(other.getIgaehcifidf())) return false;
    }
    if (hasKjjnmmehgmh() != other.hasKjjnmmehgmh()) return false;
    if (hasKjjnmmehgmh()) {
      if (!getKjjnmmehgmh()
          .equals(other.getKjjnmmehgmh())) return false;
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
    if (hasIgaehcifidf()) {
      hash = (37 * hash) + IGAEHCIFIDF_FIELD_NUMBER;
      hash = (53 * hash) + getIgaehcifidf().hashCode();
    }
    if (hasKjjnmmehgmh()) {
      hash = (37 * hash) + KJJNMMEHGMH_FIELD_NUMBER;
      hash = (53 * hash) + getKjjnmmehgmh().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NNNIPHJBAKF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NNNIPHJBAKF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNNIPHJBAKF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NNNIPHJBAKF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNNIPHJBAKF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NNNIPHJBAKF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNNIPHJBAKF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NNNIPHJBAKF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNNIPHJBAKF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NNNIPHJBAKF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NNNIPHJBAKF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NNNIPHJBAKF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NNNIPHJBAKF prototype) {
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
   * ref: NNNIPHJBAKF
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NNNIPHJBAKF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NNNIPHJBAKF)
      POGOProtos.Rpc.NNNIPHJBAKFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNNIPHJBAKF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNNIPHJBAKF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NNNIPHJBAKF.class, POGOProtos.Rpc.NNNIPHJBAKF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NNNIPHJBAKF.newBuilder()
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
      if (igaehcifidfBuilder_ == null) {
        igaehcifidf_ = null;
      } else {
        igaehcifidf_ = null;
        igaehcifidfBuilder_ = null;
      }
      if (kjjnmmehgmhBuilder_ == null) {
        kjjnmmehgmh_ = null;
      } else {
        kjjnmmehgmh_ = null;
        kjjnmmehgmhBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NNNIPHJBAKF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NNNIPHJBAKF getDefaultInstanceForType() {
      return POGOProtos.Rpc.NNNIPHJBAKF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NNNIPHJBAKF build() {
      POGOProtos.Rpc.NNNIPHJBAKF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NNNIPHJBAKF buildPartial() {
      POGOProtos.Rpc.NNNIPHJBAKF result = new POGOProtos.Rpc.NNNIPHJBAKF(this);
      if (igaehcifidfBuilder_ == null) {
        result.igaehcifidf_ = igaehcifidf_;
      } else {
        result.igaehcifidf_ = igaehcifidfBuilder_.build();
      }
      if (kjjnmmehgmhBuilder_ == null) {
        result.kjjnmmehgmh_ = kjjnmmehgmh_;
      } else {
        result.kjjnmmehgmh_ = kjjnmmehgmhBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.NNNIPHJBAKF) {
        return mergeFrom((POGOProtos.Rpc.NNNIPHJBAKF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NNNIPHJBAKF other) {
      if (other == POGOProtos.Rpc.NNNIPHJBAKF.getDefaultInstance()) return this;
      if (other.hasIgaehcifidf()) {
        mergeIgaehcifidf(other.getIgaehcifidf());
      }
      if (other.hasKjjnmmehgmh()) {
        mergeKjjnmmehgmh(other.getKjjnmmehgmh());
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
      POGOProtos.Rpc.NNNIPHJBAKF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NNNIPHJBAKF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.MLGCMCDKMNE, POGOProtos.Rpc.MLGCMCDKMNE.Builder, POGOProtos.Rpc.MLGCMCDKMNEOrBuilder> igaehcifidfBuilder_;
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 1;</code>
     * @return Whether the igaehcifidf field is set.
     */
    public boolean hasIgaehcifidf() {
      return igaehcifidfBuilder_ != null || igaehcifidf_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 1;</code>
     * @return The igaehcifidf.
     */
    public POGOProtos.Rpc.MLGCMCDKMNE getIgaehcifidf() {
      if (igaehcifidfBuilder_ == null) {
        return igaehcifidf_ == null ? POGOProtos.Rpc.MLGCMCDKMNE.getDefaultInstance() : igaehcifidf_;
      } else {
        return igaehcifidfBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 1;</code>
     */
    public Builder setIgaehcifidf(POGOProtos.Rpc.MLGCMCDKMNE value) {
      if (igaehcifidfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        igaehcifidf_ = value;
        onChanged();
      } else {
        igaehcifidfBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 1;</code>
     */
    public Builder setIgaehcifidf(
        POGOProtos.Rpc.MLGCMCDKMNE.Builder builderForValue) {
      if (igaehcifidfBuilder_ == null) {
        igaehcifidf_ = builderForValue.build();
        onChanged();
      } else {
        igaehcifidfBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 1;</code>
     */
    public Builder mergeIgaehcifidf(POGOProtos.Rpc.MLGCMCDKMNE value) {
      if (igaehcifidfBuilder_ == null) {
        if (igaehcifidf_ != null) {
          igaehcifidf_ =
            POGOProtos.Rpc.MLGCMCDKMNE.newBuilder(igaehcifidf_).mergeFrom(value).buildPartial();
        } else {
          igaehcifidf_ = value;
        }
        onChanged();
      } else {
        igaehcifidfBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 1;</code>
     */
    public Builder clearIgaehcifidf() {
      if (igaehcifidfBuilder_ == null) {
        igaehcifidf_ = null;
        onChanged();
      } else {
        igaehcifidf_ = null;
        igaehcifidfBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 1;</code>
     */
    public POGOProtos.Rpc.MLGCMCDKMNE.Builder getIgaehcifidfBuilder() {
      
      onChanged();
      return getIgaehcifidfFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 1;</code>
     */
    public POGOProtos.Rpc.MLGCMCDKMNEOrBuilder getIgaehcifidfOrBuilder() {
      if (igaehcifidfBuilder_ != null) {
        return igaehcifidfBuilder_.getMessageOrBuilder();
      } else {
        return igaehcifidf_ == null ?
            POGOProtos.Rpc.MLGCMCDKMNE.getDefaultInstance() : igaehcifidf_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE igaehcifidf = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.MLGCMCDKMNE, POGOProtos.Rpc.MLGCMCDKMNE.Builder, POGOProtos.Rpc.MLGCMCDKMNEOrBuilder> 
        getIgaehcifidfFieldBuilder() {
      if (igaehcifidfBuilder_ == null) {
        igaehcifidfBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.MLGCMCDKMNE, POGOProtos.Rpc.MLGCMCDKMNE.Builder, POGOProtos.Rpc.MLGCMCDKMNEOrBuilder>(
                getIgaehcifidf(),
                getParentForChildren(),
                isClean());
        igaehcifidf_ = null;
      }
      return igaehcifidfBuilder_;
    }

    private POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.MLGCMCDKMNE, POGOProtos.Rpc.MLGCMCDKMNE.Builder, POGOProtos.Rpc.MLGCMCDKMNEOrBuilder> kjjnmmehgmhBuilder_;
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh = 2;</code>
     * @return Whether the kjjnmmehgmh field is set.
     */
    public boolean hasKjjnmmehgmh() {
      return kjjnmmehgmhBuilder_ != null || kjjnmmehgmh_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh = 2;</code>
     * @return The kjjnmmehgmh.
     */
    public POGOProtos.Rpc.MLGCMCDKMNE getKjjnmmehgmh() {
      if (kjjnmmehgmhBuilder_ == null) {
        return kjjnmmehgmh_ == null ? POGOProtos.Rpc.MLGCMCDKMNE.getDefaultInstance() : kjjnmmehgmh_;
      } else {
        return kjjnmmehgmhBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh = 2;</code>
     */
    public Builder setKjjnmmehgmh(POGOProtos.Rpc.MLGCMCDKMNE value) {
      if (kjjnmmehgmhBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kjjnmmehgmh_ = value;
        onChanged();
      } else {
        kjjnmmehgmhBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh = 2;</code>
     */
    public Builder setKjjnmmehgmh(
        POGOProtos.Rpc.MLGCMCDKMNE.Builder builderForValue) {
      if (kjjnmmehgmhBuilder_ == null) {
        kjjnmmehgmh_ = builderForValue.build();
        onChanged();
      } else {
        kjjnmmehgmhBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh = 2;</code>
     */
    public Builder mergeKjjnmmehgmh(POGOProtos.Rpc.MLGCMCDKMNE value) {
      if (kjjnmmehgmhBuilder_ == null) {
        if (kjjnmmehgmh_ != null) {
          kjjnmmehgmh_ =
            POGOProtos.Rpc.MLGCMCDKMNE.newBuilder(kjjnmmehgmh_).mergeFrom(value).buildPartial();
        } else {
          kjjnmmehgmh_ = value;
        }
        onChanged();
      } else {
        kjjnmmehgmhBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh = 2;</code>
     */
    public Builder clearKjjnmmehgmh() {
      if (kjjnmmehgmhBuilder_ == null) {
        kjjnmmehgmh_ = null;
        onChanged();
      } else {
        kjjnmmehgmh_ = null;
        kjjnmmehgmhBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh = 2;</code>
     */
    public POGOProtos.Rpc.MLGCMCDKMNE.Builder getKjjnmmehgmhBuilder() {
      
      onChanged();
      return getKjjnmmehgmhFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh = 2;</code>
     */
    public POGOProtos.Rpc.MLGCMCDKMNEOrBuilder getKjjnmmehgmhOrBuilder() {
      if (kjjnmmehgmhBuilder_ != null) {
        return kjjnmmehgmhBuilder_.getMessageOrBuilder();
      } else {
        return kjjnmmehgmh_ == null ?
            POGOProtos.Rpc.MLGCMCDKMNE.getDefaultInstance() : kjjnmmehgmh_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.MLGCMCDKMNE kjjnmmehgmh = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.MLGCMCDKMNE, POGOProtos.Rpc.MLGCMCDKMNE.Builder, POGOProtos.Rpc.MLGCMCDKMNEOrBuilder> 
        getKjjnmmehgmhFieldBuilder() {
      if (kjjnmmehgmhBuilder_ == null) {
        kjjnmmehgmhBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.MLGCMCDKMNE, POGOProtos.Rpc.MLGCMCDKMNE.Builder, POGOProtos.Rpc.MLGCMCDKMNEOrBuilder>(
                getKjjnmmehgmh(),
                getParentForChildren(),
                isClean());
        kjjnmmehgmh_ = null;
      }
      return kjjnmmehgmhBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NNNIPHJBAKF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NNNIPHJBAKF)
  private static final POGOProtos.Rpc.NNNIPHJBAKF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NNNIPHJBAKF();
  }

  public static POGOProtos.Rpc.NNNIPHJBAKF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NNNIPHJBAKF>
      PARSER = new com.google.protobuf.AbstractParser<NNNIPHJBAKF>() {
    @java.lang.Override
    public NNNIPHJBAKF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NNNIPHJBAKF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NNNIPHJBAKF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NNNIPHJBAKF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NNNIPHJBAKF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

