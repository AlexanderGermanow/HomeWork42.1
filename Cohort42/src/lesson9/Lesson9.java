package lesson9;

/**
 * AIT-TR, cohort42.1, Java Basic, Lesson #9
 *
 * @author Alexander Germanow
 * @version 2-Feb-24
 */

public class Lesson9 {
    public static void main(String[] args) {
    int[] arr = {3, 5, 8, 2, 1};
    printArray(arr);

     int[] arr2 = {-5, -7, -1, -6, -5};
     printArray(arr2);

     int aa = 2;
     int bb = 2;
     int r1 = add(aa, bb);
     int r2 = add(-4, 12);
        System.out.println(r1 + " " + r2);
        System.out.println(add(5,6));
    }

    static int  add(int a, int b) {
        int c = a + b;
        return c;
    }

    static int add(int...a) {
        int s = 0;
        for (int i : a) {
            s += 1;
        }
        return s;
    }

    static void printArray(int[] a) {
        for (int i : a) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
