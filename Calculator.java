import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        System.out.println(
                "Choose an Operator\n1==>Addition 2==>Subtraction 3==>Multiplication 4==>Divison 5==>Modoulo(Remainder)");
        int Operator = sc.nextInt();

        switch (Operator) {
            case 1:
                System.out.print("The sum is : ");
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.print("Difference is : ");
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println("Product of Number1+Number2  is : " + num1 * num2);
                break;
            case 4:
                if (num1 / num2 == 0) {
                    System.out.println("Invalid");
                } else {

                    System.out.println("Divison of Number1/Number2  is : " + num1 / num2);
                }
                break;
            case 5:
                if (num1 / num2 == 0) {
                    System.out.println("Invalid");
                } else {

                    System.out.println("Remainder of Number1%Number2  is : " + num1 % num2);
                }
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
