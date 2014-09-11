package universalteam.runica.proxies;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import universalteam.runica.block.runeblocks.BlockFehuRune;
import universalteam.runica.item.ItemParchment;
import universalteam.runica.item.ItemSlate;
import universalteam.runica.lib.Reference;
import universalteam.runica.tabs.CreativeTabSlates;
import universalteam.runica.tabs.CreativeTabsBlocks;
import universalteam.universalcore.version.UCVersion;
import universalteam.universalcore.version.UCVersionChecker;

public class CommonProxy
{
	public static CreativeTabs tabSlates;
    public static CreativeTabs tabBlocks;

	public static Item slate;
    public static Item parchment;

    public static Block fehuRuneBlock;

	public void preInit()
	{
		UCVersionChecker.registerModVersion(new UCVersion(Reference.MOD_VERSION, "https://raw.githubusercontent.com/UniversalTeam/UCModVersions/master/Runica/version.json"));

		initCreativeTabs();

		initItems();

        initBlocks();
	}

	public void Init()
	{

	}

	public void postInit()
	{

	}

    protected void initBlocks()
    {
        fehuRuneBlock = new BlockFehuRune();

        GameRegistry.registerBlock(fehuRuneBlock, "fehuRuneBlock");
    }

	protected void initItems()
	{
		slate = new ItemSlate();
        parchment = new ItemParchment();

		GameRegistry.registerItem(slate, "runica.slate");
        GameRegistry.registerItem(parchment, "runica.parchment");
	}

	protected void initCreativeTabs()
	{
		tabSlates = new CreativeTabSlates("tabSlates");
        tabBlocks = new CreativeTabsBlocks("tabBlocks");
	}
}
