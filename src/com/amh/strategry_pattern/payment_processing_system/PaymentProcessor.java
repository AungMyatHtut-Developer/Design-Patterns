package com.amh.strategry_pattern.payment_processing_system;

import java.math.BigDecimal;

public interface PaymentProcessor {
    void paymentProcess(BigDecimal amount);
}
