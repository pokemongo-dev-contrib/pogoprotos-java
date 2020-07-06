// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/InvasionOpenCombatSessionMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface InvasionOpenCombatSessionMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.InvasionOpenCombatSessionMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Map.Fort.IncidentLookup incident_lookup = 1;</code>
   * @return Whether the incidentLookup field is set.
   */
  boolean hasIncidentLookup();
  /**
   * <code>.POGOProtos.Map.Fort.IncidentLookup incident_lookup = 1;</code>
   * @return The incidentLookup.
   */
  POGOProtos.Map.Fort.IncidentLookup getIncidentLookup();
  /**
   * <code>.POGOProtos.Map.Fort.IncidentLookup incident_lookup = 1;</code>
   */
  POGOProtos.Map.Fort.IncidentLookupOrBuilder getIncidentLookupOrBuilder();

  /**
   * <code>int32 step = 2;</code>
   * @return The step.
   */
  int getStep();

  /**
   * <code>repeated fixed64 attacking_pokemon_id = 3;</code>
   * @return A list containing the attackingPokemonId.
   */
  java.util.List<java.lang.Long> getAttackingPokemonIdList();
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 3;</code>
   * @return The count of attackingPokemonId.
   */
  int getAttackingPokemonIdCount();
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 3;</code>
   * @param index The index of the element to return.
   * @return The attackingPokemonId at the given index.
   */
  long getAttackingPokemonId(int index);
}