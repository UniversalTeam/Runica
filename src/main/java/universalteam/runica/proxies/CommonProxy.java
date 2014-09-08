package universalteam.runica.proxies;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import universalteam.runica.item.ItemSlate;
import universalteam.runica.lib.Reference;
import universalteam.runica.tabs.CreativeTabSlates;
import universalteam.universalcore.version.UCVersion;
import universalteam.universalcore.version.UCVersionChecker;

public class CommonProxy
{
	public static CreativeTabs tabSlates;

	public static Item slate;

	public void preInit()
	{
		UCVersionChecker.registerModVersion(new UCVersion(Reference.MOD_VERSION, "https://raw.githubusercontent.com/UniversalTeam/UCModVersions/master/Runica/version.json"));

		initCreativeTabs();

		initItems();
	}

	public void Init()
	{

	}

	public void postInit()
	{

	}

	protected void initItems()
	{
		slate = new ItemSlate();

		GameRegistry.registerItem(slate, "runica.slate");
	}

	protected void initCreativeTabs()
	{
		tabSlates = new CreativeTabSlates("tabSlates");
	}
}
