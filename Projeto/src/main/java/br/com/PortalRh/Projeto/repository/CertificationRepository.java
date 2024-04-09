package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {
}
