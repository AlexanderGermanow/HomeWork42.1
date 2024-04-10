package lesson35.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #35
 *
 * @author Alexander Germanow
 * @version 10-Apr-24
 */
public class HomeWork35 {
    public static void main(String[] args) {
        // task #1
        String text = "To be or not to be that is the question " +
                "Whether it is nobler in the mind to suffer " +
                "The slings and arrows of outrageous fortune " +
                "Or to take arms against a sea of troubles " +
                "And by opposing end them To die to sleep " +
                "No more and by a sleep to say we end";
        String[] words = text.toLowerCase().split(" ");
        Set<String> withoutReperat = new TreeSet<>(List.of(words));
        System.out.println(Arrays.toString(words));
        System.out.println(withoutReperat);
    }
}
