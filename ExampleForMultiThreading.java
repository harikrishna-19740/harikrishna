import java.util.Scanner;

public class ExampleForMultiThreading {
    public static void main(String[] args) {
        System.out.println("Addition task started");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = s.nextInt();
        System.out.println("Enter second number:");
        int b = s.nextInt();
        int sum  = a+b;
        System.out.println(sum);
        System.out.println("Addition task completed");
        System.out.println("--------------------------------");
        System.out.println("Character printing started");
        for(int i= 65;i<=75;i++)
        {
            System.out.println((char)i);
            try{
            Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Character printing completed");
        System.out.println("----------------------------------------");
        System.out.println("Number printing is strated");
        for(int i= 1;i<=10;i++)
        {
            System.out.println(i);
            try{
            Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Number printing completed");
    }
}
