package org.iffat.immutable_challenge;

import org.iffat.immutable_challenge.bank.Bank;
import org.iffat.immutable_challenge.bank.BankAccount;
import org.iffat.immutable_challenge.bank.BankCustomer;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // BankAccount account = new BankAccount(BankAccount.AccountType.CHECKING, 500);
        // System.out.println(account);

        //BankCustomer joe = new BankCustomer("Joe", 500.00, 10000.00);
        //System.out.println(joe);

        Bank bank = new Bank(3214567);
        bank.addCustomer("Joe", 500.00, 10_000.00);

        BankCustomer joe = bank.getCustomer("000000010000000");
        System.out.println(joe);

//        List<BankAccount> accounts = joe.getAccounts();
//        accounts.clear();
//        System.out.println(joe);
//
//        accounts.add(new BankAccount(BankAccount.AccountType.CHECKING, 150_000));
//        System.out.println(joe);

        if (bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHECKING, 35)) {
            System.out.println(joe);
        }

        if (bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHECKING, -535)) {
            System.out.println(joe);
        }

        BankAccount checking = joe.getAccount(BankAccount.AccountType.CHECKING);
        var transactions = checking.getTransactions();
        transactions.forEach((key, value) -> System.out.println(key + ": " + value));

//        System.out.println("-".repeat(90));
//        for (var tx : transactions.values()) {
//            tx.setCustomerId(2);
//            tx.setAmount(10_000.00);
//        }
//        transactions.forEach((key, value) -> System.out.println(key + ": " + value));

        joe.getAccount(BankAccount.AccountType.CHECKING).getTransactions().clear();
        System.out.println("-".repeat(90));
        joe.getAccount(BankAccount.AccountType.CHECKING).getTransactions()
                .forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
