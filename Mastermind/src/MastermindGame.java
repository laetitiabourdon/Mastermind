
// TODO fix comment: tell what this class actually represents

/**
 * The objective of the game is to guess the exact positions of the colors in the computer's sequence.
 * For more informations for this rules, check this link's site : http://www.web-games-online.com/mastermind/rules.php
 * @author bourdonl
 * 
 */

public class MastermindGame {

	// TODO fix comment. Tell what is the purpose of the field (+ relevant values)
	// TODO (think about it) this field should not be public
	/**
	 * Pions
	 * There are 8 colors of pawn. The computer generate a combination of 4 colors. 
	 */
	public int pawnColor;
	
	// TODO fix comment. Tell what is the purpose of the field
	// TODO (think about it) this field should not be public
	/**
	 * Pions de vérification
	 * They serve to check the combination proposed by the player. They give clues to the player.
	 */
	public boolean checkPawn; 
	
	// TODO fix comment. Tell what is the purpose of the field
	// TODO (think about it) this field should not be public
	/**
	 * It serves to choose the number of rounds you want play before the beginning.
	 * We can play between 2 and 1O rounds.
	 */
	public int roundNumber;
	
	// TODO (think about it) this class has no constructor ...
	
	// TODO write comment
	public void play() {
		
	}
}
