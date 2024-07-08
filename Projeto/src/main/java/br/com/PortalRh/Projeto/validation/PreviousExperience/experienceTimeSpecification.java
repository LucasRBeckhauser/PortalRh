package br.com.PortalRh.Projeto.validation.PreviousExperience;

import br.com.PortalRh.Projeto.model.PreviousExperience;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;
import java.time.LocalDate;

public class experienceTimeSpecification implements Specification <PreviousExperience> {
    @Override
    public ValidationResult isSatisfiedBy(PreviousExperience candidate) {
        LocalDate experienceTime = candidate.getExperienceTime();

        if (experienceTime != null) {
            LocalDate threeMonthsAgo = LocalDate.now().minusMonths(3);

            if (experienceTime.isAfter(threeMonthsAgo)) {
                return new ValidationResult(true, "The experience time is valid.");
            } else {
                return new ValidationResult(false, "The experience time must be more than 3 months ago.");
            }
        } else {
            return new ValidationResult(false, "Experience time is not provided.");
        }
    }
}
