package br.com.PortalRh.Projeto.dtos;

import java.util.List;

public class SocialMediaDTO {
    private String name;
    private String url;
    private List<PersonDTO> persons;

    public SocialMediaDTO() {
    }

    public SocialMediaDTO(String name, String url, List<PersonDTO> persons) {
        this.name = name;
        this.url = url;
        this.persons = persons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<PersonDTO> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonDTO> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "SocialMediaDTO{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", persons=" + persons +
                '}';
    }
}
