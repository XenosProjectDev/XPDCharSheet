package xpd.charsheet;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import xpd.charsheet.listeners.PlayerListener;

public class XPDCharSheet extends JavaPlugin {
	
	public void onEnable() {
		
		registerListeners();
		
	}
		
	private void registerListeners(){
			
		Bukkit.getPluginManager().registerEvents(new PlayerListener(this), this);
			
	}

}


