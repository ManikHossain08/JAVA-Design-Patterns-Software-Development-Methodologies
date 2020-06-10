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

import ca.concordia.soen6461.allPlayerCharacters.BarbarianCharacter;
import ca.concordia.soen6461.allPlayerCharacters.RangerCharacter;
import ca.concordia.soen6461.characters.Dextrity.impl.DexteritySneaky;
import ca.concordia.soen6461.characters.Strength.impl.StrengthScrawny;
import ca.concordia.soen6461.characters.charisma.impl.CharismaConfidence;
import ca.concordia.soen6461.characters.constitution.impl.ConstitutionStrong;
import ca.concordia.soen6461.characters.intelligence.impl.IntelligenceForgetful;
import ca.concordia.soen6461.characters.wisdom.impl.WisdomOblivious;

public class Client {
	public static void main(final String[] args) {
		
		// 1. We can use IS-A relation. this implementation use references of the
		// implemented class of interface
		final RangerCharacter ranger = new RangerCharacter();
		ranger.display();
		System.out.println();
		ranger.performCharismaCharacter();
		ranger.performConstitutionCharacter();
		ranger.performDextrityCharacter();
		ranger.performIntelligenceCharacter();
		ranger.performStrengthCharacter();
		ranger.performWisdomCharacter();
		

		// 2. We can use HAS-A relation. This implementation is more flexible and this
		// is double -dispatch
		System.out.println();
		
		final BarbarianCharacter barbarian = new BarbarianCharacter();
		barbarian.display();
		System.out.println();
		barbarian.setCharismaCharacter(new CharismaConfidence());
		barbarian.performCharismaCharacter();
		barbarian.setConstitutionCharacter(new ConstitutionStrong());
		barbarian.performConstitutionCharacter();
		barbarian.setIDextrityCharacter(new DexteritySneaky());
		barbarian.performDextrityCharacter();
		barbarian.setIntelligenceCharacter(new IntelligenceForgetful());
		barbarian.performIntelligenceCharacter();
		barbarian.setIStrengthCharacter(new StrengthScrawny());
		barbarian.performStrengthCharacter();
		barbarian.setWisdomCharacter(new WisdomOblivious());
		barbarian.performWisdomCharacter();
		
	}
}
