// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PBOKODFPACI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PBOKODFPACI}
 */
public final class PBOKODFPACI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PBOKODFPACI)
    PBOKODFPACIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PBOKODFPACI.newBuilder() to construct.
  private PBOKODFPACI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PBOKODFPACI() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PBOKODFPACI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PBOKODFPACI(
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
            POGOProtos.Rpc.AGPEAENBOAA.Builder subBuilder = null;
            if (ilpbdcdgjhh_ != null) {
              subBuilder = ilpbdcdgjhh_.toBuilder();
            }
            ilpbdcdgjhh_ = input.readMessage(POGOProtos.Rpc.AGPEAENBOAA.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ilpbdcdgjhh_);
              ilpbdcdgjhh_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            dgfpmjpijcc_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBOKODFPACI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBOKODFPACI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PBOKODFPACI.class, POGOProtos.Rpc.PBOKODFPACI.Builder.class);
  }

  public static final int ILPBDCDGJHH_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh_;
  /**
   * <code>.POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh = 1;</code>
   * @return Whether the ilpbdcdgjhh field is set.
   */
  @java.lang.Override
  public boolean hasIlpbdcdgjhh() {
    return ilpbdcdgjhh_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh = 1;</code>
   * @return The ilpbdcdgjhh.
   */
  @java.lang.Override
  public POGOProtos.Rpc.AGPEAENBOAA getIlpbdcdgjhh() {
    return ilpbdcdgjhh_ == null ? POGOProtos.Rpc.AGPEAENBOAA.getDefaultInstance() : ilpbdcdgjhh_;
  }
  /**
   * <code>.POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.AGPEAENBOAAOrBuilder getIlpbdcdgjhhOrBuilder() {
    return getIlpbdcdgjhh();
  }

  public static final int DGFPMJPIJCC_FIELD_NUMBER = 2;
  private int dgfpmjpijcc_;
  /**
   * <code>int32 dgfpmjpijcc = 2;</code>
   * @return The dgfpmjpijcc.
   */
  @java.lang.Override
  public int getDgfpmjpijcc() {
    return dgfpmjpijcc_;
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
    if (ilpbdcdgjhh_ != null) {
      output.writeMessage(1, getIlpbdcdgjhh());
    }
    if (dgfpmjpijcc_ != 0) {
      output.writeInt32(2, dgfpmjpijcc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ilpbdcdgjhh_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIlpbdcdgjhh());
    }
    if (dgfpmjpijcc_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, dgfpmjpijcc_);
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
    if (!(obj instanceof POGOProtos.Rpc.PBOKODFPACI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PBOKODFPACI other = (POGOProtos.Rpc.PBOKODFPACI) obj;

    if (hasIlpbdcdgjhh() != other.hasIlpbdcdgjhh()) return false;
    if (hasIlpbdcdgjhh()) {
      if (!getIlpbdcdgjhh()
          .equals(other.getIlpbdcdgjhh())) return false;
    }
    if (getDgfpmjpijcc()
        != other.getDgfpmjpijcc()) return false;
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
    if (hasIlpbdcdgjhh()) {
      hash = (37 * hash) + ILPBDCDGJHH_FIELD_NUMBER;
      hash = (53 * hash) + getIlpbdcdgjhh().hashCode();
    }
    hash = (37 * hash) + DGFPMJPIJCC_FIELD_NUMBER;
    hash = (53 * hash) + getDgfpmjpijcc();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PBOKODFPACI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PBOKODFPACI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBOKODFPACI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PBOKODFPACI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBOKODFPACI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PBOKODFPACI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBOKODFPACI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PBOKODFPACI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBOKODFPACI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PBOKODFPACI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PBOKODFPACI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PBOKODFPACI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PBOKODFPACI prototype) {
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
   * ref: PBOKODFPACI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PBOKODFPACI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PBOKODFPACI)
      POGOProtos.Rpc.PBOKODFPACIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBOKODFPACI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBOKODFPACI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PBOKODFPACI.class, POGOProtos.Rpc.PBOKODFPACI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PBOKODFPACI.newBuilder()
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
      if (ilpbdcdgjhhBuilder_ == null) {
        ilpbdcdgjhh_ = null;
      } else {
        ilpbdcdgjhh_ = null;
        ilpbdcdgjhhBuilder_ = null;
      }
      dgfpmjpijcc_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PBOKODFPACI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PBOKODFPACI getDefaultInstanceForType() {
      return POGOProtos.Rpc.PBOKODFPACI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PBOKODFPACI build() {
      POGOProtos.Rpc.PBOKODFPACI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PBOKODFPACI buildPartial() {
      POGOProtos.Rpc.PBOKODFPACI result = new POGOProtos.Rpc.PBOKODFPACI(this);
      if (ilpbdcdgjhhBuilder_ == null) {
        result.ilpbdcdgjhh_ = ilpbdcdgjhh_;
      } else {
        result.ilpbdcdgjhh_ = ilpbdcdgjhhBuilder_.build();
      }
      result.dgfpmjpijcc_ = dgfpmjpijcc_;
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
      if (other instanceof POGOProtos.Rpc.PBOKODFPACI) {
        return mergeFrom((POGOProtos.Rpc.PBOKODFPACI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PBOKODFPACI other) {
      if (other == POGOProtos.Rpc.PBOKODFPACI.getDefaultInstance()) return this;
      if (other.hasIlpbdcdgjhh()) {
        mergeIlpbdcdgjhh(other.getIlpbdcdgjhh());
      }
      if (other.getDgfpmjpijcc() != 0) {
        setDgfpmjpijcc(other.getDgfpmjpijcc());
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
      POGOProtos.Rpc.PBOKODFPACI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PBOKODFPACI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AGPEAENBOAA, POGOProtos.Rpc.AGPEAENBOAA.Builder, POGOProtos.Rpc.AGPEAENBOAAOrBuilder> ilpbdcdgjhhBuilder_;
    /**
     * <code>.POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh = 1;</code>
     * @return Whether the ilpbdcdgjhh field is set.
     */
    public boolean hasIlpbdcdgjhh() {
      return ilpbdcdgjhhBuilder_ != null || ilpbdcdgjhh_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh = 1;</code>
     * @return The ilpbdcdgjhh.
     */
    public POGOProtos.Rpc.AGPEAENBOAA getIlpbdcdgjhh() {
      if (ilpbdcdgjhhBuilder_ == null) {
        return ilpbdcdgjhh_ == null ? POGOProtos.Rpc.AGPEAENBOAA.getDefaultInstance() : ilpbdcdgjhh_;
      } else {
        return ilpbdcdgjhhBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh = 1;</code>
     */
    public Builder setIlpbdcdgjhh(POGOProtos.Rpc.AGPEAENBOAA value) {
      if (ilpbdcdgjhhBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ilpbdcdgjhh_ = value;
        onChanged();
      } else {
        ilpbdcdgjhhBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh = 1;</code>
     */
    public Builder setIlpbdcdgjhh(
        POGOProtos.Rpc.AGPEAENBOAA.Builder builderForValue) {
      if (ilpbdcdgjhhBuilder_ == null) {
        ilpbdcdgjhh_ = builderForValue.build();
        onChanged();
      } else {
        ilpbdcdgjhhBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh = 1;</code>
     */
    public Builder mergeIlpbdcdgjhh(POGOProtos.Rpc.AGPEAENBOAA value) {
      if (ilpbdcdgjhhBuilder_ == null) {
        if (ilpbdcdgjhh_ != null) {
          ilpbdcdgjhh_ =
            POGOProtos.Rpc.AGPEAENBOAA.newBuilder(ilpbdcdgjhh_).mergeFrom(value).buildPartial();
        } else {
          ilpbdcdgjhh_ = value;
        }
        onChanged();
      } else {
        ilpbdcdgjhhBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh = 1;</code>
     */
    public Builder clearIlpbdcdgjhh() {
      if (ilpbdcdgjhhBuilder_ == null) {
        ilpbdcdgjhh_ = null;
        onChanged();
      } else {
        ilpbdcdgjhh_ = null;
        ilpbdcdgjhhBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh = 1;</code>
     */
    public POGOProtos.Rpc.AGPEAENBOAA.Builder getIlpbdcdgjhhBuilder() {
      
      onChanged();
      return getIlpbdcdgjhhFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh = 1;</code>
     */
    public POGOProtos.Rpc.AGPEAENBOAAOrBuilder getIlpbdcdgjhhOrBuilder() {
      if (ilpbdcdgjhhBuilder_ != null) {
        return ilpbdcdgjhhBuilder_.getMessageOrBuilder();
      } else {
        return ilpbdcdgjhh_ == null ?
            POGOProtos.Rpc.AGPEAENBOAA.getDefaultInstance() : ilpbdcdgjhh_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AGPEAENBOAA ilpbdcdgjhh = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AGPEAENBOAA, POGOProtos.Rpc.AGPEAENBOAA.Builder, POGOProtos.Rpc.AGPEAENBOAAOrBuilder> 
        getIlpbdcdgjhhFieldBuilder() {
      if (ilpbdcdgjhhBuilder_ == null) {
        ilpbdcdgjhhBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.AGPEAENBOAA, POGOProtos.Rpc.AGPEAENBOAA.Builder, POGOProtos.Rpc.AGPEAENBOAAOrBuilder>(
                getIlpbdcdgjhh(),
                getParentForChildren(),
                isClean());
        ilpbdcdgjhh_ = null;
      }
      return ilpbdcdgjhhBuilder_;
    }

    private int dgfpmjpijcc_ ;
    /**
     * <code>int32 dgfpmjpijcc = 2;</code>
     * @return The dgfpmjpijcc.
     */
    @java.lang.Override
    public int getDgfpmjpijcc() {
      return dgfpmjpijcc_;
    }
    /**
     * <code>int32 dgfpmjpijcc = 2;</code>
     * @param value The dgfpmjpijcc to set.
     * @return This builder for chaining.
     */
    public Builder setDgfpmjpijcc(int value) {
      
      dgfpmjpijcc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 dgfpmjpijcc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDgfpmjpijcc() {
      
      dgfpmjpijcc_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PBOKODFPACI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PBOKODFPACI)
  private static final POGOProtos.Rpc.PBOKODFPACI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PBOKODFPACI();
  }

  public static POGOProtos.Rpc.PBOKODFPACI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PBOKODFPACI>
      PARSER = new com.google.protobuf.AbstractParser<PBOKODFPACI>() {
    @java.lang.Override
    public PBOKODFPACI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PBOKODFPACI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PBOKODFPACI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PBOKODFPACI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PBOKODFPACI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

