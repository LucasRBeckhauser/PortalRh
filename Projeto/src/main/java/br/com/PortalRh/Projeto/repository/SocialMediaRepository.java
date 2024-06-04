package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepository extends JpaRepository <SocialMedia, Long> {
}
