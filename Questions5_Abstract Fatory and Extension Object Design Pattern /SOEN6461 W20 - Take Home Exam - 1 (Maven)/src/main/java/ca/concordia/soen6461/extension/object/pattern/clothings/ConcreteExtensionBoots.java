package ca.concordia.soen6461.extension.object.pattern.clothings;


public  class ConcreteExtensionBoots implements IClothingsExtension{
	@Override
	public String wearClothings() {
		System.out.println("Character can wear: Boots");
		return "Character allow to possess: Boots";
	}
	
	ClothingsConcreteSubject subject;
	
	public ConcreteExtensionBoots(ClothingsConcreteSubject clothingssubject) {
		this.subject = clothingssubject;
	}

}
