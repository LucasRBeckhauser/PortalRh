package br.com.PortalRh.Projeto.service;

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

    public Address salvar (Address entity){return repository.save(entity); }

    public List<Address> buscaTodos(){return repository.findAll(); }

    public Address buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Address alterar(Long id, Address alterado){
        Optional<Address> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Address address = encontrado.get();

            address.setCity(address.getCity());
            address.setComplement(address.getComplement());
            address.setCountry(address.getCountry());
            address.setState(address.getState());
            address.setNeighborhood(address.getNeighborhood());
            address.setHouseNumber(address.getHouseNumber());
            address.setStName(address.getStName());
            address.setCep(address.getCep());


        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
