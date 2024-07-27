package com.niilooy.ecommerce.kafka;

import com.niilooy.ecommerce.customer.CustomerResponse;
import com.niilooy.ecommerce.order.PaymentMethod;
import com.niilooy.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
