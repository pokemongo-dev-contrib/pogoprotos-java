// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Sticker/Sticker.proto

package POGOProtos.Data.Sticker;

public interface StickerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Sticker.Sticker)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sticker_id = 1;</code>
   * @return The stickerId.
   */
  java.lang.String getStickerId();
  /**
   * <code>string sticker_id = 1;</code>
   * @return The bytes for stickerId.
   */
  com.google.protobuf.ByteString
      getStickerIdBytes();

  /**
   * <code>int32 count = 2;</code>
   * @return The count.
   */
  int getCount();

  /**
   * <code>int32 used = 3;</code>
   * @return The used.
   */
  int getUsed();
}