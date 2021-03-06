// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CombatSeasonResult}
 */
public final class CombatSeasonResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CombatSeasonResult)
    CombatSeasonResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombatSeasonResult.newBuilder() to construct.
  private CombatSeasonResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombatSeasonResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CombatSeasonResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombatSeasonResult(
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

            season_ = input.readInt32();
            break;
          }
          case 16: {

            rank_ = input.readInt32();
            break;
          }
          case 24: {

            totalBattles_ = input.readInt32();
            break;
          }
          case 32: {

            totalWins_ = input.readInt32();
            break;
          }
          case 45: {

            rating_ = input.readFloat();
            break;
          }
          case 48: {

            longestWinStreak_ = input.readInt32();
            break;
          }
          case 56: {

            currentStreak_ = input.readInt32();
            break;
          }
          case 64: {

            stardustEarned_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatSeasonResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatSeasonResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CombatSeasonResult.class, POGOProtos.Rpc.CombatSeasonResult.Builder.class);
  }

  public static final int SEASON_FIELD_NUMBER = 1;
  private int season_;
  /**
   * <code>int32 season = 1;</code>
   * @return The season.
   */
  @java.lang.Override
  public int getSeason() {
    return season_;
  }

  public static final int RANK_FIELD_NUMBER = 2;
  private int rank_;
  /**
   * <code>int32 rank = 2;</code>
   * @return The rank.
   */
  @java.lang.Override
  public int getRank() {
    return rank_;
  }

  public static final int TOTAL_BATTLES_FIELD_NUMBER = 3;
  private int totalBattles_;
  /**
   * <code>int32 total_battles = 3;</code>
   * @return The totalBattles.
   */
  @java.lang.Override
  public int getTotalBattles() {
    return totalBattles_;
  }

  public static final int TOTAL_WINS_FIELD_NUMBER = 4;
  private int totalWins_;
  /**
   * <code>int32 total_wins = 4;</code>
   * @return The totalWins.
   */
  @java.lang.Override
  public int getTotalWins() {
    return totalWins_;
  }

  public static final int RATING_FIELD_NUMBER = 5;
  private float rating_;
  /**
   * <code>float rating = 5;</code>
   * @return The rating.
   */
  @java.lang.Override
  public float getRating() {
    return rating_;
  }

  public static final int LONGEST_WIN_STREAK_FIELD_NUMBER = 6;
  private int longestWinStreak_;
  /**
   * <code>int32 longest_win_streak = 6;</code>
   * @return The longestWinStreak.
   */
  @java.lang.Override
  public int getLongestWinStreak() {
    return longestWinStreak_;
  }

  public static final int CURRENT_STREAK_FIELD_NUMBER = 7;
  private int currentStreak_;
  /**
   * <code>int32 current_streak = 7;</code>
   * @return The currentStreak.
   */
  @java.lang.Override
  public int getCurrentStreak() {
    return currentStreak_;
  }

  public static final int STARDUST_EARNED_FIELD_NUMBER = 8;
  private long stardustEarned_;
  /**
   * <code>int64 stardust_earned = 8;</code>
   * @return The stardustEarned.
   */
  @java.lang.Override
  public long getStardustEarned() {
    return stardustEarned_;
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
    if (season_ != 0) {
      output.writeInt32(1, season_);
    }
    if (rank_ != 0) {
      output.writeInt32(2, rank_);
    }
    if (totalBattles_ != 0) {
      output.writeInt32(3, totalBattles_);
    }
    if (totalWins_ != 0) {
      output.writeInt32(4, totalWins_);
    }
    if (rating_ != 0F) {
      output.writeFloat(5, rating_);
    }
    if (longestWinStreak_ != 0) {
      output.writeInt32(6, longestWinStreak_);
    }
    if (currentStreak_ != 0) {
      output.writeInt32(7, currentStreak_);
    }
    if (stardustEarned_ != 0L) {
      output.writeInt64(8, stardustEarned_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (season_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, season_);
    }
    if (rank_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, rank_);
    }
    if (totalBattles_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, totalBattles_);
    }
    if (totalWins_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, totalWins_);
    }
    if (rating_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, rating_);
    }
    if (longestWinStreak_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, longestWinStreak_);
    }
    if (currentStreak_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, currentStreak_);
    }
    if (stardustEarned_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, stardustEarned_);
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
    if (!(obj instanceof POGOProtos.Rpc.CombatSeasonResult)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CombatSeasonResult other = (POGOProtos.Rpc.CombatSeasonResult) obj;

    if (getSeason()
        != other.getSeason()) return false;
    if (getRank()
        != other.getRank()) return false;
    if (getTotalBattles()
        != other.getTotalBattles()) return false;
    if (getTotalWins()
        != other.getTotalWins()) return false;
    if (java.lang.Float.floatToIntBits(getRating())
        != java.lang.Float.floatToIntBits(
            other.getRating())) return false;
    if (getLongestWinStreak()
        != other.getLongestWinStreak()) return false;
    if (getCurrentStreak()
        != other.getCurrentStreak()) return false;
    if (getStardustEarned()
        != other.getStardustEarned()) return false;
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
    hash = (37 * hash) + SEASON_FIELD_NUMBER;
    hash = (53 * hash) + getSeason();
    hash = (37 * hash) + RANK_FIELD_NUMBER;
    hash = (53 * hash) + getRank();
    hash = (37 * hash) + TOTAL_BATTLES_FIELD_NUMBER;
    hash = (53 * hash) + getTotalBattles();
    hash = (37 * hash) + TOTAL_WINS_FIELD_NUMBER;
    hash = (53 * hash) + getTotalWins();
    hash = (37 * hash) + RATING_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRating());
    hash = (37 * hash) + LONGEST_WIN_STREAK_FIELD_NUMBER;
    hash = (53 * hash) + getLongestWinStreak();
    hash = (37 * hash) + CURRENT_STREAK_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentStreak();
    hash = (37 * hash) + STARDUST_EARNED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStardustEarned());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CombatSeasonResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CombatSeasonResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatSeasonResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CombatSeasonResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatSeasonResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CombatSeasonResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatSeasonResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CombatSeasonResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatSeasonResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CombatSeasonResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatSeasonResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CombatSeasonResult parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CombatSeasonResult prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CombatSeasonResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CombatSeasonResult)
      POGOProtos.Rpc.CombatSeasonResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatSeasonResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatSeasonResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CombatSeasonResult.class, POGOProtos.Rpc.CombatSeasonResult.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CombatSeasonResult.newBuilder()
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
      season_ = 0;

      rank_ = 0;

      totalBattles_ = 0;

      totalWins_ = 0;

      rating_ = 0F;

      longestWinStreak_ = 0;

      currentStreak_ = 0;

      stardustEarned_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatSeasonResult_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CombatSeasonResult getDefaultInstanceForType() {
      return POGOProtos.Rpc.CombatSeasonResult.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CombatSeasonResult build() {
      POGOProtos.Rpc.CombatSeasonResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CombatSeasonResult buildPartial() {
      POGOProtos.Rpc.CombatSeasonResult result = new POGOProtos.Rpc.CombatSeasonResult(this);
      result.season_ = season_;
      result.rank_ = rank_;
      result.totalBattles_ = totalBattles_;
      result.totalWins_ = totalWins_;
      result.rating_ = rating_;
      result.longestWinStreak_ = longestWinStreak_;
      result.currentStreak_ = currentStreak_;
      result.stardustEarned_ = stardustEarned_;
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
      if (other instanceof POGOProtos.Rpc.CombatSeasonResult) {
        return mergeFrom((POGOProtos.Rpc.CombatSeasonResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CombatSeasonResult other) {
      if (other == POGOProtos.Rpc.CombatSeasonResult.getDefaultInstance()) return this;
      if (other.getSeason() != 0) {
        setSeason(other.getSeason());
      }
      if (other.getRank() != 0) {
        setRank(other.getRank());
      }
      if (other.getTotalBattles() != 0) {
        setTotalBattles(other.getTotalBattles());
      }
      if (other.getTotalWins() != 0) {
        setTotalWins(other.getTotalWins());
      }
      if (other.getRating() != 0F) {
        setRating(other.getRating());
      }
      if (other.getLongestWinStreak() != 0) {
        setLongestWinStreak(other.getLongestWinStreak());
      }
      if (other.getCurrentStreak() != 0) {
        setCurrentStreak(other.getCurrentStreak());
      }
      if (other.getStardustEarned() != 0L) {
        setStardustEarned(other.getStardustEarned());
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
      POGOProtos.Rpc.CombatSeasonResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CombatSeasonResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int season_ ;
    /**
     * <code>int32 season = 1;</code>
     * @return The season.
     */
    @java.lang.Override
    public int getSeason() {
      return season_;
    }
    /**
     * <code>int32 season = 1;</code>
     * @param value The season to set.
     * @return This builder for chaining.
     */
    public Builder setSeason(int value) {
      
      season_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 season = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeason() {
      
      season_ = 0;
      onChanged();
      return this;
    }

    private int rank_ ;
    /**
     * <code>int32 rank = 2;</code>
     * @return The rank.
     */
    @java.lang.Override
    public int getRank() {
      return rank_;
    }
    /**
     * <code>int32 rank = 2;</code>
     * @param value The rank to set.
     * @return This builder for chaining.
     */
    public Builder setRank(int value) {
      
      rank_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 rank = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRank() {
      
      rank_ = 0;
      onChanged();
      return this;
    }

    private int totalBattles_ ;
    /**
     * <code>int32 total_battles = 3;</code>
     * @return The totalBattles.
     */
    @java.lang.Override
    public int getTotalBattles() {
      return totalBattles_;
    }
    /**
     * <code>int32 total_battles = 3;</code>
     * @param value The totalBattles to set.
     * @return This builder for chaining.
     */
    public Builder setTotalBattles(int value) {
      
      totalBattles_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total_battles = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalBattles() {
      
      totalBattles_ = 0;
      onChanged();
      return this;
    }

    private int totalWins_ ;
    /**
     * <code>int32 total_wins = 4;</code>
     * @return The totalWins.
     */
    @java.lang.Override
    public int getTotalWins() {
      return totalWins_;
    }
    /**
     * <code>int32 total_wins = 4;</code>
     * @param value The totalWins to set.
     * @return This builder for chaining.
     */
    public Builder setTotalWins(int value) {
      
      totalWins_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total_wins = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalWins() {
      
      totalWins_ = 0;
      onChanged();
      return this;
    }

    private float rating_ ;
    /**
     * <code>float rating = 5;</code>
     * @return The rating.
     */
    @java.lang.Override
    public float getRating() {
      return rating_;
    }
    /**
     * <code>float rating = 5;</code>
     * @param value The rating to set.
     * @return This builder for chaining.
     */
    public Builder setRating(float value) {
      
      rating_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float rating = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearRating() {
      
      rating_ = 0F;
      onChanged();
      return this;
    }

    private int longestWinStreak_ ;
    /**
     * <code>int32 longest_win_streak = 6;</code>
     * @return The longestWinStreak.
     */
    @java.lang.Override
    public int getLongestWinStreak() {
      return longestWinStreak_;
    }
    /**
     * <code>int32 longest_win_streak = 6;</code>
     * @param value The longestWinStreak to set.
     * @return This builder for chaining.
     */
    public Builder setLongestWinStreak(int value) {
      
      longestWinStreak_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 longest_win_streak = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongestWinStreak() {
      
      longestWinStreak_ = 0;
      onChanged();
      return this;
    }

    private int currentStreak_ ;
    /**
     * <code>int32 current_streak = 7;</code>
     * @return The currentStreak.
     */
    @java.lang.Override
    public int getCurrentStreak() {
      return currentStreak_;
    }
    /**
     * <code>int32 current_streak = 7;</code>
     * @param value The currentStreak to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentStreak(int value) {
      
      currentStreak_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 current_streak = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrentStreak() {
      
      currentStreak_ = 0;
      onChanged();
      return this;
    }

    private long stardustEarned_ ;
    /**
     * <code>int64 stardust_earned = 8;</code>
     * @return The stardustEarned.
     */
    @java.lang.Override
    public long getStardustEarned() {
      return stardustEarned_;
    }
    /**
     * <code>int64 stardust_earned = 8;</code>
     * @param value The stardustEarned to set.
     * @return This builder for chaining.
     */
    public Builder setStardustEarned(long value) {
      
      stardustEarned_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 stardust_earned = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearStardustEarned() {
      
      stardustEarned_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CombatSeasonResult)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CombatSeasonResult)
  private static final POGOProtos.Rpc.CombatSeasonResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CombatSeasonResult();
  }

  public static POGOProtos.Rpc.CombatSeasonResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombatSeasonResult>
      PARSER = new com.google.protobuf.AbstractParser<CombatSeasonResult>() {
    @java.lang.Override
    public CombatSeasonResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombatSeasonResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombatSeasonResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombatSeasonResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CombatSeasonResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

