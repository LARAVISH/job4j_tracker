package ru.job4j.bank;

import java.util.*;

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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            if (!users.get(user.get()).contains(account)) {
                users.get(user.get()).add(account);
            }
        }
    }

    /**
     * метод поиск пользователя по паспорту
     *
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя, если не найден пользователь, вернет null
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> passport.equals(s.getPassport()))
                .findFirst();
    }

    /**
     * поиск пользователя по реквизитам
     *
     * @param passport  паспорт пользователя
     * @param requisite счет пользователя
     * @return счет пользователя , если не найден , вернет null
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> rsl = Optional.empty();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (accounts != null) {
                rsl = accounts.stream()
                        .filter(a -> requisite
                                .equals(a.getRequisite()))
                        .findFirst();
            }
        }
        return rsl;
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
        Optional<Account> accSrc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> accDst = findByRequisite(destPassport, destRequisite);
        boolean rsl = false;
        if (accSrc.isPresent() && accDst.isPresent() && accSrc.get().getBalance() >= amount) {
            accSrc.get().setBalance(accSrc.get().getBalance() - amount);
            accDst.get().setBalance(accDst.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}