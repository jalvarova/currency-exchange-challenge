package org.irdigital.challenge.currencyexchange.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.irdigital.challenge.currencyexchange.dto.enums.CurrencyCode;

import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CurrencyExchangeDto {

    private CurrencyCode currencyOrigin;

    private CurrencyCode currencyDestination;

    @DecimalMin(value = "0.1", inclusive = false)
    private BigDecimal amount;
}