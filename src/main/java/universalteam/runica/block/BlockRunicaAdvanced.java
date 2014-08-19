package universalteam.runica.block;

import net.minecraft.block.material.Material;
import universalteam.runica.Runica;
import universalteam.runica.lib.Reference;
import universalteam.universalcore.block.BlockAdvanced;

public abstract class BlockRunicaAdvanced extends BlockAdvanced
{
	protected BlockRunicaAdvanced(Material material)
	{
		super(material);
	}

	@Override
	public String getModID()
	{
		return Reference.MOD_ID;
	}

	@Override
	public Object getModInstace()
	{
		return Runica.instance;
	}
}
