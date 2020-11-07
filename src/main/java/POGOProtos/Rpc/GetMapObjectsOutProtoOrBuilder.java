// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetMapObjectsOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetMapObjectsOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Rpc.ClientMapCellProto map_cell = 1;</code>
   */
  java.util.List<POGOProtos.Rpc.ClientMapCellProto> 
      getMapCellList();
  /**
   * <code>repeated .POGOProtos.Rpc.ClientMapCellProto map_cell = 1;</code>
   */
  POGOProtos.Rpc.ClientMapCellProto getMapCell(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ClientMapCellProto map_cell = 1;</code>
   */
  int getMapCellCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ClientMapCellProto map_cell = 1;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ClientMapCellProtoOrBuilder> 
      getMapCellOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ClientMapCellProto map_cell = 1;</code>
   */
  POGOProtos.Rpc.ClientMapCellProtoOrBuilder getMapCellOrBuilder(
      int index);

  /**
   * <code>.POGOProtos.Rpc.GetMapObjectsOutProto.Status status = 2;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.GetMapObjectsOutProto.Status status = 2;</code>
   * @return The status.
   */
  POGOProtos.Rpc.GetMapObjectsOutProto.Status getStatus();

  /**
   * <code>.POGOProtos.Rpc.GetMapObjectsOutProto.TimeOfDay time_of_day = 3;</code>
   * @return The enum numeric value on the wire for timeOfDay.
   */
  int getTimeOfDayValue();
  /**
   * <code>.POGOProtos.Rpc.GetMapObjectsOutProto.TimeOfDay time_of_day = 3;</code>
   * @return The timeOfDay.
   */
  POGOProtos.Rpc.GetMapObjectsOutProto.TimeOfDay getTimeOfDay();

  /**
   * <code>repeated .POGOProtos.Rpc.ClientWeatherProto client_weather = 4;</code>
   */
  java.util.List<POGOProtos.Rpc.ClientWeatherProto> 
      getClientWeatherList();
  /**
   * <code>repeated .POGOProtos.Rpc.ClientWeatherProto client_weather = 4;</code>
   */
  POGOProtos.Rpc.ClientWeatherProto getClientWeather(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ClientWeatherProto client_weather = 4;</code>
   */
  int getClientWeatherCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ClientWeatherProto client_weather = 4;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ClientWeatherProtoOrBuilder> 
      getClientWeatherOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ClientWeatherProto client_weather = 4;</code>
   */
  POGOProtos.Rpc.ClientWeatherProtoOrBuilder getClientWeatherOrBuilder(
      int index);
}
