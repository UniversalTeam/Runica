package universalteam.runica.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import universalteam.runica.api.futhark.ElderFutharkAlphabet;
import universalteam.runica.proxies.CommonProxy;

import java.util.List;

public class CreativeTabSlates extends CreativeTabs
{
	public CreativeTabSlates(String name)
	{
		super(name);
	}

	@Override
	public Item getTabIconItem()
	{
		return CommonProxy.slate;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void displayAllReleventItems(List list)
	{
		super.displayAllReleventItems(list);

		for (int i = 0; i < ElderFutharkAlphabet.alphabet.size(); ++i)
		{
			NBTTagCompound compound = new NBTTagCompound();
			compound.setString("RunicaLetter", ElderFutharkAlphabet.alphabet.get(i));
			ItemStack stack = new ItemStack(CommonProxy.slate);
			stack.setTagCompound(compound);
			list.add(stack);

            compound.setString("RunicaParchment", ElderFutharkAlphabet.alphabet.get(i));
            ItemStack stack2 = new ItemStack(CommonProxy.parchment);
            stack2.setTagCompound(compound);
            list.add(stack2);
		}
	}
}
