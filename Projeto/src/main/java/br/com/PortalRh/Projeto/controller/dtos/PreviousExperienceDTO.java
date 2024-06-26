package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Person;
import br.com.PortalRh.Projeto.model.PreviousExperience;

import java.util.ArrayList;
import java.util.List;


public class PreviousExperienceDTO{
    String company;
    

    Integer experienceTime;
    

    String description;
    

    Person person;

    public PreviousExperienceDTO() {}

    public PreviousExperienceDTO(String company, Integer experienceTime, String description, Person person) {
        this.company = company;
        this.experienceTime = experienceTime;
        this.description = description;
        this.person = person;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getExperienceTime() {
        return experienceTime;
    }

    public void setExperienceTime(Integer experienceTime) {
        this.experienceTime = experienceTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static PreviousExperienceDTO fromEntity(PreviousExperience previousExperience) {
        return new PreviousExperienceDTO(
                previousExperience.getCompany(),
                previousExperience.getExperienceTime(),
                previousExperience.getDescription(),
                previousExperience.getPerson()
        );
    }

    public static List<PreviousExperienceDTO> fromEntityList(List<PreviousExperience> previousExperiences){
        List<PreviousExperienceDTO> previousExperienceDTOList = new ArrayList<>();
        for (PreviousExperience previousExperience : previousExperiences) {
            previousExperienceDTOList.add(fromEntity(previousExperience));
        }
        return previousExperienceDTOList;
    }

    public PreviousExperience toEntity() {
        PreviousExperience previousExperience = new PreviousExperience();
        previousExperience.setCompany(this.company);
        previousExperience.setExperienceTime(this.experienceTime);
        previousExperience.setDescription(this.description);
        previousExperience.setPerson(this.person);

        return previousExperience;
    }

    public static List<PreviousExperience> toEntityList(List<PreviousExperienceDTO> previousExperienceDTOs) {
        List<PreviousExperience> previousExperiences = new ArrayList<>();
        for (PreviousExperienceDTO previousExperienceDTO : previousExperienceDTOs) {
            previousExperiences.add(previousExperienceDTO.toEntity());
        }
        return previousExperiences;
    }

}