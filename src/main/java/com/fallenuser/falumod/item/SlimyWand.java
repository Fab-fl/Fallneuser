package com.fallenuser.falumod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.extensions.IForgeItemStack;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

import static com.fallenuser.falumod.item.ModItems.ITEMS;

public class SlimyWand extends Item {

  public SlimyWand(Properties properties) {

    super(properties);
  }

  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
    if(!level.isClientSide()){
      player.sendSystemMessage(Component.literal("It worked!"));

    }


    return super.use(level, player, hand);
  }
}
