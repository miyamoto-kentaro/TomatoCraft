package com.gmail.miyamoto.kentaro.tomatocraft;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TomatoCraftMod.MOD_ID)
public class TomatoCraftMod {
    public static final String MOD_ID = "tomatocraft";
    
    public TomatoCraftMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        TomatoCraftModItems.register(modEventBus);
    }
    
}
