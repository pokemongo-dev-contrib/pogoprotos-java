// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OAOKJHIDIGI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.OAOKJHIDIGI}
 */
public final class OAOKJHIDIGI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OAOKJHIDIGI)
    OAOKJHIDIGIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OAOKJHIDIGI.newBuilder() to construct.
  private OAOKJHIDIGI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OAOKJHIDIGI() {
    macpgmjmoil_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OAOKJHIDIGI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OAOKJHIDIGI(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              macpgmjmoil_ = new java.util.ArrayList<POGOProtos.Rpc.ODJMHHBHFBB>();
              mutable_bitField0_ |= 0x00000001;
            }
            macpgmjmoil_.add(
                input.readMessage(POGOProtos.Rpc.ODJMHHBHFBB.parser(), extensionRegistry));
            break;
          }
          case 16: {

            mfageggakib_ = input.readInt64();
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
        macpgmjmoil_ = java.util.Collections.unmodifiableList(macpgmjmoil_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAOKJHIDIGI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAOKJHIDIGI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OAOKJHIDIGI.class, POGOProtos.Rpc.OAOKJHIDIGI.Builder.class);
  }

  public static final int MACPGMJMOIL_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.ODJMHHBHFBB> macpgmjmoil_;
  /**
   * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.ODJMHHBHFBB> getMacpgmjmoilList() {
    return macpgmjmoil_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.ODJMHHBHFBBOrBuilder> 
      getMacpgmjmoilOrBuilderList() {
    return macpgmjmoil_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
   */
  @java.lang.Override
  public int getMacpgmjmoilCount() {
    return macpgmjmoil_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ODJMHHBHFBB getMacpgmjmoil(int index) {
    return macpgmjmoil_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.ODJMHHBHFBBOrBuilder getMacpgmjmoilOrBuilder(
      int index) {
    return macpgmjmoil_.get(index);
  }

  public static final int MFAGEGGAKIB_FIELD_NUMBER = 2;
  private long mfageggakib_;
  /**
   * <code>int64 mfageggakib = 2;</code>
   * @return The mfageggakib.
   */
  @java.lang.Override
  public long getMfageggakib() {
    return mfageggakib_;
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
    for (int i = 0; i < macpgmjmoil_.size(); i++) {
      output.writeMessage(1, macpgmjmoil_.get(i));
    }
    if (mfageggakib_ != 0L) {
      output.writeInt64(2, mfageggakib_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < macpgmjmoil_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, macpgmjmoil_.get(i));
    }
    if (mfageggakib_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, mfageggakib_);
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
    if (!(obj instanceof POGOProtos.Rpc.OAOKJHIDIGI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OAOKJHIDIGI other = (POGOProtos.Rpc.OAOKJHIDIGI) obj;

    if (!getMacpgmjmoilList()
        .equals(other.getMacpgmjmoilList())) return false;
    if (getMfageggakib()
        != other.getMfageggakib()) return false;
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
    if (getMacpgmjmoilCount() > 0) {
      hash = (37 * hash) + MACPGMJMOIL_FIELD_NUMBER;
      hash = (53 * hash) + getMacpgmjmoilList().hashCode();
    }
    hash = (37 * hash) + MFAGEGGAKIB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMfageggakib());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OAOKJHIDIGI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OAOKJHIDIGI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAOKJHIDIGI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OAOKJHIDIGI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAOKJHIDIGI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OAOKJHIDIGI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAOKJHIDIGI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OAOKJHIDIGI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAOKJHIDIGI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OAOKJHIDIGI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OAOKJHIDIGI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OAOKJHIDIGI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OAOKJHIDIGI prototype) {
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
   * ref: OAOKJHIDIGI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.OAOKJHIDIGI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OAOKJHIDIGI)
      POGOProtos.Rpc.OAOKJHIDIGIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAOKJHIDIGI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAOKJHIDIGI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OAOKJHIDIGI.class, POGOProtos.Rpc.OAOKJHIDIGI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OAOKJHIDIGI.newBuilder()
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
        getMacpgmjmoilFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (macpgmjmoilBuilder_ == null) {
        macpgmjmoil_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        macpgmjmoilBuilder_.clear();
      }
      mfageggakib_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OAOKJHIDIGI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OAOKJHIDIGI getDefaultInstanceForType() {
      return POGOProtos.Rpc.OAOKJHIDIGI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OAOKJHIDIGI build() {
      POGOProtos.Rpc.OAOKJHIDIGI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OAOKJHIDIGI buildPartial() {
      POGOProtos.Rpc.OAOKJHIDIGI result = new POGOProtos.Rpc.OAOKJHIDIGI(this);
      int from_bitField0_ = bitField0_;
      if (macpgmjmoilBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          macpgmjmoil_ = java.util.Collections.unmodifiableList(macpgmjmoil_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.macpgmjmoil_ = macpgmjmoil_;
      } else {
        result.macpgmjmoil_ = macpgmjmoilBuilder_.build();
      }
      result.mfageggakib_ = mfageggakib_;
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
      if (other instanceof POGOProtos.Rpc.OAOKJHIDIGI) {
        return mergeFrom((POGOProtos.Rpc.OAOKJHIDIGI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OAOKJHIDIGI other) {
      if (other == POGOProtos.Rpc.OAOKJHIDIGI.getDefaultInstance()) return this;
      if (macpgmjmoilBuilder_ == null) {
        if (!other.macpgmjmoil_.isEmpty()) {
          if (macpgmjmoil_.isEmpty()) {
            macpgmjmoil_ = other.macpgmjmoil_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMacpgmjmoilIsMutable();
            macpgmjmoil_.addAll(other.macpgmjmoil_);
          }
          onChanged();
        }
      } else {
        if (!other.macpgmjmoil_.isEmpty()) {
          if (macpgmjmoilBuilder_.isEmpty()) {
            macpgmjmoilBuilder_.dispose();
            macpgmjmoilBuilder_ = null;
            macpgmjmoil_ = other.macpgmjmoil_;
            bitField0_ = (bitField0_ & ~0x00000001);
            macpgmjmoilBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMacpgmjmoilFieldBuilder() : null;
          } else {
            macpgmjmoilBuilder_.addAllMessages(other.macpgmjmoil_);
          }
        }
      }
      if (other.getMfageggakib() != 0L) {
        setMfageggakib(other.getMfageggakib());
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
      POGOProtos.Rpc.OAOKJHIDIGI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OAOKJHIDIGI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.ODJMHHBHFBB> macpgmjmoil_ =
      java.util.Collections.emptyList();
    private void ensureMacpgmjmoilIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        macpgmjmoil_ = new java.util.ArrayList<POGOProtos.Rpc.ODJMHHBHFBB>(macpgmjmoil_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.ODJMHHBHFBB, POGOProtos.Rpc.ODJMHHBHFBB.Builder, POGOProtos.Rpc.ODJMHHBHFBBOrBuilder> macpgmjmoilBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.ODJMHHBHFBB> getMacpgmjmoilList() {
      if (macpgmjmoilBuilder_ == null) {
        return java.util.Collections.unmodifiableList(macpgmjmoil_);
      } else {
        return macpgmjmoilBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public int getMacpgmjmoilCount() {
      if (macpgmjmoilBuilder_ == null) {
        return macpgmjmoil_.size();
      } else {
        return macpgmjmoilBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public POGOProtos.Rpc.ODJMHHBHFBB getMacpgmjmoil(int index) {
      if (macpgmjmoilBuilder_ == null) {
        return macpgmjmoil_.get(index);
      } else {
        return macpgmjmoilBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public Builder setMacpgmjmoil(
        int index, POGOProtos.Rpc.ODJMHHBHFBB value) {
      if (macpgmjmoilBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMacpgmjmoilIsMutable();
        macpgmjmoil_.set(index, value);
        onChanged();
      } else {
        macpgmjmoilBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public Builder setMacpgmjmoil(
        int index, POGOProtos.Rpc.ODJMHHBHFBB.Builder builderForValue) {
      if (macpgmjmoilBuilder_ == null) {
        ensureMacpgmjmoilIsMutable();
        macpgmjmoil_.set(index, builderForValue.build());
        onChanged();
      } else {
        macpgmjmoilBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public Builder addMacpgmjmoil(POGOProtos.Rpc.ODJMHHBHFBB value) {
      if (macpgmjmoilBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMacpgmjmoilIsMutable();
        macpgmjmoil_.add(value);
        onChanged();
      } else {
        macpgmjmoilBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public Builder addMacpgmjmoil(
        int index, POGOProtos.Rpc.ODJMHHBHFBB value) {
      if (macpgmjmoilBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMacpgmjmoilIsMutable();
        macpgmjmoil_.add(index, value);
        onChanged();
      } else {
        macpgmjmoilBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public Builder addMacpgmjmoil(
        POGOProtos.Rpc.ODJMHHBHFBB.Builder builderForValue) {
      if (macpgmjmoilBuilder_ == null) {
        ensureMacpgmjmoilIsMutable();
        macpgmjmoil_.add(builderForValue.build());
        onChanged();
      } else {
        macpgmjmoilBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public Builder addMacpgmjmoil(
        int index, POGOProtos.Rpc.ODJMHHBHFBB.Builder builderForValue) {
      if (macpgmjmoilBuilder_ == null) {
        ensureMacpgmjmoilIsMutable();
        macpgmjmoil_.add(index, builderForValue.build());
        onChanged();
      } else {
        macpgmjmoilBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public Builder addAllMacpgmjmoil(
        java.lang.Iterable<? extends POGOProtos.Rpc.ODJMHHBHFBB> values) {
      if (macpgmjmoilBuilder_ == null) {
        ensureMacpgmjmoilIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, macpgmjmoil_);
        onChanged();
      } else {
        macpgmjmoilBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public Builder clearMacpgmjmoil() {
      if (macpgmjmoilBuilder_ == null) {
        macpgmjmoil_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        macpgmjmoilBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public Builder removeMacpgmjmoil(int index) {
      if (macpgmjmoilBuilder_ == null) {
        ensureMacpgmjmoilIsMutable();
        macpgmjmoil_.remove(index);
        onChanged();
      } else {
        macpgmjmoilBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public POGOProtos.Rpc.ODJMHHBHFBB.Builder getMacpgmjmoilBuilder(
        int index) {
      return getMacpgmjmoilFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public POGOProtos.Rpc.ODJMHHBHFBBOrBuilder getMacpgmjmoilOrBuilder(
        int index) {
      if (macpgmjmoilBuilder_ == null) {
        return macpgmjmoil_.get(index);  } else {
        return macpgmjmoilBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.ODJMHHBHFBBOrBuilder> 
         getMacpgmjmoilOrBuilderList() {
      if (macpgmjmoilBuilder_ != null) {
        return macpgmjmoilBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(macpgmjmoil_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public POGOProtos.Rpc.ODJMHHBHFBB.Builder addMacpgmjmoilBuilder() {
      return getMacpgmjmoilFieldBuilder().addBuilder(
          POGOProtos.Rpc.ODJMHHBHFBB.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public POGOProtos.Rpc.ODJMHHBHFBB.Builder addMacpgmjmoilBuilder(
        int index) {
      return getMacpgmjmoilFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.ODJMHHBHFBB.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.ODJMHHBHFBB macpgmjmoil = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.ODJMHHBHFBB.Builder> 
         getMacpgmjmoilBuilderList() {
      return getMacpgmjmoilFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.ODJMHHBHFBB, POGOProtos.Rpc.ODJMHHBHFBB.Builder, POGOProtos.Rpc.ODJMHHBHFBBOrBuilder> 
        getMacpgmjmoilFieldBuilder() {
      if (macpgmjmoilBuilder_ == null) {
        macpgmjmoilBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.ODJMHHBHFBB, POGOProtos.Rpc.ODJMHHBHFBB.Builder, POGOProtos.Rpc.ODJMHHBHFBBOrBuilder>(
                macpgmjmoil_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        macpgmjmoil_ = null;
      }
      return macpgmjmoilBuilder_;
    }

    private long mfageggakib_ ;
    /**
     * <code>int64 mfageggakib = 2;</code>
     * @return The mfageggakib.
     */
    @java.lang.Override
    public long getMfageggakib() {
      return mfageggakib_;
    }
    /**
     * <code>int64 mfageggakib = 2;</code>
     * @param value The mfageggakib to set.
     * @return This builder for chaining.
     */
    public Builder setMfageggakib(long value) {
      
      mfageggakib_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 mfageggakib = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMfageggakib() {
      
      mfageggakib_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OAOKJHIDIGI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OAOKJHIDIGI)
  private static final POGOProtos.Rpc.OAOKJHIDIGI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OAOKJHIDIGI();
  }

  public static POGOProtos.Rpc.OAOKJHIDIGI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OAOKJHIDIGI>
      PARSER = new com.google.protobuf.AbstractParser<OAOKJHIDIGI>() {
    @java.lang.Override
    public OAOKJHIDIGI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OAOKJHIDIGI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OAOKJHIDIGI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OAOKJHIDIGI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OAOKJHIDIGI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

