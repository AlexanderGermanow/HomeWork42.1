package lesson36;

public class Person {
    private int id;
    private String name;
    private int age;
    private static int idCounter = 0;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++id;
    }

}
