package universalteam.runica.api.spell;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public interface ISpell
{
	public String getUnlocalizedName();

	public String getDescription();

	public int getPowerUsage();

	public int getPowerFromSurroundings(EntityPlayer player, World world, int x, int y, int z);

	public void castSpell(EntityPlayer player, World world, int x, int y, int z);

	public String[] requiredSpecialEvents();

	public boolean isAllowedToCast(EntityPlayer player, World world, int x, int y, int z);
}
