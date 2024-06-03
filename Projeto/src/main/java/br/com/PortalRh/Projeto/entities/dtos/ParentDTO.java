package br.com.PortalRh.Projeto.entities.dtos;

import java.util.List;

public class ParentDTO {
    private String dadsName;
    private String momsName;
    private String dadsPhone;
    private String momsPhone;
    private List<PersonDTO> children;

    public String getDadsName() {
        return dadsName;
    }

    public void setDadsName(String dadsName) {
        this.dadsName = dadsName;
    }

    public String getMomsName() {
        return momsName;
    }

    public void setMomsName(String momsName) {
        this.momsName = momsName;
    }

    public String getDadsPhone() {
        return dadsPhone;
    }

    public void setDadsPhone(String dadsPhone) {
        this.dadsPhone = dadsPhone;
    }

    public String getMomsPhone() {
        return momsPhone;
    }

    public void setMomsPhone(String momsPhone) {
        this.momsPhone = momsPhone;
    }

    public List<PersonDTO> getChildren() {
        return children;
    }

    public void setChildren(List<PersonDTO> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "ParentDTO{" +
                "dadsName='" + dadsName + '\'' +
                ", momsName='" + momsName + '\'' +
                ", dadsPhone='" + dadsPhone + '\'' +
                ", momsPhone='" + momsPhone + '\'' +
                ", children=" + children +
                '}';
    }
}
