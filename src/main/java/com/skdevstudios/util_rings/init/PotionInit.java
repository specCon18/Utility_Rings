package com.skdevstudios.util_rings.init;

import com.skdevstudios.util_rings.UtilRings;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PotionInit {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, UtilRings.MODID);
}
