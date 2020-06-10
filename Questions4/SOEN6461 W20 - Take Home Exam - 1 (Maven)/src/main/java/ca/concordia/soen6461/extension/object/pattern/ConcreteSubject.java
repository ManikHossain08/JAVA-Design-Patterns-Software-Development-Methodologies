package ca.concordia.soen6461.extension.object.pattern;

import ca.concordia.soen6461.character.abilities.option.Powers;

public class ConcreteSubject extends Subject {

	public ConcreteSubject(String name) {
		super(name);
	}

	@Override
	public IPowerExtension getCharacterExtension(Powers powers) {
		if (Powers.spells == powers) {
			ConcreteExtensionSpells ext1 = new ConcreteExtensionSpells(this);
			return ext1;
		} else if (Powers.infravision == powers) {
			ConcreteExtensionInfravision ext1 = new ConcreteExtensionInfravision(this);
			return ext1;
		} else if (Powers.summons == powers) {
			ConcreteExtensionSummons ext1 = new ConcreteExtensionSummons(this);
			return ext1;
		}
		return null;
	}

}
