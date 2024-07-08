package br.com.PortalRh.Projeto.validation.Aso;

import br.com.PortalRh.Projeto.model.Aso;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class CoordinatingDoctorCrmSpecification implements Specification <Aso> {
    @Override
    public ValidationResult isSatisfiedBy(Aso aso) {
        String coordinatingDoctor = aso.getCoordinatingDoctorCrm();
        if (coordinatingDoctor.length() >= 6) {
            return new ValidationResult(true, "Crm is valid.");
        } else {
            return new ValidationResult(false, "The Coordinating Doctor Crm must have at least six character.");
        }

    }

}
