// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface ListAvatarCustomizationsOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ListAvatarCustomizationsOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.ListAvatarCustomizationsOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.ListAvatarCustomizationsOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.ListAvatarCustomizationsOutProto.Result getResult();

  /**
   * <code>repeated .POGOProtos.Rpc.ListAvatarCustomizationsOutProto.AvatarCustomization avatar_customizations = 2;</code>
   */
  java.util.List<POGOProtos.Rpc.ListAvatarCustomizationsOutProto.AvatarCustomization> 
      getAvatarCustomizationsList();
  /**
   * <code>repeated .POGOProtos.Rpc.ListAvatarCustomizationsOutProto.AvatarCustomization avatar_customizations = 2;</code>
   */
  POGOProtos.Rpc.ListAvatarCustomizationsOutProto.AvatarCustomization getAvatarCustomizations(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ListAvatarCustomizationsOutProto.AvatarCustomization avatar_customizations = 2;</code>
   */
  int getAvatarCustomizationsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ListAvatarCustomizationsOutProto.AvatarCustomization avatar_customizations = 2;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ListAvatarCustomizationsOutProto.AvatarCustomizationOrBuilder> 
      getAvatarCustomizationsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ListAvatarCustomizationsOutProto.AvatarCustomization avatar_customizations = 2;</code>
   */
  POGOProtos.Rpc.ListAvatarCustomizationsOutProto.AvatarCustomizationOrBuilder getAvatarCustomizationsOrBuilder(
      int index);
}
