package ca.concordia.soen6461.extension.object.pattern.clothings;

import ca.concordia.soen6461.character.abilities.option.Clothings;

public abstract class ClothingsSubject {
	String name;
	IClothingsExtension characterExtension = null;

	protected ClothingsSubject(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract IClothingsExtension getCharacterExtension(Clothings clothings);
}
