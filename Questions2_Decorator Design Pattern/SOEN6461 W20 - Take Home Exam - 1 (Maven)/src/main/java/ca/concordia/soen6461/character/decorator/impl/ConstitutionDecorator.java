package ca.concordia.soen6461.character.decorator.impl;

import ca.concordia.soen6461.character.option.Constitution;
import ca.concordia.soen6461.characterclasses.IRanger;

public class ConstitutionDecorator extends CharacterDecorator {
	protected Constitution constitution;

	public ConstitutionDecorator(IRanger rangerCharacterDecorator, Constitution constitution) {
		super(rangerCharacterDecorator);
		this.constitution = constitution;
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
		System.out.println("XYR Character Constitution Option: " + constitution);
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
