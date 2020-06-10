package ca.concordia.soen6461.character.decorator.impl;

import ca.concordia.soen6461.characterclasses.IRanger;

public abstract class CharacterDecorator implements IRanger {
	
	protected IRanger rangerCharacterDecorator;

	public CharacterDecorator(IRanger rangerCharacterDecorator) {
		super();
		this.rangerCharacterDecorator = rangerCharacterDecorator;
	}
}
