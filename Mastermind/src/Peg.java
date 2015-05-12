

public class Peg {

	private ColorOfPawns color;
	
	public Peg()
	{
		
		this.color = ColorOfPawns.BLUE;
		this.color = color.randomColor();
	}
	
	public String toString ()
	{
		return this.color.toString();
	}
	
}
