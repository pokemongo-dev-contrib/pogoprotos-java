// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/DeclineSharedExRaidPassMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface DeclineSharedExRaidPassMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.DeclineSharedExRaidPassMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string fort_id = 1;</code>
   * @return The fortId.
   */
  java.lang.String getFortId();
  /**
   * <code>string fort_id = 1;</code>
   * @return The bytes for fortId.
   */
  com.google.protobuf.ByteString
      getFortIdBytes();

  /**
   * <code>int64 raid_seed = 2;</code>
   * @return The raidSeed.
   */
  long getRaidSeed();
}