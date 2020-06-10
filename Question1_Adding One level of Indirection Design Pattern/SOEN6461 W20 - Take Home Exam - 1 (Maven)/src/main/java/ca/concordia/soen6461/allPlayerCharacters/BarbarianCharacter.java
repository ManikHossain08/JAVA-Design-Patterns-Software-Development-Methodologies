package ca.concordia.soen6461.allPlayerCharacters;

import ca.concordia.soen6461.characters.Dextrity.impl.DexteritySneaky;
import ca.concordia.soen6461.characters.Strength.impl.StrengthBurly;
import ca.concordia.soen6461.characters.charisma.impl.CharismaAwkward;
import ca.concordia.soen6461.characters.constitution.impl.ConstitutionHealthy;
import ca.concordia.soen6461.characters.intelligence.impl.IntelligenceInquisitive;
import ca.concordia.soen6461.characters.wisdom.impl.WisdomFoolish;

public class BarbarianCharacter extends Character{

	public BarbarianCharacter() {
		this.charismaCharacter = new CharismaAwkward();
		this.constitutionCharacter = new ConstitutionHealthy();
		this.dextrityCharacter = new DexteritySneaky();
		this.intelligenceCharacter = new IntelligenceInquisitive();
		this.strengthCharacter = new StrengthBurly();
		this.wisdomCharacter = new WisdomFoolish();
	}
	
	@Override
	public void display() {
		System.out.println("Hi, I am Barbarian Character in this D&D popular game.");
	}

}
