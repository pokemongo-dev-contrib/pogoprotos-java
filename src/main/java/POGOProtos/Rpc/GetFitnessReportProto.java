// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetFitnessReportProto}
 */
public final class GetFitnessReportProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetFitnessReportProto)
    GetFitnessReportProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetFitnessReportProto.newBuilder() to construct.
  private GetFitnessReportProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetFitnessReportProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetFitnessReportProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetFitnessReportProto(
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

            numOfDays_ = input.readInt32();
            break;
          }
          case 16: {

            numOfWeeks_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetFitnessReportProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetFitnessReportProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetFitnessReportProto.class, POGOProtos.Rpc.GetFitnessReportProto.Builder.class);
  }

  public static final int NUM_OF_DAYS_FIELD_NUMBER = 1;
  private int numOfDays_;
  /**
   * <code>int32 num_of_days = 1;</code>
   * @return The numOfDays.
   */
  @java.lang.Override
  public int getNumOfDays() {
    return numOfDays_;
  }

  public static final int NUM_OF_WEEKS_FIELD_NUMBER = 2;
  private int numOfWeeks_;
  /**
   * <code>int32 num_of_weeks = 2;</code>
   * @return The numOfWeeks.
   */
  @java.lang.Override
  public int getNumOfWeeks() {
    return numOfWeeks_;
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
    if (numOfDays_ != 0) {
      output.writeInt32(1, numOfDays_);
    }
    if (numOfWeeks_ != 0) {
      output.writeInt32(2, numOfWeeks_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numOfDays_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, numOfDays_);
    }
    if (numOfWeeks_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, numOfWeeks_);
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
    if (!(obj instanceof POGOProtos.Rpc.GetFitnessReportProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetFitnessReportProto other = (POGOProtos.Rpc.GetFitnessReportProto) obj;

    if (getNumOfDays()
        != other.getNumOfDays()) return false;
    if (getNumOfWeeks()
        != other.getNumOfWeeks()) return false;
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
    hash = (37 * hash) + NUM_OF_DAYS_FIELD_NUMBER;
    hash = (53 * hash) + getNumOfDays();
    hash = (37 * hash) + NUM_OF_WEEKS_FIELD_NUMBER;
    hash = (53 * hash) + getNumOfWeeks();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetFitnessReportProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetFitnessReportProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetFitnessReportProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetFitnessReportProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetFitnessReportProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetFitnessReportProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetFitnessReportProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetFitnessReportProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetFitnessReportProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetFitnessReportProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetFitnessReportProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetFitnessReportProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetFitnessReportProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetFitnessReportProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetFitnessReportProto)
      POGOProtos.Rpc.GetFitnessReportProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetFitnessReportProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetFitnessReportProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetFitnessReportProto.class, POGOProtos.Rpc.GetFitnessReportProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetFitnessReportProto.newBuilder()
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
      numOfDays_ = 0;

      numOfWeeks_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetFitnessReportProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetFitnessReportProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetFitnessReportProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetFitnessReportProto build() {
      POGOProtos.Rpc.GetFitnessReportProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetFitnessReportProto buildPartial() {
      POGOProtos.Rpc.GetFitnessReportProto result = new POGOProtos.Rpc.GetFitnessReportProto(this);
      result.numOfDays_ = numOfDays_;
      result.numOfWeeks_ = numOfWeeks_;
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
      if (other instanceof POGOProtos.Rpc.GetFitnessReportProto) {
        return mergeFrom((POGOProtos.Rpc.GetFitnessReportProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetFitnessReportProto other) {
      if (other == POGOProtos.Rpc.GetFitnessReportProto.getDefaultInstance()) return this;
      if (other.getNumOfDays() != 0) {
        setNumOfDays(other.getNumOfDays());
      }
      if (other.getNumOfWeeks() != 0) {
        setNumOfWeeks(other.getNumOfWeeks());
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
      POGOProtos.Rpc.GetFitnessReportProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetFitnessReportProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int numOfDays_ ;
    /**
     * <code>int32 num_of_days = 1;</code>
     * @return The numOfDays.
     */
    @java.lang.Override
    public int getNumOfDays() {
      return numOfDays_;
    }
    /**
     * <code>int32 num_of_days = 1;</code>
     * @param value The numOfDays to set.
     * @return This builder for chaining.
     */
    public Builder setNumOfDays(int value) {
      
      numOfDays_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num_of_days = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumOfDays() {
      
      numOfDays_ = 0;
      onChanged();
      return this;
    }

    private int numOfWeeks_ ;
    /**
     * <code>int32 num_of_weeks = 2;</code>
     * @return The numOfWeeks.
     */
    @java.lang.Override
    public int getNumOfWeeks() {
      return numOfWeeks_;
    }
    /**
     * <code>int32 num_of_weeks = 2;</code>
     * @param value The numOfWeeks to set.
     * @return This builder for chaining.
     */
    public Builder setNumOfWeeks(int value) {
      
      numOfWeeks_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num_of_weeks = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumOfWeeks() {
      
      numOfWeeks_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetFitnessReportProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetFitnessReportProto)
  private static final POGOProtos.Rpc.GetFitnessReportProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetFitnessReportProto();
  }

  public static POGOProtos.Rpc.GetFitnessReportProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetFitnessReportProto>
      PARSER = new com.google.protobuf.AbstractParser<GetFitnessReportProto>() {
    @java.lang.Override
    public GetFitnessReportProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetFitnessReportProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetFitnessReportProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetFitnessReportProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetFitnessReportProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

