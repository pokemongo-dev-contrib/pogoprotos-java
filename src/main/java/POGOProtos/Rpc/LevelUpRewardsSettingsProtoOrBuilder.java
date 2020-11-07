// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface LevelUpRewardsSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.LevelUpRewardsSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 level = 1;</code>
   * @return The level.
   */
  int getLevel();

  /**
   * <code>repeated .POGOProtos.Rpc.Item items = 2;</code>
   * @return A list containing the items.
   */
  java.util.List<POGOProtos.Rpc.Item> getItemsList();
  /**
   * <code>repeated .POGOProtos.Rpc.Item items = 2;</code>
   * @return The count of items.
   */
  int getItemsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.Item items = 2;</code>
   * @param index The index of the element to return.
   * @return The items at the given index.
   */
  POGOProtos.Rpc.Item getItems(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.Item items = 2;</code>
   * @return A list containing the enum numeric values on the wire for items.
   */
  java.util.List<java.lang.Integer>
  getItemsValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.Item items = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of items at the given index.
   */
  int getItemsValue(int index);

  /**
   * <code>repeated int32 items_count = 3;</code>
   * @return A list containing the itemsCount.
   */
  java.util.List<java.lang.Integer> getItemsCountList();
  /**
   * <code>repeated int32 items_count = 3;</code>
   * @return The count of itemsCount.
   */
  int getItemsCountCount();
  /**
   * <code>repeated int32 items_count = 3;</code>
   * @param index The index of the element to return.
   * @return The itemsCount at the given index.
   */
  int getItemsCount(int index);

  /**
   * <code>repeated .POGOProtos.Rpc.Item items_unlocked = 4;</code>
   * @return A list containing the itemsUnlocked.
   */
  java.util.List<POGOProtos.Rpc.Item> getItemsUnlockedList();
  /**
   * <code>repeated .POGOProtos.Rpc.Item items_unlocked = 4;</code>
   * @return The count of itemsUnlocked.
   */
  int getItemsUnlockedCount();
  /**
   * <code>repeated .POGOProtos.Rpc.Item items_unlocked = 4;</code>
   * @param index The index of the element to return.
   * @return The itemsUnlocked at the given index.
   */
  POGOProtos.Rpc.Item getItemsUnlocked(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.Item items_unlocked = 4;</code>
   * @return A list containing the enum numeric values on the wire for itemsUnlocked.
   */
  java.util.List<java.lang.Integer>
  getItemsUnlockedValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.Item items_unlocked = 4;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of itemsUnlocked at the given index.
   */
  int getItemsUnlockedValue(int index);

  /**
   * <code>repeated string avatar_template_ids = 5;</code>
   * @return A list containing the avatarTemplateIds.
   */
  java.util.List<java.lang.String>
      getAvatarTemplateIdsList();
  /**
   * <code>repeated string avatar_template_ids = 5;</code>
   * @return The count of avatarTemplateIds.
   */
  int getAvatarTemplateIdsCount();
  /**
   * <code>repeated string avatar_template_ids = 5;</code>
   * @param index The index of the element to return.
   * @return The avatarTemplateIds at the given index.
   */
  java.lang.String getAvatarTemplateIds(int index);
  /**
   * <code>repeated string avatar_template_ids = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the avatarTemplateIds at the given index.
   */
  com.google.protobuf.ByteString
      getAvatarTemplateIdsBytes(int index);
}
