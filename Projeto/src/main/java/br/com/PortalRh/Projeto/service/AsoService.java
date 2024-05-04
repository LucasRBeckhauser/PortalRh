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

            aso.setHistoricoDeSaude(alterado.getHistoricoDeSaude());
            aso.setProcessosMedicos(alterado.getProcessosMedicos());
            aso.setDataExamesComplementares(alterado.getDataExamesComplementares());
            aso.setNomeMedicoEncarregado(alterado.getNomeMedicoEncarregado());
            aso.setCrmMedicoEncarregado(alterado.getCrmMedicoEncarregado());
            aso.setNomeMedicoCoordenador(alterado.getNomeMedicoCoordenador());
            aso.setCrmMedicoCoordenador(alterado.getCrmMedicoCoordenador());
            aso.setRiscosOcupacionais(alterado.getRiscosOcupacionais());
            aso.setJulgamentoFinal(alterado.getJulgamentoFinal());
            aso.setDataAssinaturaMedico(alterado.getDataAssinaturaMedico());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
