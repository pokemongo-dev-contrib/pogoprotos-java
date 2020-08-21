// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Niantic.Platform.Maps.Proto.TEMP.MaskedColor
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.MaskedColor}
 */
public final class MaskedColor extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MaskedColor)
    MaskedColorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MaskedColor.newBuilder() to construct.
  private MaskedColor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MaskedColor() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MaskedColor();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MaskedColor(
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

            colorArgb_ = input.readUInt32();
            break;
          }
          case 16: {

            colorMaskArgb_ = input.readUInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MaskedColor_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MaskedColor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MaskedColor.class, POGOProtos.Rpc.MaskedColor.Builder.class);
  }

  public static final int COLOR_ARGB_FIELD_NUMBER = 1;
  private int colorArgb_;
  /**
   * <code>uint32 color_argb = 1;</code>
   * @return The colorArgb.
   */
  @java.lang.Override
  public int getColorArgb() {
    return colorArgb_;
  }

  public static final int COLOR_MASK_ARGB_FIELD_NUMBER = 2;
  private int colorMaskArgb_;
  /**
   * <code>uint32 color_mask_argb = 2;</code>
   * @return The colorMaskArgb.
   */
  @java.lang.Override
  public int getColorMaskArgb() {
    return colorMaskArgb_;
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
    if (colorArgb_ != 0) {
      output.writeUInt32(1, colorArgb_);
    }
    if (colorMaskArgb_ != 0) {
      output.writeUInt32(2, colorMaskArgb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (colorArgb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, colorArgb_);
    }
    if (colorMaskArgb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, colorMaskArgb_);
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
    if (!(obj instanceof POGOProtos.Rpc.MaskedColor)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MaskedColor other = (POGOProtos.Rpc.MaskedColor) obj;

    if (getColorArgb()
        != other.getColorArgb()) return false;
    if (getColorMaskArgb()
        != other.getColorMaskArgb()) return false;
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
    hash = (37 * hash) + COLOR_ARGB_FIELD_NUMBER;
    hash = (53 * hash) + getColorArgb();
    hash = (37 * hash) + COLOR_MASK_ARGB_FIELD_NUMBER;
    hash = (53 * hash) + getColorMaskArgb();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MaskedColor parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MaskedColor parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MaskedColor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MaskedColor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MaskedColor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MaskedColor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MaskedColor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MaskedColor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MaskedColor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MaskedColor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MaskedColor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MaskedColor parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MaskedColor prototype) {
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
   * ref: Niantic.Platform.Maps.Proto.TEMP.MaskedColor
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.MaskedColor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MaskedColor)
      POGOProtos.Rpc.MaskedColorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MaskedColor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MaskedColor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MaskedColor.class, POGOProtos.Rpc.MaskedColor.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MaskedColor.newBuilder()
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
      colorArgb_ = 0;

      colorMaskArgb_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MaskedColor_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MaskedColor getDefaultInstanceForType() {
      return POGOProtos.Rpc.MaskedColor.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MaskedColor build() {
      POGOProtos.Rpc.MaskedColor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MaskedColor buildPartial() {
      POGOProtos.Rpc.MaskedColor result = new POGOProtos.Rpc.MaskedColor(this);
      result.colorArgb_ = colorArgb_;
      result.colorMaskArgb_ = colorMaskArgb_;
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
      if (other instanceof POGOProtos.Rpc.MaskedColor) {
        return mergeFrom((POGOProtos.Rpc.MaskedColor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MaskedColor other) {
      if (other == POGOProtos.Rpc.MaskedColor.getDefaultInstance()) return this;
      if (other.getColorArgb() != 0) {
        setColorArgb(other.getColorArgb());
      }
      if (other.getColorMaskArgb() != 0) {
        setColorMaskArgb(other.getColorMaskArgb());
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
      POGOProtos.Rpc.MaskedColor parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MaskedColor) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int colorArgb_ ;
    /**
     * <code>uint32 color_argb = 1;</code>
     * @return The colorArgb.
     */
    @java.lang.Override
    public int getColorArgb() {
      return colorArgb_;
    }
    /**
     * <code>uint32 color_argb = 1;</code>
     * @param value The colorArgb to set.
     * @return This builder for chaining.
     */
    public Builder setColorArgb(int value) {
      
      colorArgb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 color_argb = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearColorArgb() {
      
      colorArgb_ = 0;
      onChanged();
      return this;
    }

    private int colorMaskArgb_ ;
    /**
     * <code>uint32 color_mask_argb = 2;</code>
     * @return The colorMaskArgb.
     */
    @java.lang.Override
    public int getColorMaskArgb() {
      return colorMaskArgb_;
    }
    /**
     * <code>uint32 color_mask_argb = 2;</code>
     * @param value The colorMaskArgb to set.
     * @return This builder for chaining.
     */
    public Builder setColorMaskArgb(int value) {
      
      colorMaskArgb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 color_mask_argb = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearColorMaskArgb() {
      
      colorMaskArgb_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MaskedColor)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MaskedColor)
  private static final POGOProtos.Rpc.MaskedColor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MaskedColor();
  }

  public static POGOProtos.Rpc.MaskedColor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MaskedColor>
      PARSER = new com.google.protobuf.AbstractParser<MaskedColor>() {
    @java.lang.Override
    public MaskedColor parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MaskedColor(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MaskedColor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MaskedColor> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MaskedColor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

