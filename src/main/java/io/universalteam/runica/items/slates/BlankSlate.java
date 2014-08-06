package io.universalteam.runica.items.slates;

import io.universalteam.runica.lib.ModReference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlankSlate extends Item {
    public BlankSlate() {
        this.setUnlocalizedName("blankSlate");
        this.setCreativeTab(CreativeTabs.tabFood);
    }

    @Override
    public void registerIcons(IIconRegister icon)
    {
        this.itemIcon = icon.registerIcon(ModReference.MODID + " :fehuSlate");
    }
}
