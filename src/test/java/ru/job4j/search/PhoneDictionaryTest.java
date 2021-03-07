package ru.job4j.search;

import junit.framework.TestCase;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest extends TestCase {

    public void testFind() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> person = phoneDictionary.find("Petr");
        assertThat(person.get(0).getSurname(),is("Arsentev"));
    }
    public void testFindPhone() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> person = phoneDictionary.find("534872");
        assertThat(person.get(0).getPhone(),is("534872"));
    }


}