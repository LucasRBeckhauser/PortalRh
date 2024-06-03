package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.User;
import br.com.PortalRh.Projeto.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UsersRepository repository;

    public User salvar (User entity){return repository.save(entity); }

    public List<User> buscaTodos(){return repository.findAll(); }

    public User buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public User alterar(Long id, User alterado){
        Optional<User> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            User users = encontrado.get();

            users.setUsername(alterado.getUsername());
            users.setPassword(alterado.getPassword());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
