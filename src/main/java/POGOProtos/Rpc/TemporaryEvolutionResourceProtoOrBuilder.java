// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface TemporaryEvolutionResourceProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.TemporaryEvolutionResourceProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temporary_evolution_id = 1;</code>
   * @return The enum numeric value on the wire for temporaryEvolutionId.
   */
  int getTemporaryEvolutionIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temporary_evolution_id = 1;</code>
   * @return The temporaryEvolutionId.
   */
  POGOProtos.Rpc.HoloTemporaryEvolutionId getTemporaryEvolutionId();

  /**
   * <code>int32 energy_count = 2;</code>
   * @return The energyCount.
   */
  int getEnergyCount();

  /**
   * <code>int32 max_energy_count = 3;</code>
   * @return The maxEnergyCount.
   */
  int getMaxEnergyCount();
}
