// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PartyRecommendationSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PartyRecommendationSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode mode = 1;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <code>.POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode mode = 1;</code>
   * @return The mode.
   */
  POGOProtos.Rpc.PartyRecommendationSettingsProto.PartyRcommendationMode getMode();

  /**
   * <code>float variance = 2;</code>
   * @return The variance.
   */
  float getVariance();

  /**
   * <code>float third_move_weight = 3;</code>
   * @return The thirdMoveWeight.
   */
  float getThirdMoveWeight();

  /**
   * <code>float mega_evo_combat_rating_scale = 4;</code>
   * @return The megaEvoCombatRatingScale.
   */
  float getMegaEvoCombatRatingScale();
}
