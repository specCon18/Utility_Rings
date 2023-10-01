package com.skdevstudios.util_rings;

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
    public static final String MOD_VERSION = "1.20-1.0.0.0";

    public UtilRings()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the Deferred Register to the mod event bus so items get registered
        ItemsInit.ITEMS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CreativeTabInit.CREATIVE_MODE_TABS.register(modEventBus);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
