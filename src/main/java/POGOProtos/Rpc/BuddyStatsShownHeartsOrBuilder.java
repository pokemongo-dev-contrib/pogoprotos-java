// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface BuddyStatsShownHeartsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.BuddyStatsShownHearts)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float buddy_affection_km_in_progress = 1;</code>
   * @return The buddyAffectionKmInProgress.
   */
  float getBuddyAffectionKmInProgress();

  /**
   * <code>map&lt;int32, .POGOProtos.Rpc.BuddyStatsShownHearts.BuddyShownHeartsList&gt; buddy_shown_hearts_per_category = 2;</code>
   */
  int getBuddyShownHeartsPerCategoryCount();
  /**
   * <code>map&lt;int32, .POGOProtos.Rpc.BuddyStatsShownHearts.BuddyShownHeartsList&gt; buddy_shown_hearts_per_category = 2;</code>
   */
  boolean containsBuddyShownHeartsPerCategory(
      int key);
  /**
   * Use {@link #getBuddyShownHeartsPerCategoryMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, POGOProtos.Rpc.BuddyStatsShownHearts.BuddyShownHeartsList>
  getBuddyShownHeartsPerCategory();
  /**
   * <code>map&lt;int32, .POGOProtos.Rpc.BuddyStatsShownHearts.BuddyShownHeartsList&gt; buddy_shown_hearts_per_category = 2;</code>
   */
  java.util.Map<java.lang.Integer, POGOProtos.Rpc.BuddyStatsShownHearts.BuddyShownHeartsList>
  getBuddyShownHeartsPerCategoryMap();
  /**
   * <code>map&lt;int32, .POGOProtos.Rpc.BuddyStatsShownHearts.BuddyShownHeartsList&gt; buddy_shown_hearts_per_category = 2;</code>
   */

  POGOProtos.Rpc.BuddyStatsShownHearts.BuddyShownHeartsList getBuddyShownHeartsPerCategoryOrDefault(
      int key,
      POGOProtos.Rpc.BuddyStatsShownHearts.BuddyShownHeartsList defaultValue);
  /**
   * <code>map&lt;int32, .POGOProtos.Rpc.BuddyStatsShownHearts.BuddyShownHeartsList&gt; buddy_shown_hearts_per_category = 2;</code>
   */

  POGOProtos.Rpc.BuddyStatsShownHearts.BuddyShownHeartsList getBuddyShownHeartsPerCategoryOrThrow(
      int key);
}
