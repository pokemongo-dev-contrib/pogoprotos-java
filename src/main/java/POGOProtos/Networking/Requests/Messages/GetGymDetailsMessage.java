// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/GetGymDetailsMessage.proto

package POGOProtos.Networking.Requests.Messages;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage}
 */
public  final class GetGymDetailsMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage)
    GetGymDetailsMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetGymDetailsMessage.newBuilder() to construct.
  private GetGymDetailsMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetGymDetailsMessage() {
    gymId_ = "";
    clientVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetGymDetailsMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetGymDetailsMessage(
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

            gymId_ = s;
            break;
          }
          case 17: {

            playerLatitude_ = input.readDouble();
            break;
          }
          case 25: {

            playerLongitude_ = input.readDouble();
            break;
          }
          case 33: {

            gymLatitude_ = input.readDouble();
            break;
          }
          case 41: {

            gymLongitude_ = input.readDouble();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            clientVersion_ = s;
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
    return POGOProtos.Networking.Requests.Messages.GetGymDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetGymDetailsMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Messages.GetGymDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetGymDetailsMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage.class, POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage.Builder.class);
  }

  public static final int GYM_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object gymId_;
  /**
   * <code>string gym_id = 1;</code>
   * @return The gymId.
   */
  public java.lang.String getGymId() {
    java.lang.Object ref = gymId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gymId_ = s;
      return s;
    }
  }
  /**
   * <code>string gym_id = 1;</code>
   * @return The bytes for gymId.
   */
  public com.google.protobuf.ByteString
      getGymIdBytes() {
    java.lang.Object ref = gymId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gymId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAYER_LATITUDE_FIELD_NUMBER = 2;
  private double playerLatitude_;
  /**
   * <code>double player_latitude = 2;</code>
   * @return The playerLatitude.
   */
  public double getPlayerLatitude() {
    return playerLatitude_;
  }

  public static final int PLAYER_LONGITUDE_FIELD_NUMBER = 3;
  private double playerLongitude_;
  /**
   * <code>double player_longitude = 3;</code>
   * @return The playerLongitude.
   */
  public double getPlayerLongitude() {
    return playerLongitude_;
  }

  public static final int GYM_LATITUDE_FIELD_NUMBER = 4;
  private double gymLatitude_;
  /**
   * <code>double gym_latitude = 4;</code>
   * @return The gymLatitude.
   */
  public double getGymLatitude() {
    return gymLatitude_;
  }

  public static final int GYM_LONGITUDE_FIELD_NUMBER = 5;
  private double gymLongitude_;
  /**
   * <code>double gym_longitude = 5;</code>
   * @return The gymLongitude.
   */
  public double getGymLongitude() {
    return gymLongitude_;
  }

  public static final int CLIENT_VERSION_FIELD_NUMBER = 6;
  private volatile java.lang.Object clientVersion_;
  /**
   * <code>string client_version = 6;</code>
   * @return The clientVersion.
   */
  public java.lang.String getClientVersion() {
    java.lang.Object ref = clientVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientVersion_ = s;
      return s;
    }
  }
  /**
   * <code>string client_version = 6;</code>
   * @return The bytes for clientVersion.
   */
  public com.google.protobuf.ByteString
      getClientVersionBytes() {
    java.lang.Object ref = clientVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getGymIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gymId_);
    }
    if (playerLatitude_ != 0D) {
      output.writeDouble(2, playerLatitude_);
    }
    if (playerLongitude_ != 0D) {
      output.writeDouble(3, playerLongitude_);
    }
    if (gymLatitude_ != 0D) {
      output.writeDouble(4, gymLatitude_);
    }
    if (gymLongitude_ != 0D) {
      output.writeDouble(5, gymLongitude_);
    }
    if (!getClientVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, clientVersion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGymIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gymId_);
    }
    if (playerLatitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, playerLatitude_);
    }
    if (playerLongitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, playerLongitude_);
    }
    if (gymLatitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, gymLatitude_);
    }
    if (gymLongitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, gymLongitude_);
    }
    if (!getClientVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, clientVersion_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage other = (POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage) obj;

    if (!getGymId()
        .equals(other.getGymId())) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLatitude())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLatitude())) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLongitude())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLongitude())) return false;
    if (java.lang.Double.doubleToLongBits(getGymLatitude())
        != java.lang.Double.doubleToLongBits(
            other.getGymLatitude())) return false;
    if (java.lang.Double.doubleToLongBits(getGymLongitude())
        != java.lang.Double.doubleToLongBits(
            other.getGymLongitude())) return false;
    if (!getClientVersion()
        .equals(other.getClientVersion())) return false;
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
    hash = (37 * hash) + GYM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGymId().hashCode();
    hash = (37 * hash) + PLAYER_LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLatitude()));
    hash = (37 * hash) + PLAYER_LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLongitude()));
    hash = (37 * hash) + GYM_LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getGymLatitude()));
    hash = (37 * hash) + GYM_LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getGymLongitude()));
    hash = (37 * hash) + CLIENT_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getClientVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage)
      POGOProtos.Networking.Requests.Messages.GetGymDetailsMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.GetGymDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetGymDetailsMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Messages.GetGymDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetGymDetailsMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage.class, POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage.newBuilder()
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
      gymId_ = "";

      playerLatitude_ = 0D;

      playerLongitude_ = 0D;

      gymLatitude_ = 0D;

      gymLongitude_ = 0D;

      clientVersion_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Messages.GetGymDetailsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_GetGymDetailsMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage build() {
      POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage buildPartial() {
      POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage result = new POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage(this);
      result.gymId_ = gymId_;
      result.playerLatitude_ = playerLatitude_;
      result.playerLongitude_ = playerLongitude_;
      result.gymLatitude_ = gymLatitude_;
      result.gymLongitude_ = gymLongitude_;
      result.clientVersion_ = clientVersion_;
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
      if (other instanceof POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage other) {
      if (other == POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage.getDefaultInstance()) return this;
      if (!other.getGymId().isEmpty()) {
        gymId_ = other.gymId_;
        onChanged();
      }
      if (other.getPlayerLatitude() != 0D) {
        setPlayerLatitude(other.getPlayerLatitude());
      }
      if (other.getPlayerLongitude() != 0D) {
        setPlayerLongitude(other.getPlayerLongitude());
      }
      if (other.getGymLatitude() != 0D) {
        setGymLatitude(other.getGymLatitude());
      }
      if (other.getGymLongitude() != 0D) {
        setGymLongitude(other.getGymLongitude());
      }
      if (!other.getClientVersion().isEmpty()) {
        clientVersion_ = other.clientVersion_;
        onChanged();
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
      POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object gymId_ = "";
    /**
     * <code>string gym_id = 1;</code>
     * @return The gymId.
     */
    public java.lang.String getGymId() {
      java.lang.Object ref = gymId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gymId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gym_id = 1;</code>
     * @return The bytes for gymId.
     */
    public com.google.protobuf.ByteString
        getGymIdBytes() {
      java.lang.Object ref = gymId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gymId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gym_id = 1;</code>
     * @param value The gymId to set.
     * @return This builder for chaining.
     */
    public Builder setGymId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gymId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gym_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymId() {
      
      gymId_ = getDefaultInstance().getGymId();
      onChanged();
      return this;
    }
    /**
     * <code>string gym_id = 1;</code>
     * @param value The bytes for gymId to set.
     * @return This builder for chaining.
     */
    public Builder setGymIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gymId_ = value;
      onChanged();
      return this;
    }

    private double playerLatitude_ ;
    /**
     * <code>double player_latitude = 2;</code>
     * @return The playerLatitude.
     */
    public double getPlayerLatitude() {
      return playerLatitude_;
    }
    /**
     * <code>double player_latitude = 2;</code>
     * @param value The playerLatitude to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLatitude(double value) {
      
      playerLatitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_latitude = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLatitude() {
      
      playerLatitude_ = 0D;
      onChanged();
      return this;
    }

    private double playerLongitude_ ;
    /**
     * <code>double player_longitude = 3;</code>
     * @return The playerLongitude.
     */
    public double getPlayerLongitude() {
      return playerLongitude_;
    }
    /**
     * <code>double player_longitude = 3;</code>
     * @param value The playerLongitude to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLongitude(double value) {
      
      playerLongitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_longitude = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLongitude() {
      
      playerLongitude_ = 0D;
      onChanged();
      return this;
    }

    private double gymLatitude_ ;
    /**
     * <code>double gym_latitude = 4;</code>
     * @return The gymLatitude.
     */
    public double getGymLatitude() {
      return gymLatitude_;
    }
    /**
     * <code>double gym_latitude = 4;</code>
     * @param value The gymLatitude to set.
     * @return This builder for chaining.
     */
    public Builder setGymLatitude(double value) {
      
      gymLatitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gym_latitude = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymLatitude() {
      
      gymLatitude_ = 0D;
      onChanged();
      return this;
    }

    private double gymLongitude_ ;
    /**
     * <code>double gym_longitude = 5;</code>
     * @return The gymLongitude.
     */
    public double getGymLongitude() {
      return gymLongitude_;
    }
    /**
     * <code>double gym_longitude = 5;</code>
     * @param value The gymLongitude to set.
     * @return This builder for chaining.
     */
    public Builder setGymLongitude(double value) {
      
      gymLongitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gym_longitude = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymLongitude() {
      
      gymLongitude_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object clientVersion_ = "";
    /**
     * <code>string client_version = 6;</code>
     * @return The clientVersion.
     */
    public java.lang.String getClientVersion() {
      java.lang.Object ref = clientVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string client_version = 6;</code>
     * @return The bytes for clientVersion.
     */
    public com.google.protobuf.ByteString
        getClientVersionBytes() {
      java.lang.Object ref = clientVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string client_version = 6;</code>
     * @param value The clientVersion to set.
     * @return This builder for chaining.
     */
    public Builder setClientVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string client_version = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientVersion() {
      
      clientVersion_ = getDefaultInstance().getClientVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string client_version = 6;</code>
     * @param value The bytes for clientVersion to set.
     * @return This builder for chaining.
     */
    public Builder setClientVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientVersion_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage)
  private static final POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage();
  }

  public static POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetGymDetailsMessage>
      PARSER = new com.google.protobuf.AbstractParser<GetGymDetailsMessage>() {
    @java.lang.Override
    public GetGymDetailsMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetGymDetailsMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetGymDetailsMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetGymDetailsMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
