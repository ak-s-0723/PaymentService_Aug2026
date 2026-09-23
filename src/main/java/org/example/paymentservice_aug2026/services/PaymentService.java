package org.example.paymentservice_aug2026.services;

import org.example.paymentservice_aug2026.paymentgateways.IPaymentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private IPaymentGateway paymentGateway;

    public String getPaymentLink(Long amount, String phoneNumber, String name, String email, String orderId) {
        return paymentGateway.getPaymentLink(amount, phoneNumber, name, email, orderId);

    }
}
