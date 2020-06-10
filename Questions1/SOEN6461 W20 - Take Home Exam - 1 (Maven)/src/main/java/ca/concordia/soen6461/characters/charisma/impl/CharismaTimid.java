package ca.concordia.soen6461.characters.charisma.impl;

import ca.concordia.soen6461.characters.ICharismaCharacter;

public class CharismaTimid implements ICharismaCharacter{

	@Override
	public String charisma() {
		System.out.println("This Charisma innate abilities has Timid Characteristics.");
		return "This Charisma innate abilities has Timid Characteristics.";
	}
	
}
