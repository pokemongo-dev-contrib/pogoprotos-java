// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Gym/GymStatusAndDefenders.proto

package POGOProtos.Data.Gym;

public final class GymStatusAndDefendersOuterClass {
  private GymStatusAndDefendersOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Gym_GymStatusAndDefenders_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Gym_GymStatusAndDefenders_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/POGOProtos/Data/Gym/GymStatusAndDefend" +
      "ers.proto\022\023POGOProtos.Data.Gym\032\"POGOProt" +
      "os/Map/Fort/FortData.proto\032%POGOProtos/D" +
      "ata/Gym/GymDefender.proto\"\212\001\n\025GymStatusA" +
      "ndDefenders\0229\n\022pokemon_fort_proto\030\001 \001(\0132" +
      "\035.POGOProtos.Map.Fort.FortData\0226\n\014gym_de" +
      "fender\030\002 \003(\0132 .POGOProtos.Data.Gym.GymDe" +
      "fenderB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Map.Fort.FortDataOuterClass.getDescriptor(),
          POGOProtos.Data.Gym.GymDefenderOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Gym_GymStatusAndDefenders_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Gym_GymStatusAndDefenders_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Gym_GymStatusAndDefenders_descriptor,
        new java.lang.String[] { "PokemonFortProto", "GymDefender", });
    POGOProtos.Map.Fort.FortDataOuterClass.getDescriptor();
    POGOProtos.Data.Gym.GymDefenderOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}