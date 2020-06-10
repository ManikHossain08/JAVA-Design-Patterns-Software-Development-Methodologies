package ca.concordia.soen6461.allPlayerCharacters;

import ca.concordia.soen6461.characters.Dextrity.impl.DexterityClumsy;
import ca.concordia.soen6461.characters.Strength.impl.StrengthScrawny;
import ca.concordia.soen6461.characters.charisma.impl.CharismaConfidence;
import ca.concordia.soen6461.characters.constitution.impl.ConstitutionSick;
import ca.concordia.soen6461.characters.intelligence.impl.IntelligenceStudious;
import ca.concordia.soen6461.characters.wisdom.impl.WisdomGoodJudgement;

public class DruidCharacter extends Character {

	public DruidCharacter() {
		this.charismaCharacter = new CharismaConfidence();
		this.constitutionCharacter = new ConstitutionSick();
		this.dextrityCharacter = new DexterityClumsy();
		this.intelligenceCharacter = new IntelligenceStudious();
		this.strengthCharacter = new StrengthScrawny();
		this.wisdomCharacter = new WisdomGoodJudgement();
	}

	@Override
	public void display() {
		System.out.println("Hi, I am Druid Character in this D&D popular game.");
	}

}
