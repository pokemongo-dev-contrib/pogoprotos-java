// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Niantic.Titan.Protos.SubmitSponsorPoiLocationUpdateProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto}
 */
public  final class TitanSubmitSponsorPoiLocationUpdateProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto)
    TitanSubmitSponsorPoiLocationUpdateProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TitanSubmitSponsorPoiLocationUpdateProto.newBuilder() to construct.
  private TitanSubmitSponsorPoiLocationUpdateProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TitanSubmitSponsorPoiLocationUpdateProto() {
    poiId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TitanSubmitSponsorPoiLocationUpdateProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TitanSubmitSponsorPoiLocationUpdateProto(
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

            poiId_ = s;
            break;
          }
          case 18: {
            POGOProtos.Rpc.PlatformLocationE6Proto.Builder subBuilder = null;
            if (location_ != null) {
              subBuilder = location_.toBuilder();
            }
            location_ = input.readMessage(POGOProtos.Rpc.PlatformLocationE6Proto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(location_);
              location_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanSubmitSponsorPoiLocationUpdateProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanSubmitSponsorPoiLocationUpdateProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto.class, POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto.Builder.class);
  }

  public static final int POI_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object poiId_;
  /**
   * <code>string poi_id = 1;</code>
   * @return The poiId.
   */
  public java.lang.String getPoiId() {
    java.lang.Object ref = poiId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      poiId_ = s;
      return s;
    }
  }
  /**
   * <code>string poi_id = 1;</code>
   * @return The bytes for poiId.
   */
  public com.google.protobuf.ByteString
      getPoiIdBytes() {
    java.lang.Object ref = poiId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      poiId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.PlatformLocationE6Proto location_;
  /**
   * <code>.POGOProtos.Rpc.PlatformLocationE6Proto location = 2;</code>
   * @return Whether the location field is set.
   */
  public boolean hasLocation() {
    return location_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformLocationE6Proto location = 2;</code>
   * @return The location.
   */
  public POGOProtos.Rpc.PlatformLocationE6Proto getLocation() {
    return location_ == null ? POGOProtos.Rpc.PlatformLocationE6Proto.getDefaultInstance() : location_;
  }
  /**
   * <code>.POGOProtos.Rpc.PlatformLocationE6Proto location = 2;</code>
   */
  public POGOProtos.Rpc.PlatformLocationE6ProtoOrBuilder getLocationOrBuilder() {
    return getLocation();
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
    if (!getPoiIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, poiId_);
    }
    if (location_ != null) {
      output.writeMessage(2, getLocation());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPoiIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, poiId_);
    }
    if (location_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLocation());
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
    if (!(obj instanceof POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto other = (POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto) obj;

    if (!getPoiId()
        .equals(other.getPoiId())) return false;
    if (hasLocation() != other.hasLocation()) return false;
    if (hasLocation()) {
      if (!getLocation()
          .equals(other.getLocation())) return false;
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
    hash = (37 * hash) + POI_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPoiId().hashCode();
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto prototype) {
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
   * ref: Niantic.Titan.Protos.SubmitSponsorPoiLocationUpdateProto
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto)
      POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanSubmitSponsorPoiLocationUpdateProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanSubmitSponsorPoiLocationUpdateProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto.class, POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto.newBuilder()
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
      poiId_ = "";

      if (locationBuilder_ == null) {
        location_ = null;
      } else {
        location_ = null;
        locationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanSubmitSponsorPoiLocationUpdateProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto build() {
      POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto buildPartial() {
      POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto result = new POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto(this);
      result.poiId_ = poiId_;
      if (locationBuilder_ == null) {
        result.location_ = location_;
      } else {
        result.location_ = locationBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto) {
        return mergeFrom((POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto other) {
      if (other == POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto.getDefaultInstance()) return this;
      if (!other.getPoiId().isEmpty()) {
        poiId_ = other.poiId_;
        onChanged();
      }
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
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
      POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object poiId_ = "";
    /**
     * <code>string poi_id = 1;</code>
     * @return The poiId.
     */
    public java.lang.String getPoiId() {
      java.lang.Object ref = poiId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        poiId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string poi_id = 1;</code>
     * @return The bytes for poiId.
     */
    public com.google.protobuf.ByteString
        getPoiIdBytes() {
      java.lang.Object ref = poiId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        poiId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string poi_id = 1;</code>
     * @param value The poiId to set.
     * @return This builder for chaining.
     */
    public Builder setPoiId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      poiId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string poi_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPoiId() {
      
      poiId_ = getDefaultInstance().getPoiId();
      onChanged();
      return this;
    }
    /**
     * <code>string poi_id = 1;</code>
     * @param value The bytes for poiId to set.
     * @return This builder for chaining.
     */
    public Builder setPoiIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      poiId_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PlatformLocationE6Proto location_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlatformLocationE6Proto, POGOProtos.Rpc.PlatformLocationE6Proto.Builder, POGOProtos.Rpc.PlatformLocationE6ProtoOrBuilder> locationBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PlatformLocationE6Proto location = 2;</code>
     * @return Whether the location field is set.
     */
    public boolean hasLocation() {
      return locationBuilder_ != null || location_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformLocationE6Proto location = 2;</code>
     * @return The location.
     */
    public POGOProtos.Rpc.PlatformLocationE6Proto getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? POGOProtos.Rpc.PlatformLocationE6Proto.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformLocationE6Proto location = 2;</code>
     */
    public Builder setLocation(POGOProtos.Rpc.PlatformLocationE6Proto value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
        onChanged();
      } else {
        locationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformLocationE6Proto location = 2;</code>
     */
    public Builder setLocation(
        POGOProtos.Rpc.PlatformLocationE6Proto.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
        onChanged();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformLocationE6Proto location = 2;</code>
     */
    public Builder mergeLocation(POGOProtos.Rpc.PlatformLocationE6Proto value) {
      if (locationBuilder_ == null) {
        if (location_ != null) {
          location_ =
            POGOProtos.Rpc.PlatformLocationE6Proto.newBuilder(location_).mergeFrom(value).buildPartial();
        } else {
          location_ = value;
        }
        onChanged();
      } else {
        locationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformLocationE6Proto location = 2;</code>
     */
    public Builder clearLocation() {
      if (locationBuilder_ == null) {
        location_ = null;
        onChanged();
      } else {
        location_ = null;
        locationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformLocationE6Proto location = 2;</code>
     */
    public POGOProtos.Rpc.PlatformLocationE6Proto.Builder getLocationBuilder() {
      
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformLocationE6Proto location = 2;</code>
     */
    public POGOProtos.Rpc.PlatformLocationE6ProtoOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            POGOProtos.Rpc.PlatformLocationE6Proto.getDefaultInstance() : location_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PlatformLocationE6Proto location = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PlatformLocationE6Proto, POGOProtos.Rpc.PlatformLocationE6Proto.Builder, POGOProtos.Rpc.PlatformLocationE6ProtoOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PlatformLocationE6Proto, POGOProtos.Rpc.PlatformLocationE6Proto.Builder, POGOProtos.Rpc.PlatformLocationE6ProtoOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto)
  private static final POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto();
  }

  public static POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TitanSubmitSponsorPoiLocationUpdateProto>
      PARSER = new com.google.protobuf.AbstractParser<TitanSubmitSponsorPoiLocationUpdateProto>() {
    @java.lang.Override
    public TitanSubmitSponsorPoiLocationUpdateProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TitanSubmitSponsorPoiLocationUpdateProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TitanSubmitSponsorPoiLocationUpdateProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TitanSubmitSponsorPoiLocationUpdateProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.TitanSubmitSponsorPoiLocationUpdateProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

