package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository <Language, Long> {
}
