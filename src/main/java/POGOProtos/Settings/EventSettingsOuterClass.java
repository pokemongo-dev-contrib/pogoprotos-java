// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/EventSettings.proto

package POGOProtos.Settings;

public final class EventSettingsOuterClass {
  private EventSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_EventSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_EventSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'POGOProtos/Settings/EventSettings.prot" +
      "o\022\023POGOProtos.Settings\"\311\001\n\rEventSettings" +
      "\022!\n\031condolence_ribbon_country\030\001 \003(\t\022\031\n\021e" +
      "nable_event_link\030\002 \001(\010\022&\n\036enable_event_l" +
      "ink_for_children\030\003 \001(\010\022!\n\031event_webtoken" +
      "_server_url\030\004 \001(\t\022\030\n\020enable_event_lnt\030\005 " +
      "\001(\010\022\025\n\revent_lnt_url\030\006 \001(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_EventSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_EventSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_EventSettings_descriptor,
        new java.lang.String[] { "CondolenceRibbonCountry", "EnableEventLink", "EnableEventLinkForChildren", "EventWebtokenServerUrl", "EnableEventLnt", "EventLntUrl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}