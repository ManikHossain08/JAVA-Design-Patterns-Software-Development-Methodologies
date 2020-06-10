package ca.concordia.soen6461.extension.object.pattern.clothings;

import ca.concordia.soen6461.character.abilities.option.Clothings;

public class ClothingsConcreteSubject extends ClothingsSubject {

	public ClothingsConcreteSubject(String name) {
		super(name);
	}

	@Override
	public IClothingsExtension getCharacterExtension(Clothings clothings) {
		if (Clothings.boots == clothings) {
			ConcreteExtensionBoots boots = new ConcreteExtensionBoots(this);
			return boots;
		} else if (Clothings.armour == clothings) {
			ConcreteExtensionArmour armour = new ConcreteExtensionArmour(this);
			return armour;
		} else if (Clothings.hats == clothings) {
			ConcreteExtensionHats hats = new ConcreteExtensionHats(this);
			return hats;
		}else if (Clothings.cloaks == clothings) {
			ConcreteExtensionCloaks cloaks = new ConcreteExtensionCloaks(this);
			return cloaks;
		}else if (Clothings.helmets == clothings) {
			ConcreteExtensionHelmets helmets = new ConcreteExtensionHelmets(this);
			return helmets;
		}
		return null;
	}

}
