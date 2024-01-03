package org.example;

public class ClientTest {
    public static void main(String[] args) {

        Account account = new Account();
        AccountHolder accountHolder = new AccountHolder(account);

        Runnable runnable = () -> {
            synchronized (accountHolder) {
                accountHolder.makeWithdraw(6000);
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.setName("Ahmed");
        thread2.setName("mona");

        thread1.start();
        thread2.start();

    }
}