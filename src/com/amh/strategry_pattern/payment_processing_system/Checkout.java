package com.amh.strategry_pattern.payment_processing_system;

import javax.swing.text.NumberFormatter;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Checkout {

    private PaymentProcessor paymentProcessor;

    public Checkout(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void pay(BigDecimal amount) {
        paymentProcessor.paymentProcess(amount);
    }

    public void changePaymentMethod(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public static String formatCurrency(BigDecimal amount) {
        return NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount);
    }
}
