// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Trading/ExcludedPokemon.proto

package POGOProtos.Data.Trading;

public final class ExcludedPokemonOuterClass {
  private ExcludedPokemonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Trading_ExcludedPokemon_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Trading_ExcludedPokemon_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-POGOProtos/Data/Trading/ExcludedPokemo" +
      "n.proto\022\027POGOProtos.Data.Trading\"\263\003\n\017Exc" +
      "ludedPokemon\022\022\n\npokemon_id\030\001 \001(\006\022R\n\020excl" +
      "usion_reason\030\002 \001(\01628.POGOProtos.Data.Tra" +
      "ding.ExcludedPokemon.ExclusionReason\"\267\002\n" +
      "\017ExclusionReason\022\t\n\005UNSET\020\000\022\024\n\020MYTHICAL_" +
      "POKEMON\020\001\022\013\n\007SLASHED\020\002\022\020\n\014GYM_DEPLOYED\020\003" +
      "\022\t\n\005BUDDY\020\004\022\024\n\020STAMINA_NOT_FULL\020\005\022\023\n\017EGG" +
      "_NOT_HATCHED\020\006\022\030\n\024FRIENDSHIP_LEVEL_LOW\020\007" +
      "\022\030\n\024FRIEND_CANNOT_AFFORD\020\010\022\036\n\032FRIEND_REA" +
      "CHED_DAILY_LIMIT\020\t\022\022\n\016ALREADY_TRADED\020\n\022\030" +
      "\n\024PLAYER_CANNOT_AFFORD\020\013\022\036\n\032PLAYER_REACH" +
      "ED_DAILY_LIMIT\020\014\022\014\n\010FAVORITE\020\rB\002P\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Trading_ExcludedPokemon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Trading_ExcludedPokemon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Trading_ExcludedPokemon_descriptor,
        new java.lang.String[] { "PokemonId", "ExclusionReason", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}