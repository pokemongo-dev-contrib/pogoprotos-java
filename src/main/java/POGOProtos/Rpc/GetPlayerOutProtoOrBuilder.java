// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetPlayerOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetPlayerOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>.POGOProtos.Rpc.ClientPlayerProto player = 2;</code>
   * @return Whether the player field is set.
   */
  boolean hasPlayer();
  /**
   * <code>.POGOProtos.Rpc.ClientPlayerProto player = 2;</code>
   * @return The player.
   */
  POGOProtos.Rpc.ClientPlayerProto getPlayer();
  /**
   * <code>.POGOProtos.Rpc.ClientPlayerProto player = 2;</code>
   */
  POGOProtos.Rpc.ClientPlayerProtoOrBuilder getPlayerOrBuilder();

  /**
   * <code>bool banned = 3;</code>
   * @return The banned.
   */
  boolean getBanned();

  /**
   * <code>bool warn = 4;</code>
   * @return The warn.
   */
  boolean getWarn();

  /**
   * <code>bool was_created = 5;</code>
   * @return The wasCreated.
   */
  boolean getWasCreated();

  /**
   * <code>bool warn_message_acknowledged = 6;</code>
   * @return The warnMessageAcknowledged.
   */
  boolean getWarnMessageAcknowledged();

  /**
   * <code>bool was_suspended = 7;</code>
   * @return The wasSuspended.
   */
  boolean getWasSuspended();

  /**
   * <code>bool suspended_message_acknowledged = 8;</code>
   * @return The suspendedMessageAcknowledged.
   */
  boolean getSuspendedMessageAcknowledged();

  /**
   * <code>int64 warn_expire_ms = 9;</code>
   * @return The warnExpireMs.
   */
  long getWarnExpireMs();

  /**
   * <code>repeated int32 user_permission = 10;</code>
   * @return A list containing the userPermission.
   */
  java.util.List<java.lang.Integer> getUserPermissionList();
  /**
   * <code>repeated int32 user_permission = 10;</code>
   * @return The count of userPermission.
   */
  int getUserPermissionCount();
  /**
   * <code>repeated int32 user_permission = 10;</code>
   * @param index The index of the element to return.
   * @return The userPermission at the given index.
   */
  int getUserPermission(int index);
}
