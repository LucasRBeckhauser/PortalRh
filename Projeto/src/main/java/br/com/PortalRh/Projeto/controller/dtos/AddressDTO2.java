package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Address;
import br.com.PortalRh.Projeto.model.enums.State;

import java.util.ArrayList;
import java.util.List;

public class AddressDTO2 {
    String houseNumber;
    String streetName;
    String complement;
    String neighborhood;
    String city;
    State state;

    public AddressDTO2(){}

    public AddressDTO2(String houseNumber, String streetName, String complement, String neighborhood, String city, State state) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
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

    public static AddressDTO2 fromEntity(Address address){
        return new AddressDTO2(
                address.getHouseNumber(),
                address.getStreetName(),
                address.getComplement(),
                address.getNeighborhood(),
                address.getCity(),
                address.getState()
        );
    }

    public static List<AddressDTO2> fromEntityList(List<Address> addresses){
        List<AddressDTO2> addressDTO2List = new ArrayList<>();
        for (Address address : addresses) {
            addressDTO2List.add(fromEntity(address));
        }
        return addressDTO2List;
    }

    public Address toEntity() {
        Address address = new Address();
        address.setHouseNumber(this.houseNumber);
        address.setStreetName(this.streetName);
        address.setComplement(this.complement);
        address.setNeighborhood(this.neighborhood);
        address.setCity(this.city);
        address.setState(this.state);
        return address;
    }

    public static List<Address> toEntityList(List<AddressDTO2> addressDTO2s) {
        List<Address> addresses = new ArrayList<>();
        for (AddressDTO2 addressDTO2 : addressDTO2s) {
            addresses.add(addressDTO2.toEntity());
        }
        return addresses;
    }

}
