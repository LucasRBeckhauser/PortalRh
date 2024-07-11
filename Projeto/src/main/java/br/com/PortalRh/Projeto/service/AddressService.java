package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.dto.AddressDto;
import br.com.PortalRh.Projeto.entities.Address;
import br.com.PortalRh.Projeto.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<Address> buscaTodos(){return repository.findAll(); }

    public Address buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Address alterar(Long id, Address alterado){
        Optional<Address> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Address address = encontrado.get();

            address.setCity(alterado.getCity());
            address.setComplement(alterado.getComplement());
            address.setCountry(alterado.getCountry());
            address.setState(alterado.getState());
            address.setNeighborhood(alterado.getNeighborhood());
            address.setHouseNumber(alterado.getHouseNumber());
            address.setStName(alterado.getStName());
            address.setCep(alterado.getCep());


        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
