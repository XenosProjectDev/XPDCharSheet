package xpd.charsheets.character;

import java.util.HashMap;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import xpd.charsheets.lore.LoreGrab;
import xpd.charsheets.lore.LoreMatcher;

public class Sheet {

	public static void buildSheet(Entity entity){
		
		if (entity instanceof Player){
		
			Player player = (Player)entity;
			
			String allLore = LoreGrab.getFromArmor(player);
			String handLore = LoreGrab.getFromHand(player);
			
			
		}
		
	}
	
}
