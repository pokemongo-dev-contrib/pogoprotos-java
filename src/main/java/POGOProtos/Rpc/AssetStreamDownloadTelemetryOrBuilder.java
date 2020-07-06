// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface AssetStreamDownloadTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.AssetStreamDownloadTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.AssetTelemetryIds asset_event_id = 1;</code>
   * @return The enum numeric value on the wire for assetEventId.
   */
  int getAssetEventIdValue();
  /**
   * <code>.POGOProtos.Rpc.AssetTelemetryIds asset_event_id = 1;</code>
   * @return The assetEventId.
   */
  POGOProtos.Rpc.AssetTelemetryIds getAssetEventId();

  /**
   * <code>string url = 2;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 2;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>uint32 size = 3;</code>
   * @return The size.
   */
  int getSize();
}