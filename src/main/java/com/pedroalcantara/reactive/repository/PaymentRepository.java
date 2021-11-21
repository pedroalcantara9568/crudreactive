package com.pedroalcantara.reactive.repository;

import com.pedroalcantara.reactive.base.PaymentEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PaymentRepository extends ReactiveMongoRepository<PaymentEntity, String> {
}
