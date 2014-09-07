package universalteam.runica.item.slates;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import universalteam.runica.lib.Reference;
import universalteam.runica.proxies.CommonProxy;

public class ItemUruzSlate extends ItemBlankSlate
{
    public ItemUruzSlate()
    {
        super.setUnlocalizedName("uruzSlate");
        //super.setCreativeTab(CommonProxy.tabRunica);
    }

    @Override
    public void registerIcons(IIconRegister icon)
    {
        this.itemIcon = icon.registerIcon(Reference.MOD_ID + ":uruzSlate");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "This Slate has a peculiar 'u' Rune symbol on it..."));
        return itemStack;
    }
}
