// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BMPNOJLNMKE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BMPNOJLNMKE}
 */
public final class BMPNOJLNMKE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BMPNOJLNMKE)
    BMPNOJLNMKEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BMPNOJLNMKE.newBuilder() to construct.
  private BMPNOJLNMKE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BMPNOJLNMKE() {
    oiedebkalie_ = 0;
    emanpefijpm_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BMPNOJLNMKE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BMPNOJLNMKE(
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

            oiedebkalie_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            emanpefijpm_ = rawValue;
            break;
          }
          case 24: {

            ehmhioegndc_ = input.readInt64();
            break;
          }
          case 32: {

            kmgacehpmof_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BMPNOJLNMKE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BMPNOJLNMKE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BMPNOJLNMKE.class, POGOProtos.Rpc.BMPNOJLNMKE.Builder.class);
  }

  public static final int OIEDEBKALIE_FIELD_NUMBER = 1;
  private int oiedebkalie_;
  /**
   * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
   * @return The enum numeric value on the wire for oiedebkalie.
   */
  @java.lang.Override public int getOiedebkalieValue() {
    return oiedebkalie_;
  }
  /**
   * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
   * @return The oiedebkalie.
   */
  @java.lang.Override public POGOProtos.Rpc.GOCBJFKKCCF getOiedebkalie() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GOCBJFKKCCF result = POGOProtos.Rpc.GOCBJFKKCCF.valueOf(oiedebkalie_);
    return result == null ? POGOProtos.Rpc.GOCBJFKKCCF.UNRECOGNIZED : result;
  }

  public static final int EMANPEFIJPM_FIELD_NUMBER = 2;
  private int emanpefijpm_;
  /**
   * <code>.POGOProtos.Rpc.FFKJPEAEBLD emanpefijpm = 2;</code>
   * @return The enum numeric value on the wire for emanpefijpm.
   */
  @java.lang.Override public int getEmanpefijpmValue() {
    return emanpefijpm_;
  }
  /**
   * <code>.POGOProtos.Rpc.FFKJPEAEBLD emanpefijpm = 2;</code>
   * @return The emanpefijpm.
   */
  @java.lang.Override public POGOProtos.Rpc.FFKJPEAEBLD getEmanpefijpm() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FFKJPEAEBLD result = POGOProtos.Rpc.FFKJPEAEBLD.valueOf(emanpefijpm_);
    return result == null ? POGOProtos.Rpc.FFKJPEAEBLD.UNRECOGNIZED : result;
  }

  public static final int EHMHIOEGNDC_FIELD_NUMBER = 3;
  private long ehmhioegndc_;
  /**
   * <code>int64 ehmhioegndc = 3;</code>
   * @return The ehmhioegndc.
   */
  @java.lang.Override
  public long getEhmhioegndc() {
    return ehmhioegndc_;
  }

  public static final int KMGACEHPMOF_FIELD_NUMBER = 4;
  private long kmgacehpmof_;
  /**
   * <code>int64 kmgacehpmof = 4;</code>
   * @return The kmgacehpmof.
   */
  @java.lang.Override
  public long getKmgacehpmof() {
    return kmgacehpmof_;
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
    if (oiedebkalie_ != POGOProtos.Rpc.GOCBJFKKCCF.GOCBJFKKCCF_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(1, oiedebkalie_);
    }
    if (emanpefijpm_ != POGOProtos.Rpc.FFKJPEAEBLD.FFKJPEAEBLD_ITEM_TYPE_NONE.getNumber()) {
      output.writeEnum(2, emanpefijpm_);
    }
    if (ehmhioegndc_ != 0L) {
      output.writeInt64(3, ehmhioegndc_);
    }
    if (kmgacehpmof_ != 0L) {
      output.writeInt64(4, kmgacehpmof_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oiedebkalie_ != POGOProtos.Rpc.GOCBJFKKCCF.GOCBJFKKCCF_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, oiedebkalie_);
    }
    if (emanpefijpm_ != POGOProtos.Rpc.FFKJPEAEBLD.FFKJPEAEBLD_ITEM_TYPE_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, emanpefijpm_);
    }
    if (ehmhioegndc_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, ehmhioegndc_);
    }
    if (kmgacehpmof_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, kmgacehpmof_);
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
    if (!(obj instanceof POGOProtos.Rpc.BMPNOJLNMKE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BMPNOJLNMKE other = (POGOProtos.Rpc.BMPNOJLNMKE) obj;

    if (oiedebkalie_ != other.oiedebkalie_) return false;
    if (emanpefijpm_ != other.emanpefijpm_) return false;
    if (getEhmhioegndc()
        != other.getEhmhioegndc()) return false;
    if (getKmgacehpmof()
        != other.getKmgacehpmof()) return false;
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
    hash = (37 * hash) + OIEDEBKALIE_FIELD_NUMBER;
    hash = (53 * hash) + oiedebkalie_;
    hash = (37 * hash) + EMANPEFIJPM_FIELD_NUMBER;
    hash = (53 * hash) + emanpefijpm_;
    hash = (37 * hash) + EHMHIOEGNDC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEhmhioegndc());
    hash = (37 * hash) + KMGACEHPMOF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getKmgacehpmof());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BMPNOJLNMKE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BMPNOJLNMKE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BMPNOJLNMKE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BMPNOJLNMKE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BMPNOJLNMKE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BMPNOJLNMKE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BMPNOJLNMKE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BMPNOJLNMKE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BMPNOJLNMKE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BMPNOJLNMKE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BMPNOJLNMKE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BMPNOJLNMKE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BMPNOJLNMKE prototype) {
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
   * ref: BMPNOJLNMKE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BMPNOJLNMKE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BMPNOJLNMKE)
      POGOProtos.Rpc.BMPNOJLNMKEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BMPNOJLNMKE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BMPNOJLNMKE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BMPNOJLNMKE.class, POGOProtos.Rpc.BMPNOJLNMKE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BMPNOJLNMKE.newBuilder()
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
      oiedebkalie_ = 0;

      emanpefijpm_ = 0;

      ehmhioegndc_ = 0L;

      kmgacehpmof_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BMPNOJLNMKE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BMPNOJLNMKE getDefaultInstanceForType() {
      return POGOProtos.Rpc.BMPNOJLNMKE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BMPNOJLNMKE build() {
      POGOProtos.Rpc.BMPNOJLNMKE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BMPNOJLNMKE buildPartial() {
      POGOProtos.Rpc.BMPNOJLNMKE result = new POGOProtos.Rpc.BMPNOJLNMKE(this);
      result.oiedebkalie_ = oiedebkalie_;
      result.emanpefijpm_ = emanpefijpm_;
      result.ehmhioegndc_ = ehmhioegndc_;
      result.kmgacehpmof_ = kmgacehpmof_;
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
      if (other instanceof POGOProtos.Rpc.BMPNOJLNMKE) {
        return mergeFrom((POGOProtos.Rpc.BMPNOJLNMKE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BMPNOJLNMKE other) {
      if (other == POGOProtos.Rpc.BMPNOJLNMKE.getDefaultInstance()) return this;
      if (other.oiedebkalie_ != 0) {
        setOiedebkalieValue(other.getOiedebkalieValue());
      }
      if (other.emanpefijpm_ != 0) {
        setEmanpefijpmValue(other.getEmanpefijpmValue());
      }
      if (other.getEhmhioegndc() != 0L) {
        setEhmhioegndc(other.getEhmhioegndc());
      }
      if (other.getKmgacehpmof() != 0L) {
        setKmgacehpmof(other.getKmgacehpmof());
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
      POGOProtos.Rpc.BMPNOJLNMKE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BMPNOJLNMKE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int oiedebkalie_ = 0;
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
     * @return The enum numeric value on the wire for oiedebkalie.
     */
    @java.lang.Override public int getOiedebkalieValue() {
      return oiedebkalie_;
    }
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
     * @param value The enum numeric value on the wire for oiedebkalie to set.
     * @return This builder for chaining.
     */
    public Builder setOiedebkalieValue(int value) {
      
      oiedebkalie_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
     * @return The oiedebkalie.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GOCBJFKKCCF getOiedebkalie() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GOCBJFKKCCF result = POGOProtos.Rpc.GOCBJFKKCCF.valueOf(oiedebkalie_);
      return result == null ? POGOProtos.Rpc.GOCBJFKKCCF.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
     * @param value The oiedebkalie to set.
     * @return This builder for chaining.
     */
    public Builder setOiedebkalie(POGOProtos.Rpc.GOCBJFKKCCF value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      oiedebkalie_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GOCBJFKKCCF oiedebkalie = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOiedebkalie() {
      
      oiedebkalie_ = 0;
      onChanged();
      return this;
    }

    private int emanpefijpm_ = 0;
    /**
     * <code>.POGOProtos.Rpc.FFKJPEAEBLD emanpefijpm = 2;</code>
     * @return The enum numeric value on the wire for emanpefijpm.
     */
    @java.lang.Override public int getEmanpefijpmValue() {
      return emanpefijpm_;
    }
    /**
     * <code>.POGOProtos.Rpc.FFKJPEAEBLD emanpefijpm = 2;</code>
     * @param value The enum numeric value on the wire for emanpefijpm to set.
     * @return This builder for chaining.
     */
    public Builder setEmanpefijpmValue(int value) {
      
      emanpefijpm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFKJPEAEBLD emanpefijpm = 2;</code>
     * @return The emanpefijpm.
     */
    @java.lang.Override
    public POGOProtos.Rpc.FFKJPEAEBLD getEmanpefijpm() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FFKJPEAEBLD result = POGOProtos.Rpc.FFKJPEAEBLD.valueOf(emanpefijpm_);
      return result == null ? POGOProtos.Rpc.FFKJPEAEBLD.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FFKJPEAEBLD emanpefijpm = 2;</code>
     * @param value The emanpefijpm to set.
     * @return This builder for chaining.
     */
    public Builder setEmanpefijpm(POGOProtos.Rpc.FFKJPEAEBLD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      emanpefijpm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FFKJPEAEBLD emanpefijpm = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmanpefijpm() {
      
      emanpefijpm_ = 0;
      onChanged();
      return this;
    }

    private long ehmhioegndc_ ;
    /**
     * <code>int64 ehmhioegndc = 3;</code>
     * @return The ehmhioegndc.
     */
    @java.lang.Override
    public long getEhmhioegndc() {
      return ehmhioegndc_;
    }
    /**
     * <code>int64 ehmhioegndc = 3;</code>
     * @param value The ehmhioegndc to set.
     * @return This builder for chaining.
     */
    public Builder setEhmhioegndc(long value) {
      
      ehmhioegndc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ehmhioegndc = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEhmhioegndc() {
      
      ehmhioegndc_ = 0L;
      onChanged();
      return this;
    }

    private long kmgacehpmof_ ;
    /**
     * <code>int64 kmgacehpmof = 4;</code>
     * @return The kmgacehpmof.
     */
    @java.lang.Override
    public long getKmgacehpmof() {
      return kmgacehpmof_;
    }
    /**
     * <code>int64 kmgacehpmof = 4;</code>
     * @param value The kmgacehpmof to set.
     * @return This builder for chaining.
     */
    public Builder setKmgacehpmof(long value) {
      
      kmgacehpmof_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 kmgacehpmof = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKmgacehpmof() {
      
      kmgacehpmof_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BMPNOJLNMKE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BMPNOJLNMKE)
  private static final POGOProtos.Rpc.BMPNOJLNMKE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BMPNOJLNMKE();
  }

  public static POGOProtos.Rpc.BMPNOJLNMKE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BMPNOJLNMKE>
      PARSER = new com.google.protobuf.AbstractParser<BMPNOJLNMKE>() {
    @java.lang.Override
    public BMPNOJLNMKE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BMPNOJLNMKE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BMPNOJLNMKE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BMPNOJLNMKE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BMPNOJLNMKE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

