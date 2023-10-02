package com.skdevstudios.util_rings.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class GrowthRing extends Item implements ICurioItem {
    public GrowthRing(Item.Properties properties) {
        super(properties);
    }
    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        //TODO: Add tick logic for auto fertalizing of crops every 10 ticks within 3x3 radius of player
    }
}