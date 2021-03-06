// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto}
 */
public final class GetGrapeshotUploadUrlOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto)
    GetGrapeshotUploadUrlOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetGrapeshotUploadUrlOutProto.newBuilder() to construct.
  private GetGrapeshotUploadUrlOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetGrapeshotUploadUrlOutProto() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetGrapeshotUploadUrlOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetGrapeshotUploadUrlOutProto(
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
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fileContextToGrapeshotData_ = com.google.protobuf.MapField.newMapField(
                  FileContextToGrapeshotDataDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto>
            fileContextToGrapeshotData__ = input.readMessage(
                FileContextToGrapeshotDataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            fileContextToGrapeshotData_.getMutableMap().put(
                fileContextToGrapeshotData__.getKey(), fileContextToGrapeshotData__.getValue());
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetGrapeshotUploadUrlOutProto_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetFileContextToGrapeshotData();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetGrapeshotUploadUrlOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.class, POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>FAILURE = 1;</code>
     */
    FAILURE(1),
    /**
     * <code>SUCCESS = 2;</code>
     */
    SUCCESS(2),
    /**
     * <code>MISSING_FILE_CONTEXTS = 3;</code>
     */
    MISSING_FILE_CONTEXTS(3),
    /**
     * <code>DUPLICATE_FILE_CONTEXT = 4;</code>
     */
    DUPLICATE_FILE_CONTEXT(4),
    /**
     * <code>MISSING_SUBMISSION_TYPE = 5;</code>
     */
    MISSING_SUBMISSION_TYPE(5),
    /**
     * <code>MISSING_SUBMISSION_ID = 6;</code>
     */
    MISSING_SUBMISSION_ID(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>FAILURE = 1;</code>
     */
    public static final int FAILURE_VALUE = 1;
    /**
     * <code>SUCCESS = 2;</code>
     */
    public static final int SUCCESS_VALUE = 2;
    /**
     * <code>MISSING_FILE_CONTEXTS = 3;</code>
     */
    public static final int MISSING_FILE_CONTEXTS_VALUE = 3;
    /**
     * <code>DUPLICATE_FILE_CONTEXT = 4;</code>
     */
    public static final int DUPLICATE_FILE_CONTEXT_VALUE = 4;
    /**
     * <code>MISSING_SUBMISSION_TYPE = 5;</code>
     */
    public static final int MISSING_SUBMISSION_TYPE_VALUE = 5;
    /**
     * <code>MISSING_SUBMISSION_ID = 6;</code>
     */
    public static final int MISSING_SUBMISSION_ID_VALUE = 6;


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
        case 1: return FAILURE;
        case 2: return SUCCESS;
        case 3: return MISSING_FILE_CONTEXTS;
        case 4: return DUPLICATE_FILE_CONTEXT;
        case 5: return MISSING_SUBMISSION_TYPE;
        case 6: return MISSING_SUBMISSION_ID;
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
      return POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status result = POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status.UNRECOGNIZED : result;
  }

  public static final int FILE_CONTEXT_TO_GRAPESHOT_DATA_FIELD_NUMBER = 4;
  private static final class FileContextToGrapeshotDataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto>newDefaultInstance(
                POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetGrapeshotUploadUrlOutProto_FileContextToGrapeshotDataEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                POGOProtos.Rpc.GrapeshotUploadingDataProto.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto> fileContextToGrapeshotData_;
  private com.google.protobuf.MapField<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto>
  internalGetFileContextToGrapeshotData() {
    if (fileContextToGrapeshotData_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          FileContextToGrapeshotDataDefaultEntryHolder.defaultEntry);
    }
    return fileContextToGrapeshotData_;
  }

  public int getFileContextToGrapeshotDataCount() {
    return internalGetFileContextToGrapeshotData().getMap().size();
  }
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
   */

  @java.lang.Override
  public boolean containsFileContextToGrapeshotData(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetFileContextToGrapeshotData().getMap().containsKey(key);
  }
  /**
   * Use {@link #getFileContextToGrapeshotDataMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto> getFileContextToGrapeshotData() {
    return getFileContextToGrapeshotDataMap();
  }
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto> getFileContextToGrapeshotDataMap() {
    return internalGetFileContextToGrapeshotData().getMap();
  }
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
   */
  @java.lang.Override

  public POGOProtos.Rpc.GrapeshotUploadingDataProto getFileContextToGrapeshotDataOrDefault(
      java.lang.String key,
      POGOProtos.Rpc.GrapeshotUploadingDataProto defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto> map =
        internalGetFileContextToGrapeshotData().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
   */
  @java.lang.Override

  public POGOProtos.Rpc.GrapeshotUploadingDataProto getFileContextToGrapeshotDataOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto> map =
        internalGetFileContextToGrapeshotData().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (status_ != POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetFileContextToGrapeshotData(),
        FileContextToGrapeshotDataDefaultEntryHolder.defaultEntry,
        4);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    for (java.util.Map.Entry<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto> entry
         : internalGetFileContextToGrapeshotData().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto>
      fileContextToGrapeshotData__ = FileContextToGrapeshotDataDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, fileContextToGrapeshotData__);
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
    if (!(obj instanceof POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto other = (POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto) obj;

    if (status_ != other.status_) return false;
    if (!internalGetFileContextToGrapeshotData().equals(
        other.internalGetFileContextToGrapeshotData())) return false;
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
    if (!internalGetFileContextToGrapeshotData().getMap().isEmpty()) {
      hash = (37 * hash) + FILE_CONTEXT_TO_GRAPESHOT_DATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetFileContextToGrapeshotData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto)
      POGOProtos.Rpc.GetGrapeshotUploadUrlOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetGrapeshotUploadUrlOutProto_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetFileContextToGrapeshotData();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutableFileContextToGrapeshotData();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetGrapeshotUploadUrlOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.class, POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.newBuilder()
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
      status_ = 0;

      internalGetMutableFileContextToGrapeshotData().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetGrapeshotUploadUrlOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto build() {
      POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto buildPartial() {
      POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto result = new POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto(this);
      int from_bitField0_ = bitField0_;
      result.status_ = status_;
      result.fileContextToGrapeshotData_ = internalGetFileContextToGrapeshotData();
      result.fileContextToGrapeshotData_.makeImmutable();
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
      if (other instanceof POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto) {
        return mergeFrom((POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto other) {
      if (other == POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      internalGetMutableFileContextToGrapeshotData().mergeFrom(
          other.internalGetFileContextToGrapeshotData());
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
      POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status result = POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto> fileContextToGrapeshotData_;
    private com.google.protobuf.MapField<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto>
    internalGetFileContextToGrapeshotData() {
      if (fileContextToGrapeshotData_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FileContextToGrapeshotDataDefaultEntryHolder.defaultEntry);
      }
      return fileContextToGrapeshotData_;
    }
    private com.google.protobuf.MapField<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto>
    internalGetMutableFileContextToGrapeshotData() {
      onChanged();;
      if (fileContextToGrapeshotData_ == null) {
        fileContextToGrapeshotData_ = com.google.protobuf.MapField.newMapField(
            FileContextToGrapeshotDataDefaultEntryHolder.defaultEntry);
      }
      if (!fileContextToGrapeshotData_.isMutable()) {
        fileContextToGrapeshotData_ = fileContextToGrapeshotData_.copy();
      }
      return fileContextToGrapeshotData_;
    }

    public int getFileContextToGrapeshotDataCount() {
      return internalGetFileContextToGrapeshotData().getMap().size();
    }
    /**
     * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
     */

    @java.lang.Override
    public boolean containsFileContextToGrapeshotData(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetFileContextToGrapeshotData().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFileContextToGrapeshotDataMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto> getFileContextToGrapeshotData() {
      return getFileContextToGrapeshotDataMap();
    }
    /**
     * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto> getFileContextToGrapeshotDataMap() {
      return internalGetFileContextToGrapeshotData().getMap();
    }
    /**
     * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
     */
    @java.lang.Override

    public POGOProtos.Rpc.GrapeshotUploadingDataProto getFileContextToGrapeshotDataOrDefault(
        java.lang.String key,
        POGOProtos.Rpc.GrapeshotUploadingDataProto defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto> map =
          internalGetFileContextToGrapeshotData().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
     */
    @java.lang.Override

    public POGOProtos.Rpc.GrapeshotUploadingDataProto getFileContextToGrapeshotDataOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto> map =
          internalGetFileContextToGrapeshotData().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearFileContextToGrapeshotData() {
      internalGetMutableFileContextToGrapeshotData().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
     */

    public Builder removeFileContextToGrapeshotData(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableFileContextToGrapeshotData().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto>
    getMutableFileContextToGrapeshotData() {
      return internalGetMutableFileContextToGrapeshotData().getMutableMap();
    }
    /**
     * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
     */
    public Builder putFileContextToGrapeshotData(
        java.lang.String key,
        POGOProtos.Rpc.GrapeshotUploadingDataProto value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableFileContextToGrapeshotData().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .POGOProtos.Rpc.GrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
     */

    public Builder putAllFileContextToGrapeshotData(
        java.util.Map<java.lang.String, POGOProtos.Rpc.GrapeshotUploadingDataProto> values) {
      internalGetMutableFileContextToGrapeshotData().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto)
  private static final POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto();
  }

  public static POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetGrapeshotUploadUrlOutProto>
      PARSER = new com.google.protobuf.AbstractParser<GetGrapeshotUploadUrlOutProto>() {
    @java.lang.Override
    public GetGrapeshotUploadUrlOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetGrapeshotUploadUrlOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetGrapeshotUploadUrlOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetGrapeshotUploadUrlOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetGrapeshotUploadUrlOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

