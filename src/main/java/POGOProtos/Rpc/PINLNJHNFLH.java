// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PINLNJHNFLH}
 */
public  final class PINLNJHNFLH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PINLNJHNFLH)
    PINLNJHNFLHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PINLNJHNFLH.newBuilder() to construct.
  private PINLNJHNFLH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PINLNJHNFLH() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PINLNJHNFLH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PINLNJHNFLH(
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
              lndjfnbncbj_ = com.google.protobuf.MapField.newMapField(
                  LndjfnbncbjDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI>
            lndjfnbncbj__ = input.readMessage(
                LndjfnbncbjDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            lndjfnbncbj_.getMutableMap().put(
                lndjfnbncbj__.getKey(), lndjfnbncbj__.getValue());
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PINLNJHNFLH_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetLndjfnbncbj();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PINLNJHNFLH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PINLNJHNFLH.class, POGOProtos.Rpc.PINLNJHNFLH.Builder.class);
  }

  public static final int LNDJFNBNCBJ_FIELD_NUMBER = 1;
  private static final class LndjfnbncbjDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI>newDefaultInstance(
                POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PINLNJHNFLH_LndjfnbncbjEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                POGOProtos.Rpc.HKMNCOJCGJI.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI> lndjfnbncbj_;
  private com.google.protobuf.MapField<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI>
  internalGetLndjfnbncbj() {
    if (lndjfnbncbj_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          LndjfnbncbjDefaultEntryHolder.defaultEntry);
    }
    return lndjfnbncbj_;
  }

  public int getLndjfnbncbjCount() {
    return internalGetLndjfnbncbj().getMap().size();
  }
  /**
   * <code>map&lt;int32, .POGOProtos.Rpc.HKMNCOJCGJI&gt; lndjfnbncbj = 1;</code>
   */

  public boolean containsLndjfnbncbj(
      int key) {
    
    return internalGetLndjfnbncbj().getMap().containsKey(key);
  }
  /**
   * Use {@link #getLndjfnbncbjMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI> getLndjfnbncbj() {
    return getLndjfnbncbjMap();
  }
  /**
   * <code>map&lt;int32, .POGOProtos.Rpc.HKMNCOJCGJI&gt; lndjfnbncbj = 1;</code>
   */

  public java.util.Map<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI> getLndjfnbncbjMap() {
    return internalGetLndjfnbncbj().getMap();
  }
  /**
   * <code>map&lt;int32, .POGOProtos.Rpc.HKMNCOJCGJI&gt; lndjfnbncbj = 1;</code>
   */

  public POGOProtos.Rpc.HKMNCOJCGJI getLndjfnbncbjOrDefault(
      int key,
      POGOProtos.Rpc.HKMNCOJCGJI defaultValue) {
    
    java.util.Map<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI> map =
        internalGetLndjfnbncbj().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int32, .POGOProtos.Rpc.HKMNCOJCGJI&gt; lndjfnbncbj = 1;</code>
   */

  public POGOProtos.Rpc.HKMNCOJCGJI getLndjfnbncbjOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI> map =
        internalGetLndjfnbncbj().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetLndjfnbncbj(),
        LndjfnbncbjDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI> entry
         : internalGetLndjfnbncbj().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI>
      lndjfnbncbj__ = LndjfnbncbjDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, lndjfnbncbj__);
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
    if (!(obj instanceof POGOProtos.Rpc.PINLNJHNFLH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PINLNJHNFLH other = (POGOProtos.Rpc.PINLNJHNFLH) obj;

    if (!internalGetLndjfnbncbj().equals(
        other.internalGetLndjfnbncbj())) return false;
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
    if (!internalGetLndjfnbncbj().getMap().isEmpty()) {
      hash = (37 * hash) + LNDJFNBNCBJ_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLndjfnbncbj().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PINLNJHNFLH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PINLNJHNFLH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PINLNJHNFLH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PINLNJHNFLH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PINLNJHNFLH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PINLNJHNFLH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PINLNJHNFLH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PINLNJHNFLH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PINLNJHNFLH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PINLNJHNFLH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PINLNJHNFLH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PINLNJHNFLH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PINLNJHNFLH prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PINLNJHNFLH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PINLNJHNFLH)
      POGOProtos.Rpc.PINLNJHNFLHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PINLNJHNFLH_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetLndjfnbncbj();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableLndjfnbncbj();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PINLNJHNFLH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PINLNJHNFLH.class, POGOProtos.Rpc.PINLNJHNFLH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PINLNJHNFLH.newBuilder()
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
      internalGetMutableLndjfnbncbj().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PINLNJHNFLH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PINLNJHNFLH getDefaultInstanceForType() {
      return POGOProtos.Rpc.PINLNJHNFLH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PINLNJHNFLH build() {
      POGOProtos.Rpc.PINLNJHNFLH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PINLNJHNFLH buildPartial() {
      POGOProtos.Rpc.PINLNJHNFLH result = new POGOProtos.Rpc.PINLNJHNFLH(this);
      int from_bitField0_ = bitField0_;
      result.lndjfnbncbj_ = internalGetLndjfnbncbj();
      result.lndjfnbncbj_.makeImmutable();
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
      if (other instanceof POGOProtos.Rpc.PINLNJHNFLH) {
        return mergeFrom((POGOProtos.Rpc.PINLNJHNFLH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PINLNJHNFLH other) {
      if (other == POGOProtos.Rpc.PINLNJHNFLH.getDefaultInstance()) return this;
      internalGetMutableLndjfnbncbj().mergeFrom(
          other.internalGetLndjfnbncbj());
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
      POGOProtos.Rpc.PINLNJHNFLH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PINLNJHNFLH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI> lndjfnbncbj_;
    private com.google.protobuf.MapField<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI>
    internalGetLndjfnbncbj() {
      if (lndjfnbncbj_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            LndjfnbncbjDefaultEntryHolder.defaultEntry);
      }
      return lndjfnbncbj_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI>
    internalGetMutableLndjfnbncbj() {
      onChanged();;
      if (lndjfnbncbj_ == null) {
        lndjfnbncbj_ = com.google.protobuf.MapField.newMapField(
            LndjfnbncbjDefaultEntryHolder.defaultEntry);
      }
      if (!lndjfnbncbj_.isMutable()) {
        lndjfnbncbj_ = lndjfnbncbj_.copy();
      }
      return lndjfnbncbj_;
    }

    public int getLndjfnbncbjCount() {
      return internalGetLndjfnbncbj().getMap().size();
    }
    /**
     * <code>map&lt;int32, .POGOProtos.Rpc.HKMNCOJCGJI&gt; lndjfnbncbj = 1;</code>
     */

    public boolean containsLndjfnbncbj(
        int key) {
      
      return internalGetLndjfnbncbj().getMap().containsKey(key);
    }
    /**
     * Use {@link #getLndjfnbncbjMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI> getLndjfnbncbj() {
      return getLndjfnbncbjMap();
    }
    /**
     * <code>map&lt;int32, .POGOProtos.Rpc.HKMNCOJCGJI&gt; lndjfnbncbj = 1;</code>
     */

    public java.util.Map<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI> getLndjfnbncbjMap() {
      return internalGetLndjfnbncbj().getMap();
    }
    /**
     * <code>map&lt;int32, .POGOProtos.Rpc.HKMNCOJCGJI&gt; lndjfnbncbj = 1;</code>
     */

    public POGOProtos.Rpc.HKMNCOJCGJI getLndjfnbncbjOrDefault(
        int key,
        POGOProtos.Rpc.HKMNCOJCGJI defaultValue) {
      
      java.util.Map<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI> map =
          internalGetLndjfnbncbj().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int32, .POGOProtos.Rpc.HKMNCOJCGJI&gt; lndjfnbncbj = 1;</code>
     */

    public POGOProtos.Rpc.HKMNCOJCGJI getLndjfnbncbjOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI> map =
          internalGetLndjfnbncbj().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearLndjfnbncbj() {
      internalGetMutableLndjfnbncbj().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;int32, .POGOProtos.Rpc.HKMNCOJCGJI&gt; lndjfnbncbj = 1;</code>
     */

    public Builder removeLndjfnbncbj(
        int key) {
      
      internalGetMutableLndjfnbncbj().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI>
    getMutableLndjfnbncbj() {
      return internalGetMutableLndjfnbncbj().getMutableMap();
    }
    /**
     * <code>map&lt;int32, .POGOProtos.Rpc.HKMNCOJCGJI&gt; lndjfnbncbj = 1;</code>
     */
    public Builder putLndjfnbncbj(
        int key,
        POGOProtos.Rpc.HKMNCOJCGJI value) {
      
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableLndjfnbncbj().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;int32, .POGOProtos.Rpc.HKMNCOJCGJI&gt; lndjfnbncbj = 1;</code>
     */

    public Builder putAllLndjfnbncbj(
        java.util.Map<java.lang.Integer, POGOProtos.Rpc.HKMNCOJCGJI> values) {
      internalGetMutableLndjfnbncbj().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PINLNJHNFLH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PINLNJHNFLH)
  private static final POGOProtos.Rpc.PINLNJHNFLH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PINLNJHNFLH();
  }

  public static POGOProtos.Rpc.PINLNJHNFLH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PINLNJHNFLH>
      PARSER = new com.google.protobuf.AbstractParser<PINLNJHNFLH>() {
    @java.lang.Override
    public PINLNJHNFLH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PINLNJHNFLH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PINLNJHNFLH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PINLNJHNFLH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PINLNJHNFLH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

