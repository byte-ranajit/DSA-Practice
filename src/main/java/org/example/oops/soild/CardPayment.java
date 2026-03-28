package org.example.oops.soild;

public class CardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("paid amount " + amount);
    }
}
