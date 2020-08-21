// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Niantic.Platform.Protos.GetIncomingFriendInvitesOutProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.GetIncomingFriendInvitesOutProto}
 */
public final class GetIncomingFriendInvitesOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetIncomingFriendInvitesOutProto)
    GetIncomingFriendInvitesOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetIncomingFriendInvitesOutProto.newBuilder() to construct.
  private GetIncomingFriendInvitesOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetIncomingFriendInvitesOutProto() {
    result_ = 0;
    invites_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetIncomingFriendInvitesOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetIncomingFriendInvitesOutProto(
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

            result_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              invites_ = new java.util.ArrayList<POGOProtos.Rpc.IncomingFriendInviteDisplayProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            invites_.add(
                input.readMessage(POGOProtos.Rpc.IncomingFriendInviteDisplayProto.parser(), extensionRegistry));
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
        invites_ = java.util.Collections.unmodifiableList(invites_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetIncomingFriendInvitesOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetIncomingFriendInvitesOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.class, POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Builder.class);
  }

  /**
   * <pre>
   * ref: Niantic.Platform.Protos.GetIncomingFriendInvitesOutProto/Types/Result
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result}
   */
  public enum Result
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    ERROR_UNKNOWN(2),
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    public static final int ERROR_UNKNOWN_VALUE = 2;


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
    public static Result valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Result forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_UNKNOWN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Result> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.forNumber(number);
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
      return POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
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

    private Result(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result result = POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int INVITES_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.IncomingFriendInviteDisplayProto> invites_;
  /**
   * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.IncomingFriendInviteDisplayProto> getInvitesList() {
    return invites_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.IncomingFriendInviteDisplayProtoOrBuilder> 
      getInvitesOrBuilderList() {
    return invites_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
   */
  @java.lang.Override
  public int getInvitesCount() {
    return invites_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.IncomingFriendInviteDisplayProto getInvites(int index) {
    return invites_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.IncomingFriendInviteDisplayProtoOrBuilder getInvitesOrBuilder(
      int index) {
    return invites_.get(index);
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
    if (result_ != POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    for (int i = 0; i < invites_.size(); i++) {
      output.writeMessage(2, invites_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    for (int i = 0; i < invites_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, invites_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.GetIncomingFriendInvitesOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetIncomingFriendInvitesOutProto other = (POGOProtos.Rpc.GetIncomingFriendInvitesOutProto) obj;

    if (result_ != other.result_) return false;
    if (!getInvitesList()
        .equals(other.getInvitesList())) return false;
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    if (getInvitesCount() > 0) {
      hash = (37 * hash) + INVITES_FIELD_NUMBER;
      hash = (53 * hash) + getInvitesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetIncomingFriendInvitesOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetIncomingFriendInvitesOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetIncomingFriendInvitesOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetIncomingFriendInvitesOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetIncomingFriendInvitesOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetIncomingFriendInvitesOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetIncomingFriendInvitesOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetIncomingFriendInvitesOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetIncomingFriendInvitesOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetIncomingFriendInvitesOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetIncomingFriendInvitesOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetIncomingFriendInvitesOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetIncomingFriendInvitesOutProto prototype) {
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
   * ref: Niantic.Platform.Protos.GetIncomingFriendInvitesOutProto
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.GetIncomingFriendInvitesOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetIncomingFriendInvitesOutProto)
      POGOProtos.Rpc.GetIncomingFriendInvitesOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetIncomingFriendInvitesOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetIncomingFriendInvitesOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.class, POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.newBuilder()
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
        getInvitesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      result_ = 0;

      if (invitesBuilder_ == null) {
        invites_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        invitesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetIncomingFriendInvitesOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetIncomingFriendInvitesOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetIncomingFriendInvitesOutProto build() {
      POGOProtos.Rpc.GetIncomingFriendInvitesOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetIncomingFriendInvitesOutProto buildPartial() {
      POGOProtos.Rpc.GetIncomingFriendInvitesOutProto result = new POGOProtos.Rpc.GetIncomingFriendInvitesOutProto(this);
      int from_bitField0_ = bitField0_;
      result.result_ = result_;
      if (invitesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          invites_ = java.util.Collections.unmodifiableList(invites_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.invites_ = invites_;
      } else {
        result.invites_ = invitesBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.GetIncomingFriendInvitesOutProto) {
        return mergeFrom((POGOProtos.Rpc.GetIncomingFriendInvitesOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetIncomingFriendInvitesOutProto other) {
      if (other == POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (invitesBuilder_ == null) {
        if (!other.invites_.isEmpty()) {
          if (invites_.isEmpty()) {
            invites_ = other.invites_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInvitesIsMutable();
            invites_.addAll(other.invites_);
          }
          onChanged();
        }
      } else {
        if (!other.invites_.isEmpty()) {
          if (invitesBuilder_.isEmpty()) {
            invitesBuilder_.dispose();
            invitesBuilder_ = null;
            invites_ = other.invites_;
            bitField0_ = (bitField0_ & ~0x00000001);
            invitesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInvitesFieldBuilder() : null;
          } else {
            invitesBuilder_.addAllMessages(other.invites_);
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
      POGOProtos.Rpc.GetIncomingFriendInvitesOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetIncomingFriendInvitesOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int result_ = 0;
    /**
     * <code>.POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result result = POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetIncomingFriendInvitesOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.IncomingFriendInviteDisplayProto> invites_ =
      java.util.Collections.emptyList();
    private void ensureInvitesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        invites_ = new java.util.ArrayList<POGOProtos.Rpc.IncomingFriendInviteDisplayProto>(invites_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.IncomingFriendInviteDisplayProto, POGOProtos.Rpc.IncomingFriendInviteDisplayProto.Builder, POGOProtos.Rpc.IncomingFriendInviteDisplayProtoOrBuilder> invitesBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.IncomingFriendInviteDisplayProto> getInvitesList() {
      if (invitesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(invites_);
      } else {
        return invitesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public int getInvitesCount() {
      if (invitesBuilder_ == null) {
        return invites_.size();
      } else {
        return invitesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public POGOProtos.Rpc.IncomingFriendInviteDisplayProto getInvites(int index) {
      if (invitesBuilder_ == null) {
        return invites_.get(index);
      } else {
        return invitesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public Builder setInvites(
        int index, POGOProtos.Rpc.IncomingFriendInviteDisplayProto value) {
      if (invitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvitesIsMutable();
        invites_.set(index, value);
        onChanged();
      } else {
        invitesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public Builder setInvites(
        int index, POGOProtos.Rpc.IncomingFriendInviteDisplayProto.Builder builderForValue) {
      if (invitesBuilder_ == null) {
        ensureInvitesIsMutable();
        invites_.set(index, builderForValue.build());
        onChanged();
      } else {
        invitesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public Builder addInvites(POGOProtos.Rpc.IncomingFriendInviteDisplayProto value) {
      if (invitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvitesIsMutable();
        invites_.add(value);
        onChanged();
      } else {
        invitesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public Builder addInvites(
        int index, POGOProtos.Rpc.IncomingFriendInviteDisplayProto value) {
      if (invitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInvitesIsMutable();
        invites_.add(index, value);
        onChanged();
      } else {
        invitesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public Builder addInvites(
        POGOProtos.Rpc.IncomingFriendInviteDisplayProto.Builder builderForValue) {
      if (invitesBuilder_ == null) {
        ensureInvitesIsMutable();
        invites_.add(builderForValue.build());
        onChanged();
      } else {
        invitesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public Builder addInvites(
        int index, POGOProtos.Rpc.IncomingFriendInviteDisplayProto.Builder builderForValue) {
      if (invitesBuilder_ == null) {
        ensureInvitesIsMutable();
        invites_.add(index, builderForValue.build());
        onChanged();
      } else {
        invitesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public Builder addAllInvites(
        java.lang.Iterable<? extends POGOProtos.Rpc.IncomingFriendInviteDisplayProto> values) {
      if (invitesBuilder_ == null) {
        ensureInvitesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, invites_);
        onChanged();
      } else {
        invitesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public Builder clearInvites() {
      if (invitesBuilder_ == null) {
        invites_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        invitesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public Builder removeInvites(int index) {
      if (invitesBuilder_ == null) {
        ensureInvitesIsMutable();
        invites_.remove(index);
        onChanged();
      } else {
        invitesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public POGOProtos.Rpc.IncomingFriendInviteDisplayProto.Builder getInvitesBuilder(
        int index) {
      return getInvitesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public POGOProtos.Rpc.IncomingFriendInviteDisplayProtoOrBuilder getInvitesOrBuilder(
        int index) {
      if (invitesBuilder_ == null) {
        return invites_.get(index);  } else {
        return invitesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.IncomingFriendInviteDisplayProtoOrBuilder> 
         getInvitesOrBuilderList() {
      if (invitesBuilder_ != null) {
        return invitesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(invites_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public POGOProtos.Rpc.IncomingFriendInviteDisplayProto.Builder addInvitesBuilder() {
      return getInvitesFieldBuilder().addBuilder(
          POGOProtos.Rpc.IncomingFriendInviteDisplayProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public POGOProtos.Rpc.IncomingFriendInviteDisplayProto.Builder addInvitesBuilder(
        int index) {
      return getInvitesFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.IncomingFriendInviteDisplayProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.IncomingFriendInviteDisplayProto invites = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.IncomingFriendInviteDisplayProto.Builder> 
         getInvitesBuilderList() {
      return getInvitesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.IncomingFriendInviteDisplayProto, POGOProtos.Rpc.IncomingFriendInviteDisplayProto.Builder, POGOProtos.Rpc.IncomingFriendInviteDisplayProtoOrBuilder> 
        getInvitesFieldBuilder() {
      if (invitesBuilder_ == null) {
        invitesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.IncomingFriendInviteDisplayProto, POGOProtos.Rpc.IncomingFriendInviteDisplayProto.Builder, POGOProtos.Rpc.IncomingFriendInviteDisplayProtoOrBuilder>(
                invites_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        invites_ = null;
      }
      return invitesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetIncomingFriendInvitesOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetIncomingFriendInvitesOutProto)
  private static final POGOProtos.Rpc.GetIncomingFriendInvitesOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetIncomingFriendInvitesOutProto();
  }

  public static POGOProtos.Rpc.GetIncomingFriendInvitesOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetIncomingFriendInvitesOutProto>
      PARSER = new com.google.protobuf.AbstractParser<GetIncomingFriendInvitesOutProto>() {
    @java.lang.Override
    public GetIncomingFriendInvitesOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetIncomingFriendInvitesOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetIncomingFriendInvitesOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetIncomingFriendInvitesOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetIncomingFriendInvitesOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

