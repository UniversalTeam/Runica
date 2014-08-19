package universalteam.runica.spell;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import universalteam.runica.api.spell.ISpell;

public abstract class SpellBasic implements ISpell
{
	@Override
	public abstract String getUnlocalizedName();

	@Override
	public abstract int getPowerUsage();

	@Override
	public abstract int getPowerFromSurroundings(EntityPlayer player, World world, int x, int y, int z);

	@Override
	public String getDescription()
	{
		return null;
	}

	@Override
	public abstract void castSpell(EntityPlayer player, World world, int x, int y, int z);
}
