package lesson15;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #13
 *
 * @author Alexander Germanow
 * @version 16-Feb-24
 */
public class Lesson15 {
    public static void main(String[] args) {
        int a = 10;
        Cat cat = new Cat("Mursik", "white", 3, 10, 4);
        cat.voice();
        System.out.println(cat.name + ", " + cat.color + ", " + cat.age + ", ");
        cat.eat(4);
        Cat cat1 = new Cat("Barsik", "black", 5, 10, 5);
        cat1.voice();
        System.out.println(cat1.name + ", " + cat1.color + ", " + cat1.age + ", ");
        cat1.eat(5);
        System.out.println(cat1.hungry);
        System.out.println(cat1.not());
        System.out.println(cat1.satiated());
    }
}
