package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.entities.Users;
import br.com.PortalRh.Projeto.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UsersRepository repository;

    public Users salvar (Users entity){return repository.save(entity); }

    public List<Users> buscaTodos(){return repository.findAll(); }

    public Users buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Users alterar(Long id, Users alterado){
        Optional<Users> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Users users = encontrado.get();

            users.setUsername(alterado.getUsername());
            users.setPassword(alterado.getPassword());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
