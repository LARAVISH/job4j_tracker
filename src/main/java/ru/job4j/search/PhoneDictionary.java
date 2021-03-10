package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> list = new ArrayList<>();

    public void add(Person person) {
        this.list.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person value : list) {
            if (value.getSurname().contains(key) || value.getName().contains(key) ||
                    value.getPhone().contains(key) || value.getAddress().contains(key)) {
                result.add(value);
            }
        }
        return result;
    }
}
