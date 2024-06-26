package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.JobPosition;
import br.com.PortalRh.Projeto.model.Language;
import br.com.PortalRh.Projeto.model.Person;

import java.util.ArrayList;
import java.util.List;


public class LanguageDTO{

    String name;
    

    Person person;

    public LanguageDTO() {}

    public LanguageDTO(String name, Person person) {
        this.name = name;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static LanguageDTO fromEntity(Language language) {
        return new LanguageDTO(
                language.getName(),
                language.getPerson()
        );
    }

    public static List<LanguageDTO> fromEntityList(List<Language> languages){
        List<LanguageDTO> languageDTOList = new ArrayList<>();
        for (Language language : languages) {
            languageDTOList.add(fromEntity(language));
        }
        return languageDTOList;
    }

    public Language toEntity() {
        Language language = new Language();
        language.setName(this.name);
        language.setPerson(this.person);

        return language;
    }

    public static List<Language> toEntityList(List<LanguageDTO> languageDTOS) {
        List<Language> languages = new ArrayList<>();
        for (LanguageDTO languageDTO : languageDTOS) {
            languages.add(languageDTO.toEntity());
        }
        return languages;
    }
}
