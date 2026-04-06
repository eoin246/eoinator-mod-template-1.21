package com.eoinator.eoinatormod.item;

import com.eoinator.eoinatormod.EoinatorMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FABRIC = registerItem("fabric", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EoinatorMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EoinatorMod.LOGGER.info("Registering Mod Items for " + EoinatorMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(FABRIC);
        });
    }
}
