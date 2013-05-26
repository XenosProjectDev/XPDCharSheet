package xpd.charsheets.lore;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoreMatcher {
		
	private Pattern healthP;
	private Pattern regenP;
	private Pattern hungerP;
	private Pattern attackSpeedP;
	private Pattern hasteP;
	private Pattern accuracyP;
	private Pattern critChanceP;
	private Pattern critDamageP;
	private Pattern damageRangeP;
	private Pattern damageBonusFlatP;
	private Pattern damageBonusRangeP;
	private Pattern armorPenetrationP;
	private Pattern lifestealP;
	private Pattern deflectP;
	private Pattern parryP;
	private Pattern dodgeP;
	private Pattern blockChanceP;
	private Pattern blockValueP;
	private Pattern resilienceP;
	private Pattern armorP;
	private Pattern resistanceFP;
	private Pattern resistancePP;
	private Pattern resistanceLP;
	private Pattern resistanceEP;
	private Pattern moveSpeedP;
	private Pattern slotP;
	private Pattern durabilityP;
	private Pattern weightP;
	private Pattern restrictTypeP;
	private Pattern restrictClassP;
	private Pattern restrictLevelP;
	private Pattern setBonusP;
	private Pattern bindUseP;
	private Pattern bindEquipP;
	private Pattern valueP;
	
	public HashMap loreMatcher(String lore){
		
		HashMap attributes = new HashMap();
		
		healthP = Pattern.compile("[+](\\d+)( Health)"); // +XX Health
		regenP = Pattern.compile("[+](\\d+)( Regen)"); // +XX Regen
		hungerP = Pattern.compile("[+](\\d+)( Saturation)"); // +XX Saturation
		attackSpeedP = Pattern.compile("(Speed: )(\\d+)"); // Speed: XX
		hasteP = Pattern.compile("[+](\\d+)[%]( Haste)"); // +XX% Haste
		accuracyP = Pattern.compile("[+](\\d+)( Accuracy)"); // +XX Accuracy
		critChanceP = Pattern.compile("[+](\\d+)[%]( Crit Chance)"); // +XX% CritChance
		critDamageP = Pattern.compile("[+](\\d+)( Crit Damage)");
		damageRangeP = Pattern.compile("(\\d+)(-)(\\d+)( Damage)");
		damageBonusFlatP = Pattern.compile("[+](\\d+)( Damage)");
		damageBonusRangeP = Pattern.compile("[+](\\d+)(-)(\\d+)( Damage)");
		armorPenetrationP = Pattern.compile("[+](\\d+)[%]( Armor Pen.)");
		lifestealP = Pattern.compile("[+](\\d+)( Life Steal)");
		deflectP = Pattern.compile("[+](\\d+)( Deflect)");
		parryP = Pattern.compile("[+](\\d+)( Parry)");
		dodgeP = Pattern.compile("[+](\\d+)( Dodge)");
		blockChanceP = Pattern.compile("[+](\\d+)[%]( Block Chance)");
		blockValueP = Pattern.compile("[+](\\d+)( Block Value)");
		resilienceP = Pattern.compile("[+](\\d+)( Resilience)");
		armorP = Pattern.compile("[+](\\d+)( Armor)");
		resistanceFP = Pattern.compile("[+](\\d+)( FResist)");
		resistancePP = Pattern.compile("[+](\\d+)( PResist)");
		resistanceLP = Pattern.compile("[+](\\d+)( LResist)");
		resistanceEP = Pattern.compile("[+](\\d+)( EResist)");
		moveSpeedP = Pattern.compile("[+](\\d+)( Movement)");
		slotP = Pattern.compile("(Slot: )(\\w*)");
		durabilityP = Pattern.compile("(Durability: )(\\d+)[/](\\d+)");
		weightP = Pattern.compile("(Weight: )(\\d+)");
		restrictTypeP = Pattern.compile("(Type: )(\\w*)");
		restrictClassP = Pattern.compile("(Class: )(\\w*)");
		restrictLevelP = Pattern.compile("(Level: )(\\d+)");
		//setBonusP = Pattern.compile("(Set: )(\\w*)");
		//bindUseP = Pattern.compile("[+](\\d+)( Health)");
		//bindEquipP = Pattern.compile("[+](\\d+)( Health)");
		valueP = Pattern.compile("(Value: )(\\d+)");
		
		
		
		Matcher healthM = healthP.matcher(lore);
		Matcher regenM = regenP.matcher(lore);
		Matcher hungerM = hungerP.matcher(lore);
		Matcher attackSpeedM = attackSpeedP.matcher(lore);
		Matcher hasteM = hasteP.matcher(lore);
		Matcher accuracyM = accuracyP.matcher(lore);
		Matcher critChanceM = critChanceP.matcher(lore);
		Matcher critDamageM = critDamageP.matcher(lore);
		Matcher damageRangeM = damageRangeP.matcher(lore);
		Matcher damageBonusFlatM = damageBonusFlatP.matcher(lore);
		Matcher damageBonusRangeM = damageBonusRangeP.matcher(lore);
		Matcher armorPenetrationM = armorPenetrationP.matcher(lore);
		Matcher lifestealM = lifestealP.matcher(lore);
		Matcher deflectM = deflectP.matcher(lore);
		Matcher parryM = parryP.matcher(lore);
		Matcher dodgeM = dodgeP.matcher(lore);
		Matcher blockChanceM = blockChanceP.matcher(lore);
		Matcher blockValueM = blockValueP.matcher(lore);
		Matcher resilienceM = resilienceP.matcher(lore);
		Matcher armorM = armorP.matcher(lore);
		Matcher resistanceFM = resistanceFP.matcher(lore);
		Matcher resistancePM = resistancePP.matcher(lore);
		Matcher resistanceLM = resistanceLP.matcher(lore);
		Matcher resistanceEM = resistanceEP.matcher(lore);
		Matcher moveSpeedM = moveSpeedP.matcher(lore);
		Matcher slotM = slotP.matcher(lore);
		Matcher durabilityM = durabilityP.matcher(lore);
		Matcher weightM = weightP.matcher(lore);
		Matcher restrictTypeM = restrictTypeP.matcher(lore);
		Matcher restrictClassM = restrictClassP.matcher(lore);
		Matcher restrictLevelM = restrictLevelP.matcher(lore);
		//Matcher setBonusM = setBonusP.matcher(lore);
		//Matcher bindUseM = bindUseP.matcher(lore);
		//Matcher bindEquipM = bindEquipP.matcher(lore);
		Matcher valueM = valueP.matcher(lore);
		
		return attributes;
	}
}