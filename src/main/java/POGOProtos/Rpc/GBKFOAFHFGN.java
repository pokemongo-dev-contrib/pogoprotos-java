// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GBKFOAFHFGN}
 */
public  final class GBKFOAFHFGN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GBKFOAFHFGN)
    GBKFOAFHFGNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GBKFOAFHFGN.newBuilder() to construct.
  private GBKFOAFHFGN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GBKFOAFHFGN() {
    gkdagghbnae_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GBKFOAFHFGN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GBKFOAFHFGN(
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

            gkdagghbnae_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GBKFOAFHFGN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GBKFOAFHFGN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GBKFOAFHFGN.class, POGOProtos.Rpc.GBKFOAFHFGN.Builder.class);
  }

  public static final int GKDAGGHBNAE_FIELD_NUMBER = 1;
  private int gkdagghbnae_;
  /**
   * <code>.POGOProtos.Rpc.QuestProto.EGGDDOBICIL gkdagghbnae = 1;</code>
   * @return The enum numeric value on the wire for gkdagghbnae.
   */
  public int getGkdagghbnaeValue() {
    return gkdagghbnae_;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestProto.EGGDDOBICIL gkdagghbnae = 1;</code>
   * @return The gkdagghbnae.
   */
  public POGOProtos.Rpc.QuestProto.EGGDDOBICIL getGkdagghbnae() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.QuestProto.EGGDDOBICIL result = POGOProtos.Rpc.QuestProto.EGGDDOBICIL.valueOf(gkdagghbnae_);
    return result == null ? POGOProtos.Rpc.QuestProto.EGGDDOBICIL.UNRECOGNIZED : result;
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
    if (gkdagghbnae_ != POGOProtos.Rpc.QuestProto.EGGDDOBICIL.UNSET.getNumber()) {
      output.writeEnum(1, gkdagghbnae_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gkdagghbnae_ != POGOProtos.Rpc.QuestProto.EGGDDOBICIL.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, gkdagghbnae_);
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
    if (!(obj instanceof POGOProtos.Rpc.GBKFOAFHFGN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GBKFOAFHFGN other = (POGOProtos.Rpc.GBKFOAFHFGN) obj;

    if (gkdagghbnae_ != other.gkdagghbnae_) return false;
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
    hash = (37 * hash) + GKDAGGHBNAE_FIELD_NUMBER;
    hash = (53 * hash) + gkdagghbnae_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GBKFOAFHFGN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GBKFOAFHFGN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GBKFOAFHFGN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GBKFOAFHFGN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GBKFOAFHFGN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GBKFOAFHFGN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GBKFOAFHFGN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GBKFOAFHFGN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GBKFOAFHFGN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GBKFOAFHFGN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GBKFOAFHFGN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GBKFOAFHFGN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GBKFOAFHFGN prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GBKFOAFHFGN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GBKFOAFHFGN)
      POGOProtos.Rpc.GBKFOAFHFGNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GBKFOAFHFGN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GBKFOAFHFGN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GBKFOAFHFGN.class, POGOProtos.Rpc.GBKFOAFHFGN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GBKFOAFHFGN.newBuilder()
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
      gkdagghbnae_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GBKFOAFHFGN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GBKFOAFHFGN getDefaultInstanceForType() {
      return POGOProtos.Rpc.GBKFOAFHFGN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GBKFOAFHFGN build() {
      POGOProtos.Rpc.GBKFOAFHFGN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GBKFOAFHFGN buildPartial() {
      POGOProtos.Rpc.GBKFOAFHFGN result = new POGOProtos.Rpc.GBKFOAFHFGN(this);
      result.gkdagghbnae_ = gkdagghbnae_;
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
      if (other instanceof POGOProtos.Rpc.GBKFOAFHFGN) {
        return mergeFrom((POGOProtos.Rpc.GBKFOAFHFGN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GBKFOAFHFGN other) {
      if (other == POGOProtos.Rpc.GBKFOAFHFGN.getDefaultInstance()) return this;
      if (other.gkdagghbnae_ != 0) {
        setGkdagghbnaeValue(other.getGkdagghbnaeValue());
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
      POGOProtos.Rpc.GBKFOAFHFGN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GBKFOAFHFGN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int gkdagghbnae_ = 0;
    /**
     * <code>.POGOProtos.Rpc.QuestProto.EGGDDOBICIL gkdagghbnae = 1;</code>
     * @return The enum numeric value on the wire for gkdagghbnae.
     */
    public int getGkdagghbnaeValue() {
      return gkdagghbnae_;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto.EGGDDOBICIL gkdagghbnae = 1;</code>
     * @param value The enum numeric value on the wire for gkdagghbnae to set.
     * @return This builder for chaining.
     */
    public Builder setGkdagghbnaeValue(int value) {
      gkdagghbnae_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto.EGGDDOBICIL gkdagghbnae = 1;</code>
     * @return The gkdagghbnae.
     */
    public POGOProtos.Rpc.QuestProto.EGGDDOBICIL getGkdagghbnae() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.QuestProto.EGGDDOBICIL result = POGOProtos.Rpc.QuestProto.EGGDDOBICIL.valueOf(gkdagghbnae_);
      return result == null ? POGOProtos.Rpc.QuestProto.EGGDDOBICIL.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto.EGGDDOBICIL gkdagghbnae = 1;</code>
     * @param value The gkdagghbnae to set.
     * @return This builder for chaining.
     */
    public Builder setGkdagghbnae(POGOProtos.Rpc.QuestProto.EGGDDOBICIL value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      gkdagghbnae_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto.EGGDDOBICIL gkdagghbnae = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGkdagghbnae() {
      
      gkdagghbnae_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GBKFOAFHFGN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GBKFOAFHFGN)
  private static final POGOProtos.Rpc.GBKFOAFHFGN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GBKFOAFHFGN();
  }

  public static POGOProtos.Rpc.GBKFOAFHFGN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GBKFOAFHFGN>
      PARSER = new com.google.protobuf.AbstractParser<GBKFOAFHFGN>() {
    @java.lang.Override
    public GBKFOAFHFGN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GBKFOAFHFGN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GBKFOAFHFGN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GBKFOAFHFGN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GBKFOAFHFGN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

