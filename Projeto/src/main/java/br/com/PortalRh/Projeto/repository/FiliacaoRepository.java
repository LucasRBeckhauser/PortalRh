package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.Filiacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiliacaoRepository extends JpaRepository<Filiacao, Long> {
}
