package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.models.Dependente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependenteRepository extends JpaRepository<Dependente, Long> {
}
