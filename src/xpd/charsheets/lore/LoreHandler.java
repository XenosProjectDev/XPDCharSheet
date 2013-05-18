package xpd.charsheets.lore;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class LoreHandler{

	public void fromArmor(Player player){
		
		PlayerInventory i = player.getInventory();
		
		List<String> boots = null;
		List<String> leggings = null;
		List<String> chestplate = null;
		List<String> helmet = null;
		
		try{
			boots = i.getBoots().getItemMeta().getLore();
		}
			catch(Exception e){}
		try{
			leggings = i.getLeggings().getItemMeta().getLore();
		}
			catch(Exception e){}
		try{
			chestplate = i.getChestplate().getItemMeta().getLore();
		}
			catch(Exception e){}
		try{
			helmet = i.getHelmet().getItemMeta().getLore();
		}
			catch(Exception e){}
		
		String all = leggings.toString()+boots.toString()+chestplate.toString()+helmet.toString();
		
		while (all.contains("§")){
			int index = all.indexOf("§");
			String sub1 = all.substring(index+2);
			String sub2 = all.substring(0, index-1);
			all = sub1+sub2;
			all.replace("index "+index+"-"+(index+1), "");
		}
	}
}
