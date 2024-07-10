package br.com.PortalRh.Projeto.validation.JobPosition;

import br.com.PortalRh.Projeto.model.Demission;
import br.com.PortalRh.Projeto.model.JobPosition;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class DescriptionSpecification implements Specification <JobPosition> {
    @Override
    public ValidationResult isSatisfiedBy(JobPosition jobPosition) {
            String description = jobPosition.getDescription();
            if (description.length() >= 15) {
                return new ValidationResult(true, "Description is valid.");
            } else {
                return new ValidationResult(false, "Description is not valid.");
            }
        }
}
