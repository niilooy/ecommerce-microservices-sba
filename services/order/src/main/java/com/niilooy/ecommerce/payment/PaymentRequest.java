package com.niilooy.ecommerce.payment;

import com.niilooy.ecommerce.customer.CustomerResponse;
import com.niilooy.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
