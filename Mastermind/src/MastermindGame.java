
// TODO fix comment: tell what this class actually represents

/**
 * The objective of the game is to guess the exact positions of the colors in the computer's sequence.
 * For more informations for this rules, check this link's site : http://www.web-games-online.com/mastermind/rules.php
 * @author bourdonl
 * 
 */

public class MastermindGame {

	/**
	 * maximum number of attempts to guess the code
	 */
	public final static int NUMBER_OF_ATTEMPTS = 10;
	
	/**
	 * maximum number of pawns to composed the combination
	 */
	public final static int MAX_NUMBER_OF_PAWNS_IN_COMBINATION = 4;
	
	private Code codeToGuess;
	
	
	
	// TODO (done) fix comment. Tell what is the purpose of the field (+ relevant values)
	// TODO (done) (think about it) this field should not be public
	/**
	 * Represents pawns. 
	 * There are 8 colors of pawn: red ; yellow ; green ; blue ; orange ; white ; purple ; pink (relevant values). The computer generate a combination of 4 colors. 
	 */
	private int pawns;
	
	
	// TODO (done) fix comment. Tell what is the purpose of the field
	// TODO (done) (think about it) this field should not be public
	/**
	 * This field represents check pawns.
	 * True = Correct color in correct place / False : Correct color in wrong place 
	 * They serve to check the combination proposed by the player. They give clues to the player.
	 */
	private boolean checkPawn; 
	
	
	// TODO (done) fix comment. Tell what is the purpose of the field
	// TODO (done) (think about it) this field should not be public
	/**
	 * This field represents the numbers of rounds.
	 * We can play between 2 and 1O rounds.
	 * It serves to choose the number of rounds you want play before the beginning.
	 */
	private int roundNumber;
	
	// TODO (think about it) this class has no constructor ...
	
	public MastermindGame() {
		this.pawn=
		this.checkPawn=
		this.roundNumber=
	}
	
	
	
	// TODO (done) write comment
	/**
	 * The class serves to play mastermind 
	 */
	public void play() {
		
	}
	
	
	/**
	 * This class serves to generate pawns.
	 */
	public void pawn() {
		
	}
	
	
	
	
}
