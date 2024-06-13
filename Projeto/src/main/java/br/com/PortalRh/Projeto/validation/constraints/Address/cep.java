package br.com.PortalRh.Projeto.validation.constraints.Address;

import br.com.PortalRh.Projeto.validation.AddressValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AddressValidation.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface cep {

    String message () default "Cep inválido";
    Class<?> groups() default {};
    Class <? extends Payload> payload() default {};

}
