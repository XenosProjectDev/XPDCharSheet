package xpd.charsheets.attributes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class Attributes {
	
	public void matchArmor(Entity damager){

			Player player = ((Player) damager);
			
			final PlayerInventory i = player.getInventory();
			
			String all = null;
			String all1 = null;
			String all2 = null;
			String all3 = null;
			String all4 = null;
			
			List<String> boots = null;
			List<String> leggings = null;
			List<String> chestplate = null;
			List<String> helmet = null;
			
			try {boots = i.getBoots().getItemMeta().getLore();}
				catch (Exception e) {}
			try {leggings = i.getLeggings().getItemMeta().getLore();}
				catch (Exception e) {}
			try {chestplate = i.getChestplate().getItemMeta().getLore();}
				catch (Exception e) {}
			try {helmet = i.getHelmet().getItemMeta().getLore();}
				catch (Exception e) {}
			
			if (boots != null) {
				all1 = boots.toString();
			}
				else {
					all1 = "";
				}
			
			if (leggings != null) {
				all2 = leggings.toString();
			}
				else {
					all2 = "";
				}
			
			if (chestplate != null) {
				all3 = chestplate.toString();}
				else {
					all3 = "";}
			
			if (helmet != null) {
				all4 = helmet.toString();}
				else {
					all4 = "";}
			
			all = all1 + all2 + all3 + all4;
			while (all.contains("§")) {
				int index = all.indexOf("§");
				String sub1 = all.substring(index + 2);
				String sub2 = all.substring(0, index);
				all = sub2 + sub1;
			}
			
			int finaltotal1 = 0;
			int finaltotal2 = 0;
			int finaltotal3 = 0;
			int finaltotal4 = 0;
			int finaltotal5 = 0;
			int finaltotal6 = 0;
			
			while (all.contains("+")) {
				int index = all.indexOf("+");
				String sub1 = all.substring(index + 1);
				String sub2 = all.substring(0, index);
				all = sub2 + sub1;

			}
			Pattern strp = Pattern.compile("(Strength )(\\d+)");
			Matcher strm = strp.matcher(all);

			while (strm.find()) {
				int total1 = Integer.parseInt(strm.group(2));
				finaltotal1 = total1 + finaltotal1;
			}

			int Strength = finaltotal1;
			player.sendMessage("Strength: " + Strength);
			Pattern precp = Pattern.compile("(Precision )(\\d+)");
			Matcher precm = precp.matcher(all);

			while (precm.find()) {
				int total2 = Integer.parseInt(precm.group(2));
				finaltotal2 = total2 + finaltotal2;
			}

			int Precision = finaltotal2;
			player.sendMessage("Precision: " + Precision);
			Pattern wisp = Pattern.compile("(Wisdom )(\\d+)");
			Matcher wism = wisp.matcher(all);

			while (wism.find()) {
				int total3 = Integer.parseInt(wism.group(2));
				finaltotal3 = total3 + finaltotal3;
			}

			int Wisdom = finaltotal3;
			player.sendMessage("Wisdom: " + Wisdom);
			Pattern intp = Pattern.compile("(Intellect )(\\d+)");
			Matcher intm = intp.matcher(all);

			while (intm.find()) {
				int total4 = Integer.parseInt(intm.group(2));
				finaltotal4 = total4 + finaltotal4;
			}

			int Intellect = finaltotal4;
			player.sendMessage("Intellect: " + Intellect);
			Pattern agip = Pattern.compile("(Agility )(\\d+)");
			Matcher agim = agip.matcher(all);

			while (agim.find()) {
				int total5 = Integer.parseInt(agim.group(2));
				finaltotal5 = total5 + finaltotal5;
			}

			int Agility = finaltotal5;
			player.sendMessage("Agility: " + Agility);
			Pattern hpp = Pattern.compile("(Health )(\\d+)");
			Matcher hpm = hpp.matcher(all);

			while (hpm.find()) {
				int total6 = Integer.parseInt(hpm.group(2));
				finaltotal6 = total6 + finaltotal6;
			}

			int Health = finaltotal6;
			player.sendMessage("Health: " + Health);

}}
