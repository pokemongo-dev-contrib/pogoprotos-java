// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ClientDialogueLineProto}
 */
public final class ClientDialogueLineProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ClientDialogueLineProto)
    ClientDialogueLineProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientDialogueLineProto.newBuilder() to construct.
  private ClientDialogueLineProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientDialogueLineProto() {
    text_ = "";
    character_ = 0;
    expression_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientDialogueLineProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientDialogueLineProto(
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

            text_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            character_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            expression_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClientDialogueLineProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClientDialogueLineProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ClientDialogueLineProto.class, POGOProtos.Rpc.ClientDialogueLineProto.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  private volatile java.lang.Object text_;
  /**
   * <code>string text = 1;</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHARACTER_FIELD_NUMBER = 2;
  private int character_;
  /**
   * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 2;</code>
   * @return The enum numeric value on the wire for character.
   */
  @java.lang.Override public int getCharacterValue() {
    return character_;
  }
  /**
   * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 2;</code>
   * @return The character.
   */
  @java.lang.Override public POGOProtos.Rpc.EnumWrapper.InvasionCharacter getCharacter() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EnumWrapper.InvasionCharacter result = POGOProtos.Rpc.EnumWrapper.InvasionCharacter.valueOf(character_);
    return result == null ? POGOProtos.Rpc.EnumWrapper.InvasionCharacter.UNRECOGNIZED : result;
  }

  public static final int EXPRESSION_FIELD_NUMBER = 3;
  private int expression_;
  /**
   * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression expression = 3;</code>
   * @return The enum numeric value on the wire for expression.
   */
  @java.lang.Override public int getExpressionValue() {
    return expression_;
  }
  /**
   * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression expression = 3;</code>
   * @return The expression.
   */
  @java.lang.Override public POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression getExpression() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression result = POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression.valueOf(expression_);
    return result == null ? POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression.UNRECOGNIZED : result;
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
    if (!getTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, text_);
    }
    if (character_ != POGOProtos.Rpc.EnumWrapper.InvasionCharacter.CHARACTER_UNSET.getNumber()) {
      output.writeEnum(2, character_);
    }
    if (expression_ != POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression.EXPRESSION_UNSET.getNumber()) {
      output.writeEnum(3, expression_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, text_);
    }
    if (character_ != POGOProtos.Rpc.EnumWrapper.InvasionCharacter.CHARACTER_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, character_);
    }
    if (expression_ != POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression.EXPRESSION_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, expression_);
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
    if (!(obj instanceof POGOProtos.Rpc.ClientDialogueLineProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ClientDialogueLineProto other = (POGOProtos.Rpc.ClientDialogueLineProto) obj;

    if (!getText()
        .equals(other.getText())) return false;
    if (character_ != other.character_) return false;
    if (expression_ != other.expression_) return false;
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
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (37 * hash) + CHARACTER_FIELD_NUMBER;
    hash = (53 * hash) + character_;
    hash = (37 * hash) + EXPRESSION_FIELD_NUMBER;
    hash = (53 * hash) + expression_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ClientDialogueLineProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientDialogueLineProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientDialogueLineProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientDialogueLineProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientDialogueLineProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientDialogueLineProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientDialogueLineProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientDialogueLineProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientDialogueLineProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientDialogueLineProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientDialogueLineProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientDialogueLineProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ClientDialogueLineProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ClientDialogueLineProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ClientDialogueLineProto)
      POGOProtos.Rpc.ClientDialogueLineProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClientDialogueLineProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClientDialogueLineProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ClientDialogueLineProto.class, POGOProtos.Rpc.ClientDialogueLineProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ClientDialogueLineProto.newBuilder()
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
      text_ = "";

      character_ = 0;

      expression_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_ClientDialogueLineProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientDialogueLineProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.ClientDialogueLineProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientDialogueLineProto build() {
      POGOProtos.Rpc.ClientDialogueLineProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientDialogueLineProto buildPartial() {
      POGOProtos.Rpc.ClientDialogueLineProto result = new POGOProtos.Rpc.ClientDialogueLineProto(this);
      result.text_ = text_;
      result.character_ = character_;
      result.expression_ = expression_;
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
      if (other instanceof POGOProtos.Rpc.ClientDialogueLineProto) {
        return mergeFrom((POGOProtos.Rpc.ClientDialogueLineProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ClientDialogueLineProto other) {
      if (other == POGOProtos.Rpc.ClientDialogueLineProto.getDefaultInstance()) return this;
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        onChanged();
      }
      if (other.character_ != 0) {
        setCharacterValue(other.getCharacterValue());
      }
      if (other.expression_ != 0) {
        setExpressionValue(other.getExpressionValue());
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
      POGOProtos.Rpc.ClientDialogueLineProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ClientDialogueLineProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object text_ = "";
    /**
     * <code>string text = 1;</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string text = 1;</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string text = 1;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      text_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string text = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      
      text_ = getDefaultInstance().getText();
      onChanged();
      return this;
    }
    /**
     * <code>string text = 1;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      text_ = value;
      onChanged();
      return this;
    }

    private int character_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 2;</code>
     * @return The enum numeric value on the wire for character.
     */
    @java.lang.Override public int getCharacterValue() {
      return character_;
    }
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 2;</code>
     * @param value The enum numeric value on the wire for character to set.
     * @return This builder for chaining.
     */
    public Builder setCharacterValue(int value) {
      
      character_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 2;</code>
     * @return The character.
     */
    @java.lang.Override
    public POGOProtos.Rpc.EnumWrapper.InvasionCharacter getCharacter() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EnumWrapper.InvasionCharacter result = POGOProtos.Rpc.EnumWrapper.InvasionCharacter.valueOf(character_);
      return result == null ? POGOProtos.Rpc.EnumWrapper.InvasionCharacter.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 2;</code>
     * @param value The character to set.
     * @return This builder for chaining.
     */
    public Builder setCharacter(POGOProtos.Rpc.EnumWrapper.InvasionCharacter value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      character_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCharacter() {
      
      character_ = 0;
      onChanged();
      return this;
    }

    private int expression_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression expression = 3;</code>
     * @return The enum numeric value on the wire for expression.
     */
    @java.lang.Override public int getExpressionValue() {
      return expression_;
    }
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression expression = 3;</code>
     * @param value The enum numeric value on the wire for expression to set.
     * @return This builder for chaining.
     */
    public Builder setExpressionValue(int value) {
      
      expression_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression expression = 3;</code>
     * @return The expression.
     */
    @java.lang.Override
    public POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression getExpression() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression result = POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression.valueOf(expression_);
      return result == null ? POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression expression = 3;</code>
     * @param value The expression to set.
     * @return This builder for chaining.
     */
    public Builder setExpression(POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      expression_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression expression = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpression() {
      
      expression_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ClientDialogueLineProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ClientDialogueLineProto)
  private static final POGOProtos.Rpc.ClientDialogueLineProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ClientDialogueLineProto();
  }

  public static POGOProtos.Rpc.ClientDialogueLineProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientDialogueLineProto>
      PARSER = new com.google.protobuf.AbstractParser<ClientDialogueLineProto>() {
    @java.lang.Override
    public ClientDialogueLineProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientDialogueLineProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientDialogueLineProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientDialogueLineProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ClientDialogueLineProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

