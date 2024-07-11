package br.com.PortalRh.Projeto.validation;

public class NotSpecification <T> extends CompositeSpecification <T>{
    private Specification <T> spec;

    public NotSpecification (Specification <T> spec) {
        this.spec = spec;
    }


    @Override
    public ValidationResult isSatisfiedBy(T candidate) {
        ValidationResult result = spec.isSatisfiedBy((candidate));
        if (!result.isValid()) {
            return ValidationResult.valid();
        } else {
            return ValidationResult.invalid("Not specification failed.");
        }
    }
}