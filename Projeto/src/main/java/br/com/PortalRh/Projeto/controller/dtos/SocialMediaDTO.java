package br.com.PortalRh.Projeto.controller.dtos;


import br.com.PortalRh.Projeto.model.Language;
import br.com.PortalRh.Projeto.model.Person;
import br.com.PortalRh.Projeto.model.SocialMedia;

import java.util.ArrayList;
import java.util.List;


public class SocialMediaDTO{
    String name;
    
    String url;
    
    Person person;

    public SocialMediaDTO() {}

    public SocialMediaDTO(String name, String url, Person person) {
        this.name = name;
        this.url = url;
        this.person = person;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    public static SocialMediaDTO fromEntity(SocialMedia socialMedia) {
        return new SocialMediaDTO(
                socialMedia.getName(),
                socialMedia.getUrl(),
                socialMedia.getPerson()
        );
    }
    public static List<SocialMediaDTO> fromEntityList(List<SocialMedia> socialMedias){
        List<SocialMediaDTO> socialMediaDTOList = new ArrayList<>();
        for (SocialMedia socialMedia : socialMedias) {
            socialMediaDTOList.add(fromEntity(socialMedia));
        }
        return socialMediaDTOList;
    }

    public SocialMedia toEntity() {
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.setName(this.name);
        socialMedia.setPerson(this.person);
        socialMedia.setUrl(this.url);

        return socialMedia;
    }

    public static List<SocialMedia> toEntityList(List<SocialMediaDTO> socialMediaDTOS) {
        List<SocialMedia> socialMedia = new ArrayList<>();
        for (SocialMediaDTO socialMediaDTO : socialMediaDTOS) {
            socialMedia.add(socialMediaDTO.toEntity());
        }
        return socialMedia;
    }
}
