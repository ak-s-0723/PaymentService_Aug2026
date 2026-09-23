package org.example.paymentservice_aug2026.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InitiatePaymentDto {
    Long amount; String phoneNumber; String name; String email; String orderId;
}
