package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
