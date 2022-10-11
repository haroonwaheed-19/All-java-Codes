import java.util.*;

public class Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Age and Voting Eligibility
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are Adult\nYou can Also Vote");
        } else {
            System.out.println("Not Eligible");
        }

    }
}
