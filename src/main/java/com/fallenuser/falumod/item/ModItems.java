package com.fallenuser.falumod.item;

import com.fallenuser.falumod.FallenUser;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
  public static final DeferredRegister<Item> ITEMS =
          DeferredRegister.create(ForgeRegistries.ITEMS, FallenUser.MOD_ID);

  public static final RegistryObject<Item> SLIMYWAND = ITEMS.register("slimywand",
          ()-> new SlimyWand(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.EPIC)));

  public static void register(IEventBus eventbus){
    ITEMS.register(eventbus);
  }
}
