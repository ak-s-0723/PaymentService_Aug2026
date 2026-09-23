package org.example.paymentservice_aug2026.paymentgateways;

public interface IPaymentGateway {
    String getPaymentLink(Long amount, String phoneNumber, String name, String email, String orderId);
}
