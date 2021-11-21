package com.pedroalcantara.crudreactive.base;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Document("Payment")
@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PaymentEntity implements Serializable {
    @Id
    private String paymentId;
    private String endToEndId;
    private String consentId;
    private ZonedDateTime creationDateTime;
    private ZonedDateTime statusUpdateDateTime;
    private String proxy;
    private String ibgeTownCode;
    private String status;
    private String rejectionReason;
    private String localInstrument;
    private String cnpjInitiator;
    private Payment payment;
    private String transactionIdentification;
    private String remittanceInformation;
    private CreditorAccount creditorAccount;
}
