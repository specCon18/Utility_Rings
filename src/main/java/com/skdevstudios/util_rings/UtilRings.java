package com.skdevstudios.util_rings;

import com.skdevstudios.util_rings.init.BlockInit;
import com.skdevstudios.util_rings.init.CreativeTabInit;
import com.skdevstudios.util_rings.init.ItemsInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(UtilRings.MODID)
public class UtilRings
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "util_rings";

    public UtilRings()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        //Register the Items
        ItemsInit.ITEMS.register(modEventBus);
        //Register the Blocks
        BlockInit.BLOCKS.register(modEventBus);
        //Register the Creative Tabs
        CreativeTabInit.CREATIVE_MODE_TABS.register(modEventBus);
        // Register the Event Bus
        MinecraftForge.EVENT_BUS.register(this);
        //Register the Config
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
