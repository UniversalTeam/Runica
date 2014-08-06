package io.universalteam.runica;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.universalteam.runica.lib.ModReference;
import io.universalteam.runica.proxies.CommonProxy;
import universalteam.universalcore.utils.UCLogger;

@Mod(modid = ModReference.MODID, name = ModReference.MODNAME, version = ModReference.VERSION, dependencies = "required-after:UniversalCore")
public class ModRunica {

    @SidedProxy(clientSide = "io.universalteam.runica.proxies.ClientProxy", serverSide = "io.universalteam.runica.proxies.CommonProxy")
    public static CommonProxy proxy;

    public static UCLogger logger = new UCLogger(ModReference.MODID);

    @Mod.Instance(ModReference.MODID)
    public static ModRunica instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent) {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        proxy.Init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent) {
        proxy.postInit();
    }
}
