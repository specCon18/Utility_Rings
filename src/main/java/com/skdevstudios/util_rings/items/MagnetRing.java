package com.skdevstudios.util_rings.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class MagnetRing extends Item implements ICurioItem {
    public MagnetRing() {
        super(new Item.Properties().stacksTo(1).defaultDurability(0));
    }
    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        //TODO: Add Ticking Logic to check for loose blocks within 5 blocks of player and if there is do SUCK!
    }
}
