import java.util.Random;


// TODO (done) write comment
/**
 * Enumeration of pawns' colors.
 * @author bourdonl
 * 
 */
public enum ColorOfPawns {
	
	

	// TODO (done) constants can not be named using numbers
		/**
		 * This constant represent a color of pawn : Orange
		 */
		ORANGE("O"),
		
		/**
		 * This constant represent a color of pawn : Yellow
		 */
		YELLOW("Y"),
		
		/**
		 * This constant represent a color of pawn : Green
		 */
		GREEN("G"), 
		
		/**
		 * This constant represent a color of pawn : Blue
		 */
		BLUE("B"), 
		
		/**
		 * This constant represent a color of pawn : Red
		 */
		RED("R"), 
		
		/**
		 * This constant represent a color of pawn : White
		 */
		WHITE("W"),
		
		/**
		 * This constant represent a color of pawn : Purple
		 */
		PURPLE("Pu"),
		
		/**
		 * This constant represent a color of pawn : Pink
		 */
		PINK("Pi");
	 
	/**
	* Constructor which serves to declare colors' abreviations.
	*/
	private String abreviation ; 
	
	/**
	 * Number of colors
	 */
	public final static int NUMBER_OF_COLORS = 8;
	
	/**
	 * 
	 * @return
	 */
	public ColorOfPawns randomColor() 
	{
	    int color = new Random().nextInt(NUMBER_OF_COLORS);
	    System.out.println(ColorOfPawns.values()[color]);
	    return ColorOfPawns.values()[color];
	}

	private ColorOfPawns(String abreviation) {  
    this.abreviation = abreviation ;  
	}  
 

	public String getAbreviation() {  
    return  this.abreviation ;  
	}  
}
