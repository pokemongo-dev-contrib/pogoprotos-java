// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/CompleteQuestPokemonEncounterLogEntry.proto

package POGOProtos.Data.Logs;

public final class CompleteQuestPokemonEncounterLogEntryOuterClass {
  private CompleteQuestPokemonEncounterLogEntryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Logs_CompleteQuestPokemonEncounterLogEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Logs_CompleteQuestPokemonEncounterLogEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@POGOProtos/Data/Logs/CompleteQuestPoke" +
      "monEncounterLogEntry.proto\022\024POGOProtos.D" +
      "ata.Logs\032$POGOProtos/Enums/EncounterType" +
      ".proto\032$POGOProtos/Data/PokemonDisplay.p" +
      "roto\"\356\002\n%CompleteQuestPokemonEncounterLo" +
      "gEntry\022R\n\006result\030\001 \001(\0162B.POGOProtos.Data" +
      ".Logs.CompleteQuestPokemonEncounterLogEn" +
      "try.Result\022\026\n\016pokedex_number\030\002 \001(\005\022\025\n\rco" +
      "mbat_points\030\003 \001(\005\022\022\n\npokemon_id\030\004 \001(\006\0228\n" +
      "\017pokemon_display\030\005 \001(\0132\037.POGOProtos.Data" +
      ".PokemonDisplay\0227\n\016encounter_type\030\006 \001(\0162" +
      "\037.POGOProtos.Enums.EncounterType\";\n\006Resu" +
      "lt\022\t\n\005UNSET\020\000\022\024\n\020POKEMON_CAPTURED\020\001\022\020\n\014P" +
      "OKEMON_FLED\020\002B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.EncounterTypeOuterClass.getDescriptor(),
          POGOProtos.Data.PokemonDisplayOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Logs_CompleteQuestPokemonEncounterLogEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Logs_CompleteQuestPokemonEncounterLogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Logs_CompleteQuestPokemonEncounterLogEntry_descriptor,
        new java.lang.String[] { "Result", "PokedexNumber", "CombatPoints", "PokemonId", "PokemonDisplay", "EncounterType", });
    POGOProtos.Enums.EncounterTypeOuterClass.getDescriptor();
    POGOProtos.Data.PokemonDisplayOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}