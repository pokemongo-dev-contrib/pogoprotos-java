// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Platform/Responses/ProxySocialActionResponse.proto

package POGOProtos.Networking.Responses.Platform.Responses;

public interface ProxySocialActionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.Platform.Responses.ProxySocialActionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.Platform.Responses.ProxySocialActionResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Networking.Responses.Platform.Responses.ProxySocialActionResponse.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Networking.Responses.Platform.Responses.ProxySocialActionResponse.Status getStatus();

  /**
   * <code>string assigned_host = 2;</code>
   * @return The assignedHost.
   */
  java.lang.String getAssignedHost();
  /**
   * <code>string assigned_host = 2;</code>
   * @return The bytes for assignedHost.
   */
  com.google.protobuf.ByteString
      getAssignedHostBytes();

  /**
   * <code>bytes payload = 3;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}