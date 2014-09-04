package universalteam.runica.api;

import com.google.common.collect.Maps;
import universalteam.runica.Runica;
import universalteam.runica.api.event.ISpecialEvent;
import universalteam.runica.api.spell.ISpell;
import universalteam.universalcore.utils.UCLogger;

import java.util.Map;

public class RunicaAPI
{
	public static UCLogger logger = Runica.logger.setSubName("API");

	protected static Map<String, ISpell> spells = Maps.newHashMap();
	protected static Map<String, ISpecialEvent> specialEvents = Maps.newHashMap();

	public static void registerSpell(String uniqueID, ISpell spell)
	{
		spells.put(uniqueID, spell);
	}

	public static void registerSpecialEvent(String uniqueID, ISpecialEvent event)
	{
		specialEvents.put(uniqueID, event);
	}


	public static ISpell getSpell(String uniqueID)
	{
		return spells.get(uniqueID);
	}

	public static ISpecialEvent getSpecialEvent(String uniqueID)
	{
		return specialEvents.get(uniqueID);
	}

	public static Map<String, ISpell> getSpellMap()
	{
		return spells;
	}

	public static Map<String, ISpecialEvent> getSpecialEventMap()
	{
		return specialEvents;
	}

	protected static class SpellEntry
	{
		ISpell spell;
		String[] requiredEvents;

		public SpellEntry(ISpell spell)
		{
			this.spell = spell;
			this.requiredEvents = null;
		}
	}
}
