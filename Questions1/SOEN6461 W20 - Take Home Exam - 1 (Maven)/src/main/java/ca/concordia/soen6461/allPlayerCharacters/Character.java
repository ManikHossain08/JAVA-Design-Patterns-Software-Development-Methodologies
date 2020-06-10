package ca.concordia.soen6461.allPlayerCharacters;


import ca.concordia.soen6461.characters.ICharismaCharacter;
import ca.concordia.soen6461.characters.IConstitutionCharacter;
import ca.concordia.soen6461.characters.IDextrityCharacter;
import ca.concordia.soen6461.characters.IIntelligenceCharacter;
import ca.concordia.soen6461.characters.IStrengthCharacter;
import ca.concordia.soen6461.characters.IWisdomCharacter;

public abstract class Character {
	ICharismaCharacter charismaCharacter;
	IConstitutionCharacter constitutionCharacter;
	IDextrityCharacter dextrityCharacter;
	IIntelligenceCharacter intelligenceCharacter;
	IStrengthCharacter strengthCharacter;
	IWisdomCharacter wisdomCharacter;

	public Character() {
		// empty
	}

	public String performCharismaCharacter() {
		return this.charismaCharacter.charisma();
	}
	
	public void performConstitutionCharacter() {
		this.constitutionCharacter.constitution();
	}
	
	public void performDextrityCharacter() {
		this.dextrityCharacter.dextrity();
	}
	
	public void performIntelligenceCharacter() {
		this.intelligenceCharacter.intelligence();
	}
	
	public void performStrengthCharacter() {
		this.strengthCharacter.strength();
	}
	
	public void performWisdomCharacter() {
		this.wisdomCharacter.wisdom();
	}
	
	public void setCharismaCharacter(ICharismaCharacter cc) {
		this.charismaCharacter = cc;
	}
	
	public void setConstitutionCharacter(IConstitutionCharacter cc) {
		this.constitutionCharacter = cc;
	}
	
	public void setIDextrityCharacter(IDextrityCharacter dc) {
		this.dextrityCharacter = dc;
	}
	
	public void setIntelligenceCharacter(IIntelligenceCharacter ic) {
		this.intelligenceCharacter = ic;
	}
	
	public void setIStrengthCharacter(IStrengthCharacter sc) {
		this.strengthCharacter = sc;
	}
	
	public void setWisdomCharacter(IWisdomCharacter wc) {
		this.wisdomCharacter = wc;
	}
	// this method needs to implements to the subclasses who inherit this abstract class
	public abstract void display();

}
