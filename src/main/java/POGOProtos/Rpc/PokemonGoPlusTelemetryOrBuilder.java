// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PokemonGoPlusTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PokemonGoPlusTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PokemonGoPlusIds pgp_event_ids = 1;</code>
   * @return The enum numeric value on the wire for pgpEventIds.
   */
  int getPgpEventIdsValue();
  /**
   * <code>.POGOProtos.Rpc.PokemonGoPlusIds pgp_event_ids = 1;</code>
   * @return The pgpEventIds.
   */
  POGOProtos.Rpc.PokemonGoPlusIds getPgpEventIds();

  /**
   * <code>int32 count = 2;</code>
   * @return The count.
   */
  int getCount();

  /**
   * <code>int32 version = 3;</code>
   * @return The version.
   */
  int getVersion();
}
