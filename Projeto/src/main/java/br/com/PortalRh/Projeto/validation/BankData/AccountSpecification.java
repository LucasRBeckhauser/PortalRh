package br.com.PortalRh.Projeto.validation.BankData;

import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class AccountSpecification implements Specification <BankData> {
    @Override
    public ValidationResult isSatisfiedBy(BankData candidate) {
        String agency = candidate.getAccount();
        if (agency != null && agency.matches("\\d{1,8}")) {
            return new ValidationResult(true, "Agency is valid.");
        } else {
            return new ValidationResult(false, "Agency is not valid.");
        }
    }
}

