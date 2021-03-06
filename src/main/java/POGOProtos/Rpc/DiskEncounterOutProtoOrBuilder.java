// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface DiskEncounterOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.DiskEncounterOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.DiskEncounterOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.DiskEncounterOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.DiskEncounterOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   * @return The pokemon.
   */
  POGOProtos.Rpc.PokemonProto getPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   */
  POGOProtos.Rpc.PokemonProtoOrBuilder getPokemonOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
   * @return Whether the captureProbability field is set.
   */
  boolean hasCaptureProbability();
  /**
   * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
   * @return The captureProbability.
   */
  POGOProtos.Rpc.CaptureProbabilityProto getCaptureProbability();
  /**
   * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
   */
  POGOProtos.Rpc.CaptureProbabilityProtoOrBuilder getCaptureProbabilityOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.Item active_item = 4;</code>
   * @return The enum numeric value on the wire for activeItem.
   */
  int getActiveItemValue();
  /**
   * <code>.POGOProtos.Rpc.Item active_item = 4;</code>
   * @return The activeItem.
   */
  POGOProtos.Rpc.Item getActiveItem();

  /**
   * <code>int32 arplus_attempts_until_flee = 5;</code>
   * @return The arplusAttemptsUntilFlee.
   */
  int getArplusAttemptsUntilFlee();
}
