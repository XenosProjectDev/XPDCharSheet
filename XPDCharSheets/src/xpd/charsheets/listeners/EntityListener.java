package xpd.charsheets.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import xpd.charsheets.CharSheets;

public class EntityListener implements Listener {
	
	private CharSheets plugin;

	public EntityListener(CharSheets a){
		
		this.plugin = a;
		
		}
	
	@EventHandler(priority=EventPriority.LOWEST)
	public void onDamage(EntityDamageByEntityEvent event){
		
	}

}
