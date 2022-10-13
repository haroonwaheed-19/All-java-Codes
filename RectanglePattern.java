import java.util.*;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solid Rectangle
        System.out.println("Enter a number");
        int n = sc.nextInt(); // n for rows
        System.out.println("enter a number");
        int m = sc.nextInt(); // m for columns

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
