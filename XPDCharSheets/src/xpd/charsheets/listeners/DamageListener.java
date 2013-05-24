package xpd.charsheets.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import xpd.charsheets.CharSheets;

public class DamageListener implements Listener {
	
	private CharSheets plugin;

	public DamageListener(CharSheets a){
		
		this.plugin = a;
		
		}
	
	@EventHandler(priority=EventPriority.LOWEST)
	public void entityDamageEntity(EntityDamageByEntityEvent event){
		
		if  (event.getDamager() instanceof Player){
			
			Player player = ((Player)event.getDamager());
			
				if (event.getEntity() instanceof LivingEntity){
					
					Entity entity = event.getEntity();
					
					
				}
		}
	}
}