package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.repository.BankDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankDataService {

    @Autowired
    private BankDataRepository repository;

    public BankData salvar (BankData entity){return repository.save(entity); }

    public List<BankData> buscaTodos(){return repository.findAll(); }

    public BankData buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public BankData alterar(Long id, BankData alterado){
        Optional<BankData> encontrado = repository.findById(id);
        if (encontrado.isPresent()){

            BankData bankData = encontrado.get();
            bankData.setBank(alterado.getBank());
            bankData.setAcc(alterado.getAcc());
            bankData.setAgency(alterado.getAgency());
            bankData.setAccType(alterado.getAccType());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
