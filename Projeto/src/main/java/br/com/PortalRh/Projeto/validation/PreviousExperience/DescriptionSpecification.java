package br.com.PortalRh.Projeto.validation.PreviousExperience;

import br.com.PortalRh.Projeto.model.PreviousExperience;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class DescriptionSpecification implements Specification<PreviousExperience> {
    @Override
    public ValidationResult isSatisfiedBy(PreviousExperience candidate) {
        String description = candidate.getDescription();
        if (description != null && description.length() >= 30){
            return new ValidationResult(true, "Description is valid.");
        } else {
            return new ValidationResult(false, "Description is not valid.");
        }
    }
}