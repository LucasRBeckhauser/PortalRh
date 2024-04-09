package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
}
