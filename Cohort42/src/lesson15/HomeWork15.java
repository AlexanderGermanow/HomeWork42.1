package lesson15;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #15
 *
 * @author Alexander Germanow
 * @version 17-Feb-24
 */
public class HomeWork15 {
    public static void main(String[] args) {
        // task #1
        Cat cat = new Cat();
        System.out.println(cat.status());
        cat.eat(10);
        cat.walk();
        cat.run();
        System.out.println(cat.status());
        cat.walk();
        System.out.println(cat.status());
        Cat newCat = new Cat();
        System.out.println(newCat.status());

        // task #2
        Car car = new Car(5, 30);
        if (car.startEngine()) {
            System.out.println("Drive: " + car.drive(50));
            System.out.println("Fuel: " + car.fuel);
        }
    }
}
