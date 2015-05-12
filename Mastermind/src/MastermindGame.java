
// TODO (done) fix comment: tell what this class actually represents

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

	// TODO write comment
	private Peg[] codeToGuess;
	
	
	
	// TODO (think about it) all pawns can not be represented using a single int
	/**
	 * Represents pawn. 
	 * There are 8 colors of pawn: red ; yellow ; green ; blue ; orange ; white ; purple ; pink (relevant values). The computer generate a combination of 4 colors. 
	 */
	private Peg pegs;
	
	
	// TODO (done) fix comment. Tell what is the purpose of the field
	// TODO (done) (think about it) this field should not be public
	/**
	 * This field represents check pawns.
	 * True = Correct color in correct place / False : Correct color in wrong place 
	 * They serve to check the combination proposed by the player. They give clues to the player.
	 */
	private boolean checkPawn; 
	
	
	/**
	 * This field represents the numbers of rounds.
	 * We can play between 2 and 1O rounds.
	 * It serves to choose the number of rounds you want play before the beginning.
	 */
	private int roundNumber;

	private Code codePlayer;

	private ColorOfPawns color;
	
	
	public MastermindGame() {
		this.codeToGuess = new Peg[Code.NUMBER_OF_PAWNS];
		
		//TODO : initialiser TOUS les attributs
		
		this.pegs= new Peg();
		this.color = new ColorOfPawns(); 
		this.roundNumber= NUMBER_OF_ATTEMPTS;
		this.codePlayer = new Peg[Code.NUMBER_OF_PAWNS];
	}
	
	
	/**
	 * 
	 * @param codeToGuess
	 * @param codePlayer
	 * @return
	 */
	/*private boolean checkPawn(Code codeToGuess, Code codePlayer)
	{
		for(int i=0;i<(4);i++)
		{
			
		}
		return false;
	}*/

	// TODO (done) write comment
	/**
	 * The class serves to play mastermind 
	 */
	public void play() 
		{
			while(true)
			{
				if (roundNumber >= NUMBER_OF_ATTEMPTS)
					/*arrete la partie*/
				if (this.codePlayer.getCode() == this.codeToGuess.getCode())
					/*arrete la partie*/
				this.checkPawn(this.codeToGuess , this.codePlayer.getCode());
			}
		}
	
	
	/**
	 * This class serves to generate pawns.
	 */
	public void pawn() 
	{
		
	}
	
	
	
	public void codePlayer()
	{
		
	}
	
	
	
	
}
