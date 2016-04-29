package randomNumber;
import java.util.Scanner;
public class randomnumber {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("guess a number");
		int guess = userInput.nextInt();
		int randomnumber = (int)(Math.random()*5)+1;
		if (guess < randomnumber)
		{
		System.out.println("too high");
		}
		if(guess < randomnumber)
		{
		System.out.println("too low guess again");
		guess=userInput.nextInt();
		}
		if (guess == randomnumber)
		{
		System.out.println("Correct!");
		}
	}
}
		
		
