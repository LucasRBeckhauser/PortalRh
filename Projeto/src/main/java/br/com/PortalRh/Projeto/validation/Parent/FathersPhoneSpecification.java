package br.com.PortalRh.Projeto.validation.Parent;

import br.com.PortalRh.Projeto.model.Parent;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class FathersPhoneSpecification implements Specification <Parent> {
    @Override
    public ValidationResult isSatisfiedBy(Parent candidate) {
        String fathersPhone = candidate.getFathersPhone();
        if (fathersPhone != null && fathersPhone.matches("\\d{8,9}")) {
            return new ValidationResult(true, "The phone Number is valid.");
        } else {
            return new ValidationResult(false, "The phone Number is not valid.");
        }
    }
}
