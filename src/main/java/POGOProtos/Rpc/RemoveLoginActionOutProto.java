// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: Niantic.Platform.Protos.RemoveLoginActionOutProto
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.RemoveLoginActionOutProto}
 */
public final class RemoveLoginActionOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.RemoveLoginActionOutProto)
    RemoveLoginActionOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveLoginActionOutProto.newBuilder() to construct.
  private RemoveLoginActionOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveLoginActionOutProto() {
    loginDetail_ = java.util.Collections.emptyList();
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveLoginActionOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemoveLoginActionOutProto(
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

            success_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              loginDetail_ = new java.util.ArrayList<POGOProtos.Rpc.LoginDetail>();
              mutable_bitField0_ |= 0x00000001;
            }
            loginDetail_.add(
                input.readMessage(POGOProtos.Rpc.LoginDetail.parser(), extensionRegistry));
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            status_ = rawValue;
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
        loginDetail_ = java.util.Collections.unmodifiableList(loginDetail_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RemoveLoginActionOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RemoveLoginActionOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.RemoveLoginActionOutProto.class, POGOProtos.Rpc.RemoveLoginActionOutProto.Builder.class);
  }

  /**
   * <pre>
   * ref: Niantic.Platform.Protos.RemoveLoginActionOutProto/Types/Status
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.RemoveLoginActionOutProto.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>LOGIN_NOT_REMOVABLE = 1;</code>
     */
    LOGIN_NOT_REMOVABLE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>LOGIN_NOT_REMOVABLE = 1;</code>
     */
    public static final int LOGIN_NOT_REMOVABLE_VALUE = 1;


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
        case 1: return LOGIN_NOT_REMOVABLE;
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
      return POGOProtos.Rpc.RemoveLoginActionOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.RemoveLoginActionOutProto.Status)
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;
  /**
   * <code>bool success = 1;</code>
   * @return The success.
   */
  @java.lang.Override
  public boolean getSuccess() {
    return success_;
  }

  public static final int LOGIN_DETAIL_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.LoginDetail> loginDetail_;
  /**
   * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.LoginDetail> getLoginDetailList() {
    return loginDetail_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.LoginDetailOrBuilder> 
      getLoginDetailOrBuilderList() {
    return loginDetail_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
   */
  @java.lang.Override
  public int getLoginDetailCount() {
    return loginDetail_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LoginDetail getLoginDetail(int index) {
    return loginDetail_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LoginDetailOrBuilder getLoginDetailOrBuilder(
      int index) {
    return loginDetail_.get(index);
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.RemoveLoginActionOutProto.Status status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.RemoveLoginActionOutProto.Status status = 3;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.RemoveLoginActionOutProto.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.RemoveLoginActionOutProto.Status result = POGOProtos.Rpc.RemoveLoginActionOutProto.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.RemoveLoginActionOutProto.Status.UNRECOGNIZED : result;
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
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    for (int i = 0; i < loginDetail_.size(); i++) {
      output.writeMessage(2, loginDetail_.get(i));
    }
    if (status_ != POGOProtos.Rpc.RemoveLoginActionOutProto.Status.UNSET.getNumber()) {
      output.writeEnum(3, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
    }
    for (int i = 0; i < loginDetail_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, loginDetail_.get(i));
    }
    if (status_ != POGOProtos.Rpc.RemoveLoginActionOutProto.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
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
    if (!(obj instanceof POGOProtos.Rpc.RemoveLoginActionOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.RemoveLoginActionOutProto other = (POGOProtos.Rpc.RemoveLoginActionOutProto) obj;

    if (getSuccess()
        != other.getSuccess()) return false;
    if (!getLoginDetailList()
        .equals(other.getLoginDetailList())) return false;
    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    if (getLoginDetailCount() > 0) {
      hash = (37 * hash) + LOGIN_DETAIL_FIELD_NUMBER;
      hash = (53 * hash) + getLoginDetailList().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.RemoveLoginActionOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RemoveLoginActionOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RemoveLoginActionOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RemoveLoginActionOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RemoveLoginActionOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RemoveLoginActionOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RemoveLoginActionOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RemoveLoginActionOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.RemoveLoginActionOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RemoveLoginActionOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.RemoveLoginActionOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RemoveLoginActionOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.RemoveLoginActionOutProto prototype) {
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
   * ref: Niantic.Platform.Protos.RemoveLoginActionOutProto
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.RemoveLoginActionOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.RemoveLoginActionOutProto)
      POGOProtos.Rpc.RemoveLoginActionOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RemoveLoginActionOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RemoveLoginActionOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.RemoveLoginActionOutProto.class, POGOProtos.Rpc.RemoveLoginActionOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.RemoveLoginActionOutProto.newBuilder()
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
        getLoginDetailFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      success_ = false;

      if (loginDetailBuilder_ == null) {
        loginDetail_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        loginDetailBuilder_.clear();
      }
      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RemoveLoginActionOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.RemoveLoginActionOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.RemoveLoginActionOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.RemoveLoginActionOutProto build() {
      POGOProtos.Rpc.RemoveLoginActionOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.RemoveLoginActionOutProto buildPartial() {
      POGOProtos.Rpc.RemoveLoginActionOutProto result = new POGOProtos.Rpc.RemoveLoginActionOutProto(this);
      int from_bitField0_ = bitField0_;
      result.success_ = success_;
      if (loginDetailBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          loginDetail_ = java.util.Collections.unmodifiableList(loginDetail_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.loginDetail_ = loginDetail_;
      } else {
        result.loginDetail_ = loginDetailBuilder_.build();
      }
      result.status_ = status_;
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
      if (other instanceof POGOProtos.Rpc.RemoveLoginActionOutProto) {
        return mergeFrom((POGOProtos.Rpc.RemoveLoginActionOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.RemoveLoginActionOutProto other) {
      if (other == POGOProtos.Rpc.RemoveLoginActionOutProto.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (loginDetailBuilder_ == null) {
        if (!other.loginDetail_.isEmpty()) {
          if (loginDetail_.isEmpty()) {
            loginDetail_ = other.loginDetail_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLoginDetailIsMutable();
            loginDetail_.addAll(other.loginDetail_);
          }
          onChanged();
        }
      } else {
        if (!other.loginDetail_.isEmpty()) {
          if (loginDetailBuilder_.isEmpty()) {
            loginDetailBuilder_.dispose();
            loginDetailBuilder_ = null;
            loginDetail_ = other.loginDetail_;
            bitField0_ = (bitField0_ & ~0x00000001);
            loginDetailBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLoginDetailFieldBuilder() : null;
          } else {
            loginDetailBuilder_.addAllMessages(other.loginDetail_);
          }
        }
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      POGOProtos.Rpc.RemoveLoginActionOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.RemoveLoginActionOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean success_ ;
    /**
     * <code>bool success = 1;</code>
     * @return The success.
     */
    @java.lang.Override
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>bool success = 1;</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool success = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.LoginDetail> loginDetail_ =
      java.util.Collections.emptyList();
    private void ensureLoginDetailIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        loginDetail_ = new java.util.ArrayList<POGOProtos.Rpc.LoginDetail>(loginDetail_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.LoginDetail, POGOProtos.Rpc.LoginDetail.Builder, POGOProtos.Rpc.LoginDetailOrBuilder> loginDetailBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.LoginDetail> getLoginDetailList() {
      if (loginDetailBuilder_ == null) {
        return java.util.Collections.unmodifiableList(loginDetail_);
      } else {
        return loginDetailBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public int getLoginDetailCount() {
      if (loginDetailBuilder_ == null) {
        return loginDetail_.size();
      } else {
        return loginDetailBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public POGOProtos.Rpc.LoginDetail getLoginDetail(int index) {
      if (loginDetailBuilder_ == null) {
        return loginDetail_.get(index);
      } else {
        return loginDetailBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public Builder setLoginDetail(
        int index, POGOProtos.Rpc.LoginDetail value) {
      if (loginDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLoginDetailIsMutable();
        loginDetail_.set(index, value);
        onChanged();
      } else {
        loginDetailBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public Builder setLoginDetail(
        int index, POGOProtos.Rpc.LoginDetail.Builder builderForValue) {
      if (loginDetailBuilder_ == null) {
        ensureLoginDetailIsMutable();
        loginDetail_.set(index, builderForValue.build());
        onChanged();
      } else {
        loginDetailBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public Builder addLoginDetail(POGOProtos.Rpc.LoginDetail value) {
      if (loginDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLoginDetailIsMutable();
        loginDetail_.add(value);
        onChanged();
      } else {
        loginDetailBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public Builder addLoginDetail(
        int index, POGOProtos.Rpc.LoginDetail value) {
      if (loginDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLoginDetailIsMutable();
        loginDetail_.add(index, value);
        onChanged();
      } else {
        loginDetailBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public Builder addLoginDetail(
        POGOProtos.Rpc.LoginDetail.Builder builderForValue) {
      if (loginDetailBuilder_ == null) {
        ensureLoginDetailIsMutable();
        loginDetail_.add(builderForValue.build());
        onChanged();
      } else {
        loginDetailBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public Builder addLoginDetail(
        int index, POGOProtos.Rpc.LoginDetail.Builder builderForValue) {
      if (loginDetailBuilder_ == null) {
        ensureLoginDetailIsMutable();
        loginDetail_.add(index, builderForValue.build());
        onChanged();
      } else {
        loginDetailBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public Builder addAllLoginDetail(
        java.lang.Iterable<? extends POGOProtos.Rpc.LoginDetail> values) {
      if (loginDetailBuilder_ == null) {
        ensureLoginDetailIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, loginDetail_);
        onChanged();
      } else {
        loginDetailBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public Builder clearLoginDetail() {
      if (loginDetailBuilder_ == null) {
        loginDetail_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        loginDetailBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public Builder removeLoginDetail(int index) {
      if (loginDetailBuilder_ == null) {
        ensureLoginDetailIsMutable();
        loginDetail_.remove(index);
        onChanged();
      } else {
        loginDetailBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public POGOProtos.Rpc.LoginDetail.Builder getLoginDetailBuilder(
        int index) {
      return getLoginDetailFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public POGOProtos.Rpc.LoginDetailOrBuilder getLoginDetailOrBuilder(
        int index) {
      if (loginDetailBuilder_ == null) {
        return loginDetail_.get(index);  } else {
        return loginDetailBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.LoginDetailOrBuilder> 
         getLoginDetailOrBuilderList() {
      if (loginDetailBuilder_ != null) {
        return loginDetailBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(loginDetail_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public POGOProtos.Rpc.LoginDetail.Builder addLoginDetailBuilder() {
      return getLoginDetailFieldBuilder().addBuilder(
          POGOProtos.Rpc.LoginDetail.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public POGOProtos.Rpc.LoginDetail.Builder addLoginDetailBuilder(
        int index) {
      return getLoginDetailFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.LoginDetail.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LoginDetail login_detail = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.LoginDetail.Builder> 
         getLoginDetailBuilderList() {
      return getLoginDetailFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.LoginDetail, POGOProtos.Rpc.LoginDetail.Builder, POGOProtos.Rpc.LoginDetailOrBuilder> 
        getLoginDetailFieldBuilder() {
      if (loginDetailBuilder_ == null) {
        loginDetailBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.LoginDetail, POGOProtos.Rpc.LoginDetail.Builder, POGOProtos.Rpc.LoginDetailOrBuilder>(
                loginDetail_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        loginDetail_ = null;
      }
      return loginDetailBuilder_;
    }

    private int status_ = 0;
    /**
     * <code>.POGOProtos.Rpc.RemoveLoginActionOutProto.Status status = 3;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.RemoveLoginActionOutProto.Status status = 3;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.RemoveLoginActionOutProto.Status status = 3;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.RemoveLoginActionOutProto.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.RemoveLoginActionOutProto.Status result = POGOProtos.Rpc.RemoveLoginActionOutProto.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.RemoveLoginActionOutProto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.RemoveLoginActionOutProto.Status status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.RemoveLoginActionOutProto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.RemoveLoginActionOutProto.Status status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.RemoveLoginActionOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.RemoveLoginActionOutProto)
  private static final POGOProtos.Rpc.RemoveLoginActionOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.RemoveLoginActionOutProto();
  }

  public static POGOProtos.Rpc.RemoveLoginActionOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveLoginActionOutProto>
      PARSER = new com.google.protobuf.AbstractParser<RemoveLoginActionOutProto>() {
    @java.lang.Override
    public RemoveLoginActionOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemoveLoginActionOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemoveLoginActionOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveLoginActionOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.RemoveLoginActionOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

