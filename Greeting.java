import java.util.*;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number to print greetings");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("ASSALAM O ALAIKUM");
                break;
            case 2:
                System.out.println("HELLO");
                break;
            case 3:
                System.out.println("BONJOUR");
                break;
            case 4:
                System.out.println("HOLA");
                break;
            case 5:
                System.out.println("NAMASTE");
                break;
            default:
                System.out.println("Still Learning more languages");
        }
    }
}
