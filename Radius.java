import java.util.*;

class Radius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a radius of a circle");
        float r = sc.nextFloat();
        double area = 3.14 * r * r;
        System.out.println("The area of a circle is : " + area);
    }
}
