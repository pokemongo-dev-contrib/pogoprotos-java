// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CLFMAPFDIPP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.RaidTicketProto}
 */
public final class RaidTicketProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.RaidTicketProto)
    RaidTicketProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RaidTicketProto.newBuilder() to construct.
  private RaidTicketProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RaidTicketProto() {
    janonjmkhno_ = "";
    ekpohjfklal_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RaidTicketProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RaidTicketProto(
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

            janonjmkhno_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            ekpohjfklal_ = rawValue;
            break;
          }
          case 34: {
            POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo.Builder subBuilder = null;
            if (aoleolaciee_ != null) {
              subBuilder = aoleolaciee_.toBuilder();
            }
            aoleolaciee_ = input.readMessage(POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(aoleolaciee_);
              aoleolaciee_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RaidTicketProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RaidTicketProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.RaidTicketProto.class, POGOProtos.Rpc.RaidTicketProto.Builder.class);
  }

  public static final int JANONJMKHNO_FIELD_NUMBER = 1;
  private volatile java.lang.Object janonjmkhno_;
  /**
   * <code>string janonjmkhno = 1;</code>
   * @return The janonjmkhno.
   */
  @java.lang.Override
  public java.lang.String getJanonjmkhno() {
    java.lang.Object ref = janonjmkhno_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      janonjmkhno_ = s;
      return s;
    }
  }
  /**
   * <code>string janonjmkhno = 1;</code>
   * @return The bytes for janonjmkhno.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJanonjmkhnoBytes() {
    java.lang.Object ref = janonjmkhno_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      janonjmkhno_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EKPOHJFKLAL_FIELD_NUMBER = 2;
  private int ekpohjfklal_;
  /**
   * <code>.POGOProtos.Rpc.Item ekpohjfklal = 2;</code>
   * @return The enum numeric value on the wire for ekpohjfklal.
   */
  @java.lang.Override public int getEkpohjfklalValue() {
    return ekpohjfklal_;
  }
  /**
   * <code>.POGOProtos.Rpc.Item ekpohjfklal = 2;</code>
   * @return The ekpohjfklal.
   */
  @java.lang.Override public POGOProtos.Rpc.Item getEkpohjfklal() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(ekpohjfklal_);
    return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
  }

  public static final int AOLEOLACIEE_FIELD_NUMBER = 4;
  private POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee_;
  /**
   * <code>.POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee = 4;</code>
   * @return Whether the aoleolaciee field is set.
   */
  @java.lang.Override
  public boolean hasAoleolaciee() {
    return aoleolaciee_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee = 4;</code>
   * @return The aoleolaciee.
   */
  @java.lang.Override
  public POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo getAoleolaciee() {
    return aoleolaciee_ == null ? POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo.getDefaultInstance() : aoleolaciee_;
  }
  /**
   * <code>.POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.SharedExclusiveTicketTrainerInfoOrBuilder getAoleolacieeOrBuilder() {
    return getAoleolaciee();
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
    if (!getJanonjmkhnoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, janonjmkhno_);
    }
    if (ekpohjfklal_ != POGOProtos.Rpc.Item.ITEM_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(2, ekpohjfklal_);
    }
    if (aoleolaciee_ != null) {
      output.writeMessage(4, getAoleolaciee());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getJanonjmkhnoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, janonjmkhno_);
    }
    if (ekpohjfklal_ != POGOProtos.Rpc.Item.ITEM_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, ekpohjfklal_);
    }
    if (aoleolaciee_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAoleolaciee());
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
    if (!(obj instanceof POGOProtos.Rpc.RaidTicketProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.RaidTicketProto other = (POGOProtos.Rpc.RaidTicketProto) obj;

    if (!getJanonjmkhno()
        .equals(other.getJanonjmkhno())) return false;
    if (ekpohjfklal_ != other.ekpohjfklal_) return false;
    if (hasAoleolaciee() != other.hasAoleolaciee()) return false;
    if (hasAoleolaciee()) {
      if (!getAoleolaciee()
          .equals(other.getAoleolaciee())) return false;
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
    hash = (37 * hash) + JANONJMKHNO_FIELD_NUMBER;
    hash = (53 * hash) + getJanonjmkhno().hashCode();
    hash = (37 * hash) + EKPOHJFKLAL_FIELD_NUMBER;
    hash = (53 * hash) + ekpohjfklal_;
    if (hasAoleolaciee()) {
      hash = (37 * hash) + AOLEOLACIEE_FIELD_NUMBER;
      hash = (53 * hash) + getAoleolaciee().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.RaidTicketProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RaidTicketProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RaidTicketProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RaidTicketProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RaidTicketProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RaidTicketProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RaidTicketProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RaidTicketProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.RaidTicketProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RaidTicketProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.RaidTicketProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RaidTicketProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.RaidTicketProto prototype) {
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
   * ref: CLFMAPFDIPP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.RaidTicketProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.RaidTicketProto)
      POGOProtos.Rpc.RaidTicketProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RaidTicketProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RaidTicketProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.RaidTicketProto.class, POGOProtos.Rpc.RaidTicketProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.RaidTicketProto.newBuilder()
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
      janonjmkhno_ = "";

      ekpohjfklal_ = 0;

      if (aoleolacieeBuilder_ == null) {
        aoleolaciee_ = null;
      } else {
        aoleolaciee_ = null;
        aoleolacieeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RaidTicketProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.RaidTicketProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.RaidTicketProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.RaidTicketProto build() {
      POGOProtos.Rpc.RaidTicketProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.RaidTicketProto buildPartial() {
      POGOProtos.Rpc.RaidTicketProto result = new POGOProtos.Rpc.RaidTicketProto(this);
      result.janonjmkhno_ = janonjmkhno_;
      result.ekpohjfklal_ = ekpohjfklal_;
      if (aoleolacieeBuilder_ == null) {
        result.aoleolaciee_ = aoleolaciee_;
      } else {
        result.aoleolaciee_ = aoleolacieeBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.RaidTicketProto) {
        return mergeFrom((POGOProtos.Rpc.RaidTicketProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.RaidTicketProto other) {
      if (other == POGOProtos.Rpc.RaidTicketProto.getDefaultInstance()) return this;
      if (!other.getJanonjmkhno().isEmpty()) {
        janonjmkhno_ = other.janonjmkhno_;
        onChanged();
      }
      if (other.ekpohjfklal_ != 0) {
        setEkpohjfklalValue(other.getEkpohjfklalValue());
      }
      if (other.hasAoleolaciee()) {
        mergeAoleolaciee(other.getAoleolaciee());
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
      POGOProtos.Rpc.RaidTicketProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.RaidTicketProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object janonjmkhno_ = "";
    /**
     * <code>string janonjmkhno = 1;</code>
     * @return The janonjmkhno.
     */
    public java.lang.String getJanonjmkhno() {
      java.lang.Object ref = janonjmkhno_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        janonjmkhno_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string janonjmkhno = 1;</code>
     * @return The bytes for janonjmkhno.
     */
    public com.google.protobuf.ByteString
        getJanonjmkhnoBytes() {
      java.lang.Object ref = janonjmkhno_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        janonjmkhno_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string janonjmkhno = 1;</code>
     * @param value The janonjmkhno to set.
     * @return This builder for chaining.
     */
    public Builder setJanonjmkhno(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      janonjmkhno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string janonjmkhno = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJanonjmkhno() {
      
      janonjmkhno_ = getDefaultInstance().getJanonjmkhno();
      onChanged();
      return this;
    }
    /**
     * <code>string janonjmkhno = 1;</code>
     * @param value The bytes for janonjmkhno to set.
     * @return This builder for chaining.
     */
    public Builder setJanonjmkhnoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      janonjmkhno_ = value;
      onChanged();
      return this;
    }

    private int ekpohjfklal_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Item ekpohjfklal = 2;</code>
     * @return The enum numeric value on the wire for ekpohjfklal.
     */
    @java.lang.Override public int getEkpohjfklalValue() {
      return ekpohjfklal_;
    }
    /**
     * <code>.POGOProtos.Rpc.Item ekpohjfklal = 2;</code>
     * @param value The enum numeric value on the wire for ekpohjfklal to set.
     * @return This builder for chaining.
     */
    public Builder setEkpohjfklalValue(int value) {
      
      ekpohjfklal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item ekpohjfklal = 2;</code>
     * @return The ekpohjfklal.
     */
    @java.lang.Override
    public POGOProtos.Rpc.Item getEkpohjfklal() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(ekpohjfklal_);
      return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Item ekpohjfklal = 2;</code>
     * @param value The ekpohjfklal to set.
     * @return This builder for chaining.
     */
    public Builder setEkpohjfklal(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ekpohjfklal_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item ekpohjfklal = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEkpohjfklal() {
      
      ekpohjfklal_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo, POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo.Builder, POGOProtos.Rpc.SharedExclusiveTicketTrainerInfoOrBuilder> aoleolacieeBuilder_;
    /**
     * <code>.POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee = 4;</code>
     * @return Whether the aoleolaciee field is set.
     */
    public boolean hasAoleolaciee() {
      return aoleolacieeBuilder_ != null || aoleolaciee_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee = 4;</code>
     * @return The aoleolaciee.
     */
    public POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo getAoleolaciee() {
      if (aoleolacieeBuilder_ == null) {
        return aoleolaciee_ == null ? POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo.getDefaultInstance() : aoleolaciee_;
      } else {
        return aoleolacieeBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee = 4;</code>
     */
    public Builder setAoleolaciee(POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo value) {
      if (aoleolacieeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        aoleolaciee_ = value;
        onChanged();
      } else {
        aoleolacieeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee = 4;</code>
     */
    public Builder setAoleolaciee(
        POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo.Builder builderForValue) {
      if (aoleolacieeBuilder_ == null) {
        aoleolaciee_ = builderForValue.build();
        onChanged();
      } else {
        aoleolacieeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee = 4;</code>
     */
    public Builder mergeAoleolaciee(POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo value) {
      if (aoleolacieeBuilder_ == null) {
        if (aoleolaciee_ != null) {
          aoleolaciee_ =
            POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo.newBuilder(aoleolaciee_).mergeFrom(value).buildPartial();
        } else {
          aoleolaciee_ = value;
        }
        onChanged();
      } else {
        aoleolacieeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee = 4;</code>
     */
    public Builder clearAoleolaciee() {
      if (aoleolacieeBuilder_ == null) {
        aoleolaciee_ = null;
        onChanged();
      } else {
        aoleolaciee_ = null;
        aoleolacieeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee = 4;</code>
     */
    public POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo.Builder getAoleolacieeBuilder() {
      
      onChanged();
      return getAoleolacieeFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee = 4;</code>
     */
    public POGOProtos.Rpc.SharedExclusiveTicketTrainerInfoOrBuilder getAoleolacieeOrBuilder() {
      if (aoleolacieeBuilder_ != null) {
        return aoleolacieeBuilder_.getMessageOrBuilder();
      } else {
        return aoleolaciee_ == null ?
            POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo.getDefaultInstance() : aoleolaciee_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo aoleolaciee = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo, POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo.Builder, POGOProtos.Rpc.SharedExclusiveTicketTrainerInfoOrBuilder> 
        getAoleolacieeFieldBuilder() {
      if (aoleolacieeBuilder_ == null) {
        aoleolacieeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo, POGOProtos.Rpc.SharedExclusiveTicketTrainerInfo.Builder, POGOProtos.Rpc.SharedExclusiveTicketTrainerInfoOrBuilder>(
                getAoleolaciee(),
                getParentForChildren(),
                isClean());
        aoleolaciee_ = null;
      }
      return aoleolacieeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.RaidTicketProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.RaidTicketProto)
  private static final POGOProtos.Rpc.RaidTicketProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.RaidTicketProto();
  }

  public static POGOProtos.Rpc.RaidTicketProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RaidTicketProto>
      PARSER = new com.google.protobuf.AbstractParser<RaidTicketProto>() {
    @java.lang.Override
    public RaidTicketProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RaidTicketProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RaidTicketProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RaidTicketProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.RaidTicketProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

