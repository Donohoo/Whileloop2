package randomNumber;

import java.util.Scanner;

public class Arraychallenge2
	{
		
		static int myArray[]={2,4,6,8,10,12,14,16,18,20};
	public static void main(String[] args)
	{
	doExercise1();
//	doExercise2();
//	doExercise3();
	}
	public static void doExercise1()
	{
		int MyArray[]={2,4,6,8,10,12,14,16,18,20};
		for (int i=0; i<myArray.length;i++)
			{
			System.out.println(myArray[i]*myArray[i]);
			}
	}
	public static void doExercise2()
	{
		Scanner userInput = new Scanner(System.in);
		String months[] = {"Jan","Feb","Mar","Aprl","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
		System.out.println ("Pick a month number");
		int month = userInput.nextInt();
		System.out.println(months[month-1]);
	}

	public static void doExercise3()
	{
		String suit[] = {"Hearts","Spades","Clubs","Diamond"};
		String ranks[] = {"Ace","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		int random=(int)(Math.random()*4);
		int random1=(int)(Math.random()*13);
		System.out.println(ranks[random1]+ " of " + suit[random]);

	}
}