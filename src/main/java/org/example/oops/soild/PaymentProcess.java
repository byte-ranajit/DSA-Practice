package org.example.oops.soild;

import javax.smartcardio.Card;

public class PaymentProcess {

    void paymentProcess(Payment payment, double amount){
        payment.pay(amount);
    }

    public static void main(String[] args) {
        PaymentProcess ob = new PaymentProcess();
        CardPayment cardPayment = new CardPayment();
        double amount = 220.0;
        ob.paymentProcess(cardPayment,amount);
    }

}
