

class Demo1{
	int a,b;
	Demo1(int a,int b){
		super();
		this.a=a;
		this.b=b;
	}
	
	Demo1(){
		super();
		a=10;
		b=20;
	}
}
class Demo2 extends Demo1{
	
	int x, y;
	
	Demo2(int x , int y){
		super();
		this.x=x;
		this.y=y;
	}
	
	Demo2()
	{
		super();
		x = 10;
		y = 30;
	}
	
	void display(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}



public class constructurInheritance {

	public static void main(String[] args) {
		Demo2 d2=new Demo2(10,20);

		
		d2.display();
	}

} 