// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Combat/PokemonCondition.proto

package POGOProtos.Data.Combat;

public final class PokemonConditionOuterClass {
  private PokemonConditionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Combat_PokemonCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Combat_PokemonCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonBanlist_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonBanlist_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonWhitelist_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonWhitelist_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonWithForm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonWithForm_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-POGOProtos/Data/Combat/PokemonConditio" +
      "n.proto\022\026POGOProtos.Data.Combat\032$POGOPro" +
      "tos/Enums/ConditionType.proto\032 POGOProto" +
      "s/Enums/PokemonId.proto\032\033POGOProtos/Enum" +
      "s/Form.proto\032/POGOProtos/Data/Combat/Wit" +
      "hPokemonCpLimit.proto\032,POGOProtos/Data/C" +
      "ombat/WithPokemonType.proto\0320POGOProtos/" +
      "Data/Combat/WithPokemonCategory.proto\"\225\006" +
      "\n\020PokemonCondition\022-\n\004type\030\001 \001(\0162\037.POGOP" +
      "rotos.Enums.ConditionType\022K\n\025with_pokemo" +
      "n_cp_limit\030\002 \001(\0132*.POGOProtos.Data.Comba" +
      "t.WithPokemonCpLimitH\000\022D\n\021with_pokemon_t" +
      "ype\030\003 \001(\0132\'.POGOProtos.Data.Combat.WithP" +
      "okemonTypeH\000\022L\n\025with_pokemon_category\030\004 " +
      "\001(\0132+.POGOProtos.Data.Combat.WithPokemon" +
      "CategoryH\000\022V\n\021pokemon_whitelist\030\005 \001(\01329." +
      "POGOProtos.Data.Combat.PokemonCondition." +
      "PokemonWhitelistH\000\022R\n\017pokemon_banlist\030\006 " +
      "\001(\01327.POGOProtos.Data.Combat.PokemonCond" +
      "ition.PokemonBanlistH\000\032i\n\016PokemonBanlist" +
      "\022\014\n\004name\030\001 \001(\t\022I\n\007pokemon\030\002 \003(\01328.POGOPr" +
      "otos.Data.Combat.PokemonCondition.Pokemo" +
      "nWithForm\032k\n\020PokemonWhitelist\022\014\n\004name\030\001 " +
      "\001(\t\022I\n\007pokemon\030\002 \003(\01328.POGOProtos.Data.C" +
      "ombat.PokemonCondition.PokemonWithForm\032`" +
      "\n\017PokemonWithForm\022\'\n\002id\030\001 \001(\0162\033.POGOProt" +
      "os.Enums.PokemonId\022$\n\004form\030\002 \001(\0162\026.POGOP" +
      "rotos.Enums.FormB\013\n\tConditionB\002P\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.ConditionTypeOuterClass.getDescriptor(),
          POGOProtos.Enums.PokemonIdOuterClass.getDescriptor(),
          POGOProtos.Enums.FormOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.WithPokemonCpLimitOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.WithPokemonTypeOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.WithPokemonCategoryOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Combat_PokemonCondition_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Combat_PokemonCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Combat_PokemonCondition_descriptor,
        new java.lang.String[] { "Type", "WithPokemonCpLimit", "WithPokemonType", "WithPokemonCategory", "PokemonWhitelist", "PokemonBanlist", "Condition", });
    internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonBanlist_descriptor =
      internal_static_POGOProtos_Data_Combat_PokemonCondition_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonBanlist_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonBanlist_descriptor,
        new java.lang.String[] { "Name", "Pokemon", });
    internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonWhitelist_descriptor =
      internal_static_POGOProtos_Data_Combat_PokemonCondition_descriptor.getNestedTypes().get(1);
    internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonWhitelist_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonWhitelist_descriptor,
        new java.lang.String[] { "Name", "Pokemon", });
    internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonWithForm_descriptor =
      internal_static_POGOProtos_Data_Combat_PokemonCondition_descriptor.getNestedTypes().get(2);
    internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonWithForm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Combat_PokemonCondition_PokemonWithForm_descriptor,
        new java.lang.String[] { "Id", "Form", });
    POGOProtos.Enums.ConditionTypeOuterClass.getDescriptor();
    POGOProtos.Enums.PokemonIdOuterClass.getDescriptor();
    POGOProtos.Enums.FormOuterClass.getDescriptor();
    POGOProtos.Data.Combat.WithPokemonCpLimitOuterClass.getDescriptor();
    POGOProtos.Data.Combat.WithPokemonTypeOuterClass.getDescriptor();
    POGOProtos.Data.Combat.WithPokemonCategoryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}