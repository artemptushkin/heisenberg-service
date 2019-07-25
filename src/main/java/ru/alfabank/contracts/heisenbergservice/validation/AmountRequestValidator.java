package ru.alfabank.contracts.heisenbergservice.validation;

import ru.alfabank.contracts.heisenbergservice.domain.AmountRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AmountRequestValidator implements ConstraintValidator<AmountRequestConstraint, AmountRequest> {
   private boolean acceptNull;

   @Override
   public void initialize(AmountRequestConstraint constraint) {
      acceptNull = constraint.acceptNull();
   }

   @Override
   public boolean isValid(AmountRequest amountRequest, ConstraintValidatorContext context) {
      Integer amount = amountRequest.getAmount();
      if (amount == null) return acceptNull;
      return amount < 1000 && amount >= 0;
   }
}
