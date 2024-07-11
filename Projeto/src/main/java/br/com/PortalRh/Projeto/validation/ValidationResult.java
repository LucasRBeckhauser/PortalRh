package br.com.PortalRh.Projeto.validation;

public class ValidationResult {
    private  boolean isValid;
    private  String message;

    public ValidationResult(boolean isValid, String message) {
        this.isValid = isValid;
        this.message = message;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getMessage() {
        return message;
    }

    public static ValidationResult valid () {
        return new ValidationResult(true, "");
    }


    public static ValidationResult invalid (String message) {
        return new ValidationResult(false, message);
    }


}