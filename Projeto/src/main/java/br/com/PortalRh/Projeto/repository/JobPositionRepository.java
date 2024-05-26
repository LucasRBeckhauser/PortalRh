package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.entities.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPositionRepository extends JpaRepository <JobPosition, Long> {
}
