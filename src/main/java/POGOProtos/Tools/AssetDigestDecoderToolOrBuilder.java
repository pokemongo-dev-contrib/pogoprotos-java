// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Tools/AssetDigestDecoderTool.proto

package POGOProtos.Tools;

public interface AssetDigestDecoderToolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Tools.AssetDigestDecoderTool)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Tools.AssetDigestDecoderTool.AssetDigestEntry digest = 1;</code>
   */
  java.util.List<POGOProtos.Tools.AssetDigestDecoderTool.AssetDigestEntry> 
      getDigestList();
  /**
   * <code>repeated .POGOProtos.Tools.AssetDigestDecoderTool.AssetDigestEntry digest = 1;</code>
   */
  POGOProtos.Tools.AssetDigestDecoderTool.AssetDigestEntry getDigest(int index);
  /**
   * <code>repeated .POGOProtos.Tools.AssetDigestDecoderTool.AssetDigestEntry digest = 1;</code>
   */
  int getDigestCount();
  /**
   * <code>repeated .POGOProtos.Tools.AssetDigestDecoderTool.AssetDigestEntry digest = 1;</code>
   */
  java.util.List<? extends POGOProtos.Tools.AssetDigestDecoderTool.AssetDigestEntryOrBuilder> 
      getDigestOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Tools.AssetDigestDecoderTool.AssetDigestEntry digest = 1;</code>
   */
  POGOProtos.Tools.AssetDigestDecoderTool.AssetDigestEntryOrBuilder getDigestOrBuilder(
      int index);

  /**
   * <code>uint64 timestamp_ms = 2;</code>
   * @return The timestampMs.
   */
  long getTimestampMs();

  /**
   * <code>.POGOProtos.Tools.AssetDigestDecoderTool.Result result = 3;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Tools.AssetDigestDecoderTool.Result result = 3;</code>
   * @return The result.
   */
  POGOProtos.Tools.AssetDigestDecoderTool.Result getResult();

  /**
   * <code>int32 page_offset = 4;</code>
   * @return The pageOffset.
   */
  int getPageOffset();
}