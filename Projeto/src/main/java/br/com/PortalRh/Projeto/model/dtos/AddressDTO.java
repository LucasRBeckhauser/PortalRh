package br.com.PortalRh.Projeto.model.dtos;

import br.com.PortalRh.Projeto.model.enums.State;

public class AddressDTO {
    private Integer houseNumber;
    private String stName;
    private String complement;
    private String neighborhood;
    private String city;
    private State state;
    private String cep;
    private String country;

    public AddressDTO() {
    }

    public AddressDTO(Integer houseNumber, String stName, String complement, String neighborhood, String city, State state, String cep, String country) {
        this.houseNumber = houseNumber;
        this.stName = stName;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.cep = cep;
        this.country = country;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
