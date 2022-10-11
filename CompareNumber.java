import java.util.*;

public class CompareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Compare different Numbers
        System.out.println("enter a number");
        int num1 = sc.nextInt();
        System.out.println("enter a number");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Both numbers are Equal");
        } else if (num1 > num2) {
            System.out.println("Number 1==>" + num1 + " is greater than ==>" + num2);
        } else if (num1 < num2) {
            System.out.println("Number 2==>" + num2 + " is greater than ==>" + num1);
        } else {
            System.out.println("Invalid!");
        }
    }
}
