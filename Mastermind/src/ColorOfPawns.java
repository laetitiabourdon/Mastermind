
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

	private ColorOfPawns(String abreviation) {  
    this.abreviation = abreviation ;  
	}  
 

	public String getAbreviation() {  
    return  this.abreviation ;  
	}  
}
