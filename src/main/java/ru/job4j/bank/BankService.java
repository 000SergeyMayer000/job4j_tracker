package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        } else {
            System.out.println("Such a user exists");
        }
    }

//    public void addUser(User user) {
//        users.putIfAbsent(user, new ArrayList<>());
//    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> list = users.get(user);
        if (!list.contains(account)) {
            list.add(account);
        } else {
            System.out.println("Such an account exists");
        }
    }

    public User findByPassport(String passport) {
        return users.keySet().stream().
                filter(user -> user.getPassport().equals(passport)).
                findFirst().
                orElse(null);
    }


    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user).stream().
                    filter(account -> account.getRequisite().equals(requisite)).
                    findFirst().
                    orElse(null);
        }

        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite,
                                 double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}