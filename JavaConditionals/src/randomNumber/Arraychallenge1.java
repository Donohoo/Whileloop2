package randomNumber;

public class Arraychallenge1
	{
			
			static int myArray[]={8,16,10,5};
		public static void main(String[] args)
		{
		doExercise1();
		doExercise2();
		doExercise3();
		doExercise4();
		}
	
	public static void doExercise1()
		{
		String []myArray={"brandon","dylan","troy","bob"};
		System.out.println(myArray[2]);
		}
	
	public static void doExercise2()
		{
		System.out.println(myArray[3]);
		}
	public static void doExercise3()
		{
		for(int i=0; i<myArray.length; i++)
			{
			System.out.println(myArray[i]);
			}
		}
	public static void doExercise4()
		{
			int sum=0;
			for (int i=0; i< myArray.length ;i++);
				{
				sum=sum+myArray[0];
				}
			int average = sum/myArray.length;
			System.out.println(average);
		}
		
		}
