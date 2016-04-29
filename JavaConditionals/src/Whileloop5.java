
import java.util.Scanner;
public class Whileloop5
{

	public static void main(String[] args)
	{
		java.util.Scanner userInput = new Scanner(System.in);
		System.out.println("guess a number");
		int guess = userInput.nextInt();
		int randomnumber = (int)(Math.random()*2) + 1;
		while (!(guess == randomnumber))
		{
			if(guess > randomnumber)
			{
				System.out.println("to high guess again");
				guess=userInput.nextInt();
			}
			if(guess < randomnumber)
			{
				System.out.println("too low try again");
				guess=userInput.nextInt();
			}
			
			if(guess == randomnumber)
			{
				System.out.println("Correct!!!");
			}
	}
	}
}
	
