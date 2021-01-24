// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetImagesForPoiOutProto}
 */
public final class GetImagesForPoiOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetImagesForPoiOutProto)
    GetImagesForPoiOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetImagesForPoiOutProto.newBuilder() to construct.
  private GetImagesForPoiOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetImagesForPoiOutProto() {
    status_ = 0;
    photoGalleryPoiImages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetImagesForPoiOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetImagesForPoiOutProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            status_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              photoGalleryPoiImages_ = new java.util.ArrayList<POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            photoGalleryPoiImages_.add(
                input.readMessage(POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        photoGalleryPoiImages_ = java.util.Collections.unmodifiableList(photoGalleryPoiImages_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetImagesForPoiOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetImagesForPoiOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetImagesForPoiOutProto.class, POGOProtos.Rpc.GetImagesForPoiOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.GetImagesForPoiOutProto.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>POI_NOT_FOUND = 2;</code>
     */
    POI_NOT_FOUND(2),
    /**
     * <code>INVALID_REQUEST = 3;</code>
     */
    INVALID_REQUEST(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>POI_NOT_FOUND = 2;</code>
     */
    public static final int POI_NOT_FOUND_VALUE = 2;
    /**
     * <code>INVALID_REQUEST = 3;</code>
     */
    public static final int INVALID_REQUEST_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return POI_NOT_FOUND;
        case 3: return INVALID_REQUEST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.GetImagesForPoiOutProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GetImagesForPoiOutProto.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.GetImagesForPoiOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.GetImagesForPoiOutProto.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.GetImagesForPoiOutProto.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GetImagesForPoiOutProto.Status result = POGOProtos.Rpc.GetImagesForPoiOutProto.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.GetImagesForPoiOutProto.Status.UNRECOGNIZED : result;
  }

  public static final int PHOTO_GALLERY_POI_IMAGES_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto> photoGalleryPoiImages_;
  /**
   * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto> getPhotoGalleryPoiImagesList() {
    return photoGalleryPoiImages_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProtoOrBuilder> 
      getPhotoGalleryPoiImagesOrBuilderList() {
    return photoGalleryPoiImages_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
   */
  @java.lang.Override
  public int getPhotoGalleryPoiImagesCount() {
    return photoGalleryPoiImages_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto getPhotoGalleryPoiImages(int index) {
    return photoGalleryPoiImages_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProtoOrBuilder getPhotoGalleryPoiImagesOrBuilder(
      int index) {
    return photoGalleryPoiImages_.get(index);
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
    if (status_ != POGOProtos.Rpc.GetImagesForPoiOutProto.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    for (int i = 0; i < photoGalleryPoiImages_.size(); i++) {
      output.writeMessage(2, photoGalleryPoiImages_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.GetImagesForPoiOutProto.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    for (int i = 0; i < photoGalleryPoiImages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, photoGalleryPoiImages_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.GetImagesForPoiOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetImagesForPoiOutProto other = (POGOProtos.Rpc.GetImagesForPoiOutProto) obj;

    if (status_ != other.status_) return false;
    if (!getPhotoGalleryPoiImagesList()
        .equals(other.getPhotoGalleryPoiImagesList())) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (getPhotoGalleryPoiImagesCount() > 0) {
      hash = (37 * hash) + PHOTO_GALLERY_POI_IMAGES_FIELD_NUMBER;
      hash = (53 * hash) + getPhotoGalleryPoiImagesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetImagesForPoiOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetImagesForPoiOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetImagesForPoiOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetImagesForPoiOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetImagesForPoiOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetImagesForPoiOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetImagesForPoiOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetImagesForPoiOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetImagesForPoiOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetImagesForPoiOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetImagesForPoiOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetImagesForPoiOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetImagesForPoiOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetImagesForPoiOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetImagesForPoiOutProto)
      POGOProtos.Rpc.GetImagesForPoiOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetImagesForPoiOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetImagesForPoiOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetImagesForPoiOutProto.class, POGOProtos.Rpc.GetImagesForPoiOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetImagesForPoiOutProto.newBuilder()
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
        getPhotoGalleryPoiImagesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      if (photoGalleryPoiImagesBuilder_ == null) {
        photoGalleryPoiImages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        photoGalleryPoiImagesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetImagesForPoiOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetImagesForPoiOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetImagesForPoiOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetImagesForPoiOutProto build() {
      POGOProtos.Rpc.GetImagesForPoiOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetImagesForPoiOutProto buildPartial() {
      POGOProtos.Rpc.GetImagesForPoiOutProto result = new POGOProtos.Rpc.GetImagesForPoiOutProto(this);
      int from_bitField0_ = bitField0_;
      result.status_ = status_;
      if (photoGalleryPoiImagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          photoGalleryPoiImages_ = java.util.Collections.unmodifiableList(photoGalleryPoiImages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.photoGalleryPoiImages_ = photoGalleryPoiImages_;
      } else {
        result.photoGalleryPoiImages_ = photoGalleryPoiImagesBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.GetImagesForPoiOutProto) {
        return mergeFrom((POGOProtos.Rpc.GetImagesForPoiOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetImagesForPoiOutProto other) {
      if (other == POGOProtos.Rpc.GetImagesForPoiOutProto.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (photoGalleryPoiImagesBuilder_ == null) {
        if (!other.photoGalleryPoiImages_.isEmpty()) {
          if (photoGalleryPoiImages_.isEmpty()) {
            photoGalleryPoiImages_ = other.photoGalleryPoiImages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePhotoGalleryPoiImagesIsMutable();
            photoGalleryPoiImages_.addAll(other.photoGalleryPoiImages_);
          }
          onChanged();
        }
      } else {
        if (!other.photoGalleryPoiImages_.isEmpty()) {
          if (photoGalleryPoiImagesBuilder_.isEmpty()) {
            photoGalleryPoiImagesBuilder_.dispose();
            photoGalleryPoiImagesBuilder_ = null;
            photoGalleryPoiImages_ = other.photoGalleryPoiImages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            photoGalleryPoiImagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPhotoGalleryPoiImagesFieldBuilder() : null;
          } else {
            photoGalleryPoiImagesBuilder_.addAllMessages(other.photoGalleryPoiImages_);
          }
        }
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
      POGOProtos.Rpc.GetImagesForPoiOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetImagesForPoiOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int status_ = 0;
    /**
     * <code>.POGOProtos.Rpc.GetImagesForPoiOutProto.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.GetImagesForPoiOutProto.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetImagesForPoiOutProto.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GetImagesForPoiOutProto.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GetImagesForPoiOutProto.Status result = POGOProtos.Rpc.GetImagesForPoiOutProto.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.GetImagesForPoiOutProto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GetImagesForPoiOutProto.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.GetImagesForPoiOutProto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetImagesForPoiOutProto.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto> photoGalleryPoiImages_ =
      java.util.Collections.emptyList();
    private void ensurePhotoGalleryPoiImagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        photoGalleryPoiImages_ = new java.util.ArrayList<POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto>(photoGalleryPoiImages_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto, POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.Builder, POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProtoOrBuilder> photoGalleryPoiImagesBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto> getPhotoGalleryPoiImagesList() {
      if (photoGalleryPoiImagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(photoGalleryPoiImages_);
      } else {
        return photoGalleryPoiImagesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public int getPhotoGalleryPoiImagesCount() {
      if (photoGalleryPoiImagesBuilder_ == null) {
        return photoGalleryPoiImages_.size();
      } else {
        return photoGalleryPoiImagesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto getPhotoGalleryPoiImages(int index) {
      if (photoGalleryPoiImagesBuilder_ == null) {
        return photoGalleryPoiImages_.get(index);
      } else {
        return photoGalleryPoiImagesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public Builder setPhotoGalleryPoiImages(
        int index, POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto value) {
      if (photoGalleryPoiImagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhotoGalleryPoiImagesIsMutable();
        photoGalleryPoiImages_.set(index, value);
        onChanged();
      } else {
        photoGalleryPoiImagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public Builder setPhotoGalleryPoiImages(
        int index, POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.Builder builderForValue) {
      if (photoGalleryPoiImagesBuilder_ == null) {
        ensurePhotoGalleryPoiImagesIsMutable();
        photoGalleryPoiImages_.set(index, builderForValue.build());
        onChanged();
      } else {
        photoGalleryPoiImagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public Builder addPhotoGalleryPoiImages(POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto value) {
      if (photoGalleryPoiImagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhotoGalleryPoiImagesIsMutable();
        photoGalleryPoiImages_.add(value);
        onChanged();
      } else {
        photoGalleryPoiImagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public Builder addPhotoGalleryPoiImages(
        int index, POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto value) {
      if (photoGalleryPoiImagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhotoGalleryPoiImagesIsMutable();
        photoGalleryPoiImages_.add(index, value);
        onChanged();
      } else {
        photoGalleryPoiImagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public Builder addPhotoGalleryPoiImages(
        POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.Builder builderForValue) {
      if (photoGalleryPoiImagesBuilder_ == null) {
        ensurePhotoGalleryPoiImagesIsMutable();
        photoGalleryPoiImages_.add(builderForValue.build());
        onChanged();
      } else {
        photoGalleryPoiImagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public Builder addPhotoGalleryPoiImages(
        int index, POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.Builder builderForValue) {
      if (photoGalleryPoiImagesBuilder_ == null) {
        ensurePhotoGalleryPoiImagesIsMutable();
        photoGalleryPoiImages_.add(index, builderForValue.build());
        onChanged();
      } else {
        photoGalleryPoiImagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public Builder addAllPhotoGalleryPoiImages(
        java.lang.Iterable<? extends POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto> values) {
      if (photoGalleryPoiImagesBuilder_ == null) {
        ensurePhotoGalleryPoiImagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, photoGalleryPoiImages_);
        onChanged();
      } else {
        photoGalleryPoiImagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public Builder clearPhotoGalleryPoiImages() {
      if (photoGalleryPoiImagesBuilder_ == null) {
        photoGalleryPoiImages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        photoGalleryPoiImagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public Builder removePhotoGalleryPoiImages(int index) {
      if (photoGalleryPoiImagesBuilder_ == null) {
        ensurePhotoGalleryPoiImagesIsMutable();
        photoGalleryPoiImages_.remove(index);
        onChanged();
      } else {
        photoGalleryPoiImagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.Builder getPhotoGalleryPoiImagesBuilder(
        int index) {
      return getPhotoGalleryPoiImagesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProtoOrBuilder getPhotoGalleryPoiImagesOrBuilder(
        int index) {
      if (photoGalleryPoiImagesBuilder_ == null) {
        return photoGalleryPoiImages_.get(index);  } else {
        return photoGalleryPoiImagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProtoOrBuilder> 
         getPhotoGalleryPoiImagesOrBuilderList() {
      if (photoGalleryPoiImagesBuilder_ != null) {
        return photoGalleryPoiImagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(photoGalleryPoiImages_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.Builder addPhotoGalleryPoiImagesBuilder() {
      return getPhotoGalleryPoiImagesFieldBuilder().addBuilder(
          POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.Builder addPhotoGalleryPoiImagesBuilder(
        int index) {
      return getPhotoGalleryPoiImagesFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto photo_gallery_poi_images = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.Builder> 
         getPhotoGalleryPoiImagesBuilderList() {
      return getPhotoGalleryPoiImagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto, POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.Builder, POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProtoOrBuilder> 
        getPhotoGalleryPoiImagesFieldBuilder() {
      if (photoGalleryPoiImagesBuilder_ == null) {
        photoGalleryPoiImagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto, POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProto.Builder, POGOProtos.Rpc.GameClientPhotoGalleryPoiImageProtoOrBuilder>(
                photoGalleryPoiImages_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        photoGalleryPoiImages_ = null;
      }
      return photoGalleryPoiImagesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetImagesForPoiOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetImagesForPoiOutProto)
  private static final POGOProtos.Rpc.GetImagesForPoiOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetImagesForPoiOutProto();
  }

  public static POGOProtos.Rpc.GetImagesForPoiOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetImagesForPoiOutProto>
      PARSER = new com.google.protobuf.AbstractParser<GetImagesForPoiOutProto>() {
    @java.lang.Override
    public GetImagesForPoiOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetImagesForPoiOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetImagesForPoiOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetImagesForPoiOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetImagesForPoiOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
