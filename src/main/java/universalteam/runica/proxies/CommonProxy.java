package universalteam.runica.proxies;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import universalteam.runica.slates.ItemBlankSlate;
import universalteam.runica.slates.ItemFehuSlate;

public class CommonProxy
{
	public static CreativeTabs tabRunica;

	public static Item blankSlate;
	public static Item fehuSlate;

	public void preInit()
	{
		initItems();
		initCreativeTabs();
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
