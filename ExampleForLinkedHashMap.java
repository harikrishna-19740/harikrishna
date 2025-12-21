import java.util.LinkedHashMap;

public class ExampleForLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> m = new LinkedHashMap<>();
        m.put("name", "hari");
        m.put("age","20");
        System.out.println(m);
        System.out.println("---------------");
        System.out.println(m.get("name"));
        System.out.println("---------------");
        for(Object i : m.keySet()){
            System.out.println(i + " : " + m.get(i));
        }
    }
}