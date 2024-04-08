package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.Certification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificationRepository extends JpaRepository<Certification, Long> {
}
