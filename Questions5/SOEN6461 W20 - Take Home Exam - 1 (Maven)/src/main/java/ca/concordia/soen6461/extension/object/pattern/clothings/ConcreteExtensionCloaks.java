package ca.concordia.soen6461.extension.object.pattern.clothings;


public  class ConcreteExtensionCloaks implements IClothingsExtension{
	@Override
	public String wearClothings() {
		System.out.println("Character can wear: Cloaks");
		return "Character can wear: Cloaks";
	}
	
	ClothingsConcreteSubject subject;
	
	public ConcreteExtensionCloaks(ClothingsConcreteSubject clothingssubject) {
		this.subject = clothingssubject;
	}
}
