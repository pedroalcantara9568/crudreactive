package com.pedroalcantara.reactive.controller;


import com.pedroalcantara.reactive.base.PaymentEntity;
import com.pedroalcantara.reactive.controller.swagger.PaymentDoc;
import com.pedroalcantara.reactive.service.PaymentService;
import com.pedroalcantara.reactive.web.rest.mapper.PaymentMapper;
import com.pedroalcantara.reactive.web.rest.model.PaymentDTO;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
@AllArgsConstructor
@RequestMapping("/api/payments")
public class PaymentsController implements PaymentDoc {

    private final PaymentMapper paymentMapper;

    private final PaymentService paymentService;

    @Override
    @PostMapping
    public Mono<ResponseEntity<PaymentEntity>> createPayment(
            @Parameter(schema = @Schema(implementation = PaymentDTO.class))
            @RequestBody PaymentDTO paymentDTO
    ) {
        return paymentService.save(paymentMapper.toEntity(paymentDTO)).map(paymentEntity -> ResponseEntity.ok(paymentEntity));
    }

}
