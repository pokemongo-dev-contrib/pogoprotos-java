// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Friends/PlayerFriendDisplay.proto

package POGOProtos.Data.Friends;

public interface PlayerFriendDisplayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Friends.PlayerFriendDisplay)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.PokemonDisplay buddy = 1;</code>
   * @return Whether the buddy field is set.
   */
  boolean hasBuddy();
  /**
   * <code>.POGOProtos.Data.PokemonDisplay buddy = 1;</code>
   * @return The buddy.
   */
  POGOProtos.Data.PokemonDisplay getBuddy();
  /**
   * <code>.POGOProtos.Data.PokemonDisplay buddy = 1;</code>
   */
  POGOProtos.Data.PokemonDisplayOrBuilder getBuddyOrBuilder();

  /**
   * <code>int32 buddy_display_pokemon_id = 2;</code>
   * @return The buddyDisplayPokemonId.
   */
  int getBuddyDisplayPokemonId();

  /**
   * <code>string buddy_pokemon_nickname = 3;</code>
   * @return The buddyPokemonNickname.
   */
  java.lang.String getBuddyPokemonNickname();
  /**
   * <code>string buddy_pokemon_nickname = 3;</code>
   * @return The bytes for buddyPokemonNickname.
   */
  com.google.protobuf.ByteString
      getBuddyPokemonNicknameBytes();

  /**
   * <code>.POGOProtos.Data.PokemonDisplay last_pokemon_caught = 4;</code>
   * @return Whether the lastPokemonCaught field is set.
   */
  boolean hasLastPokemonCaught();
  /**
   * <code>.POGOProtos.Data.PokemonDisplay last_pokemon_caught = 4;</code>
   * @return The lastPokemonCaught.
   */
  POGOProtos.Data.PokemonDisplay getLastPokemonCaught();
  /**
   * <code>.POGOProtos.Data.PokemonDisplay last_pokemon_caught = 4;</code>
   */
  POGOProtos.Data.PokemonDisplayOrBuilder getLastPokemonCaughtOrBuilder();

  /**
   * <code>int32 last_pokemon_caught_display_id = 5;</code>
   * @return The lastPokemonCaughtDisplayId.
   */
  int getLastPokemonCaughtDisplayId();

  /**
   * <code>int64 last_pokemon_caught_timestamp = 6;</code>
   * @return The lastPokemonCaughtTimestamp.
   */
  long getLastPokemonCaughtTimestamp();

  /**
   * <code>int32 buddy_candy_awarded = 7;</code>
   * @return The buddyCandyAwarded.
   */
  int getBuddyCandyAwarded();
}