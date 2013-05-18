package xpd.charsheet;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable(Server server) {
		
		server.getPluginManager().registerEvents(new EventListener(), this);

	}

}
