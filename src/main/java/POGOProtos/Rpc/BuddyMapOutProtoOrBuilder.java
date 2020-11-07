// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface BuddyMapOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.BuddyMapOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.BuddyMapOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.BuddyMapOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.BuddyMapOutProto.Result getResult();

  /**
   * <code>int64 expiration_ms = 2;</code>
   * @return The expirationMs.
   */
  long getExpirationMs();

  /**
   * <code>int64 applied_ms = 3;</code>
   * @return The appliedMs.
   */
  long getAppliedMs();

  /**
   * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 4;</code>
   * @return Whether the observedData field is set.
   */
  boolean hasObservedData();
  /**
   * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 4;</code>
   * @return The observedData.
   */
  POGOProtos.Rpc.BuddyObservedData getObservedData();
  /**
   * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 4;</code>
   */
  POGOProtos.Rpc.BuddyObservedDataOrBuilder getObservedDataOrBuilder();
}
