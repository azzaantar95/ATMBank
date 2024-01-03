package org.example;

public class AccountHolder{
    public Account account;

    public AccountHolder(Account account) {
        this.account = account;
    }

    public  void makeWithdraw(int amount) {
        if (account.getAccount() >= amount) {
            System.out.println(Thread.currentThread().getName() + "is going to withdraw " + amount);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completed the withdrawal of $" + amount);
        } else {
            System.out.println("Not enough for " + Thread.currentThread().getName() + " balance to withdraw " + account.getAccount());
        }

    }
}
