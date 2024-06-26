package br.com.PortalRh.Projeto.controller.dtos;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class DemissionDTO {
        LocalDate demissionDate;
        String reasonDemission;

//Constructors:
        public DemissionDTO() {
        }

        public DemissionDTO(LocalDate demissionDate, String reasonDemission) {
                this.demissionDate = demissionDate;
                this.reasonDemission = reasonDemission;
        }


//Getters and Setters:
        public LocalDate getDemissionDate() {
                return demissionDate;
        }

        public void setDemissionDate(LocalDate demissionDate) {
                this.demissionDate = demissionDate;
        }

        public String getReasonDemission() {
                return reasonDemission;
        }

        public void setReasonDemission(String reasonDemission) {
                this.reasonDemission = reasonDemission;
        }

//To string:

        @Override
        public String toString() {
                return "DemissionDTO{" +
                        "demissionDate=" + demissionDate +
                        ", reasonDemission='" + reasonDemission + '\'' +
                        '}';
        }
}



//
//        (
//        @NotNull(message = "A data de demissão não pode ser nula")
//        LocalDate demissionDate,
//
//        @NotBlank(message = "O motivo da demissão não pode estar em branco")
//        String reasonDemission
//) {}
