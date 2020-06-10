package ca.concordia.soen6461.extension.object.pattern;


public  class ConcreteExtensionSummons implements IPowerExtension{
	@Override
	public String possessPowers() {
		System.out.println("Character allow to possess: Summons");
		return "Character allow to possess: Summons";
	}
	
	ConcreteSubject subject1;
	
	public ConcreteExtensionSummons(ConcreteSubject subject) {
		this.subject1 = subject;
	}
}
