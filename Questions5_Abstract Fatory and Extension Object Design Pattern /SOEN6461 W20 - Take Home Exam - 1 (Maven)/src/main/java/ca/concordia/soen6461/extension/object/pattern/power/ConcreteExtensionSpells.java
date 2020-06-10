package ca.concordia.soen6461.extension.object.pattern.power;


public  class ConcreteExtensionSpells implements IPowerExtension{
	@Override
	public String possessPowers() {
		System.out.println("Character allow to possess: Spells");
		return "Character allow to possess: Spells";
	}
	
	PowerConcreteSubject subject;
	
	public ConcreteExtensionSpells(PowerConcreteSubject powerSubject) {
		this.subject = powerSubject;
	}

}
