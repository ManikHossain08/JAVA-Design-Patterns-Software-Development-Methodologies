package ca.concordia.soen6461.extension.object.pattern.clothings;

public class ConcreteExtensionArmour implements IClothingsExtension {
	@Override
	public String wearClothings() {
		System.out.println("Character can wear: Armour");
		return "Character can wear: Armour";
	}

	ClothingsConcreteSubject subject;

	public ConcreteExtensionArmour(ClothingsConcreteSubject clothingsSubject) {
		this.subject = clothingsSubject;
	}

}
