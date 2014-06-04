import java.util.Scanner;
public class doubleDice {      //This is my supper class
	
	private int mBounces;
	int game;
	int numThrows = 0;

	public doubleDice()     //Different constructor
	{
		mBounces = 1;
	}

	public doubleDice(int n, int m)		//Different constructor
	{
		mBounces = n;
	}	
	
	public doubleDice(int n, int m, int j)		//Different constructor
	{
		mBounces = n + m + j;
	}	
	
	
	public int Throw()
	{		
		for (int i=0; i<mBounces; i++)
		{
			game = game + 0 + (int) (Math.random() * 10);
			numThrows++;
		}	
		game = game / mBounces;
		return 	(game);
	}

	public int trackNumber()
	{		
		return numThrows;
	}
	
	public void Override()
	{
		System.out.println("This line will be override for the subclass dice"); //This method get overrited by the subclass dice
		
	}
	

}


