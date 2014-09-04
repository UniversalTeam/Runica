package universalteam.runica.proxies;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import universalteam.runica.lib.Reference;
import universalteam.runica.item.slates.ItemBlankSlate;
import universalteam.runica.item.slates.ItemFehuSlate;
import universalteam.universalcore.version.UCVersion;
import universalteam.universalcore.version.UCVersionChecker;

public class CommonProxy
{
	public static CreativeTabs tabRunica;

	public static Item blankSlate;
	public static Item fehuSlate;

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
		blankSlate = new ItemBlankSlate();
		fehuSlate = new ItemFehuSlate();

		GameRegistry.registerItem(blankSlate, "blankSlate");
		GameRegistry.registerItem(fehuSlate, "fehuSlate");
	}

	protected void initCreativeTabs()
	{
		tabRunica = new CreativeTabs("tabRunica")
		{
			@Override
			public Item getTabIconItem()
			{
				return fehuSlate;
			}
		};
	}
}
