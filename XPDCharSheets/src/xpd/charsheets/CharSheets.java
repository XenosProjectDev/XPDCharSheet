package xpd.charsheets;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

import xpd.charsheets.listeners.DamageListener;
import xpd.charsheets.listeners.InventoryListener;
import xpd.charsheets.listeners.PlayerListener;

public class CharSheets extends JavaPlugin {
	
	public static CharSheets plugin;
	public static Server server;
	
	public void onEnable() {
		
		plugin = this;
		server = getServer();
		
		registerListeners();
		
	}
		
	private void registerListeners(){
			
		server.getPluginManager().registerEvents(new PlayerListener(this), this);
		server.getPluginManager().registerEvents(new InventoryListener(this), this);
		server.getPluginManager().registerEvents(new DamageListener(this), this);
			
	}
}


