// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.AIPPNGJEHMP}
 */
public  final class AIPPNGJEHMP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AIPPNGJEHMP)
    AIPPNGJEHMPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AIPPNGJEHMP.newBuilder() to construct.
  private AIPPNGJEHMP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AIPPNGJEHMP() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AIPPNGJEHMP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AIPPNGJEHMP(
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
            POGOProtos.Rpc.DPPGCJEDIGN.Builder subBuilder = null;
            if (odghmpbhhol_ != null) {
              subBuilder = odghmpbhhol_.toBuilder();
            }
            odghmpbhhol_ = input.readMessage(POGOProtos.Rpc.DPPGCJEDIGN.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(odghmpbhhol_);
              odghmpbhhol_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            POGOProtos.Rpc.JMFCJOMHILG.Builder subBuilder = null;
            if (ngjekpojcpo_ != null) {
              subBuilder = ngjekpojcpo_.toBuilder();
            }
            ngjekpojcpo_ = input.readMessage(POGOProtos.Rpc.JMFCJOMHILG.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ngjekpojcpo_);
              ngjekpojcpo_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AIPPNGJEHMP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AIPPNGJEHMP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AIPPNGJEHMP.class, POGOProtos.Rpc.AIPPNGJEHMP.Builder.class);
  }

  public static final int ODGHMPBHHOL_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol_;
  /**
   * <code>.POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol = 1;</code>
   * @return Whether the odghmpbhhol field is set.
   */
  public boolean hasOdghmpbhhol() {
    return odghmpbhhol_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol = 1;</code>
   * @return The odghmpbhhol.
   */
  public POGOProtos.Rpc.DPPGCJEDIGN getOdghmpbhhol() {
    return odghmpbhhol_ == null ? POGOProtos.Rpc.DPPGCJEDIGN.getDefaultInstance() : odghmpbhhol_;
  }
  /**
   * <code>.POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol = 1;</code>
   */
  public POGOProtos.Rpc.DPPGCJEDIGNOrBuilder getOdghmpbhholOrBuilder() {
    return getOdghmpbhhol();
  }

  public static final int NGJEKPOJCPO_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo_;
  /**
   * <code>.POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo = 2;</code>
   * @return Whether the ngjekpojcpo field is set.
   */
  public boolean hasNgjekpojcpo() {
    return ngjekpojcpo_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo = 2;</code>
   * @return The ngjekpojcpo.
   */
  public POGOProtos.Rpc.JMFCJOMHILG getNgjekpojcpo() {
    return ngjekpojcpo_ == null ? POGOProtos.Rpc.JMFCJOMHILG.getDefaultInstance() : ngjekpojcpo_;
  }
  /**
   * <code>.POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo = 2;</code>
   */
  public POGOProtos.Rpc.JMFCJOMHILGOrBuilder getNgjekpojcpoOrBuilder() {
    return getNgjekpojcpo();
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
    if (odghmpbhhol_ != null) {
      output.writeMessage(1, getOdghmpbhhol());
    }
    if (ngjekpojcpo_ != null) {
      output.writeMessage(2, getNgjekpojcpo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (odghmpbhhol_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOdghmpbhhol());
    }
    if (ngjekpojcpo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNgjekpojcpo());
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
    if (!(obj instanceof POGOProtos.Rpc.AIPPNGJEHMP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AIPPNGJEHMP other = (POGOProtos.Rpc.AIPPNGJEHMP) obj;

    if (hasOdghmpbhhol() != other.hasOdghmpbhhol()) return false;
    if (hasOdghmpbhhol()) {
      if (!getOdghmpbhhol()
          .equals(other.getOdghmpbhhol())) return false;
    }
    if (hasNgjekpojcpo() != other.hasNgjekpojcpo()) return false;
    if (hasNgjekpojcpo()) {
      if (!getNgjekpojcpo()
          .equals(other.getNgjekpojcpo())) return false;
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
    if (hasOdghmpbhhol()) {
      hash = (37 * hash) + ODGHMPBHHOL_FIELD_NUMBER;
      hash = (53 * hash) + getOdghmpbhhol().hashCode();
    }
    if (hasNgjekpojcpo()) {
      hash = (37 * hash) + NGJEKPOJCPO_FIELD_NUMBER;
      hash = (53 * hash) + getNgjekpojcpo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AIPPNGJEHMP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AIPPNGJEHMP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AIPPNGJEHMP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AIPPNGJEHMP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AIPPNGJEHMP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AIPPNGJEHMP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AIPPNGJEHMP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AIPPNGJEHMP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AIPPNGJEHMP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AIPPNGJEHMP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AIPPNGJEHMP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AIPPNGJEHMP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AIPPNGJEHMP prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.AIPPNGJEHMP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AIPPNGJEHMP)
      POGOProtos.Rpc.AIPPNGJEHMPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AIPPNGJEHMP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AIPPNGJEHMP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AIPPNGJEHMP.class, POGOProtos.Rpc.AIPPNGJEHMP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AIPPNGJEHMP.newBuilder()
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
      if (odghmpbhholBuilder_ == null) {
        odghmpbhhol_ = null;
      } else {
        odghmpbhhol_ = null;
        odghmpbhholBuilder_ = null;
      }
      if (ngjekpojcpoBuilder_ == null) {
        ngjekpojcpo_ = null;
      } else {
        ngjekpojcpo_ = null;
        ngjekpojcpoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AIPPNGJEHMP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AIPPNGJEHMP getDefaultInstanceForType() {
      return POGOProtos.Rpc.AIPPNGJEHMP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AIPPNGJEHMP build() {
      POGOProtos.Rpc.AIPPNGJEHMP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AIPPNGJEHMP buildPartial() {
      POGOProtos.Rpc.AIPPNGJEHMP result = new POGOProtos.Rpc.AIPPNGJEHMP(this);
      if (odghmpbhholBuilder_ == null) {
        result.odghmpbhhol_ = odghmpbhhol_;
      } else {
        result.odghmpbhhol_ = odghmpbhholBuilder_.build();
      }
      if (ngjekpojcpoBuilder_ == null) {
        result.ngjekpojcpo_ = ngjekpojcpo_;
      } else {
        result.ngjekpojcpo_ = ngjekpojcpoBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.AIPPNGJEHMP) {
        return mergeFrom((POGOProtos.Rpc.AIPPNGJEHMP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AIPPNGJEHMP other) {
      if (other == POGOProtos.Rpc.AIPPNGJEHMP.getDefaultInstance()) return this;
      if (other.hasOdghmpbhhol()) {
        mergeOdghmpbhhol(other.getOdghmpbhhol());
      }
      if (other.hasNgjekpojcpo()) {
        mergeNgjekpojcpo(other.getNgjekpojcpo());
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
      POGOProtos.Rpc.AIPPNGJEHMP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AIPPNGJEHMP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.DPPGCJEDIGN, POGOProtos.Rpc.DPPGCJEDIGN.Builder, POGOProtos.Rpc.DPPGCJEDIGNOrBuilder> odghmpbhholBuilder_;
    /**
     * <code>.POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol = 1;</code>
     * @return Whether the odghmpbhhol field is set.
     */
    public boolean hasOdghmpbhhol() {
      return odghmpbhholBuilder_ != null || odghmpbhhol_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol = 1;</code>
     * @return The odghmpbhhol.
     */
    public POGOProtos.Rpc.DPPGCJEDIGN getOdghmpbhhol() {
      if (odghmpbhholBuilder_ == null) {
        return odghmpbhhol_ == null ? POGOProtos.Rpc.DPPGCJEDIGN.getDefaultInstance() : odghmpbhhol_;
      } else {
        return odghmpbhholBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol = 1;</code>
     */
    public Builder setOdghmpbhhol(POGOProtos.Rpc.DPPGCJEDIGN value) {
      if (odghmpbhholBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        odghmpbhhol_ = value;
        onChanged();
      } else {
        odghmpbhholBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol = 1;</code>
     */
    public Builder setOdghmpbhhol(
        POGOProtos.Rpc.DPPGCJEDIGN.Builder builderForValue) {
      if (odghmpbhholBuilder_ == null) {
        odghmpbhhol_ = builderForValue.build();
        onChanged();
      } else {
        odghmpbhholBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol = 1;</code>
     */
    public Builder mergeOdghmpbhhol(POGOProtos.Rpc.DPPGCJEDIGN value) {
      if (odghmpbhholBuilder_ == null) {
        if (odghmpbhhol_ != null) {
          odghmpbhhol_ =
            POGOProtos.Rpc.DPPGCJEDIGN.newBuilder(odghmpbhhol_).mergeFrom(value).buildPartial();
        } else {
          odghmpbhhol_ = value;
        }
        onChanged();
      } else {
        odghmpbhholBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol = 1;</code>
     */
    public Builder clearOdghmpbhhol() {
      if (odghmpbhholBuilder_ == null) {
        odghmpbhhol_ = null;
        onChanged();
      } else {
        odghmpbhhol_ = null;
        odghmpbhholBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol = 1;</code>
     */
    public POGOProtos.Rpc.DPPGCJEDIGN.Builder getOdghmpbhholBuilder() {
      
      onChanged();
      return getOdghmpbhholFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol = 1;</code>
     */
    public POGOProtos.Rpc.DPPGCJEDIGNOrBuilder getOdghmpbhholOrBuilder() {
      if (odghmpbhholBuilder_ != null) {
        return odghmpbhholBuilder_.getMessageOrBuilder();
      } else {
        return odghmpbhhol_ == null ?
            POGOProtos.Rpc.DPPGCJEDIGN.getDefaultInstance() : odghmpbhhol_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.DPPGCJEDIGN odghmpbhhol = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.DPPGCJEDIGN, POGOProtos.Rpc.DPPGCJEDIGN.Builder, POGOProtos.Rpc.DPPGCJEDIGNOrBuilder> 
        getOdghmpbhholFieldBuilder() {
      if (odghmpbhholBuilder_ == null) {
        odghmpbhholBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.DPPGCJEDIGN, POGOProtos.Rpc.DPPGCJEDIGN.Builder, POGOProtos.Rpc.DPPGCJEDIGNOrBuilder>(
                getOdghmpbhhol(),
                getParentForChildren(),
                isClean());
        odghmpbhhol_ = null;
      }
      return odghmpbhholBuilder_;
    }

    private POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.JMFCJOMHILG, POGOProtos.Rpc.JMFCJOMHILG.Builder, POGOProtos.Rpc.JMFCJOMHILGOrBuilder> ngjekpojcpoBuilder_;
    /**
     * <code>.POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo = 2;</code>
     * @return Whether the ngjekpojcpo field is set.
     */
    public boolean hasNgjekpojcpo() {
      return ngjekpojcpoBuilder_ != null || ngjekpojcpo_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo = 2;</code>
     * @return The ngjekpojcpo.
     */
    public POGOProtos.Rpc.JMFCJOMHILG getNgjekpojcpo() {
      if (ngjekpojcpoBuilder_ == null) {
        return ngjekpojcpo_ == null ? POGOProtos.Rpc.JMFCJOMHILG.getDefaultInstance() : ngjekpojcpo_;
      } else {
        return ngjekpojcpoBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo = 2;</code>
     */
    public Builder setNgjekpojcpo(POGOProtos.Rpc.JMFCJOMHILG value) {
      if (ngjekpojcpoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ngjekpojcpo_ = value;
        onChanged();
      } else {
        ngjekpojcpoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo = 2;</code>
     */
    public Builder setNgjekpojcpo(
        POGOProtos.Rpc.JMFCJOMHILG.Builder builderForValue) {
      if (ngjekpojcpoBuilder_ == null) {
        ngjekpojcpo_ = builderForValue.build();
        onChanged();
      } else {
        ngjekpojcpoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo = 2;</code>
     */
    public Builder mergeNgjekpojcpo(POGOProtos.Rpc.JMFCJOMHILG value) {
      if (ngjekpojcpoBuilder_ == null) {
        if (ngjekpojcpo_ != null) {
          ngjekpojcpo_ =
            POGOProtos.Rpc.JMFCJOMHILG.newBuilder(ngjekpojcpo_).mergeFrom(value).buildPartial();
        } else {
          ngjekpojcpo_ = value;
        }
        onChanged();
      } else {
        ngjekpojcpoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo = 2;</code>
     */
    public Builder clearNgjekpojcpo() {
      if (ngjekpojcpoBuilder_ == null) {
        ngjekpojcpo_ = null;
        onChanged();
      } else {
        ngjekpojcpo_ = null;
        ngjekpojcpoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo = 2;</code>
     */
    public POGOProtos.Rpc.JMFCJOMHILG.Builder getNgjekpojcpoBuilder() {
      
      onChanged();
      return getNgjekpojcpoFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo = 2;</code>
     */
    public POGOProtos.Rpc.JMFCJOMHILGOrBuilder getNgjekpojcpoOrBuilder() {
      if (ngjekpojcpoBuilder_ != null) {
        return ngjekpojcpoBuilder_.getMessageOrBuilder();
      } else {
        return ngjekpojcpo_ == null ?
            POGOProtos.Rpc.JMFCJOMHILG.getDefaultInstance() : ngjekpojcpo_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.JMFCJOMHILG ngjekpojcpo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.JMFCJOMHILG, POGOProtos.Rpc.JMFCJOMHILG.Builder, POGOProtos.Rpc.JMFCJOMHILGOrBuilder> 
        getNgjekpojcpoFieldBuilder() {
      if (ngjekpojcpoBuilder_ == null) {
        ngjekpojcpoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.JMFCJOMHILG, POGOProtos.Rpc.JMFCJOMHILG.Builder, POGOProtos.Rpc.JMFCJOMHILGOrBuilder>(
                getNgjekpojcpo(),
                getParentForChildren(),
                isClean());
        ngjekpojcpo_ = null;
      }
      return ngjekpojcpoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AIPPNGJEHMP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AIPPNGJEHMP)
  private static final POGOProtos.Rpc.AIPPNGJEHMP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AIPPNGJEHMP();
  }

  public static POGOProtos.Rpc.AIPPNGJEHMP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AIPPNGJEHMP>
      PARSER = new com.google.protobuf.AbstractParser<AIPPNGJEHMP>() {
    @java.lang.Override
    public AIPPNGJEHMP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AIPPNGJEHMP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AIPPNGJEHMP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AIPPNGJEHMP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AIPPNGJEHMP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

