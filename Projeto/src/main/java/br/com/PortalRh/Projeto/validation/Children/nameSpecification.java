package br.com.PortalRh.Projeto.validation.Children;

import br.com.PortalRh.Projeto.model.Children;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class nameSpecification implements Specification<Children> {
    @Override
    public ValidationResult isSatisfiedBy(Children children) {
        String name = children.getName();
        if (name.length() >= 3) {
            return new ValidationResult(true, "name is valid.");
        } else {
            return new ValidationResult(false, "name is not valid.");
        }
    }
}

