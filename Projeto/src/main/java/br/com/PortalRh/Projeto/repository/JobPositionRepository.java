package br.com.PortalRh.Projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.PortalRh.Projeto.entities.JobPosition;

@Repository
public interface JobPositionRepository extends JpaRepository <JobPosition, Long> {
}
