package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.JobPosition;
import br.com.PortalRh.Projeto.repository.JobPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobPositionService {

    @Autowired
    private JobPositionRepository repository;

    public JobPosition save (JobPosition entity){return repository.save(entity); }

    public List<JobPosition> getAll(){return repository.findAll(); }

    public JobPosition getById(Long id){return repository.findById(id).orElse(null); }

    public JobPosition update(Long id, JobPosition changed){
        Optional<JobPosition> found = repository.findById(id);
        if (found.isPresent()){

            JobPosition jobPosition = found.get();
            jobPosition.setPositionType(changed.getPositionType());
            jobPosition.setDescription(changed.getDescription());
            jobPosition.setLevel(changed.getLevel());
            jobPosition.setCommission(changed.getCommission());

        }
        return null;
    }

    public void delete(Long id) { repository.deleteById(id);}
}
