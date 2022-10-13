import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // print hello world for n times
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }

        // print numbers from 1 to 7
        for (int i = 1; i <= 7; i++) {
            System.out.println(i);
        }

        // while loops

        // print hello java for 4
        int k = 1;
        while (k <= 4) {
            System.out.println("Hello Java");
            k++;
        }

        // do while loop

        k = 1;
        do {
            System.out.println("Are you ready for upcoming loops");
            k++;
        } while (k <= 5);

        // test a false condition with while and do while loop

        // first we do with while
        k = 12;
        while (k <= 11) {
            System.out.println("ASSALAM O ALAIKUM");
            k++;
        }
        // while loop do not give any output because they first check the condition then
        // give us a output

        // do while
        k = 12;
        do {
            System.out.println("ASSALAM O ALAIKUM");
            k++;
        } while (k <= 11);
        // when we test a false condition with do while loop it does not matter what a
        // condition is right or wrong the output will be given to you at least one time

        // print sum of all natural number take 'n' input from user

        System.out.println("enter a number to print sum of all natural numbers");
        int n = sc.nextInt();
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            sum = sum + j;
        }
        System.out.println(sum);

        // print all even number till n

        System.out.println("enter a number");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Make a menu driven program the user can enter two number either '1' or '0' 1
        // to continue and 0 to stop
        int input;
        do {
            System.out.println("enter your marks");
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("Excellent Performance!");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("Very Good");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("Good but need more focus on studies");
            } else {
                System.out.println("Invalid");
            }
            System.out.println("Want to continue ? (yes(1) or no(0))");
            input = sc.nextInt();
        } while (input == 1);
        System.out.println("Best of luck for your future");

    }
}
