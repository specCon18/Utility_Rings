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
        .icon(() -> ItemsInit.JEWELERS_HAMMER.get().getDefaultInstance())
        .displayItems((parameters, output) -> {
            output.accept(ItemsInit.IRON_RING.get());
            output.accept(ItemsInit.IRON_RING_LEFT.get());
            output.accept(ItemsInit.IRON_RING_TOP.get());
            output.accept(ItemsInit.IRON_RING_BOTTOM.get());
            output.accept(ItemsInit.IRON_RING_RIGHT.get());
            output.accept(ItemsInit.JEWELERS_HAMMER.get());
            output.accept(ItemsInit.LEAD_DUST.get());
            output.accept(ItemsInit.LEAD_NUGGET.get());
            output.accept(ItemsInit.LEAD_INGOT.get());
            output.accept(ItemsInit.TIN_DUST.get());
            output.accept(ItemsInit.TIN_NUGGET.get());
            output.accept(ItemsInit.TIN_INGOT.get());
            output.accept(ItemsInit.PINE_TAR.get());
            output.accept(ItemsInit.PINE_CONE.get());
            output.accept(ItemsInit.ROSIN_SOLUTION.get());
            output.accept(ItemsInit.ROSIN.get());
            output.accept(ItemsInit.SOLDER_BLEND.get());
            output.accept(ItemsInit.SOLDER_SHOT.get());
            output.accept(ItemsInit.SOLDER_SPOOL.get());
            output.accept(ItemsInit.SOLDER_WIRE.get());
            output.accept(ItemsInit.VOLCANIC_GLASS_RING.get());
            output.accept(ItemsInit.MAGNET_RING.get());
            output.accept(ItemsInit.GROWTH_RING.get());
            output.accept(BlockInit.LEAD_ORE.get());
            output.accept(BlockInit.TIN_ORE.get());
            output.accept(BlockInit.PINE_LOG.get());
            output.accept(BlockInit.STRIPPED_PINE_LOG.get());
        })
        .build()
    );
}
