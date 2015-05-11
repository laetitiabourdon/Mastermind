import java.util.Random;

// TODO write comment
public class Code 
{	
	/**
	 * maximum number of pawns to composed the combination
	 */
	public final static int NUMBER_OF_PAWNS = 4;
	
	// TODO (done) write comment
	/**
	 * Create a panel.
	 */
	private Peg[] pegs;
	
	
	// TODO (done) write comment
	/**
	 * Looks for randomly a number and put this in a panel, it is associated to a color in enum 'ColorOfPawns'
	 * @return 
	 */
	public Code()
	{
		/**
		Random rnd = new Random();
		for(int i=0;i<4;i++)
		{
			pegs[i]=rnd.nextInt();
		}
		
		return; **/
		this.code = Peg.randomColor();
	}

}
