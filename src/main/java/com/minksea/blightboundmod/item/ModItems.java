package com.minksea.blightboundmod.item;

import com.minksea.blightboundmod.BlightBoundMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BlightBoundMod.MOD_ID);

    public static final RegistryObject<Item> ANCIENT_GHOULIFIED_ORE = ITEMS.register("ghoulified_ore",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
