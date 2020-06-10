package ca.concordia.soen6461.character.decorator.impl;

import ca.concordia.soen6461.character.option.Clothings;
import ca.concordia.soen6461.characterclasses.IRanger;

public class ClothingsDecorator extends CharacterDecorator {
	protected Clothings clothings;

	public ClothingsDecorator(IRanger rangerCharacterDecorator, Clothings clothings) {
		super(rangerCharacterDecorator);
		this.clothings = clothings;
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
		return null;
	}

	@Override
	public String getClothings() {
		rangerCharacterDecorator.getClothings();
		System.out.println("XYR Character Clothings Option: " + clothings);
		return "XYR Character Clothings Option: " + clothings;
	}

}
