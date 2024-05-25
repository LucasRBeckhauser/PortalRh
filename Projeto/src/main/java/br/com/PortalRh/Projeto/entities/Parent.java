package br.com.PortalRh.Projeto.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Parent extends EntityId {

    @Column(name = "nome_pai")
    private String dadsName;
    @Column(name = "nome_mae")
    private String momsName;
    @Column(name = "tel_pai")
    private String dadsPhone;
    @Column(name = "tel_mae")
    private String momsPhone;
    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Person> person = new ArrayList<>();

    public Parent() {
    }

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

    public List<Person> getChildrem() {
        return person;
    }

    public void addPessoa(Person filho) { person.add(filho); }

    public void  removePessoa(Person filho) { person.remove(filho); }

    @Override
    public String toString() {
        return "Parent{" +
                "dadsName='" + dadsName + '\'' +
                ", momsName='" + momsName + '\'' +
                ", dadsPhone='" + dadsPhone + '\'' +
                ", momsPhone='" + momsPhone + '\'' +
                ", childrem=" + person +
                '}';
    }
}
