// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/EncounterTutorialCompleteResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse}
 */
public  final class EncounterTutorialCompleteResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse)
    EncounterTutorialCompleteResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncounterTutorialCompleteResponse.newBuilder() to construct.
  private EncounterTutorialCompleteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncounterTutorialCompleteResponse() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncounterTutorialCompleteResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EncounterTutorialCompleteResponse(
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
            int rawValue = input.readEnum();

            result_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Data.PokemonData.Builder subBuilder = null;
            if (pokemonData_ != null) {
              subBuilder = pokemonData_.toBuilder();
            }
            pokemonData_ = input.readMessage(POGOProtos.Data.PokemonData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pokemonData_);
              pokemonData_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            POGOProtos.Data.Capture.CaptureAward.Builder subBuilder = null;
            if (captureAward_ != null) {
              subBuilder = captureAward_.toBuilder();
            }
            captureAward_ = input.readMessage(POGOProtos.Data.Capture.CaptureAward.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(captureAward_);
              captureAward_ = subBuilder.buildPartial();
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
    return POGOProtos.Networking.Responses.EncounterTutorialCompleteResponseOuterClass.internal_static_POGOProtos_Networking_Responses_EncounterTutorialCompleteResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.EncounterTutorialCompleteResponseOuterClass.internal_static_POGOProtos_Networking_Responses_EncounterTutorialCompleteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.class, POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result}
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
     * <code>ERROR_INVALID_POKEMON = 2;</code>
     */
    ERROR_INVALID_POKEMON(2),
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
     * <code>ERROR_INVALID_POKEMON = 2;</code>
     */
    public static final int ERROR_INVALID_POKEMON_VALUE = 2;


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
        case 2: return ERROR_INVALID_POKEMON;
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
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result result = 1;</code>
   * @return The result.
   */
  public POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result result = POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result.valueOf(result_);
    return result == null ? POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result.UNRECOGNIZED : result;
  }

  public static final int POKEMON_DATA_FIELD_NUMBER = 2;
  private POGOProtos.Data.PokemonData pokemonData_;
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
   * @return Whether the pokemonData field is set.
   */
  public boolean hasPokemonData() {
    return pokemonData_ != null;
  }
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
   * @return The pokemonData.
   */
  public POGOProtos.Data.PokemonData getPokemonData() {
    return pokemonData_ == null ? POGOProtos.Data.PokemonData.getDefaultInstance() : pokemonData_;
  }
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
   */
  public POGOProtos.Data.PokemonDataOrBuilder getPokemonDataOrBuilder() {
    return getPokemonData();
  }

  public static final int CAPTURE_AWARD_FIELD_NUMBER = 3;
  private POGOProtos.Data.Capture.CaptureAward captureAward_;
  /**
   * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
   * @return Whether the captureAward field is set.
   */
  public boolean hasCaptureAward() {
    return captureAward_ != null;
  }
  /**
   * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
   * @return The captureAward.
   */
  public POGOProtos.Data.Capture.CaptureAward getCaptureAward() {
    return captureAward_ == null ? POGOProtos.Data.Capture.CaptureAward.getDefaultInstance() : captureAward_;
  }
  /**
   * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
   */
  public POGOProtos.Data.Capture.CaptureAwardOrBuilder getCaptureAwardOrBuilder() {
    return getCaptureAward();
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
    if (result_ != POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (pokemonData_ != null) {
      output.writeMessage(2, getPokemonData());
    }
    if (captureAward_ != null) {
      output.writeMessage(3, getCaptureAward());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (pokemonData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPokemonData());
    }
    if (captureAward_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCaptureAward());
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
    if (!(obj instanceof POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse other = (POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse) obj;

    if (result_ != other.result_) return false;
    if (hasPokemonData() != other.hasPokemonData()) return false;
    if (hasPokemonData()) {
      if (!getPokemonData()
          .equals(other.getPokemonData())) return false;
    }
    if (hasCaptureAward() != other.hasCaptureAward()) return false;
    if (hasCaptureAward()) {
      if (!getCaptureAward()
          .equals(other.getCaptureAward())) return false;
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    if (hasPokemonData()) {
      hash = (37 * hash) + POKEMON_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getPokemonData().hashCode();
    }
    if (hasCaptureAward()) {
      hash = (37 * hash) + CAPTURE_AWARD_FIELD_NUMBER;
      hash = (53 * hash) + getCaptureAward().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse)
      POGOProtos.Networking.Responses.EncounterTutorialCompleteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.EncounterTutorialCompleteResponseOuterClass.internal_static_POGOProtos_Networking_Responses_EncounterTutorialCompleteResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.EncounterTutorialCompleteResponseOuterClass.internal_static_POGOProtos_Networking_Responses_EncounterTutorialCompleteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.class, POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.newBuilder()
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
      result_ = 0;

      if (pokemonDataBuilder_ == null) {
        pokemonData_ = null;
      } else {
        pokemonData_ = null;
        pokemonDataBuilder_ = null;
      }
      if (captureAwardBuilder_ == null) {
        captureAward_ = null;
      } else {
        captureAward_ = null;
        captureAwardBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.EncounterTutorialCompleteResponseOuterClass.internal_static_POGOProtos_Networking_Responses_EncounterTutorialCompleteResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse build() {
      POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse buildPartial() {
      POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse result = new POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse(this);
      result.result_ = result_;
      if (pokemonDataBuilder_ == null) {
        result.pokemonData_ = pokemonData_;
      } else {
        result.pokemonData_ = pokemonDataBuilder_.build();
      }
      if (captureAwardBuilder_ == null) {
        result.captureAward_ = captureAward_;
      } else {
        result.captureAward_ = captureAwardBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse other) {
      if (other == POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasPokemonData()) {
        mergePokemonData(other.getPokemonData());
      }
      if (other.hasCaptureAward()) {
        mergeCaptureAward(other.getCaptureAward());
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
      POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int result_ = 0;
    /**
     * <code>.POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result result = 1;</code>
     * @return The result.
     */
    public POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result result = POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result.valueOf(result_);
      return result == null ? POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Data.PokemonData pokemonData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.PokemonData, POGOProtos.Data.PokemonData.Builder, POGOProtos.Data.PokemonDataOrBuilder> pokemonDataBuilder_;
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
     * @return Whether the pokemonData field is set.
     */
    public boolean hasPokemonData() {
      return pokemonDataBuilder_ != null || pokemonData_ != null;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
     * @return The pokemonData.
     */
    public POGOProtos.Data.PokemonData getPokemonData() {
      if (pokemonDataBuilder_ == null) {
        return pokemonData_ == null ? POGOProtos.Data.PokemonData.getDefaultInstance() : pokemonData_;
      } else {
        return pokemonDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
     */
    public Builder setPokemonData(POGOProtos.Data.PokemonData value) {
      if (pokemonDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pokemonData_ = value;
        onChanged();
      } else {
        pokemonDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
     */
    public Builder setPokemonData(
        POGOProtos.Data.PokemonData.Builder builderForValue) {
      if (pokemonDataBuilder_ == null) {
        pokemonData_ = builderForValue.build();
        onChanged();
      } else {
        pokemonDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
     */
    public Builder mergePokemonData(POGOProtos.Data.PokemonData value) {
      if (pokemonDataBuilder_ == null) {
        if (pokemonData_ != null) {
          pokemonData_ =
            POGOProtos.Data.PokemonData.newBuilder(pokemonData_).mergeFrom(value).buildPartial();
        } else {
          pokemonData_ = value;
        }
        onChanged();
      } else {
        pokemonDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
     */
    public Builder clearPokemonData() {
      if (pokemonDataBuilder_ == null) {
        pokemonData_ = null;
        onChanged();
      } else {
        pokemonData_ = null;
        pokemonDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
     */
    public POGOProtos.Data.PokemonData.Builder getPokemonDataBuilder() {
      
      onChanged();
      return getPokemonDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
     */
    public POGOProtos.Data.PokemonDataOrBuilder getPokemonDataOrBuilder() {
      if (pokemonDataBuilder_ != null) {
        return pokemonDataBuilder_.getMessageOrBuilder();
      } else {
        return pokemonData_ == null ?
            POGOProtos.Data.PokemonData.getDefaultInstance() : pokemonData_;
      }
    }
    /**
     * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.PokemonData, POGOProtos.Data.PokemonData.Builder, POGOProtos.Data.PokemonDataOrBuilder> 
        getPokemonDataFieldBuilder() {
      if (pokemonDataBuilder_ == null) {
        pokemonDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.PokemonData, POGOProtos.Data.PokemonData.Builder, POGOProtos.Data.PokemonDataOrBuilder>(
                getPokemonData(),
                getParentForChildren(),
                isClean());
        pokemonData_ = null;
      }
      return pokemonDataBuilder_;
    }

    private POGOProtos.Data.Capture.CaptureAward captureAward_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Capture.CaptureAward, POGOProtos.Data.Capture.CaptureAward.Builder, POGOProtos.Data.Capture.CaptureAwardOrBuilder> captureAwardBuilder_;
    /**
     * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
     * @return Whether the captureAward field is set.
     */
    public boolean hasCaptureAward() {
      return captureAwardBuilder_ != null || captureAward_ != null;
    }
    /**
     * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
     * @return The captureAward.
     */
    public POGOProtos.Data.Capture.CaptureAward getCaptureAward() {
      if (captureAwardBuilder_ == null) {
        return captureAward_ == null ? POGOProtos.Data.Capture.CaptureAward.getDefaultInstance() : captureAward_;
      } else {
        return captureAwardBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
     */
    public Builder setCaptureAward(POGOProtos.Data.Capture.CaptureAward value) {
      if (captureAwardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        captureAward_ = value;
        onChanged();
      } else {
        captureAwardBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
     */
    public Builder setCaptureAward(
        POGOProtos.Data.Capture.CaptureAward.Builder builderForValue) {
      if (captureAwardBuilder_ == null) {
        captureAward_ = builderForValue.build();
        onChanged();
      } else {
        captureAwardBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
     */
    public Builder mergeCaptureAward(POGOProtos.Data.Capture.CaptureAward value) {
      if (captureAwardBuilder_ == null) {
        if (captureAward_ != null) {
          captureAward_ =
            POGOProtos.Data.Capture.CaptureAward.newBuilder(captureAward_).mergeFrom(value).buildPartial();
        } else {
          captureAward_ = value;
        }
        onChanged();
      } else {
        captureAwardBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
     */
    public Builder clearCaptureAward() {
      if (captureAwardBuilder_ == null) {
        captureAward_ = null;
        onChanged();
      } else {
        captureAward_ = null;
        captureAwardBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
     */
    public POGOProtos.Data.Capture.CaptureAward.Builder getCaptureAwardBuilder() {
      
      onChanged();
      return getCaptureAwardFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
     */
    public POGOProtos.Data.Capture.CaptureAwardOrBuilder getCaptureAwardOrBuilder() {
      if (captureAwardBuilder_ != null) {
        return captureAwardBuilder_.getMessageOrBuilder();
      } else {
        return captureAward_ == null ?
            POGOProtos.Data.Capture.CaptureAward.getDefaultInstance() : captureAward_;
      }
    }
    /**
     * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Capture.CaptureAward, POGOProtos.Data.Capture.CaptureAward.Builder, POGOProtos.Data.Capture.CaptureAwardOrBuilder> 
        getCaptureAwardFieldBuilder() {
      if (captureAwardBuilder_ == null) {
        captureAwardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.Capture.CaptureAward, POGOProtos.Data.Capture.CaptureAward.Builder, POGOProtos.Data.Capture.CaptureAwardOrBuilder>(
                getCaptureAward(),
                getParentForChildren(),
                isClean());
        captureAward_ = null;
      }
      return captureAwardBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse)
  private static final POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse();
  }

  public static POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncounterTutorialCompleteResponse>
      PARSER = new com.google.protobuf.AbstractParser<EncounterTutorialCompleteResponse>() {
    @java.lang.Override
    public EncounterTutorialCompleteResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EncounterTutorialCompleteResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EncounterTutorialCompleteResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncounterTutorialCompleteResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
