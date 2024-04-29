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

            address.setNumeroResidencia(alterado.getNumeroResidencia());
            address.setNomeRua(alterado.getNomeRua());
            address.setComplemento(alterado.getComplemento());
            address.setBairro(alterado.getBairro());
            address.setCidade(alterado.getCidade());
            address.setEstado(alterado.getEstado());
            address.setCep(alterado.getCep());
            address.setPais(alterado.getPais());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
