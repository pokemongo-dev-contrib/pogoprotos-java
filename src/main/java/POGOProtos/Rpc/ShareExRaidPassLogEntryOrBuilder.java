// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface ShareExRaidPassLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ShareExRaidPassLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.ShareExRaidPassLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.ShareExRaidPassLogEntry.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.ShareExRaidPassLogEntry.Result getResult();

  /**
   * <code>string friend_codename = 2;</code>
   * @return The friendCodename.
   */
  java.lang.String getFriendCodename();
  /**
   * <code>string friend_codename = 2;</code>
   * @return The bytes for friendCodename.
   */
  com.google.protobuf.ByteString
      getFriendCodenameBytes();
}
