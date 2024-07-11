package br.com.PortalRh.Projeto.controller.dtos;


import br.com.PortalRh.Projeto.model.Parent;


import java.util.ArrayList;
import java.util.List;

public class ParentDTO{
    String fathersName;

    String fathersPhone;

    String mothersName;

    String mothersPhone;

    public ParentDTO() {}

    public ParentDTO(String fathersName, String fathersPhone, String mothersName, String mothersPhone) {
        this.fathersName = fathersName;
        this.fathersPhone = fathersPhone;
        this.mothersName = mothersName;
        this.mothersPhone = mothersPhone;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getFathersPhone() {
        return fathersPhone;
    }

    public void setFathersPhone(String fathersPhone) {
        this.fathersPhone = fathersPhone;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getMothersPhone() {
        return mothersPhone;
    }

    public void setMothersPhone(String mothersPhone) {
        this.mothersPhone = mothersPhone;
    }

    public static ParentDTO fromEntity(Parent parent) {
        return new ParentDTO(
                parent.getFathersName(),
                parent.getMothersPhone(),
                parent.getFathersPhone(),
                parent.getMothersName()
        );
    }

    public static List<ParentDTO> fromEntityList(List<Parent> parents){
        List<ParentDTO> parentDTOList = new ArrayList<>();
        for (Parent parent : parents) {
            parentDTOList.add(fromEntity(parent));
        }
        return parentDTOList;
    }

    public Parent toEntity() {
        Parent parent = new Parent();
        parent.setFathersName(this.fathersName);
        parent.setFathersPhone(this.fathersPhone);
        parent.setMothersName(this.mothersName);
        parent.setMothersPhone(this.mothersPhone);

        return parent;
    }

    public static List<Parent> toEntityList(List<ParentDTO> parentDTOS) {
        List<Parent> parents = new ArrayList<>();
        for (ParentDTO parentDTO : parentDTOS) {
            parents.add(parentDTO.toEntity());
        }
        return parents;
    }
}