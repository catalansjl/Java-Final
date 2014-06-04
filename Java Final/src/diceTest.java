
import java.util.Scanner;
public class diceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
					
	Scanner input = new Scanner(System.in);		

	int number, number2, number3;
	

	 System.out.printf("Please enter a number that you want to bounce dice1 \n");
	 
	 number = input.nextInt();  
	 
	 System.out.printf("Please enter a number that you want to bounce dice2 \n");
	 
	 number2 = input.nextInt();  
	 
	 System.out.printf("Please enter a number that you want to bounce dice3 \n");
	 
	 number3 = input.nextInt();  

	 doubleDice myDoubleDice = new doubleDice(number, number2, number3);  //here I am showing how to overload the constructor
	 
	 dice myDiceObject = new dice();  //here I am creating an object to call the subclass, which will override a method from superClass
	 
	 int throwNumber =  myDiceObject.Throw();
	 
	 int history = myDiceObject.trackNumber();
	
	
	 System.out.println("The number of throws " + throwNumber);

	 System.out.println("The number of history is " + history);		

	 myDiceObject.Override();
	 
	}

}


		
		
		

	
