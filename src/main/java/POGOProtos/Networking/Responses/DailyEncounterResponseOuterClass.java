// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/DailyEncounterResponse.proto

package POGOProtos.Networking.Responses;

public final class DailyEncounterResponseOuterClass {
  private DailyEncounterResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_DailyEncounterResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_DailyEncounterResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<POGOProtos/Networking/Responses/DailyE" +
      "ncounterResponse.proto\022\037POGOProtos.Netwo" +
      "rking.Responses\0320POGOProtos/Data/Capture" +
      "/CaptureProbability.proto\032!POGOProtos/Da" +
      "ta/PokemonData.proto\032&POGOProtos/Invento" +
      "ry/Item/ItemId.proto\"\230\003\n\026DailyEncounterR" +
      "esponse\022N\n\006result\030\001 \001(\0162>.POGOProtos.Net" +
      "working.Responses.DailyEncounterResponse" +
      ".Result\022-\n\007pokemon\030\002 \001(\0132\034.POGOProtos.Da" +
      "ta.PokemonData\022H\n\023capture_probability\030\003 " +
      "\001(\0132+.POGOProtos.Data.Capture.CapturePro" +
      "bability\0226\n\013active_item\030\004 \001(\0162!.POGOProt" +
      "os.Inventory.Item.ItemId\022\"\n\032arplus_attem" +
      "pts_until_flee\030\005 \001(\005\"Y\n\006Result\022\t\n\005UNSET\020" +
      "\000\022\013\n\007SUCCESS\020\001\022\033\n\027ENCOUNTER_NOT_AVAILABL" +
      "E\020\002\022\032\n\026POKEMON_INVENTORY_FULL\020\003B\002P\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Capture.CaptureProbabilityOuterClass.getDescriptor(),
          POGOProtos.Data.PokemonDataOuterClass.getDescriptor(),
          POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_DailyEncounterResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_DailyEncounterResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_DailyEncounterResponse_descriptor,
        new java.lang.String[] { "Result", "Pokemon", "CaptureProbability", "ActiveItem", "ArplusAttemptsUntilFlee", });
    POGOProtos.Data.Capture.CaptureProbabilityOuterClass.getDescriptor();
    POGOProtos.Data.PokemonDataOuterClass.getDescriptor();
    POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}