package xpd.charsheets.lore;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class LoreGrab{

	//TODO GETLORE then RETURN STRINGS
	
	public static String getFromArmor(Player player){
		
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
		
		String armorLore = leggings.toString()+boots.toString()+chestplate.toString()+helmet.toString();
		
		while (armorLore.contains("§")){
			int index = armorLore.indexOf("§");
			String sub1 = armorLore.substring(index+2);
			String sub2 = armorLore.substring(0, index-1);
			armorLore = sub1+sub2;
			armorLore.replace("index "+index+"-"+(index+1), "");
		}
		
		return armorLore;
		
	}
	
	public String getFromHand(Player player){
		
		String handLore = player.getItemInHand().getItemMeta().getLore().toString();
		
		while (handLore.contains("§")){
			int index = handLore.indexOf("§");
			String sub1 = handLore.substring(index+2);
			String sub2 = handLore.substring(0, index-1);
			handLore = sub1+sub2;
			handLore.replace("index "+index+"-"+(index+1), "");
			
		}
		
		return handLore;
		
	}
}
