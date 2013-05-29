package xpd.charsheets;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import xpd.charsheets.listeners.PlayerListener;

public class CharSheets extends JavaPlugin {
	
	
	
	public void onEnable() {
		
		registerListeners();
		
	}
		
	private void registerListeners(){
			
		Bukkit.getPluginManager().registerEvents(new PlayerListener(this), this);
			
	}
}


