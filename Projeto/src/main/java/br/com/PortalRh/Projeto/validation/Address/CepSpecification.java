package br.com.PortalRh.Projeto.validation.Address;

import br.com.PortalRh.Projeto.model.Address;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class CepSpecification implements Specification<Address> {


    @Override
    public ValidationResult isSatisfiedBy(Address address) {
        String cep = address.getCep();
        if (cep != null && cep.matches("\\d{8}")) {
            return new ValidationResult(true, "CEP is valid.");
        } else {
            return new ValidationResult(false, "CEP must be non-null and exactly 8 characters long.");
        }
    }

}