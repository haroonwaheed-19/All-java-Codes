import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Comapre different Triangle
        System.out.println("enter first side of Triangle");
        int sideA = sc.nextInt();
        System.out.println("enter second side of Triangle");
        int sideB = sc.nextInt();
        System.out.println("enter third side of Triangle");
        int sideC = sc.nextInt();

        // sideA==sideB==sideC ==>Equilateral Triangle
        // sideA==sideB or sideB==sideC or sideA==sideC ==> Isoceles Triangle
        // No any side equal to each other ==>Scalene Triangle

        if (sideA == sideB && sideB == sideC && sideA == sideC) {
            System.out.println("Triangle is Equilateral");
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            System.out.println("Triangle is Isoceles");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
