// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Platform/Responses/GetFitnessReportResponse.proto

package POGOProtos.Networking.Responses.Platform.Responses;

public final class GetFitnessReportResponseOuterClass {
  private GetFitnessReportResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetFitnessReportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetFitnessReportResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nQPOGOProtos/Networking/Responses/Platfo" +
      "rm/Responses/GetFitnessReportResponse.pr" +
      "oto\0222POGOProtos.Networking.Responses.Pla" +
      "tform.Responses\032+POGOProtos/Data/Fitness" +
      "/FitnessReport.proto\"\207\003\n\030GetFitnessRepor" +
      "tResponse\022c\n\006status\030\001 \001(\0162S.POGOProtos.N" +
      "etworking.Responses.Platform.Responses.G" +
      "etFitnessReportResponse.Status\022=\n\rdaily_" +
      "reports\030\002 \003(\0132&.POGOProtos.Data.Fitness." +
      "FitnessReport\022>\n\016weekly_reports\030\003 \003(\0132&." +
      "POGOProtos.Data.Fitness.FitnessReport\"\206\001" +
      "\n\006Status\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\032\n\026ERRO" +
      "R_PLAYER_NOT_FOUND\020\002\022\033\n\027ERROR_RECORDS_NO" +
      "T_FOUND\020\003\022\030\n\024ERROR_INVALID_WINDOW\020\004\022\021\n\rE" +
      "RROR_UNKNOWN\020\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Fitness.FitnessReportOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetFitnessReportResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetFitnessReportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Platform_Responses_GetFitnessReportResponse_descriptor,
        new java.lang.String[] { "Status", "DailyReports", "WeeklyReports", });
    POGOProtos.Data.Fitness.FitnessReportOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}