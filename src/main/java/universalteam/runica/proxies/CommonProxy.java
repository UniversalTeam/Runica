package universalteam.runica.proxies;

import universalteam.runica.lib.Reference;
import universalteam.universalcore.version.UCVersion;
import universalteam.universalcore.version.UCVersionChecker;

public class CommonProxy
{
	public void preInit()
	{
		UCVersionChecker.registerModVersion(new UCVersion(Reference.MOD_VERSION, "https://raw.githubusercontent.com/UniversalTeam/UCModVersions/master/Runica/version.json"));
	}

	public void Init()
	{

	}

	public void postInit()
	{

	}
}
