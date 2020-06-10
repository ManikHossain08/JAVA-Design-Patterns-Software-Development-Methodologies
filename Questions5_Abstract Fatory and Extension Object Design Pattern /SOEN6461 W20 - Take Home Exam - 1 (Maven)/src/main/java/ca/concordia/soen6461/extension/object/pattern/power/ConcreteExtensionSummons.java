package ca.concordia.soen6461.extension.object.pattern.power;


public  class ConcreteExtensionSummons implements IPowerExtension{
	@Override
	public String possessPowers() {
		System.out.println("Character allow to possess: Summons");
		return "Character allow to possess: Summons";
	}
	
	PowerConcreteSubject subject;
	
	public ConcreteExtensionSummons(PowerConcreteSubject powerSubject) {
		this.subject = powerSubject;
	}
}
