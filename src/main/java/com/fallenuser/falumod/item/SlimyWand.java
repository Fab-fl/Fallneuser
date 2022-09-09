package com.fallenuser.falumod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class SlimyWand extends Item {

  public SlimyWand(Properties properties) {

    super(properties);
  }

  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
    if(!level.isClientSide()){
      player.sendSystemMessage(Component.literal("It worked!"));
      double x_cord = player.getX();
      player.setItemInHand(InteractionHand.MAIN_HAND, new ItemStack(Items.STICK));
    }
    return super.use(level, player, hand);
  }
}
