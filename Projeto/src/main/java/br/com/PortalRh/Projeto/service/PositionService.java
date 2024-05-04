package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.entities.Position;
import br.com.PortalRh.Projeto.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionService {

    @Autowired
    private PositionRepository repository;

    public Position save (Position entity){return repository.save(entity); }

    public List<Position> getAll(){return repository.findAll(); }

    public Position getById(Long id){return repository.findById(id).orElse(null); }

    public Position update(Long id, Position changed){
        Optional<Position> found = repository.findById(id);
        if (found.isPresent()){

            Position position = found.get();
            position.setPositionType(changed.getPositionType());
            position.setDescription(changed.getDescription());
            position.setLevel(changed.getLevel());
            position.setCommission(changed.getCommission());

        }
        return null;
    }

    public void delete(Long id) { repository.deleteById(id);}
}
