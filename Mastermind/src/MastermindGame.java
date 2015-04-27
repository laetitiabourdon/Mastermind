

/**
 * The objective of the game is to guess the exact positions of the colors in the computer's sequence.
 * @author bourdonl
 * For more informations for this rules, check this link's site : http://www.web-games-online.com/mastermind/rules.php
 */

public class MastermindGame {

	/**
	 * Pions
	 * There are 8 colors of pawn. The computer generate a combination of 4 colors. 
	 */
	public int pawnColor;
	
	/**
	 * Pions de vérification
	 * They serve to check the combination proposed by the player. They give clues to the player.
	 */
	public boolean checkPawn; 
	
	/**
	 * It serves to choose the number of rounds you want play before the beginning.
	 * We can play between 2 and 1O rounds.
	 */
	public int roundNumber;
	
	
	public void play() {
		
	}
}
