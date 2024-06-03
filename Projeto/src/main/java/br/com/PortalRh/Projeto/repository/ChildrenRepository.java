package br.com.PortalRh.Projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.PortalRh.Projeto.entities.Children;

@Repository
public interface ChildrenRepository extends JpaRepository<Children, Long> {
}
