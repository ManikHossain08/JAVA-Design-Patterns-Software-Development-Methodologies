package ca.concordia.soen6461.extension.object.pattern.clothings;


public  class ConcreteExtensionHelmets implements IClothingsExtension{
	@Override
	public String wearClothings() {
		System.out.println("Character can wear: Helmets");
		return "Character can wear: Helmets";
	}
	
	ClothingsConcreteSubject subject;
	
	public ConcreteExtensionHelmets(ClothingsConcreteSubject clothingssubject) {
		this.subject = clothingssubject;
	}
}
