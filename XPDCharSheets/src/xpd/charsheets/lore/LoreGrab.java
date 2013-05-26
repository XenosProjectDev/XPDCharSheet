package xpd.charsheets.lore;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class LoreGrab{
	
	/*
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
	*/
	
	public static String getFromArmor(Player player){
		
		String armorLore = "";
		
		for (ItemStack item : player.getEquipment().getArmorContents()){
			if ((item != null) && (item.hasItemMeta()) && (item.getItemMeta().hasLore())) {
				
				List lore = item.getItemMeta().getLore();
				armorLore = lore.toString().toLowerCase();
				
				while (armorLore.contains("§")){
					int index = armorLore.indexOf("§");
					String sub1 = armorLore.substring(index+2);
					String sub2 = armorLore.substring(0, index-1);
					armorLore = sub1+sub2;
					armorLore.replace("index "+index+"-"+(index+1), "");
					
				}
			}
		}
		
		return armorLore;

	}
	
	public static String getFromHand(Player player){
		
		ItemStack item = player.getEquipment().getItemInHand();
		String handLore = "";
		
		if ((item != null) && (item.hasItemMeta()) && (item.getItemMeta().hasLore())){
			
			List lore = item.getItemMeta().getLore();
			handLore = lore.toString().toLowerCase();
		
			while (handLore.contains("§")){
				int index = handLore.indexOf("§");
				String sub1 = handLore.substring(index+2);
				String sub2 = handLore.substring(0, index-1);
				handLore = sub1+sub2;
				handLore.replace("index "+index+"-"+(index+1), "");
				
			}
		
		}
		
		return handLore;
		
	}
}

