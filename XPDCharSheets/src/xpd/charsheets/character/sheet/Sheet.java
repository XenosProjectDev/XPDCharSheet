package xpd.charsheets.character.sheet;

import java.util.HashMap;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import xpd.charsheets.lore.LoreGrab;
import xpd.charsheets.lore.LoreMatcher;
import xpd.charsheets.character.attribute.Attribute;

public class Sheet {
	
	private Player player;
	private Entity entity;
	
	protected HashMap attributes = new HashMap<String, Integer>();
	protected HashMap sheets = new HashMap<String, Attribute>();

	public static void buildSheet(Entity entity){
		
		
		if (entity instanceof Player){
		
			Player player = (Player)entity;
						
			String armorLore = LoreGrab.getFromArmor(player);
			String handLore = LoreGrab.getFromHand(player);
			
			
			
		}
		
	}
	
}
