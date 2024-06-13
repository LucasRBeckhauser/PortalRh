package br.com.PortalRh.Projeto.validation;

import br.com.PortalRh.Projeto.validation.constraints.Address.cep;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AddressValidation implements ConstraintValidator <cep, String>{
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        return value != null && value.matches("\\d{8}");
    }
}
