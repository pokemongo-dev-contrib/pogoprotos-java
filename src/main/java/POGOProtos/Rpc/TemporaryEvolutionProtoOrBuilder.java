// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface TemporaryEvolutionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.TemporaryEvolutionProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temporary_evolution_id = 1;</code>
   * @return The enum numeric value on the wire for temporaryEvolutionId.
   */
  int getTemporaryEvolutionIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temporary_evolution_id = 1;</code>
   * @return The temporaryEvolutionId.
   */
  POGOProtos.Rpc.HoloTemporaryEvolutionId getTemporaryEvolutionId();

  /**
   * <code>int32 asset_bundle_value = 2;</code>
   * @return The assetBundleValue.
   */
  int getAssetBundleValue();

  /**
   * <code>string asset_bundle_suffix = 3;</code>
   * @return The assetBundleSuffix.
   */
  java.lang.String getAssetBundleSuffix();
  /**
   * <code>string asset_bundle_suffix = 3;</code>
   * @return The bytes for assetBundleSuffix.
   */
  com.google.protobuf.ByteString
      getAssetBundleSuffixBytes();
}
