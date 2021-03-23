package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        User user = new User("7205", "Ivan Ivanov");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("7205"), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("7205", "Ivan Ivanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertNull(bank.findByRequisite("72", "5546"));
    }

    @Test
    public void addAccount() {
        User user = new User("7205", "Ivan Ivanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("7205", "5546").getBalance(), is(150D));
    }
    @Test
    public void add2Account() {
        User user = new User("7205", "Ivan Ivanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("1111", 150D));
        bank.addAccount(user.getPassport(), new Account("1122", 300D));
        assertThat(bank.findByRequisite("7205", "1122").getBalance(), is(300D));
    }

    @Test
    public void transferMoney() {
        User user = new User("7205", "Ivan Ivanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("1135", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "1135", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "1135").getBalance(), is(200D));
    }

}