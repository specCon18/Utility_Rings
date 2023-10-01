package com.skdevstudios.util_rings.init;

import com.skdevstudios.util_rings.UtilRings;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "util_rings" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UtilRings.MODID);
    
    // Creates a creative tab with the id "util_rings:rings_tab" for the example item, that is placed after the combat tab
    public static final RegistryObject<CreativeModeTab> UTIL_RINGS_TAB = CREATIVE_MODE_TABS.register("rings_tab", () -> CreativeModeTab.builder()
        .title(Component.translatable("itemGroup.rings_tab"))
        .withTabsBefore(CreativeModeTabs.COMBAT)
        .icon(() -> ItemsInit.IRON_RING.get().getDefaultInstance())
        .displayItems((parameters, output) -> {
            output.accept(ItemsInit.IRON_RING.get());
            output.accept(ItemsInit.VOLCANIC_GLASS_RING.get());
        })
        .build()
    );
}
