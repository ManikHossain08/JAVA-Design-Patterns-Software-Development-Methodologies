/* (c) Copyright 2020 and following years, Yann-Gaël Guéhéneuc,
 * Concordia University.
 * 
 * Use and copying of this software and preparation of derivative works
 * based upon this software are permitted. Any copy of this software or
 * of any derivative work must include the above copyright notice of
 * the author, this paragraph and the one after it.
 * 
 * This software is made available AS IS, and THE AUTHOR DISCLAIMS
 * ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE, AND NOT WITHSTANDING ANY OTHER PROVISION CONTAINED HEREIN,
 * ANY LIABILITY FOR DAMAGES RESULTING FROM THE SOFTWARE OR ITS USE IS
 * EXPRESSLY DISCLAIMED, WHETHER ARISING IN CONTRACT, TORT (INCLUDING
 * NEGLIGENCE) OR STRICT LIABILITY, EVEN IF THE AUTHOR IS ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 * 
 * All Rights Reserved.
 */
package ca.concordia.soen6461.characterclasses.impl;

import ca.concordia.soen6461.characterclasses.IBarbarian;

public class Barbarian implements IBarbarian {

	@Override
	public String getStrength() {
		return "Barbarian Character for for Strength";
	}

	@Override
	public String getDexterity() {
		return "Barbarian Character for Dexterity";
	}

	@Override
	public String getConstitution() {
		return "Barbarian Character for Constitution";
	}

	@Override
	public String getIntelligence() {
		return "Barbarian Character for Intelligence";
	}

	@Override
	public String getWisdom() {
		return "Barbarian Character for Wisdom";
	}

	@Override
	public String getCharisma() {
		return "Barbarian Character for Charisma";
	}

	@Override
	public String getClothings() {
		return "Barbarian Character for Clothings";
	}

	@Override
	public String getSatchels() {
		return "Barbarian Character for Satchels";
	}

	@Override
	public String getBoxes() {
		return "Barbarian Character for Boxes";
	}
}
