package br.com.PortalRh.Projeto.validation;

public interface Specification <T>{
    ValidationResult isSatisfiedBy (T candidate);

    default Specification <T> and (Specification <T> other) {
        return new AndSpecification <>(this, other);
    }

    default Specification <T> or (Specification <T> other) {
        return new OrSpecification <> (this, other);
    }

    default Specification <T> not() {
        return new NotSpecification <> (this);
    }
}