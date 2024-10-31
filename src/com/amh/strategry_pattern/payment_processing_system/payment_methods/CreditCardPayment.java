package com.amh.strategry_pattern.payment_processing_system.payment_methods;

import com.amh.strategry_pattern.payment_processing_system.PaymentProcessor;
import com.amh.strategry_pattern.payment_processing_system.business.PaymentRate;

import java.math.BigDecimal;

import static com.amh.strategry_pattern.payment_processing_system.Checkout.formatCurrency;

public class CreditCardPayment implements PaymentProcessor {

    @Override
    public void paymentProcess(BigDecimal amount) {
        System.out.println("Paid with credit card. Amount : "+ formatCurrency(PaymentRate.PAYPAL_RATE.applyRate(amount)));
    }
}
