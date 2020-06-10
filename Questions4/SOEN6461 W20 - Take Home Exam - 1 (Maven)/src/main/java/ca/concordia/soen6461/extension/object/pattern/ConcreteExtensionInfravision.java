package ca.concordia.soen6461.extension.object.pattern;

public class ConcreteExtensionInfravision implements IPowerExtension {
	@Override
	public String possessPowers() {
		System.out.println("Character allow to possess: Infravision");
		return "Character allow to possess: Infravision";
	}

	ConcreteSubject subject1;

	public ConcreteExtensionInfravision(ConcreteSubject subject) {
		this.subject1 = subject;
	}

}
