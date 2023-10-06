package com.skdevstudios.util_rings.items;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class VolcanicGlassRing extends Item implements ICurioItem {
    public VolcanicGlassRing(Item.Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos().relative(context.getClickedFace());

        BlockState targetState = world.getBlockState(pos);

        if (targetState.isAir() && !world.isClientSide()) {
            // Check if the target block is air and place obsidian
            BlockState obsidian = Blocks.OBSIDIAN.defaultBlockState();
            world.setBlockAndUpdate(pos, obsidian);
            
            // Play a sound effect at the placed block position
            world.playSound(null, pos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);

            return InteractionResult.SUCCESS;
        }

        return InteractionResult.FAIL;
    }
    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        //TODO: Add Ticking Logic to check for lava within 1 block of player
    }
}
