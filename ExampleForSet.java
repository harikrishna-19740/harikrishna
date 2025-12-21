import java.util.*;
public class ExampleForSet {
    public static void main(String[]args){
         /*Set s = new HashSet();
         Set s1 = new LinkedHashSet();
         Set s2 = new TreeSet();*/
        HashSet hs = new HashSet<>();
        hs.add(10);
        hs.add("Java");
        hs.add("python");

        System.out.println(hs);
        System.out.println("-----------------------");
        System.err.println(hs.size());
        System.out.println("---------------------------");
        System.out.println(hs.isEmpty());
        System.out.println("---------------------------");
        System.err.println(hs.clone());

        for (Object obj : hs) {
            System.out.println(obj);
            
        }        
    }
}
