package com.skdevstudios.util_rings.init;

import com.skdevstudios.util_rings.UtilRings;
import com.skdevstudios.util_rings.items.GrowthRing;
import com.skdevstudios.util_rings.items.MagnetRing;
import com.skdevstudios.util_rings.items.VolcanicGlassRing;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsInit {
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UtilRings.MODID);

    public static final RegistryObject<Item> IRON_RING = ITEMS.register("iron_ring", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> VOLCANIC_GLASS_RING = ITEMS.register("volcanic_glass_ring", () -> new VolcanicGlassRing(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MAGNET_RING = ITEMS.register("magnet_ring", () -> new MagnetRing(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GROWTH_RING = ITEMS.register("growth_ring", () -> new GrowthRing(new Item.Properties().stacksTo(1)));
}

