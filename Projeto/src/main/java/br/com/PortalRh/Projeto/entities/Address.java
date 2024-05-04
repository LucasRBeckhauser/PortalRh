package br.com.PortalRh.Projeto.entities;

import br.com.PortalRh.Projeto.entities.enuns.State;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Address extends EntityId{

    @Column(name = "numero_casa")
    private Integer houseNumber;
    @Column(name = "nome_rua")
    private String stName;
    @Column(name = "complemento")
    private String complement;
    @Column(name = "bairro")
    private String neighborhood;
    @Column(name = "cidade")
    private String city;
    @Column(name = "uf")
    private State state;
    @Column(name = "cep")
    private String cep;
    @Column(name = "pais")
    private String country;

    public Address() {
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getComplement() {
        return complement;
    }

    public String getCep() {return cep;}

    public void setCep(String cep) {this.cep = cep;}

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", stName='" + stName + '\'' +
                ", complement='" + complement + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", cep='" + cep + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
