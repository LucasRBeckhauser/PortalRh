package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository <Position, Long> {
}
