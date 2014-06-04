public class randomNumber {		

private int mBounces;
int game;
int numThrows = 0;

public randomNumber()
{
	mBounces = 1;
}

public randomNumber(int number)
{
	mBounces = number;
}	

public int Throw()
{		
	for (int i=0; i<mBounces; i++)
	{
		game = game + 0 + (int) (Math.random() * 6);
		numThrows++;
	}	
	game = game / mBounces;
	return 	(game);
}

public int trackNumber()
{		
	return numThrows;
}

}




