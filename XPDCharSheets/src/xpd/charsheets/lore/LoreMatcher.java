package xpd.charsheets.lore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TODO GETS STRINGS - MATCH PATTERNS - RETURN VALUES

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
	
	public Map attributes = new HashMap();
	
	public LoreMatcher(){
		
		healthP = Pattern.compile("[+](\\d+)( Health)");
		regenP = Pattern.compile("[+](\\d+)( Regen)");
		hungerP = Pattern.compile("[+](\\d+)( Saturation)");
		attackSpeedP = Pattern.compile("(\\d+)( Speed)");
		hasteP = Pattern.compile("[+](\\d+)[%]( Haste)");
		accuracyP = Pattern.compile("[+](\\d+)( Accuracy)");
		critChanceP = Pattern.compile("[+](\\d+)[%]( Crit Chance)");
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
		
		

	}
}