package br.com.PortalRh.Projeto.validation.Aso;

import br.com.PortalRh.Projeto.model.Aso;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class ResponsibleDoctorCrmSpecification implements Specification <Aso>  {
    @Override
    public ValidationResult isSatisfiedBy(Aso aso) {
        String responsibleDoctorCrm = aso.getResponsibleDoctorCrm();
        if (responsibleDoctorCrm.length() >= 6) {
            return new ValidationResult(true, "Crm is valid.");
        } else {
            return new ValidationResult(false, "The Responsible Doctor Crm must have at least six character.");
        }
    }
}
