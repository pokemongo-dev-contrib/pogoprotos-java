// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.FMANLOFEEGL}
 */
public  final class FMANLOFEEGL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FMANLOFEEGL)
    FMANLOFEEGLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FMANLOFEEGL.newBuilder() to construct.
  private FMANLOFEEGL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FMANLOFEEGL() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FMANLOFEEGL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FMANLOFEEGL(
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
            POGOProtos.Rpc.AOKHNAPPDNB.Builder subBuilder = null;
            if (bahbhdodnfp_ != null) {
              subBuilder = bahbhdodnfp_.toBuilder();
            }
            bahbhdodnfp_ = input.readMessage(POGOProtos.Rpc.AOKHNAPPDNB.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bahbhdodnfp_);
              bahbhdodnfp_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            POGOProtos.Rpc.OLCIDCHPGFJ.Builder subBuilder = null;
            if (knhigmehgei_ != null) {
              subBuilder = knhigmehgei_.toBuilder();
            }
            knhigmehgei_ = input.readMessage(POGOProtos.Rpc.OLCIDCHPGFJ.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(knhigmehgei_);
              knhigmehgei_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FMANLOFEEGL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FMANLOFEEGL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FMANLOFEEGL.class, POGOProtos.Rpc.FMANLOFEEGL.Builder.class);
  }

  public static final int BAHBHDODNFP_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp_;
  /**
   * <code>.POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp = 1;</code>
   * @return Whether the bahbhdodnfp field is set.
   */
  public boolean hasBahbhdodnfp() {
    return bahbhdodnfp_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp = 1;</code>
   * @return The bahbhdodnfp.
   */
  public POGOProtos.Rpc.AOKHNAPPDNB getBahbhdodnfp() {
    return bahbhdodnfp_ == null ? POGOProtos.Rpc.AOKHNAPPDNB.getDefaultInstance() : bahbhdodnfp_;
  }
  /**
   * <code>.POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp = 1;</code>
   */
  public POGOProtos.Rpc.AOKHNAPPDNBOrBuilder getBahbhdodnfpOrBuilder() {
    return getBahbhdodnfp();
  }

  public static final int KNHIGMEHGEI_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei_;
  /**
   * <code>.POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei = 2;</code>
   * @return Whether the knhigmehgei field is set.
   */
  public boolean hasKnhigmehgei() {
    return knhigmehgei_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei = 2;</code>
   * @return The knhigmehgei.
   */
  public POGOProtos.Rpc.OLCIDCHPGFJ getKnhigmehgei() {
    return knhigmehgei_ == null ? POGOProtos.Rpc.OLCIDCHPGFJ.getDefaultInstance() : knhigmehgei_;
  }
  /**
   * <code>.POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei = 2;</code>
   */
  public POGOProtos.Rpc.OLCIDCHPGFJOrBuilder getKnhigmehgeiOrBuilder() {
    return getKnhigmehgei();
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
    if (bahbhdodnfp_ != null) {
      output.writeMessage(1, getBahbhdodnfp());
    }
    if (knhigmehgei_ != null) {
      output.writeMessage(2, getKnhigmehgei());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bahbhdodnfp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBahbhdodnfp());
    }
    if (knhigmehgei_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getKnhigmehgei());
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
    if (!(obj instanceof POGOProtos.Rpc.FMANLOFEEGL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FMANLOFEEGL other = (POGOProtos.Rpc.FMANLOFEEGL) obj;

    if (hasBahbhdodnfp() != other.hasBahbhdodnfp()) return false;
    if (hasBahbhdodnfp()) {
      if (!getBahbhdodnfp()
          .equals(other.getBahbhdodnfp())) return false;
    }
    if (hasKnhigmehgei() != other.hasKnhigmehgei()) return false;
    if (hasKnhigmehgei()) {
      if (!getKnhigmehgei()
          .equals(other.getKnhigmehgei())) return false;
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
    if (hasBahbhdodnfp()) {
      hash = (37 * hash) + BAHBHDODNFP_FIELD_NUMBER;
      hash = (53 * hash) + getBahbhdodnfp().hashCode();
    }
    if (hasKnhigmehgei()) {
      hash = (37 * hash) + KNHIGMEHGEI_FIELD_NUMBER;
      hash = (53 * hash) + getKnhigmehgei().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FMANLOFEEGL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FMANLOFEEGL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FMANLOFEEGL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FMANLOFEEGL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FMANLOFEEGL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FMANLOFEEGL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FMANLOFEEGL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FMANLOFEEGL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FMANLOFEEGL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FMANLOFEEGL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FMANLOFEEGL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FMANLOFEEGL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FMANLOFEEGL prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.FMANLOFEEGL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FMANLOFEEGL)
      POGOProtos.Rpc.FMANLOFEEGLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FMANLOFEEGL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FMANLOFEEGL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FMANLOFEEGL.class, POGOProtos.Rpc.FMANLOFEEGL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FMANLOFEEGL.newBuilder()
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
      if (bahbhdodnfpBuilder_ == null) {
        bahbhdodnfp_ = null;
      } else {
        bahbhdodnfp_ = null;
        bahbhdodnfpBuilder_ = null;
      }
      if (knhigmehgeiBuilder_ == null) {
        knhigmehgei_ = null;
      } else {
        knhigmehgei_ = null;
        knhigmehgeiBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_FMANLOFEEGL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FMANLOFEEGL getDefaultInstanceForType() {
      return POGOProtos.Rpc.FMANLOFEEGL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FMANLOFEEGL build() {
      POGOProtos.Rpc.FMANLOFEEGL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FMANLOFEEGL buildPartial() {
      POGOProtos.Rpc.FMANLOFEEGL result = new POGOProtos.Rpc.FMANLOFEEGL(this);
      if (bahbhdodnfpBuilder_ == null) {
        result.bahbhdodnfp_ = bahbhdodnfp_;
      } else {
        result.bahbhdodnfp_ = bahbhdodnfpBuilder_.build();
      }
      if (knhigmehgeiBuilder_ == null) {
        result.knhigmehgei_ = knhigmehgei_;
      } else {
        result.knhigmehgei_ = knhigmehgeiBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.FMANLOFEEGL) {
        return mergeFrom((POGOProtos.Rpc.FMANLOFEEGL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FMANLOFEEGL other) {
      if (other == POGOProtos.Rpc.FMANLOFEEGL.getDefaultInstance()) return this;
      if (other.hasBahbhdodnfp()) {
        mergeBahbhdodnfp(other.getBahbhdodnfp());
      }
      if (other.hasKnhigmehgei()) {
        mergeKnhigmehgei(other.getKnhigmehgei());
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
      POGOProtos.Rpc.FMANLOFEEGL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FMANLOFEEGL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AOKHNAPPDNB, POGOProtos.Rpc.AOKHNAPPDNB.Builder, POGOProtos.Rpc.AOKHNAPPDNBOrBuilder> bahbhdodnfpBuilder_;
    /**
     * <code>.POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp = 1;</code>
     * @return Whether the bahbhdodnfp field is set.
     */
    public boolean hasBahbhdodnfp() {
      return bahbhdodnfpBuilder_ != null || bahbhdodnfp_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp = 1;</code>
     * @return The bahbhdodnfp.
     */
    public POGOProtos.Rpc.AOKHNAPPDNB getBahbhdodnfp() {
      if (bahbhdodnfpBuilder_ == null) {
        return bahbhdodnfp_ == null ? POGOProtos.Rpc.AOKHNAPPDNB.getDefaultInstance() : bahbhdodnfp_;
      } else {
        return bahbhdodnfpBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp = 1;</code>
     */
    public Builder setBahbhdodnfp(POGOProtos.Rpc.AOKHNAPPDNB value) {
      if (bahbhdodnfpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bahbhdodnfp_ = value;
        onChanged();
      } else {
        bahbhdodnfpBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp = 1;</code>
     */
    public Builder setBahbhdodnfp(
        POGOProtos.Rpc.AOKHNAPPDNB.Builder builderForValue) {
      if (bahbhdodnfpBuilder_ == null) {
        bahbhdodnfp_ = builderForValue.build();
        onChanged();
      } else {
        bahbhdodnfpBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp = 1;</code>
     */
    public Builder mergeBahbhdodnfp(POGOProtos.Rpc.AOKHNAPPDNB value) {
      if (bahbhdodnfpBuilder_ == null) {
        if (bahbhdodnfp_ != null) {
          bahbhdodnfp_ =
            POGOProtos.Rpc.AOKHNAPPDNB.newBuilder(bahbhdodnfp_).mergeFrom(value).buildPartial();
        } else {
          bahbhdodnfp_ = value;
        }
        onChanged();
      } else {
        bahbhdodnfpBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp = 1;</code>
     */
    public Builder clearBahbhdodnfp() {
      if (bahbhdodnfpBuilder_ == null) {
        bahbhdodnfp_ = null;
        onChanged();
      } else {
        bahbhdodnfp_ = null;
        bahbhdodnfpBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp = 1;</code>
     */
    public POGOProtos.Rpc.AOKHNAPPDNB.Builder getBahbhdodnfpBuilder() {
      
      onChanged();
      return getBahbhdodnfpFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp = 1;</code>
     */
    public POGOProtos.Rpc.AOKHNAPPDNBOrBuilder getBahbhdodnfpOrBuilder() {
      if (bahbhdodnfpBuilder_ != null) {
        return bahbhdodnfpBuilder_.getMessageOrBuilder();
      } else {
        return bahbhdodnfp_ == null ?
            POGOProtos.Rpc.AOKHNAPPDNB.getDefaultInstance() : bahbhdodnfp_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AOKHNAPPDNB bahbhdodnfp = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AOKHNAPPDNB, POGOProtos.Rpc.AOKHNAPPDNB.Builder, POGOProtos.Rpc.AOKHNAPPDNBOrBuilder> 
        getBahbhdodnfpFieldBuilder() {
      if (bahbhdodnfpBuilder_ == null) {
        bahbhdodnfpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.AOKHNAPPDNB, POGOProtos.Rpc.AOKHNAPPDNB.Builder, POGOProtos.Rpc.AOKHNAPPDNBOrBuilder>(
                getBahbhdodnfp(),
                getParentForChildren(),
                isClean());
        bahbhdodnfp_ = null;
      }
      return bahbhdodnfpBuilder_;
    }

    private POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.OLCIDCHPGFJ, POGOProtos.Rpc.OLCIDCHPGFJ.Builder, POGOProtos.Rpc.OLCIDCHPGFJOrBuilder> knhigmehgeiBuilder_;
    /**
     * <code>.POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei = 2;</code>
     * @return Whether the knhigmehgei field is set.
     */
    public boolean hasKnhigmehgei() {
      return knhigmehgeiBuilder_ != null || knhigmehgei_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei = 2;</code>
     * @return The knhigmehgei.
     */
    public POGOProtos.Rpc.OLCIDCHPGFJ getKnhigmehgei() {
      if (knhigmehgeiBuilder_ == null) {
        return knhigmehgei_ == null ? POGOProtos.Rpc.OLCIDCHPGFJ.getDefaultInstance() : knhigmehgei_;
      } else {
        return knhigmehgeiBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei = 2;</code>
     */
    public Builder setKnhigmehgei(POGOProtos.Rpc.OLCIDCHPGFJ value) {
      if (knhigmehgeiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        knhigmehgei_ = value;
        onChanged();
      } else {
        knhigmehgeiBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei = 2;</code>
     */
    public Builder setKnhigmehgei(
        POGOProtos.Rpc.OLCIDCHPGFJ.Builder builderForValue) {
      if (knhigmehgeiBuilder_ == null) {
        knhigmehgei_ = builderForValue.build();
        onChanged();
      } else {
        knhigmehgeiBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei = 2;</code>
     */
    public Builder mergeKnhigmehgei(POGOProtos.Rpc.OLCIDCHPGFJ value) {
      if (knhigmehgeiBuilder_ == null) {
        if (knhigmehgei_ != null) {
          knhigmehgei_ =
            POGOProtos.Rpc.OLCIDCHPGFJ.newBuilder(knhigmehgei_).mergeFrom(value).buildPartial();
        } else {
          knhigmehgei_ = value;
        }
        onChanged();
      } else {
        knhigmehgeiBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei = 2;</code>
     */
    public Builder clearKnhigmehgei() {
      if (knhigmehgeiBuilder_ == null) {
        knhigmehgei_ = null;
        onChanged();
      } else {
        knhigmehgei_ = null;
        knhigmehgeiBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei = 2;</code>
     */
    public POGOProtos.Rpc.OLCIDCHPGFJ.Builder getKnhigmehgeiBuilder() {
      
      onChanged();
      return getKnhigmehgeiFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei = 2;</code>
     */
    public POGOProtos.Rpc.OLCIDCHPGFJOrBuilder getKnhigmehgeiOrBuilder() {
      if (knhigmehgeiBuilder_ != null) {
        return knhigmehgeiBuilder_.getMessageOrBuilder();
      } else {
        return knhigmehgei_ == null ?
            POGOProtos.Rpc.OLCIDCHPGFJ.getDefaultInstance() : knhigmehgei_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.OLCIDCHPGFJ knhigmehgei = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.OLCIDCHPGFJ, POGOProtos.Rpc.OLCIDCHPGFJ.Builder, POGOProtos.Rpc.OLCIDCHPGFJOrBuilder> 
        getKnhigmehgeiFieldBuilder() {
      if (knhigmehgeiBuilder_ == null) {
        knhigmehgeiBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.OLCIDCHPGFJ, POGOProtos.Rpc.OLCIDCHPGFJ.Builder, POGOProtos.Rpc.OLCIDCHPGFJOrBuilder>(
                getKnhigmehgei(),
                getParentForChildren(),
                isClean());
        knhigmehgei_ = null;
      }
      return knhigmehgeiBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FMANLOFEEGL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FMANLOFEEGL)
  private static final POGOProtos.Rpc.FMANLOFEEGL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FMANLOFEEGL();
  }

  public static POGOProtos.Rpc.FMANLOFEEGL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FMANLOFEEGL>
      PARSER = new com.google.protobuf.AbstractParser<FMANLOFEEGL>() {
    @java.lang.Override
    public FMANLOFEEGL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FMANLOFEEGL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FMANLOFEEGL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FMANLOFEEGL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FMANLOFEEGL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

