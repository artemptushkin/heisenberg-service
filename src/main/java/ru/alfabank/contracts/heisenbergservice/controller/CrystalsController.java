package ru.alfabank.contracts.heisenbergservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.alfabank.contracts.heisenbergservice.domain.AmountRequest;
import ru.alfabank.contracts.heisenbergservice.domain.AmountResponse;
import ru.alfabank.contracts.heisenbergservice.validation.AmountRequestConstraint;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.math.BigDecimal;

@Validated
@RestController
@RequestMapping("/blueCrystals")
public class CrystalsController {

	private static final Double PRICE = 50.0;

	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public AmountResponse create(@Valid @AmountRequestConstraint @RequestBody AmountRequest amountRequest) {
		return new AmountResponse()
			.setAmount(amountRequest.getQuantity())
			.setPrice(BigDecimal.valueOf(amountRequest.getQuantity() * PRICE));
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = ConstraintViolationException.class)
	public void handleValidation() {}
}
