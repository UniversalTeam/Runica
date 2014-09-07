package universalteam.runica.item.slates;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import universalteam.runica.lib.Reference;
import universalteam.runica.proxies.CommonProxy;

public class ItemAnsuzSlate extends ItemBlankSlate
{
    public ItemAnsuzSlate()
    {
        super.setUnlocalizedName("ansuzSlate");
        //super.setCreativeTab(CommonProxy.tabRunica);
    }

    @Override
    public void registerIcons(IIconRegister icon)
    {
        this.itemIcon = icon.registerIcon(Reference.MOD_ID + ":fehuSlate");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "This Slate has a peculiar 'f' Rune symbol on it..."));
        return itemStack;
    }
}
