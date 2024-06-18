package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.enterprise.CustomQuerydslPredicateExecutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.PortalRh.Projeto.model.Children;

@Repository
public interface ChildrenRepository extends JpaRepository<Children, Long>, CustomQuerydslPredicateExecutor<Children> {}
