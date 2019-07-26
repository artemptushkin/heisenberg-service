package ru.alfabank.contracts.heisenbergservice.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class AmountResponse {
	@NotNull
	private Integer amount;
	@NotNull
	private BigDecimal price;
}
