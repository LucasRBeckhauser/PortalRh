package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository <Users, Long> {
}
