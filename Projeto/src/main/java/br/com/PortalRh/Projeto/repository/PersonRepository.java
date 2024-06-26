package br.com.PortalRh.Projeto.repository;
import br.com.PortalRh.Projeto.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
