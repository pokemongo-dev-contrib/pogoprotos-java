// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.DeepLinkingEnumWrapperProto}
 */
public final class DeepLinkingEnumWrapperProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DeepLinkingEnumWrapperProto)
    DeepLinkingEnumWrapperProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeepLinkingEnumWrapperProto.newBuilder() to construct.
  private DeepLinkingEnumWrapperProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeepLinkingEnumWrapperProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeepLinkingEnumWrapperProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeepLinkingEnumWrapperProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeepLinkingEnumWrapperProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeepLinkingEnumWrapperProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DeepLinkingEnumWrapperProto.class, POGOProtos.Rpc.DeepLinkingEnumWrapperProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.DeepLinkingEnumWrapperProto.DeepLinkingActionName}
   */
  public enum DeepLinkingActionName
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>OPEN_SHOP = 1;</code>
     */
    OPEN_SHOP(1),
    /**
     * <code>OPEN_NEWS = 2;</code>
     */
    OPEN_NEWS(2),
    /**
     * <code>OPEN_BATTLE_LEAGUE = 3;</code>
     */
    OPEN_BATTLE_LEAGUE(3),
    /**
     * <code>OPEN_SETTINGS = 4;</code>
     */
    OPEN_SETTINGS(4),
    /**
     * <code>OPEN_PLAYER_PROFILE = 5;</code>
     */
    OPEN_PLAYER_PROFILE(5),
    /**
     * <code>OPEN_BUDDY = 6;</code>
     */
    OPEN_BUDDY(6),
    /**
     * <code>OPEN_AVATAR_ITEMS = 7;</code>
     */
    OPEN_AVATAR_ITEMS(7),
    /**
     * <code>OPEN_QUEST_LIST = 8;</code>
     */
    OPEN_QUEST_LIST(8),
    /**
     * <code>OPEN_POKEMON_INVENTORY = 9;</code>
     */
    OPEN_POKEMON_INVENTORY(9),
    /**
     * <code>OPEN_NEARBY_POKEMON = 10;</code>
     */
    OPEN_NEARBY_POKEMON(10),
    /**
     * <code>OPEN_POKEDEX = 11;</code>
     */
    OPEN_POKEDEX(11),
    /**
     * <code>OPEN_EVENTS = 12;</code>
     */
    OPEN_EVENTS(12),
    /**
     * <code>OPEN_JOURNAL = 13;</code>
     */
    OPEN_JOURNAL(13),
    /**
     * <code>OPEN_TIPS = 14;</code>
     */
    OPEN_TIPS(14),
    /**
     * <code>OPEN_ITEM_INVENTORY = 15;</code>
     */
    OPEN_ITEM_INVENTORY(15),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>OPEN_SHOP = 1;</code>
     */
    public static final int OPEN_SHOP_VALUE = 1;
    /**
     * <code>OPEN_NEWS = 2;</code>
     */
    public static final int OPEN_NEWS_VALUE = 2;
    /**
     * <code>OPEN_BATTLE_LEAGUE = 3;</code>
     */
    public static final int OPEN_BATTLE_LEAGUE_VALUE = 3;
    /**
     * <code>OPEN_SETTINGS = 4;</code>
     */
    public static final int OPEN_SETTINGS_VALUE = 4;
    /**
     * <code>OPEN_PLAYER_PROFILE = 5;</code>
     */
    public static final int OPEN_PLAYER_PROFILE_VALUE = 5;
    /**
     * <code>OPEN_BUDDY = 6;</code>
     */
    public static final int OPEN_BUDDY_VALUE = 6;
    /**
     * <code>OPEN_AVATAR_ITEMS = 7;</code>
     */
    public static final int OPEN_AVATAR_ITEMS_VALUE = 7;
    /**
     * <code>OPEN_QUEST_LIST = 8;</code>
     */
    public static final int OPEN_QUEST_LIST_VALUE = 8;
    /**
     * <code>OPEN_POKEMON_INVENTORY = 9;</code>
     */
    public static final int OPEN_POKEMON_INVENTORY_VALUE = 9;
    /**
     * <code>OPEN_NEARBY_POKEMON = 10;</code>
     */
    public static final int OPEN_NEARBY_POKEMON_VALUE = 10;
    /**
     * <code>OPEN_POKEDEX = 11;</code>
     */
    public static final int OPEN_POKEDEX_VALUE = 11;
    /**
     * <code>OPEN_EVENTS = 12;</code>
     */
    public static final int OPEN_EVENTS_VALUE = 12;
    /**
     * <code>OPEN_JOURNAL = 13;</code>
     */
    public static final int OPEN_JOURNAL_VALUE = 13;
    /**
     * <code>OPEN_TIPS = 14;</code>
     */
    public static final int OPEN_TIPS_VALUE = 14;
    /**
     * <code>OPEN_ITEM_INVENTORY = 15;</code>
     */
    public static final int OPEN_ITEM_INVENTORY_VALUE = 15;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DeepLinkingActionName valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DeepLinkingActionName forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return OPEN_SHOP;
        case 2: return OPEN_NEWS;
        case 3: return OPEN_BATTLE_LEAGUE;
        case 4: return OPEN_SETTINGS;
        case 5: return OPEN_PLAYER_PROFILE;
        case 6: return OPEN_BUDDY;
        case 7: return OPEN_AVATAR_ITEMS;
        case 8: return OPEN_QUEST_LIST;
        case 9: return OPEN_POKEMON_INVENTORY;
        case 10: return OPEN_NEARBY_POKEMON;
        case 11: return OPEN_POKEDEX;
        case 12: return OPEN_EVENTS;
        case 13: return OPEN_JOURNAL;
        case 14: return OPEN_TIPS;
        case 15: return OPEN_ITEM_INVENTORY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DeepLinkingActionName>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DeepLinkingActionName> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DeepLinkingActionName>() {
            public DeepLinkingActionName findValueByNumber(int number) {
              return DeepLinkingActionName.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.DeepLinkingEnumWrapperProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final DeepLinkingActionName[] VALUES = values();

    public static DeepLinkingActionName valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DeepLinkingActionName(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.DeepLinkingEnumWrapperProto.DeepLinkingActionName)
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.DeepLinkingEnumWrapperProto.NearbyPokemonTab}
   */
  public enum NearbyPokemonTab
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NEARBY_POKEMON = 0;</code>
     */
    NEARBY_POKEMON(0),
    /**
     * <code>RAIDS = 1;</code>
     */
    RAIDS(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NEARBY_POKEMON = 0;</code>
     */
    public static final int NEARBY_POKEMON_VALUE = 0;
    /**
     * <code>RAIDS = 1;</code>
     */
    public static final int RAIDS_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static NearbyPokemonTab valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NearbyPokemonTab forNumber(int value) {
      switch (value) {
        case 0: return NEARBY_POKEMON;
        case 1: return RAIDS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NearbyPokemonTab>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NearbyPokemonTab> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NearbyPokemonTab>() {
            public NearbyPokemonTab findValueByNumber(int number) {
              return NearbyPokemonTab.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.DeepLinkingEnumWrapperProto.getDescriptor().getEnumTypes().get(1);
    }

    private static final NearbyPokemonTab[] VALUES = values();

    public static NearbyPokemonTab valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private NearbyPokemonTab(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.DeepLinkingEnumWrapperProto.NearbyPokemonTab)
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.DeepLinkingEnumWrapperProto.PlayerProfileTab}
   */
  public enum PlayerProfileTab
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PROFILE = 0;</code>
     */
    PROFILE(0),
    /**
     * <code>FRIENDS = 1;</code>
     */
    FRIENDS(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PROFILE = 0;</code>
     */
    public static final int PROFILE_VALUE = 0;
    /**
     * <code>FRIENDS = 1;</code>
     */
    public static final int FRIENDS_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PlayerProfileTab valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PlayerProfileTab forNumber(int value) {
      switch (value) {
        case 0: return PROFILE;
        case 1: return FRIENDS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PlayerProfileTab>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PlayerProfileTab> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PlayerProfileTab>() {
            public PlayerProfileTab findValueByNumber(int number) {
              return PlayerProfileTab.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.DeepLinkingEnumWrapperProto.getDescriptor().getEnumTypes().get(2);
    }

    private static final PlayerProfileTab[] VALUES = values();

    public static PlayerProfileTab valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PlayerProfileTab(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.DeepLinkingEnumWrapperProto.PlayerProfileTab)
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.DeepLinkingEnumWrapperProto.PokemonInventoryTab}
   */
  public enum PokemonInventoryTab
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>COMBAT_PARTY = 0;</code>
     */
    COMBAT_PARTY(0),
    /**
     * <code>POKEMON = 1;</code>
     */
    POKEMON(1),
    /**
     * <code>EGGS = 2;</code>
     */
    EGGS(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>COMBAT_PARTY = 0;</code>
     */
    public static final int COMBAT_PARTY_VALUE = 0;
    /**
     * <code>POKEMON = 1;</code>
     */
    public static final int POKEMON_VALUE = 1;
    /**
     * <code>EGGS = 2;</code>
     */
    public static final int EGGS_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PokemonInventoryTab valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PokemonInventoryTab forNumber(int value) {
      switch (value) {
        case 0: return COMBAT_PARTY;
        case 1: return POKEMON;
        case 2: return EGGS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PokemonInventoryTab>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PokemonInventoryTab> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PokemonInventoryTab>() {
            public PokemonInventoryTab findValueByNumber(int number) {
              return PokemonInventoryTab.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.DeepLinkingEnumWrapperProto.getDescriptor().getEnumTypes().get(3);
    }

    private static final PokemonInventoryTab[] VALUES = values();

    public static PokemonInventoryTab valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PokemonInventoryTab(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.DeepLinkingEnumWrapperProto.PokemonInventoryTab)
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.DeepLinkingEnumWrapperProto.QuestListTab}
   */
  public enum QuestListTab
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>TODAY_VIEW = 0;</code>
     */
    TODAY_VIEW(0),
    /**
     * <code>FIELD_RESEARCH = 1;</code>
     */
    FIELD_RESEARCH(1),
    /**
     * <code>SPECIAL_RESEARCH = 2;</code>
     */
    SPECIAL_RESEARCH(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>TODAY_VIEW = 0;</code>
     */
    public static final int TODAY_VIEW_VALUE = 0;
    /**
     * <code>FIELD_RESEARCH = 1;</code>
     */
    public static final int FIELD_RESEARCH_VALUE = 1;
    /**
     * <code>SPECIAL_RESEARCH = 2;</code>
     */
    public static final int SPECIAL_RESEARCH_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static QuestListTab valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static QuestListTab forNumber(int value) {
      switch (value) {
        case 0: return TODAY_VIEW;
        case 1: return FIELD_RESEARCH;
        case 2: return SPECIAL_RESEARCH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<QuestListTab>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        QuestListTab> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<QuestListTab>() {
            public QuestListTab findValueByNumber(int number) {
              return QuestListTab.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.DeepLinkingEnumWrapperProto.getDescriptor().getEnumTypes().get(4);
    }

    private static final QuestListTab[] VALUES = values();

    public static QuestListTab valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private QuestListTab(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.DeepLinkingEnumWrapperProto.QuestListTab)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof POGOProtos.Rpc.DeepLinkingEnumWrapperProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DeepLinkingEnumWrapperProto other = (POGOProtos.Rpc.DeepLinkingEnumWrapperProto) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DeepLinkingEnumWrapperProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DeepLinkingEnumWrapperProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeepLinkingEnumWrapperProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DeepLinkingEnumWrapperProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeepLinkingEnumWrapperProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DeepLinkingEnumWrapperProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeepLinkingEnumWrapperProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DeepLinkingEnumWrapperProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeepLinkingEnumWrapperProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DeepLinkingEnumWrapperProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DeepLinkingEnumWrapperProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DeepLinkingEnumWrapperProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(POGOProtos.Rpc.DeepLinkingEnumWrapperProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code POGOProtos.Rpc.DeepLinkingEnumWrapperProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DeepLinkingEnumWrapperProto)
      POGOProtos.Rpc.DeepLinkingEnumWrapperProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeepLinkingEnumWrapperProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeepLinkingEnumWrapperProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DeepLinkingEnumWrapperProto.class, POGOProtos.Rpc.DeepLinkingEnumWrapperProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DeepLinkingEnumWrapperProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DeepLinkingEnumWrapperProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DeepLinkingEnumWrapperProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.DeepLinkingEnumWrapperProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DeepLinkingEnumWrapperProto build() {
      POGOProtos.Rpc.DeepLinkingEnumWrapperProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DeepLinkingEnumWrapperProto buildPartial() {
      POGOProtos.Rpc.DeepLinkingEnumWrapperProto result = new POGOProtos.Rpc.DeepLinkingEnumWrapperProto(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof POGOProtos.Rpc.DeepLinkingEnumWrapperProto) {
        return mergeFrom((POGOProtos.Rpc.DeepLinkingEnumWrapperProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DeepLinkingEnumWrapperProto other) {
      if (other == POGOProtos.Rpc.DeepLinkingEnumWrapperProto.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      POGOProtos.Rpc.DeepLinkingEnumWrapperProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DeepLinkingEnumWrapperProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DeepLinkingEnumWrapperProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DeepLinkingEnumWrapperProto)
  private static final POGOProtos.Rpc.DeepLinkingEnumWrapperProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DeepLinkingEnumWrapperProto();
  }

  public static POGOProtos.Rpc.DeepLinkingEnumWrapperProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeepLinkingEnumWrapperProto>
      PARSER = new com.google.protobuf.AbstractParser<DeepLinkingEnumWrapperProto>() {
    @java.lang.Override
    public DeepLinkingEnumWrapperProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeepLinkingEnumWrapperProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeepLinkingEnumWrapperProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeepLinkingEnumWrapperProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DeepLinkingEnumWrapperProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

