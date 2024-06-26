package br.com.PortalRh.Projeto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class PrevExp extends EntityId {

    @Column(name = "empresa")
    private String company;
    @Column(name = "meses_exp")
    private Integer expMonths;
    @Column(name = "anos_exp")
    private Integer expYears;
    @Column(name = "descricao_exp")
    private String description;
    @ManyToOne
    private Person person;

    public PrevExp() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getExpMonths() {
        return expMonths;
    }

    public void setExpMonths(Integer expMonths) {
        this.expMonths = expMonths;
    }

    public Integer getExpYears() {
        return expYears;
    }

    public void setExpYears(Integer expYears) {
        this.expYears = expYears;
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

    @Override
    public String toString() {
        return "PrevExp{" +
                "company='" + company + '\'' +
                ", expMonths=" + expMonths +
                ", expYears=" + expYears +
                ", description='" + description + '\'' +
                ", person=" + person +
                '}';
    }
}