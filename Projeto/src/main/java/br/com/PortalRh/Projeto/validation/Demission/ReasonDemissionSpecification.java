package br.com.PortalRh.Projeto.validation.Demission;

import br.com.PortalRh.Projeto.model.Demission;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class ReasonDemissionSpecification implements Specification <Demission> {
    @Override
    public ValidationResult isSatisfiedBy(Demission demission) {
        String reasonDemission = demission.getReasonDemission();
        if (reasonDemission.length() >= 20) {
            return new ValidationResult(true, "reason Demission is valid.");
        } else {
            return new ValidationResult(false, "name is not valid.");
        }
    }
}
