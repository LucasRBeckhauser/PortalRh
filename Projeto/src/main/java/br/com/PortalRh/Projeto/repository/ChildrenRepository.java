package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.entities.Children;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenRepository extends JpaRepository<Children, Long> {
}
