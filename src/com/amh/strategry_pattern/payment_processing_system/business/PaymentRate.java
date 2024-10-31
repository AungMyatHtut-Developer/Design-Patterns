package com.amh.strategry_pattern.payment_processing_system.business;

import java.math.BigDecimal;

public enum PaymentRate {

    CREDIT_CARD_RATE(BigDecimal.valueOf(2.5)),
    CRYPTO_RATE(BigDecimal.valueOf(1.1)),
    PAYPAL_RATE(BigDecimal.valueOf(2.9));

    private BigDecimal rate;

    PaymentRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal applyRate(BigDecimal amount) {
        return amount.subtract(rate);
    }
}
