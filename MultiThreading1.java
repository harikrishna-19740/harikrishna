
import java.util.Scanner;
class Addition extends Thread
{
	public void run()
	{
		System.out.println("Addition Task started");
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		int a=s.nextInt();
		
		System.out.println("Enter the second number :");
		int b=s.nextInt();
		
		int sum=a+b;
		System.out.println("Sum is :");
		System.out.println("Addition task completed");
		
	}
}
class CharacterPrinting extends Thread
{
	public void run()
	{
		System.out.println("Character printing started");
		for(int i=65;i <= 75;i++)
		{
			System.out.println((char)i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Character printing task is complete");
	}
}
class Number extends Thread
{
	public void run()
	{
		System.out.println("Number printing is started");
		for(int i=0;i <= 10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Number printing is completed");
	}
}




 class MultiThreading1 {

	public static void main(String[] args) {
		
		
		Addition a= new Addition();
		CharacterPrinting c= new CharacterPrinting();
		Number n= new Number();
		
		a.start();
		c.start();
		n.start();
		
		

	}

}