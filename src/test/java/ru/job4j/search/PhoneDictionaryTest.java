package ru.job4j.search;


import org.junit.Test;


import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void testFindName() {
        var phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        var person = phoneDictionary.find("Petr");
        assertThat(person.get(0).getSurname(), is("Arsentev"));
    }
    @Test
    public void testFindSurname() {
        var phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        var person = phoneDictionary.find("Arsentev");
        assertThat(person.get(0).getPhone(), is("534872"));
    }
    @Test
    public void testFindPhone() {
        var phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        var person = phoneDictionary.find("534872");
        assertThat(person.get(0).getAddress(), is("Bryansk"));
    }
    @Test
    public void testFindAddress() {
        var phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        var person = phoneDictionary.find("Bryansk");
        assertThat(person.get(0).getName(), is("Petr"));
    }
    @Test
    public void testNotFind() {
        var phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        var person = phoneDictionary.find("hhh");
        assertThat(new ArrayList<Person>(), is(person));

    }
}
