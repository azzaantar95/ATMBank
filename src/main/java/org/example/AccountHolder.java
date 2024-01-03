package org.example;

public class AccountHolder implements Runnable {
    public Account account;

    public AccountHolder(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        // both of the two thread want to withdraw 6000
        makeWithdraw(6000);
    }

    public synchronized void makeWithdraw(int amount) {
        if (account.getAccount() >= amount) {
            System.out.println(Thread.currentThread().getName() + "is going to withdraw " + amount);
            try {
                Thread.sleep(3000);
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
