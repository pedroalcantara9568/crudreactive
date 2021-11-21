package com.pedroalcantara.crudreactive.controller.swagger;

import com.pedroalcantara.crudreactive.annotations.DefaultSwaggerMapping;
import com.pedroalcantara.crudreactive.web.rest.model.ErrorResponseDTO;
import com.pedroalcantara.crudreactive.web.rest.model.PaymentDTO;
import com.pedroalcantara.crudreactive.base.PaymentEntity;
import com.pedroalcantara.crudreactive.web.rest.model.PaymentResponsePage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Mono;

public interface PaymentDoc {

    @Operation(
            summary = "Endpoint para salvar a iniciação de pagamento",
            responses = {
                    @ApiResponse(description = "salva iniciação de pagamento",
                            responseCode = "201",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = PaymentResponsePage.class)
                            )
                    ),
                    @ApiResponse(
                            description = "Bad Request",
                            responseCode = "400",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = ErrorResponseDTO.class)
                            )
                    ),
                    @ApiResponse(
                            description = "Unprocessable Entity",
                            responseCode = "422",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = ErrorResponseDTO.class)
                            )
                    )

            }
    )
    @DefaultSwaggerMapping
    public Mono<ResponseEntity<PaymentEntity>> createPayment(@RequestBody PaymentDTO paymentDTO);
}
