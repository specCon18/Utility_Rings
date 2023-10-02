package com.skdevstudios.util_rings.items;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class VolcanicGlassRing extends Item implements ICurioItem {
    public VolcanicGlassRing(Item.Properties properties) {
        super(properties);
    }
    
    @Override
    public InteractionResult useOn(UseOnContext context){
        return null;
        //TODO: Add right click spawns obsidian block
    }
    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        //TODO: Add Ticking Logic to check for lava within 1 block of player
    }
}
