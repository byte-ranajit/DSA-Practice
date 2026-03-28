package org.example.oops.soild;

public class CashPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("paid amount " + amount);
    }
}
