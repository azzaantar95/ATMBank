package org.example;

public class ClientTest {
    public static void main(String[] args) {

        Account account = new Account();
        AccountHolder accountHolder = new AccountHolder(account);

        Thread thread1 = new Thread(accountHolder);
        Thread thread2 = new Thread(accountHolder);

        thread1.setName("Ahmed");
        thread2.setName("mona");

        thread1.start();
        thread2.start();

    }
}