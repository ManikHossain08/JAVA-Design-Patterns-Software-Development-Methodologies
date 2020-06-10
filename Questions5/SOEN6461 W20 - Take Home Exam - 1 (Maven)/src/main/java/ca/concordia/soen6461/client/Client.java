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
package ca.concordia.soen6461.client;

import ca.concordia.soen6461.EODP.power.impl.RangerPower;
import ca.concordia.soen6461.character.abilities.option.AbilityType;
import ca.concordia.soen6461.character.abilities.option.Boxes;
import ca.concordia.soen6461.character.abilities.option.CharacterType;
import ca.concordia.soen6461.character.abilities.option.Clothings;
import ca.concordia.soen6461.character.abilities.option.Powers;
import ca.concordia.soen6461.character.abilities.option.Satchels;
import ca.concordia.soen6461.character.abilities.option.Strength;
import ca.concordia.soen6461.character.abstractFactory.AbstractFactory;
import ca.concordia.soen6461.character.abstractFactory.FactoryProvider;
import ca.concordia.soen6461.characterclasses.ICharacter;
import ca.concordia.soen6461.characterclasses.impl.Ranger;
import ca.concordia.soen6461.extension.object.pattern.power.PowerConcreteSubject;
import ca.concordia.soen6461.extension.object.pattern.clothings.ClothingsConcreteSubject;
import ca.concordia.soen6461.extension.object.pattern.clothings.IClothingsExtension;
import ca.concordia.soen6461.extension.object.pattern.power.IPowerExtension;

public class Client {
	public static void main(final String[] args) {

		// ####--------This solution is the expansion of the questions 4 ---------####
		System.out.println("*** A CHARACTER'S (Ranger) FINAL STRENGTH/ABILITIES COULD BE THE SUM OF\r\n"
				+ "QUESTIONS#5_1, QUESTIONS#5_2, QUESTIONS#5_3, QUESTIONS#5_4 ***");
		
		// #######------------Abstract Factory Design Pattern------------######//
		System.out.println();
		System.out.println("QUESTIONS#5_1: A Character’s innate strength are ..... ");
		
		AbstractFactory factoryStrength = null;
		ICharacter rangerCharacterStrength = null;
		for (Strength strength : Strength.values()) {
			factoryStrength = FactoryProvider.getFactoryStrength(AbilityType.Strength, strength);
		}
		rangerCharacterStrength = factoryStrength.getCharacter(CharacterType.Ranger);
		System.out.println(rangerCharacterStrength.getStrength());
		
		
		// #######------------Extension Object Design Pattern------------######//
		System.out.println();
		System.out.println("QUESTIONS#5_2: Characters can wear different types of clothing..... ");

		IClothingsExtension clothings;
		Ranger ranger = null;
		ClothingsConcreteSubject wearClothings = new ClothingsConcreteSubject(Clothings.class.toString());

		for (Clothings Clothes : Clothings.values()) {
			clothings = wearClothings.getCharacterExtension(Clothes);
			clothings.wearClothings();
		}
		ranger = new Ranger();
		System.out.println(ranger.getClothings());
		
		
		
		// #######------------Abstract Factory Design Pattern------------######
		System.out.println();
		System.out.println("QUESTIONS#5_3: Characters can carry various special items in Satchels or Boxes.\r\n"
				+ "Satchels: food item, books, etc...  "
				+ "Boxes: gold coins, magical rings, etc...");
		System.out.println();

		AbstractFactory factoryBox = null;
		AbstractFactory factorySatchels = null;
		ICharacter rangerCharacter = null;
		for (Boxes boxes : Boxes.values()) {
			factoryBox = FactoryProvider.getFactoryBoxes(AbilityType.Boxes, boxes);
		}
		rangerCharacter = factoryBox.getCharacter(CharacterType.Ranger);
		System.out.println(rangerCharacter.getBoxes());

		System.out.println();
		for (Satchels satchels : Satchels.values()) {
			factorySatchels = FactoryProvider.getFactorySatchels(AbilityType.Satchels, satchels);
		}
		rangerCharacter = factorySatchels.getCharacter(CharacterType.Ranger);
		System.out.println(rangerCharacter.getSatchels());

		
		
		// #######------------Extension Object Design Pattern------------######//
		System.out.println();
		System.out.println("QUESTIONS#5_4: Allowed possess power to the characters..... ");

		IPowerExtension power;
		PowerConcreteSubject subj = new PowerConcreteSubject(Powers.class.toString());

		for (Powers powers : Powers.values()) {
			power = subj.getCharacterExtension(powers);
			power.possessPowers();
		}
		RangerPower rangerPower = new RangerPower();
		System.out.println(rangerPower.possessPowers());
		
		
	}

}
