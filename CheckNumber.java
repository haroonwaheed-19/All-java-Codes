import java.util.*;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check Even or Odd
        System.out.println("Enetr a number to check Even or Odd");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println(x + " is a even number");
        } else {
            System.out.println(x + " is odd number");
        }
    }
}
