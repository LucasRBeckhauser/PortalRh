package br.com.PortalRh.Projeto.controller.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ParentDTO(
    @NotBlank(message = "O nome do pai não pode estar em branco") 
    String fathersName,

    @Size(min = 10, max = 11, message = "O telefone do pai deve ter entre 10 e 11 dígitos")
    String fathersPhone,

    @NotBlank(message = "O nome da mãe não pode estar em branco")
    String mothersName,

    @Size(min = 10, max = 11, message = "O telefone da mãe deve ter entre 10 e 11 dígitos")
    String mothersPhone
) {}