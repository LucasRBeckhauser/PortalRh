package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.Address;
import br.com.PortalRh.Projeto.model.enums.State;

import java.util.ArrayList;
import java.util.List;

public class AddressDTO {
    String houseNumber;
    String streetName;
    String complement;
    String neighborhood;
    String city;
    State state;

    public AddressDTO(){}

    public AddressDTO(String houseNumber, String streetName, String complement, String neighborhood, String city, State state) {
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

    public static AddressDTO fromEntity(Address address){
        return new AddressDTO(
                address.getHouseNumber(),
                address.getStreetName(),
                address.getComplement(),
                address.getNeighborhood(),
                address.getCity(),
                address.getState()
        );
    }

    public static List<AddressDTO> fromEntityList(List<Address> addresses){
        List<AddressDTO> addressDTOList = new ArrayList<>();
        for (Address address : addresses) {
            addressDTOList.add(fromEntity(address));
        }
        return addressDTOList;
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

    public static List<Address> toEntityList(List<AddressDTO> addressDTOs) {
        List<Address> addresses = new ArrayList<>();
        for (AddressDTO addressDTO : addressDTOs) {
            addresses.add(addressDTO.toEntity());
        }
        return addresses;
    }

}
