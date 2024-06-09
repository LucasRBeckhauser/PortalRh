package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.Admission;
import br.com.PortalRh.Projeto.model.Demission;
import br.com.PortalRh.Projeto.model.JobPosition;
import br.com.PortalRh.Projeto.model.enums.ContractModality;
import br.com.PortalRh.Projeto.model.enums.Shift;

public record CollaboratorDTO(
    double wage,
    String pisPasep,
    ContractModality contractModality,
    Shift shift,
    JobPosition jobPosition,
    Admission admission,
    Demission demission
) {}