package lesson36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Persons {
    private List<Person> persons;
    Map<Integer, Person> idMap;

    public Persons() {
        persons = new ArrayList<>();
        idMap = new HashMap<>();
    }

    public void add(String name, int age) {
        Person person = new Person(name, age);
        idMap.put(person.getId(), person);
        persons.add(person);
    }

    public boolean delete(int id) {
        Person delPerson = idMap.get(id);
        if (delPerson != null);
        persons.remove();
    }

}
