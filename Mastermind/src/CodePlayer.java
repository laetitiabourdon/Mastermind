import java.util.Scanner;

public class CodePlayer {
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<Code.NUMBER_OF_PAWNS;i++)
		{
			System.out.println("Enter color number" + i +" of the panel");
			//String str = sc.nextLine();	
		}
		
		
	}

	private Peg[] pegs1;
	
	
	public CodePlayer()
	{
		this.pegs1 = new Peg[Code.NUMBER_OF_PAWNS];
		
		
		//this.pegs1[i]= new Peg();
	}
}
