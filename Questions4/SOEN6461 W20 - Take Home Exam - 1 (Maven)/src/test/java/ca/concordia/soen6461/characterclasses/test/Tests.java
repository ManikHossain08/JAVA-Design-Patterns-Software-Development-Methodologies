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
package ca.concordia.soen6461.characterclasses.test;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import ca.concordia.soen6461.character.abilities.option.AbilityType;
import ca.concordia.soen6461.character.abilities.option.Boxes;
import ca.concordia.soen6461.character.abilities.option.CharacterType;
import ca.concordia.soen6461.character.abilities.option.Intelligence;
import ca.concordia.soen6461.character.abilities.option.Powers;
import ca.concordia.soen6461.character.abstractFactory.AbstractFactory;
import ca.concordia.soen6461.character.abstractFactory.FactoryProvider;
import ca.concordia.soen6461.characterclasses.ICharacter;
import ca.concordia.soen6461.composite.pattern.LeafItem;
import ca.concordia.soen6461.extension.object.pattern.ConcreteSubject;
import ca.concordia.soen6461.extension.object.pattern.IPowerExtension;
import ca.concordia.soen6461.composite.pattern.ItemCollections;
import ca.concordia.soen6461.composite.pattern.Items;


public class Tests {

	@Test
	public void testPossesPowersInfravision() throws IOException {
		String expectedOutput = "Character allow to possess: Infravision";
		ConcreteSubject subj = new ConcreteSubject("Powers");
		IPowerExtension power = subj.getCharacterExtension(Powers.infravision);
		Assert.assertEquals(expectedOutput, power.possessPowers());
	}
	
	@Test
	public void testPossesPowersSummons() throws IOException {
		String expectedOutput = "Character allow to possess: Summons";
		ConcreteSubject subj = new ConcreteSubject("Powers");
		IPowerExtension power = subj.getCharacterExtension(Powers.summons);
		Assert.assertEquals(expectedOutput, power.possessPowers());
	}
	

	@Test
	public void testCreateBarbarianAbility() throws IOException {
		System.out.println();
		String expectedOutput = "Barbarian Character for Intelligence";
		
		AbstractFactory factoryBox = FactoryProvider.getFactoryIntelligence(AbilityType.Intelligence, 
				Intelligence.inquisitive );
		if (factoryBox == null) {
			System.out.println("Factory for given name doesn't exist.");
			System.exit(1);
		}
		// getting Character of Ranger using factory obtained for Boxes.goldCoins
		ICharacter rangerCharacterBoxAbilities = factoryBox.getCharacter(CharacterType.Barbarian);
		if (rangerCharacterBoxAbilities != null) {
			System.out.println(rangerCharacterBoxAbilities.getIntelligence()); 
			Assert.assertEquals(expectedOutput, rangerCharacterBoxAbilities.getIntelligence());
		} else {
			System.out.println("Character with given name doesn't exist.");
		}
	}
	
	@Test
	public void testCreateRangerAbility() throws IOException {
		System.out.println();
		String expectedOutput = "These are items in Boxes";
		
		AbstractFactory factoryBox = FactoryProvider.getFactoryBoxes(AbilityType.Boxes, 
				Boxes.goldCoins );
		if (factoryBox == null) {
			System.out.println("Factory for given name doesn't exist.");
			System.exit(1);
		}
		// getting Character of Ranger using factory obtained for Boxes.goldCoins
		ICharacter rangerCharacterBoxAbilities = factoryBox.getCharacter(CharacterType.Ranger);
		if (rangerCharacterBoxAbilities != null) {
			System.out.println(rangerCharacterBoxAbilities.getBoxes()); 
			Assert.assertEquals(expectedOutput, rangerCharacterBoxAbilities.getBoxes());
		} else {
			System.out.println("Character with given name doesn't exist.");
		}
	}
	
	// Composite Pattern
	@Test
	public void testHowManyItemCanBePut() throws IOException {
		Items FooItem = new LeafItem(2, "FoodItem"); 
		Items books = new LeafItem(3, "Books");

		ItemCollections satchelsAllItem = new ItemCollections("Satchels");
		satchelsAllItem.AddItem(FooItem);
		satchelsAllItem.AddItem(books);
		int expectedItemInContainer = 5;
		int actualItemInContainer = satchelsAllItem.showItem();
		if (expectedItemInContainer < actualItemInContainer) {
		Assert.assertEquals("Not Allowed, Container can not contain: " + actualItemInContainer +" items",
				expectedItemInContainer, actualItemInContainer);
		} else {
			Assert.assertEquals("Allowed, Container can contain" + actualItemInContainer +" items",
					actualItemInContainer, actualItemInContainer);
		}
	}
	
}
