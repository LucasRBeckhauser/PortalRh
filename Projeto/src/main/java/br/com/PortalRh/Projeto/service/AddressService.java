package br.com.PortalRh.Projeto.service;

import java.util.List;
import java.util.Optional;

import br.com.PortalRh.Projeto.controller.dtos.AddressDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.PortalRh.Projeto.model.Address;
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
            addressDTO.getHouseNumber(),
            addressDTO.getStreetName(),
            addressDTO.getComplement(),
            addressDTO.getNeighborhood(),
            addressDTO.getCity(),
            addressDTO.getState()
        );

        addressRepository.save(address);
        return ResponseEntity.ok(address);
    }

    public List<Address> findAll() {
        List<Address> addresses = addressRepository.findAll();
        return addresses;
    }

    public ResponseEntity<Address> findById(Long id) {
        Optional<Address> address = addressRepository.findById(id);
        if (address.isPresent()) {
            return ResponseEntity.ok(address.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Address> update(AddressDTO addressDTO, Long id) {
        Optional<Address> optionalAddress = addressRepository.findById(id);

        if (optionalAddress.isPresent()) {
            Address address = optionalAddress.get();
            address.setHouseNumber(addressDTO.getHouseNumber());
            address.setStreetName(addressDTO.getStreetName());
            address.setComplement(addressDTO.getComplement());
            address.setNeighborhood(addressDTO.getNeighborhood());
            address.setCity(addressDTO.getCity());
            address.setState(addressDTO.getState());

            addressRepository.save(address);
            return ResponseEntity.ok(address);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> delete(Long id) {
        Optional<Address> optionalAddress = addressRepository.findById(id);

        if (optionalAddress.isPresent()) {
            addressRepository.delete(optionalAddress.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
