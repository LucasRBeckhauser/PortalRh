package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Person;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CertificationDTO{
        String title;
        String skills;
        Integer workload;
        String certificateDescription;
        Person person;

        public CertificationDTO() {
        }

        public CertificationDTO(String title, String skills, Integer workload, String certificateDescription, Person person) {
                this.title = title;
                this.skills = skills;
                this.workload = workload;
                this.certificateDescription = certificateDescription;
                this.person = person;
        }


        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getSkills() {
                return skills;
        }

        public void setSkills(String skills) {
                this.skills = skills;
        }

        public Integer getWorkload() {
                return workload;
        }

        public void setWorkload(Integer workload) {
                this.workload = workload;
        }

        public String getCertificateDescription() {
                return certificateDescription;
        }

        public void setCertificateDescription(String certificateDescription) {
                this.certificateDescription = certificateDescription;
        }

        public Person getPerson() {
                return person;
        }

        public void setPerson(Person person) {
                this.person = person;
        }

 //To string:
        @Override
        public String toString() {
                return "CertificationDTO{" +
                        "title='" + title + '\'' +
                        ", skills='" + skills + '\'' +
                        ", workload=" + workload +
                        ", certificateDescription='" + certificateDescription + '\'' +
                        ", person=" + person +
                        '}';
        }
}
//        @NotBlank(message = "O título não pode estar em branco")
//        String title,
//        @NotBlank(message = "As habilidades não podem estar em branco")
//        String skills,
//        @NotNull(message = "A carga horária de trabalho não pode ser nula.")
//        Integer workload,
//        @NotBlank(message = "A descrição não pode estar em branco.")
//        String certificateDescription,
//        @Valid
//        @NotNull(message = "A pessoa não pode ser nula")
//        Person person
//) {}
