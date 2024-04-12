package lesson36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonSystem {
    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, Person> idMap = HashMap<>();

    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        System.out.println("Simple personal system:");
        Scanner scanner = new Scanner(System.in);
        char operation;
        do {
            System.out.println("Enter operation ([a]dd,[d]elete,[u]pdate,[p]rint,[f]ind,[x] - exit): ");
            operation = scanner.next().charAt(0);
            switch (operation) {
                case 'a':
                    add(persons);
                    break;
                case 'd':
                    delete(persons);
                    break;
                case 'u':
                    update(persons);
                    break;
                case 'p':
                    print(persons);
                    break;
                default:
                    System.out.println("Undefined operation: " + operation);
            }
        } while (operation != 'x');
    }

    static void add(List<Person> persons) {
        System.out.println("Add: name & age: ");
        String name = scanner.next();
        int age = scanner.nextInt();
        Person person = new Person(name, age);
        idMap.put(person.getId);

    }

    static void delete(List<Person> persons) {
        System.out.println("Delete: id: ");
        int id = scanner.nextInt();
        for (Person person : persons) {
            if (person.getId() == id) {
                persons.remove(person);
                break;;
            }
        }
    }

    static void update(List<Person> person) {
        System.out.println("Update: id & name & age: ");
        int id = scanner.nextInt();
        String name = scanner.next();
        int age = scanner.nextInt();
        Person findPerson = findById(person, id);
        if (findPerson != null) {
            findPerson.setName(name);
            findPerson.setAge(age);
            }
        }

    }
    static void print() {

    }

}
