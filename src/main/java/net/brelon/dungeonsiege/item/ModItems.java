package net.brelon.dungeonsiege.item;

import net.brelon.dungeonsiege.DungeonSiegeMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    ///  Register object
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DungeonSiegeMod.MOD_ID);

    /// Custom items here
    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties()));

    /// Register function
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
