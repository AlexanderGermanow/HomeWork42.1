package lesson3;

import java.sql.SQLOutput;
/**
 * AIT-TR,Java Basic, Lesson#3
 *
 * @author Alexander Germanow
 * @version 19-Jan-24
 */
public class Lesson3 {
    public static void main(String[] args) {
        int b = 10;
        float c = 6;
        double a = b / (double) c;
        char f = 103;
        b = f;
        long t = Math.round(a);
        System.out.println(b + " / " + c + " = " + a);
        System.out.printf("a = %f", a);
    }
}
