// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.InvasionStatus}
 */
public final class InvasionStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.InvasionStatus)
    InvasionStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InvasionStatus.newBuilder() to construct.
  private InvasionStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InvasionStatus() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InvasionStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InvasionStatus(
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InvasionStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InvasionStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.InvasionStatus.class, POGOProtos.Rpc.InvasionStatus.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.InvasionStatus.Status}
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
     * <code>ERROR = 2;</code>
     */
    ERROR(2),
    /**
     * <code>ERROR_FORT_NOT_FOUND = 3;</code>
     */
    ERROR_FORT_NOT_FOUND(3),
    /**
     * <code>ERROR_INCIDENT_NOT_FOUND = 4;</code>
     */
    ERROR_INCIDENT_NOT_FOUND(4),
    /**
     * <code>ERROR_STEP_ALREADY_COMPLETED = 5;</code>
     */
    ERROR_STEP_ALREADY_COMPLETED(5),
    /**
     * <code>ERROR_WRONG_STEP = 6;</code>
     */
    ERROR_WRONG_STEP(6),
    /**
     * <code>ERROR_PLAYER_BELOW_MIN_LEVEL = 7;</code>
     */
    ERROR_PLAYER_BELOW_MIN_LEVEL(7),
    /**
     * <code>ERROR_INCIDENT_EXPIRED = 8;</code>
     */
    ERROR_INCIDENT_EXPIRED(8),
    /**
     * <code>ERROR_MISSING_INCIDENT_TICKET = 9;</code>
     */
    ERROR_MISSING_INCIDENT_TICKET(9),
    /**
     * <code>ERROR_ENCOUNTER_POKEMON_INVENTORY_FULL = 10;</code>
     */
    ERROR_ENCOUNTER_POKEMON_INVENTORY_FULL(10),
    /**
     * <code>ERROR_PLAYER_BELOW_V2_MIN_LEVEL = 11;</code>
     */
    ERROR_PLAYER_BELOW_V2_MIN_LEVEL(11),
    /**
     * <code>ERROR_INVALID_HEALTH_UPDATES = 20;</code>
     */
    ERROR_INVALID_HEALTH_UPDATES(20),
    /**
     * <code>ERROR_ATTACKING_POKEMON_INVALID = 30;</code>
     */
    ERROR_ATTACKING_POKEMON_INVALID(30),
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
     * <code>ERROR = 2;</code>
     */
    public static final int ERROR_VALUE = 2;
    /**
     * <code>ERROR_FORT_NOT_FOUND = 3;</code>
     */
    public static final int ERROR_FORT_NOT_FOUND_VALUE = 3;
    /**
     * <code>ERROR_INCIDENT_NOT_FOUND = 4;</code>
     */
    public static final int ERROR_INCIDENT_NOT_FOUND_VALUE = 4;
    /**
     * <code>ERROR_STEP_ALREADY_COMPLETED = 5;</code>
     */
    public static final int ERROR_STEP_ALREADY_COMPLETED_VALUE = 5;
    /**
     * <code>ERROR_WRONG_STEP = 6;</code>
     */
    public static final int ERROR_WRONG_STEP_VALUE = 6;
    /**
     * <code>ERROR_PLAYER_BELOW_MIN_LEVEL = 7;</code>
     */
    public static final int ERROR_PLAYER_BELOW_MIN_LEVEL_VALUE = 7;
    /**
     * <code>ERROR_INCIDENT_EXPIRED = 8;</code>
     */
    public static final int ERROR_INCIDENT_EXPIRED_VALUE = 8;
    /**
     * <code>ERROR_MISSING_INCIDENT_TICKET = 9;</code>
     */
    public static final int ERROR_MISSING_INCIDENT_TICKET_VALUE = 9;
    /**
     * <code>ERROR_ENCOUNTER_POKEMON_INVENTORY_FULL = 10;</code>
     */
    public static final int ERROR_ENCOUNTER_POKEMON_INVENTORY_FULL_VALUE = 10;
    /**
     * <code>ERROR_PLAYER_BELOW_V2_MIN_LEVEL = 11;</code>
     */
    public static final int ERROR_PLAYER_BELOW_V2_MIN_LEVEL_VALUE = 11;
    /**
     * <code>ERROR_INVALID_HEALTH_UPDATES = 20;</code>
     */
    public static final int ERROR_INVALID_HEALTH_UPDATES_VALUE = 20;
    /**
     * <code>ERROR_ATTACKING_POKEMON_INVALID = 30;</code>
     */
    public static final int ERROR_ATTACKING_POKEMON_INVALID_VALUE = 30;


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
        case 2: return ERROR;
        case 3: return ERROR_FORT_NOT_FOUND;
        case 4: return ERROR_INCIDENT_NOT_FOUND;
        case 5: return ERROR_STEP_ALREADY_COMPLETED;
        case 6: return ERROR_WRONG_STEP;
        case 7: return ERROR_PLAYER_BELOW_MIN_LEVEL;
        case 8: return ERROR_INCIDENT_EXPIRED;
        case 9: return ERROR_MISSING_INCIDENT_TICKET;
        case 10: return ERROR_ENCOUNTER_POKEMON_INVENTORY_FULL;
        case 11: return ERROR_PLAYER_BELOW_V2_MIN_LEVEL;
        case 20: return ERROR_INVALID_HEALTH_UPDATES;
        case 30: return ERROR_ATTACKING_POKEMON_INVALID;
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
      return POGOProtos.Rpc.InvasionStatus.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.InvasionStatus.Status)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof POGOProtos.Rpc.InvasionStatus)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.InvasionStatus other = (POGOProtos.Rpc.InvasionStatus) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.InvasionStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InvasionStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InvasionStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InvasionStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InvasionStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InvasionStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InvasionStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InvasionStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.InvasionStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InvasionStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.InvasionStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InvasionStatus parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.InvasionStatus prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.InvasionStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.InvasionStatus)
      POGOProtos.Rpc.InvasionStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InvasionStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InvasionStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.InvasionStatus.class, POGOProtos.Rpc.InvasionStatus.Builder.class);
    }

    // Construct using POGOProtos.Rpc.InvasionStatus.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InvasionStatus_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.InvasionStatus getDefaultInstanceForType() {
      return POGOProtos.Rpc.InvasionStatus.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.InvasionStatus build() {
      POGOProtos.Rpc.InvasionStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.InvasionStatus buildPartial() {
      POGOProtos.Rpc.InvasionStatus result = new POGOProtos.Rpc.InvasionStatus(this);
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
      if (other instanceof POGOProtos.Rpc.InvasionStatus) {
        return mergeFrom((POGOProtos.Rpc.InvasionStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.InvasionStatus other) {
      if (other == POGOProtos.Rpc.InvasionStatus.getDefaultInstance()) return this;
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
      POGOProtos.Rpc.InvasionStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.InvasionStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.InvasionStatus)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.InvasionStatus)
  private static final POGOProtos.Rpc.InvasionStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.InvasionStatus();
  }

  public static POGOProtos.Rpc.InvasionStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InvasionStatus>
      PARSER = new com.google.protobuf.AbstractParser<InvasionStatus>() {
    @java.lang.Override
    public InvasionStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InvasionStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InvasionStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InvasionStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.InvasionStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

