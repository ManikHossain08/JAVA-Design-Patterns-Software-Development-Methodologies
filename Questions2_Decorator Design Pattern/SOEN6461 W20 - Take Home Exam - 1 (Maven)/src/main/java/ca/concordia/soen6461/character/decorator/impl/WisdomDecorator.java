package ca.concordia.soen6461.character.decorator.impl;

import ca.concordia.soen6461.character.option.Wisdom;
import ca.concordia.soen6461.characterclasses.IRanger;

public class WisdomDecorator extends CharacterDecorator {
	
	protected Wisdom wisdom;

	public WisdomDecorator(IRanger rangerCharacterDecorator, Wisdom wisdom) {
		super(rangerCharacterDecorator);
		this.wisdom = wisdom;
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
		System.out.println("XYR Character Wisdom Option: " + wisdom);
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
