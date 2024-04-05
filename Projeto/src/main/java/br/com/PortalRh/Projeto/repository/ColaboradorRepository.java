package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {
}
