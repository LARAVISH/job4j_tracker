package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса
 *
 * @author Lara Vishniakova
 * @version 1
 */

public class BankService {
    /**
     * Хранение пользователей с привязанными к ним счетами  в коллекции  Map, ключ - это пользователи
     * значение -это счета пользователя , которые хранятся в коллекции  List
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * метод добавляет нового  пользователя в систему
     *
     * @param user имя пользователя
     *             если клиент не найден, добавляем в  бвнковскую систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * метод добавляет счет пользователя в банковскую систему
     *
     * @param passport паспорт пользователя
     * @param account  номер счета пользователя
     *                 находим пользователя по паспорту, если пользователь найден, проверяем есть ли у него счета
     *                 если нет то добавляем их к пользователю
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            if (!users.get(user).contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    /**
     * метод поиск пользователя по паспорту
     *
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя, если не найден пользователь, вернет null
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> passport.equals(s.getPassport()))
                .findFirst()
                .orElse(null);
    }

    /**
     * поиск пользователя по реквизитам
     *
     * @param passport  паспорт пользователя
     * @param requisite счет пользователя
     * @return счет пользователя , если не найден , вернет null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            users.get(user)
                    .stream()
                    .filter(s -> requisite.equals(s.getRequisite()))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * метод для перевода денежных средств с одного счета  на другой счет
     *
     * @param srcPassport   паспорт пользователя, который делает перевод
     * @param srcRequisite  реквизиты счета с которого делают перевод
     * @param destPassport  паспорт пользователя, который получает перевод
     * @param destRequisite реквизиты для получения денег
     * @param amount        денежная сумма
     * @return true - перевод совершен успешно, false - перевод не прошел
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountFrom = findByRequisite(srcPassport, srcRequisite);
        Account accountTo = findByRequisite(destPassport, destRequisite);
        if (accountFrom != null && accountTo != null && accountFrom.getBalance() >= amount) {
            accountFrom.setBalance(accountFrom.getBalance() - amount);
            accountTo.setBalance(accountTo.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}