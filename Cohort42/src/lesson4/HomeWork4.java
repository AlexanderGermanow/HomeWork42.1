package lesson4;

/** AIT-TR, Java Basic, cohort42.1, hw #4
 *
 * @author Alexander Germanow
 * @version 31-Jan-24
 */
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String a = scanner.next();
        System.out.println("Enter your second name: ");
        String b = scanner.next();
        System.out.println("Enter your city: ");
        String c = scanner.next();
        System.out.println("Enter your age: ");
        String d = scanner.next();
        System.out.println("Enter your height: ");
        String e = scanner.next();
        System.out.println("My name is " + a + ", " + b + ", " + "i live in " + c + ", " + "I am " + d + ", " + "your age " + e + ", " );
    }
}

