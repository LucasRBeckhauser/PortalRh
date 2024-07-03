package br.com.PortalRh.Projeto.validation.Aso;

import br.com.PortalRh.Projeto.model.Aso;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class finalJudgmentSpecification implements Specification <Aso> {
    @Override
    public ValidationResult isSatisfiedBy(Aso aso) {
        String finalJudgment = aso.getFinalJudgment();
        if (finalJudgment.length() >= 15) {
            return new ValidationResult(true, "Final Judgment is valid.");
        } else {
            return new ValidationResult(false, "The Final Judgment must have at least fifteen character.");
        }
    }
}