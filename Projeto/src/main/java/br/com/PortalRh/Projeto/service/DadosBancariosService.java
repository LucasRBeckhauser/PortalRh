package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.model.Cargo;
import br.com.PortalRh.Projeto.model.DadosBancarios;
import br.com.PortalRh.Projeto.repository.CargoRepository;
import br.com.PortalRh.Projeto.repository.DadosBancariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DadosBancariosService {

    @Autowired
    private DadosBancariosRepository repository;

    public DadosBancarios salvar (DadosBancarios entity){return repository.save(entity); }

    public List<DadosBancarios> buscaTodos(){return repository.findAll(); }

    public DadosBancarios buscaPorId(Long id){return repository.findById(id).orElse(null); }

    public DadosBancarios alterar(Long id, DadosBancarios alterado){
        Optional<DadosBancarios> encontrado = repository.findById(id);
        if (encontrado.isPresent()){

            DadosBancarios dadosBancarios = encontrado.get();
            dadosBancarios.setBanco(alterado.getBanco());
            dadosBancarios.setAgencia(alterado.getAgencia());
            dadosBancarios.setConta(alterado.getConta());
            dadosBancarios.setTipoconta(alterado.getTipoconta());

        }
        return null;
    }

    public void remover(Long id) { repository.deleteById(id);}
}
