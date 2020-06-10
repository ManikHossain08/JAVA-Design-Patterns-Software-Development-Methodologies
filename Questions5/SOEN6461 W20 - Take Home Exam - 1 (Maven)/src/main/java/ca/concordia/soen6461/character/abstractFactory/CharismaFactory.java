package ca.concordia.soen6461.character.abstractFactory;

import ca.concordia.soen6461.character.abilities.option.CharacterType;
import ca.concordia.soen6461.characterclasses.ICharacter;
import ca.concordia.soen6461.characterclasses.impl.Barbarian;
import ca.concordia.soen6461.characterclasses.impl.Druid;
import ca.concordia.soen6461.characterclasses.impl.Ranger;
import ca.concordia.soen6461.characterclasses.impl.Wizard;

public class CharismaFactory extends AbstractFactory {

	@Override
	public ICharacter getCharacter(CharacterType fName) {

		if (CharacterType.Barbarian == fName) {
			return new Barbarian();
		} else if (CharacterType.Druid == fName) {
			return new Druid();
		} else if (CharacterType.Wizard == fName) {
			return new Wizard();
		} else if (CharacterType.Ranger == fName) {
			return new Ranger();
		}

		return null;
	}

//	@Override
//	ICharacter getAbilities(AbilityType fName) {
//		return null;
//	}

}
