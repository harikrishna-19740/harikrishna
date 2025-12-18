abstract class Dosage
{
	int age;
	
	
	String nationality;
	
	void firstDose()
	{
		if(nationality.equalsIgnoreCase("indian") && age >=18 )
		{
			System.out.println("Afer taking first dose you want to pay 250rs");
			secondDose();
			boosterDose();
		}
		else
		{
			
		}
	}
	void secondDose() {
		System.out.println("your second dose is succesfull");
	}
	abstract void boosterDose();
	
		
	
}
class Vaccine extends Dosage{
	
	@Override
	void boosterDose()
	{
		System.out.println("your booster dose is successfull");
	}
	
	public static void main(String[] args) {
		Vaccine vaccine = new Vaccine();
	}
}