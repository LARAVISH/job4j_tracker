package ru.job4j.search;


import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void testFindName() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> person = phoneDictionary.find("Petr");
        assertThat(person.get(0).getSurname(), is("Arsentev"));
    }
    @Test
    public void testFindSurname() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> person = phoneDictionary.find("Arsentev");
        assertThat(person.get(0).getPhone(), is("534872"));
    }
    @Test
    public void testFindPhone() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> person = phoneDictionary.find("534872");
        assertThat(person.get(0).getAddress(), is("Bryansk"));
    }
    @Test
    public void testFindAddress() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> person = phoneDictionary.find("Bryansk");
        assertThat(person.get(0).getName(), is("Petr"));
    }
}
