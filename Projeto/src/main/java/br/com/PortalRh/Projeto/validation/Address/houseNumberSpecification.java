package br.com.PortalRh.Projeto.validation.Address;

import br.com.PortalRh.Projeto.model.Address;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class houseNumberSpecification implements Specification <Address> {
    @Override
    public ValidationResult isSatisfiedBy(Address candidate) {
        String houseNumber = candidate.getHouseNumber();
        if (houseNumber.length() >= 1) {
            return new ValidationResult(true, "House Number is valid.");
        } else {
            return new ValidationResult(false, "The house number must have at least one character.");
        }
    }
    }

