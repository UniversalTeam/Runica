package universalteam.runica.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import universalteam.runica.proxies.CommonProxy;

public class CreativeTabsBlocks extends CreativeTabs
{
    public CreativeTabsBlocks(String name)
    {
        super(name);
    }

    @Override
    public Item getTabIconItem()
    {
        return CommonProxy.slate;
    }
}
