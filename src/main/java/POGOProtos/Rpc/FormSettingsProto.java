// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.FormSettingsProto}
 */
public final class FormSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FormSettingsProto)
    FormSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FormSettingsProto.newBuilder() to construct.
  private FormSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FormSettingsProto() {
    pokemon_ = 0;
    forms_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FormSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FormSettingsProto(
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

            pokemon_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              forms_ = new java.util.ArrayList<POGOProtos.Rpc.FormProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            forms_.add(
                input.readMessage(POGOProtos.Rpc.FormProto.parser(), extensionRegistry));
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
        forms_ = java.util.Collections.unmodifiableList(forms_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FormSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FormSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FormSettingsProto.class, POGOProtos.Rpc.FormSettingsProto.Builder.class);
  }

  public static final int POKEMON_FIELD_NUMBER = 1;
  private int pokemon_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
   * @return The enum numeric value on the wire for pokemon.
   */
  @java.lang.Override public int getPokemonValue() {
    return pokemon_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
   * @return The pokemon.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonId getPokemon() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemon_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int FORMS_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.FormProto> forms_;
  /**
   * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.FormProto> getFormsList() {
    return forms_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.FormProtoOrBuilder> 
      getFormsOrBuilderList() {
    return forms_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
   */
  @java.lang.Override
  public int getFormsCount() {
    return forms_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.FormProto getForms(int index) {
    return forms_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.FormProtoOrBuilder getFormsOrBuilder(
      int index) {
    return forms_.get(index);
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
    if (pokemon_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      output.writeEnum(1, pokemon_);
    }
    for (int i = 0; i < forms_.size(); i++) {
      output.writeMessage(2, forms_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokemon_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, pokemon_);
    }
    for (int i = 0; i < forms_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, forms_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.FormSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FormSettingsProto other = (POGOProtos.Rpc.FormSettingsProto) obj;

    if (pokemon_ != other.pokemon_) return false;
    if (!getFormsList()
        .equals(other.getFormsList())) return false;
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
    hash = (37 * hash) + POKEMON_FIELD_NUMBER;
    hash = (53 * hash) + pokemon_;
    if (getFormsCount() > 0) {
      hash = (37 * hash) + FORMS_FIELD_NUMBER;
      hash = (53 * hash) + getFormsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FormSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FormSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FormSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FormSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FormSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FormSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FormSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FormSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FormSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FormSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FormSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FormSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FormSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.FormSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FormSettingsProto)
      POGOProtos.Rpc.FormSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FormSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FormSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FormSettingsProto.class, POGOProtos.Rpc.FormSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FormSettingsProto.newBuilder()
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
        getFormsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      pokemon_ = 0;

      if (formsBuilder_ == null) {
        forms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        formsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FormSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FormSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.FormSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FormSettingsProto build() {
      POGOProtos.Rpc.FormSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FormSettingsProto buildPartial() {
      POGOProtos.Rpc.FormSettingsProto result = new POGOProtos.Rpc.FormSettingsProto(this);
      int from_bitField0_ = bitField0_;
      result.pokemon_ = pokemon_;
      if (formsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          forms_ = java.util.Collections.unmodifiableList(forms_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.forms_ = forms_;
      } else {
        result.forms_ = formsBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.FormSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.FormSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FormSettingsProto other) {
      if (other == POGOProtos.Rpc.FormSettingsProto.getDefaultInstance()) return this;
      if (other.pokemon_ != 0) {
        setPokemonValue(other.getPokemonValue());
      }
      if (formsBuilder_ == null) {
        if (!other.forms_.isEmpty()) {
          if (forms_.isEmpty()) {
            forms_ = other.forms_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFormsIsMutable();
            forms_.addAll(other.forms_);
          }
          onChanged();
        }
      } else {
        if (!other.forms_.isEmpty()) {
          if (formsBuilder_.isEmpty()) {
            formsBuilder_.dispose();
            formsBuilder_ = null;
            forms_ = other.forms_;
            bitField0_ = (bitField0_ & ~0x00000001);
            formsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFormsFieldBuilder() : null;
          } else {
            formsBuilder_.addAllMessages(other.forms_);
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
      POGOProtos.Rpc.FormSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FormSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int pokemon_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
     * @return The enum numeric value on the wire for pokemon.
     */
    @java.lang.Override public int getPokemonValue() {
      return pokemon_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
     * @param value The enum numeric value on the wire for pokemon to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonValue(int value) {
      
      pokemon_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
     * @return The pokemon.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonId getPokemon() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemon_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
     * @param value The pokemon to set.
     * @return This builder for chaining.
     */
    public Builder setPokemon(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pokemon_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemon() {
      
      pokemon_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.FormProto> forms_ =
      java.util.Collections.emptyList();
    private void ensureFormsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        forms_ = new java.util.ArrayList<POGOProtos.Rpc.FormProto>(forms_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.FormProto, POGOProtos.Rpc.FormProto.Builder, POGOProtos.Rpc.FormProtoOrBuilder> formsBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.FormProto> getFormsList() {
      if (formsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(forms_);
      } else {
        return formsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public int getFormsCount() {
      if (formsBuilder_ == null) {
        return forms_.size();
      } else {
        return formsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public POGOProtos.Rpc.FormProto getForms(int index) {
      if (formsBuilder_ == null) {
        return forms_.get(index);
      } else {
        return formsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public Builder setForms(
        int index, POGOProtos.Rpc.FormProto value) {
      if (formsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFormsIsMutable();
        forms_.set(index, value);
        onChanged();
      } else {
        formsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public Builder setForms(
        int index, POGOProtos.Rpc.FormProto.Builder builderForValue) {
      if (formsBuilder_ == null) {
        ensureFormsIsMutable();
        forms_.set(index, builderForValue.build());
        onChanged();
      } else {
        formsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public Builder addForms(POGOProtos.Rpc.FormProto value) {
      if (formsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFormsIsMutable();
        forms_.add(value);
        onChanged();
      } else {
        formsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public Builder addForms(
        int index, POGOProtos.Rpc.FormProto value) {
      if (formsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFormsIsMutable();
        forms_.add(index, value);
        onChanged();
      } else {
        formsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public Builder addForms(
        POGOProtos.Rpc.FormProto.Builder builderForValue) {
      if (formsBuilder_ == null) {
        ensureFormsIsMutable();
        forms_.add(builderForValue.build());
        onChanged();
      } else {
        formsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public Builder addForms(
        int index, POGOProtos.Rpc.FormProto.Builder builderForValue) {
      if (formsBuilder_ == null) {
        ensureFormsIsMutable();
        forms_.add(index, builderForValue.build());
        onChanged();
      } else {
        formsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public Builder addAllForms(
        java.lang.Iterable<? extends POGOProtos.Rpc.FormProto> values) {
      if (formsBuilder_ == null) {
        ensureFormsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, forms_);
        onChanged();
      } else {
        formsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public Builder clearForms() {
      if (formsBuilder_ == null) {
        forms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        formsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public Builder removeForms(int index) {
      if (formsBuilder_ == null) {
        ensureFormsIsMutable();
        forms_.remove(index);
        onChanged();
      } else {
        formsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public POGOProtos.Rpc.FormProto.Builder getFormsBuilder(
        int index) {
      return getFormsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public POGOProtos.Rpc.FormProtoOrBuilder getFormsOrBuilder(
        int index) {
      if (formsBuilder_ == null) {
        return forms_.get(index);  } else {
        return formsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.FormProtoOrBuilder> 
         getFormsOrBuilderList() {
      if (formsBuilder_ != null) {
        return formsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(forms_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public POGOProtos.Rpc.FormProto.Builder addFormsBuilder() {
      return getFormsFieldBuilder().addBuilder(
          POGOProtos.Rpc.FormProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public POGOProtos.Rpc.FormProto.Builder addFormsBuilder(
        int index) {
      return getFormsFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.FormProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.FormProto forms = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.FormProto.Builder> 
         getFormsBuilderList() {
      return getFormsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.FormProto, POGOProtos.Rpc.FormProto.Builder, POGOProtos.Rpc.FormProtoOrBuilder> 
        getFormsFieldBuilder() {
      if (formsBuilder_ == null) {
        formsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.FormProto, POGOProtos.Rpc.FormProto.Builder, POGOProtos.Rpc.FormProtoOrBuilder>(
                forms_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        forms_ = null;
      }
      return formsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FormSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FormSettingsProto)
  private static final POGOProtos.Rpc.FormSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FormSettingsProto();
  }

  public static POGOProtos.Rpc.FormSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FormSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<FormSettingsProto>() {
    @java.lang.Override
    public FormSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FormSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FormSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FormSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FormSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

