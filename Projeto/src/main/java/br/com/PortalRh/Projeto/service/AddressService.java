package br.com.PortalRh.Projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.PortalRh.Projeto.model.Address;
import br.com.PortalRh.Projeto.model.dtos.AddressDTO;
import br.com.PortalRh.Projeto.repository.AddressRepository;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public ResponseEntity<Address> create(AddressDTO addressDTO) {
        Address address = new Address(
            addressDTO.houseNumber(),
            addressDTO.streetName(),
            addressDTO.complement(),
            addressDTO.neighborhood(),
            addressDTO.city(),
            addressDTO.state(),
            addressDTO.cep()
            );
                            

        addressRepository.save(address);
        return ResponseEntity.ok(address);
    }

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public Address findById(Long id) {
        Optional<Address> address = addressRepository.findById(id);
        return address.orElse(null);
    }

    public ResponseEntity<Address> update(AddressDTO addressDTO, Long id) {
        Address address = findById(id);

        if (address != null) {
            address.setHouseNumber(addressDTO.houseNumber());
            address.setStreetName(addressDTO.streetName());
            address.setComplement(addressDTO.complement());
            address.setNeighborhood(addressDTO.neighborhood());
            address.setCity(addressDTO.city());
            address.setState(addressDTO.state());
            address.setCep(addressDTO.cep());

            addressRepository.save(address);
            return ResponseEntity.ok(address);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Address> delete(Long id) {
        Address address = findById(id);

        if (address != null) {
            addressRepository.delete(address);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
