package br.com.PortalRh.Projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.PortalRh.Projeto.model.Certification;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {
}
