package com.ritesh.banking;

public class Account{
    private int balance;
    private final String accountName;

    public Account(String accountName, int initialBalance) {
        this.balance = initialBalance;
        this.accountName = accountName;
    }

    public synchronized void deposit(int amount){
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited $" + amount + " to " + accountName + ". New Balance is $" + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew $" + amount + " from " + accountName + ". New Balance is $" + balance);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " not enough balance in " + accountName + ". Balance is $" + balance);

        }
    }
    public synchronized  void transferTo(Account target, int amount){
        if(balance>=amount){
            this.withdraw(amount);
            target.deposit(amount);
            System.out.println(Thread.currentThread().getName() + " Transferred $" + amount + " to " + target.accountName + " from "+ this.accountName +". New Balance is $" + target.balance);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " not enough balance in " + this.accountName + ". Balance is $" + this.balance);
        }
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }
}