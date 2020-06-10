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

import ca.concordia.soen6461.character.abilities.option.AbilityType;
import ca.concordia.soen6461.character.abilities.option.Boxes;
import ca.concordia.soen6461.character.abilities.option.CharacterType;
import ca.concordia.soen6461.character.abilities.option.Satchels;
import ca.concordia.soen6461.character.abstractFactory.AbstractFactory;
import ca.concordia.soen6461.character.abstractFactory.FactoryProvider;
import ca.concordia.soen6461.characterclasses.ICharacter;
import ca.concordia.soen6461.composite.pattern.LeafSatchelsItem;
import ca.concordia.soen6461.composite.pattern.SatchelsComponents;
import ca.concordia.soen6461.composite.pattern.SatchelsItem;

public class Client {
	public static void main(final String[] args) {
		
		System.out.println("--------First Part of the questions 3 (Abstract Factory Design Pattern) ---------");
		System.out.println("Questions#3_1: Characters can carry various items in satchels or boxes: food items, books, gold coins, rings.\r\n"
				+ "Satchels are useful for food items, books, etc. while boxes protect gold coins, magical rings, etc........");
		System.out.println();

		AbstractFactory factoryBox = null;
		AbstractFactory factorySatchels = null;
		ICharacter rangerCharacter = null;
		for (Boxes boxes : Boxes.values()) {
			factoryBox = FactoryProvider.getFactoryBoxes(AbilityType.Boxes, boxes);
		}
		ICharacter rangerCharacterBoxGC = factoryBox.getCharacter(CharacterType.Ranger);
		System.out.println(rangerCharacterBoxGC.getBoxes());

		System.out.println();
		for (Satchels satchels : Satchels.values()) {
			factorySatchels = FactoryProvider.getFactorySatchels(AbilityType.Satchels, satchels);
		}
		rangerCharacter = factorySatchels.getCharacter(CharacterType.Ranger);
		System.out.println(rangerCharacter.getSatchels());

		
		
		
		System.out.println();
		System.out.println("--------Second Part of the questions 3 (Composite Design Pattern)---------");

		/*
		 * Note-1: Assume that all the items in Satchels are leaf (after adding/putting item at Satchels) 
		 * because we only can count(group total count) the same/unique items. Same item could stay
		 * multiple time and there is no overlap between the items in terms of tree structure.
		 */
		System.out.println("Questions#3_2: Implementation of how you enforce that certain items can only be put in satchels\r\n"
				+ "not in boxes. Using composite pattern we can find the solution.");
		System.out.println();
		SatchelsItem FooItem = new LeafSatchelsItem(2, "FoodItem");
		SatchelsItem books = new LeafSatchelsItem(3, "Books");

		SatchelsComponents satchelsAllItem = new SatchelsComponents("Satchels");
		satchelsAllItem.AddComponent(FooItem);
		satchelsAllItem.AddComponent(books);
	
		/*
		 * Note-2: Suppose, the Satchels can contains only any 5 items(e.g., FoodItem, Books) So
		 * if we provide more that 5 items then the characters/containers can not store or carry
		 * the (in) Satchels. This is how, we can enforce that certain items can only be put in satchels
		 * not in boxes 
		 */

		int expectedItemInContainer = 5;
		int actualItemInContainer = satchelsAllItem.countTotalItem();
		System.out.println("Total number of items in the Satchels: " + actualItemInContainer);
		System.out.println();
		if (expectedItemInContainer < actualItemInContainer) {
			System.out.println("Solution: Satchels container can only contains " + expectedItemInContainer
					+ " items but you provided " + actualItemInContainer + " items, which is not allowed."
							+ "\r\nNote: For more details please follow my assumption (Note-1,2) in the client.java file in this section.");
		} else {
			System.out.println("Solution: Satchels container can only contains " + expectedItemInContainer
					+ " items and you provided " + actualItemInContainer + " items, which is allowed."
							+ "\r\nNote: For more details please follow my assumption (Note-1,2) in the client.java file in this section.");
		}
	}
}
