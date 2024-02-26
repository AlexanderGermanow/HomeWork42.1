package lesson17;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #17
 *
 * @author Alexander Germanow
 * @version 21-Feb-24
 */
public class Lesson17 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "white", 3);
        // cat.name = null;
        System.out.println("Name: " + cat.name + ", color: " + cat.color + ", age: " + cat.age);
        cat.voice();
    }
}
