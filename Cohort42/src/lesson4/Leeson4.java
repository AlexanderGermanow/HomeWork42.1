package lesson4;

import java.util.Scanner;

/**
 * AIT-TR,Java Basic, Lesson #4
 *
 * @author alexandergermanow or
 * @version 31-jan-24
 */
public class Leeson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        System.out.println("Result:");
        System.out.println(a + " + " + b + " = " + (a + b));

        // class String
        String str = new String("Hello, Java");
        String [] parts = str.split("");
        System.out.println(str.substring(7) + " is great!");
    }
}
