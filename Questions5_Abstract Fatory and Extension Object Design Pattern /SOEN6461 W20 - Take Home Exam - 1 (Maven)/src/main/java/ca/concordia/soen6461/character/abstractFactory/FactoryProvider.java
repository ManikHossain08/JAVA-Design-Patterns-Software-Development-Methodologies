package ca.concordia.soen6461.character.abstractFactory;

import ca.concordia.soen6461.character.abilities.option.AbilityType;
import ca.concordia.soen6461.character.abilities.option.Boxes;
import ca.concordia.soen6461.character.abilities.option.Charisma;
import ca.concordia.soen6461.character.abilities.option.Clothings;
import ca.concordia.soen6461.character.abilities.option.Constitution;
import ca.concordia.soen6461.character.abilities.option.Dexterity;
import ca.concordia.soen6461.character.abilities.option.Intelligence;
import ca.concordia.soen6461.character.abilities.option.Satchels;
import ca.concordia.soen6461.character.abilities.option.Strength;
import ca.concordia.soen6461.character.abilities.option.Wisdom;

public class FactoryProvider {
	public static AbstractFactory getFactory(AbilityType abilityType) {
		if (AbilityType.Charisma == abilityType) {
			return new CharismaFactory();
		} else if (AbilityType.Boxes == abilityType) {
			return new BoxesFactory();
		} else if (AbilityType.Clothings == abilityType) {
			return new ClothingsFactory();
		} else if (AbilityType.Constitution == abilityType) {
			return new ConstituteFactory();
		} else if (AbilityType.Dextrity == abilityType) {
			return new DexterityFactory();
		} else if (AbilityType.Intelligence == abilityType) {
			return new IntelligenceFactory();
		} else if (AbilityType.Satchels == abilityType) {
			return new SatchelsFactory();
		} else if (AbilityType.Strength == abilityType) {
			return new StrengthFactory();
		} else if (AbilityType.Wisdom == abilityType) {
			return new WisdomFactory();
		}
		return null;
	}

	public static AbstractFactory getFactoryBoxes(AbilityType abilityType, Boxes boxes) {
		System.out.println("Character Can Carry: " + boxes.toString());
		return getFactory(abilityType);
	}

	public static AbstractFactory getFactorySatchels(AbilityType abilityType, Satchels satchels) {
		System.out.println("Character Can Carry: " + satchels.toString());
		return getFactory(abilityType);
	}

	public static AbstractFactory getFactoryCharisma(AbilityType abilityType, Charisma charisma) {
		System.out.println("Character have innate ability: " + charisma.toString());
		return getFactory(abilityType);
	}

	public static AbstractFactory getFactoryClothings(AbilityType abilityType, Clothings clothings) {
		System.out.println("Character have innate ability: " + clothings.toString());
		return getFactory(abilityType);
	}

	public static AbstractFactory getFactoryConstitution(AbilityType abilityType, Constitution constitution) {
		System.out.println("Character have innate ability: " + constitution.toString());
		return getFactory(abilityType);
	}

	public static AbstractFactory getFactoryDexterity(AbilityType abilityType, Dexterity dexterity) {
		System.out.println("Character have innate ability: " + dexterity.toString());
		return getFactory(abilityType);
	}

	public static AbstractFactory getFactoryIntelligence(AbilityType abilityType, Intelligence intelligence) {
		System.out.println("Character have innate ability: " + intelligence.toString());
		return getFactory(abilityType);
	}

	public static AbstractFactory getFactoryStrength(AbilityType abilityType, Strength strength) {
		System.out.println("Character have innate ability: " + strength.toString());
		return getFactory(abilityType);
	}

	public static AbstractFactory getFactoryWisdom(AbilityType abilityType, Wisdom wisdom) {
		System.out.println("Character have innate ability: " + wisdom.toString());
		return getFactory(abilityType);
	}

}
