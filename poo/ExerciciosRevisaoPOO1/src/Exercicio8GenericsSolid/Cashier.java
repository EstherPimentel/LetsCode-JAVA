package Exercicio8GenericsSolid;

public class Cashier {
    private static Cashier instance;
    private double balance;

    private Cashier() {
        this.balance = 0;
    }

    public void addCash(double cash){
        this.balance += cash;
    }

    public static Cashier getInstance(){
        if(instance == null){
            instance = new Cashier();
        }
        return instance;
    }

    public double getBalance() {
        return balance;
    }
}
