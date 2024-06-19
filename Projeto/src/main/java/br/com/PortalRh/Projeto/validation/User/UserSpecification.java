package br.com.PortalRh.Projeto.validation.User;

import br.com.PortalRh.Projeto.model.User;
import br.com.PortalRh.Projeto.validation.Specification;
import br.com.PortalRh.Projeto.validation.ValidationResult;

public class UserSpecification implements Specification <User> {


    @Override
    public ValidationResult isSatisfiedBy(User user) {
        String password = user.getPassword();
        if (password != null && password.length() == 10) {
            return new ValidationResult(true, "Password is valid.");
        } else {
            return new ValidationResult(false, "Password is invalidd.");
        }
    }
}
