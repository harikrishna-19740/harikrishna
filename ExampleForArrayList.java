
import java.util.*;

class Student
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}


public class ExampleForArrayList {

	public static void main(String[] args) {
		
		Student s1 = new Student("Chaithanya",21);
		Student s2 = new Student("Hari",21);
		
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		
		for(Object i : al)
		{
			System.out.println(i);
		}

	}

}