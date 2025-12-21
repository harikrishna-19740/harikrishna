import java.util.TreeSet;

class Car implements Comparable<Car> {
    int costs;
    Car(int costs)
    {
        this.costs = costs;
    }

    @Override
    public String toString() {
        return "Car [costs=" + costs + "]";
    }
    @Override
    public int compareTo(Car o) {
        return this.costs - o.costs;
}
}

public class CarComparable {
    public static void main(String[] args) {
        Car c1 = new Car(300);
        Car c2 = new Car(100);
        Car c3 = new Car(200);
        TreeSet ts = new TreeSet();
        ts.add(c1);
        ts.add(c2);
        ts.add(c3);
        for (Object c : ts) {
            System.out.println(c);
        }
    }
}