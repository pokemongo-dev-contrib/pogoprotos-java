// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CKPOHJNIFCJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CKPOHJNIFCJ}
 */
public final class CKPOHJNIFCJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CKPOHJNIFCJ)
    CKPOHJNIFCJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CKPOHJNIFCJ.newBuilder() to construct.
  private CKPOHJNIFCJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CKPOHJNIFCJ() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CKPOHJNIFCJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CKPOHJNIFCJ(
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
            POGOProtos.Rpc.IPCLFFGLICM.Builder subBuilder = null;
            if (llblohhnkcg_ != null) {
              subBuilder = llblohhnkcg_.toBuilder();
            }
            llblohhnkcg_ = input.readMessage(POGOProtos.Rpc.IPCLFFGLICM.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(llblohhnkcg_);
              llblohhnkcg_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            POGOProtos.Rpc.DECONFPPKLA.Builder subBuilder = null;
            if (heiapfnloio_ != null) {
              subBuilder = heiapfnloio_.toBuilder();
            }
            heiapfnloio_ = input.readMessage(POGOProtos.Rpc.DECONFPPKLA.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(heiapfnloio_);
              heiapfnloio_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            POGOProtos.Rpc.FLEJIPPCOHB.Builder subBuilder = null;
            if (dfbkbddgjmh_ != null) {
              subBuilder = dfbkbddgjmh_.toBuilder();
            }
            dfbkbddgjmh_ = input.readMessage(POGOProtos.Rpc.FLEJIPPCOHB.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dfbkbddgjmh_);
              dfbkbddgjmh_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKPOHJNIFCJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKPOHJNIFCJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CKPOHJNIFCJ.class, POGOProtos.Rpc.CKPOHJNIFCJ.Builder.class);
  }

  public static final int LLBLOHHNKCG_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg_;
  /**
   * <code>.POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg = 1;</code>
   * @return Whether the llblohhnkcg field is set.
   */
  @java.lang.Override
  public boolean hasLlblohhnkcg() {
    return llblohhnkcg_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg = 1;</code>
   * @return The llblohhnkcg.
   */
  @java.lang.Override
  public POGOProtos.Rpc.IPCLFFGLICM getLlblohhnkcg() {
    return llblohhnkcg_ == null ? POGOProtos.Rpc.IPCLFFGLICM.getDefaultInstance() : llblohhnkcg_;
  }
  /**
   * <code>.POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.IPCLFFGLICMOrBuilder getLlblohhnkcgOrBuilder() {
    return getLlblohhnkcg();
  }

  public static final int HEIAPFNLOIO_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.DECONFPPKLA heiapfnloio_;
  /**
   * <code>.POGOProtos.Rpc.DECONFPPKLA heiapfnloio = 2;</code>
   * @return Whether the heiapfnloio field is set.
   */
  @java.lang.Override
  public boolean hasHeiapfnloio() {
    return heiapfnloio_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.DECONFPPKLA heiapfnloio = 2;</code>
   * @return The heiapfnloio.
   */
  @java.lang.Override
  public POGOProtos.Rpc.DECONFPPKLA getHeiapfnloio() {
    return heiapfnloio_ == null ? POGOProtos.Rpc.DECONFPPKLA.getDefaultInstance() : heiapfnloio_;
  }
  /**
   * <code>.POGOProtos.Rpc.DECONFPPKLA heiapfnloio = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.DECONFPPKLAOrBuilder getHeiapfnloioOrBuilder() {
    return getHeiapfnloio();
  }

  public static final int DFBKBDDGJMH_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh_;
  /**
   * <code>.POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh = 3;</code>
   * @return Whether the dfbkbddgjmh field is set.
   */
  @java.lang.Override
  public boolean hasDfbkbddgjmh() {
    return dfbkbddgjmh_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh = 3;</code>
   * @return The dfbkbddgjmh.
   */
  @java.lang.Override
  public POGOProtos.Rpc.FLEJIPPCOHB getDfbkbddgjmh() {
    return dfbkbddgjmh_ == null ? POGOProtos.Rpc.FLEJIPPCOHB.getDefaultInstance() : dfbkbddgjmh_;
  }
  /**
   * <code>.POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.FLEJIPPCOHBOrBuilder getDfbkbddgjmhOrBuilder() {
    return getDfbkbddgjmh();
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
    if (llblohhnkcg_ != null) {
      output.writeMessage(1, getLlblohhnkcg());
    }
    if (heiapfnloio_ != null) {
      output.writeMessage(2, getHeiapfnloio());
    }
    if (dfbkbddgjmh_ != null) {
      output.writeMessage(3, getDfbkbddgjmh());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (llblohhnkcg_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLlblohhnkcg());
    }
    if (heiapfnloio_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHeiapfnloio());
    }
    if (dfbkbddgjmh_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDfbkbddgjmh());
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
    if (!(obj instanceof POGOProtos.Rpc.CKPOHJNIFCJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CKPOHJNIFCJ other = (POGOProtos.Rpc.CKPOHJNIFCJ) obj;

    if (hasLlblohhnkcg() != other.hasLlblohhnkcg()) return false;
    if (hasLlblohhnkcg()) {
      if (!getLlblohhnkcg()
          .equals(other.getLlblohhnkcg())) return false;
    }
    if (hasHeiapfnloio() != other.hasHeiapfnloio()) return false;
    if (hasHeiapfnloio()) {
      if (!getHeiapfnloio()
          .equals(other.getHeiapfnloio())) return false;
    }
    if (hasDfbkbddgjmh() != other.hasDfbkbddgjmh()) return false;
    if (hasDfbkbddgjmh()) {
      if (!getDfbkbddgjmh()
          .equals(other.getDfbkbddgjmh())) return false;
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
    if (hasLlblohhnkcg()) {
      hash = (37 * hash) + LLBLOHHNKCG_FIELD_NUMBER;
      hash = (53 * hash) + getLlblohhnkcg().hashCode();
    }
    if (hasHeiapfnloio()) {
      hash = (37 * hash) + HEIAPFNLOIO_FIELD_NUMBER;
      hash = (53 * hash) + getHeiapfnloio().hashCode();
    }
    if (hasDfbkbddgjmh()) {
      hash = (37 * hash) + DFBKBDDGJMH_FIELD_NUMBER;
      hash = (53 * hash) + getDfbkbddgjmh().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CKPOHJNIFCJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKPOHJNIFCJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKPOHJNIFCJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKPOHJNIFCJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKPOHJNIFCJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKPOHJNIFCJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKPOHJNIFCJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKPOHJNIFCJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKPOHJNIFCJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKPOHJNIFCJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKPOHJNIFCJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKPOHJNIFCJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CKPOHJNIFCJ prototype) {
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
   * ref: CKPOHJNIFCJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CKPOHJNIFCJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CKPOHJNIFCJ)
      POGOProtos.Rpc.CKPOHJNIFCJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKPOHJNIFCJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKPOHJNIFCJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CKPOHJNIFCJ.class, POGOProtos.Rpc.CKPOHJNIFCJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CKPOHJNIFCJ.newBuilder()
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
      if (llblohhnkcgBuilder_ == null) {
        llblohhnkcg_ = null;
      } else {
        llblohhnkcg_ = null;
        llblohhnkcgBuilder_ = null;
      }
      if (heiapfnloioBuilder_ == null) {
        heiapfnloio_ = null;
      } else {
        heiapfnloio_ = null;
        heiapfnloioBuilder_ = null;
      }
      if (dfbkbddgjmhBuilder_ == null) {
        dfbkbddgjmh_ = null;
      } else {
        dfbkbddgjmh_ = null;
        dfbkbddgjmhBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKPOHJNIFCJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKPOHJNIFCJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.CKPOHJNIFCJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKPOHJNIFCJ build() {
      POGOProtos.Rpc.CKPOHJNIFCJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKPOHJNIFCJ buildPartial() {
      POGOProtos.Rpc.CKPOHJNIFCJ result = new POGOProtos.Rpc.CKPOHJNIFCJ(this);
      if (llblohhnkcgBuilder_ == null) {
        result.llblohhnkcg_ = llblohhnkcg_;
      } else {
        result.llblohhnkcg_ = llblohhnkcgBuilder_.build();
      }
      if (heiapfnloioBuilder_ == null) {
        result.heiapfnloio_ = heiapfnloio_;
      } else {
        result.heiapfnloio_ = heiapfnloioBuilder_.build();
      }
      if (dfbkbddgjmhBuilder_ == null) {
        result.dfbkbddgjmh_ = dfbkbddgjmh_;
      } else {
        result.dfbkbddgjmh_ = dfbkbddgjmhBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.CKPOHJNIFCJ) {
        return mergeFrom((POGOProtos.Rpc.CKPOHJNIFCJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CKPOHJNIFCJ other) {
      if (other == POGOProtos.Rpc.CKPOHJNIFCJ.getDefaultInstance()) return this;
      if (other.hasLlblohhnkcg()) {
        mergeLlblohhnkcg(other.getLlblohhnkcg());
      }
      if (other.hasHeiapfnloio()) {
        mergeHeiapfnloio(other.getHeiapfnloio());
      }
      if (other.hasDfbkbddgjmh()) {
        mergeDfbkbddgjmh(other.getDfbkbddgjmh());
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
      POGOProtos.Rpc.CKPOHJNIFCJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CKPOHJNIFCJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.IPCLFFGLICM, POGOProtos.Rpc.IPCLFFGLICM.Builder, POGOProtos.Rpc.IPCLFFGLICMOrBuilder> llblohhnkcgBuilder_;
    /**
     * <code>.POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg = 1;</code>
     * @return Whether the llblohhnkcg field is set.
     */
    public boolean hasLlblohhnkcg() {
      return llblohhnkcgBuilder_ != null || llblohhnkcg_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg = 1;</code>
     * @return The llblohhnkcg.
     */
    public POGOProtos.Rpc.IPCLFFGLICM getLlblohhnkcg() {
      if (llblohhnkcgBuilder_ == null) {
        return llblohhnkcg_ == null ? POGOProtos.Rpc.IPCLFFGLICM.getDefaultInstance() : llblohhnkcg_;
      } else {
        return llblohhnkcgBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg = 1;</code>
     */
    public Builder setLlblohhnkcg(POGOProtos.Rpc.IPCLFFGLICM value) {
      if (llblohhnkcgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        llblohhnkcg_ = value;
        onChanged();
      } else {
        llblohhnkcgBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg = 1;</code>
     */
    public Builder setLlblohhnkcg(
        POGOProtos.Rpc.IPCLFFGLICM.Builder builderForValue) {
      if (llblohhnkcgBuilder_ == null) {
        llblohhnkcg_ = builderForValue.build();
        onChanged();
      } else {
        llblohhnkcgBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg = 1;</code>
     */
    public Builder mergeLlblohhnkcg(POGOProtos.Rpc.IPCLFFGLICM value) {
      if (llblohhnkcgBuilder_ == null) {
        if (llblohhnkcg_ != null) {
          llblohhnkcg_ =
            POGOProtos.Rpc.IPCLFFGLICM.newBuilder(llblohhnkcg_).mergeFrom(value).buildPartial();
        } else {
          llblohhnkcg_ = value;
        }
        onChanged();
      } else {
        llblohhnkcgBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg = 1;</code>
     */
    public Builder clearLlblohhnkcg() {
      if (llblohhnkcgBuilder_ == null) {
        llblohhnkcg_ = null;
        onChanged();
      } else {
        llblohhnkcg_ = null;
        llblohhnkcgBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg = 1;</code>
     */
    public POGOProtos.Rpc.IPCLFFGLICM.Builder getLlblohhnkcgBuilder() {
      
      onChanged();
      return getLlblohhnkcgFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg = 1;</code>
     */
    public POGOProtos.Rpc.IPCLFFGLICMOrBuilder getLlblohhnkcgOrBuilder() {
      if (llblohhnkcgBuilder_ != null) {
        return llblohhnkcgBuilder_.getMessageOrBuilder();
      } else {
        return llblohhnkcg_ == null ?
            POGOProtos.Rpc.IPCLFFGLICM.getDefaultInstance() : llblohhnkcg_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.IPCLFFGLICM llblohhnkcg = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.IPCLFFGLICM, POGOProtos.Rpc.IPCLFFGLICM.Builder, POGOProtos.Rpc.IPCLFFGLICMOrBuilder> 
        getLlblohhnkcgFieldBuilder() {
      if (llblohhnkcgBuilder_ == null) {
        llblohhnkcgBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.IPCLFFGLICM, POGOProtos.Rpc.IPCLFFGLICM.Builder, POGOProtos.Rpc.IPCLFFGLICMOrBuilder>(
                getLlblohhnkcg(),
                getParentForChildren(),
                isClean());
        llblohhnkcg_ = null;
      }
      return llblohhnkcgBuilder_;
    }

    private POGOProtos.Rpc.DECONFPPKLA heiapfnloio_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.DECONFPPKLA, POGOProtos.Rpc.DECONFPPKLA.Builder, POGOProtos.Rpc.DECONFPPKLAOrBuilder> heiapfnloioBuilder_;
    /**
     * <code>.POGOProtos.Rpc.DECONFPPKLA heiapfnloio = 2;</code>
     * @return Whether the heiapfnloio field is set.
     */
    public boolean hasHeiapfnloio() {
      return heiapfnloioBuilder_ != null || heiapfnloio_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.DECONFPPKLA heiapfnloio = 2;</code>
     * @return The heiapfnloio.
     */
    public POGOProtos.Rpc.DECONFPPKLA getHeiapfnloio() {
      if (heiapfnloioBuilder_ == null) {
        return heiapfnloio_ == null ? POGOProtos.Rpc.DECONFPPKLA.getDefaultInstance() : heiapfnloio_;
      } else {
        return heiapfnloioBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.DECONFPPKLA heiapfnloio = 2;</code>
     */
    public Builder setHeiapfnloio(POGOProtos.Rpc.DECONFPPKLA value) {
      if (heiapfnloioBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        heiapfnloio_ = value;
        onChanged();
      } else {
        heiapfnloioBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DECONFPPKLA heiapfnloio = 2;</code>
     */
    public Builder setHeiapfnloio(
        POGOProtos.Rpc.DECONFPPKLA.Builder builderForValue) {
      if (heiapfnloioBuilder_ == null) {
        heiapfnloio_ = builderForValue.build();
        onChanged();
      } else {
        heiapfnloioBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DECONFPPKLA heiapfnloio = 2;</code>
     */
    public Builder mergeHeiapfnloio(POGOProtos.Rpc.DECONFPPKLA value) {
      if (heiapfnloioBuilder_ == null) {
        if (heiapfnloio_ != null) {
          heiapfnloio_ =
            POGOProtos.Rpc.DECONFPPKLA.newBuilder(heiapfnloio_).mergeFrom(value).buildPartial();
        } else {
          heiapfnloio_ = value;
        }
        onChanged();
      } else {
        heiapfnloioBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DECONFPPKLA heiapfnloio = 2;</code>
     */
    public Builder clearHeiapfnloio() {
      if (heiapfnloioBuilder_ == null) {
        heiapfnloio_ = null;
        onChanged();
      } else {
        heiapfnloio_ = null;
        heiapfnloioBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DECONFPPKLA heiapfnloio = 2;</code>
     */
    public POGOProtos.Rpc.DECONFPPKLA.Builder getHeiapfnloioBuilder() {
      
      onChanged();
      return getHeiapfnloioFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.DECONFPPKLA heiapfnloio = 2;</code>
     */
    public POGOProtos.Rpc.DECONFPPKLAOrBuilder getHeiapfnloioOrBuilder() {
      if (heiapfnloioBuilder_ != null) {
        return heiapfnloioBuilder_.getMessageOrBuilder();
      } else {
        return heiapfnloio_ == null ?
            POGOProtos.Rpc.DECONFPPKLA.getDefaultInstance() : heiapfnloio_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.DECONFPPKLA heiapfnloio = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.DECONFPPKLA, POGOProtos.Rpc.DECONFPPKLA.Builder, POGOProtos.Rpc.DECONFPPKLAOrBuilder> 
        getHeiapfnloioFieldBuilder() {
      if (heiapfnloioBuilder_ == null) {
        heiapfnloioBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.DECONFPPKLA, POGOProtos.Rpc.DECONFPPKLA.Builder, POGOProtos.Rpc.DECONFPPKLAOrBuilder>(
                getHeiapfnloio(),
                getParentForChildren(),
                isClean());
        heiapfnloio_ = null;
      }
      return heiapfnloioBuilder_;
    }

    private POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FLEJIPPCOHB, POGOProtos.Rpc.FLEJIPPCOHB.Builder, POGOProtos.Rpc.FLEJIPPCOHBOrBuilder> dfbkbddgjmhBuilder_;
    /**
     * <code>.POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh = 3;</code>
     * @return Whether the dfbkbddgjmh field is set.
     */
    public boolean hasDfbkbddgjmh() {
      return dfbkbddgjmhBuilder_ != null || dfbkbddgjmh_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh = 3;</code>
     * @return The dfbkbddgjmh.
     */
    public POGOProtos.Rpc.FLEJIPPCOHB getDfbkbddgjmh() {
      if (dfbkbddgjmhBuilder_ == null) {
        return dfbkbddgjmh_ == null ? POGOProtos.Rpc.FLEJIPPCOHB.getDefaultInstance() : dfbkbddgjmh_;
      } else {
        return dfbkbddgjmhBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh = 3;</code>
     */
    public Builder setDfbkbddgjmh(POGOProtos.Rpc.FLEJIPPCOHB value) {
      if (dfbkbddgjmhBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dfbkbddgjmh_ = value;
        onChanged();
      } else {
        dfbkbddgjmhBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh = 3;</code>
     */
    public Builder setDfbkbddgjmh(
        POGOProtos.Rpc.FLEJIPPCOHB.Builder builderForValue) {
      if (dfbkbddgjmhBuilder_ == null) {
        dfbkbddgjmh_ = builderForValue.build();
        onChanged();
      } else {
        dfbkbddgjmhBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh = 3;</code>
     */
    public Builder mergeDfbkbddgjmh(POGOProtos.Rpc.FLEJIPPCOHB value) {
      if (dfbkbddgjmhBuilder_ == null) {
        if (dfbkbddgjmh_ != null) {
          dfbkbddgjmh_ =
            POGOProtos.Rpc.FLEJIPPCOHB.newBuilder(dfbkbddgjmh_).mergeFrom(value).buildPartial();
        } else {
          dfbkbddgjmh_ = value;
        }
        onChanged();
      } else {
        dfbkbddgjmhBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh = 3;</code>
     */
    public Builder clearDfbkbddgjmh() {
      if (dfbkbddgjmhBuilder_ == null) {
        dfbkbddgjmh_ = null;
        onChanged();
      } else {
        dfbkbddgjmh_ = null;
        dfbkbddgjmhBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh = 3;</code>
     */
    public POGOProtos.Rpc.FLEJIPPCOHB.Builder getDfbkbddgjmhBuilder() {
      
      onChanged();
      return getDfbkbddgjmhFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh = 3;</code>
     */
    public POGOProtos.Rpc.FLEJIPPCOHBOrBuilder getDfbkbddgjmhOrBuilder() {
      if (dfbkbddgjmhBuilder_ != null) {
        return dfbkbddgjmhBuilder_.getMessageOrBuilder();
      } else {
        return dfbkbddgjmh_ == null ?
            POGOProtos.Rpc.FLEJIPPCOHB.getDefaultInstance() : dfbkbddgjmh_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FLEJIPPCOHB dfbkbddgjmh = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FLEJIPPCOHB, POGOProtos.Rpc.FLEJIPPCOHB.Builder, POGOProtos.Rpc.FLEJIPPCOHBOrBuilder> 
        getDfbkbddgjmhFieldBuilder() {
      if (dfbkbddgjmhBuilder_ == null) {
        dfbkbddgjmhBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.FLEJIPPCOHB, POGOProtos.Rpc.FLEJIPPCOHB.Builder, POGOProtos.Rpc.FLEJIPPCOHBOrBuilder>(
                getDfbkbddgjmh(),
                getParentForChildren(),
                isClean());
        dfbkbddgjmh_ = null;
      }
      return dfbkbddgjmhBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CKPOHJNIFCJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CKPOHJNIFCJ)
  private static final POGOProtos.Rpc.CKPOHJNIFCJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CKPOHJNIFCJ();
  }

  public static POGOProtos.Rpc.CKPOHJNIFCJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CKPOHJNIFCJ>
      PARSER = new com.google.protobuf.AbstractParser<CKPOHJNIFCJ>() {
    @java.lang.Override
    public CKPOHJNIFCJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CKPOHJNIFCJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CKPOHJNIFCJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CKPOHJNIFCJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CKPOHJNIFCJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

