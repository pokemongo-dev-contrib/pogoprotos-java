// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetPlayerProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetPlayerProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
   * @return Whether the playerLocale field is set.
   */
  boolean hasPlayerLocale();
  /**
   * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
   * @return The playerLocale.
   */
  POGOProtos.Rpc.PlayerLocaleProto getPlayerLocale();
  /**
   * <code>.POGOProtos.Rpc.PlayerLocaleProto player_locale = 1;</code>
   */
  POGOProtos.Rpc.PlayerLocaleProtoOrBuilder getPlayerLocaleOrBuilder();

  /**
   * <code>bool prevent_creation = 2;</code>
   * @return The preventCreation.
   */
  boolean getPreventCreation();
}
