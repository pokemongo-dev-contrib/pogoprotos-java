// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface TitanSubmitSponsorPoiReportProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.TitanSubmitSponsorPoiReportProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string poi_id = 1;</code>
   * @return The poiId.
   */
  java.lang.String getPoiId();
  /**
   * <code>string poi_id = 1;</code>
   * @return The bytes for poiId.
   */
  com.google.protobuf.ByteString
      getPoiIdBytes();

  /**
   * <code>.POGOProtos.Rpc.SponsorPoiInvalidReason invalid_reason = 2;</code>
   * @return The enum numeric value on the wire for invalidReason.
   */
  int getInvalidReasonValue();
  /**
   * <code>.POGOProtos.Rpc.SponsorPoiInvalidReason invalid_reason = 2;</code>
   * @return The invalidReason.
   */
  POGOProtos.Rpc.SponsorPoiInvalidReason getInvalidReason();

  /**
   * <code>string additional_details = 3;</code>
   * @return The additionalDetails.
   */
  java.lang.String getAdditionalDetails();
  /**
   * <code>string additional_details = 3;</code>
   * @return The bytes for additionalDetails.
   */
  com.google.protobuf.ByteString
      getAdditionalDetailsBytes();
}
