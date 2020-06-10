package ca.concordia.soen6461.allPlayerCharacters;

import ca.concordia.soen6461.characters.Dextrity.impl.DexteritySlim;
import ca.concordia.soen6461.characters.Strength.impl.StrengthPlump;
import ca.concordia.soen6461.characters.charisma.impl.CharismaLeadership;
import ca.concordia.soen6461.characters.constitution.impl.ConstitutionStrong;
import ca.concordia.soen6461.characters.intelligence.impl.IntelligenceInquisitive;
import ca.concordia.soen6461.characters.wisdom.impl.WisdomFoolish;

public class RangerCharacter extends Character {

	public RangerCharacter() {
		this.charismaCharacter = new CharismaLeadership();
		this.constitutionCharacter = new ConstitutionStrong();
		this.dextrityCharacter = new DexteritySlim();
		this.intelligenceCharacter = new IntelligenceInquisitive();
		this.strengthCharacter = new StrengthPlump();
		this.wisdomCharacter = new WisdomFoolish();
	}

	@Override
	public void display() {
		System.out.println("Hi, I am Ranger Character in this D&D popular game.");
	}

}
