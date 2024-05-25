package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.entities.Aso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsoRepository extends JpaRepository<Aso, Long> {
}
