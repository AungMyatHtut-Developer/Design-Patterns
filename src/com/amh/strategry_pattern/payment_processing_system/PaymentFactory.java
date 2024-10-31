package com.amh.strategry_pattern.payment_processing_system;

import com.amh.strategry_pattern.payment_processing_system.payment_methods.CreditCardPayment;
import com.amh.strategry_pattern.payment_processing_system.payment_methods.CryptoPayment;
import com.amh.strategry_pattern.payment_processing_system.payment_methods.PayPalPayment;

public class PaymentFactory {

    public static PaymentProcessor getPaymentProcessor(String paymentMethod) {
        switch (paymentMethod) {
            case "CREDIT_CARD" : return new CreditCardPayment();
            case "CRYPTO" : return new CryptoPayment();
            case "PAYPAL" : return new PayPalPayment();
            default: return new CreditCardPayment();
        }
    }
}
