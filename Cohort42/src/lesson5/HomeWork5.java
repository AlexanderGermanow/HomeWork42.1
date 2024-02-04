package lesson5;

/**
 * AIT-TR, cohort 42.1, Java Basic, hw #5
 *
 * @author Alexander Germanow
 * @version 31-Jan-24
 */
public class HomeWork5 {
    public static void main(String[] args) {

        // task 1
        int n = 345;
        boolean a = n % 2 == 0;
        boolean b = n % 3 == 0;
        boolean c = a && b;
        System.out.println("Number " + n + "is odd:" + a + ", div by 3:" + ", odd and div by3:" + c);
    }
}
