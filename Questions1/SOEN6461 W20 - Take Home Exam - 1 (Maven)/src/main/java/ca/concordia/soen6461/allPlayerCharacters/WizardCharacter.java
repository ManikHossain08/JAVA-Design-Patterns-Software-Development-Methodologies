package ca.concordia.soen6461.allPlayerCharacters;

import ca.concordia.soen6461.characters.Dextrity.impl.DexterityClumsy;
import ca.concordia.soen6461.characters.Strength.impl.StrengthFit;
import ca.concordia.soen6461.characters.charisma.impl.CharismaConfidence;
import ca.concordia.soen6461.characters.constitution.impl.ConstitutionFrail;
import ca.concordia.soen6461.characters.intelligence.impl.IntelligenceForgetful;
import ca.concordia.soen6461.characters.wisdom.impl.WisdomOblivious;

public class WizardCharacter extends Character {

	public WizardCharacter() {
		this.charismaCharacter = new CharismaConfidence();
		this.constitutionCharacter = new ConstitutionFrail();
		this.dextrityCharacter = new DexterityClumsy();
		this.intelligenceCharacter = new IntelligenceForgetful();
		this.strengthCharacter = new StrengthFit();
		this.wisdomCharacter = new WisdomOblivious();
	}

	@Override
	public void display() {
		System.out.println("Hi, I am Wizard Character in this D&D popular game.");
	}

}
