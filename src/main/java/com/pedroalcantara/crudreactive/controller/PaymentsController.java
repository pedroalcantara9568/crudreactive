package com.pedroalcantara.crudreactive.controller;


import com.pedroalcantara.crudreactive.base.PaymentEntity;
import com.pedroalcantara.crudreactive.controller.swagger.PaymentDoc;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;
import com.pedroalcantara.crudreactive.service.PaymentService;
import com.pedroalcantara.crudreactive.web.rest.mapper.PaymentMapper;
import com.pedroalcantara.crudreactive.web.rest.model.PaymentDTO;

@RequestMapping("/api/payments")
@AllArgsConstructor
public class PaymentsController implements PaymentDoc {

    private final PaymentService paymentService;

    private PaymentMapper paymentMapper;

    @PostMapping
    @Override
    public Mono<ResponseEntity<PaymentEntity>> createPayment(
            @Parameter(schema = @Schema(implementation = PaymentDTO.class))  @RequestBody PaymentDTO paymentDTO
    ) {
        return paymentService.save(paymentMapper.toEntity(paymentDTO)).map(ResponseEntity::ok);
    }

}

