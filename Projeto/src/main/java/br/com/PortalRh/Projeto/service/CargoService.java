package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Cargo;
import br.com.PortalRh.Projeto.model.Certificacao;
import br.com.PortalRh.Projeto.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {

    @Autowired
    private CargoRepository repository;

    public Cargo salvar (Cargo entity){return repository.save(entity); }

    public List<Cargo> buscaTodos(){return repository.findAll(); }

    public Cargo buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Cargo alterar(Long id, Cargo alterado){
        Optional<Cargo> encontrado = repository.findById(id);
        if (encontrado.isPresent()){

            Cargo cargo = encontrado.get();
            cargo.setTipoCargo(alterado.getTipoCargo());
            cargo.setDescricao(alterado.getDescricao());
            cargo.setNivel(alterado.getNivel());
            cargo.setComissionado(alterado.getComissionado());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
