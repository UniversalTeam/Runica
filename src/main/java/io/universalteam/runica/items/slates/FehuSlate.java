package io.universalteam.runica.items.slates;

import io.universalteam.runica.lib.ModReference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class FehuSlate extends BlankSlate {
    public FehuSlate() {
        super.setUnlocalizedName("fehuSlate");
        super.setCreativeTab(CreativeTabs.tabMisc);
    }

    @Override
    public void registerIcons(IIconRegister icon)
    {
        this.itemIcon = icon.registerIcon(ModReference.MODID + ":fehuSlate");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "This Slate has a peculiar 'f' Rune symbol on it..."));
        return itemStack;
    }
}
