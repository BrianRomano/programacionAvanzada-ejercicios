package com.mybank.test;
import com.mybank.domain.Account;

public class TestAccount {

    public static void main(String[] args) {
            Account acct = new Account(100);
            acct.deposit(47);
            acct.withdraw(150);
            System.out.println("Final Account Balance is: " + acct.getBalance());
    }
}
