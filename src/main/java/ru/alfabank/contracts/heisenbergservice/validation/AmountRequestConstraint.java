package ru.alfabank.contracts.heisenbergservice.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AmountRequestValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface AmountRequestConstraint {

	String message() default "Amount should be more that zero and less than";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	boolean acceptNull() default true;
}
