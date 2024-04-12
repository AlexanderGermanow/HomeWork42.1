package lesson36.homework;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #36
 *
 * @author Alexander Germanow
 * @version 11-Apr-24
 */
public class HomeWork36 {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Luke", 12345);
        pb.add("Mark", 42153);
        pb.add("Mark", 90342);
        pb.add("Mark", 55311);

        System.out.println(pb.get("Luke"));
        System.out.println(pb.get("Mark"));
        System.out.println(pb.get("Bill"));
        System.out.println(pb);
    }
}
