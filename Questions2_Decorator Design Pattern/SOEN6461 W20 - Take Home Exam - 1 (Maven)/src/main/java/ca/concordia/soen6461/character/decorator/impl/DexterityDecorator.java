package ca.concordia.soen6461.character.decorator.impl;

import ca.concordia.soen6461.character.option.Dexterity;
import ca.concordia.soen6461.characterclasses.IRanger;

public class DexterityDecorator extends CharacterDecorator {
	protected Dexterity dexterity;

	public DexterityDecorator(IRanger rangerCharacterDecorator, Dexterity dexterity) {
		super(rangerCharacterDecorator);
		this.dexterity = dexterity;
	}

	@Override
	public String getStrength() {
		rangerCharacterDecorator.getStrength();
		return null;
	}

	@Override
	public String getDexterity() {
		rangerCharacterDecorator.getDexterity();
		System.out.println("XYR Character's Dexterity Option: " + dexterity);
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
