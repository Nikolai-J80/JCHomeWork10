package ru.netology.nikolaJ80.Accounts;

public class SimpleAccount extends Account {

    @Override
    public boolean add(long ammount) {
        balance += ammount;
        return true;
    }

    @Override
    public boolean pay(long ammount) {
        if (balance - ammount <= 0) {
            return false;
        }
        balance -= ammount;
        return true;
    }

}
