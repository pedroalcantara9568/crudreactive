package com.pedroalcantara.reactive.service;

import com.pedroalcantara.reactive.base.PaymentEntity;
import com.pedroalcantara.reactive.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.ZonedDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public Mono<PaymentEntity> save(PaymentEntity entity) {
        fillEntity(entity);
        return paymentRepository.save(entity);
    }

    private void fillEntity(PaymentEntity entity) {
        entity.setEndToEndId(UUID.randomUUID().toString());
        entity.setConsentId(UUID.randomUUID().toString());
        entity.setCreationDateTime(ZonedDateTime.now());
        entity.setStatusUpdateDateTime(ZonedDateTime.now());
        entity.setStatus("PDNG");
        entity.setRejectionReason("DALE");
    }
}
