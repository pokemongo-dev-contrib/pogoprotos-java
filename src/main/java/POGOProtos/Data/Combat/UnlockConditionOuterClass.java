// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Combat/UnlockCondition.proto

package POGOProtos.Data.Combat;

public final class UnlockConditionOuterClass {
  private UnlockConditionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Combat_UnlockCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Combat_UnlockCondition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,POGOProtos/Data/Combat/UnlockCondition" +
      ".proto\022\026POGOProtos.Data.Combat\032$POGOProt" +
      "os/Enums/ConditionType.proto\032,POGOProtos" +
      "/Data/Combat/WithPlayerLevel.proto\032/POGO" +
      "Protos/Data/Combat/WithPokemonCpLimit.pr" +
      "oto\032,POGOProtos/Data/Combat/WithPokemonT" +
      "ype.proto\0320POGOProtos/Data/Combat/WithPo" +
      "kemonCategory.proto\"\372\002\n\017UnlockCondition\022" +
      "-\n\004type\030\001 \001(\0162\037.POGOProtos.Enums.Conditi" +
      "onType\022\031\n\021min_pokemon_count\030\002 \001(\005\022B\n\021wit" +
      "h_player_level\030\003 \001(\0132\'.POGOProtos.Data.C" +
      "ombat.WithPlayerLevel\022I\n\025with_pokemon_cp" +
      "_limit\030\004 \001(\0132*.POGOProtos.Data.Combat.Wi" +
      "thPokemonCpLimit\022B\n\021with_pokemon_type\030\005 " +
      "\001(\0132\'.POGOProtos.Data.Combat.WithPokemon" +
      "Type\022J\n\025with_pokemon_category\030\006 \001(\0132+.PO" +
      "GOProtos.Data.Combat.WithPokemonCategory" +
      "B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.ConditionTypeOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.WithPlayerLevelOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.WithPokemonCpLimitOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.WithPokemonTypeOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.WithPokemonCategoryOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Combat_UnlockCondition_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Combat_UnlockCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Combat_UnlockCondition_descriptor,
        new java.lang.String[] { "Type", "MinPokemonCount", "WithPlayerLevel", "WithPokemonCpLimit", "WithPokemonType", "WithPokemonCategory", });
    POGOProtos.Enums.ConditionTypeOuterClass.getDescriptor();
    POGOProtos.Data.Combat.WithPlayerLevelOuterClass.getDescriptor();
    POGOProtos.Data.Combat.WithPokemonCpLimitOuterClass.getDescriptor();
    POGOProtos.Data.Combat.WithPokemonTypeOuterClass.getDescriptor();
    POGOProtos.Data.Combat.WithPokemonCategoryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}