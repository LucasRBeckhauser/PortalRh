package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.ExpAnterior;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpAnteriorRepository extends JpaRepository<ExpAnterior, Long> {
}
