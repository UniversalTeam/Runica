package universalteam.runica.item.slates;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import universalteam.runica.lib.Reference;

public class ItemBlankSlate extends Item
{
	public ItemBlankSlate()
	{
		this.setUnlocalizedName("blankSlate");
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{
		player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "This appears to be a blank slate..."));
		return itemStack;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":blankSlate");
	}
}
