package ru.netology.nikolaJ80.Accounts;

public class CreditAccount extends Account {
    long creditLimit;

    public CreditAccount(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long ammount) {
        if (balance + ammount <= 0) {
            balance += ammount;
            return true;
        }
        return true;
    }

    @Override
    public boolean pay(long ammount) {
        if (balance - ammount >= creditLimit) {
            balance -= ammount;
            return true;

        }
        return false;
    }

}
