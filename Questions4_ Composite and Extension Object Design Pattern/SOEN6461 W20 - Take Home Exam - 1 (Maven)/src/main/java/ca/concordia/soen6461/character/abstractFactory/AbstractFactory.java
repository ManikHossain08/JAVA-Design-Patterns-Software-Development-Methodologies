package ca.concordia.soen6461.character.abstractFactory;

import ca.concordia.soen6461.character.abilities.option.CharacterType;
import ca.concordia.soen6461.characterclasses.ICharacter;

public abstract class AbstractFactory {
	public abstract ICharacter getCharacter(CharacterType fName);
}
