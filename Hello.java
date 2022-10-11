import java.util.*;

public class Hello {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Hello Java");

        // print star pattern
        System.out.println("*\n**\n***\n****");
        System.out.println(" ");
        System.out.println("*\n**");

        // BODMAS RULE IS NOT APPLIED IN JAVA a*b/a-b

        int a = 10;
        int b = 5;
        int calculate = (a * b) / (a - b);
        System.out.println("Your Answer is : " + calculate);

        // Take Two variables and print sum
        System.out.println("enetr number 1");
        int num1 = sc.nextInt();
        System.out.println("enetr number 2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);

    }
}
