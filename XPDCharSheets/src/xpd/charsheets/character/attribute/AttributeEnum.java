package xpd.charsheets.character.attribute;

public enum AttributeEnum {
		
	HEALTH("health", 10),
	REGEN("regen", 10),
	HUNGER("saturation", 10),
	ATTACKSPEED("speed", 10),
	HASTE("haste", 10),
	ACCURACY("accuracy", 10),
	CRITCHANCE("crit chance", 10),
	CRITDAMAGE("crit damage", 10),
	DAMAGE("damage", 10),
	DAMAGERANGE("damage range", 10),
	DAMAGEBONUSFLAT("damage bonus", 10),
	DAMAGEBONUSRANGE("bonus range", 10),
	ARMORPENETRATION("armor penetration", 10),
	LIFESTEAL("lifesteal", 10),
	DEFLECT("deflect", 10),
	PARRY("parry", 10),
	DODGE("dodge", 10),
	BLOCKCHANCE("block chance", 10),
	BLOCKVALUE("block value", 10),
	RESILIENCE("resilience", 10),
	ARMOR("armor", 10),
	RESISTANCEFIRE("fire resist", 10),
	RESISTANCELIGHTNING("lightning resist", 10),
	RESISTANCEPPOISON("poison resist", 10),
	RESISTANCEEXPLOSION("explosion resist", 10),
	MOVESPEED("movement", 10),
	DURABILITY("durability", 10),
	WEIGHT("weight", 10),
	RESTRICTSLOT("slot restriction", 10),
	RESTRICTTYPE("type restriction", 10),
	RESTIRCTCLASS("class restriction", 10),
	RESTRICTLEVEL("level restriction", 10),
	BINDUSE("bind on use", 10),
	BINDEQUIP("bind on equip", 10),
	VALUE("value", 10);
	
	private final int value;
	private final String name;
	
	AttributeEnum(String name, int value) { this.name = name; this.value = value; }
	
	public String getName() { return name; }
	public int getValue() { return value; }
	
}