package br.com.PortalRh.Projeto.model;

import br.com.PortalRh.Projeto.model.enums.State;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Adresses")
public class Address extends EntityId{
    @Column(name = "house_number")
    private Integer houseNumber;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "complement")
    private String complement;

    @Column(name = "neighborhood")
    private String neighborhood;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private State state;

    @Column(name = "cep")
    private String cep;

    @ManyToOne
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private Person person;

    public Address() {}

    public Address(
        Integer houseNumber, 
        String streetName, 
        String complement, 
        String neighborhood, 
        String city,
        State state, 
        String cep
        ) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.cep = cep;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStName() {
        return streetName;
    }

    public void setStName(String stName) {
        this.streetName = stName;
    }

    public String getComplement() {
        return complement;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

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

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", stName='" + streetName + '\'' +
                ", complement='" + complement + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", cep='" + cep + '\'' +
                '}';
    }
}
