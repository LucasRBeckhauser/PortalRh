package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.DadosBancarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosBancariosRepository extends JpaRepository <DadosBancarios, Long> {
}
