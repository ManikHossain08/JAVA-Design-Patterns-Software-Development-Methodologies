package ca.concordia.soen6461.extension.object.pattern.power;

import ca.concordia.soen6461.character.abilities.option.Powers;

public abstract class PowerSubject {
	String name;
	IPowerExtension characterExtension = null;

	protected PowerSubject(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract IPowerExtension getCharacterExtension(Powers powers);
}
