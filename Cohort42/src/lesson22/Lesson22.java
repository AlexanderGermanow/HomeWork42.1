package lesson22;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #19
 *
 * @author Alexander Germanow
 * @version 04-Mar-24
 */

public class Lesson22 {
    public static void main(String[] args) {
        Horse horse = new Horse("Tunder");
        System.out.println(horse);
        horse.run();
        horse.walk();

        Pegas pegas = new Pegas("Pegs");
        System.out.println(pegas);
        pegas.run();
        pegas.walk();
        pegas.fly();
    }
}
