package ru.alfabank.contracts.heisenbergservice.domain;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class AmountResponse {
	private final Integer amount;
	private final BigDecimal price;
}
