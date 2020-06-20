// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Niantic.Titan.Protos.GetGrapeshotUploadUrlOutProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto}
 */
public  final class TitanGetGrapeshotUploadUrlOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto)
    TitanGetGrapeshotUploadUrlOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TitanGetGrapeshotUploadUrlOutProto.newBuilder() to construct.
  private TitanGetGrapeshotUploadUrlOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TitanGetGrapeshotUploadUrlOutProto() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TitanGetGrapeshotUploadUrlOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TitanGetGrapeshotUploadUrlOutProto(
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
            com.google.protobuf.MapEntry<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto>
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanGetGrapeshotUploadUrlOutProto_descriptor;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanGetGrapeshotUploadUrlOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.class, POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Builder.class);
  }

  /**
   * <pre>
   * ref: Niantic.Titan.Protos.GetGrapeshotUploadUrlOutProto/Types/Status
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATUS_UNSET = 0;</code>
     */
    STATUS_UNSET(0),
    /**
     * <code>STATUS_FAILURE = 1;</code>
     */
    STATUS_FAILURE(1),
    /**
     * <code>STATUS_SUCCESS = 2;</code>
     */
    STATUS_SUCCESS(2),
    /**
     * <code>STATUS_MISSING_FILE_CONTEXTS = 3;</code>
     */
    STATUS_MISSING_FILE_CONTEXTS(3),
    /**
     * <code>STATUS_DUPLICATE_FILE_CONTEXT = 4;</code>
     */
    STATUS_DUPLICATE_FILE_CONTEXT(4),
    /**
     * <code>STATUS_MISSING_SUBMISSION_TYPE = 5;</code>
     */
    STATUS_MISSING_SUBMISSION_TYPE(5),
    /**
     * <code>STATUS_MISSING_SUBMISSION_ID = 6;</code>
     */
    STATUS_MISSING_SUBMISSION_ID(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STATUS_UNSET = 0;</code>
     */
    public static final int STATUS_UNSET_VALUE = 0;
    /**
     * <code>STATUS_FAILURE = 1;</code>
     */
    public static final int STATUS_FAILURE_VALUE = 1;
    /**
     * <code>STATUS_SUCCESS = 2;</code>
     */
    public static final int STATUS_SUCCESS_VALUE = 2;
    /**
     * <code>STATUS_MISSING_FILE_CONTEXTS = 3;</code>
     */
    public static final int STATUS_MISSING_FILE_CONTEXTS_VALUE = 3;
    /**
     * <code>STATUS_DUPLICATE_FILE_CONTEXT = 4;</code>
     */
    public static final int STATUS_DUPLICATE_FILE_CONTEXT_VALUE = 4;
    /**
     * <code>STATUS_MISSING_SUBMISSION_TYPE = 5;</code>
     */
    public static final int STATUS_MISSING_SUBMISSION_TYPE_VALUE = 5;
    /**
     * <code>STATUS_MISSING_SUBMISSION_ID = 6;</code>
     */
    public static final int STATUS_MISSING_SUBMISSION_ID_VALUE = 6;


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
        case 0: return STATUS_UNSET;
        case 1: return STATUS_FAILURE;
        case 2: return STATUS_SUCCESS;
        case 3: return STATUS_MISSING_FILE_CONTEXTS;
        case 4: return STATUS_DUPLICATE_FILE_CONTEXT;
        case 5: return STATUS_MISSING_SUBMISSION_TYPE;
        case 6: return STATUS_MISSING_SUBMISSION_ID;
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
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status status = 1;</code>
   * @return The status.
   */
  public POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status result = POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status.UNRECOGNIZED : result;
  }

  public static final int FILE_CONTEXT_TO_GRAPESHOT_DATA_FIELD_NUMBER = 4;
  private static final class FileContextToGrapeshotDataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto>newDefaultInstance(
                POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanGetGrapeshotUploadUrlOutProto_FileContextToGrapeshotDataEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                POGOProtos.Rpc.TitanGrapeshotUploadingDataProto.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto> fileContextToGrapeshotData_;
  private com.google.protobuf.MapField<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto>
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
   * <code>map&lt;string, .POGOProtos.Rpc.TitanGrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
   */

  public boolean containsFileContextToGrapeshotData(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetFileContextToGrapeshotData().getMap().containsKey(key);
  }
  /**
   * Use {@link #getFileContextToGrapeshotDataMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto> getFileContextToGrapeshotData() {
    return getFileContextToGrapeshotDataMap();
  }
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.TitanGrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
   */

  public java.util.Map<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto> getFileContextToGrapeshotDataMap() {
    return internalGetFileContextToGrapeshotData().getMap();
  }
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.TitanGrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
   */

  public POGOProtos.Rpc.TitanGrapeshotUploadingDataProto getFileContextToGrapeshotDataOrDefault(
      java.lang.String key,
      POGOProtos.Rpc.TitanGrapeshotUploadingDataProto defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto> map =
        internalGetFileContextToGrapeshotData().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .POGOProtos.Rpc.TitanGrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
   */

  public POGOProtos.Rpc.TitanGrapeshotUploadingDataProto getFileContextToGrapeshotDataOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto> map =
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
    if (status_ != POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status.STATUS_UNSET.getNumber()) {
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
    if (status_ != POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status.STATUS_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    for (java.util.Map.Entry<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto> entry
         : internalGetFileContextToGrapeshotData().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto>
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
    if (!(obj instanceof POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto other = (POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto) obj;

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

  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto prototype) {
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
   * ref: Niantic.Titan.Protos.GetGrapeshotUploadUrlOutProto
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto)
      POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanGetGrapeshotUploadUrlOutProto_descriptor;
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
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanGetGrapeshotUploadUrlOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.class, POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.newBuilder()
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
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_TitanGetGrapeshotUploadUrlOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto build() {
      POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto buildPartial() {
      POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto result = new POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto(this);
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
      if (other instanceof POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto) {
        return mergeFrom((POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto other) {
      if (other == POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.getDefaultInstance()) return this;
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
      POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status status = 1;</code>
     * @return The status.
     */
    public POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status result = POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto> fileContextToGrapeshotData_;
    private com.google.protobuf.MapField<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto>
    internalGetFileContextToGrapeshotData() {
      if (fileContextToGrapeshotData_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FileContextToGrapeshotDataDefaultEntryHolder.defaultEntry);
      }
      return fileContextToGrapeshotData_;
    }
    private com.google.protobuf.MapField<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto>
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
     * <code>map&lt;string, .POGOProtos.Rpc.TitanGrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
     */

    public boolean containsFileContextToGrapeshotData(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetFileContextToGrapeshotData().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFileContextToGrapeshotDataMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto> getFileContextToGrapeshotData() {
      return getFileContextToGrapeshotDataMap();
    }
    /**
     * <code>map&lt;string, .POGOProtos.Rpc.TitanGrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
     */

    public java.util.Map<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto> getFileContextToGrapeshotDataMap() {
      return internalGetFileContextToGrapeshotData().getMap();
    }
    /**
     * <code>map&lt;string, .POGOProtos.Rpc.TitanGrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
     */

    public POGOProtos.Rpc.TitanGrapeshotUploadingDataProto getFileContextToGrapeshotDataOrDefault(
        java.lang.String key,
        POGOProtos.Rpc.TitanGrapeshotUploadingDataProto defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto> map =
          internalGetFileContextToGrapeshotData().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .POGOProtos.Rpc.TitanGrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
     */

    public POGOProtos.Rpc.TitanGrapeshotUploadingDataProto getFileContextToGrapeshotDataOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto> map =
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
     * <code>map&lt;string, .POGOProtos.Rpc.TitanGrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
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
    public java.util.Map<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto>
    getMutableFileContextToGrapeshotData() {
      return internalGetMutableFileContextToGrapeshotData().getMutableMap();
    }
    /**
     * <code>map&lt;string, .POGOProtos.Rpc.TitanGrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
     */
    public Builder putFileContextToGrapeshotData(
        java.lang.String key,
        POGOProtos.Rpc.TitanGrapeshotUploadingDataProto value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableFileContextToGrapeshotData().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .POGOProtos.Rpc.TitanGrapeshotUploadingDataProto&gt; file_context_to_grapeshot_data = 4;</code>
     */

    public Builder putAllFileContextToGrapeshotData(
        java.util.Map<java.lang.String, POGOProtos.Rpc.TitanGrapeshotUploadingDataProto> values) {
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto)
  private static final POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto();
  }

  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TitanGetGrapeshotUploadUrlOutProto>
      PARSER = new com.google.protobuf.AbstractParser<TitanGetGrapeshotUploadUrlOutProto>() {
    @java.lang.Override
    public TitanGetGrapeshotUploadUrlOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TitanGetGrapeshotUploadUrlOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TitanGetGrapeshotUploadUrlOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TitanGetGrapeshotUploadUrlOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.TitanGetGrapeshotUploadUrlOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

