// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/PokemonScaleSetting.proto

package POGOProtos.Settings.Master;

public interface PokemonScaleSettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.PokemonScaleSetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Settings.Master.PokemonScaleSetting.PokemonScaleMode pokemon_scale_mode = 1;</code>
   * @return The enum numeric value on the wire for pokemonScaleMode.
   */
  int getPokemonScaleModeValue();
  /**
   * <code>.POGOProtos.Settings.Master.PokemonScaleSetting.PokemonScaleMode pokemon_scale_mode = 1;</code>
   * @return The pokemonScaleMode.
   */
  POGOProtos.Settings.Master.PokemonScaleSetting.PokemonScaleMode getPokemonScaleMode();

  /**
   * <code>float min_height = 2;</code>
   * @return The minHeight.
   */
  float getMinHeight();

  /**
   * <code>float max_height = 3;</code>
   * @return The maxHeight.
   */
  float getMaxHeight();
}