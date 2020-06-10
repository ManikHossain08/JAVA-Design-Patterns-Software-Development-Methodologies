package ca.concordia.soen6461.character.decorator.impl;

import ca.concordia.soen6461.character.option.Intelligence;
import ca.concordia.soen6461.characterclasses.IRanger;

public class IntelligenceDecorator extends CharacterDecorator {
	
	protected Intelligence intelligence;

	public IntelligenceDecorator(IRanger rangerCharacterDecorator, Intelligence intelligence) {
		super(rangerCharacterDecorator);
		this.intelligence = intelligence;
	}

	@Override
	public String getStrength() {
		rangerCharacterDecorator.getStrength();
		return null;
	}

	@Override
	public String getDexterity() {
		rangerCharacterDecorator.getDexterity();
		return null;
	}

	@Override
	public String getConstitution() {
		rangerCharacterDecorator.getConstitution();
		return null;
	}

	@Override
	public String getIntelligence() {
		rangerCharacterDecorator.getIntelligence();
		System.out.println("XYR Character Intelligence Option: " + intelligence);
		return null;
	}

	@Override
	public String getWisdom() {
		rangerCharacterDecorator.getWisdom();
		return null;
	}

	@Override
	public String getCharisma() {
		rangerCharacterDecorator.getCharisma();
		
		return null;
	}

	@Override
	public String getClothings() {
		rangerCharacterDecorator.getClothings();
		return null;
	}

}
