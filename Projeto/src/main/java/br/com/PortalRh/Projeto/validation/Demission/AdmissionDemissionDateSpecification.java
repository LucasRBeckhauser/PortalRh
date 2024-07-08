package br.com.PortalRh.Projeto.validation.Demission;

import br.com.PortalRh.Projeto.model.Admission;
import br.com.PortalRh.Projeto.model.Demission;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

import java.time.LocalDate;

public class AdmissionDemissionDateSpecification implements Specification<Admission> {
    private final Demission demission;

    public AdmissionDemissionDateSpecification(Demission demission) {
        this.demission = demission;
    }
    @Override
    public ValidationResult isSatisfiedBy(Admission admission) {
        LocalDate admissionDate = admission.getAdmissionDate();
        LocalDate demissionDate = demission.getDemissionDate();

        if (admissionDate != null && demissionDate != null && !admissionDate.isBefore(demissionDate)) {
            return new ValidationResult(true, "Admission Date is valid.");
        } else {
            return new ValidationResult(false, "Admission date cannot be equal to or after demission date.");
        }
    }
}