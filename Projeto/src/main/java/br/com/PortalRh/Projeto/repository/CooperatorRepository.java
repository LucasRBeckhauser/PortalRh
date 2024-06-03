package br.com.PortalRh.Projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.PortalRh.Projeto.model.Collaborator;

@Repository
public interface CooperatorRepository extends JpaRepository<Collaborator, Long> {
}
