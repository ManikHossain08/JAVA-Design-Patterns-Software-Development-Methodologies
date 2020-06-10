package ca.concordia.soen6461.extension.object.pattern.power;

import ca.concordia.soen6461.character.abilities.option.Powers;

public class PowerConcreteSubject extends PowerSubject {

	public PowerConcreteSubject(String name) {
		super(name);
	}

	@Override
	public IPowerExtension getCharacterExtension(Powers powers) {
		if (Powers.spells == powers) {
			ConcreteExtensionSpells spells = new ConcreteExtensionSpells(this);
			return spells;
		} else if (Powers.infravision == powers) {
			ConcreteExtensionInfravision infravision = new ConcreteExtensionInfravision(this);
			return infravision;
		} else if (Powers.summons == powers) {
			ConcreteExtensionSummons summons = new ConcreteExtensionSummons(this);
			return summons;
		}
		return null;
	}

}
