import java.util.*;

public class ExampleForCollection {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        /* List l1= new Vector();
           List l2 = new Stack();
           List l3 = new LinkedList(); */
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println("List: " + l);
        for (int i = 1; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println("--------------------------");
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(30);
        l1.add(50);
        l1.add(70);
        System.out.println("ArrayList: " + l1);
        System.out.println("--------------------------");
    }
}
