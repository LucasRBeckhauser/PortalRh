package br.com.PortalRh.Projeto.validation;

import br.com.PortalRh.Projeto.validation.constraints.Address.cep;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AddressValidation implements ConstraintValidator<cep, String> {
    @Override
    public void initialize(cep constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.matches("\\d{8}");
    }
}