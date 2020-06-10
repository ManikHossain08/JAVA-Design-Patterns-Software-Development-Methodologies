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

import ca.concordia.soen6461.character.decorator.impl.CharismaDecorator;
import ca.concordia.soen6461.character.decorator.impl.ClothingsDecorator;
import ca.concordia.soen6461.character.decorator.impl.ConstitutionDecorator;
import ca.concordia.soen6461.character.decorator.impl.DexterityDecorator;
import ca.concordia.soen6461.character.decorator.impl.IntelligenceDecorator;
import ca.concordia.soen6461.character.decorator.impl.StrengthDecorator;
import ca.concordia.soen6461.character.decorator.impl.WisdomDecorator;
import ca.concordia.soen6461.character.option.Charisma;
import ca.concordia.soen6461.character.option.Clothings;
import ca.concordia.soen6461.character.option.Constitution;
import ca.concordia.soen6461.character.option.Dexterity;
import ca.concordia.soen6461.character.option.Intelligence;
import ca.concordia.soen6461.character.option.Strength;
import ca.concordia.soen6461.character.option.Wisdom;
import ca.concordia.soen6461.characterclasses.IRanger;
import ca.concordia.soen6461.characterclasses.impl.RangerCharacter;


public class Tests {
	
	IRanger character = new CharismaDecorator(new ConstitutionDecorator(
			new DexterityDecorator(new IntelligenceDecorator(
					new StrengthDecorator(new WisdomDecorator(new ClothingsDecorator(
			new RangerCharacter(),Clothings.boots), Wisdom.empathy),Strength.plump), Intelligence.simple), 
					Dexterity.awkward), Constitution.healthy),Charisma.leadership);
	
	@Test
	public void testRangerCharismaAbility() throws IOException {
		// Note: this test will be passed because actual and expected value are same
		String expectedOutput = "XYR Character Charisma Option: leadership";
		String actual = character.getCharisma();

		Assert.assertEquals(expectedOutput,actual);
		
	}
	
	@Test
	public void testRangerClothingsAbility() throws IOException {
		// Important Note: This test make intentionally failed to check pass/failed works.
		// so, this test will be failed because actual and expected value are different
		String expectedOutput = "XYR Character Clothings Option: armour";
		String actual = character.getClothings();

		Assert.assertEquals(expectedOutput,actual);
		
	}
	
	
}
