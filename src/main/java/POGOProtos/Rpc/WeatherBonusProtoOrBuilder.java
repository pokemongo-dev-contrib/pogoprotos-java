// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface WeatherBonusProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.WeatherBonusProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 cp_base_level_bonus = 1;</code>
   * @return The cpBaseLevelBonus.
   */
  int getCpBaseLevelBonus();

  /**
   * <code>int32 guaranteed_individual_values = 2;</code>
   * @return The guaranteedIndividualValues.
   */
  int getGuaranteedIndividualValues();

  /**
   * <code>double stardust_bonus_multiplier = 3;</code>
   * @return The stardustBonusMultiplier.
   */
  double getStardustBonusMultiplier();

  /**
   * <code>double attack_bonus_multiplier = 4;</code>
   * @return The attackBonusMultiplier.
   */
  double getAttackBonusMultiplier();

  /**
   * <code>int32 raid_encounter_cp_base_level_bonus = 5;</code>
   * @return The raidEncounterCpBaseLevelBonus.
   */
  int getRaidEncounterCpBaseLevelBonus();

  /**
   * <code>int32 raid_encounter_guaranteed_individual_values = 6;</code>
   * @return The raidEncounterGuaranteedIndividualValues.
   */
  int getRaidEncounterGuaranteedIndividualValues();

  /**
   * <code>int32 buddy_emotion_favorite_weather_increment = 7;</code>
   * @return The buddyEmotionFavoriteWeatherIncrement.
   */
  int getBuddyEmotionFavoriteWeatherIncrement();

  /**
   * <code>int32 buddy_emotion_dislike_weather_decrement = 8;</code>
   * @return The buddyEmotionDislikeWeatherDecrement.
   */
  int getBuddyEmotionDislikeWeatherDecrement();
}
