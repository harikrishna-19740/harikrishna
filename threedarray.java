public class threedarray {
    static class Student {
        String name;
        int age;
        Student(String name, int age) { this.name = name; this.age = age; }
        @Override
        public String toString() { return name + " (" + age + ")"; }
    }

    public static void main(String[] args) {
        String[] branches = {"cic", "aiml"};

        Student[][][] data = new Student[2][][];

        data[0] = new Student[3][];
        data[0][0] = new Student[] { new Student("Alice", 20), new Student("Bob", 21) };
        data[0][1] = new Student[] { new Student("Charlie", 22) };
        data[0][2] = new Student[] { new Student("David", 23), new Student("Eve", 21), new Student("Frank", 24) };

        data[1] = new Student[3][];
        data[1][0] = new Student[] { new Student("Gina", 20) };
        data[1][1] = new Student[] { new Student("Hank", 22), new Student("Ivy", 19) };
        data[1][2] = new Student[] { new Student("Jack", 25), new Student("Kara", 20), new Student("Liam", 21) };

        for (int b = 0; b < data.length; b++) {
            System.out.println("Branch: " + branches[b]);
            for (int s = 0; s < data[b].length; s++) {
                System.out.println(" Section " + (s + 1) + ":");
                for (int p = 0; p < data[b][s].length; p++) {
                    System.out.println("  - " + data[b][s][p]);
                }
            }
        }
    }
}
