// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Friends/TwoWaySharedFriendshipData.proto

package POGOProtos.Data.Friends;

public interface TwoWaySharedFriendshipDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Friends.TwoWaySharedFriendshipData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool is_lucky = 1;</code>
   * @return The isLucky.
   */
  boolean getIsLucky();

  /**
   * <code>int32 lucky_count = 2;</code>
   * @return The luckyCount.
   */
  int getLuckyCount();

  /**
   * <code>.POGOProtos.Data.Friends.TwoWaySharedFriendshipData.SharedMigrations shared_migrations = 3;</code>
   * @return Whether the sharedMigrations field is set.
   */
  boolean hasSharedMigrations();
  /**
   * <code>.POGOProtos.Data.Friends.TwoWaySharedFriendshipData.SharedMigrations shared_migrations = 3;</code>
   * @return The sharedMigrations.
   */
  POGOProtos.Data.Friends.TwoWaySharedFriendshipData.SharedMigrations getSharedMigrations();
  /**
   * <code>.POGOProtos.Data.Friends.TwoWaySharedFriendshipData.SharedMigrations shared_migrations = 3;</code>
   */
  POGOProtos.Data.Friends.TwoWaySharedFriendshipData.SharedMigrationsOrBuilder getSharedMigrationsOrBuilder();
}