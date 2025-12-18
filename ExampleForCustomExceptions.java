
import java.util.Scanner;


class InvalidUserException extends Exception
{
	public String getMessage()
	{
		return "Invalid user details,try agai!";
		
	}
}




class Atm
{
	int Acc_Num=567825;
	int Password=987979;
	int AN,PWD;
	
	void acceptInput()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the account nummber");
		AN =s.nextInt();
		System.out.println("Enter the password");
		PWD =s.nextInt();
	}
	void verify() throws InvalidUserException
	{
		if(Acc_Num == AN && Password == PWD)
		{
			System.out.println("Collect your Money");
		}
		else
		{
			//System.out.println("Invalid card details.Try Again!");
			InvalidUserException  i= new InvalidUserException();
			System.out.println(i.getMessage());
			throw i;
		}
	}
}

class Bank
{
	void intiate()
	{
		Atm atm = new Atm();
		try
		{
			atm.acceptInput();//firstattempt
			atm.verify();
		}
		catch(Exception e)
		{
			try
			{
				atm.acceptInput();//secondattempt
				atm.verify();
			}
			catch(Exception a) {
				try
				{
					atm.acceptInput();//thirdattempt
					atm.verify();
				}
				catch(Exception b)
				{
					System.out.println("Card is blocked");
				}
				
			}
		}
		
	}
}


public class ExampleForCustomExceptions {

	public static void main(String[] args) {
		
		
		Bank b = new Bank();
		b.intiate();

	}

}