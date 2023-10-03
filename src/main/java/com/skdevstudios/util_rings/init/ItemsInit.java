package com.skdevstudios.util_rings.init;

import com.skdevstudios.util_rings.UtilRings;
import com.skdevstudios.util_rings.items.GrowthRing;
import com.skdevstudios.util_rings.items.MagnetRing;
import com.skdevstudios.util_rings.items.VolcanicGlassRing;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsInit {
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UtilRings.MODID);

    public static final RegistryObject<Item> IRON_RING = ITEMS.register("iron_ring", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_RING_LEFT = ITEMS.register("iron_ring_left", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_RING_TOP = ITEMS.register("iron_ring_top", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_RING_BOTTOM = ITEMS.register("iron_ring_bottom", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_RING_RIGHT = ITEMS.register("iron_ring_right", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JEWELERS_HAMMER = ITEMS.register("jewelers_hammer", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PINE_TAR = ITEMS.register("pine_tar", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ROSIN_SOLUTION = ITEMS.register("rosin_solution", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ROSIN = ITEMS.register("rosin", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SOLDER_BLEND = ITEMS.register("solder_blend", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SOLDER_SHOT = ITEMS.register("solder_shot", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SOLDER_SPOOL = ITEMS.register("solder_spool", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SOLDER_WIRE = ITEMS.register("solder_wire", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> VOLCANIC_GLASS_RING = ITEMS.register("volcanic_glass_ring", () -> new VolcanicGlassRing(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MAGNET_RING = ITEMS.register("magnet_ring", () -> new MagnetRing(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GROWTH_RING = ITEMS.register("growth_ring", () -> new GrowthRing(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<BlockItem> LEAD_ORE_ITEM = ITEMS.register("lead_ore", () -> new BlockItem(BlockInit.LEAD_ORE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> TIN_ORE_ITEM = ITEMS.register("tin_ore", () -> new BlockItem(BlockInit.TIN_ORE.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> PINE_LOG_ITEM = ITEMS.register("pine_log", () -> new BlockItem(BlockInit.PINE_LOG.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> STRIPPED_PINE_LOG_ITEM = ITEMS.register("stripped_pine_log", () -> new BlockItem(BlockInit.STRIPPED_PINE_LOG.get(), new Item.Properties()));
}

