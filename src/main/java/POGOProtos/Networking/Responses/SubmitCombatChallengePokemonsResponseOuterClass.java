// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/SubmitCombatChallengePokemonsResponse.proto

package POGOProtos.Networking.Responses;

public final class SubmitCombatChallengePokemonsResponseOuterClass {
  private SubmitCombatChallengePokemonsResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_SubmitCombatChallengePokemonsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_SubmitCombatChallengePokemonsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nKPOGOProtos/Networking/Responses/Submit" +
      "CombatChallengePokemonsResponse.proto\022\037P" +
      "OGOProtos.Networking.Responses\032,POGOProt" +
      "os/Data/Combat/CombatChallenge.proto\"\330\003\n" +
      "%SubmitCombatChallengePokemonsResponse\022]" +
      "\n\006result\030\001 \001(\0162M.POGOProtos.Networking.R" +
      "esponses.SubmitCombatChallengePokemonsRe" +
      "sponse.Result\022:\n\tchallenge\030\002 \001(\0132\'.POGOP" +
      "rotos.Data.Combat.CombatChallenge\"\223\002\n\006Re" +
      "sult\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022!\n\035ERROR_IN" +
      "VALID_CHALLENGE_STATE\020\002\022\035\n\031ERROR_CHALLEN" +
      "GE_NOT_FOUND\020\003\022\"\n\036ERROR_POKEMON_NOT_IN_I" +
      "NVENTORY\020\004\022\035\n\031ERROR_NOT_ELIGIBLE_LEAGUE\020" +
      "\005\022\032\n\026ERROR_ALREADY_TIMEDOUT\020\006\022\033\n\027ERROR_A" +
      "LREADY_CANCELLED\020\007\022\027\n\023ERROR_ACCESS_DENIE" +
      "D\020\010\022\032\n\026ERROR_ALREADY_DECLINED\020\tB\002P\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Combat.CombatChallengeOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_SubmitCombatChallengePokemonsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_SubmitCombatChallengePokemonsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_SubmitCombatChallengePokemonsResponse_descriptor,
        new java.lang.String[] { "Result", "Challenge", });
    POGOProtos.Data.Combat.CombatChallengeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}