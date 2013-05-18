package xpd.charsheet;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import xpd.charsheet.sheet.SheetMethods;

public class EventListener implements Listener {
	
	@EventHandler(priority=EventPriority.MONITOR)
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		SheetMethods.setHealth(player, 100);
		
	}
	
}
