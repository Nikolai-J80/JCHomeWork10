package ru.netology.nikolaJ80.Accounts;

public abstract class Account {
    protected long balance = 0;

    public abstract boolean add(long ammount);

    public abstract boolean pay(long ammount);

    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            if (account.add(amount)) {
                return true;
            }
            add(amount);
        }
        return false;
    }

    public long getBalans() {
        return balance;
    }

}
