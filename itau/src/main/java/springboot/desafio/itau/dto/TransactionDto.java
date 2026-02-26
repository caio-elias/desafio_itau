package springboot.desafio.itau.dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;



public record TransactionDto(
    @NotNull
    @Positive
    double valor,

    @NotNull
    OffsetDateTime dataHora
) {
  
}
