import java.util.Scanner;
public class Whileloop4
	{
	
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner (System.in);
		System.out.println("What is your favorite letter?");
		String letter = userInput.nextLine();
		while(!letter.equals("q"));
		{
		System.out.println("Try Again");
		letter = userInput.nextLine();
		}
		System.out.println("Goodbye!");
		{
			
		}
	}
	}

			
		
	
