import java.util.Scanner;

public class JaggedArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols];

            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged Array:");
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}