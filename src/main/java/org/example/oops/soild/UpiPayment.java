package org.example.oops.soild;

public class UpiPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("paid amount is " + amount);
    }
}
