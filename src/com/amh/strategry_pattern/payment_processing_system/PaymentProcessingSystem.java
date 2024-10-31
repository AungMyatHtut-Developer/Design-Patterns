package com.amh.strategry_pattern.payment_processing_system;

import java.math.BigDecimal;

public class PaymentProcessingSystem {
    public static void main(String[] args) {

        Checkout checkout = new Checkout(PaymentFactory.getPaymentProcessor("CREDIT_CARD"));
        checkout.pay(BigDecimal.valueOf(1000));
        checkout.changePaymentMethod(PaymentFactory.getPaymentProcessor("CRYPTO"));
        checkout.pay(BigDecimal.valueOf(100000));
        checkout.changePaymentMethod(PaymentFactory.getPaymentProcessor("PAYPAL"));
        checkout.pay(BigDecimal.valueOf(300));
    }
}
