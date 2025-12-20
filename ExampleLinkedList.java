import java.util.*;

public  class ExampleLinkedList{
    public static void main(String[] args) {
        List l = new LinkedList();
        l.add(30);
        l.add(10);
        l.add(35);
        l.add(23);
        l.add(null);
        System.out.println("The list: " +1);

        for(Object i : l)
             {
                System.out.println(i);            
        }
        System.out.println("l.get(0)");
        System.out.println("l.isEmpty()");
        System.out.println("--------------------------------------------");
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add("python");
        ll.add("Red");
        System.out.println("The linked list: " + ll);
    }
}