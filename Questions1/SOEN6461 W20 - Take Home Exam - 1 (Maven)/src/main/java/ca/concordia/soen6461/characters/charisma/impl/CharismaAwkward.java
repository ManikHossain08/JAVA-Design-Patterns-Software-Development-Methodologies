package ca.concordia.soen6461.characters.charisma.impl;

import ca.concordia.soen6461.characters.ICharismaCharacter;

public class CharismaAwkward implements ICharismaCharacter{

	@Override
	public String charisma() {
		System.out.println("This Charisma innate abilities has Awkward Characteristics.");
		return "This Charisma innate abilities has Awkward Characteristics.";
	}
	
}
