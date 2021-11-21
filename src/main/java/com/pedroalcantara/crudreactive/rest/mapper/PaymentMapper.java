package com.pedroalcantara.crudreactive.rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import com.pedroalcantara.crudreactive.base.PaymentEntity;
import com.pedroalcantara.crudreactive.rest.model.PaymentDTO;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Component
@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = IGNORE, nullValueCheckStrategy = ALWAYS)
public interface PaymentMapper {

    @Mapping(target = "localInstrument", source = "paymentDTO.data.localInstrument")
    @Mapping(target = "payment", source = "paymentDTO.data.payment")
    @Mapping(target = "creditorAccount", source = "paymentDTO.data.creditorAccount")
    @Mapping(target = "remittanceInformation", source = "paymentDTO.data.remittanceInformation")
    @Mapping(target = "cnpjInitiator", source = "paymentDTO.data.cnpjInitiator")
    @Mapping(target = "transactionIdentification", source = "paymentDTO.data.transactionIdentification")
    @Mapping(target = "ibgeTownCode", source = "paymentDTO.data.ibgeTownCode")
    PaymentEntity toEntity(PaymentDTO paymentDTO);
}
