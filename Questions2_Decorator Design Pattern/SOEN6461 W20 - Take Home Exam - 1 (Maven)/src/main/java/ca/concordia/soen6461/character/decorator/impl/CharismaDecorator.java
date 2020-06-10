package ca.concordia.soen6461.character.decorator.impl;

import ca.concordia.soen6461.character.option.Charisma;
import ca.concordia.soen6461.characterclasses.IRanger;

public class CharismaDecorator extends CharacterDecorator {
	protected Charisma charisma;

	public CharismaDecorator(IRanger rangerCharacterDecorator, Charisma charisma) {
		super(rangerCharacterDecorator);
		this.charisma = charisma;
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
		System.out.println("XYR Character Charisma Option: " + charisma);
		return "XYR Character Charisma Option: " + charisma;
	}

	@Override
	public String getClothings() {
		rangerCharacterDecorator.getClothings();
		return null;
	}

}
