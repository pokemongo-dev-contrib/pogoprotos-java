// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Analytics/ClientTelemetryClientSettings.proto

package POGOProtos.Data.Analytics;

public final class ClientTelemetryClientSettingsOuterClass {
  private ClientTelemetryClientSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Analytics_ClientTelemetryClientSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Analytics_ClientTelemetryClientSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Analytics_ClientTelemetryClientSettings_SpecialSamplingProbabilityMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Analytics_ClientTelemetryClientSettings_SpecialSamplingProbabilityMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=POGOProtos/Data/Analytics/ClientTeleme" +
      "tryClientSettings.proto\022\031POGOProtos.Data" +
      ".Analytics\"\310\004\n\035ClientTelemetryClientSett" +
      "ings\022\031\n\021is_upload_enabled\030\001 \001(\010\022 \n\030max_u" +
      "pload_size_in_bytes\030\002 \001(\003\022\036\n\026update_inte" +
      "rval_in_sec\030\003 \001(\003\022\'\n\037settings_update_int" +
      "erval_in_sec\030\004 \001(\003\022\037\n\027max_envelope_queue" +
      "_size\030\005 \001(\003\022\034\n\024sampling_probability\030\006 \001(" +
      "\001\022!\n\031use_player_based_sampling\030\007 \001(\010\022\023\n\013" +
      "player_hash\030\010 \001(\001\022\037\n\027player_external_omn" +
      "i_id\030\t \001(\t\022\034\n\024disable_omni_sending\030\n \001(\010" +
      "\022\205\001\n special_sampling_probability_map\030\013 " +
      "\003(\0132[.POGOProtos.Data.Analytics.ClientTe" +
      "lemetryClientSettings.SpecialSamplingPro" +
      "babilityMapEntry\022\035\n\025player_external_ua_i" +
      "d\030\014 \001(\t\032D\n\"SpecialSamplingProbabilityMap" +
      "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\001:\0028\001B\002P" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Analytics_ClientTelemetryClientSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Analytics_ClientTelemetryClientSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Analytics_ClientTelemetryClientSettings_descriptor,
        new java.lang.String[] { "IsUploadEnabled", "MaxUploadSizeInBytes", "UpdateIntervalInSec", "SettingsUpdateIntervalInSec", "MaxEnvelopeQueueSize", "SamplingProbability", "UsePlayerBasedSampling", "PlayerHash", "PlayerExternalOmniId", "DisableOmniSending", "SpecialSamplingProbabilityMap", "PlayerExternalUaId", });
    internal_static_POGOProtos_Data_Analytics_ClientTelemetryClientSettings_SpecialSamplingProbabilityMapEntry_descriptor =
      internal_static_POGOProtos_Data_Analytics_ClientTelemetryClientSettings_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Data_Analytics_ClientTelemetryClientSettings_SpecialSamplingProbabilityMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Analytics_ClientTelemetryClientSettings_SpecialSamplingProbabilityMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}