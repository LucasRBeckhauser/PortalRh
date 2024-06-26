package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.entities.PrevExp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrevExpRepository extends JpaRepository<PrevExp, Long> {
}
