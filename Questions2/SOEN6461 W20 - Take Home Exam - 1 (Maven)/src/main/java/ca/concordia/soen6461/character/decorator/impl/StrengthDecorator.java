package ca.concordia.soen6461.character.decorator.impl;

import ca.concordia.soen6461.character.option.Strength;
import ca.concordia.soen6461.characterclasses.IRanger;

public class StrengthDecorator extends CharacterDecorator {
	
	protected Strength strength;

	public StrengthDecorator(IRanger rangerCharacterDecorator, Strength strength) {
		super(rangerCharacterDecorator);
		this.strength = strength;
	}

	@Override
	public String getStrength() {
		rangerCharacterDecorator.getStrength();
		System.out.println("XYR Character Strength Option: " + strength);
		return "XYR Character Strength Option: " + strength;
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
