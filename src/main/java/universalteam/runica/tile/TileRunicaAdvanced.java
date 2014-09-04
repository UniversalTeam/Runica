package universalteam.runica.tile;

import universalteam.runica.network.PacketConstants;
import universalteam.universalcore.tile.TileAdvanced;

public abstract class TileRunicaAdvanced extends TileAdvanced
{
	@Override
	public String getChannelName()
	{
		return PacketConstants.CHANNEL;
	}
}
