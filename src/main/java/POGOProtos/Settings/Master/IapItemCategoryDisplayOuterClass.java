// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/IapItemCategoryDisplay.proto

package POGOProtos.Settings.Master;

public final class IapItemCategoryDisplayOuterClass {
  private IapItemCategoryDisplayOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_IapItemCategoryDisplay_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_IapItemCategoryDisplay_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7POGOProtos/Settings/Master/IapItemCate" +
      "goryDisplay.proto\022\032POGOProtos.Settings.M" +
      "aster\032&POGOProtos/Enums/IapItemCategory." +
      "proto\"\204\002\n\026IapItemCategoryDisplay\0227\n\010cate" +
      "gory\030\001 \001(\0162%.POGOProtos.Enums.HoloIapIte" +
      "mCategory\022\014\n\004name\030\002 \001(\t\022\016\n\006hidden\030\003 \001(\010\022" +
      "\022\n\nsort_order\030\004 \001(\005\022\026\n\016banner_enabled\030\005 " +
      "\001(\010\022\024\n\014banner_title\030\006 \001(\t\022\021\n\timage_url\030\007" +
      " \001(\t\022\023\n\013description\030\010 \001(\t\022\024\n\014display_row" +
      "s\030\t \001(\005\022\023\n\013subcategory\030\n \001(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.IapItemCategory.getDescriptor(),
        });
    internal_static_POGOProtos_Settings_Master_IapItemCategoryDisplay_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_IapItemCategoryDisplay_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_IapItemCategoryDisplay_descriptor,
        new java.lang.String[] { "Category", "Name", "Hidden", "SortOrder", "BannerEnabled", "BannerTitle", "ImageUrl", "Description", "DisplayRows", "Subcategory", });
    POGOProtos.Enums.IapItemCategory.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
