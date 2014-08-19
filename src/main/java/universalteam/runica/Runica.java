package universalteam.runica;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import universalteam.runica.lib.Reference;
import universalteam.runica.proxies.CommonProxy;
import universalteam.universalcore.utils.UCLogger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, dependencies = "required-after:UniversalCore")
public class Runica
{
	@Mod.Instance(Reference.MOD_ID)
	public static Runica instance;

	@SidedProxy(clientSide = "universalteam.runica.proxies.ClientProxy", serverSide = "universalteam.runica.proxies.CommonProxy")
	public static CommonProxy proxy;

	public static UCLogger logger = new UCLogger(Reference.MOD_ID);

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent preEvent)
	{
		proxy.preInit();
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.Init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent postEvent)
	{
		proxy.postInit();
	}
}
