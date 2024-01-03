package org.example;

public class Account {
    private int accountBalance = 6000;

    public int getAccount() {
        return accountBalance;
    }

    public void withdraw(int amountWithdraw) {
        accountBalance = accountBalance - amountWithdraw;
    }
}
