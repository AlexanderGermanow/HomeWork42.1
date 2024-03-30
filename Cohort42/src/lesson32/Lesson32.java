package lesson32;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #32
 *
 * @author Alexander Germanow
 * @version 27-Mar-24
 */
public class Lesson32 {
    public static void main(String[] args) {
        // enums
        Day day = Day.FRIDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Its Monday.");
                break;
            // TODO all other days
            case FRIDAY:
                System.out.println("Its Friday.");
                break;
        }
        // after Java 5.0 generics
        ObjectBox ob1 = new ObjectBox(2);
        ObjectBox ob2 = new ObjectBox(5);
        if (ob1.getObj() instanceof Integer && ob2.setObj() instanceof Integer) {
            int s = (int) ob1.getObj() + (int) ob2.getObj;
            System.out.println("s= " + s);
        }
    }
}