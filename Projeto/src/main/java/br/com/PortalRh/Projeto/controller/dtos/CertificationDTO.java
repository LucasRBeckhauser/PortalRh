package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.model.Certification;
import br.com.PortalRh.Projeto.model.Person;

import java.util.ArrayList;
import java.util.List;


public class CertificationDTO{

        String title;
        String skills;
        Integer workload;
        String certificateDescription;
        Person person;

        public CertificationDTO() {}

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

        public static CertificationDTO fromEntity(Certification certification) {
                return new CertificationDTO(
                        certification.getTitle(),
                        certification.getSkills(),
                        certification.getWorkload(),
                        certification.getCertificateDescription(),
                        certification.getPerson()
                );

        }

        public static List<CertificationDTO> fromEntityList(List<Certification> certifications){
                List<CertificationDTO> certificationDTOList = new ArrayList<>();
                for (Certification certification : certifications) {
                        certificationDTOList.add(fromEntity(certification));
                }
                return certificationDTOList;
        }

        public Certification toEntity() {
                Certification certification = new Certification();
                certification.setCertificateDescription(this.certificateDescription);
                certification.setPerson(this.person);
                certification.setSkills(this.skills);
                certification.setTitle(this.title);
                certification.setWorkload(this.workload);
                return certification;
        }

        public static List<Certification> toEntityList(List<CertificationDTO> certificationDTOS) {
                List<Certification> certification = new ArrayList<>();
                for (CertificationDTO certificationDTO : certificationDTOS) {
                        certification.add(certificationDTO.toEntity());
                }
                return certification;
        }
}
