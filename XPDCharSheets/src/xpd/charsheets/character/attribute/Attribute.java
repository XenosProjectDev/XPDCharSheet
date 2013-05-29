package xpd.charsheets.character.attribute;

import java.util.EnumSet;
import java.util.Set;

public class Attribute {
	
	protected final String keyword = "";
	protected final Integer value = Integer.valueOf(0);
	
	protected final Set<AttributeEnum> attribute = EnumSet.noneOf(AttributeEnum.class);
	
	public Set<AttributeEnum> getAttributeSet(){
		
		return attribute;
		
	}

}