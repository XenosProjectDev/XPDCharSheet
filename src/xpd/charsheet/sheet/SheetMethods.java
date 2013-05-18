package xpd.charsheet.sheet;

import org.bukkit.entity.Player;

public class SheetMethods {
	
	public static void setHealth(Player player, int value){
		
		player.setMaxHealth(value);
		player.setHealth(value);
		player.damage(0);
		player.sendMessage("Your HP was set to: " +value);
		
	}
	
	public static void setLevel(Player player, int value){
		
		player.setLevel(value);
		player.sendMessage("Your level was set to: " +value);
		
	}
	

}
