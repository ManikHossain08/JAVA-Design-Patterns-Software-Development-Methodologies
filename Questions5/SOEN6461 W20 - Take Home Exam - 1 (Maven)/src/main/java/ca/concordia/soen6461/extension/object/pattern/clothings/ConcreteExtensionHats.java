package ca.concordia.soen6461.extension.object.pattern.clothings;


public  class ConcreteExtensionHats implements IClothingsExtension{
	@Override
	public String wearClothings() {
		System.out.println("Character can wear: Hats");
		return "Character can wear: Hats";
	}
	
	ClothingsConcreteSubject subject;
	
	public ConcreteExtensionHats(ClothingsConcreteSubject clothingssubject) {
		this.subject = clothingssubject;
	}
}
