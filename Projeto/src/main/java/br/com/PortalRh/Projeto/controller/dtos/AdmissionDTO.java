package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Admission;
import br.com.PortalRh.Projeto.model.Aso;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AdmissionDTO{
        LocalDate admissionDate;
        Aso aso;

//Constructors:
        public AdmissionDTO() {
        }

        public AdmissionDTO(LocalDate admissionDate, Aso aso) {
                this.admissionDate = admissionDate;
                this.aso = aso;
        }

//Getters and Setters:
        public LocalDate getAdmissionDate() {
                return admissionDate;
        }

        public void setAdmissionDate(LocalDate admissionDate) {
                this.admissionDate = admissionDate;
        }

        public Aso getAso() {
                return aso;
        }

        public void setAso(Aso aso) {
                this.aso = aso;
        }

//-----//
        public static AdmissionDTO fromEntity(Admission admission){
                return new AdmissionDTO(
                    admission.getAdmissionDate(),
                    admission.getAso()
                );
        }

        public static List<AdmissionDTO> fromEntityList(List<Admission> admissions){
                List<AdmissionDTO> admissionDTOList = new ArrayList<>();
                for (Admission admission : admissions) {
                        admissionDTOList.add(fromEntity(admission));
                }
                return admissionDTOList;
        }

        public Admission toEntity() {
                Admission admission = new Admission();
                admission.setAdmissionDate(this.admissionDate);
                admission.setAso(this.aso);
                return admission;
        }

        public static List<Admission> toEntityList(List<AdmissionDTO> admissionDTOS) {
                List<Admission> admissions = new ArrayList<>();
                for (AdmissionDTO admissionDTO : admissionDTOS) {
                        admissions.add(admissionDTO.toEntity());
                }
                return admissions;
        }

}