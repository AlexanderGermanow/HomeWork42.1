package lesson5;

import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #5
 *
 * @author Alexander Germanow
 * @version 23-Jan-24
 */
public class Lesson5 {
    public static void main(String[] args) {
        boolean a = 4 > 5;
        System.out.println(a);
        int t = 4;
        System.out.println(t <= 0);
        if (t <= 0) {
            System.out.println("It's frost.");
        } else {
            System.out.println("It's NO frost.");
        }
        String str = new String("Hello");
        if (str.equals("Hello")) {
            System.out.println("ok");
        } else {
            System.out.println("NOT ok");
        }
        {
            int b = 55;
            System.out.println(b + 37);
        }
        int b = 3;
        System.out.println(b);
    }
}
