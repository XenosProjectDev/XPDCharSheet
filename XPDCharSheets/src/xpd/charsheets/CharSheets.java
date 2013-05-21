package xpd.charsheets;

import org.bukkit.Bukkit;
import org.bukkit.entity.HumanEntity;
import org.bukkit.plugin.java.JavaPlugin;

import xpd.charsheets.listeners.EntityListener;
import xpd.charsheets.listeners.InventoryListener;
import xpd.charsheets.listeners.PlayerListener;

public class CharSheets extends JavaPlugin {
	
	//private Sheet charSheet;
	//private Attributes attribute;
	//private Effects effect;
	
	public void onEnable() {
		
		registerListeners();
		
	}
		
	private void registerListeners(){
			
		Bukkit.getPluginManager().registerEvents(new PlayerListener(this), this);
		Bukkit.getPluginManager().registerEvents(new InventoryListener(this), this);
		Bukkit.getPluginManager().registerEvents(new EntityListener(this), this);
			
	}

	public CharSheets getSheet(HumanEntity player) {
		// TODO getSheet(player)
		return null;
	}
	
	public CharSheets getEffects(HumanEntity player) {
		// TODO getEffects(player)
		return null;
	}
	
	

}


