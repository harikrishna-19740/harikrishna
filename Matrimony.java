import java.util.Scanner;

public class Matrimony {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the gender");
		
		String gender=s.nextLine();
		
		System.out.println("enter the age: ");
		int age=s.nextInt();
		
		if(gender.equalsIgnoreCase("male"))
		{
			if(age >= 2 1) {
				System.out.println("Eligible for Marriage");
			}
			else
			{
				System.out.println("Hold your Horse");
			}
		}
		else if(gender.equalsIgnoreCase("female"))
		{
			if(age >= 18)
			{
				System.out.println("go and marry");
			}
			else
			{
				System.out.println("go and study");
			}
		}
		else 
		{
			System.out.println("check the correct gender");
		}

	}

} 
