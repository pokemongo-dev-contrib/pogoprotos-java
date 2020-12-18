// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface ProfanityCheckOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ProfanityCheckOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.ProfanityCheckOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.ProfanityCheckOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.ProfanityCheckOutProto.Result getResult();

  /**
   * <code>repeated int32 invalid_contents_indexes = 2;</code>
   * @return A list containing the invalidContentsIndexes.
   */
  java.util.List<java.lang.Integer> getInvalidContentsIndexesList();
  /**
   * <code>repeated int32 invalid_contents_indexes = 2;</code>
   * @return The count of invalidContentsIndexes.
   */
  int getInvalidContentsIndexesCount();
  /**
   * <code>repeated int32 invalid_contents_indexes = 2;</code>
   * @param index The index of the element to return.
   * @return The invalidContentsIndexes at the given index.
   */
  int getInvalidContentsIndexes(int index);
}
