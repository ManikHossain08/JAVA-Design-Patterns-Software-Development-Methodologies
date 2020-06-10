package ca.concordia.soen6461.extension.object.pattern;


public  class ConcreteExtensionSpells implements IPowerExtension{
	@Override
	public String possessPowers() {
		System.out.println("Character allow to possess: Spells");
		return "Character allow to possess: Spells";
	}
	
	ConcreteSubject subject1;
	
	public ConcreteExtensionSpells(ConcreteSubject subject) {
		this.subject1 = subject;
	}

}
