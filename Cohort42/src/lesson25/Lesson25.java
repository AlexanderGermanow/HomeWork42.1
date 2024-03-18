package lesson25;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #25
 *
 * @author Alexander Germanow
 * @version 11-Mar-24
 */
public class Lesson25 {
    public static void main(String[] args) {
        Animal animal = new Animal();
            System.out.println(animal.voice());

        Cat cat = new Cat();
            System.out.println(cat.voice());

        Dog dog = new Dog();
            System.out.println(dog.voice());

        Hen hen = new Hen();
            System.out.println(hen.voice());

        Animal[] animals = {new Cat(), new Dog(), new Hen()};
        for (Animal a : animals) {
            System.out.println(a.voice());
        }
    }
}
