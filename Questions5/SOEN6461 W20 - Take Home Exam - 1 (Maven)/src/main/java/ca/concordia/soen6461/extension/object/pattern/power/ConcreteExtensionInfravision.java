package ca.concordia.soen6461.extension.object.pattern.power;

public class ConcreteExtensionInfravision implements IPowerExtension {
	@Override
	public String possessPowers() {
		System.out.println("Character allow to possess: Infravision");
		return "Character allow to possess: Infravision";
	}

	PowerConcreteSubject subject;

	public ConcreteExtensionInfravision(PowerConcreteSubject powerSubject) {
		this.subject = powerSubject;
	}

}
