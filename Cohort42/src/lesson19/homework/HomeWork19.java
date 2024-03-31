package lesson19.homework;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #32
 *
 * @author Alexander Germanow
 * @version 29-Mar-24
 */

public class HomeWork19 {
    public static void main(String[] args) {
        RubberArray rb = new RubberArray();
        rb.add(8);
        rb.add(4);
        rb.add(3);
        rb.add(2);
        rb.add(1);
        System.out.println(rb);
        System.out.println(rb.contains(12));
        System.out.println(rb.indexOf(12));
        System.out.println(rb.indexOf(5));
        rb.add(-3, 3);
        System.out.println(rb);
    }
}
