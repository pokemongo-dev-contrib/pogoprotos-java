// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CatchPokemonTelemetry}
 */
public final class CatchPokemonTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CatchPokemonTelemetry)
    CatchPokemonTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CatchPokemonTelemetry.newBuilder() to construct.
  private CatchPokemonTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CatchPokemonTelemetry() {
    status_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CatchPokemonTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CatchPokemonTelemetry(
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

            status_ = s;
            break;
          }
          case 18: {
            POGOProtos.Rpc.EncounterPokemonTelemetry.Builder subBuilder = null;
            if (encounterPokemonTelemetry_ != null) {
              subBuilder = encounterPokemonTelemetry_.toBuilder();
            }
            encounterPokemonTelemetry_ = input.readMessage(POGOProtos.Rpc.EncounterPokemonTelemetry.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(encounterPokemonTelemetry_);
              encounterPokemonTelemetry_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            balltype_ = input.readInt32();
            break;
          }
          case 32: {

            hitGrade_ = input.readInt32();
            break;
          }
          case 40: {

            curveBall_ = input.readBool();
            break;
          }
          case 49: {

            missPercent_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CatchPokemonTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CatchPokemonTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CatchPokemonTelemetry.class, POGOProtos.Rpc.CatchPokemonTelemetry.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private volatile java.lang.Object status_;
  /**
   * <code>string status = 1;</code>
   * @return The status.
   */
  @java.lang.Override
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <code>string status = 1;</code>
   * @return The bytes for status.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENCOUNTER_POKEMON_TELEMETRY_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.EncounterPokemonTelemetry encounterPokemonTelemetry_;
  /**
   * <code>.POGOProtos.Rpc.EncounterPokemonTelemetry encounter_pokemon_telemetry = 2;</code>
   * @return Whether the encounterPokemonTelemetry field is set.
   */
  @java.lang.Override
  public boolean hasEncounterPokemonTelemetry() {
    return encounterPokemonTelemetry_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.EncounterPokemonTelemetry encounter_pokemon_telemetry = 2;</code>
   * @return The encounterPokemonTelemetry.
   */
  @java.lang.Override
  public POGOProtos.Rpc.EncounterPokemonTelemetry getEncounterPokemonTelemetry() {
    return encounterPokemonTelemetry_ == null ? POGOProtos.Rpc.EncounterPokemonTelemetry.getDefaultInstance() : encounterPokemonTelemetry_;
  }
  /**
   * <code>.POGOProtos.Rpc.EncounterPokemonTelemetry encounter_pokemon_telemetry = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.EncounterPokemonTelemetryOrBuilder getEncounterPokemonTelemetryOrBuilder() {
    return getEncounterPokemonTelemetry();
  }

  public static final int BALLTYPE_FIELD_NUMBER = 3;
  private int balltype_;
  /**
   * <code>int32 balltype = 3;</code>
   * @return The balltype.
   */
  @java.lang.Override
  public int getBalltype() {
    return balltype_;
  }

  public static final int HIT_GRADE_FIELD_NUMBER = 4;
  private int hitGrade_;
  /**
   * <code>int32 hit_grade = 4;</code>
   * @return The hitGrade.
   */
  @java.lang.Override
  public int getHitGrade() {
    return hitGrade_;
  }

  public static final int CURVE_BALL_FIELD_NUMBER = 5;
  private boolean curveBall_;
  /**
   * <code>bool curve_ball = 5;</code>
   * @return The curveBall.
   */
  @java.lang.Override
  public boolean getCurveBall() {
    return curveBall_;
  }

  public static final int MISS_PERCENT_FIELD_NUMBER = 6;
  private double missPercent_;
  /**
   * <code>double miss_percent = 6;</code>
   * @return The missPercent.
   */
  @java.lang.Override
  public double getMissPercent() {
    return missPercent_;
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
    if (!getStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, status_);
    }
    if (encounterPokemonTelemetry_ != null) {
      output.writeMessage(2, getEncounterPokemonTelemetry());
    }
    if (balltype_ != 0) {
      output.writeInt32(3, balltype_);
    }
    if (hitGrade_ != 0) {
      output.writeInt32(4, hitGrade_);
    }
    if (curveBall_ != false) {
      output.writeBool(5, curveBall_);
    }
    if (missPercent_ != 0D) {
      output.writeDouble(6, missPercent_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, status_);
    }
    if (encounterPokemonTelemetry_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEncounterPokemonTelemetry());
    }
    if (balltype_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, balltype_);
    }
    if (hitGrade_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, hitGrade_);
    }
    if (curveBall_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, curveBall_);
    }
    if (missPercent_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, missPercent_);
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
    if (!(obj instanceof POGOProtos.Rpc.CatchPokemonTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CatchPokemonTelemetry other = (POGOProtos.Rpc.CatchPokemonTelemetry) obj;

    if (!getStatus()
        .equals(other.getStatus())) return false;
    if (hasEncounterPokemonTelemetry() != other.hasEncounterPokemonTelemetry()) return false;
    if (hasEncounterPokemonTelemetry()) {
      if (!getEncounterPokemonTelemetry()
          .equals(other.getEncounterPokemonTelemetry())) return false;
    }
    if (getBalltype()
        != other.getBalltype()) return false;
    if (getHitGrade()
        != other.getHitGrade()) return false;
    if (getCurveBall()
        != other.getCurveBall()) return false;
    if (java.lang.Double.doubleToLongBits(getMissPercent())
        != java.lang.Double.doubleToLongBits(
            other.getMissPercent())) return false;
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
    hash = (53 * hash) + getStatus().hashCode();
    if (hasEncounterPokemonTelemetry()) {
      hash = (37 * hash) + ENCOUNTER_POKEMON_TELEMETRY_FIELD_NUMBER;
      hash = (53 * hash) + getEncounterPokemonTelemetry().hashCode();
    }
    hash = (37 * hash) + BALLTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getBalltype();
    hash = (37 * hash) + HIT_GRADE_FIELD_NUMBER;
    hash = (53 * hash) + getHitGrade();
    hash = (37 * hash) + CURVE_BALL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCurveBall());
    hash = (37 * hash) + MISS_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMissPercent()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CatchPokemonTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CatchPokemonTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CatchPokemonTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CatchPokemonTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CatchPokemonTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CatchPokemonTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CatchPokemonTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CatchPokemonTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CatchPokemonTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CatchPokemonTelemetry)
      POGOProtos.Rpc.CatchPokemonTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CatchPokemonTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CatchPokemonTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CatchPokemonTelemetry.class, POGOProtos.Rpc.CatchPokemonTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CatchPokemonTelemetry.newBuilder()
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
      status_ = "";

      if (encounterPokemonTelemetryBuilder_ == null) {
        encounterPokemonTelemetry_ = null;
      } else {
        encounterPokemonTelemetry_ = null;
        encounterPokemonTelemetryBuilder_ = null;
      }
      balltype_ = 0;

      hitGrade_ = 0;

      curveBall_ = false;

      missPercent_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CatchPokemonTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CatchPokemonTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.CatchPokemonTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CatchPokemonTelemetry build() {
      POGOProtos.Rpc.CatchPokemonTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CatchPokemonTelemetry buildPartial() {
      POGOProtos.Rpc.CatchPokemonTelemetry result = new POGOProtos.Rpc.CatchPokemonTelemetry(this);
      result.status_ = status_;
      if (encounterPokemonTelemetryBuilder_ == null) {
        result.encounterPokemonTelemetry_ = encounterPokemonTelemetry_;
      } else {
        result.encounterPokemonTelemetry_ = encounterPokemonTelemetryBuilder_.build();
      }
      result.balltype_ = balltype_;
      result.hitGrade_ = hitGrade_;
      result.curveBall_ = curveBall_;
      result.missPercent_ = missPercent_;
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
      if (other instanceof POGOProtos.Rpc.CatchPokemonTelemetry) {
        return mergeFrom((POGOProtos.Rpc.CatchPokemonTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CatchPokemonTelemetry other) {
      if (other == POGOProtos.Rpc.CatchPokemonTelemetry.getDefaultInstance()) return this;
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (other.hasEncounterPokemonTelemetry()) {
        mergeEncounterPokemonTelemetry(other.getEncounterPokemonTelemetry());
      }
      if (other.getBalltype() != 0) {
        setBalltype(other.getBalltype());
      }
      if (other.getHitGrade() != 0) {
        setHitGrade(other.getHitGrade());
      }
      if (other.getCurveBall() != false) {
        setCurveBall(other.getCurveBall());
      }
      if (other.getMissPercent() != 0D) {
        setMissPercent(other.getMissPercent());
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
      POGOProtos.Rpc.CatchPokemonTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CatchPokemonTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <code>string status = 1;</code>
     * @return The status.
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string status = 1;</code>
     * @return The bytes for status.
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string status = 1;</code>
     * @param value The bytes for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.EncounterPokemonTelemetry encounterPokemonTelemetry_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.EncounterPokemonTelemetry, POGOProtos.Rpc.EncounterPokemonTelemetry.Builder, POGOProtos.Rpc.EncounterPokemonTelemetryOrBuilder> encounterPokemonTelemetryBuilder_;
    /**
     * <code>.POGOProtos.Rpc.EncounterPokemonTelemetry encounter_pokemon_telemetry = 2;</code>
     * @return Whether the encounterPokemonTelemetry field is set.
     */
    public boolean hasEncounterPokemonTelemetry() {
      return encounterPokemonTelemetryBuilder_ != null || encounterPokemonTelemetry_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterPokemonTelemetry encounter_pokemon_telemetry = 2;</code>
     * @return The encounterPokemonTelemetry.
     */
    public POGOProtos.Rpc.EncounterPokemonTelemetry getEncounterPokemonTelemetry() {
      if (encounterPokemonTelemetryBuilder_ == null) {
        return encounterPokemonTelemetry_ == null ? POGOProtos.Rpc.EncounterPokemonTelemetry.getDefaultInstance() : encounterPokemonTelemetry_;
      } else {
        return encounterPokemonTelemetryBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterPokemonTelemetry encounter_pokemon_telemetry = 2;</code>
     */
    public Builder setEncounterPokemonTelemetry(POGOProtos.Rpc.EncounterPokemonTelemetry value) {
      if (encounterPokemonTelemetryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        encounterPokemonTelemetry_ = value;
        onChanged();
      } else {
        encounterPokemonTelemetryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterPokemonTelemetry encounter_pokemon_telemetry = 2;</code>
     */
    public Builder setEncounterPokemonTelemetry(
        POGOProtos.Rpc.EncounterPokemonTelemetry.Builder builderForValue) {
      if (encounterPokemonTelemetryBuilder_ == null) {
        encounterPokemonTelemetry_ = builderForValue.build();
        onChanged();
      } else {
        encounterPokemonTelemetryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterPokemonTelemetry encounter_pokemon_telemetry = 2;</code>
     */
    public Builder mergeEncounterPokemonTelemetry(POGOProtos.Rpc.EncounterPokemonTelemetry value) {
      if (encounterPokemonTelemetryBuilder_ == null) {
        if (encounterPokemonTelemetry_ != null) {
          encounterPokemonTelemetry_ =
            POGOProtos.Rpc.EncounterPokemonTelemetry.newBuilder(encounterPokemonTelemetry_).mergeFrom(value).buildPartial();
        } else {
          encounterPokemonTelemetry_ = value;
        }
        onChanged();
      } else {
        encounterPokemonTelemetryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterPokemonTelemetry encounter_pokemon_telemetry = 2;</code>
     */
    public Builder clearEncounterPokemonTelemetry() {
      if (encounterPokemonTelemetryBuilder_ == null) {
        encounterPokemonTelemetry_ = null;
        onChanged();
      } else {
        encounterPokemonTelemetry_ = null;
        encounterPokemonTelemetryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterPokemonTelemetry encounter_pokemon_telemetry = 2;</code>
     */
    public POGOProtos.Rpc.EncounterPokemonTelemetry.Builder getEncounterPokemonTelemetryBuilder() {
      
      onChanged();
      return getEncounterPokemonTelemetryFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterPokemonTelemetry encounter_pokemon_telemetry = 2;</code>
     */
    public POGOProtos.Rpc.EncounterPokemonTelemetryOrBuilder getEncounterPokemonTelemetryOrBuilder() {
      if (encounterPokemonTelemetryBuilder_ != null) {
        return encounterPokemonTelemetryBuilder_.getMessageOrBuilder();
      } else {
        return encounterPokemonTelemetry_ == null ?
            POGOProtos.Rpc.EncounterPokemonTelemetry.getDefaultInstance() : encounterPokemonTelemetry_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterPokemonTelemetry encounter_pokemon_telemetry = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.EncounterPokemonTelemetry, POGOProtos.Rpc.EncounterPokemonTelemetry.Builder, POGOProtos.Rpc.EncounterPokemonTelemetryOrBuilder> 
        getEncounterPokemonTelemetryFieldBuilder() {
      if (encounterPokemonTelemetryBuilder_ == null) {
        encounterPokemonTelemetryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.EncounterPokemonTelemetry, POGOProtos.Rpc.EncounterPokemonTelemetry.Builder, POGOProtos.Rpc.EncounterPokemonTelemetryOrBuilder>(
                getEncounterPokemonTelemetry(),
                getParentForChildren(),
                isClean());
        encounterPokemonTelemetry_ = null;
      }
      return encounterPokemonTelemetryBuilder_;
    }

    private int balltype_ ;
    /**
     * <code>int32 balltype = 3;</code>
     * @return The balltype.
     */
    @java.lang.Override
    public int getBalltype() {
      return balltype_;
    }
    /**
     * <code>int32 balltype = 3;</code>
     * @param value The balltype to set.
     * @return This builder for chaining.
     */
    public Builder setBalltype(int value) {
      
      balltype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 balltype = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBalltype() {
      
      balltype_ = 0;
      onChanged();
      return this;
    }

    private int hitGrade_ ;
    /**
     * <code>int32 hit_grade = 4;</code>
     * @return The hitGrade.
     */
    @java.lang.Override
    public int getHitGrade() {
      return hitGrade_;
    }
    /**
     * <code>int32 hit_grade = 4;</code>
     * @param value The hitGrade to set.
     * @return This builder for chaining.
     */
    public Builder setHitGrade(int value) {
      
      hitGrade_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hit_grade = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHitGrade() {
      
      hitGrade_ = 0;
      onChanged();
      return this;
    }

    private boolean curveBall_ ;
    /**
     * <code>bool curve_ball = 5;</code>
     * @return The curveBall.
     */
    @java.lang.Override
    public boolean getCurveBall() {
      return curveBall_;
    }
    /**
     * <code>bool curve_ball = 5;</code>
     * @param value The curveBall to set.
     * @return This builder for chaining.
     */
    public Builder setCurveBall(boolean value) {
      
      curveBall_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool curve_ball = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurveBall() {
      
      curveBall_ = false;
      onChanged();
      return this;
    }

    private double missPercent_ ;
    /**
     * <code>double miss_percent = 6;</code>
     * @return The missPercent.
     */
    @java.lang.Override
    public double getMissPercent() {
      return missPercent_;
    }
    /**
     * <code>double miss_percent = 6;</code>
     * @param value The missPercent to set.
     * @return This builder for chaining.
     */
    public Builder setMissPercent(double value) {
      
      missPercent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double miss_percent = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMissPercent() {
      
      missPercent_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CatchPokemonTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CatchPokemonTelemetry)
  private static final POGOProtos.Rpc.CatchPokemonTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CatchPokemonTelemetry();
  }

  public static POGOProtos.Rpc.CatchPokemonTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CatchPokemonTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<CatchPokemonTelemetry>() {
    @java.lang.Override
    public CatchPokemonTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CatchPokemonTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CatchPokemonTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CatchPokemonTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CatchPokemonTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

