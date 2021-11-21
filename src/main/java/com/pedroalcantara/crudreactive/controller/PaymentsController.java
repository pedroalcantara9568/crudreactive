package com.pedroalcantara.crudreactive.controller;


import com.pedroalcantara.crudreactive.base.PaymentEntity;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;
import com.pedroalcantara.crudreactive.service.PaymentService;
import com.pedroalcantara.crudreactive.rest.mapper.PaymentMapper;
import com.pedroalcantara.crudreactive.rest.model.PaymentDTO;

@RequestMapping("/api/payments")
@AllArgsConstructor
public class PaymentsController {

    private final PaymentService paymentService;

    private PaymentMapper paymentMapper;

    @PostMapping
    public Mono<ResponseEntity<PaymentEntity>> createPayment(@RequestBody PaymentDTO paymentDTO) {
        return paymentService.save(paymentMapper.toEntity(paymentDTO)).map(ResponseEntity::ok);
    }

}

