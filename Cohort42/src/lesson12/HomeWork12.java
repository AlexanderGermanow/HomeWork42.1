package lesson12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hw #9
 *
 * @author Alexander Germanow
 * @version 11-Feb-24
 */

public class HomeWork12 {
    public static void main(String[] args) {

        // task #1
        // linear search
        int [] a = {105, 12, 35, 23, 4, 1, 98, 47, 74, 55};
        int toSearch = 49;
        int idx = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == toSearch) {
                idx = i;
                break;
            }
        }
        // task #2
        System.out.println(idx);
        System.out.println(Arrays.toString(a));
        // sorting array
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        // task #3
        // binary search
        int[] numbers = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
        System.out.println(" ");
        int serchNumber = new Scanner(System.in).nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (serchNumber == numbers[i]) {
                System.out.println(" ");
                System.out.println("WOU! - " + serchNumber);
                break;
            }
        }
        int first = numbers[0];
        int last = numbers[numbers.length-1];
        int middle;

        do {
            middle = (first + last)/2;
            if(middle == serchNumber) {
                System.out.println("WOU! - " + serchNumber);
            }

        }while (serchNumber != middle);
    }
}
