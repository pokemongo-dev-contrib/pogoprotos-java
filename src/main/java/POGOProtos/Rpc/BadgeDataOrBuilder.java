// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface BadgeDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.BadgeData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.MiniCollectionBadgeData mini_collection = 2;</code>
   * @return Whether the miniCollection field is set.
   */
  boolean hasMiniCollection();
  /**
   * <code>.POGOProtos.Rpc.MiniCollectionBadgeData mini_collection = 2;</code>
   * @return The miniCollection.
   */
  POGOProtos.Rpc.MiniCollectionBadgeData getMiniCollection();
  /**
   * <code>.POGOProtos.Rpc.MiniCollectionBadgeData mini_collection = 2;</code>
   */
  POGOProtos.Rpc.MiniCollectionBadgeDataOrBuilder getMiniCollectionOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.HoloBadgeType badge = 1;</code>
   * @return The enum numeric value on the wire for badge.
   */
  int getBadgeValue();
  /**
   * <code>.POGOProtos.Rpc.HoloBadgeType badge = 1;</code>
   * @return The badge.
   */
  POGOProtos.Rpc.HoloBadgeType getBadge();

  public POGOProtos.Rpc.BadgeData.DataCase getDataCase();
}