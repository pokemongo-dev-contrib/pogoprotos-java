// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface FeedPokemonTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.FeedPokemonTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 status = 1;</code>
   * @return The status.
   */
  int getStatus();

  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
   * @return The pokemon.
   */
  POGOProtos.Rpc.PokemonTelemetry getPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 2;</code>
   */
  POGOProtos.Rpc.PokemonTelemetryOrBuilder getPokemonOrBuilder();

  /**
   * <code>string gym_id = 3;</code>
   * @return The gymId.
   */
  java.lang.String getGymId();
  /**
   * <code>string gym_id = 3;</code>
   * @return The bytes for gymId.
   */
  com.google.protobuf.ByteString
      getGymIdBytes();

  /**
   * <code>.POGOProtos.Rpc.Team team = 4;</code>
   * @return The enum numeric value on the wire for team.
   */
  int getTeamValue();
  /**
   * <code>.POGOProtos.Rpc.Team team = 4;</code>
   * @return The team.
   */
  POGOProtos.Rpc.Team getTeam();

  /**
   * <code>int32 defender_count = 5;</code>
   * @return The defenderCount.
   */
  int getDefenderCount();

  /**
   * <code>int32 motivation = 6;</code>
   * @return The motivation.
   */
  int getMotivation();

  /**
   * <code>int32 cp_now = 7;</code>
   * @return The cpNow.
   */
  int getCpNow();
}
