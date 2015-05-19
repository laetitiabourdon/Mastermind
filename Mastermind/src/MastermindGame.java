
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
	private Code codeToGuess;
	
	
	
	
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
	
	
	public MastermindGame() 
	{
		System.out.println("*** Code to guess ***");
		this.codeToGuess = new Code();
		
		//TODO : initialiser TOUS les attributs

		this.roundNumber= NUMBER_OF_ATTEMPTS;
		
		System.out.println("*** Code player ***");
		this.codePlayer = new Code();
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
				if (this.codePlayer.getCode() == this.codeToGuess.getCode());
					/*arrete la partie*/
				this.checkPawn(this.codeToGuess.getCode(), this.codePlayer.getCode());
				return;
			}
		}
	
	



	private void checkPawn(Peg[] codeToGuess, Peg[] codePlayer)
	{
		for (int currentPeg = 0; currentPeg < Code.NUMBER_OF_PAWNS; currentPeg++)
		{
			System.out.println("\n\n\n" + codeToGuess[currentPeg]);
			
			boolean isFound = false;
			boolean isAtTheGoodPlace = false;
			
			for (int currentPeg2 = 0; currentPeg2 < Code.NUMBER_OF_PAWNS; currentPeg2++)
			{
				System.out.println(codePlayer[currentPeg2]);
				
				if (codeToGuess[currentPeg].toString().equals(codePlayer[currentPeg2].toString()) && currentPeg == currentPeg2)
				{
					isFound = true;
					isAtTheGoodPlace = true;
				}
				else if (codeToGuess[currentPeg].toString().equals(codePlayer[currentPeg2].toString()) && currentPeg != currentPeg2)
				{
					isFound = true;
					isAtTheGoodPlace = false;
				}

				System.out.println("Has been found : " + isFound);
				System.out.println("Is at the good place : " + isAtTheGoodPlace);

				isFound = false;
				isAtTheGoodPlace = false;
				
			}
	

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
