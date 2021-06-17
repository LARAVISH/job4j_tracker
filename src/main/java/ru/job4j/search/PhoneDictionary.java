package ru.job4j.search;


import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private final ArrayList<Person> list = new ArrayList<>();

    public void add(Person person) {
        this.list.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> personList = new ArrayList<>();
        Predicate<Person> namePredicate = s -> s.getName().contains(key);
        Predicate<Person> surnamePredicate = s -> s.getSurname().contains(key);
        Predicate<Person> phonePredicate = s -> s.getPhone().contains(key);
        Predicate<Person> addressPredicate = s -> s.getAddress().contains(key);
        var combinePredicate = namePredicate.or(surnamePredicate).or(phonePredicate).or(addressPredicate);
        for (var person : list) {
            if (combinePredicate.test(person)) {
                personList.add(person);
            }
        }
        return personList;
    }
}
