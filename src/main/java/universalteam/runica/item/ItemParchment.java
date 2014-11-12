package universalteam.runica.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import universalteam.runica.proxies.CommonProxy;

import java.util.List;

public class ItemParchment extends Item
{
    public ItemParchment()
    {
        this.setMaxStackSize(16);
        this.setUnlocalizedName("parchment");
        this.setCreativeTab(CommonProxy.tabSlates);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister register)
    {
        itemIcon = register.registerIcon("runica:parchment");
    }

    @Override
    public IIcon getIcon(ItemStack stack, int pass)
    {
        return itemIcon;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean visible)
    {
        if (stack.hasTagCompound() && stack.getTagCompound().hasKey("RunicaParchment"))
            list.add(stack.getTagCompound().getString("RunicaParchment"));
    }
}
