// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface ClientDialogueLineProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ClientDialogueLineProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 2;</code>
   * @return The enum numeric value on the wire for character.
   */
  int getCharacterValue();
  /**
   * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 2;</code>
   * @return The character.
   */
  POGOProtos.Rpc.EnumWrapper.InvasionCharacter getCharacter();

  /**
   * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression expression = 3;</code>
   * @return The enum numeric value on the wire for expression.
   */
  int getExpressionValue();
  /**
   * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression expression = 3;</code>
   * @return The expression.
   */
  POGOProtos.Rpc.EnumWrapper.InvasionCharacterExpression getExpression();
}