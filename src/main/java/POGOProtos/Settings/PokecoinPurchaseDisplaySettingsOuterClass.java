// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/PokecoinPurchaseDisplaySettings.proto

package POGOProtos.Settings;

public final class PokecoinPurchaseDisplaySettingsOuterClass {
  private PokecoinPurchaseDisplaySettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_PokecoinPurchaseDisplaySettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_PokecoinPurchaseDisplaySettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9POGOProtos/Settings/PokecoinPurchaseDi" +
      "splaySettings.proto\022\023POGOProtos.Settings" +
      "\"\234\001\n\037PokecoinPurchaseDisplaySettings\022\027\n\017" +
      "feature_enabled\030\001 \001(\010\022\031\n\021enabled_countri" +
      "es\030\002 \003(\t\022\032\n\022enabled_currencies\030\003 \003(\t\022)\n!" +
      "use_pokecoin_purchase_display_gmt\030\004 \001(\010B" +
      "\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_PokecoinPurchaseDisplaySettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_PokecoinPurchaseDisplaySettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_PokecoinPurchaseDisplaySettings_descriptor,
        new java.lang.String[] { "FeatureEnabled", "EnabledCountries", "EnabledCurrencies", "UsePokecoinPurchaseDisplayGmt", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}