package universalteam.runica.block.runeblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import universalteam.runica.proxies.CommonProxy;

public class BlockFehuRune extends Block
{
    public BlockFehuRune()
    {
        super(Material.rock);
        this.setHardness(10.0f);
        this.setCreativeTab(CommonProxy.tabBlocks);
        this.setBlockName("fehuRuneBlock");
    }
}
