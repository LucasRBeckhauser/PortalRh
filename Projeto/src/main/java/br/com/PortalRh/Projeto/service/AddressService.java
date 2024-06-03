package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.dtos.AddressDTO;
import br.com.PortalRh.Projeto.entities.Address;
import br.com.PortalRh.Projeto.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;


    public AddressDTO salvar(AddressDTO dto) {
        Address address = new Address();
        address.setHouseNumber(dto.getHouseNumber());
        address.setStName(dto.getStName());
        address.setComplement(dto.getComplement());
        address.setNeighborhood(dto.getNeighborhood());
        address.setCity(dto.getCity());
        address.setState(dto.getState());
        address.setCep(dto.getCep());
        address.setCountry(dto.getCountry());


        Address savedAddress = repository.save(address);

        return new AddressDTO(
                savedAddress.getHouseNumber(),
                savedAddress.getStName(),
                savedAddress.getComplement(),
                savedAddress.getNeighborhood(),
                savedAddress.getCity(),
                savedAddress.getState(),
                savedAddress.getCep(),
                savedAddress.getCountry()
        );
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
