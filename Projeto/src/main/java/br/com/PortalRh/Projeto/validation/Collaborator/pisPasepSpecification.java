package br.com.PortalRh.Projeto.validation.Collaborator;

import br.com.PortalRh.Projeto.model.Collaborator;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class pisPasepSpecification implements Specification <Collaborator> {
    @Override
    public ValidationResult isSatisfiedBy(Collaborator collaborator) {
        String pisPasep = collaborator.getPisPasep();
        if (pisPasep != null && pisPasep.matches("\\d{11}")) {
            return new ValidationResult(true, "PisPasep is valid.");
        } else {
            return new ValidationResult(false, "PisPasep is not valid.");
        }
    }
}
