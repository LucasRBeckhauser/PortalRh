package br.com.PortalRh.Projeto.validation;

public abstract class CompositeSpecification <T>  implements Specification <T> {
    public Specification <T> and (Specification <T> other) {
        return new AndSpecification <> (this, other);
    }

    public Specification <T> or (Specification <T> other) {
        return  new OrSpecification <> (this, other);
    }

    public Specification <T> not() {
        return new NotSpecification<> (this);
    }

}