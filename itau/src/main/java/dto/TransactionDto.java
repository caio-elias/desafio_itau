package dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;

public record TransactionDto(
    @NotNull
    double val,

    @NotNull
    OffsetDateTime date
) {
  
}
