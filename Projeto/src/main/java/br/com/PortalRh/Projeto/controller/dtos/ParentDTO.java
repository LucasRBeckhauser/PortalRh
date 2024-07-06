package br.com.PortalRh.Projeto.controller.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ParentDTO {
    @NotBlank(message = "O nome do pai não pode estar em branco")
    String fathersName;
    @Size(min = 10, max = 11, message = "O telefone do pai deve ter entre 10 e 11 dígitos")
    String fathersPhone;
    @NotBlank(message = "O nome da mãe não pode estar em branco")
    String mothersName;
    @Size(min = 10, max = 11, message = "O telefone da mãe deve ter entre 10 e 11 dígitos")
    String mothersPhone;


//Constructors:

    public ParentDTO() {
    }

    public ParentDTO(String fathersName, String fathersPhone, String mothersName, String mothersPhone) {
        this.fathersName = fathersName;
        this.fathersPhone = fathersPhone;
        this.mothersName = mothersName;
        this.mothersPhone = mothersPhone;
    }

//Getters and Setters:

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getFathersPhone() {
        return fathersPhone;
    }

    public void setFathersPhone(String fathersPhone) {
        this.fathersPhone = fathersPhone;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getMothersPhone() {
        return mothersPhone;
    }

    public void setMothersPhone(String mothersPhone) {
        this.mothersPhone = mothersPhone;
    }

//To string:

    @Override
    public String toString() {
        return "ParentDTO{" +
                "fathersName='" + fathersName + '\'' +
                ", fathersPhone='" + fathersPhone + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", mothersPhone='" + mothersPhone + '\'' +
                '}';
    }
}


//        @NotBlank(message = "O nome do pai não pode estar em branco")
//    String fathersName,
//
//    @Size(min = 10, max = 11, message = "O telefone do pai deve ter entre 10 e 11 dígitos")
//    String fathersPhone,
//
//    @NotBlank(message = "O nome da mãe não pode estar em branco")
//    String mothersName,
//
//    @Size(min = 10, max = 11, message = "O telefone da mãe deve ter entre 10 e 11 dígitos")
//    String mothersPhone
//) {}
