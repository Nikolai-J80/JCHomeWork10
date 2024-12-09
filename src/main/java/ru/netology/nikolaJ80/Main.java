package ru.netology.nikolaJ80;

import ru.netology.nikolaJ80.Accounts.CreditAccount;
import ru.netology.nikolaJ80.Accounts.SimpleAccount;

public class Main {
    public static void main(String[] args) {
        SimpleAccount debit = new SimpleAccount();
        CreditAccount credit = new CreditAccount(-500_000);

        debit.add(500_000);
        showBalance(debit.getBalans(), credit.getBalans());
        debit.pay(300_000);
        showBalance(debit.getBalans(), credit.getBalans());
        credit.add(100_000);
        showBalance(debit.getBalans(), credit.getBalans());
        credit.transfer(debit, 200_000);
        showBalance(debit.getBalans(), credit.getBalans());
        debit.transfer(credit, 100_000);
        showBalance(debit.getBalans(), credit.getBalans());
    }

    public static void showBalance(long debit, long credit) {
        System.out.println("На счете debit " + debit);
        System.out.println("На счете credit " + credit);
    }
}