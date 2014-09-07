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

	/*public static Item blankSlate;
	public static Item fehuSlate;
	public static Item uruzSlate;
	public static Item purisazSlate;
	public static Item ansuzSlate;*/

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

		/*blankSlate = new ItemBlankSlate();
		fehuSlate = new ItemFehuSlate();
		uruzSlate = new ItemUruzSlate();
		purisazSlate = new ItemPurisazSlate();
		ansuzSlate = new ItemAnsuzSlate();*/

		GameRegistry.registerItem(slate, "runica.slate");

		/*GameRegistry.registerItem(blankSlate, "blankSlate");
		GameRegistry.registerItem(fehuSlate, "fehuSlate");
		GameRegistry.registerItem(uruzSlate, "uruzSlate");
		GameRegistry.registerItem(purisazSlate, "purisazSlate");
		GameRegistry.registerItem(ansuzSlate, "ansuzSlate");*/
	}

	protected void initCreativeTabs()
	{
		tabSlates = new CreativeTabSlates("tabSlates");
	}
}
