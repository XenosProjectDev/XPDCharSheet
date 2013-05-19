package xpd.charsheets.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

import xpd.charsheets.CharSheets;
import xpd.charsheets.characters.Sheet;

public class InventoryListener implements Listener{
	
	public InventoryListener(CharSheets a){
	}
	
		@EventHandler(priority=EventPriority.LOWEST)
		public void onClick(InventoryClickEvent event){
			
		}
		
		@EventHandler(priority=EventPriority.LOWEST)
		public void onClose(InventoryCloseEvent event){
			
			Sheet.buildSheet();
			
			
		}
}
		
