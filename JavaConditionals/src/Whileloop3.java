import java.util.Scanner;
public class Whileloop3 
{
	
	public static void main(String[]arges)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What number should we stop at?");
		int number = userInput.nextInt();
				int counter = 1;
				while (counter <= number)
				{
					System.out.println (counter);
					counter = counter + 1;
				}
				
	}
}