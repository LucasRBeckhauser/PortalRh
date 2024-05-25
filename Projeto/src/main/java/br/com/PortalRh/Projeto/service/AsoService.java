package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.entities.Aso;
import br.com.PortalRh.Projeto.repository.AsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsoService {

    @Autowired
    private AsoRepository repository;

    public Aso salvar (Aso entity){return repository.save(entity); }

    public List<Aso> buscaTodos(){return repository.findAll(); }

    public Aso buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public Aso alterar(Long id, Aso alterado){
        Optional<Aso> encontrado = repository.findById(id);
        if (encontrado.isPresent()){
            Aso aso = encontrado.get();

            aso.setHealthHist(alterado.getHealthHist());
            aso.setMedicalProcess(alterado.getMedicalProcess());
            aso.setExamsDate(alterado.getExamsDate());
            aso.setCoordDocName(alterado.getCoordDocName());
            aso.setCoordDocCrm(alterado.getCoordDocCrm());
            aso.setInChargeDocName(alterado.getInChargeDocName());
            aso.setInChargeDocCrm(alterado.getInChargeDocCrm());
            aso.setOccupRysc(alterado.getOccupRysc());
            aso.setFinalJudg(alterado.getFinalJudg());
            aso.setDocAssignDate(alterado.getDocAssignDate());


        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
