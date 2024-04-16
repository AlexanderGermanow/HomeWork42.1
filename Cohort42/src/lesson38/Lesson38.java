package lesson38;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #38
 *
 * @author Alexander Germanow
 * @version 15-Apr-24
 */
public class Lesson38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        new Thread(() -> {
            while (true) {
                if (!queue.isEmpty()) {
                    String order = queue.poll();
                    System.out.println("Get order '" + order + "' from queue.");
                    try {
                        Thread.sleep(3 * 1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Order '" + order + "' complete.");
                } else {
                    try {
                        Thread.sleep(3 * 1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
        while (true) {
            System.out.println("Add order:");
        }
    }
}
