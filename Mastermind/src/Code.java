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
	
	public boolean comparedCode(Code codePlayer)
	{
		
		
		return false;
	}
	
	// TODO (done) write comment
	/**
	 * Looks for randomly a number and put this in a panel, it is associated to a color in enum 'ColorOfPawns'
	 * @return 
	 */
	public Code()
	{
		this.pegs = new Peg[NUMBER_OF_PAWNS];
		
		for(int i=0;i<NUMBER_OF_PAWNS;i++)
		{
			this.pegs[i]= new Peg();
		}
		
	}
	
	public Peg[] getCode()
	{
		return pegs;
	}

}
