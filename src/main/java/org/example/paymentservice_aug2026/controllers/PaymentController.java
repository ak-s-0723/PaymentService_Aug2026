package org.example.paymentservice_aug2026.controllers;

import org.example.paymentservice_aug2026.dtos.InitiatePaymentDto;
import org.example.paymentservice_aug2026.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentDto initiatePaymentDto) {
        return paymentService.getPaymentLink(initiatePaymentDto.getAmount(),
                initiatePaymentDto.getPhoneNumber(),
                initiatePaymentDto.getName(),
                initiatePaymentDto.getEmail(),
                initiatePaymentDto.getOrderId());
    }
}
