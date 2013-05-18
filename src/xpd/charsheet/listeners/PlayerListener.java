package xpd.charsheet.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import xpd.charsheet.XPDCharSheet;

public class PlayerListener implements Listener {
	
	public PlayerListener(XPDCharSheet a){
	}
	
	@EventHandler(priority=EventPriority.LOWEST)
	  public void onPlayerInteract(PlayerInteractEvent event){
		
	}
	
}
