package com.github.simplelif3.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.github.simplelif3.tutorialmod.TutorialMod;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
