package com.skdevstudios.util_rings.items;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.core.BlockPos;

public class JewelersHammer extends Item {

    public JewelersHammer() {
        super(new Item.Properties().stacksTo(1).defaultDurability(5));
    }

    @Override
    public void onCraftedBy(ItemStack pStack, Level pLevel, Player pPlayer) {
        super.onCraftedBy(pStack, pLevel, pPlayer);

    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos().relative(context.getClickedFace());
        BlockState targetState = world.getBlockState(pos);

        if (targetState.isAir() && !world.isClientSide()) {
            world.playSound(
                null,
                pos,
                SoundEvents.ANVIL_HIT,
                SoundSource.PLAYERS,
                1.0F,
                1.0F
            );

            // Decrease the item's durability by 1
            ItemStack itemStack = context.getItemInHand();
            itemStack.hurtAndBreak(1, context.getPlayer(), playerEntity -> playerEntity.broadcastBreakEvent(context.getHand()));

            return InteractionResult.SUCCESS;
        }
        return InteractionResult.FAIL;
    }
}
