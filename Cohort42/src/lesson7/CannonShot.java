package lesson7;

import java.util.Random;
import java.util.Scanner;

public class CannonShot {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // define simple variables
        int damageRadius = 15;
        double g = 9.81;
        int angle;
        int speed;
        double difference;
        // generate distance to target
        double distance = random.nextInt(1000) + 100;
        do {
            // enter speed & angle
            System.out.println("Enter start speed (m/s):");
            speed = scanner.nextInt();
            System.out.println("Enter angle (°) [0..89]:");
            angle = scanner.nextInt();
            // calculate
            double realDistance = speed * speed * Math.sin(Math.toRadians(angle * 2)) / g;
            difference = distance - realDistance;
            // analeze
            if (Math.abs(difference) < damageRadius) {
                System.out.println("You damage target: " + realDistance);
            } else {
                if (difference < 0) {
                    System.out.println("Overflight: " + realDistance + " " + distance);
                } else {
                    System.out.println("Underflight: " + realDistance + " " + distance);
                }
            }
        } while (Math.abs(difference) > damageRadius);
    }
}
