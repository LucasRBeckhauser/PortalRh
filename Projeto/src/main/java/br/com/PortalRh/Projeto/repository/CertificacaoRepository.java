package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.Certificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificacaoRepository extends JpaRepository<Certificacao, Long> {
}
