package com.pedroalcantara.crudreactive.repository;

import com.pedroalcantara.crudreactive.base.PaymentEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PaymentRepository extends ReactiveCrudRepository<PaymentEntity, String> {
}
