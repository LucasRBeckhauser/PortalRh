package br.com.PortalRh.Projeto.validation.Aso;

import br.com.PortalRh.Projeto.model.Aso;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

import java.time.LocalDate;

public class supplementaryExamsDateSpecification implements Specification<Aso> {
    @Override
    public ValidationResult isSatisfiedBy(Aso aso) {
        LocalDate supplementaryExamsDate = aso.getSupplementaryExamsDate();
        LocalDate doctorSignatureDate = aso.getDoctorSignatureDate();

            long daysBetween = Math.abs(doctorSignatureDate.toEpochDay() - supplementaryExamsDate.toEpochDay());
            if (daysBetween <= 180) {
                return new ValidationResult(true, "The difference between Supplementary Exams Date and Doctor Signature Date is valid.");
            } else {
                return new ValidationResult(false, "The difference between Supplementary Exams Date and Doctor Signature Date must not exceed 180 days.");
        }
    }

}