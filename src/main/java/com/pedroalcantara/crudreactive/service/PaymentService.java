package com.pedroalcantara.crudreactive.service;

import com.pedroalcantara.crudreactive.base.PaymentEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import com.pedroalcantara.crudreactive.repository.PaymentRepository;

@Service
@AllArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public Mono<PaymentEntity> save(PaymentEntity toEntity) {
        return paymentRepository.save(toEntity);
    }
}
