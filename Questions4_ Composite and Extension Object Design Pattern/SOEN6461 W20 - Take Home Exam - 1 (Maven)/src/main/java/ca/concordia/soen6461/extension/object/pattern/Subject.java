package ca.concordia.soen6461.extension.object.pattern;

import ca.concordia.soen6461.character.abilities.option.Powers;

public abstract class Subject {
	String name;
	IPowerExtension characterExtension = null;

	protected Subject(String name) {
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
