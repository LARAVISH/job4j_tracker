package ru.job4j.bank;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").get().getBalance(), is(150D));
    }


    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertEquals(bank.findByRequisite("34", "5546"), Optional.empty());
    }


    @Test
    public void add2Account() {
        User user = new User("7205", "Ivan Ivanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("1111", 150D));
        bank.addAccount(user.getPassport(), new Account("1122", 300D));
        assertThat(bank.findByRequisite("7205", "1122").get().getBalance(), is(300D));
    }

    @Test
    public void transferMoney() {
        User user = new User("7205", "Ivan Ivanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("1135", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "1135", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "1135").get().getBalance(), is(200D));
    }

}