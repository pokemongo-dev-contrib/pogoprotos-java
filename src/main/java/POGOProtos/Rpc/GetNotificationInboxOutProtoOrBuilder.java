// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetNotificationInboxOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetNotificationInboxOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetNotificationInboxOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.GetNotificationInboxOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.GetNotificationInboxOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.ClientInbox inbox = 2;</code>
   * @return Whether the inbox field is set.
   */
  boolean hasInbox();
  /**
   * <code>.POGOProtos.Rpc.ClientInbox inbox = 2;</code>
   * @return The inbox.
   */
  POGOProtos.Rpc.ClientInbox getInbox();
  /**
   * <code>.POGOProtos.Rpc.ClientInbox inbox = 2;</code>
   */
  POGOProtos.Rpc.ClientInboxOrBuilder getInboxOrBuilder();
}
