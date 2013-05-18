package xpd.charsheets.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import xpd.charsheets.CharSheets;

public class PlayerListener implements Listener {

	private CharSheets plugin;

	public PlayerListener(CharSheets a){
		
		this.plugin = a;
		
	}
	
	@EventHandler(priority=EventPriority.LOWEST)
	  public void onPlayerInteract(PlayerInteractEvent event){
		
	}
	
}
