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
import ca.concordia.soen6461.character.abilities.option.Powers;
import ca.concordia.soen6461.character.abilities.option.Satchels;
import ca.concordia.soen6461.character.abstractFactory.AbstractFactory;
import ca.concordia.soen6461.character.abstractFactory.FactoryProvider;
import ca.concordia.soen6461.characterclasses.ICharacter;
import ca.concordia.soen6461.composite.pattern.LeafItem;
import ca.concordia.soen6461.extension.object.pattern.ConcreteSubject;
import ca.concordia.soen6461.extension.object.pattern.IPowerExtension;
import ca.concordia.soen6461.composite.pattern.ItemCollections;
import ca.concordia.soen6461.composite.pattern.Items;

public class Client {
	public static void main(final String[] args) {
		
		// ####--------This solution is the expansion of the questions 3 ---------####

		System.out.println("----------------1st Part of the questions 4 (Composite Design Pattern)----------------");
		
		/*
		 * 1st Part: Implementation to allow characters to carry satchels and boxes
		 * (themselves possibly containing various items).
		 * 
		 * Answer: we can also solve this using composite design pattern. Here is the
		 * implementation details.
		 * 
		 */

		/*
		 * Assumption: Assume that all the items in the Satchels and Boxes are leaf node
		 * because we only count(group item count) the same/unique item as same
		 * item could stay multiple time. And then both containers is consider as a
		 * single container for considering as a root node in terms of tree structure in
		 * order to design Composite design pattern.
		 * 
		 */

		System.out.println("#QUESTIONS#4_1: Implementation to allow characters to carry satchels and boxes (themselves\r\n"
				+ "possibly containing various items)");
		System.out.println();

		// Items for Satchels (satchelsContainer)
		Items FoodItem = new LeafItem(2, "FoodItem");
		Items books = new LeafItem(3, "Books");
		Items OtherThings = new LeafItem(1, "OtherThings");

		// Items for Boxes (boxContainer)
		Items GoldCoins = new LeafItem(3, "GoldCoins");
		Items MagicalRings = new LeafItem(4, "MagicalRings");
		Items OthersItems = new LeafItem(2, "OthersItems");

		ItemCollections satchelsContainer = new ItemCollections("SatchelsContainer");
		ItemCollections boxContainer = new ItemCollections("BoxContainer");
		// Fill satchelsContainer with FoodItem, Books, OtherThings ......
		satchelsContainer.AddItem(FoodItem);
		satchelsContainer.AddItem(books);
		satchelsContainer.AddItem(OtherThings);

		// Fill boxContainer with GoldCoins, MagicalRings, OthersItems ......
		boxContainer.AddItem(GoldCoins);
		boxContainer.AddItem(MagicalRings);
		boxContainer.AddItem(OthersItems);

		// prepare Root node for both container items to generate tree structure
		ItemCollections AllItemsInBothContainer = new ItemCollections("CombinedItemContainer");
		AllItemsInBothContainer.AddItem(satchelsContainer);
		AllItemsInBothContainer.AddItem(boxContainer);
		int totalItemInBothContainer = AllItemsInBothContainer.showItem();
		System.out.println("Total number of items in both containers(Satchels+Box): " + totalItemInBothContainer);

		
		// #######------------Extension Object Design Pattern------------######//
		System.out.println();
		System.out.println("--------------2nd Part of the questions 4 (Extension Object Design Pattern)-----------------");
		
		/*
		 * 2nd Part: allow characters to possess powers, e.g., spells, infravision,
		 * summons, etc.
		 * 
		 * Answer: we can solve this using Extension Object design pattern. Here is the
		 * implementation.
		 * 
		 */
		System.out.println("#QUESTIONS#4_2:  Allowed possess power to the characters..... ");
		
		IPowerExtension power;
		ConcreteSubject subj = new ConcreteSubject(Powers.class.toString());
		for (Powers powers : Powers.values()) {
		power = subj.getCharacterExtension(powers);
		power.possessPowers();
		}
		
		// #######------------Abstract Factory Design Pattern------------######
		System.out.println();
		System.out.println("--------------THIS SECTION IS FROM QUESTIONS#3 (PART-1) AS THIS SOLUTION EXPANDED FROM QUESTION#3-----------------");
		System.out.println("(QUESTIONS#3: Characters can carry various special items in Satchels or Boxes.\r\n" + 
				"Satchels: food item, books, etc...  " + 
				"Boxes: gold coins, magical rings, etc...)");
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

	}

}
