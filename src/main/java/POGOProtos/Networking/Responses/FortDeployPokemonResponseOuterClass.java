// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/FortDeployPokemonResponse.proto

package POGOProtos.Networking.Responses;

public final class FortDeployPokemonResponseOuterClass {
  private FortDeployPokemonResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_FortDeployPokemonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_FortDeployPokemonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?POGOProtos/Networking/Responses/FortDe" +
      "ployPokemonResponse.proto\022\037POGOProtos.Ne" +
      "tworking.Responses\032!POGOProtos/Data/Poke" +
      "monData.proto\032\"POGOProtos/Data/Gym/GymSt" +
      "ate.proto\0329POGOProtos/Networking/Respons" +
      "es/FortDetailsResponse.proto\"\331\005\n\031FortDep" +
      "loyPokemonResponse\022Q\n\006result\030\001 \001(\0162A.POG" +
      "OProtos.Networking.Responses.FortDeployP" +
      "okemonResponse.Result\022J\n\014fort_details\030\002 " +
      "\001(\01324.POGOProtos.Networking.Responses.Fo" +
      "rtDetailsResponse\0222\n\014pokemon_data\030\003 \001(\0132" +
      "\034.POGOProtos.Data.PokemonData\0220\n\tgym_sta" +
      "te\030\004 \001(\0132\035.POGOProtos.Data.Gym.GymState\"" +
      "\266\003\n\006Result\022\021\n\rNO_RESULT_SET\020\000\022\013\n\007SUCCESS" +
      "\020\001\022%\n!ERROR_ALREADY_HAS_POKEMON_ON_FORT\020" +
      "\002\022!\n\035ERROR_OPPOSING_TEAM_OWNS_FORT\020\003\022\026\n\022" +
      "ERROR_FORT_IS_FULL\020\004\022\026\n\022ERROR_NOT_IN_RAN" +
      "GE\020\005\022\034\n\030ERROR_PLAYER_HAS_NO_TEAM\020\006\022\035\n\031ER" +
      "ROR_POKEMON_NOT_FULL_HP\020\007\022$\n ERROR_PLAYE" +
      "R_BELOW_MINIMUM_LEVEL\020\010\022\032\n\026ERROR_POKEMON" +
      "_IS_BUDDY\020\t\022\035\n\031ERROR_FORT_DEPLOY_LOCKOUT" +
      "\020\n\022 \n\034ERROR_PLAYER_HAS_NO_NICKNAME\020\013\022\032\n\026" +
      "ERROR_POI_INACCESSIBLE\020\014\022\033\n\027ERROR_LEGEND" +
      "ARY_POKEMON\020\r\022\031\n\025ERROR_INVALID_POKEMON\020\016" +
      "B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.PokemonDataOuterClass.getDescriptor(),
          POGOProtos.Data.Gym.GymStateOuterClass.getDescriptor(),
          POGOProtos.Networking.Responses.FortDetailsResponseOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_FortDeployPokemonResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_FortDeployPokemonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_FortDeployPokemonResponse_descriptor,
        new java.lang.String[] { "Result", "FortDetails", "PokemonData", "GymState", });
    POGOProtos.Data.PokemonDataOuterClass.getDescriptor();
    POGOProtos.Data.Gym.GymStateOuterClass.getDescriptor();
    POGOProtos.Networking.Responses.FortDetailsResponseOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}