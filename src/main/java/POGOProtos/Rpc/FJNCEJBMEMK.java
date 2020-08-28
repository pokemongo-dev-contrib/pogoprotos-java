// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FJNCEJBMEMK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FJNCEJBMEMK}
 */
public final class FJNCEJBMEMK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FJNCEJBMEMK)
    FJNCEJBMEMKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FJNCEJBMEMK.newBuilder() to construct.
  private FJNCEJBMEMK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FJNCEJBMEMK() {
    dmahipegcin_ = 0;
    gdelaifenlo_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FJNCEJBMEMK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FJNCEJBMEMK(
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

            dmahipegcin_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              gdelaifenlo_ = new java.util.ArrayList<POGOProtos.Rpc.OGONFONKCIG>();
              mutable_bitField0_ |= 0x00000001;
            }
            gdelaifenlo_.add(
                input.readMessage(POGOProtos.Rpc.OGONFONKCIG.parser(), extensionRegistry));
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
        gdelaifenlo_ = java.util.Collections.unmodifiableList(gdelaifenlo_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FJNCEJBMEMK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FJNCEJBMEMK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FJNCEJBMEMK.class, POGOProtos.Rpc.FJNCEJBMEMK.Builder.class);
  }

  /**
   * <pre>
   * ref: FJNCEJBMEMK/BKKLPCPMAKB/KIAPEPDHDHO
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO}
   */
  public enum KIAPEPDHDHO
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
     * <code>ERROR_QUEST_NOT_FOUND = 2;</code>
     */
    ERROR_QUEST_NOT_FOUND(2),
    /**
     * <code>ERROR_INVALID_DISPLAY = 3;</code>
     */
    ERROR_INVALID_DISPLAY(3),
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
     * <code>ERROR_QUEST_NOT_FOUND = 2;</code>
     */
    public static final int ERROR_QUEST_NOT_FOUND_VALUE = 2;
    /**
     * <code>ERROR_INVALID_DISPLAY = 3;</code>
     */
    public static final int ERROR_INVALID_DISPLAY_VALUE = 3;


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
    public static KIAPEPDHDHO valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static KIAPEPDHDHO forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_QUEST_NOT_FOUND;
        case 3: return ERROR_INVALID_DISPLAY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<KIAPEPDHDHO>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        KIAPEPDHDHO> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<KIAPEPDHDHO>() {
            public KIAPEPDHDHO findValueByNumber(int number) {
              return KIAPEPDHDHO.forNumber(number);
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
      return POGOProtos.Rpc.FJNCEJBMEMK.getDescriptor().getEnumTypes().get(0);
    }

    private static final KIAPEPDHDHO[] VALUES = values();

    public static KIAPEPDHDHO valueOf(
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

    private KIAPEPDHDHO(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO)
  }

  public static final int DMAHIPEGCIN_FIELD_NUMBER = 1;
  private int dmahipegcin_;
  /**
   * <code>.POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO dmahipegcin = 1;</code>
   * @return The enum numeric value on the wire for dmahipegcin.
   */
  @java.lang.Override public int getDmahipegcinValue() {
    return dmahipegcin_;
  }
  /**
   * <code>.POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO dmahipegcin = 1;</code>
   * @return The dmahipegcin.
   */
  @java.lang.Override public POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO getDmahipegcin() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO result = POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO.valueOf(dmahipegcin_);
    return result == null ? POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO.UNRECOGNIZED : result;
  }

  public static final int GDELAIFENLO_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Rpc.OGONFONKCIG> gdelaifenlo_;
  /**
   * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.OGONFONKCIG> getGdelaifenloList() {
    return gdelaifenlo_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.OGONFONKCIGOrBuilder> 
      getGdelaifenloOrBuilderList() {
    return gdelaifenlo_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
   */
  @java.lang.Override
  public int getGdelaifenloCount() {
    return gdelaifenlo_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.OGONFONKCIG getGdelaifenlo(int index) {
    return gdelaifenlo_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.OGONFONKCIGOrBuilder getGdelaifenloOrBuilder(
      int index) {
    return gdelaifenlo_.get(index);
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
    if (dmahipegcin_ != POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO.UNSET.getNumber()) {
      output.writeEnum(1, dmahipegcin_);
    }
    for (int i = 0; i < gdelaifenlo_.size(); i++) {
      output.writeMessage(2, gdelaifenlo_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dmahipegcin_ != POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dmahipegcin_);
    }
    for (int i = 0; i < gdelaifenlo_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, gdelaifenlo_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.FJNCEJBMEMK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FJNCEJBMEMK other = (POGOProtos.Rpc.FJNCEJBMEMK) obj;

    if (dmahipegcin_ != other.dmahipegcin_) return false;
    if (!getGdelaifenloList()
        .equals(other.getGdelaifenloList())) return false;
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
    hash = (37 * hash) + DMAHIPEGCIN_FIELD_NUMBER;
    hash = (53 * hash) + dmahipegcin_;
    if (getGdelaifenloCount() > 0) {
      hash = (37 * hash) + GDELAIFENLO_FIELD_NUMBER;
      hash = (53 * hash) + getGdelaifenloList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FJNCEJBMEMK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FJNCEJBMEMK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FJNCEJBMEMK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FJNCEJBMEMK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FJNCEJBMEMK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FJNCEJBMEMK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FJNCEJBMEMK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FJNCEJBMEMK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FJNCEJBMEMK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FJNCEJBMEMK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FJNCEJBMEMK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FJNCEJBMEMK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FJNCEJBMEMK prototype) {
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
   * ref: FJNCEJBMEMK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FJNCEJBMEMK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FJNCEJBMEMK)
      POGOProtos.Rpc.FJNCEJBMEMKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FJNCEJBMEMK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FJNCEJBMEMK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FJNCEJBMEMK.class, POGOProtos.Rpc.FJNCEJBMEMK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FJNCEJBMEMK.newBuilder()
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
        getGdelaifenloFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      dmahipegcin_ = 0;

      if (gdelaifenloBuilder_ == null) {
        gdelaifenlo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        gdelaifenloBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FJNCEJBMEMK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FJNCEJBMEMK getDefaultInstanceForType() {
      return POGOProtos.Rpc.FJNCEJBMEMK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FJNCEJBMEMK build() {
      POGOProtos.Rpc.FJNCEJBMEMK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FJNCEJBMEMK buildPartial() {
      POGOProtos.Rpc.FJNCEJBMEMK result = new POGOProtos.Rpc.FJNCEJBMEMK(this);
      int from_bitField0_ = bitField0_;
      result.dmahipegcin_ = dmahipegcin_;
      if (gdelaifenloBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          gdelaifenlo_ = java.util.Collections.unmodifiableList(gdelaifenlo_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.gdelaifenlo_ = gdelaifenlo_;
      } else {
        result.gdelaifenlo_ = gdelaifenloBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.FJNCEJBMEMK) {
        return mergeFrom((POGOProtos.Rpc.FJNCEJBMEMK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FJNCEJBMEMK other) {
      if (other == POGOProtos.Rpc.FJNCEJBMEMK.getDefaultInstance()) return this;
      if (other.dmahipegcin_ != 0) {
        setDmahipegcinValue(other.getDmahipegcinValue());
      }
      if (gdelaifenloBuilder_ == null) {
        if (!other.gdelaifenlo_.isEmpty()) {
          if (gdelaifenlo_.isEmpty()) {
            gdelaifenlo_ = other.gdelaifenlo_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGdelaifenloIsMutable();
            gdelaifenlo_.addAll(other.gdelaifenlo_);
          }
          onChanged();
        }
      } else {
        if (!other.gdelaifenlo_.isEmpty()) {
          if (gdelaifenloBuilder_.isEmpty()) {
            gdelaifenloBuilder_.dispose();
            gdelaifenloBuilder_ = null;
            gdelaifenlo_ = other.gdelaifenlo_;
            bitField0_ = (bitField0_ & ~0x00000001);
            gdelaifenloBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGdelaifenloFieldBuilder() : null;
          } else {
            gdelaifenloBuilder_.addAllMessages(other.gdelaifenlo_);
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
      POGOProtos.Rpc.FJNCEJBMEMK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FJNCEJBMEMK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int dmahipegcin_ = 0;
    /**
     * <code>.POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO dmahipegcin = 1;</code>
     * @return The enum numeric value on the wire for dmahipegcin.
     */
    @java.lang.Override public int getDmahipegcinValue() {
      return dmahipegcin_;
    }
    /**
     * <code>.POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO dmahipegcin = 1;</code>
     * @param value The enum numeric value on the wire for dmahipegcin to set.
     * @return This builder for chaining.
     */
    public Builder setDmahipegcinValue(int value) {
      
      dmahipegcin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO dmahipegcin = 1;</code>
     * @return The dmahipegcin.
     */
    @java.lang.Override
    public POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO getDmahipegcin() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO result = POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO.valueOf(dmahipegcin_);
      return result == null ? POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO dmahipegcin = 1;</code>
     * @param value The dmahipegcin to set.
     * @return This builder for chaining.
     */
    public Builder setDmahipegcin(POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dmahipegcin_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FJNCEJBMEMK.KIAPEPDHDHO dmahipegcin = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDmahipegcin() {
      
      dmahipegcin_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.OGONFONKCIG> gdelaifenlo_ =
      java.util.Collections.emptyList();
    private void ensureGdelaifenloIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        gdelaifenlo_ = new java.util.ArrayList<POGOProtos.Rpc.OGONFONKCIG>(gdelaifenlo_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.OGONFONKCIG, POGOProtos.Rpc.OGONFONKCIG.Builder, POGOProtos.Rpc.OGONFONKCIGOrBuilder> gdelaifenloBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.OGONFONKCIG> getGdelaifenloList() {
      if (gdelaifenloBuilder_ == null) {
        return java.util.Collections.unmodifiableList(gdelaifenlo_);
      } else {
        return gdelaifenloBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public int getGdelaifenloCount() {
      if (gdelaifenloBuilder_ == null) {
        return gdelaifenlo_.size();
      } else {
        return gdelaifenloBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public POGOProtos.Rpc.OGONFONKCIG getGdelaifenlo(int index) {
      if (gdelaifenloBuilder_ == null) {
        return gdelaifenlo_.get(index);
      } else {
        return gdelaifenloBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public Builder setGdelaifenlo(
        int index, POGOProtos.Rpc.OGONFONKCIG value) {
      if (gdelaifenloBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGdelaifenloIsMutable();
        gdelaifenlo_.set(index, value);
        onChanged();
      } else {
        gdelaifenloBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public Builder setGdelaifenlo(
        int index, POGOProtos.Rpc.OGONFONKCIG.Builder builderForValue) {
      if (gdelaifenloBuilder_ == null) {
        ensureGdelaifenloIsMutable();
        gdelaifenlo_.set(index, builderForValue.build());
        onChanged();
      } else {
        gdelaifenloBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public Builder addGdelaifenlo(POGOProtos.Rpc.OGONFONKCIG value) {
      if (gdelaifenloBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGdelaifenloIsMutable();
        gdelaifenlo_.add(value);
        onChanged();
      } else {
        gdelaifenloBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public Builder addGdelaifenlo(
        int index, POGOProtos.Rpc.OGONFONKCIG value) {
      if (gdelaifenloBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGdelaifenloIsMutable();
        gdelaifenlo_.add(index, value);
        onChanged();
      } else {
        gdelaifenloBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public Builder addGdelaifenlo(
        POGOProtos.Rpc.OGONFONKCIG.Builder builderForValue) {
      if (gdelaifenloBuilder_ == null) {
        ensureGdelaifenloIsMutable();
        gdelaifenlo_.add(builderForValue.build());
        onChanged();
      } else {
        gdelaifenloBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public Builder addGdelaifenlo(
        int index, POGOProtos.Rpc.OGONFONKCIG.Builder builderForValue) {
      if (gdelaifenloBuilder_ == null) {
        ensureGdelaifenloIsMutable();
        gdelaifenlo_.add(index, builderForValue.build());
        onChanged();
      } else {
        gdelaifenloBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public Builder addAllGdelaifenlo(
        java.lang.Iterable<? extends POGOProtos.Rpc.OGONFONKCIG> values) {
      if (gdelaifenloBuilder_ == null) {
        ensureGdelaifenloIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, gdelaifenlo_);
        onChanged();
      } else {
        gdelaifenloBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public Builder clearGdelaifenlo() {
      if (gdelaifenloBuilder_ == null) {
        gdelaifenlo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        gdelaifenloBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public Builder removeGdelaifenlo(int index) {
      if (gdelaifenloBuilder_ == null) {
        ensureGdelaifenloIsMutable();
        gdelaifenlo_.remove(index);
        onChanged();
      } else {
        gdelaifenloBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public POGOProtos.Rpc.OGONFONKCIG.Builder getGdelaifenloBuilder(
        int index) {
      return getGdelaifenloFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public POGOProtos.Rpc.OGONFONKCIGOrBuilder getGdelaifenloOrBuilder(
        int index) {
      if (gdelaifenloBuilder_ == null) {
        return gdelaifenlo_.get(index);  } else {
        return gdelaifenloBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.OGONFONKCIGOrBuilder> 
         getGdelaifenloOrBuilderList() {
      if (gdelaifenloBuilder_ != null) {
        return gdelaifenloBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(gdelaifenlo_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public POGOProtos.Rpc.OGONFONKCIG.Builder addGdelaifenloBuilder() {
      return getGdelaifenloFieldBuilder().addBuilder(
          POGOProtos.Rpc.OGONFONKCIG.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public POGOProtos.Rpc.OGONFONKCIG.Builder addGdelaifenloBuilder(
        int index) {
      return getGdelaifenloFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.OGONFONKCIG.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.OGONFONKCIG gdelaifenlo = 2;</code>
     */
    public java.util.List<POGOProtos.Rpc.OGONFONKCIG.Builder> 
         getGdelaifenloBuilderList() {
      return getGdelaifenloFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.OGONFONKCIG, POGOProtos.Rpc.OGONFONKCIG.Builder, POGOProtos.Rpc.OGONFONKCIGOrBuilder> 
        getGdelaifenloFieldBuilder() {
      if (gdelaifenloBuilder_ == null) {
        gdelaifenloBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.OGONFONKCIG, POGOProtos.Rpc.OGONFONKCIG.Builder, POGOProtos.Rpc.OGONFONKCIGOrBuilder>(
                gdelaifenlo_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        gdelaifenlo_ = null;
      }
      return gdelaifenloBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FJNCEJBMEMK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FJNCEJBMEMK)
  private static final POGOProtos.Rpc.FJNCEJBMEMK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FJNCEJBMEMK();
  }

  public static POGOProtos.Rpc.FJNCEJBMEMK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FJNCEJBMEMK>
      PARSER = new com.google.protobuf.AbstractParser<FJNCEJBMEMK>() {
    @java.lang.Override
    public FJNCEJBMEMK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FJNCEJBMEMK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FJNCEJBMEMK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FJNCEJBMEMK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FJNCEJBMEMK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

