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

import ca.concordia.soen6461.allPlayerCharacters.RangerCharacter;
import ca.concordia.soen6461.characters.charisma.impl.CharismaAwkward;
import ca.concordia.soen6461.characters.charisma.impl.CharismaConfidence;
import ca.concordia.soen6461.characters.charisma.impl.CharismaLeadership;

public class Tests {

	@Test
	public void testRangerCharismaConfidence() throws IOException {
		String expectedResult = "This Charisma innate abilities has Confidence Characteristics.";
		final RangerCharacter Ranger = new RangerCharacter();
		Ranger.setCharismaCharacter(new CharismaConfidence());
		//Ranger.performCharismaCharacter();
		Assert.assertEquals(expectedResult,Ranger.performCharismaCharacter());
	}
	
	@Test
	public void testRangerCharismaLeadership() throws IOException {
		String expectedResult = "This Charisma innate abilities has Leadership Characteristics.";
		final RangerCharacter Ranger = new RangerCharacter();
		Ranger.setCharismaCharacter(new CharismaLeadership());
		//Ranger.performCharismaCharacter();
		Assert.assertEquals(expectedResult,Ranger.performCharismaCharacter());
	}
	
	@Test
	public void testRangerCharismaAwkward() throws IOException {
		String expectedResult = "This Charisma innate abilities has Awkward Characteristics.";
		final RangerCharacter Ranger = new RangerCharacter();
		Ranger.setCharismaCharacter(new CharismaAwkward());
		//Ranger.performCharismaCharacter();
		Assert.assertEquals(expectedResult,Ranger.performCharismaCharacter());
	}
}
