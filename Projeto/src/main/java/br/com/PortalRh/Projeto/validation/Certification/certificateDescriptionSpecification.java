package br.com.PortalRh.Projeto.validation.Certification;

import br.com.PortalRh.Projeto.model.Certification;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class certificateDescriptionSpecification implements Specification <Certification> {
    @Override
    public ValidationResult isSatisfiedBy(Certification certification) {
        String certificateDescription = certification.getCertificateDescription();
        if (certificateDescription.length() >= 15) {
            return new ValidationResult(true, "certificate Description is valid.");
        } else {
            return new ValidationResult(false, "certificate Description is not valid.");
        }
    }
}
