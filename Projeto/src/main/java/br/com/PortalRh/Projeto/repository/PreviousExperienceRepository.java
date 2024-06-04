package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.PreviousExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreviousExperienceRepository extends JpaRepository <PreviousExperience, Long> {
}
