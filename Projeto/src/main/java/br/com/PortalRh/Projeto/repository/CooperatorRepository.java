package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.entities.Cooperator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CooperatorRepository extends JpaRepository<Cooperator, Long> {
}
