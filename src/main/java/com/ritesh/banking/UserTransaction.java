package com.ritesh.banking;
public class UserTransaction implements Runnable{
    private final Account fromAccount;
    private final  Account toAccount;
    private final int amount;
    public UserTransaction(Account from , Account to, int amount){
        this.fromAccount = from;
        this.toAccount = to;
        this.amount = amount;
    }

    @Override
    public void run(){
        fromAccount.transferTo(toAccount,amount);
    }
}